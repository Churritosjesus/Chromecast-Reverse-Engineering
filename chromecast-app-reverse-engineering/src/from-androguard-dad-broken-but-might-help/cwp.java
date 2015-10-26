	private static final java.lang.String b
	private static final java.lang.String c
	private static final java.lang.String d
	
	    static cwp()
	    {
	        cwp.b = cip.o.toString();
	        cwp.c = cit.A.toString();
	        cwp.d = cit.z.toString();
	        return;
	    }
	
	
	    public cwp()
	    {
	        String[] v1_1 = new String[0];
	        this(cwp.b, v1_1);
	        return;
	    }
	
	
	    public final cje a(java.util.Map p10)
	    {
	        double v2_1;
	        double v0_4;
	        double v0_2 = ((cje) p10.get(cwp.c));
	        cyg v1_2 = ((cje) p10.get(cwp.d));
	        if ((v0_2 == 0) || ((v0_2 == cyh.f()) || ((v1_2 == null) || (v1_2 == cyh.f())))) {
	            v0_4 = 2147483647.0;
	            v2_1 = 0;
	        } else {
	            double v0_3 = cyh.b(v0_2);
	            cyg v1_3 = cyh.b(v1_2);
	            if ((v0_3 == cyh.d()) || (v1_3 == cyh.d())) {
	            } else {
	                double v4_4 = v0_3.doubleValue();
	                v0_4 = v1_3.doubleValue();
	                if (v4_4 > v0_4) {
	                } else {
	                    v2_1 = v4_4;
	                }
	            }
	        }
	        return cyh.a(Long.valueOf(Math.round((((v0_4 - v2_1) * Math.random()) + v2_1))));
	    }
	
	
	    public final boolean a()
	    {
	        return 0;
	    }
	
