	private android.app.Activity a
	
	    mu(android.app.Activity p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final android.graphics.drawable.Drawable a()
	    {
	        android.content.res.TypedArray v0_0 = this.b();
	        int[] v2_1 = new int[1];
	        v2_1[0] = 16843531;
	        android.content.res.TypedArray v0_1 = v0_0.obtainStyledAttributes(0, v2_1, 16843470, 0);
	        android.graphics.drawable.Drawable v1_1 = v0_1.getDrawable(0);
	        v0_1.recycle();
	        return v1_1;
	    }
	
	
	    public final void a(int p2)
	    {
	        android.app.ActionBar v0_1 = this.a.getActionBar();
	        if (v0_1 != null) {
	            v0_1.setHomeActionContentDescription(p2);
	        }
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p2, int p3)
	    {
	        android.app.ActionBar v0_1 = this.a.getActionBar();
	        if (v0_1 != null) {
	            v0_1.setHomeAsUpIndicator(p2);
	            v0_1.setHomeActionContentDescription(p3);
	        }
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
	
