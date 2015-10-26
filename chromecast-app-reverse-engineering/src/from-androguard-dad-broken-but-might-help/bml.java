	private synthetic com.google.android.apps.chromecast.app.widget.OverlaidImageView a
	
	    public bml(com.google.android.apps.chromecast.app.widget.OverlaidImageView p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onAnimationUpdate(android.animation.ValueAnimator p4)
	    {
	        com.google.android.apps.chromecast.app.widget.OverlaidImageView.a(this.a, ((int) (p4.getAnimatedFraction() * 1132396544)));
	        this.a.invalidate();
	        return;
	    }
	
