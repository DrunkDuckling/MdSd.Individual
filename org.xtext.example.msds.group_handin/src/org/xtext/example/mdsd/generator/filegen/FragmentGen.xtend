package org.xtext.example.mdsd.generator.filegen

import org.xtext.example.mdsd.androidGenerator.Application
import org.xtext.example.mdsd.androidGenerator.ApplicationElement
import org.xtext.example.mdsd.androidGenerator.Fragment
import org.xtext.example.mdsd.generator.abstractfiles.AbstractClassGen
import org.xtext.example.mdsd.androidGenerator.TypeMap
import org.xtext.example.mdsd.androidGenerator.TypeSetting
import org.xtext.example.mdsd.androidGenerator.ActivityLayoutAttributes
import org.xtext.example.mdsd.androidGenerator.LayoutElement
import org.xtext.example.mdsd.androidGenerator.Button
import org.xtext.example.mdsd.androidGenerator.Spinner
import org.xtext.example.mdsd.androidGenerator.EditText
import org.xtext.example.mdsd.androidGenerator.Toast
import org.xtext.example.mdsd.androidGenerator.Bundle
import org.xtext.example.mdsd.androidGenerator.ButtonActions
import org.xtext.example.mdsd.androidGenerator.ActivityTypeAttributes

class FragmentGen extends AbstractClassGen{
	
	override protected getSubClassPath() {
		return "fragments"
	}
	
	override protected isAllowedElement(ApplicationElement element) {
		return element instanceof Fragment;
	}
	
	override protected retrieveElementTemplate(Application application, ApplicationElement element) {
		var fragment = element as Fragment;
		var data = '''Something went wrong''';
		var ActivityLayoutAttributes layout = getFieldData(fragment.activityAttributes, typeof(ActivityLayoutAttributes));
		
        // Checks if is of type "Map" or not
        if(layout != null){
        	for(type : layout.layoutElements){
        		if( type instanceof TypeMap){
        			data = '''«insertMapFragment(fragment, application)»'''
        		}if(type instanceof TypeSetting){
        			data = '''«insertSettingFragment(fragment, application)»'''
        		}if(!(type instanceof TypeMap) && !(type instanceof TypeSetting)){
        			data = '''«insertCustomFragment(fragment, application)»'''
        		}
       		}
        }else data = '''«insertBlankFragment(fragment, application)» '''
       	
       	return data;
    }
	
	def filterOptions(Fragment fragment, Application application){
		var ActivityLayoutAttributes layout = getFieldData(fragment.activityAttributes, typeof(ActivityLayoutAttributes));
		for(type : layout.layoutElements){
			if( type instanceof TypeMap){
				if(type.activitytypeattribute != null){
					return ('''
						String filterQuery = "«type.activitytypeattribute.filter.name»";
						double distanceThreshold = «type.activitytypeattribute.filter.filterAttributes.distance.results.value»;
					''');
				}else{
					return ('''
						// Change values for different options.
						String filterQuery = "Hotels";
						double distanceThreshold = 5000;
					''');
					
				}
			}
		}
		
	}
	
