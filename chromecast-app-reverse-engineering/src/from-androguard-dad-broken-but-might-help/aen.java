	public  a
	public java.lang.String b
	public java.lang.String c
	public  d
	public  e
	public  f
	public  g
	public java.util.Map h
	
	    private aen()
	    {
	        return;
	    }
	
	
	    public aen(String p3, adh p4)
	    {
	        this.b = p3;
	        this.a = ((long) p4.a.length);
	        this.c = p4.b;
	        this.d = p4.c;
	        this.e = p4.d;
	        this.f = p4.e;
	        this.g = p4.f;
	        this.h = p4.g;
	        return;
	    }
	
	
	    public static aen a(java.io.InputStream p4)
	    {
	        java.io.IOException v0_1 = new aen();
	        if (aem.a(p4) == 538247942) {
	            v0_1.b = aem.c(p4);
	            v0_1.c = aem.c(p4);
	            if (v0_1.c.equals("")) {
	                v0_1.c = 0;
	            }
	            v0_1.d = aem.b(p4);
	            v0_1.e = aem.b(p4);
	            v0_1.f = aem.b(p4);
	            v0_1.g = aem.b(p4);
	            v0_1.h = aem.d(p4);
	            return v0_1;
	        } else {
	            throw new java.io.IOException();
	        }
	    }
	
	
	    public final boolean a(java.io.OutputStream p6)
	    {
	        try {
	            String v0_3;
	            aem.a(p6, 538247942);
	            aem.a(p6, this.b);
	        } catch (String v0_12) {
	            Object[] v2_1 = new Object[1];
	            v2_1[0] = v0_12.toString();
	            aeg.b("%s", v2_1);
	            String v0_14 = 0;
	            return v0_14;
	        }
	        if (this.c != null) {
	            v0_3 = this.c;
	        } else {
	            v0_3 = "";
	        }
	        aem.a(p6, v0_3);
	        aem.a(p6, this.d);
	        aem.a(p6, this.e);
	        aem.a(p6, this.f);
	        aem.a(p6, this.g);
	        String v0_8 = this.h;
	        if (v0_8 == null) {
	            aem.a(p6, 0);
	        } else {
	            aem.a(p6, v0_8.size());
	            java.util.Iterator v4 = v0_8.entrySet().iterator();
	            while (v4.hasNext()) {
	                String v0_16 = ((java.util.Map$Entry) v4.next());
	                aem.a(p6, ((String) v0_16.getKey()));
	                aem.a(p6, ((String) v0_16.getValue()));
	            }
	        }
	        p6.flush();
	        v0_14 = 1;
	        return v0_14;
	    }
	
