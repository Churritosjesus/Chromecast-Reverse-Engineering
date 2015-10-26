	final cow a
	public final cac b
	public  c
	public  d
	public  e
	public  f
	public  g
	final java.util.Map h
	public final java.util.List i
	private  j
	private  k
	
	    private cou(cou p5)
	    {
	        this.a = p5.a;
	        this.b = p5.b;
	        this.d = p5.d;
	        this.e = p5.e;
	        this.f = p5.f;
	        this.j = p5.j;
	        this.k = p5.k;
	        this.i = new java.util.ArrayList(p5.i);
	        this.h = new java.util.HashMap(p5.h.size());
	        java.util.Iterator v2 = p5.h.entrySet().iterator();
	        while (v2.hasNext()) {
	            Object v0_15 = ((java.util.Map$Entry) v2.next());
	            cov v3 = cou.c(((Class) v0_15.getKey()));
	            ((cov) v0_15.getValue()).a(v3);
	            this.h.put(v0_15.getKey(), v3);
	        }
	        return;
	    }
	
	
	    cou(cow p3, cac p4)
	    {
	        a.c(p3);
	        a.c(p4);
	        this.a = p3;
	        this.b = p4;
	        this.j = 1800000;
	        this.k = 1.494054513e-314;
	        this.h = new java.util.HashMap();
	        this.i = new java.util.ArrayList();
	        return;
	    }
	
	
	    private static cov c(Class p3)
	    {
	        try {
	            return ((cov) p3.newInstance());
	        } catch (IllegalAccessException v0_3) {
	            throw new IllegalArgumentException("dataType doesn\'t have default constructor", v0_3);
	        } catch (IllegalAccessException v0_2) {
	            throw new IllegalArgumentException("dataType default constructor is not accessible", v0_2);
	        }
	    }
	
	
	    public final cou a()
	    {
	        return new cou(this);
	    }
	
	
	    public final cov a(Class p2)
	    {
	        return ((cov) this.h.get(p2));
	    }
	
	
	    public final void a(cov p4)
	    {
	        a.c(p4);
	        cov v0_0 = p4.getClass();
	        if (v0_0.getSuperclass() == cov) {
	            p4.a(this.b(v0_0));
	            return;
	        } else {
	            throw new IllegalArgumentException();
	        }
	    }
	
	
	    public final cov b(Class p3)
	    {
	        cov v0_2 = ((cov) this.h.get(p3));
	        if (v0_2 == null) {
	            v0_2 = cou.c(p3);
	            this.h.put(p3, v0_2);
	        }
	        return v0_2;
	    }
	
	
	    public final cox b()
	    {
	        return this.a.g;
	    }
	
