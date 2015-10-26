	private static final java.util.Map a
	
	    static ahu()
	    {
	        ahu.a = new ahv();
	        return;
	    }
	
	
	    public static org.json.JSONObject a(ahw p7, ahx p8, String p9, boolean p10, android.content.Context p11)
	    {
	        org.json.JSONObject v0_1 = new org.json.JSONObject();
	        v0_1.put("event", ahu.a.get(p7));
	        aji.a(v0_1, p8, p9, p10);
	        try {
	            aji.a(v0_1, p11);
	        } catch (String v1_1) {
	            Object[] v5_1 = new Object[1];
	            v5_1[0] = v1_1.toString();
	            aiw.a(ags.e, "AppEvents", "Fetching extended device info parameters failed: \'%s\'", v5_1);
	        }
	        v0_1.put("application_package_name", p11.getPackageName());
	        return v0_1;
	    }
	
