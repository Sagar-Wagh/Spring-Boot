package com.techm.justgifit;

import java.io.File;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.techm.justgifit")
public class JustGifItProperties {

	   private File gifLocation;
	 private Boolean optimize;
	 
	public Boolean getOptimize() {
		return optimize;
	}
	public void setOptimize(Boolean optimize) {
		this.optimize = optimize;
	}
	public File getGifLocation() {
		return gifLocation;
	}
	public void setGifLocation(File gifLocation) {
		this.gifLocation = gifLocation;
	}
}
