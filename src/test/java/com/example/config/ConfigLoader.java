// This class is responsible for dynamically loading environment configurations.
// Depending on the selected environment (dev, qa, staging, prod),
// it provides the respective configuration settings.

package com.example.config;

public class ConfigLoader {

    private String environment;

    public ConfigLoader(String environment) {
        this.environment = environment;
    }

    public void loadConfig() {
        switch (environment) {
            case "dev":
                // Load development configurations
                break;
            case "qa":
                // Load QA configurations
                break;
            case "staging":
                // Load staging configurations
                break;
            case "prod":
                // Load production configurations
                break;
            default:
                throw new IllegalArgumentException("Invalid environment: " + environment);
        }
    }
}