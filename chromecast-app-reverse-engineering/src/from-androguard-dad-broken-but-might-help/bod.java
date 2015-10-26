	private  a
	private synthetic com.google.android.apps.chromecast.app.widget.SlidingTabLayout b
	
	    public bod(com.google.android.apps.chromecast.app.widget.SlidingTabLayout p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    public final void a(int p3)
	    {
	        if (this.a == 0) {
	            com.google.android.apps.chromecast.app.widget.SlidingTabLayout.a(this.b).a(p3, 0);
	            com.google.android.apps.chromecast.app.widget.SlidingTabLayout.a(this.b, p3, 0);
	        }
	        if (com.google.android.apps.chromecast.app.widget.SlidingTabLayout.b(this.b) != null) {
	            com.google.android.apps.chromecast.app.widget.SlidingTabLayout.b(this.b).a(p3);
	        }
	        return;
	    }
	
	
	    public final void a(int p3, float p4, int p5)
	    {
	        hx v0_2 = com.google.android.apps.chromecast.app.widget.SlidingTabLayout.a(this.b).getChildCount();
	        if ((v0_2 != null) && ((p3 >= 0) && (p3 < v0_2))) {
	            hx v0_8;
	            com.google.android.apps.chromecast.app.widget.SlidingTabLayout.a(this.b).a(p3, p4);
	            hx v0_7 = com.google.android.apps.chromecast.app.widget.SlidingTabLayout.a(this.b).getChildAt(p3);
	            if (v0_7 == null) {
	                v0_8 = 0;
	            } else {
	                v0_8 = ((int) (((float) v0_7.getWidth()) * p4));
	            }
	            com.google.android.apps.chromecast.app.widget.SlidingTabLayout.a(this.b, p3, v0_8);
	            if (com.google.android.apps.chromecast.app.widget.SlidingTabLayout.b(this.b) != null) {
	                com.google.android.apps.chromecast.app.widget.SlidingTabLayout.b(this.b).a(p3, p4, p5);
	            }
	        }
	        return;
	    }
	
	
	    public final void b(int p2)
	    {
	        this.a = p2;
	        if (com.google.android.apps.chromecast.app.widget.SlidingTabLayout.b(this.b) != null) {
	            com.google.android.apps.chromecast.app.widget.SlidingTabLayout.b(this.b).b(p2);
	        }
	        return;
	    }
	
