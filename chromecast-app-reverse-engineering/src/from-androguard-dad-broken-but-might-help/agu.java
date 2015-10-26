	
	    agu()
	    {
	        return;
	    }
	
	
	    public final void a(afq p1)
	    {
	        return;
	    }
	
	
	    public final void a(org.json.JSONObject p8)
	    {
	        String v1 = p8.optString("id");
	        if (v1 != null) {
	            int v6_1;
	            int v6_0 = p8.optString("link");
	            String v2_1 = p8.optString("first_name");
	            String v3_1 = p8.optString("middle_name");
	            String v4_1 = p8.optString("last_name");
	            String v5_1 = p8.optString("name");
	            if (v6_0 == 0) {
	                v6_1 = 0;
	            } else {
	                v6_1 = android.net.Uri.parse(v6_0);
	            }
	            agt.a(new agt(v1, v2_1, v3_1, v4_1, v5_1, v6_1));
	        }
	        return;
	    }
	
