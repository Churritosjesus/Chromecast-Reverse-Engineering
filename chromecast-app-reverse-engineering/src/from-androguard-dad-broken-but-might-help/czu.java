	private synthetic com.google.android.libraries.view.pagingindicator.PagingIndicator a
	
	    public czu(com.google.android.libraries.view.pagingindicator.PagingIndicator p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onAnimationUpdate(android.animation.ValueAnimator p3)
	    {
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.a(this.a, ((Float) p3.getAnimatedValue()).floatValue());
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.c(this.a).a(com.google.android.libraries.view.pagingindicator.PagingIndicator.b(this.a));
	        this.a.postInvalidateOnAnimation();
	        return;
	    }
	
