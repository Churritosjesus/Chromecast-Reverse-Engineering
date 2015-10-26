	private static afu e
	final  a
	public final  b
	final java.lang.String c
	public final afq d
	private final  f
	private final java.lang.String g
	
	    static afs()
	    {
	        afs.e = new afu(200, 299);
	        return;
	    }
	
	
	    private afs(int p5, int p6, int p7, String p8, String p9, String p10, String p11, boolean p12, org.json.JSONObject p13, org.json.JSONObject p14, Object p15, java.net.HttpURLConnection p16, afq p17)
	    {
	        this.a = p5;
	        this.b = p6;
	        this.c = p8;
	        this.g = p9;
	        int v1_0 = 0;
	        if (p17 == null) {
	            this.d = new afz(this, p9);
	        } else {
	            this.d = p17;
	            v1_0 = 1;
	        }
	        int v1_22;
	        aiq v2_2 = afs.b();
	        if (v1_0 != 0) {
	            v1_22 = aft.b;
	        } else {
	            if (!p12) {
	                if ((v2_2.a != null) && (v2_2.a.containsKey(Integer.valueOf(p6)))) {
	                    int v1_6 = ((java.util.Set) v2_2.a.get(Integer.valueOf(p6)));
	                    if ((v1_6 == 0) || (v1_6.contains(Integer.valueOf(p7)))) {
	                        v1_22 = aft.b;
	                        this.f = v1_22;
	                        switch (ait.a[(this.f - 1)]) {
	                            case 1:
	                                break;
	                            case 2:
	                                break;
	                            case 3:
	                                break;
	                        }
	                        return;
	                    }
	                }
	                if ((v2_2.c != null) && (v2_2.c.containsKey(Integer.valueOf(p6)))) {
	                    int v1_13 = ((java.util.Set) v2_2.c.get(Integer.valueOf(p6)));
	                    if ((v1_13 == 0) || (v1_13.contains(Integer.valueOf(p7)))) {
	                        v1_22 = aft.a;
	                    }
	                }
	                if ((v2_2.b == null) || (!v2_2.b.containsKey(Integer.valueOf(p6)))) {
	                } else {
	                    int v1_20 = ((java.util.Set) v2_2.b.get(Integer.valueOf(p6)));
	                    if ((v1_20 != 0) && (!v1_20.contains(Integer.valueOf(p7)))) {
	                    } else {
	                        v1_22 = aft.c;
	                    }
	                }
	            } else {
	                v1_22 = aft.c;
	            }
	        }
	    }
	
	
	    public afs(int p15, String p16, String p17)
	    {
	        this(-1, p15, -1, p16, p17, 0, 0, 0, 0, 0, 0, 0, 0);
	        return;
	    }
	
	
	    afs(java.net.HttpURLConnection p16, Exception p17)
	    {
	        afq v14_1;
	        if (!(p17 instanceof afq)) {
	            v14_1 = new afq(p17);
	        } else {
	            v14_1 = ((afq) p17);
	        }
	        this(-1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, p16, v14_1);
	        return;
	    }
	
	
	    static afs a(org.json.JSONObject p14, Object p15, java.net.HttpURLConnection p16)
	    {
	        try {
	            afs v0_17;
	            if (!p14.has("code")) {
	                v0_17 = 0;
	            } else {
	                int v1 = p14.getInt("code");
	                int v9_0 = aji.a(p14, "body", "FACEBOOK_NON_JSON_RESULT");
	                if ((v9_0 != 0) && ((v9_0 instanceof org.json.JSONObject))) {
	                    int v9_1 = ((org.json.JSONObject) v9_0);
	                    int v4_0 = 0;
	                    int v5_0 = 0;
	                    int v7_0 = 0;
	                    int v6_0 = 0;
	                    int v8_0 = 0;
	                    int v2_1 = 0;
	                    int v3_0 = 0;
	                    afs v0_5 = 0;
	                    if (!v9_1.has("error")) {
	                        if ((v9_1.has("error_code")) || ((v9_1.has("error_msg")) || (v9_1.has("error_reason")))) {
	                            v4_0 = v9_1.optString("error_reason", 0);
	                            v5_0 = v9_1.optString("error_msg", 0);
	                            v2_1 = v9_1.optInt("error_code", -1);
	                            v3_0 = v9_1.optInt("error_subcode", -1);
	                            v0_5 = 1;
	                        }
	                    } else {
	                        afs v0_12 = ((org.json.JSONObject) aji.a(v9_1, "error", 0));
	                        v4_0 = v0_12.optString("type", 0);
	                        v5_0 = v0_12.optString("message", 0);
	                        v2_1 = v0_12.optInt("code", -1);
	                        v3_0 = v0_12.optInt("error_subcode", -1);
	                        v7_0 = v0_12.optString("error_user_msg", 0);
	                        v6_0 = v0_12.optString("error_user_title", 0);
	                        v8_0 = v0_12.optBoolean("is_transient", 0);
	                        v0_5 = 1;
	                    }
	                    if (v0_5 != null) {
	                        v0_17 = new afs(v1, v2_1, v3_0, v4_0, v5_0, v6_0, v7_0, v8_0, v9_1, p14, p15, p16, 0);
	                    }
	                }
	                afs v0_15;
	                afs v0_13 = afs.e;
	                if ((v0_13.a > v1) || (v1 > v0_13.b)) {
	                    v0_15 = 0;
	                } else {
	                    v0_15 = 1;
	                }
	                if (v0_15 != null) {
	                } else {
	                    int v9_4;
	                    if (!p14.has("body")) {
	                        v9_4 = 0;
	                    } else {
	                        v9_4 = ((org.json.JSONObject) aji.a(p14, "body", "FACEBOOK_NON_JSON_RESULT"));
	                    }
	                    v0_17 = new afs(v1, -1, -1, 0, 0, 0, 0, 0, v9_4, p14, p15, p16, 0);
	                }
	            }
	        } catch (afs v0) {
	        }
	        return v0_17;
	    }
	
	
	    private static declared_synchronized aiq b()
	    {
	        try {
	            aiq v0_2;
	            aiq v0_1 = aji.c(afv.h());
	        } catch (aiq v0_3) {
	            throw v0_3;
	        }
	        if (v0_1 != null) {
	            v0_2 = v0_1.b;
	        } else {
	            v0_2 = aiq.a();
	        }
	        return v0_2;
	    }
	
	
	    public final String a()
	    {
	        String v0_2;
	        if (this.g == null) {
	            v0_2 = this.d.getLocalizedMessage();
	        } else {
	            v0_2 = this.g;
	        }
	        return v0_2;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("{HttpStatus: ").append(this.a).append(", errorCode: ").append(this.b).append(", errorType: ").append(this.c).append(", errorMessage: ").append(this.a()).append("}").toString();
	    }
	
