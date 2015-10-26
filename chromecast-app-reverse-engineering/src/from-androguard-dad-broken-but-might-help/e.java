	private synthetic android.view.View a
	private synthetic f b
	private synthetic  c
	private synthetic java.lang.Object d
	private synthetic c e
	
	    e(c p1, android.view.View p2, f p3, int p4, Object p5)
	    {
	        this.e = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.d = p5;
	        return;
	    }
	
	
	    public final boolean onPreDraw()
	    {
	        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
	        c.a(this.e, this.b, this.c, this.d);
	        return 1;
	    }
	
