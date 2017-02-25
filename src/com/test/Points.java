package com.test;

import java.util.HashMap;
import java.util.Map;


public enum Points {

	VGood("0"), Good("3"), Average("7"), Poor("10"), Nogo("11");
	
	private final String description;
    private static Map<String, String> enumMap;

    private Points(String description) {
        this.description = description;
    }

    public String getEnumValue() {
        return description;
    }

    public static String getPoint(String name) {
    	if ( name.equals("V.Good")) {
    		name = "VGood" ;
    	}
    	
    	if ( name.equals("No-go")) {
    		name = "Nogo" ;
    	}
    	
        if (enumMap == null) {
            initializeMap();
        }
        return enumMap.get(name);
    }

    private static Map<String, String> initializeMap() {
        enumMap = new HashMap<String, String>();
        for (Points access : Points.values()) {
            enumMap.put( access.toString(), access.getEnumValue());
        }
        return enumMap;
    }
}
