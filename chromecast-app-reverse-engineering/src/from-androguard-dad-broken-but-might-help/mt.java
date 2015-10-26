	private android.app.Activity a
	private mw b
	
	    mt(android.app.Activity p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final android.graphics.drawable.Drawable a()
	    {
	        return mv.a(this.a);
	    }
	
	
	    public final void a(int p3)
	    {
	        this.b = mv.a(this.b, this.a, p3);
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p3, int p4)
	    {
	        this.a.getActionBar().setDisplayShowHomeEnabled(1);
	        this.b = mv.a(this.a, p3, p4);
	        this.a.getActionBar().setDisplayShowHomeEnabled(0);
	        return;
	    }
	
	
	    public final android.content.Context b()
	    {
	        android.app.Activity v0_2;
	        android.app.Activity v0_1 = this.a.getActionBar();
	        if (v0_1 == null) {
	            v0_2 = this.a;
	        } else {
	            v0_2 = v0_1.getThemedContext();
	        }
	        return v0_2;
	    }
	
	
	    public final boolean c()
	    {
	        int v0_4;
	        int v0_1 = this.a.getActionBar();
	        if ((v0_1 == 0) || ((v0_1.getDisplayOptions() & 4) == 0)) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
