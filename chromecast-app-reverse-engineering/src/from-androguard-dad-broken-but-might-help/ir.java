	private synthetic iu a
	private synthetic android.view.View b
	
	    public ir(iu p1, android.view.View p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final void onAnimationCancel(android.animation.Animator p3)
	    {
	        this.a.c(this.b);
	        return;
	    }
	
	
	    public final void onAnimationEnd(android.animation.Animator p3)
	    {
	        this.a.b(this.b);
	        return;
	    }
	
	
	    public final void onAnimationStart(android.animation.Animator p3)
	    {
	        this.a.a(this.b);
	        return;
	    }
	
