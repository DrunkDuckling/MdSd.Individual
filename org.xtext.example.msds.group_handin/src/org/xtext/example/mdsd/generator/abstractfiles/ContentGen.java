package org.xtext.example.mdsd.generator.abstractfiles;

import java.util.List;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.example.mdsd.androidGenerator.Application;

public interface ContentGen {

	public void generate(List<Application> applications, IFileSystemAccess2 filesystem);
	
}