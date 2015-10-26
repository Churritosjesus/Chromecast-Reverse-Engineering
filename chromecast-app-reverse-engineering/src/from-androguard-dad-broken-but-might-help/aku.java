	private static final java.util.Set f
	private static bridge aku g
	public akg a
	public ajy b
	public akl c
	public java.util.HashMap d
	public akt e
	
	    static aku()
	    {
	        aku.f = java.util.Collections.unmodifiableSet(new akw());
	        return;
	    }
	
	
	    aku()
	    {
	        this.a = akg.a;
	        this.b = ajy.a;
	        ajp.b();
	        return;
	    }
	
	
	    public static aku a()
	    {
	        if (aku.g == null) {
	            if (aku.g == null) {
	                aku.g = new aku();
	            }
	        }
	        return aku.g;
	    }
	
	
	    public static boolean a(String p1)
	    {
	        if ((p1 == null) || ((!p1.startsWith("publish")) && ((!p1.startsWith("manage")) && (!aku.f.contains(p1))))) {
	            boolean v0_6 = 0;
	        } else {
	            v0_6 = 1;
	        }
	        return v0_6;
	    }
	
	
	    public static void b()
	    {
	        afb.a(0);
	        agt.a(0);
	        return;
	    }
	
	
	    public void a(akp p8, java.util.Map p9, Exception p10)
	    {
	        if (this.e != null) {
	            if (this.c != null) {
	                akt v4 = this.e;
	                String v1_0 = this.d;
	                android.os.Bundle v5 = akt.a(this.c.e);
	                if (p8 != null) {
	                    v5.putString("2_result", p8.d);
	                }
	                if ((p10 != null) && (p10.getMessage() != null)) {
	                    v5.putString("5_error_message", p10.getMessage());
	                }
	                String v0_8;
	                if (v1_0.isEmpty()) {
	                    v0_8 = 0;
	                } else {
	                    v0_8 = new org.json.JSONObject(v1_0);
	                }
	                if (p9 != null) {
	                    String v2_2;
	                    if (v0_8 != null) {
	                        v2_2 = v0_8;
	                    } else {
	                        v2_2 = new org.json.JSONObject();
	                    }
	                    try {
	                        java.util.Iterator v6 = p9.entrySet().iterator();
	                    } catch (String v0) {
	                        v0_8 = v2_2;
	                    }
	                    while (v6.hasNext()) {
	                        String v0_15 = ((java.util.Map$Entry) v6.next());
	                        v2_2.put(((String) v0_15.getKey()), v0_15.getValue());
	                    }
	                    v0_8 = v2_2;
	                }
	                if (v0_8 != null) {
	                    v5.putString("6_extras", v0_8.toString());
	                }
	                v4.a.a("fb_mobile_login_complete", 0, v5);
	            } else {
	                this.e.a("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", "");
	            }
	        }
	        return;
	    }
	
	
	    final boolean a(int p11, android.content.Intent p12, afo p13)
	    {
	        akz v1_0 = 0;
	        if (this.c != null) {
	            java.util.Set v5_0;
	            akz v1_1;
	            afq v0_1;
	            int v6_0;
	            int v3_1;
	            int v3_0 = akp.c;
	            if (p12 == null) {
	                if (p11 != 0) {
	                    v5_0 = v3_0;
	                    v6_0 = 0;
	                    v0_1 = 0;
	                    v3_1 = 0;
	                    v1_1 = 0;
	                } else {
	                    v1_1 = 0;
	                    v5_0 = akp.b;
	                    v6_0 = 0;
	                    v0_1 = 0;
	                    v3_1 = 1;
	                }
	            } else {
	                java.util.Set v5_1;
	                afq v0_5;
	                int v6_1;
	                afq v0_4 = ((akn) p12.getParcelableExtra("com.facebook.LoginFragment:Result"));
	                if (v0_4 == null) {
	                    v0_5 = 0;
	                    v5_1 = 0;
	                    v6_1 = 0;
	                } else {
	                    int v3_4;
	                    java.util.Set v5_2;
	                    if (p11 != -1) {
	                        if (p11 != 0) {
	                            v3_4 = 0;
	                            v5_2 = 0;
	                        } else {
	                            v1_0 = 1;
	                            v3_4 = 0;
	                            v5_2 = 0;
	                        }
	                    } else {
	                        if (v0_4.a != akp.a) {
	                            v5_2 = new afn(v0_4.c);
	                            v3_4 = 0;
	                        } else {
	                            v3_4 = v0_4.b;
	                            v5_2 = 0;
	                        }
	                    }
	                    v0_5 = v0_4.e;
	                    v6_1 = v5_2;
	                    v5_1 = v3_4;
	                    v3_0 = v0_4.a;
	                }
	                v1_1 = v0_5;
	                v0_1 = v6_1;
	                v6_0 = v5_1;
	                v5_0 = v3_0;
	                v3_1 = v1_0;
	            }
	            if ((v0_1 == null) && ((v6_0 == 0) && (v3_1 == 0))) {
	                v0_1 = new afq("Unexpected call to LoginManager.onActivityResult");
	            }
	            this.a(v5_0, v1_1, v0_1);
	            if (v6_0 != 0) {
	                afb.a(v6_0);
	                agt.b();
	            }
	            if (p13 != null) {
	                akz v1_2;
	                if (v6_0 == 0) {
	                    v1_2 = 0;
	                } else {
	                    akz v1_3 = this.c;
	                    java.util.Set v5_5 = v1_3.b;
	                    java.util.HashSet v7_2 = new java.util.HashSet(v6_0.b);
	                    if (v1_3.f) {
	                        v7_2.retainAll(v5_5);
	                    }
	                    java.util.HashSet v8_2 = new java.util.HashSet(v5_5);
	                    v8_2.removeAll(v7_2);
	                    v1_2 = new akz(v6_0, v7_2, v8_2);
	                }
	                if ((v3_1 == 0) && ((v1_2 == null) || (v1_2.b.size() != 0))) {
	                    if (v0_1 == null) {
	                        if (v6_0 != 0) {
	                            p13.a(v1_2);
	                        }
	                    } else {
	                        p13.a(v0_1);
	                    }
	                } else {
	                    p13.a();
	                }
	            }
	            this.c = 0;
	            this.e = 0;
	            v1_0 = 1;
	        }
	        return v1_0;
	    }
	
	
	    public boolean a(ala p6, akl p7)
	    {
	        int v2_7;
	        int v0 = 0;
	        android.content.Intent v3_1 = new android.content.Intent();
	        v3_1.setClass(afv.f(), com.facebook.FacebookActivity);
	        v3_1.setAction(p7.a.toString());
	        v3_1.putExtras(akq.a(p7));
	        if (afv.f().getPackageManager().resolveActivity(v3_1, 0) != null) {
	            v2_7 = 1;
	        } else {
	            v2_7 = 0;
	        }
	        if (v2_7 != 0) {
	            try {
	                p6.a(v3_1, akh.b());
	                v0 = 1;
	            } catch (android.content.ActivityNotFoundException v1) {
	            }
	        }
	        return v0;
	    }
	
