package org.xtext.example.mdsd.generator.filegen;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mdsd.androidGenerator.ActivityType;
import org.xtext.example.mdsd.androidGenerator.Application;
import org.xtext.example.mdsd.androidGenerator.ApplicationElement;
import org.xtext.example.mdsd.androidGenerator.Fragment;
import org.xtext.example.mdsd.generator.abstractfiles.AbstractClassGen;

@SuppressWarnings("all")
public class FragmentGen extends AbstractClassGen {
  @Override
  protected String getSubClassPath() {
    return "activity";
  }
  
  @Override
  protected boolean isAllowedElement(final ApplicationElement element) {
    return (element instanceof Fragment);
  }
  
  @Override
  protected String retrieveElementTemplate(final Application application, final ApplicationElement element) {
    Fragment fragment = ((Fragment) element);
    ActivityType map = fragment.getActivityType();
    boolean isMapActivity = (!Objects.equal(map, null));
    StringConcatenation _builder = new StringConcatenation();
    {
      if (isMapActivity) {
        String _insertMapImports = this.insertMapImports(application);
        _builder.append(_insertMapImports);
        _builder.newLineIfNotEmpty();
        String _insertMapfragment = this.insertMapfragment(fragment);
        _builder.append(_insertMapfragment);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder.toString();
  }
  
  private String insertMapImports(final Application application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import android.annotation.SuppressLint;");
    _builder.newLine();
    _builder.append("import android.content.Context;");
    _builder.newLine();
    _builder.append("import android.content.res.Resources;");
    _builder.newLine();
    _builder.append("import android.location.Location;");
    _builder.newLine();
    _builder.append("import android.location.LocationListener;");
    _builder.newLine();
    _builder.append("import android.location.LocationManager;");
    _builder.newLine();
    _builder.append("import android.os.AsyncTask;");
    _builder.newLine();
    _builder.append("import android.os.Bundle;");
    _builder.newLine();
    _builder.append("import android.util.Log;");
    _builder.newLine();
    _builder.append("import android.view.LayoutInflater;");
    _builder.newLine();
    _builder.append("import android.view.View;");
    _builder.newLine();
    _builder.append("import android.view.ViewGroup;");
    _builder.newLine();
    _builder.append("import android.widget.Toast;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import androidx.annotation.NonNull;");
    _builder.newLine();
    _builder.append("import androidx.annotation.Nullable;");
    _builder.newLine();
    _builder.append("import androidx.fragment.app.Fragment;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.example.mdsdproject.R;");
    _builder.newLine();
    _builder.append("import com.example.mdsdproject.models.Places;");
    _builder.newLine();
    _builder.append("import com.example.mdsdproject.services.PlacesService;");
    _builder.newLine();
    _builder.append("import com.google.android.gms.maps.CameraUpdateFactory;");
    _builder.newLine();
    _builder.append("import com.google.android.gms.maps.GoogleMap;");
    _builder.newLine();
    _builder.append("import com.google.android.gms.maps.OnMapReadyCallback;");
    _builder.newLine();
    _builder.append("import com.google.android.gms.maps.SupportMapFragment;");
    _builder.newLine();
    _builder.append("import com.google.android.gms.maps.model.BitmapDescriptorFactory;");
    _builder.newLine();
    _builder.append("import com.google.android.gms.maps.model.LatLng;");
    _builder.newLine();
    _builder.append("import com.google.android.gms.maps.model.MapStyleOptions;");
    _builder.newLine();
    _builder.append("import com.google.android.gms.maps.model.MarkerOptions;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String insertMapfragment(final Fragment fragment) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = fragment.getName();
    _builder.append(_name);
    _builder.append(" extends Fragment implements LocationListener {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String TAG = \"MapsFragment\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private GoogleMap mMap;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String[] placeNames;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String[] imageUrl;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<Places> findPlaces;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected LocationManager locationManager;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected LocationListener locationListener;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String latitude;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String longitude;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// DSL Params");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String filterQuery = \"Hotels\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("double distanceThreshold = 5000;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Location startPoint = new Location(\"locationA\"); // Used for distance measuring");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Location endPoint = new Location(\"locationB\"); // Used for distance measuring");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void onCreate(Bundle savedInstanceState) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super.onCreate(savedInstanceState);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Log.i(TAG, \"onCreate: \");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@SuppressLint(\"MissingPermission\")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Nullable");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("View view = inflater.inflate(R.layout.fragment_maps, container, false);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 10, this);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Bundle bundle = getArguments();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (bundle != null){");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("filterQuery = bundle.getString(\"location\");");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("distanceThreshold = bundle.getDouble(\"radius\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Toast.makeText(getActivity().getApplicationContext(), \"BUTTON\" + filterQuery + distanceThreshold, Toast.LENGTH_LONG).show();");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return view;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super.onViewCreated(view, savedInstanceState);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("SupportMapFragment mapFragment =");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("(SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (mapFragment != null) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("mapFragment.getMapAsync(callback);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private OnMapReadyCallback callback = new OnMapReadyCallback() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@SuppressLint(\"MissingPermission\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void onMapReady(GoogleMap googleMap) {");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("mMap = googleMap;");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t \t");
    _builder.append("boolean success = googleMap.setMapStyle(");
    _builder.newLine();
    _builder.append("\t\t \t\t");
    _builder.append("MapStyleOptions.loadRawResourceStyle(getContext(), R.raw.style_json));");
    _builder.newLine();
    _builder.append("\t\t \t");
    _builder.append("if (!success) {");
    _builder.newLine();
    _builder.append("\t\t \t\t");
    _builder.append("Log.e(TAG, \"Style parsing failed.\");");
    _builder.newLine();
    _builder.append("\t\t \t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t \t\t");
    _builder.append("} catch (Resources.NotFoundException e) {");
    _builder.newLine();
    _builder.append("\t \t\t\t");
    _builder.append("Log.e(TAG, \"Can\'t find style. Error: \", e);");
    _builder.newLine();
    _builder.append(" \t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t\t\t");
    _builder.append("mMap.setMyLocationEnabled(true);");
    _builder.newLine();
    _builder.append(" \t\t\t");
    _builder.append("mMap.getUiSettings().setZoomControlsEnabled(true);");
    _builder.newLine();
    _builder.append(" \t\t\t");
    _builder.append("mMap.getUiSettings().setMapToolbarEnabled(true);");
    _builder.newLine();
    _builder.append(" \t\t\t");
    _builder.append("Log.i(TAG, \"onMapReady: \");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void onLocationChanged(Location location) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("latitude = Double.toString(location.getLatitude());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("longitude = Double.toString(location.getLongitude());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Log.v(TAG, \"IN ON LOCATION CHANGE, lat=\" + latitude + \", lon=\" + longitude);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (mMap != null) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 14));");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("new GetPlacesAsyncTask(location).execute();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void onStatusChanged(String provider, int status, Bundle extras) {    }");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void onProviderEnabled(String provider) {    }");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void onProviderDisabled(String provider) {    }");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("class GetPlacesAsyncTask extends AsyncTask<Void, Void, Void>{");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("private Location asyncLoc;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("public GetPlacesAsyncTask(Location location) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("this.asyncLoc = location;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("protected void onPreExecute() {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("super.onPreExecute();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("protected Void doInBackground(Void... voids) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("findNearLocation(asyncLoc);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("protected void onPostExecute(Void aVoid) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("super.onPostExecute(aVoid);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("mMap.clear();");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int i = 0; i < findPlaces.size(); i++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (findPlaces.get(i) != null) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("Places placeDetail = findPlaces.get(i);");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("endPoint.setLatitude(placeDetail.getLatitude());");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("endPoint.setLongitude(placeDetail.getLongitude());");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("if (asyncLoc.distanceTo(endPoint) < distanceThreshold) {");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("LatLng place = new LatLng(findPlaces.get(i).getLatitude(), findPlaces.get(i).getLongitude());");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("MarkerOptions marker = new MarkerOptions().position(place).title(findPlaces.get(i).getName());");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("marker.icon(BitmapDescriptorFactory.fromBitmap(placeDetail.getBitmap()));");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("mMap.addMarker(marker);");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void findNearLocation(Location location)   {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Log.i(TAG, \"findNearLocation: \");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (getActivity() != null) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("PlacesService service = new PlacesService(getActivity().getResources().getString(R.string.google_maps_key));");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("findPlaces = service.findPlaces(location.getLatitude(), location.getLongitude(), filterQuery, distanceThreshold);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("placeNames = new String[findPlaces.size()];");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("imageUrl = new String[findPlaces.size()];");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int i = 0; i < findPlaces.size(); i++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (findPlaces.get(i) != null) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("Places placeDetail = findPlaces.get(i);");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("endPoint.setLatitude(placeDetail.getLatitude());");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("endPoint.setLongitude(placeDetail.getLongitude());");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("if (startPoint.distanceTo(endPoint) < distanceThreshold) {");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("System.out.println(placeDetail.getName());");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("placeNames[i] = placeDetail.getName();");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("imageUrl[i] = placeDetail.getName();");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}