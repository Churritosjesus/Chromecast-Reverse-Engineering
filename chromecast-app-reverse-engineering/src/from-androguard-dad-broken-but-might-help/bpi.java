	private static java.text.DecimalFormat a
	private final brb b
	private final java.lang.String c
	private final android.net.Uri e
	
	    public bpi(brb p3, String p4)
	    {
	        this(p3, p4, 1, 0);
	        return;
	    }
	
	
	    private bpi(brb p2, String p3, boolean p4, boolean p5)
	    {
	        this(p2);
	        a.f(p3);
	        this.b = p2;
	        this.c = p3;
	        this.e = bpi.a(this.c);
	        return;
	    }
	
	
	    public static android.net.Uri a(String p2)
	    {
	        a.f(p2);
	        android.net.Uri v0_1 = new android.net.Uri$Builder();
	        v0_1.scheme("uri");
	        v0_1.authority("google-analytics.com");
	        v0_1.path(p2);
	        return v0_1.build();
	    }
	
	
	    private static String a(double p2)
	    {
	        if (bpi.a == null) {
	            bpi.a = new java.text.DecimalFormat("0.######");
	        }
	        return bpi.a.format(p2);
	    }
	
	
	    private static void a(java.util.Map p2, String p3, double p4)
	    {
	        if (p4 != 0) {
	            p2.put(p3, bpi.a(p4));
	        }
	        return;
	    }
	
	
	    private static void a(java.util.Map p2, String p3, int p4, int p5)
	    {
	        if ((p4 > 0) && (p5 > 0)) {
	            p2.put(p3, new StringBuilder().append(p4).append("x").append(p5).toString());
	        }
	        return;
	    }
	
	
	    private static void a(java.util.Map p1, String p2, String p3)
	    {
	        if (!android.text.TextUtils.isEmpty(p3)) {
	            p1.put(p2, p3);
	        }
	        return;
	    }
	
	
	    private static void a(java.util.Map p1, String p2, boolean p3)
	    {
	        if (p3) {
	            p1.put(p2, "1");
	        }
	        return;
	    }
	
	
	    private static java.util.Map b(cou p11)
	    {
	        java.util.HashMap v5_1 = new java.util.HashMap();
	        int v0_2 = ((bpx) p11.a(bpx));
	        if (v0_2 != 0) {
	            int v4_0 = java.util.Collections.unmodifiableMap(v0_2.a).entrySet().iterator();
	            while (v4_0.hasNext()) {
	                int v0_89;
	                Object v1_76 = ((java.util.Map$Entry) v4_0.next());
	                int v0_88 = v1_76.getValue();
	                if (v0_88 != 0) {
	                    if (!(v0_88 instanceof String)) {
	                        if (!(v0_88 instanceof Double)) {
	                            if (!(v0_88 instanceof Boolean)) {
	                                v0_89 = String.valueOf(v0_88);
	                            } else {
	                                if (v0_88 == Boolean.FALSE) {
	                                    v0_89 = 0;
	                                } else {
	                                    v0_89 = "1";
	                                }
	                            }
	                        } else {
	                            int v0_90 = ((Double) v0_88);
	                            if (v0_90.doubleValue() == 0) {
	                                v0_89 = 0;
	                            } else {
	                                v0_89 = bpi.a(v0_90.doubleValue());
	                            }
	                        }
	                    } else {
	                        v0_89 = ((String) v0_88);
	                        if (android.text.TextUtils.isEmpty(v0_89)) {
	                            v0_89 = 0;
	                        }
	                    }
	                } else {
	                    v0_89 = 0;
	                }
	                if (v0_89 != 0) {
	                    v5_1.put(v1_76.getKey(), v0_89);
	                }
	            }
	        }
	        int v0_9 = ((bpy) p11.a(bpy));
	        if (v0_9 != 0) {
	            bpi.a(v5_1, "t", v0_9.a);
	            bpi.a(v5_1, "cid", v0_9.b);
	            bpi.a(v5_1, "uid", v0_9.c);
	            bpi.a(v5_1, "sc", v0_9.f);
	            bpi.a(v5_1, "sf", v0_9.h);
	            bpi.a(v5_1, "ni", v0_9.g);
	            bpi.a(v5_1, "adid", v0_9.d);
	            bpi.a(v5_1, "ate", v0_9.e);
	        }
	        int v0_13 = ((cpk) p11.a(cpk));
	        if (v0_13 != 0) {
	            bpi.a(v5_1, "cd", v0_13.a);
	            bpi.a(v5_1, "a", ((double) v0_13.b));
	            bpi.a(v5_1, "dr", v0_13.c);
	        }
	        int v0_17 = ((cpi) p11.a(cpi));
	        if (v0_17 != 0) {
	            bpi.a(v5_1, "ec", v0_17.a);
	            bpi.a(v5_1, "ea", v0_17.b);
	            bpi.a(v5_1, "el", v0_17.c);
	            bpi.a(v5_1, "ev", ((double) v0_17.d));
	        }
	        int v0_20 = ((cpf) p11.a(cpf));
	        if (v0_20 != 0) {
	            bpi.a(v5_1, "cn", v0_20.a);
	            bpi.a(v5_1, "cs", v0_20.b);
	            bpi.a(v5_1, "cm", v0_20.c);
	            bpi.a(v5_1, "ck", v0_20.d);
	            bpi.a(v5_1, "cc", v0_20.e);
	            bpi.a(v5_1, "ci", v0_20.f);
	            bpi.a(v5_1, "anid", v0_20.g);
	            bpi.a(v5_1, "gclid", v0_20.h);
	            bpi.a(v5_1, "dclid", v0_20.i);
	            bpi.a(v5_1, "aclid", v0_20.j);
	        }
	        int v0_24 = ((cpj) p11.a(cpj));
	        if (v0_24 != 0) {
	            bpi.a(v5_1, "exd", v0_24.a);
	            bpi.a(v5_1, "exf", v0_24.b);
	        }
	        int v0_28 = ((cpl) p11.a(cpl));
	        if (v0_28 != 0) {
	            bpi.a(v5_1, "sn", v0_28.a);
	            bpi.a(v5_1, "sa", v0_28.b);
	            bpi.a(v5_1, "st", v0_28.c);
	        }
	        int v0_32 = ((cpm) p11.a(cpm));
	        if (v0_32 != 0) {
	            bpi.a(v5_1, "utv", v0_32.a);
	            bpi.a(v5_1, "utt", ((double) v0_32.b));
	            bpi.a(v5_1, "utc", v0_32.c);
	            bpi.a(v5_1, "utl", v0_32.d);
	        }
	        int v0_36 = ((bpv) p11.a(bpv));
	        if (v0_36 != 0) {
	            String v2_26 = java.util.Collections.unmodifiableMap(v0_36.a).entrySet().iterator();
	            while (v2_26.hasNext()) {
	                int v0_85 = ((java.util.Map$Entry) v2_26.next());
	                Object v1_74 = a.a("cd", ((Integer) v0_85.getKey()).intValue());
	                if (!android.text.TextUtils.isEmpty(v1_74)) {
	                    v5_1.put(v1_74, v0_85.getValue());
	                }
	            }
	        }
	        int v0_43 = ((bpw) p11.a(bpw));
	        if (v0_43 != 0) {
	            String v2_27 = java.util.Collections.unmodifiableMap(v0_43.a).entrySet().iterator();
	            while (v2_27.hasNext()) {
	                int v0_80 = ((java.util.Map$Entry) v2_27.next());
	                Object v1_70 = a.a("cm", ((Integer) v0_80.getKey()).intValue());
	                if (!android.text.TextUtils.isEmpty(v1_70)) {
	                    v5_1.put(v1_70, bpi.a(((Double) v0_80.getValue()).doubleValue()));
	                }
	            }
	        }
	        int v0_50 = ((cph) p11.a(cph));
	        if (v0_50 != 0) {
	            Object v1_34 = v0_50.d;
	            if (v1_34 != null) {
	                int v4_1 = v1_34.a().entrySet().iterator();
	                while (v4_1.hasNext()) {
	                    Object v1_64 = ((java.util.Map$Entry) v4_1.next());
	                    if (!((String) v1_64.getKey()).startsWith("&")) {
	                        v5_1.put(v1_64.getKey(), v1_64.getValue());
	                    } else {
	                        v5_1.put(((String) v1_64.getKey()).substring(1), v1_64.getValue());
	                    }
	                }
	            }
	            int v4_2 = java.util.Collections.unmodifiableList(v0_50.b).iterator();
	            String v2_28 = 1;
	            while (v4_2.hasNext()) {
	                v5_1.putAll(((bqb) v4_2.next()).a(a.a("promo", v2_28)));
	                v2_28++;
	            }
	            int v4_3 = java.util.Collections.unmodifiableList(v0_50.a).iterator();
	            String v2_29 = 1;
	            while (v4_3.hasNext()) {
	                v5_1.putAll(((bpz) v4_3.next()).a(a.a("pr", v2_29)));
	                v2_29++;
	            }
	            java.util.Iterator v6_6 = v0_50.c.entrySet().iterator();
	            int v4_4 = 1;
	            while (v6_6.hasNext()) {
	                Object v1_53 = ((java.util.Map$Entry) v6_6.next());
	                int v0_64 = ((java.util.List) v1_53.getValue());
	                String v7 = a.a("il", v4_4);
	                java.util.Iterator v8_0 = v0_64.iterator();
	                String v2_39 = 1;
	                while (v8_0.hasNext()) {
	                    v5_1.putAll(((bpz) v8_0.next()).a(new StringBuilder().append(v7).append(a.a("pi", v2_39)).toString()));
	                    v2_39++;
	                }
	                if (!android.text.TextUtils.isEmpty(((CharSequence) v1_53.getKey()))) {
	                    v5_1.put(new StringBuilder().append(v7).append("nm").toString(), v1_53.getKey());
	                }
	                v4_4++;
	            }
	        }
	        int v0_56 = ((cpg) p11.a(cpg));
	        if (v0_56 != 0) {
	            bpi.a(v5_1, "ul", v0_56.a);
	            bpi.a(v5_1, "sd", ((double) v0_56.b));
	            bpi.a(v5_1, "sr", v0_56.c, v0_56.d);
	            bpi.a(v5_1, "vp", v0_56.e, v0_56.f);
	        }
	        int v0_60 = ((cpe) p11.a(cpe));
	        if (v0_60 != 0) {
	            bpi.a(v5_1, "an", v0_60.a);
	            bpi.a(v5_1, "aid", v0_60.c);
	            bpi.a(v5_1, "aiid", v0_60.d);
	            bpi.a(v5_1, "av", v0_60.b);
	        }
	        return v5_1;
	    }
	
	
	    public final android.net.Uri a()
	    {
	        return this.e;
	    }
	
	
	    public final void a(cou p12)
	    {
	        a.c(p12);
	        a.b(p12.c, "Can\'t deliver not submitted measurement");
	        a.h("deliver should be called on worker thread");
	        java.util.Map v3_1 = p12.a();
	        int v5_1 = ((bpy) v3_1.b(bpy));
	        if (!android.text.TextUtils.isEmpty(v5_1.a)) {
	            if (!android.text.TextUtils.isEmpty(v5_1.b)) {
	                if (!this.b.d().e) {
	                    int v6_0 = v5_1.h;
	                    if (!bqs.a(v6_0, v5_1.b)) {
	                        java.util.Map v10 = bpi.b(v3_1);
	                        v10.put("v", "1");
	                        v10.put("_v", "ma4.5.0");
	                        v10.put("tid", this.c);
	                        if (!this.b.d().d) {
	                            java.util.HashMap v8_1 = new java.util.HashMap();
	                            bqs.a(v8_1, "uid", v5_1.c);
	                            bqu v0_22 = ((cpe) p12.a(cpe));
	                            if (v0_22 != null) {
	                                bqs.a(v8_1, "an", v0_22.a);
	                                bqs.a(v8_1, "aid", v0_22.c);
	                                bqs.a(v8_1, "av", v0_22.b);
	                                bqs.a(v8_1, "aiid", v0_22.d);
	                            }
	                            int v5_4;
	                            if (android.text.TextUtils.isEmpty(v5_1.d)) {
	                                v5_4 = 0;
	                            } else {
	                                v5_4 = 1;
	                            }
	                            v10.put("_s", String.valueOf(this.d.c().a(new bre(0, v5_1.b, this.c, v5_4, 0, v8_1))));
	                            this.d.c().a(new bsi(this.d.a(), v10, p12.d, 1));
	                        } else {
	                            bql v2_3 = new StringBuilder();
	                            java.util.Map v3_12 = v10.entrySet().iterator();
	                            while (v3_12.hasNext()) {
	                                bqu v0_35 = ((java.util.Map$Entry) v3_12.next());
	                                if (v2_3.length() != 0) {
	                                    v2_3.append(", ");
	                                }
	                                v2_3.append(((String) v0_35.getKey()));
	                                v2_3.append("=");
	                                v2_3.append(((String) v0_35.getValue()));
	                            }
	                            this.c("Dry run is enabled. GoogleAnalytics would have sent", v2_3.toString());
	                        }
	                    } else {
	                        this.b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(v6_0));
	                    }
	                }
	            } else {
	                this.d.a().a(bpi.b(v3_1), "Ignoring measurement without client id");
	            }
	        } else {
	            this.d.a().a(bpi.b(v3_1), "Ignoring measurement without type");
	        }
	        return;
	    }
	
