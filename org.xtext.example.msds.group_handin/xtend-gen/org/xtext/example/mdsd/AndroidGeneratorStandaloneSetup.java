/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd;

import org.xtext.example.mdsd.AndroidGeneratorStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class AndroidGeneratorStandaloneSetup extends AndroidGeneratorStandaloneSetupGenerated {
  public static void doSetup() {
    new AndroidGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}