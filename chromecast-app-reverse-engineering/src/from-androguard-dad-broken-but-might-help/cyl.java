	private static final java.lang.String b
	private static final java.lang.String c
	private static final java.lang.String d
	private final android.content.Context e
	
	    static cyl()
	    {
	        cyl.b = cip.t.toString();
	        cyl.c = cit.i.toString();
	        cyl.d = cit.j.toString();
	        return;
	    }
	
	
	    public cyl(android.content.Context p5)
	    {
	        String[] v1_1 = new String[1];
	        v1_1[0] = cyl.d;
	        this(cyl.b, v1_1);
	        this.e = p5;
	        return;
	    }
	
	
	    public final cje a(java.util.Map p4)
	    {
	        cje v0_8;
	        cje v0_2 = ((cje) p4.get(cyl.d));
	        if (v0_2 != null) {
	            cje v0_6;
	            String v1 = cyh.a(v0_2);
	            cje v0_5 = ((cje) p4.get(cyl.c));
	            if (v0_5 == null) {
	                v0_6 = 0;
	            } else {
	                v0_6 = cyh.a(v0_5);
	            }
	            cje v0_7 = cvr.a(this.e, v1, v0_6);
	            if (v0_7 == null) {
	                v0_8 = cyh.f();
	            } else {
	                v0_8 = cyh.a(v0_7);
	            }
	        } else {
	            v0_8 = cyh.f();
	        }
	        return v0_8;
	    }
	
	
	    public final boolean a()
	    {
	        return 1;
	    }
	
