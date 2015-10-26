	
	    ig()
	    {
	        return;
	    }
	
	
	    public final void a(android.view.ViewParent p5, android.view.View p6)
	    {
	        try {
	            p5.onStopNestedScroll(p6);
	        } catch (AbstractMethodError v0) {
	            android.util.Log.e("ViewParentCompat", new StringBuilder("ViewParent ").append(p5).append(" does not implement interface method onStopNestedScroll").toString(), v0);
	        }
	        return;
	    }
	
	
	    public final void a(android.view.ViewParent p5, android.view.View p6, int p7, int p8, int p9, int p10)
	    {
	        try {
	            p5.onNestedScroll(p6, p7, p8, p9, p10);
	        } catch (AbstractMethodError v0) {
	            android.util.Log.e("ViewParentCompat", new StringBuilder("ViewParent ").append(p5).append(" does not implement interface method onNestedScroll").toString(), v0);
	        }
	        return;
	    }
	
	
	    public final void a(android.view.ViewParent p5, android.view.View p6, int p7, int p8, int[] p9)
	    {
	        try {
	            p5.onNestedPreScroll(p6, p7, p8, p9);
	        } catch (AbstractMethodError v0) {
	            android.util.Log.e("ViewParentCompat", new StringBuilder("ViewParent ").append(p5).append(" does not implement interface method onNestedPreScroll").toString(), v0);
	        }
	        return;
	    }
	
	
	    public final boolean a(android.view.ViewParent p2, android.view.View p3, float p4, float p5)
	    {
	        return a.a(p2, p3, p4, p5);
	    }
	
	
	    public final boolean a(android.view.ViewParent p2, android.view.View p3, float p4, float p5, boolean p6)
	    {
	        return a.a(p2, p3, p4, p5, p6);
	    }
	
	
	    public final boolean a(android.view.ViewParent p2, android.view.View p3, android.view.View p4, int p5)
	    {
	        return a.a(p2, p3, p4, p5);
	    }
	
	
	    public final void b(android.view.ViewParent p5, android.view.View p6, android.view.View p7, int p8)
	    {
	        try {
	            p5.onNestedScrollAccepted(p6, p7, p8);
	        } catch (AbstractMethodError v0) {
	            android.util.Log.e("ViewParentCompat", new StringBuilder("ViewParent ").append(p5).append(" does not implement interface method onNestedScrollAccepted").toString(), v0);
	        }
	        return;
	    }
	
