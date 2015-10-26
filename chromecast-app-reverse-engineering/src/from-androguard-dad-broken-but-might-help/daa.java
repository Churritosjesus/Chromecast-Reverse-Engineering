	private synthetic czy a
	
	    daa(czy p1, com.google.android.libraries.view.pagingindicator.PagingIndicator p2)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onAnimationUpdate(android.animation.ValueAnimator p6)
	    {
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.c(this.a.a, ((Float) p6.getAnimatedValue()).floatValue());
	        this.a.a.postInvalidateOnAnimation();
	        dac[] v1_1 = com.google.android.libraries.view.pagingindicator.PagingIndicator.h(this.a.a);
	        int v2 = v1_1.length;
	        int v0_8 = 0;
	        while (v0_8 < v2) {
	            v1_1[v0_8].a(com.google.android.libraries.view.pagingindicator.PagingIndicator.j(this.a.a));
	            v0_8++;
	        }
	        return;
	    }
	
