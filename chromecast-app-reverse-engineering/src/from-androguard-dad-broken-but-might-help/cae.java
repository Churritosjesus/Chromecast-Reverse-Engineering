	
	    static cae()
	    {
	        java.util.regex.Pattern.compile("\\\\.");
	        java.util.regex.Pattern.compile("[\\\\\"/\u0008\u000c\n\r\t]");
	        return;
	    }
	
	
	    public static boolean a(Object p5, Object p6)
	    {
	        int v1 = 0;
	        if ((p5 != null) || (p6 != null)) {
	            if ((p5 != null) && (p6 != null)) {
	                if ((!(p5 instanceof org.json.JSONObject)) || (!(p6 instanceof org.json.JSONObject))) {
	                    if ((!(p5 instanceof org.json.JSONArray)) || (!(p6 instanceof org.json.JSONArray))) {
	                        v1 = p5.equals(p6);
	                    } else {
	                        if (((org.json.JSONArray) p5).length() == ((org.json.JSONArray) p6).length()) {
	                            int v0_5 = 0;
	                            while (v0_5 < ((org.json.JSONArray) p5).length()) {
	                                try {
	                                    if (cae.a(((org.json.JSONArray) p5).get(v0_5), ((org.json.JSONArray) p6).get(v0_5))) {
	                                        v0_5++;
	                                    }
	                                } catch (int v0) {
	                                }
	                            }
	                            v1 = 1;
	                        }
	                    }
	                } else {
	                    if (((org.json.JSONObject) p5).length() == ((org.json.JSONObject) p6).length()) {
	                        boolean v3_5 = ((org.json.JSONObject) p5).keys();
	                        while (v3_5.hasNext()) {
	                            int v0_9 = ((String) v3_5.next());
	                            try {
	                                if ((!((org.json.JSONObject) p6).has(v0_9)) || (!cae.a(((org.json.JSONObject) p5).get(v0_9), ((org.json.JSONObject) p6).get(v0_9)))) {
	                                }
	                            } catch (int v0) {
	                            }
	                        }
	                        v1 = 1;
	                    }
	                }
	            }
	        } else {
	            v1 = 1;
	        }
	        return v1;
	    }
	
