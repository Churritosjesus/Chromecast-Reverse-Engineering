	 java.util.ArrayList a
	
	    public bdr(String p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public static java.util.ArrayList a(String p9)
	    {
	        org.json.JSONArray v2_1 = new org.json.JSONArray(p9);
	        java.util.ArrayList v3_1 = new java.util.ArrayList();
	        int v4 = v2_1.length();
	        int v0 = 0;
	        while (v0 < v4) {
	            int v5_0 = v2_1.getJSONObject(v0);
	            bfs v6_1 = new bfs();
	            v6_1.a = v5_0.getString("ssid");
	            v6_1.b = bfu.a(v5_0.optInt("wpa_auth", bfu.a.j));
	            v6_1.c = bfv.a(v5_0.optInt("wpa_cipher", bfv.a.b));
	            v6_1.d = v5_0.optInt("wpa_id", 0);
	            v6_1.i = v5_0.getString("bssid");
	            v6_1.h = v5_0.getInt("signal_level");
	            v3_1.add(v6_1);
	            v0++;
	        }
	        return v3_1;
	    }
	
	
	    public final int a()
	    {
	        java.io.IOException v0_0 = -1;
	        try {
	            boolean v2_1 = this.a("scan_results", bdr.c);
	        } catch (java.io.IOException v1) {
	            return v0_0;
	        } catch (java.io.IOException v0) {
	            v0_0 = -2;
	            return v0_0;
	        }
	        if (v2_1.b() == 200) {
	            java.io.IOException v0_1 = v2_1.c();
	            if ((v0_1 != null) && ("application/json".equals(v0_1.b))) {
	                java.io.IOException v0_2 = v0_1.a();
	                if (v0_2 != null) {
	                    try {
	                        this.a = bdr.a(v0_2);
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
	
