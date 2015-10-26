	final ahe a
	public java.lang.String b
	
	    public akt(android.content.Context p2, String p3)
	    {
	        this.b = p3;
	        this.a = ahe.a(p2, p3);
	        return;
	    }
	
	
	    static android.os.Bundle a(String p4)
	    {
	        android.os.Bundle v0_1 = new android.os.Bundle();
	        v0_1.putLong("1_timestamp_ms", System.currentTimeMillis());
	        v0_1.putString("0_auth_logger_id", p4);
	        v0_1.putString("3_method", "");
	        v0_1.putString("2_result", "");
	        v0_1.putString("5_error_message", "");
	        v0_1.putString("4_error_code", "");
	        v0_1.putString("6_extras", "");
	        return v0_1;
	    }
	
	
	    public final void a(akl p6)
	    {
	        android.os.Bundle v0_1 = akt.a(p6.e);
	        try {
	            ahe v1_1 = new org.json.JSONObject();
	            v1_1.put("login_behavior", p6.a.toString());
	            v1_1.put("request_code", akh.b());
	            v1_1.put("permissions", android.text.TextUtils.join(",", p6.b));
	            v1_1.put("default_audience", p6.c.toString());
	            v1_1.put("isReauthorize", p6.f);
	            v0_1.putString("6_extras", v1_1.toString());
	        } catch (ahe v1) {
	        }
	        this.a.a("fb_mobile_login_start", 0, v0_1);
	        return;
	    }
	
	
	    public final void a(String p4, String p5, String p6)
	    {
	        android.os.Bundle v0_1 = akt.a("");
	        v0_1.putString("2_result", akp.c.d);
	        v0_1.putString("5_error_message", p5);
	        v0_1.putString("3_method", p6);
	        this.a.a(p4, 0, v0_1);
	        return;
	    }
	
