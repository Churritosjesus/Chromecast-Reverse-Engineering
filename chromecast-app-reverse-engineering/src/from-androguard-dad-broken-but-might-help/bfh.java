	private  a
	
	    public bfh(String p1, int p2)
	    {
	        this(p1);
	        this.a = p2;
	        return;
	    }
	
	
	    public final int a()
	    {
	        java.io.IOException v0_0 = -1;
	        org.json.JSONObject v2_1 = new org.json.JSONObject();
	        try {
	            v2_1.put("sound_id", this.a);
	        } catch (String v3) {
	        }
	        try {
	            org.json.JSONObject v2_3 = this.a("play_sound", bfc.a(v2_1), bfh.c);
	        } catch (java.io.IOException v1) {
	            return v0_0;
	        } catch (java.io.IOException v0) {
	            v0_0 = -2;
	            return v0_0;
	        }
	        if (v2_3.b() == 200) {
	            java.io.IOException v0_1 = v2_3.c();
	            if ((v0_1 != null) && ("application/json".equals(v0_1.b))) {
	                java.io.IOException v0_2 = v0_1.a();
	                if (v0_2 != null) {
	                    try {
	                        org.json.JSONObject v2_7 = new org.json.JSONObject(v0_2);
	                        v2_7.getDouble("volume");
	                        v2_7.getLong("duration");
	                        v0_0 = 0;
	                    } catch (java.io.IOException v0) {
	                        v0_0 = -3;
	                    }
	                    return v0_0;
	                } else {
	                    v0_0 = -3;
	                    return v0_0;
	                }
	            } else {
	                v0_0 = -3;
	                return v0_0;
	            }
	        } else {
	            return v0_0;
	        }
	    }
	
