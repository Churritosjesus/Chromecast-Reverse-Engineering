	private static final java.util.Map a
	
	    static aib()
	    {
	        java.util.Map v0_1 = new java.util.HashMap();
	        aib.a = v0_1;
	        v0_1.put(Boolean, new aic());
	        aib.a.put(Integer, new aid());
	        aib.a.put(Long, new aie());
	        aib.a.put(Double, new aif());
	        aib.a.put(String, new aig());
	        aib.a.put(String[], new aih());
	        aib.a.put(org.json.JSONArray, new aii());
	        return;
	    }
	
	
	    public static android.os.Bundle a(org.json.JSONObject p6)
	    {
	        String v3_1 = new android.os.Bundle();
	        java.util.Iterator v4 = p6.keys();
	        while (v4.hasNext()) {
	            IllegalArgumentException v0_2 = ((String) v4.next());
	            String v1_0 = p6.get(v0_2);
	            if ((v1_0 != null) && (v1_0 != org.json.JSONObject.NULL)) {
	                if (!(v1_0 instanceof org.json.JSONObject)) {
	                    StringBuilder v2_4 = ((aij) aib.a.get(v1_0.getClass()));
	                    if (v2_4 != null) {
	                        v2_4.a(v3_1, v0_2, v1_0);
	                    } else {
	                        String v1_2 = String.valueOf(v1_0.getClass());
	                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(v1_2).length() + 18)).append("Unsupported type: ").append(v1_2).toString());
	                    }
	                } else {
	                    v3_1.putBundle(v0_2, aib.a(((org.json.JSONObject) v1_0)));
	                }
	            }
	        }
	        return v3_1;
	    }
	
