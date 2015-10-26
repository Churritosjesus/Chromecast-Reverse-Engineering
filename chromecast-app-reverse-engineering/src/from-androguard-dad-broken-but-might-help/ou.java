	 se a
	  b
	public android.view.Window$Callback c
	 py d
	private  e
	private  f
	private java.util.ArrayList g
	private final java.lang.Runnable h
	private final wg i
	
	    public ou(android.support.v7.widget.Toolbar p3, CharSequence p4, android.view.Window$Callback p5)
	    {
	        this.g = new java.util.ArrayList();
	        this.h = new ov(this);
	        this.i = new ow(this);
	        this.a = new ti(p3, 0);
	        this.c = new pa(this, p5);
	        this.a.a(this.c);
	        p3.m = this.i;
	        this.a.a(p4);
	        return;
	    }
	
	
	    private void a(int p5, int p6)
	    {
	        this.a.a(((this.a.m() & (p6 ^ -1)) | (p5 & p6)));
	        return;
	    }
	
	
	    public final CharSequence a()
	    {
	        return this.a.e();
	    }
	
	
	    public final void a(int p3)
	    {
	        int v0_0;
	        se v1 = this.a;
	        if (p3 == 0) {
	            v0_0 = 0;
	        } else {
	            v0_0 = this.a.b().getText(p3);
	        }
	        v1.b(v0_0);
	        return;
	    }
	
	
	    public final void a(android.content.res.Configuration p1)
	    {
	        super.a(p1);
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p2)
	    {
	        this.a.a(p2);
	        return;
	    }
	
	
	    public final void a(CharSequence p2)
	    {
	        this.a.b(p2);
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        this.a(2, 2);
	        return;
	    }
	
	
	    public final boolean a(int p3, android.view.KeyEvent p4)
	    {
	        boolean v0 = 0;
	        android.view.Menu v1 = this.h();
	        if (v1 != null) {
	            v0 = v1.performShortcut(p3, p4, 0);
	        }
	        return v0;
	    }
	
	
	    public final int b()
	    {
	        return this.a.m();
	    }
	
	
	    public final void b(int p2)
	    {
	        this.a.c(p2);
	        return;
	    }
	
	
	    public final void b(CharSequence p2)
	    {
	        this.a.c(p2);
	        return;
	    }
	
	
	    public final void b(boolean p3)
	    {
	        int v0;
	        if (!p3) {
	            v0 = 0;
	        } else {
	            v0 = 4;
	        }
	        this.a(v0, 4);
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.a.d(0);
	        return;
	    }
	
	
	    public final void c(CharSequence p2)
	    {
	        this.a.a(p2);
	        return;
	    }
	
	
	    public final void c(boolean p1)
	    {
	        return;
	    }
	
	
	    public final void d()
	    {
	        this.a.d(8);
	        return;
	    }
	
	
	    public final void d(boolean p1)
	    {
	        return;
	    }
	
	
	    public final android.content.Context e()
	    {
	        return this.a.b();
	    }
	
	
	    public final void e(boolean p4)
	    {
	        if (p4 != this.f) {
	            this.f = p4;
	            int v1 = this.g.size();
	            int v0_2 = 0;
	            while (v0_2 < v1) {
	                this.g.get(v0_2);
	                v0_2++;
	            }
	        }
	        return;
	    }
	
	
	    public final boolean f()
	    {
	        this.a.a().removeCallbacks(this.h);
	        gt.a(this.a.a(), this.h);
	        return 1;
	    }
	
	
	    public final boolean g()
	    {
	        int v0_2;
	        if (!this.a.c()) {
	            v0_2 = 0;
	        } else {
	            this.a.d();
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    android.view.Menu h()
	    {
	        if (!this.e) {
	            this.a.a(new ox(this), new oy(this));
	            this.e = 1;
	        }
	        return this.a.o();
	    }
	
