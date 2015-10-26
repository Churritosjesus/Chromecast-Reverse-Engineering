	
	    ys(zh p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public final int a(android.view.View p4)
	    {
	        return ((p4.getTop() - zh.d(p4)) - ((zi) p4.getLayoutParams()).topMargin);
	    }
	
	
	    public final void a(int p5)
	    {
	        int v0_0 = this.a;
	        if (v0_0.e != null) {
	            android.support.v7.widget.RecyclerView v1_1 = v0_0.e;
	            int v2 = v1_1.c.a();
	            int v0_2 = 0;
	            while (v0_2 < v2) {
	                v1_1.c.b(v0_2).offsetTopAndBottom(p5);
	                v0_2++;
	            }
	        }
	        return;
	    }
	
	
	    public final int b()
	    {
	        return this.a.r();
	    }
	
	
	    public final int b(android.view.View p4)
	    {
	        return (((zi) p4.getLayoutParams()).bottomMargin + (p4.getBottom() + zh.e(p4)));
	    }
	
	
	    public final int c()
	    {
	        return (this.a.p() - this.a.t());
	    }
	
	
	    public final int c(android.view.View p4)
	    {
	        int v0_1 = ((zi) p4.getLayoutParams());
	        return (v0_1.bottomMargin + (zh.c(p4) + v0_1.topMargin));
	    }
	
	
	    public final int d()
	    {
	        return this.a.p();
	    }
	
	
	    public final int d(android.view.View p4)
	    {
	        int v0_1 = ((zi) p4.getLayoutParams());
	        return (v0_1.rightMargin + (zh.b(p4) + v0_1.leftMargin));
	    }
	
	
	    public final int e()
	    {
	        return ((this.a.p() - this.a.r()) - this.a.t());
	    }
	
	
	    public final int f()
	    {
	        return this.a.t();
	    }
	
