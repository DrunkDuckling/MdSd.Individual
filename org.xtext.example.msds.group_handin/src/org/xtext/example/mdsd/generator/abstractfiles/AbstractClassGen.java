package org.xtext.example.mdsd.generator.abstractfiles;

import java.util.List;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.example.mdsd.androidGenerator.Application;
import org.xtext.example.mdsd.androidGenerator.ApplicationElement;
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList;

public abstract class AbstractClassGen extends AbstractGen {

	@Override
	public void generate(List<Application> applications, IFileSystemAccess2 filesystem) {
		for (Application app: applications) {
			generateClassesForApp(filesystem, applications, app);
		}
	}
	
	private void generateClassesForApp(IFileSystemAccess2 filesystem, List<Application> applications,
			Application application) {
		String projectName = getProjectName(applications, application);
		ApplicationElementList elements = getFieldData(application.getAttributes(),
				ApplicationElementList.class);
			
		for (ApplicationElement element : elements.getElements()) {
			if (isAllowedElement(element)) {
				String classPath = application.getName().replace(".", "/");
			
				filesystem.generateFile(String.format("%s/src/main/java/%s/%s/%s.java", projectName,
						classPath, getSubClassPath(), element.getName()),
						retrieveElementTemplate(application, element));
			}
		}
	}
	
	protected abstract String getSubClassPath();
	
	protected abstract boolean isAllowedElement(ApplicationElement element);
	
	protected abstract String retrieveElementTemplate(Application application, ApplicationElement element);

}