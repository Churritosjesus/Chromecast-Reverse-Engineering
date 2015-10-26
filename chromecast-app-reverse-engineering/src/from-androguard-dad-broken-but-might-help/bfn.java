	private static final  b
	public java.lang.String a
	private final java.lang.String j
	
	    static bfn()
	    {
	        bfn.b = ((int) java.util.concurrent.TimeUnit.SECONDS.toMillis(40));
	        return;
	    }
	
	
	    public bfn(String p1, String p2)
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
	            v1_1.put("uuid", this.j);
	            try {
	                org.json.JSONException v1_4 = this.a("send_log_report", bfc.a(v1_1), bfn.b).c();
	            } catch (int v0) {
	                v0 = -2;
	                return v0;
	            } catch (int v0) {
	                v0 = -1;
	                return v0;
	            }
	            if ((v1_4 != null) && ("application/json".equals(v1_4.b))) {
	                org.json.JSONException v1_5 = v1_4.a();
	                if (v1_5 == null) {
	                    return v0;
	                } else {
	                    try {
	                        this.a = new org.json.JSONObject(v1_5).optString("crash_report_id", 0);
	                        v0 = 0;
	                    } catch (org.json.JSONException v1) {
	                    }
	                    return v0;
	                }
	            } else {
	                return v0;
	            }
	        } catch (org.json.JSONObject v2) {
	        }
	    }
	
