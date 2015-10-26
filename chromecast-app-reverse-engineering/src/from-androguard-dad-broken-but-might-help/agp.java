	public final org.json.JSONObject a
	public final afs b
	private final java.net.HttpURLConnection c
	
	    private agp(aga p8, java.net.HttpURLConnection p9, afs p10)
	    {
	        this(p8, p9, 0, 0, 0, p10);
	        return;
	    }
	
	
	    private agp(aga p8, java.net.HttpURLConnection p9, String p10, org.json.JSONArray p11)
	    {
	        this(p8, p9, p10, 0, p11, 0);
	        return;
	    }
	
	
	    private agp(aga p8, java.net.HttpURLConnection p9, String p10, org.json.JSONObject p11)
	    {
	        this(p8, p9, p10, p11, 0, 0);
	        return;
	    }
	
	
	    private agp(aga p1, java.net.HttpURLConnection p2, String p3, org.json.JSONObject p4, org.json.JSONArray p5, afs p6)
	    {
	        this.c = p2;
	        this.a = p4;
	        this.b = p6;
	        return;
	    }
	
	
	    static java.util.List a(java.net.HttpURLConnection p9, agm p10)
	    {
	        java.io.InputStream v1 = 0;
	        try {
	            if (p9.getResponseCode() < 400) {
	                v1 = p9.getInputStream();
	                int v2_11 = aji.a(v1);
	                String v5_9 = new Object[2];
	                v5_9[0] = Integer.valueOf(v2_11.length());
	                v5_9[1] = v2_11;
	                aiw.a(ags.c, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", v5_9);
	                java.util.List v0_2 = agp.a(p9, p10, new org.json.JSONTokener(v2_11).nextValue());
	                Object[] v6_7 = new Object[3];
	                v6_7[0] = p10.c;
	                v6_7[1] = Integer.valueOf(v2_11.length());
	                v6_7[2] = v0_2;
	                aiw.a(ags.a, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", v6_7);
	                aji.a(v1);
	            } else {
	                v1 = p9.getErrorStream();
	            }
	        } catch (java.util.List v0_6) {
	            aji.a(v1);
	            throw v0_6;
	        } catch (java.util.List v0_3) {
	            String v5_3 = new Object[1];
	            v5_3[0] = v0_3;
	            aiw.a(ags.a, "Response", "Response <Error>: %s", v5_3);
	            v0_2 = agp.a(p10, p9, new afq(v0_3));
	            aji.a(v1);
	        } catch (java.util.List v0_1) {
	            String v5_1 = new Object[1];
	            v5_1[0] = v0_1;
	            aiw.a(ags.a, "Response", "Response <Error>: %s", v5_1);
	            v0_2 = agp.a(p10, p9, new afq(v0_1));
	            aji.a(v1);
	        } catch (java.util.List v0_4) {
	            String v5_5 = new Object[1];
	            v5_5[0] = v0_4;
	            aiw.a(ags.a, "Response", "Response <Error>: %s", v5_5);
	            v0_2 = agp.a(p10, p9, new afq(v0_4));
	            aji.a(v1);
	        } catch (java.util.List v0_5) {
	            String v5_7 = new Object[1];
	            v5_7[0] = v0_5;
	            aiw.a(ags.a, "Response", "Response <Error>: %s", v5_7);
	            v0_2 = agp.a(p10, p9, v0_5);
	            aji.a(v1);
	        }
	        return v0_2;
	    }
	
	
	    private static java.util.List a(java.net.HttpURLConnection p8, java.util.List p9, Object p10)
	    {
	        org.json.JSONArray v1_3;
	        int v3_0 = p9.size();
	        java.util.ArrayList v5_1 = new java.util.ArrayList(v3_0);
	        if (v3_0 != 1) {
	            v1_3 = p10;
	        } else {
	            int v0_2 = ((aga) p9.get(0));
	            try {
	                org.json.JSONArray v1_1;
	                Object v4_1 = new org.json.JSONObject();
	                v4_1.put("body", p10);
	            } catch (org.json.JSONArray v1_4) {
	                v5_1.add(new agp(v0_2, p8, new afs(p8, v1_4)));
	            } catch (org.json.JSONArray v1_5) {
	                v5_1.add(new agp(v0_2, p8, new afs(p8, v1_5)));
	                v1_3 = p10;
	            }
	            if (p8 == null) {
	                v1_1 = 200;
	            } else {
	                v1_1 = p8.getResponseCode();
	            }
	            v4_1.put("code", v1_1);
	            v1_3 = new org.json.JSONArray();
	            v1_3.put(v4_1);
	        }
	        if (((v1_3 instanceof org.json.JSONArray)) && (((org.json.JSONArray) v1_3).length() == v3_0)) {
	            org.json.JSONArray v1_6 = ((org.json.JSONArray) v1_3);
	            int v3_1 = 0;
	            while (v3_1 < v1_6.length()) {
	                int v0_9 = ((aga) p9.get(v3_1));
	                try {
	                    Object v4_7;
	                    String v2_12;
	                    String v2_1 = v1_6.get(v3_1);
	                } catch (String v2_20) {
	                    v5_1.add(new agp(v0_9, p8, new afs(p8, v2_20)));
	                    v0_9 = (v3_1 + 1);
	                    v3_1 = v0_9;
	                } catch (String v2_21) {
	                    v5_1.add(new agp(v0_9, p8, new afs(p8, v2_21)));
	                }
	                if (!(v2_1 instanceof org.json.JSONObject)) {
	                    v4_7 = v2_1;
	                    if (v4_7 != org.json.JSONObject.NULL) {
	                        String v2_10;
	                        String v2_8 = String.valueOf(v4_7.getClass().getSimpleName());
	                        if (v2_8.length() == 0) {
	                            v2_10 = new String("Got unexpected object type in response, class: ");
	                        } else {
	                            v2_10 = "Got unexpected object type in response, class: ".concat(v2_8);
	                        }
	                        throw new afq(v2_10);
	                    } else {
	                        v2_12 = new agp(v0_9, p8, v4_7.toString(), 0);
	                    }
	                } else {
	                    String v2_2 = ((org.json.JSONObject) v2_1);
	                    Object v4_8 = afs.a(v2_2, p10, p8);
	                    if (v4_8 == null) {
	                        String v2_3 = aji.a(v2_2, "body", "FACEBOOK_NON_JSON_RESULT");
	                        if (!(v2_3 instanceof org.json.JSONObject)) {
	                            if (!(v2_3 instanceof org.json.JSONArray)) {
	                                v4_7 = org.json.JSONObject.NULL;
	                            } else {
	                                v2_12 = new agp(v0_9, p8, v2_3.toString(), ((org.json.JSONArray) v2_3));
	                            }
	                        } else {
	                            v2_12 = new agp(v0_9, p8, v2_3.toString(), ((org.json.JSONObject) v2_3));
	                        }
	                    } else {
	                        if ((v4_8.b == 190) && (aji.a(v0_9.b))) {
	                            afb.a(0);
	                        }
	                        v2_12 = new agp(v0_9, p8, v4_8);
	                    }
	                }
	                v5_1.add(v2_12);
	            }
	            return v5_1;
	        } else {
	            throw new afq("Unexpected number of results");
	        }
	    }
	
	
	    static java.util.List a(java.util.List p6, java.net.HttpURLConnection p7, afq p8)
	    {
	        int v2 = p6.size();
	        java.util.ArrayList v3_1 = new java.util.ArrayList(v2);
	        int v1 = 0;
	        while (v1 < v2) {
	            v3_1.add(new agp(((aga) p6.get(v1)), p7, new afs(p7, p8)));
	            v1++;
	        }
	        return v3_1;
	    }
	
	
	    public final String toString()
	    {
	        try {
	            String v0_2;
	            Object[] v3 = new Object[1];
	        } catch (String v0) {
	            String v0_4 = "unknown";
	            return new StringBuilder("{Response: ").append(" responseCode: ").append(v0_4).append(", graphObject: ").append(this.a).append(", error: ").append(this.b).append("}").toString();
	        }
	        if (this.c == null) {
	            v0_2 = 200;
	        } else {
	            v0_2 = this.c.getResponseCode();
	        }
	        v3[0] = Integer.valueOf(v0_2);
	        v0_4 = String.format(java.util.Locale.US, "%d", v3);
	        return new StringBuilder("{Response: ").append(" responseCode: ").append(v0_4).append(", graphObject: ").append(this.a).append(", error: ").append(this.b).append("}").toString();
	    }
	
