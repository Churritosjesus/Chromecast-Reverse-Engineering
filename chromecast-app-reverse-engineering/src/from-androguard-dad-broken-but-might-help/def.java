	private static final def b
	private final java.util.List c
	
	    static def()
	    {
	        def v0_1 = new def();
	        def.b = v0_1;
	        v0_1.a = 0;
	        return;
	    }
	
	
	    public def()
	    {
	        this.c = new java.util.ArrayList();
	        return;
	    }
	
	
	    def(java.util.List p2)
	    {
	        this.c = new java.util.ArrayList(p2);
	        return;
	    }
	
	
	    public static def d()
	    {
	        return def.b;
	    }
	
	
	    public final void add(int p2, Object p3)
	    {
	        this.c();
	        this.c.add(p2, p3);
	        this.modCount = (this.modCount + 1);
	        return;
	    }
	
	
	    public final Object get(int p2)
	    {
	        return this.c.get(p2);
	    }
	
	
	    public final Object remove(int p3)
	    {
	        this.c();
	        Object v0_1 = this.c.remove(p3);
	        this.modCount = (this.modCount + 1);
	        return v0_1;
	    }
	
	
	    public final Object set(int p3, Object p4)
	    {
	        this.c();
	        Object v0_1 = this.c.set(p3, p4);
	        this.modCount = (this.modCount + 1);
	        return v0_1;
	    }
	
	
	    public final int size()
	    {
	        return this.c.size();
	    }
	
