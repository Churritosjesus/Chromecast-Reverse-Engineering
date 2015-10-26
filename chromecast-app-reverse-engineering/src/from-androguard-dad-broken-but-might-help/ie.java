	
	    ie()
	    {
	        return;
	    }
	
	
	    public void a(android.view.ViewParent p2, android.view.View p3)
	    {
	        if ((p2 instanceof gk)) {
	            ((gk) p2).onStopNestedScroll(p3);
	        }
	        return;
	    }
	
	
	    public void a(android.view.ViewParent p7, android.view.View p8, int p9, int p10, int p11, int p12)
	    {
	        if ((p7 instanceof gk)) {
	            ((gk) p7).onNestedScroll(p8, p9, p10, p11, p12);
	        }
	        return;
	    }
	
	
	    public void a(android.view.ViewParent p2, android.view.View p3, int p4, int p5, int[] p6)
	    {
	        if ((p2 instanceof gk)) {
	            ((gk) p2).onNestedPreScroll(p3, p4, p5, p6);
	        }
	        return;
	    }
	
	
	    public boolean a(android.view.ViewParent p2, android.view.View p3, float p4, float p5)
	    {
	        int v0_1;
	        if (!(p2 instanceof gk)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = ((gk) p2).onNestedPreFling(p3, p4, p5);
	        }
	        return v0_1;
	    }
	
	
	    public boolean a(android.view.ViewParent p2, android.view.View p3, float p4, float p5, boolean p6)
	    {
	        int v0_1;
	        if (!(p2 instanceof gk)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = ((gk) p2).onNestedFling(p3, p4, p5, p6);
	        }
	        return v0_1;
	    }
	
	
	    public boolean a(android.view.ViewParent p2, android.view.View p3, android.view.View p4, int p5)
	    {
	        int v0_1;
	        if (!(p2 instanceof gk)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = ((gk) p2).onStartNestedScroll(p3, p4, p5);
	        }
	        return v0_1;
	    }
	
	
	    public void b(android.view.ViewParent p2, android.view.View p3, android.view.View p4, int p5)
	    {
	        if ((p2 instanceof gk)) {
	            ((gk) p2).onNestedScrollAccepted(p3, p4, p5);
	        }
	        return;
	    }
	
