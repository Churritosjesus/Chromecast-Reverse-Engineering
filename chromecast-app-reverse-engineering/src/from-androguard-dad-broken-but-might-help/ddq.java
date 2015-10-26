	private static final  serialVersionUID
	public dek h
	public  i
	
	    public ddq()
	    {
	        this.h = dek.a();
	        this.i = -1;
	        return;
	    }
	
	
	    static ddq a(ddq p2, ddn p3, ddp p4)
	    {
	        try {
	            return ((ddq) p2.a(ddt.b, p3, p4));
	        } catch (ddx v0_3) {
	            if (!(v0_3.getCause() instanceof ddx)) {
	                throw v0_3;
	            } else {
	                throw ((ddx) v0_3.getCause());
	            }
	        }
	    }
	
	
	    public static ddw a(java.util.List p1)
	    {
	        return new def(p1);
	    }
	
	
	    protected static final boolean a(ddq p4, boolean p5)
	    {
	        int v0 = 0;
	        if (p4.a(ddt.a, Boolean.valueOf(0), 0) != null) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    protected final Object a(int p2)
	    {
	        return this.a(p2, 0, 0);
	    }
	
	
	    protected final Object a(int p2, Object p3)
	    {
	        return this.a(p2, p3, 0);
	    }
	
	
	    public final void a(dek p2)
	    {
	        this.h = dek.a(this.h, p2);
	        return;
	    }
	
	
	    public final dee f()
	    {
	        return ((dee) this.a(ddt.h, 0, 0));
	    }
	
	
	    public final ddr g()
	    {
	        return ((ddr) this.a(ddt.f, 0, 0));
	    }
	
	
	    public final boolean h()
	    {
	        int v0_2;
	        if (this.a(ddt.a, Boolean.TRUE, 0) == null) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final ddr i()
	    {
	        ddr v0_2 = ((ddr) this.a(ddt.f, 0, 0));
	        v0_2.a(this);
	        return v0_2;
	    }
	
	
	    public final synthetic deb j()
	    {
	        return this.g();
	    }
	
	
	    protected Object writeReplace()
	    {
	        return new ddu(this);
	    }
	
