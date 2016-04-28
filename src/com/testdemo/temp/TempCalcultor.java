package com.testdemo.temp;

public class TempCalcultor {

    public static int calculateTemperature(int s1, int s2, boolean eStop) {
    	if (eStop) {
    		return -1;
    	}
    	else {
    		if (Math.abs(s1 - s2) > 5) {
    			return -2;
    		}
    		else {
    			if ((s1 + s2) / 2 < 40) {
    				return -3;
    			}
    			else if ((s1 + s2) / 2 > 80) {
    				return -4;
    			}
    			else {
    				return (s1 + s2) / 2;
    			}
    		}
    	}
    }
}
