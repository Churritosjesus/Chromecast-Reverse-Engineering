	 java.lang.String a
	 java.lang.String b
	private final java.lang.String j
	
	    public bdo(String p1, String p2)
	    {
	        this(p1);
	        this.j = p2;
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v0 = -3;
	        org.json.JSONException v1_1 = new org.json.JSONObject();
	        try {
	            v1_1.put("app_id", this.j);
	        } catch (org.json.JSONObject v2) {
	        }
	        try {
	            org.json.JSONException v1_4 = this.a("get_app_device_id", bfc.a(v1_1), bdo.c).c();
	        } catch (int v0) {
	            v0 = -1;
	            return v0;
	        } catch (int v0) {
	            v0 = -2;
	            return v0;
	        }
	        if ((v1_4 != null) && ("application/json".equals(v1_4.b))) {
	            org.json.JSONException v1_5 = v1_4.a();
	            if (v1_5 == null) {
	                return v0;
	            } else {
	                try {
	                    org.json.JSONObject v2_5 = new org.json.JSONObject(v1_5);
	                    this.a = v2_5.optString("app_device_id", 0);
	                    this.b = v2_5.optString("certificate", 0);
	                    v2_5.optString("signed_data", 0);
	                    v0 = 0;
	                } catch (org.json.JSONException v1) {
	                }
	                return v0;
	            }
	        } else {
	            return v0;
	        }
	    }
	
