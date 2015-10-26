	 java.util.ArrayList a
	
	    public bds(String p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v0_0 = -1;
	        try {
	            org.json.JSONArray v3_1 = this.a("supported_locales", bds.c);
	        } catch (int v0) {
	            v0_0 = -2;
	            return v0_0;
	        } catch (java.io.IOException v1) {
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
	                        String v6_0 = v3_5.getJSONObject(v0_3);
	                        v4_4.add(new bcz(v6_0.getString("locale"), v6_0.getString("display_string")));
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
	
