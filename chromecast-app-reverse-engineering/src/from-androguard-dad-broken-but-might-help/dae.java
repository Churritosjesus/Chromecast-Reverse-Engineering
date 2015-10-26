	private synthetic dac a
	
	    dae(dac p1, com.google.android.libraries.view.pagingindicator.PagingIndicator p2)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onAnimationEnd(android.animation.Animator p4)
	    {
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.b(this.a.a, dac.a(this.a), 0);
	        this.a.a.postInvalidateOnAnimation();
	        return;
	    }
	
