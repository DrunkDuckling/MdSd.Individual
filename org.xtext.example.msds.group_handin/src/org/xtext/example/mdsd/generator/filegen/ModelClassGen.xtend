package org.xtext.example.mdsd.generator.filegen

import org.xtext.example.mdsd.generator.abstractfiles.AbstractClassGen
import org.xtext.example.mdsd.androidGenerator.ApplicationElement
import org.xtext.example.mdsd.androidGenerator.Application
import org.xtext.example.mdsd.androidGenerator.Model
import org.xtext.example.mdsd.androidGenerator.ModelList

class ModelClassGen extends AbstractClassGen{
	
	override protected getSubClassPath() {
		return "model";
	}
	
	override protected isAllowedElement(ApplicationElement element) {
		return element instanceof Model;
	}
	
	override protected retrieveElementTemplate(Application application, ApplicationElement element) {
		var model = element as Model;
		var ModelList modlist = getFieldData(application.attributes, typeof(ModelList));
		var map = model.activityType;
		var mod = model.modellist;
		var isModList = mod != null;
		var isMapModel = map != null;
		
		
		return '''
		«IF isMapModel »
			«generateMapModel(model, application)»
		«ENDIF»
		''';
		
	}
	
	// Creates a for loop that generates the getter and setters needed/specified in the grammar
	private def String generateGetSet(ModelList models, ApplicationElement model, Application application) {
		
		return  '''
		package «application.name»;
		import android.graphics.Bitmap;
			
		import java.util.logging.Level;
		import java.util.logging.Logger;
		import org.json.JSONException;
		import org.json.JSONObject;
			
		public class «model.name» {
		
«««		«IF models.getset == null»
«««		shit
«««		«ENDIF»
«««		«IF models.getset != null»
«««		«FOR mod : models.getset»
«««			private «models.type» «models.getset»
«««		«ENDFOR» 
«««		«FOR mod : models.getset»
«««			public «models.type» get«models.getset»() {
«««				return «models.getset»;
«««			}
«««			
«««			public void set«models.getset»(«models.type» «models.getset») {
«««				this.«models.getset» = «models.getset»;
«««			}
«««		«ENDFOR»
«««		«ENDIF»
		}
		''';
	}
	
	// Generates the needed model for using Maps in Android
	private def String generateMapModel(ApplicationElement model, Application application){
		
		return 
		'''
			package «application.name»;
			
			import android.graphics.Bitmap;
			
			import java.util.logging.Level;
			import java.util.logging.Logger;
			import org.json.JSONException;
			import org.json.JSONObject;
			
			
			public class «model.name» {
			    private String id;
			    private String icon;
			    private String name;
			    private Double latitude;
			    private Double longitude;
			    private Bitmap bitmap;
			
			    public String getId() {
			        return id;
			    }
			
			    public void setId(String id) {
			        this.id = id;
			    }
			
			    public String getIcon() {
			        return icon;
			    }
			
			    public void setIcon(String icon) {
			        this.icon = icon;
			    }
			
			    public void setBitmap(Bitmap bitmap) {
			        this.bitmap = bitmap;
			    }
			
			    public Bitmap getBitmap() {
			        return bitmap;
			    }
			
			    public Double getLatitude() {
			        return latitude;
			    }
			
			    public void setLatitude(Double latitude) {
			        this.latitude = latitude;
			    }
			
			    public Double getLongitude() {
			        return longitude;
			    }
			
			    public void setLongitude(Double longitude) {
			        this.longitude = longitude;
			    }
			
			    public String getName() {
			        return name;
			    }
			
			    public void setName(String name) {
			        this.name = name;
			    }
			
			
			    static «model.name» JSONToResult(JSONObject jsonObject) {
			        if (jsonObject != null) {
			            try {
			                «model.name» result = new «model.name»();
			                JSONObject geometry = (JSONObject) jsonObject.get("geometry");
			                JSONObject location = (JSONObject) geometry.get("location");
			                result.setLatitude((Double) location.get("lat"));
			                result.setLongitude((Double) location.get("lng"));
			                result.setIcon(jsonObject.getString("icon"));
			                result.setName(jsonObject.getString("name"));
			                result.setId(jsonObject.getString("id"));
			                return result;
			            } catch (JSONException ex) {
			                Logger.getLogger(«model.name».class.getName()).log(Level.SEVERE, null, ex);
			            }
			        }
			
			        return null;
			    }
			
			    @Override
			    public String toString() {
			        return "«model.name»{" + "id=" + id + ", icon=" + icon + ", name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + '}';
			    }
			
			}
		'''
	}
	
	
}