	def insertMapFragment(Fragment fragment, Application application){
		return '''
		package «application.name»;
		import android.annotation.SuppressLint;
		import android.content.Context;
		import android.content.res.Resources;
		import android.location.Location;
		import android.location.LocationListener;
		import android.location.LocationManager;
		import android.os.AsyncTask;
		import android.os.Bundle;
		import android.util.Log;
		import android.view.LayoutInflater;
		import android.view.View;
		import android.view.ViewGroup;
		import android.widget.Toast;
		
		import androidx.annotation.NonNull;
		import androidx.annotation.Nullable;
		import androidx.fragment.app.Fragment;
		
		import com.example.mdsdproject.R;
		import com.example.mdsdproject.models.Places;
		import com.example.mdsdproject.services.PlacesService;
		import com.google.android.gms.maps.CameraUpdateFactory;
		import com.google.android.gms.maps.GoogleMap;
		import com.google.android.gms.maps.OnMapReadyCallback;
		import com.google.android.gms.maps.SupportMapFragment;
		import com.google.android.gms.maps.model.BitmapDescriptorFactory;
		import com.google.android.gms.maps.model.LatLng;
		import com.google.android.gms.maps.model.MapStyleOptions;
		import com.google.android.gms.maps.model.MarkerOptions;
		
		import java.util.List;
		
		public class «fragment.name» extends Fragment implements LocationListener {
			
			private static final String TAG = "MapsFragment";
			
			private GoogleMap mMap;
			private String[] placeNames;
			private String[] imageUrl;
			private List<Places> findPlaces;
			
			protected LocationManager locationManager;
			protected LocationListener locationListener;
			private String latitude;
			private String longitude;
			// DSL Params
			«filterOptions(fragment, application)»
			Location startPoint = new Location("locationA"); // Used for distance measuring
			Location endPoint = new Location("locationB"); // Used for distance measuring
			
			@Override
		    public void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        Log.i(TAG, "onCreate: ");
		    }
		    
		    @SuppressLint("MissingPermission")
		    @Nullable
		    @Override
		    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		        View view = inflater.inflate(R.layout.fragment_maps, container, false);
		        locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
		        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 10, this);
		        
		        Bundle bundle = getArguments();
		        if (bundle != null){
		            filterQuery = bundle.getString("location");
		            distanceThreshold = bundle.getDouble("radius");
		        }
		        Toast.makeText(getActivity().getApplicationContext(), "BUTTON" + filterQuery + distanceThreshold, Toast.LENGTH_LONG).show();
		        
		        return view;
		    }
		    @Override
		    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		        super.onViewCreated(view, savedInstanceState);
		        SupportMapFragment mapFragment =
		                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
		        if (mapFragment != null) {
		            mapFragment.getMapAsync(callback);
		        }
		    }
		    
		    private OnMapReadyCallback callback = new OnMapReadyCallback() {
			@SuppressLint("MissingPermission")
			@Override
			public void onMapReady(GoogleMap googleMap) {
				 mMap = googleMap;
				 try {
				 	boolean success = googleMap.setMapStyle(
				 		MapStyleOptions.loadRawResourceStyle(getContext(), R.raw.style_json));
				 	if (!success) {
				 		Log.e(TAG, "Style parsing failed.");
				 		}
			 		} catch (Resources.NotFoundException e) {
			 			Log.e(TAG, "Can't find style. Error: ", e);
		 			}
		 			mMap.setMyLocationEnabled(true);
		 			mMap.getUiSettings().setZoomControlsEnabled(true);
		 			mMap.getUiSettings().setMapToolbarEnabled(true);
		 			Log.i(TAG, "onMapReady: ");
				}
			};
			
			@Override
		    public void onLocationChanged(Location location) {
		        latitude = Double.toString(location.getLatitude());
		        longitude = Double.toString(location.getLongitude());
		        Log.v(TAG, "IN ON LOCATION CHANGE, lat=" + latitude + ", lon=" + longitude);
		        
		        if (mMap != null) {
		            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 14));
		            new GetPlacesAsyncTask(location).execute();
		        }
		    }
		    
		    @Override
		    public void onStatusChanged(String provider, int status, Bundle extras) {    }
		    
		    @Override
		    public void onProviderEnabled(String provider) {    }
		    
		    @Override
		    public void onProviderDisabled(String provider) {    }
		    
		    class GetPlacesAsyncTask extends AsyncTask<Void, Void, Void>{
		    
		        private Location asyncLoc;
		    
		        public GetPlacesAsyncTask(Location location) {
		            this.asyncLoc = location;
		        }
		    
		        @Override
		        protected void onPreExecute() {
		            super.onPreExecute();
		        }
		    
		        @Override
		        protected Void doInBackground(Void... voids) {
		            findNearLocation(asyncLoc);
		            return null;
		        }
		    
		        @Override
		        protected void onPostExecute(Void aVoid) {
		            super.onPostExecute(aVoid);
		            mMap.clear();
		    
		            for (int i = 0; i < findPlaces.size(); i++) {
		                if (findPlaces.get(i) != null) {
		                    Places placeDetail = findPlaces.get(i);
		                    endPoint.setLatitude(placeDetail.getLatitude());
		                    endPoint.setLongitude(placeDetail.getLongitude());
		    
		                    if (asyncLoc.distanceTo(endPoint) < distanceThreshold) {
		                        LatLng place = new LatLng(findPlaces.get(i).getLatitude(), findPlaces.get(i).getLongitude());
		                        MarkerOptions marker = new MarkerOptions().position(place).title(findPlaces.get(i).getName());
		                        marker.icon(BitmapDescriptorFactory.fromBitmap(placeDetail.getBitmap()));
		    
		                        mMap.addMarker(marker);
		                    }
		                }
		            }
		        }
		    }
		    
		    public void findNearLocation(Location location)   {
		        Log.i(TAG, "findNearLocation: ");
		        if (getActivity() != null) {
		            PlacesService service = new PlacesService(getActivity().getResources().getString(R.string.google_maps_key));
		            findPlaces = service.findPlaces(location.getLatitude(), location.getLongitude(), filterQuery, distanceThreshold);
		            placeNames = new String[findPlaces.size()];
		            imageUrl = new String[findPlaces.size()];
		    
		            for (int i = 0; i < findPlaces.size(); i++) {
		                if (findPlaces.get(i) != null) {
		                    Places placeDetail = findPlaces.get(i);
		                    endPoint.setLatitude(placeDetail.getLatitude());
		                    endPoint.setLongitude(placeDetail.getLongitude());
		    
		                    if (startPoint.distanceTo(endPoint) < distanceThreshold) {
		                        System.out.println(placeDetail.getName());
		                        placeNames[i] = placeDetail.getName();
		                        imageUrl[i] = placeDetail.getName();
		                    }
		                }
		            }
		        }
		    }
		}
		'''
	}	
	
