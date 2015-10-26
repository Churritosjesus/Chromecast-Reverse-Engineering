	private static final java.lang.String b
	private static final java.lang.String c
	private static final java.lang.String d
	private static final java.lang.String e
	
	    static cvj()
	    {
	        cvj.b = cip.x.toString();
	        cvj.c = cit.f.toString();
	        cvj.d = cit.c.toString();
	        cvj.e = cit.t.toString();
	        return;
	    }
	
	
	    public cvj()
	    {
	        String[] v1_1 = new String[1];
	        v1_1[0] = cvj.c;
	        this(cvj.b, v1_1);
	        return;
	    }
	
	
	    public final cje a(java.util.Map p5)
	    {
	        cje v0_14;
	        cje v0_2 = ((cje) p5.get(cvj.c));
	        if ((v0_2 != null) && (v0_2 != cyh.f())) {
	            StringBuilder v1_1;
	            String v2_0 = cyh.a(v0_2);
	            cje v0_5 = ((cje) p5.get(cvj.d));
	            if (v0_5 != null) {
	                v1_1 = cyh.a(v0_5);
	            } else {
	                v1_1 = "MD5";
	            }
	            cje v0_11;
	            cje v0_10 = ((cje) p5.get(cvj.e));
	            if (v0_10 != null) {
	                v0_11 = cyh.a(v0_10);
	            } else {
	                v0_11 = "text";
	            }
	            cje v0_15;
	            if (!"text".equals(v0_11)) {
	                if (!"base16".equals(v0_11)) {
	                    cuh.a(new StringBuilder("Hash: unknown input format: ").append(v0_11).toString());
	                    v0_14 = cyh.f();
	                    return v0_14;
	                } else {
	                    v0_15 = a.m(v2_0);
	                }
	            } else {
	                v0_15 = v2_0.getBytes();
	            }
	            try {
	                String v2_2 = java.security.MessageDigest.getInstance(v1_1);
	                v2_2.update(v0_15);
	                v0_14 = cyh.a(a.b(v2_2.digest()));
	            } catch (cje v0) {
	                cuh.a(new StringBuilder("Hash: unknown algorithm: ").append(v1_1).toString());
	                v0_14 = cyh.f();
	            }
	        } else {
	            v0_14 = cyh.f();
	        }
	        return v0_14;
	    }
	
	
	    public final boolean a()
	    {
	        return 1;
	    }
	
