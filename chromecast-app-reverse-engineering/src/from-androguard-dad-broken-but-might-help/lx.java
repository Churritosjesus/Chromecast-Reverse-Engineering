	private synthetic lw a
	
	    lx(lw p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onAnimationEnd(android.view.animation.Animation p4)
	    {
	        if (!lw.a(this.a)) {
	            lw.b(this.a).stop();
	            lw.e(this.a).setVisibility(8);
	            lw.a(this.a, 255);
	            if (!lw.f(this.a)) {
	                lw.a(this.a, (this.a.d - lw.g(this.a)), 1);
	            } else {
	                lw.a(this.a, 0);
	            }
	        } else {
	            lw.b(this.a).setAlpha(255);
	            lw.b(this.a).start();
	            if ((lw.c(this.a)) && (lw.d(this.a) != null)) {
	                lw.d(this.a).a();
	            }
	        }
	        lw.b(this.a, lw.e(this.a).getTop());
	        return;
	    }
	
	
	    public final void onAnimationRepeat(android.view.animation.Animation p1)
	    {
	        return;
	    }
	
	
	    public final void onAnimationStart(android.view.animation.Animation p1)
	    {
	        return;
	    }
	
