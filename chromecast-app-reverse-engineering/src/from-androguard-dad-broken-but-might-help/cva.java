	private static final java.lang.String b
	private static final java.lang.String c
	private static final java.lang.String d
	private static final java.lang.String e
	private static final java.lang.String f
	
	    static cva()
	    {
	        cva.b = cip.v.toString();
	        cva.c = cit.f.toString();
	        cva.d = cit.D.toString();
	        cva.e = cit.t.toString();
	        cva.f = cit.E.toString();
	        return;
	    }
	
	
	    public cva()
	    {
	        String[] v1_1 = new String[1];
	        v1_1[0] = cva.c;
	        this(cva.b, v1_1);
	        return;
	    }
	
	
	    public final cje a(java.util.Map p6)
	    {
	        cje v0_31;
	        cje v0_2 = ((cje) p6.get(cva.c));
	        if ((v0_2 != null) && (v0_2 != cyh.f())) {
	            String v1_1;
	            String v4 = cyh.a(v0_2);
	            cje v0_5 = ((cje) p6.get(cva.e));
	            if (v0_5 != null) {
	                v1_1 = cyh.a(v0_5);
	            } else {
	                v1_1 = "text";
	            }
	            String v2_0;
	            cje v0_10 = ((cje) p6.get(cva.f));
	            if (v0_10 != null) {
	                v2_0 = cyh.a(v0_10);
	            } else {
	                v2_0 = "base16";
	            }
	            int v3 = 2;
	            cje v0_15 = ((cje) p6.get(cva.d));
	            if ((v0_15 != null) && (cyh.d(v0_15).booleanValue())) {
	                v3 = 3;
	            }
	            try {
	                cje v0_33;
	                if (!"text".equals(v1_1)) {
	                    if (!"base16".equals(v1_1)) {
	                        if (!"base64".equals(v1_1)) {
	                            if (!"base64url".equals(v1_1)) {
	                                cuh.a(new StringBuilder("Encode: unknown input format: ").append(v1_1).toString());
	                                v0_31 = cyh.f();
	                                return v0_31;
	                            } else {
	                                v0_33 = android.util.Base64.decode(v4, (v3 | 8));
	                            }
	                        } else {
	                            v0_33 = android.util.Base64.decode(v4, v3);
	                        }
	                    } else {
	                        v0_33 = a.m(v4);
	                    }
	                } else {
	                    v0_33 = v4.getBytes();
	                }
	            } catch (cje v0) {
	                cuh.a("Encode: invalid input:");
	                v0_31 = cyh.f();
	            }
	            cje v0_39;
	            if (!"base16".equals(v2_0)) {
	                if (!"base64".equals(v2_0)) {
	                    if (!"base64url".equals(v2_0)) {
	                        cuh.a(new StringBuilder("Encode: unknown output format: ").append(v2_0).toString());
	                        v0_31 = cyh.f();
	                        return v0_31;
	                    } else {
	                        v0_39 = android.util.Base64.encodeToString(v0_33, (v3 | 8));
	                    }
	                } else {
	                    v0_39 = android.util.Base64.encodeToString(v0_33, v3);
	                }
	            } else {
	                v0_39 = a.b(v0_33);
	            }
	            v0_31 = cyh.a(v0_39);
	        } else {
	            v0_31 = cyh.f();
	        }
	        return v0_31;
	    }
	
	
	    public final boolean a()
	    {
	        return 1;
	    }
	
