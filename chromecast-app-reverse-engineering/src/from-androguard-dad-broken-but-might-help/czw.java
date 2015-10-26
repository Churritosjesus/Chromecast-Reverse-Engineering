	private synthetic  a
	private synthetic com.google.android.libraries.view.pagingindicator.PagingIndicator b
	
	    public czw(com.google.android.libraries.view.pagingindicator.PagingIndicator p1, int p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onAnimationUpdate(android.animation.ValueAnimator p4)
	    {
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.a(this.b, this.a, p4.getAnimatedFraction());
	        return;
	    }
	
