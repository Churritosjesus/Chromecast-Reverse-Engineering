	private static final java.lang.String b
	private static final java.lang.String c
	
	    static cuj()
	    {
	        cuj.b = cit.f.toString();
	        cuj.c = cit.g.toString();
	        return;
	    }
	
	
	    public cuj(String p4)
	    {
	        String[] v0_1 = new String[2];
	        v0_1[0] = cuj.b;
	        v0_1[1] = cuj.c;
	        this(p4, v0_1);
	        return;
	    }
	
	
	    public final cje a(java.util.Map p5)
	    {
	        cje v1_0 = p5.values().iterator();
	        while (v1_0.hasNext()) {
	            if (((cje) v1_0.next()) == cyh.f()) {
	                cje v0_7 = cyh.a(Boolean.valueOf(0));
	            }
	            return v0_7;
	        }
	        cje v0_5;
	        cje v0_4 = ((cje) p5.get(cuj.b));
	        cje v1_3 = ((cje) p5.get(cuj.c));
	        if ((v0_4 != null) && (v1_3 != null)) {
	            v0_5 = this.a(v0_4, v1_3, p5);
	        } else {
	            v0_5 = 0;
	        }
	        v0_7 = cyh.a(Boolean.valueOf(v0_5));
	        return v0_7;
	    }
	
	
	    public final boolean a()
	    {
	        return 1;
	    }
	
	
	    public final bridge synthetic java.util.Set b()
	    {
	        return super.b();
	    }
	
	
	    public final bridge synthetic String c()
	    {
	        return super.c();
	    }
	
