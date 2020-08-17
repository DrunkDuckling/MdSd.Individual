//package org.xtext.example.mdsd.generator.filegen
// 
//import org.xtext.example.mdsd.androidGenerator.Activity
//import org.xtext.example.mdsd.androidGenerator.ApplicationElement
//import org.xtext.example.mdsd.androidGenerator.Application
//import org.xtext.example.mdsd.androidGenerator.ApplicationElementList
//import org.xtext.example.mdsd.generator.abstractfiles.AbstractClassGen
//import org.xtext.example.mdsd.androidGenerator.TypeMap
//
//public class JavaActivityGen extends AbstractClassGen{
//   
//    override protected getSubClassPath() {
//        return "activity";
//    }
//   
//    override protected isAllowedElement(ApplicationElement element) {
//        return element instanceof Activity;
//    }
//   
//    override protected retrieveElementTemplate(Application application, ApplicationElement element) {
//        var activity = element as Activity;
//       
//       
//        // Checks with a boolean if the activity is of type "Map" or not
//        var isMapActivity = true;
//       
//        return ''' 
//        package «application.name»;
//       
//        import android.annotation.SuppressLint;
//        import android.content.Context;
//        import android.os.AsyncTask;
//        import android.os.Bundle;
//        import android.view.LayoutInflater;
//        import android.view.View;
//        import android.view.ViewGroup;
//        import androidx.fragment.app.Fragment;
//        import androidx.fragment.app.FragmentActivity;
//       
//        «IF isMapActivity»
//        import android.location.Location;
//        import android.location.LocationListener;
//        import android.location.LocationManager;
//        import com.google.android.gms.maps.CameraUpdateFactory;
//        import com.google.android.gms.maps.GoogleMap;
//        import com.google.android.gms.maps.OnMapReadyCallback;
//        import com.google.android.gms.maps.SupportMapFragment;
//        import com.google.android.gms.maps.model.BitmapDescriptorFactory;
//        import com.google.android.gms.maps.model.LatLng;
//        import com.google.android.gms.maps.model.MapStyleOptions;
//        import com.google.android.gms.maps.model.MarkerOptions;
//        «ENDIF»
//       
//        import java.util.List;
//       
//       
//        public class «activity.name» extends Fragment «IF isMapActivity»implements OnMapReadyCallback, LocationListener«ENDIF» {
//           
//            «IF isMapActivity»
//            private GoogleMap mMap;
//            private String[] placeNames;
//            private String[] imageUrl;
//            private List<Places>;
//           
//            protected LocationManager locationManager;
//            protected LocationListener locationListener;
//       
//       
//            // DSL Params
//            String filterQuery = "«activity.activityTypeAttributes.filter.name»";
//            double distanceThreshold = «activity.activityTypeAttributes.filter.filterAttributes.distance.results.value»;
//            Location startPoint = new Location("locationA"); // Used for distance measuring
//            Location endPoint = new Location("locationB"); // Used for distance measuring
//            «ENDIF»
// 
//            @SuppressLint("MissingPermission")
//            @Override
//            protected void onCreate(Bundle savedInstanceState) {
//                super.onCreate(savedInstanceState);
//                «IF isMapActivity»
//                // Permission Check
//                if (Permissions.Check_FINE_LOCATION(getActivity())) {
//                     locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
//                     locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 10000, 10, this);
//                }«ENDIF»
//            }
//           
//            @Override
//            public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
//                View rootView = inflater.inflate(R.layout.«activity.name.toLowerCase», parent, false);
//                «IF isMapActivity»
//                SupportMapFragment mapFragment = (SupportMapFragment)getChildFragmentManager()
//                .findFragmentById(R.id.map);
//                mapFragment.getMapAsync(this);
//                «ENDIF»
//                return rootView;
//               
//            }
//«««            «insertMapFields(map)»
//           
//        }
//        ''';
//    }
//   
//   
//    private def String insertMapFields(){       
//       
//        var data = '''
//        @Override
//        public void onMapReady(GoogleMap googleMap) {
//            mMap = googleMap;
//            mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(getActivity().getApplicationContext(), R.raw.map_style));
//            mMap.setMyLocationEnabled(true);
//            initDone = true;
//        }
//       
//        public void findNearLocation(Location location)   {
//            if (getActivity() != null) {
//                PlacesService service = new PlacesService(getActivity().getResources().getString(R.string.google_maps_key));
//                findPlaces = service.findPlaces(location.getLatitude(), location.getLongitude(), filterQuery, distanceThreshold);
//                placeNames = new String[findPlaces.size()];
//                imageUrl = new String[findPlaces.size()];
//       
//                for (int i = 0; i < findPlaces.size(); i++) {
//                    if (findPlaces.get(i) != null) {
//                        Place placeDetail = findPlaces.get(i);
//                        endPoint.setLatitude(placeDetail.getLatitude());
//                        endPoint.setLongitude(placeDetail.getLongitude());
//       
//                        if (startPoint.distanceTo(endPoint) < distanceThreshold) {
//                            System.out.println(placeDetail.getName());
//                            placeNames[i] = placeDetail.getName();
//                            imageUrl[i] = placeDetail.getName();
//                        }
//                    }
//                }
//            }
//        }
//       
//       
//        @Override
//        public void onLocationChanged(Location location) {
//            if (mMap != null) {
//                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 14));
//                new GetPlacesAsyncTask(location).execute();
//            }
//        }
//       
//        @Override
//        public void onStatusChanged(String provider, int status, Bundle extras) {}
//        @Override
//        public void onProviderEnabled(String provider) {}
//        @Override
//        public void onProviderDisabled(String provider) {}
//       
//«««        «IF isMapActivity»
//        public class PlacesService {
//        
//                private String API_KEY;
//        
//                public PlacesService(String apikey) {
//                    this.API_KEY = apikey;
//                }
//        
//                public List<Place> findPlaces(double latitude, double longitude,String placeSpacification, double radius)
//                {
//                    String urlString = makeUrl(latitude, longitude,placeSpacification, radius);
//        
//                    try {
//                        String json = getJSON(urlString);
//        
//                        System.out.println(json);
//                        JSONObject object = new JSONObject(json);
//                        JSONArray array = object.getJSONArray("results");
//        
//        
//                        ArrayList<Place> arrayList = new ArrayList<>();
//                        for (int i = 0; i < array.length(); i++) {
//                            try {
//                                Place place = Place.JSONToResult((JSONObject) array.get(i));
//                                place.setBitmap(convertURLToBitmap(place.getIcon()));
//                                Log.v("Places Services ", "" + place);
//                                arrayList.add(place);
//                            } catch (Exception e) {
//                            }
//                        }
//                        return arrayList;
//                    } catch (JSONException ex) {
//                        Logger.getLogger(com.example.navbartest.PlacesService.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                    return null;
//                }
//                
//                private String makeUrl(double latitude, double longitude,String place, double radius) {
//                    StringBuilder urlString = new StringBuilder("https://maps.googleapis.com/maps/api/place/search/json?");
//                    
//                    if (place.equals("")) {
//                        urlString.append("&location=");
//                        urlString.append(latitude);
//                        urlString.append(",");
//                        urlString.append(longitude);
//                        urlString.append("&radius=" + radius);
//                        urlString.append("&sensor=false&key=" + API_KEY);
//                    } else {
//                        urlString.append("&location=");
//                        urlString.append(latitude);
//                        urlString.append(",");
//                        urlString.append(longitude);
//                        urlString.append("&radius=" + radius);
//                        urlString.append("&types="+place);
//                        urlString.append("&sensor=false&key=" + API_KEY);
//                    }
//                    
//                    
//                    return urlString.toString();
//                }
//                
//                protected String getJSON(String url) {
//                    return getUrlContents(url);
//                }
//                
//                private String getUrlContents(String theUrl)
//                {
//                    StringBuilder content = new StringBuilder();
//                    try {
//                        URL url = new URL(theUrl);
//                        URLConnection urlConnection = url.openConnection();
//                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()), 8);
//                        String line;
//                        while ((line = bufferedReader.readLine()) != null) {
//                            content.append(line + "\n");
//                        }
//                        bufferedReader.close();
//                    }
//                    
//                    catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                    return content.toString();
//                }
//                
//                public Bitmap convertURLToBitmap(String imageUrl) {
//                    try {
//                        URL url = new URL(imageUrl);
//                        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                        connection.setDoInput(true);
//                        connection.connect();
//                        InputStream input = connection.getInputStream();
//                        Bitmap myBitmap = BitmapFactory.decodeStream(input);
//                        return myBitmap;
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                        return null;
//                    }
//                }
//            }
//«««        «ENDIF»
//        ''';
//       
//       
//       
//        return data;
//    }
//   
//   
//}