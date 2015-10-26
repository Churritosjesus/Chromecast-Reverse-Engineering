	 java.util.List a
	
	    public bdp(String p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v0_0 = -1;
	        try {
	            org.json.JSONArray v3_1 = this.a("configured_networks", bdp.c);
	        } catch (java.io.IOException v1) {
	            return v0_0;
	        } catch (int v0) {
	            v0_0 = -2;
	            return v0_0;
	        }
	        if (v3_1.b() == 200) {
	            int v0_1 = v3_1.c();
	            if ((v0_1 != 0) && ("application/json".equals(v0_1.b))) {
	                int v0_2 = v0_1.a();
	                if (v0_2 != 0) {
	                    try {
	                        org.json.JSONArray v3_5 = new org.json.JSONArray(v0_2);
	                        java.util.ArrayList v4_4 = new java.util.ArrayList();
	                        int v5_1 = v3_5.length();
	                        int v0_3 = 0;
	                    } catch (int v0) {
	                        v0_0 = -3;
	                        return v0_0;
	                    }
	                    while (v0_3 < v5_1) {
	                        int v6_0 = v3_5.getJSONObject(v0_3);
	                        bfs v7_1 = new bfs();
	                        v7_1.a = v6_0.getString("ssid");
	                        v7_1.b = bfu.a(v6_0.optInt("wpa_auth", bfu.a.j));
	                        v7_1.c = bfv.a(v6_0.optInt("wpa_cipher", bfv.a.b));
	                        v7_1.d = v6_0.optInt("wpa_id", 0);
	                        v4_4.add(v7_1);
	                        v0_3++;
	                    }
	                    this.a = v4_4;
	                    v0_0 = 0;
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
	
