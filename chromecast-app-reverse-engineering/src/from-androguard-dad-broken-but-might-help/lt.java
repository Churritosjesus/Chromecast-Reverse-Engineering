	
	    lt()
	    {
	        return;
	    }
	
	
	    public final Object a(android.content.Context p2, android.view.animation.Interpolator p3)
	    {
	        android.widget.Scroller v0_1;
	        if (p3 == null) {
	            v0_1 = new android.widget.Scroller(p2);
	        } else {
	            v0_1 = new android.widget.Scroller(p2, p3);
	        }
	        return v0_1;
	    }
	
	
	    public final void a(Object p7, int p8, int p9, int p10, int p11, int p12)
	    {
	        ((android.widget.Scroller) p7).startScroll(p8, p9, p10, p11, p12);
	        return;
	    }
	
	
	    public final void a(Object p10, int p11, int p12, int p13, int p14, int p15, int p16, int p17, int p18)
	    {
	        ((android.widget.Scroller) p10).fling(p11, p12, p13, p14, p15, p16, p17, p18);
	        return;
	    }
	
	
	    public final boolean a(Object p2)
	    {
	        return ((android.widget.Scroller) p2).isFinished();
	    }
	
	
	    public final int b(Object p2)
	    {
	        return ((android.widget.Scroller) p2).getCurrX();
	    }
	
	
	    public final int c(Object p2)
	    {
	        return ((android.widget.Scroller) p2).getCurrY();
	    }
	
	
	    public final float d(Object p2)
	    {
	        return 0;
	    }
	
	
	    public final boolean e(Object p2)
	    {
	        return ((android.widget.Scroller) p2).computeScrollOffset();
	    }
	
	
	    public final void f(Object p1)
	    {
	        ((android.widget.Scroller) p1).abortAnimation();
	        return;
	    }
	
	
	    public final int g(Object p2)
	    {
	        return ((android.widget.Scroller) p2).getFinalX();
	    }
	
	
	    public final int h(Object p2)
	    {
	        return ((android.widget.Scroller) p2).getFinalY();
	    }
	
