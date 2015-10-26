	 bdj a
	
	    public bfl(String p2)
	    {
	        this(p2);
	        this.a = 0;
	        return;
	    }
	
	
	    public static boolean a(bdf p2)
	    {
	        int v0_1;
	        if (p2.a < 4) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final int a()
	    {
	        java.io.IOException v0_0 = -1;
	        try {
	            org.json.JSONObject v2_1 = this.a("save_wifi", 0, bfl.c);
	        } catch (java.io.IOException v0) {
	            v0_0 = -2;
	            return v0_0;
	        } catch (java.io.IOException v1) {
	            return v0_0;
	        }
	        if (v2_1.b() == 200) {
	            java.io.IOException v0_1 = v2_1.c();
	            if ((v0_1 != null) && ("application/json".equals(v0_1.b))) {
	                java.io.IOException v0_2 = v0_1.a();
	                if (v0_2 != null) {
	                    try {
	                        org.json.JSONObject v2_5 = new org.json.JSONObject(v0_2);
	                    } catch (java.io.IOException v0) {
	                        v0_0 = 0;
	                        return v0_0;
	                    }
	                    if (!v2_5.has("setup_state")) {
	                    } else {
	                        this.a = bdj.a(v2_5.optInt("setup_state", bdj.a.r));
	                    }
	                } else {
	                    v0_0 = 0;
	                    return v0_0;
	                }
	            } else {
	                v0_0 = 0;
	                return v0_0;
	            }
	        } else {
	            return v0_0;
	        }
	    }
	
