package config;

public class ConfigurationManager {
  
  private static ConfigurationManager myConfigurationManager; // singleton, only one instance of this class is needed

  private ConfigurationManager() {
  }

  public static ConfigurationManager getInstance() {
    if (myConfigurationManager == null) {
      myConfigurationManager = new ConfigurationManager();
    }
    return myConfigurationManager;
  }

  
}