	def insertSettingFragment(Fragment fragment, Application application){
		return '''
		package «application.name»;
		package com.example.mdsdproject.fragments;
		
		import android.os.Bundle;
		
		import androidx.fragment.app.Fragment;
		import androidx.fragment.app.FragmentTransaction;
		
		import android.view.LayoutInflater;
		import android.view.View;
		import android.view.ViewGroup;
		import android.widget.AdapterView;
		import android.widget.ArrayAdapter;
		import android.widget.Button;
		import android.widget.EditText;
		import android.widget.Spinner;
		import android.widget.Toast;
		
		import com.example.mdsdproject.R;
		
		public class SettingsFragment extends Fragment implements AdapterView.OnItemSelectedListener, View.OnClickListener {
		    
		    private String mSpinnerText;
		
		    private Double number;
		    private EditText editText;
		
		    public SettingsFragment() {
		        // Required empty public constructor
		    }
		
		    @Override
		    public void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		    }
		
		    @Override
		    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		        // Inflate the layout for this fragment
		        View view = inflater.inflate(R.layout.fragment_settings, container, false);
		
		        Spinner spinner = view.findViewById(R.id.spinner);
		        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.places, android.R.layout.simple_spinner_item);
		        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		        spinner.setAdapter(adapter);
		        spinner.setOnItemSelectedListener(this);
		
		        Button btn = view.findViewById(R.id.button);
		        btn.setOnClickListener(this);
		
		        editText = view.findViewById(R.id.editTextNumber);
		
		        return view;
		    }
		
		    @Override
		    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		        mSpinnerText = parent.getItemAtPosition(position).toString();
		    }
		
		    @Override
		    public void onNothingSelected(AdapterView<?> parent) {
		
		    }
		
		    @Override
		    public void onClick(View v) {
		        switch (v.getId()){
		            case R.id.button:
		                String failSafe = editText.getText().toString();
		                if(failSafe.matches("")){
		                    Toast.makeText(getActivity().getApplicationContext(), "Please specify number", Toast.LENGTH_SHORT).show();
		                }else{
		                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
		                    MapsFragment mapsFragment = new MapsFragment();
		
		                    number = Double.parseDouble(editText.getText().toString());
		                    Bundle bundle = new Bundle();
		                    bundle.putString("location", mSpinnerText);
		                    bundle.putDouble("radius", number);
		                    mapsFragment.setArguments(bundle);
		                    transaction.replace(R.id.container_frame_layout, mapsFragment).commit();
		
		                }
		
		        }
		    }
		}
		'''
	}
	
	def insertBlankFragment(Fragment fragment, Application application){
		return '''
		package «application.name»;
		import android.os.Bundle;
		import androidx.fragment.app.Fragment;
		import android.view.LayoutInflater;
		import android.view.View;
		import android.view.ViewGroup;
		import «application.name».R;
		
		public class «fragment.name» extends Fragment {
			
			public «fragment.name» {
		        // Required empty public constructor
		    }
		
			@Override
			public void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
			}
		    
		    @Override
		    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		    	// Inflate the layout for this fragment
		    	View view = inflater.inflate(R.layout.fragment_settings, container, false);
				return view;
		    }
		    
		}
		'''
	}
	
