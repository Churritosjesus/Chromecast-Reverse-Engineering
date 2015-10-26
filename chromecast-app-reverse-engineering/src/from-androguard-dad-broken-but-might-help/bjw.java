	private synthetic  a
	private synthetic com.google.android.apps.chromecast.app.tutorial.TutorialActivity b
	
	    public bjw(com.google.android.apps.chromecast.app.tutorial.TutorialActivity p1, boolean p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onAnimationEnd(android.animation.Animator p3)
	    {
	        if (com.google.android.apps.chromecast.app.tutorial.TutorialActivity.a(this.b) == p3) {
	            com.google.android.apps.chromecast.app.tutorial.TutorialActivity.a(this.b, 0);
	            if (!this.a) {
	                this.b.g.setVisibility(4);
	            }
	        }
	        return;
	    }
	
