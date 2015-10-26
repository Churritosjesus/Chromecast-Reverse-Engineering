	final android.content.SharedPreferences a
	
	    agw()
	    {
	        this.a = afv.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
	        return;
	    }
	
	
	    final agt a()
	    {
	        org.json.JSONException v0_3;
	        org.json.JSONException v0_1 = this.a.getString("com.facebook.ProfileManager.CachedProfile", 0);
	        if (v0_1 == null) {
	            v0_3 = 0;
	        } else {
	            try {
	                v0_3 = new agt(new org.json.JSONObject(v0_1));
	            } catch (org.json.JSONException v0) {
	            }
	        }
	        return v0_3;
	    }
	
