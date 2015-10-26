	 java.lang.String a
	
	    public bfg(String p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v0 = -3;
	        new org.json.JSONObject();
	        try {
	            org.json.JSONException v1_3 = this.a("offer", bfg.c).c();
	        } catch (int v0) {
	            v0 = -1;
	            return v0;
	        } catch (int v0) {
	            v0 = -2;
	            return v0;
	        }
	        if ((v1_3 != null) && ("application/json".equals(v1_3.b))) {
	            org.json.JSONException v1_4 = v1_3.a();
	            if (v1_4 == null) {
	                return v0;
	            } else {
	                try {
	                    this.a = new org.json.JSONObject(v1_4).optString("token", 0);
	                    v0 = 0;
	                } catch (org.json.JSONException v1) {
	                }
	                return v0;
	            }
	        } else {
	            return v0;
	        }
	    }
	
