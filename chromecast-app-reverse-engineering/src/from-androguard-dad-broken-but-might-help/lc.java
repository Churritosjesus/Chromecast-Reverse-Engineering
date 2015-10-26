	private static final lf b
	private java.lang.Object a
	
	    static lc()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            if (android.os.Build$VERSION.SDK_INT < 14) {
	                lc.b = new ld();
	            } else {
	                lc.b = new le();
	            }
	        } else {
	            lc.b = new lg();
	        }
	        return;
	    }
	
	
	    public lc(android.content.Context p2)
	    {
	        this.a = lc.b.a(p2);
	        return;
	    }
	
	
	    public final void a(int p3, int p4)
	    {
	        lc.b.a(this.a, p3, p4);
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        return lc.b.a(this.a);
	    }
	
	
	    public final boolean a(float p3)
	    {
	        return lc.b.a(this.a, p3);
	    }
	
	
	    public final boolean a(float p3, float p4)
	    {
	        return lc.b.a(this.a, p3, p4);
	    }
	
	
	    public final boolean a(int p3)
	    {
	        return lc.b.a(this.a, p3);
	    }
	
	
	    public final boolean a(android.graphics.Canvas p3)
	    {
	        return lc.b.a(this.a, p3);
	    }
	
	
	    public final void b()
	    {
	        lc.b.b(this.a);
	        return;
	    }
	
	
	    public final boolean c()
	    {
	        return lc.b.c(this.a);
	    }
	
