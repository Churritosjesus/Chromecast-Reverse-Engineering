	private static final java.lang.String b
	private static final java.lang.String c
	private static final java.lang.String d
	private static final java.lang.String e
	private static final java.lang.String f
	
	    static cwr()
	    {
	        cwr.b = cip.B.toString();
	        cwr.c = cit.f.toString();
	        cwr.d = cit.g.toString();
	        cwr.e = cit.s.toString();
	        cwr.f = cit.r.toString();
	        return;
	    }
	
	
	    public cwr()
	    {
	        String[] v1_1 = new String[2];
	        v1_1[0] = cwr.c;
	        v1_1[1] = cwr.d;
	        this(cwr.b, v1_1);
	        return;
	    }
	
	
	    public final cje a(java.util.Map p6)
	    {
	        cje v0_4;
	        cje v0_2 = ((cje) p6.get(cwr.c));
	        java.util.regex.Matcher v1_2 = ((cje) p6.get(cwr.d));
	        if ((v0_2 != null) && ((v0_2 != cyh.f()) && ((v1_2 != null) && (v1_2 != cyh.f())))) {
	            int v3_0 = 64;
	            if (cyh.d(((cje) p6.get(cwr.e))).booleanValue()) {
	                v3_0 = 66;
	            }
	            int v2_11;
	            int v2_10 = ((cje) p6.get(cwr.f));
	            if (v2_10 == 0) {
	                v2_11 = 1;
	            } else {
	                int v2_12 = cyh.c(v2_10);
	                if (v2_12 != cyh.b()) {
	                    v2_11 = v2_12.intValue();
	                    if (v2_11 < 0) {
	                        v0_4 = cyh.f();
	                        return v0_4;
	                    }
	                } else {
	                    v0_4 = cyh.f();
	                    return v0_4;
	                }
	            }
	            try {
	                cje v0_3 = 0;
	                java.util.regex.Matcher v1_5 = java.util.regex.Pattern.compile(cyh.a(v1_2), v3_0).matcher(cyh.a(v0_2));
	            } catch (cje v0) {
	                v0_4 = cyh.f();
	            }
	            if ((v1_5.find()) && (v1_5.groupCount() >= v2_11)) {
	                v0_3 = v1_5.group(v2_11);
	            }
	            if (v0_3 != null) {
	                v0_4 = cyh.a(v0_3);
	            } else {
	                v0_4 = cyh.f();
	            }
	        } else {
	            v0_4 = cyh.f();
	        }
	        return v0_4;
	    }
	
	
	    public final boolean a()
	    {
	        return 1;
	    }
	
