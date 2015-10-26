	public final  a
	public final dfy b
	public final dgc c
	public java.util.Date d
	public java.lang.String e
	public java.util.Date f
	public java.lang.String g
	public java.util.Date h
	public  i
	public  j
	public java.lang.String k
	public  l
	
	    public dgw(long p8, dfy p10, dgc p11)
	    {
	        this.l = -1;
	        this.a = p8;
	        this.b = p10;
	        this.c = p11;
	        if (p11 != null) {
	            dfo v1 = p11.f;
	            int v0 = 0;
	            int v2_2 = (v1.a.length / 2);
	            while (v0 < v2_2) {
	                boolean v3_0 = v1.a(v0);
	                long v4_0 = v1.b(v0);
	                if (!"Date".equalsIgnoreCase(v3_0)) {
	                    if (!"Expires".equalsIgnoreCase(v3_0)) {
	                        if (!"Last-Modified".equalsIgnoreCase(v3_0)) {
	                            if (!"ETag".equalsIgnoreCase(v3_0)) {
	                                if (!"Age".equalsIgnoreCase(v3_0)) {
	                                    if (!dhl.a.equalsIgnoreCase(v3_0)) {
	                                        if (dhl.b.equalsIgnoreCase(v3_0)) {
	                                            this.j = Long.parseLong(v4_0);
	                                        }
	                                    } else {
	                                        this.i = Long.parseLong(v4_0);
	                                    }
	                                } else {
	                                    this.l = a.c(v4_0, -1);
	                                }
	                            } else {
	                                this.k = v4_0;
	                            }
	                        } else {
	                            this.f = dhe.a(v4_0);
	                            this.g = v4_0;
	                        }
	                    } else {
	                        this.h = dhe.a(v4_0);
	                    }
	                } else {
	                    this.d = dhe.a(v4_0);
	                    this.e = v4_0;
	                }
	                v0++;
	            }
	        }
	        return;
	    }
	
	
	    public static boolean a(dfy p1)
	    {
	        if ((p1.a("If-Modified-Since") == null) && (p1.a("If-None-Match") == null)) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
