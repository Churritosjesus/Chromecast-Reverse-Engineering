	private static final java.lang.String b
	private static final java.lang.String c
	private static final java.lang.String d
	private static final java.lang.String e
	private static final java.lang.String f
	
	    static cvs()
	    {
	        cvs.b = cip.z.toString();
	        cvs.c = cit.f.toString();
	        cvs.d = cit.w.toString();
	        cvs.e = cit.x.toString();
	        cvs.f = cit.o.toString();
	        return;
	    }
	
	
	    public cvs()
	    {
	        String[] v1_1 = new String[1];
	        v1_1[0] = cvs.c;
	        this(cvs.b, v1_1);
	        return;
	    }
	
	
	    private static String a(String p5, int p6, java.util.Set p7)
	    {
	        switch (cvt.a[(p6 - 1)]) {
	            case 1:
	                try {
	                    p5 = a.l(p5);
	                } catch (String v0_9) {
	                    cuh.a("Joiner: unsupported encoding", v0_9);
	                }
	                break;
	            case 2:
	                String v0_3 = p5.replace("\\", "\\\\");
	                java.util.Iterator v2 = p7.iterator();
	                String v1_2 = v0_3;
	                while (v2.hasNext()) {
	                    String v0_7 = ((Character) v2.next()).toString();
	                    v1_2 = v1_2.replace(v0_7, new StringBuilder("\\").append(v0_7).toString());
	                }
	                p5 = v1_2;
	                break;
	        }
	        return p5;
	    }
	
	
	    private void a(StringBuilder p2, String p3, int p4, java.util.Set p5)
	    {
	        p2.append(cvs.a(p3, p4, p5));
	        return;
	    }
	
	
	    private static void a(java.util.Set p2, String p3)
	    {
	        int v0 = 0;
	        while (v0 < p3.length()) {
	            p2.add(Character.valueOf(p3.charAt(v0)));
	            v0++;
	        }
	        return;
	    }
	
	
	    public final cje a(java.util.Map p12)
	    {
	        int v0_7;
	        int v0_2 = ((cje) p12.get(cvs.c));
	        if (v0_2 != 0) {
	            String v2_0;
	            java.util.HashSet v1_2 = ((cje) p12.get(cvs.d));
	            if (v1_2 == null) {
	                v2_0 = "";
	            } else {
	                v2_0 = cyh.a(v1_2);
	            }
	            int v3_0;
	            java.util.HashSet v1_7 = ((cje) p12.get(cvs.e));
	            if (v1_7 == null) {
	                v3_0 = "=";
	            } else {
	                v3_0 = cyh.a(v1_7);
	            }
	            java.util.HashSet v1_13;
	            int v4_1;
	            java.util.HashSet v1_12 = ((cje) p12.get(cvs.f));
	            if (v1_12 == null) {
	                v1_13 = 0;
	                v4_1 = cvu.a;
	            } else {
	                java.util.HashSet v1_14 = cyh.a(v1_12);
	                if (!"url".equals(v1_14)) {
	                    if (!"backslash".equals(v1_14)) {
	                        cuh.a(new StringBuilder("Joiner: unsupported escape type: ").append(v1_14).toString());
	                        v0_7 = cyh.f();
	                        return v0_7;
	                    } else {
	                        v4_1 = cvu.c;
	                        v1_13 = new java.util.HashSet();
	                        cvs.a(v1_13, v2_0);
	                        cvs.a(v1_13, v3_0);
	                        v1_13.remove(Character.valueOf(92));
	                    }
	                } else {
	                    v4_1 = cvu.b;
	                    v1_13 = 0;
	                }
	            }
	            StringBuilder v7_1 = new StringBuilder();
	            switch (v0_2.a) {
	                case 2:
	                    int v3_1 = 1;
	                    int v5_7 = v0_2.c;
	                    String v8_3 = v5_7.length;
	                    int v0_8 = 0;
	                    while (v0_8 < v8_3) {
	                        int v9 = v5_7[v0_8];
	                        if (v3_1 == 0) {
	                            v7_1.append(v2_0);
	                        }
	                        this.a(v7_1, cyh.a(v9), v4_1, v1_13);
	                        v0_8++;
	                        v3_1 = 0;
	                    }
	                case 3:
	                    int v5_6 = 0;
	                    while (v5_6 < v0_2.d.length) {
	                        if (v5_6 > 0) {
	                            v7_1.append(v2_0);
	                        }
	                        String v6_5 = cyh.a(v0_2.d[v5_6]);
	                        String v8_2 = cyh.a(v0_2.e[v5_6]);
	                        this.a(v7_1, v6_5, v4_1, v1_13);
	                        v7_1.append(v3_0);
	                        this.a(v7_1, v8_2, v4_1, v1_13);
	                        v5_6++;
	                    }
	                    break;
	                default:
	                    this.a(v7_1, cyh.a(v0_2), v4_1, v1_13);
	            }
	            v0_7 = cyh.a(v7_1.toString());
	        } else {
	            v0_7 = cyh.f();
	        }
	        return v0_7;
	    }
	
	
	    public final boolean a()
	    {
	        return 1;
	    }
	
