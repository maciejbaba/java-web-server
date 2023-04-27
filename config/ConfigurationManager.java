package config;

public class ConfigurationManager {
  
  private static ConfigurationManager myConfigurationManager; // singleton, only one instance of this class is needed
  private static Configuration myCurrentConfiguration; // singleton, current configuration

  private ConfigurationManager() {
  }

  public static ConfigurationManager getInstance() {
    if (myConfigurationManager == null) {
      myConfigurationManager = new ConfigurationManager();
    }
    return myConfigurationManager;
  }

  public void loadConfigurationFile(String filePath) {
    // load configuration from file
  }

  public void getCurrentConfiguration() {
    // get current configuration
  }
}
