	public qe a
	private qa b
	private synthetic android.support.v7.widget.Toolbar c
	
	    public aar(android.support.v7.widget.Toolbar p1)
	    {
	        this.c = p1;
	        return;
	    }
	
	
	    public final void a(android.content.Context p3, qa p4)
	    {
	        if ((this.b != null) && (this.a != null)) {
	            this.b.b(this.a);
	        }
	        this.b = p4;
	        return;
	    }
	
	
	    public final void a(qa p1, boolean p2)
	    {
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        return 0;
	    }
	
	
	    public final boolean a(qu p2)
	    {
	        return 0;
	    }
	
	
	    public final void b(boolean p6)
	    {
	        int v0_0 = 0;
	        if (this.a != null) {
	            if (this.b != null) {
	                int v2 = this.b.size();
	                int v1_3 = 0;
	                while (v1_3 < v2) {
	                    if (this.b.getItem(v1_3) != this.a) {
	                        v1_3++;
	                    } else {
	                        v0_0 = 1;
	                        break;
	                    }
	                }
	            }
	            if (v0_0 == 0) {
	                this.c(this.a);
	            }
	        }
	        return;
	    }
	
	
	    public final boolean b(qe p5)
	    {
	        android.support.v7.widget.Toolbar.b(this.c);
	        if (android.support.v7.widget.Toolbar.c(this.c).getParent() != this.c) {
	            this.c.addView(android.support.v7.widget.Toolbar.c(this.c));
	        }
	        this.c.e = p5.getActionView();
	        this.a = p5;
	        if (this.c.e.getParent() != this.c) {
	            vt v0_9 = android.support.v7.widget.Toolbar.g();
	            v0_9.a = (8388611 | (android.support.v7.widget.Toolbar.d(this.c) & 112));
	            v0_9.b = 2;
	            this.c.e.setLayoutParams(v0_9);
	            this.c.addView(this.c.e);
	        }
	        android.support.v7.widget.Toolbar.a(this.c, 1);
	        this.c.requestLayout();
	        p5.e(1);
	        if ((this.c.e instanceof vt)) {
	            ((vt) this.c.e).a();
	        }
	        return 1;
	    }
	
	
	    public final boolean c(qe p5)
	    {
	        if ((this.c.e instanceof vt)) {
	            ((vt) this.c.e).b();
	        }
	        this.c.removeView(this.c.e);
	        this.c.removeView(android.support.v7.widget.Toolbar.c(this.c));
	        this.c.e = 0;
	        android.support.v7.widget.Toolbar.a(this.c, 0);
	        this.a = 0;
	        this.c.requestLayout();
	        p5.e(0);
	        return 1;
	    }
	
