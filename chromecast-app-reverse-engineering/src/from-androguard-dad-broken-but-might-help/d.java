	private synthetic android.view.View a
	private synthetic java.lang.Object b
	private synthetic java.util.ArrayList c
	private synthetic f d
	private synthetic  e
	private synthetic j f
	private synthetic j g
	private synthetic c h
	
	    d(c p1, android.view.View p2, Object p3, java.util.ArrayList p4, f p5, boolean p6, j p7, j p8)
	    {
	        this.h = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.d = p5;
	        this.e = p6;
	        this.f = p7;
	        this.g = p8;
	        return;
	    }
	
	
	    public final boolean onPreDraw()
	    {
	        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
	        if (this.b != null) {
	            a.a(this.b, this.c);
	            this.c.clear();
	            ed v5 = c.a(this.h, this.d, this.e, this.f);
	            this.c.add(this.d.d);
	            this.c.addAll(v5.values());
	            a.b(this.b, this.c);
	            c.a(this.h, v5, this.d);
	            c.a(this.h, this.d, this.f, this.g, this.e, v5);
	        }
	        return 1;
	    }
	
