	private android.content.Context c
	private android.support.v7.internal.widget.ActionBarContextView d
	private vs e
	private java.lang.ref.WeakReference f
	private  g
	private qa h
	
	    public pj(android.content.Context p3, android.support.v7.internal.widget.ActionBarContextView p4, vs p5, boolean p6)
	    {
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        qa v0_1 = new qa(p4.getContext());
	        v0_1.e = 1;
	        this.h = v0_1;
	        this.h.a(this);
	        return;
	    }
	
	
	    public final android.view.MenuInflater a()
	    {
	        return new android.view.MenuInflater(this.d.getContext());
	    }
	
	
	    public final void a(int p2)
	    {
	        this.b(this.c.getString(p2));
	        return;
	    }
	
	
	    public final void a(android.view.View p2)
	    {
	        int v0_1;
	        this.d.d(p2);
	        if (p2 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = new ref.WeakReference(p2);
	        }
	        this.f = v0_1;
	        return;
	    }
	
	
	    public final void a(CharSequence p2)
	    {
	        this.d.b(p2);
	        return;
	    }
	
	
	    public final void a(qa p2)
	    {
	        this.d();
	        this.d.a();
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        super.a(p2);
	        this.d.a(p2);
	        return;
	    }
	
	
	    public final boolean a(qa p2, android.view.MenuItem p3)
	    {
	        return this.e.a(this, p3);
	    }
	
	
	    public final android.view.Menu b()
	    {
	        return this.h;
	    }
	
	
	    public final void b(int p2)
	    {
	        this.a(this.c.getString(p2));
	        return;
	    }
	
	
	    public final void b(CharSequence p2)
	    {
	        this.d.a(p2);
	        return;
	    }
	
	
	    public final void c()
	    {
	        if (!this.g) {
	            this.g = 1;
	            this.d.sendAccessibilityEvent(32);
	            this.e.a(this);
	        }
	        return;
	    }
	
	
	    public final void d()
	    {
	        this.e.b(this, this.h);
	        return;
	    }
	
	
	    public final CharSequence f()
	    {
	        return this.d.g;
	    }
	
	
	    public final CharSequence g()
	    {
	        return this.d.h;
	    }
	
	
	    public final boolean h()
	    {
	        return this.d.j;
	    }
	
	
	    public final android.view.View i()
	    {
	        int v0_1;
	        if (this.f == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = ((android.view.View) this.f.get());
	        }
	        return v0_1;
	    }
	