	def insertCustomFragment(Fragment fragment, Application application){
		var ActivityLayoutAttributes layout = getFieldData(fragment.activityAttributes, typeof(ActivityLayoutAttributes));
		val string = new StringBuilder();
		val instances = new StringBuilder();
		val vars = new StringBuilder();
		val methods = new StringBuilder();
		
		for(element : layout.layoutElements){
			if(element instanceof Spinner){
				vars.append('''
				private String m«element.name»;
				''');
				
				instances.append('''
		        Spinner «element.name» = view.findViewById(R.id.«javaToAndroidIdentifier(element.name)»);
		        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.places, android.R.layout.simple_spinner_item);
		        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		        spinner.setAdapter(adapter);
		        spinner.setOnItemSelectedListener(this);
		        
				''');
				
				methods.append('''
			    @Override
			    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
			        m«element.name» = parent.getItemAtPosition(position).toString();
			    }
			    
			    @Override
			    public void onNothingSelected(AdapterView<?> parent) { }
			    
				''');
			}if(element instanceof Button){
				vars.append('''
				''');
				
				instances.append('''
				Button «element.name» = view.findViewById(R.id.«javaToAndroidIdentifier(element.name)»);
				«element.name».setOnClickListener(this);
				
				''');
				
				methods.append('''
			    @Override
			    public void onClick(View v) {
			        switch (v.getId()){
			            case R.id.«javaToAndroidIdentifier(element.name)»:
			                «insertVariablesBundle(fragment, application)»
			        }
			    }
				''');
				
			}if(element instanceof EditText){
				vars.append('''
				private EditText m«element.name»;
				private Double m«element.name»_number;
				
				''');
				instances.append('''
				m«element.name» = view.findViewById(R.id.«javaToAndroidIdentifier(element.name)»);
				
				''');
			}
		}
		
		string.append('''
		package «application.name»;
		import android.os.Bundle;
		import androidx.fragment.app.Fragment;
		import android.view.LayoutInflater;
		import android.view.View;
		import android.view.ViewGroup;
		import «application.name».R;
		
		public class «fragment.name» extends Fragment {
			
		«vars»
			public SettingsFragment() {
		        // Required empty public constructor
		    }
		
		    @Override
		    public void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		    }
		
		    @Override
		    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		        // Inflate the layout for this fragment
		        View view = inflater.inflate(R.layout.«javaToAndroidIdentifier(fragment.name)», container, false);
		        «instances»
«««		        TODO: insert bundle

		        return view;
		    }
		    
		    «methods»
		}
		''');
		
		return string;
	}
	
	
	def insertVariablesBundle(Fragment fragment, Application application){
		var ActivityLayoutAttributes layout = getFieldData(fragment.activityAttributes, typeof(ActivityLayoutAttributes));
		val string = new StringBuilder();
		val spinner = new StringBuilder();
		val edittext = new StringBuilder();
		val edittext2 = new StringBuilder();
		val buttonString = new StringBuilder();
		val bundleString = new StringBuilder();
		val bundleString2 = new StringBuilder();
		
		for(element : layout.layoutElements){
			if(element instanceof Spinner){
				spinner.append('''
		           bundle.putString("location", m«element.name»);
				''');
			}if(element instanceof EditText){
				edittext.append('''
				String failSafe = «element.name».getText().toString();
				if(failSafe.matches("")){
					Toast.makeText(getActivity().getApplicationContext(), "Please specify number", Toast.LENGTH_SHORT).show();
				}else{
				''');
				
				edittext2.append('''
				m«element.name»_number = Double.parseDouble(m«element.name».getText().toString());
				bundle.putDouble("radius", m«element.name»_number);
				''');
			}if(element instanceof Button){
				var action = element.actions;
				for(actions: action){
					if((actions instanceof Toast)){
						buttonString.append('''
						Toast.makeText(getActivity().getApplicationContext(), "«actions.text»", Toast.LENGTH_SHORT).show();
						''');
					}if(actions instanceof Bundle){
						bundleString.append('''
						«actions.bundleRecipient.name» b«actions.bundleRecipient.name» = new «actions.bundleRecipient.name»();
						''');
						bundleString2.append('''
						b«actions.bundleRecipient.name».setArguments(bundle);
						transaction.replace(R.id.container_frame_layout, b«actions.bundleRecipient.name»).commit();
						''');
					}
				}
			}
		}
		
		string.append('''
			«buttonString»
			«edittext»
			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			Bundle bundle = new Bundle();
			«bundleString»
			«edittext2»
			«spinner»
			«bundleString2»
			}
		''');
	}
}