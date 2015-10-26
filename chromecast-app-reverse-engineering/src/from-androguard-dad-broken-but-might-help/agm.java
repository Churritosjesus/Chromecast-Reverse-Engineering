	private static java.util.concurrent.atomic.AtomicInteger e
	 android.os.Handler a
	 java.util.List b
	final java.lang.String c
	 java.util.List d
	private  f
	
	    static agm()
	    {
	        agm.e = new java.util.concurrent.atomic.AtomicInteger();
	        return;
	    }
	
	
	    public agm()
	    {
	        this.b = new java.util.ArrayList();
	        this.f = 0;
	        this.c = Integer.valueOf(agm.e.incrementAndGet()).toString();
	        this.d = new java.util.ArrayList();
	        this.b = new java.util.ArrayList();
	        return;
	    }
	
	
	    public agm(java.util.Collection p2)
	    {
	        this.b = new java.util.ArrayList();
	        this.f = 0;
	        this.c = Integer.valueOf(agm.e.incrementAndGet()).toString();
	        this.d = new java.util.ArrayList();
	        this.b = new java.util.ArrayList(p2);
	        return;
	    }
	
	
	    public varargs agm(aga[] p2)
	    {
	        this.b = new java.util.ArrayList();
	        this.f = 0;
	        this.c = Integer.valueOf(agm.e.incrementAndGet()).toString();
	        this.d = new java.util.ArrayList();
	        this.b = java.util.Arrays.asList(p2);
	        return;
	    }
	
	
	    public final aga a(int p2)
	    {
	        return ((aga) this.b.get(p2));
	    }
	
	
	    public final synthetic void add(int p2, Object p3)
	    {
	        this.b.add(p2, ((aga) p3));
	        return;
	    }
	
	
	    public final synthetic boolean add(Object p2)
	    {
	        return this.b.add(((aga) p2));
	    }
	
	
	    public final void clear()
	    {
	        this.b.clear();
	        return;
	    }
	
	
	    public final synthetic Object get(int p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public final synthetic Object remove(int p2)
	    {
	        return ((aga) this.b.remove(p2));
	    }
	
	
	    public final synthetic Object set(int p2, Object p3)
	    {
	        return ((aga) this.b.set(p2, ((aga) p3)));
	    }
	
	
	    public final int size()
	    {
	        return this.b.size();
	    }
	
