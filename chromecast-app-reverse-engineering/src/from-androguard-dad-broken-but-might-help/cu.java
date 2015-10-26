	private final java.lang.Object a
	private cv b
	private  c
	
	    public cu()
	    {
	        this.c = 0;
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            this.a = new cx(this);
	        } else {
	            this.a = new dg(new cw(this));
	        }
	        return;
	    }
	
	
	    static synthetic cv a(cu p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic void a(cu p2, android.os.Handler p3)
	    {
	        p2.b = new cv(p2, p3.getLooper());
	        return;
	    }
	
	
	    static synthetic boolean a(cu p0, boolean p1)
	    {
	        p0.c = p1;
	        return p1;
	    }
	
	
	    static synthetic boolean b(cu p1)
	    {
	        return p1.c;
	    }
	
	
	    static synthetic Object c(cu p1)
	    {
	        return p1.a;
	    }
	
	
	    public void a()
	    {
	        return;
	    }
	
	
	    public void a(ci p1)
	    {
	        return;
	    }
	
	
	    public void a(dq p1)
	    {
	        return;
	    }
	
	
	    public void binderDied()
	    {
	        this.a();
	        return;
	    }
	
