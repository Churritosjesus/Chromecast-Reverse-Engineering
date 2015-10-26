	private static aiq g
	public final java.util.Map a
	public final java.util.Map b
	public final java.util.Map c
	public final java.lang.String d
	public final java.lang.String e
	public final java.lang.String f
	
	    aiq(java.util.Map p1, java.util.Map p2, java.util.Map p3, String p4, String p5, String p6)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        this.f = p6;
	        return;
	    }
	
	
	    public static declared_synchronized aiq a()
	    {
	        try {
	            if (aiq.g == null) {
	                aiq.g = new aiq(0, new air(), new ais(), 0, 0, 0);
	            }
	        } catch (aiq v0_3) {
	            throw v0_3;
	        }
	        return aiq.g;
	    }
	
	
	    static java.util.Map a(org.json.JSONObject p10)
	    {
	        java.util.HashMap v4 = 0;
	        org.json.JSONArray v6 = p10.optJSONArray("items");
	        if (v6.length() != 0) {
	            java.util.HashMap v5_1 = new java.util.HashMap();
	            int v0_2 = 0;
	            while (v0_2 < v6.length()) {
	                int v2_1 = v6.optJSONObject(v0_2);
	                if (v2_1 != 0) {
	                    int v7 = v2_1.optInt("code");
	                    if (v7 != 0) {
	                        int v2_3;
	                        org.json.JSONArray v8 = v2_1.optJSONArray("subcodes");
	                        if ((v8 == null) || (v8.length() <= 0)) {
	                            v2_3 = 0;
	                        } else {
	                            Integer v3_3 = new java.util.HashSet();
	                            int v2_4 = 0;
	                            while (v2_4 < v8.length()) {
	                                Integer v9_1 = v8.optInt(v2_4);
	                                if (v9_1 != null) {
	                                    v3_3.add(Integer.valueOf(v9_1));
	                                }
	                                v2_4++;
	                            }
	                            v2_3 = v3_3;
	                        }
	                        v5_1.put(Integer.valueOf(v7), v2_3);
	                    }
	                }
	                v0_2++;
	            }
	            v4 = v5_1;
	        }
	        return v4;
	    }
	
