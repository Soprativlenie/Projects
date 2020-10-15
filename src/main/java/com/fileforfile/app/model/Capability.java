package com.fileforfile.app.model;/* Created by user on 29.07.20 */

public class Capability {
    private String platformName;
    private String deviceName;
    private String platformVersion;
    private String automationName;
    private String appPackage;
    private String appActivity;
    private String app;


    public String getPlatformName() {
        return platformName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public String getAutomationName() {
        return automationName;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public String getAppActivity() {
        return appActivity;
    }

    public String getApp() {
        return app;
    }

    public static Builder newEntity() {
        return new Capability().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder withPlatformName(String platformName) {
            Capability.this.platformName = platformName;
            return this;
        }

        public Builder withDeviceName(String deviceName) {
            Capability.this.deviceName = deviceName;
            return this;
        }

        public Builder withPlatformVersion(String platformVersion) {
            Capability.this.platformVersion = platformVersion;
            return this;
        }

        public Builder withAutomationName(String automationName) {
            Capability.this.automationName = automationName;
            return this;
        }

        public Builder withAppPackage(String appPackage) {
            Capability.this.appPackage = appPackage;
            return this;
        }

        public Builder withAppActivity(String appActivity) {
            Capability.this.appActivity = appActivity;
            return this;
        }

        public Builder withApp(String app) {
            Capability.this.app = app;
            return this;
        }

    }
}
