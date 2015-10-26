	public static final dke a
	public static final dke b
	public static final dke c
	public static final dke d
	public static final dke e
	public static final dke f
	public static final dke g
	public final dke h
	public final dke i
	final  j
	
	    static die()
	    {
	        die.a = dke.a(":status");
	        die.b = dke.a(":method");
	        die.c = dke.a(":path");
	        die.d = dke.a(":scheme");
	        die.e = dke.a(":authority");
	        die.f = dke.a(":host");
	        die.g = dke.a(":version");
	        return;
	    }
	
	
	    public die(dke p3, dke p4)
	    {
	        this.h = p3;
	        this.i = p4;
	        this.j = ((p3.b.length + 32) + p4.b.length);
	        return;
	    }
	
	
	    public die(dke p2, String p3)
	    {
	        this(p2, dke.a(p3));
	        return;
	    }
	
	
	    public die(String p3, String p4)
	    {
	        this(dke.a(p3), dke.a(p4));
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        int v0 = 0;
	        if (((p4 instanceof die)) && ((this.h.equals(((die) p4).h)) && (this.i.equals(((die) p4).i)))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        return (((this.h.hashCode() + 527) * 31) + this.i.hashCode());
	    }
	
	
	    public final String toString()
	    {
	        Object[] v1_1 = new Object[2];
	        v1_1[0] = this.h.a();
	        v1_1[1] = this.i.a();
	        return String.format("%s: %s", v1_1);
	    }
	
