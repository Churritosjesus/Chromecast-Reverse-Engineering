	
	    hc()
	    {
	        return;
	    }
	
	
	    public final ix a(android.view.View p3, ix p4)
	    {
	        if ((p4 instanceof iy)) {
	            android.view.WindowInsets v0_3 = ((iy) p4).a;
	            android.view.WindowInsets v1 = p3.onApplyWindowInsets(v0_3);
	            if (v1 != v0_3) {
	                p4 = new iy(v1);
	            }
	        }
	        return p4;
	    }
	
	
	    public final void a(android.view.View p2, gm p3)
	    {
	        p2.setOnApplyWindowInsetsListener(new he(p3));
	        return;
	    }
	
	
	    public final void f(android.view.View p1, float p2)
	    {
	        p1.setElevation(p2);
	        return;
	    }
	
	
	    public final void q(android.view.View p1)
	    {
	        p1.requestApplyInsets();
	        return;
	    }
	
	
	    public final void t(android.view.View p1)
	    {
	        p1.stopNestedScroll();
	        return;
	    }
	
