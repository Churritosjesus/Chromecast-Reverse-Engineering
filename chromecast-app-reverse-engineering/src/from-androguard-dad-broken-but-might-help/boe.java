	private synthetic com.google.android.apps.chromecast.app.widget.SlidingTabLayout a
	
	    public boe(com.google.android.apps.chromecast.app.widget.SlidingTabLayout p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p3)
	    {
	        int v0 = 0;
	        while (v0 < com.google.android.apps.chromecast.app.widget.SlidingTabLayout.a(this.a).getChildCount()) {
	            if (p3 != com.google.android.apps.chromecast.app.widget.SlidingTabLayout.a(this.a).getChildAt(v0)) {
	                v0++;
	            } else {
	                com.google.android.apps.chromecast.app.widget.SlidingTabLayout.c(this.a).a(v0);
	                if (com.google.android.apps.chromecast.app.widget.SlidingTabLayout.d(this.a) == null) {
	                    break;
	                }
	                com.google.android.apps.chromecast.app.widget.SlidingTabLayout.d(this.a).a(v0);
	                break;
	            }
	        }
	        return;
	    }
	
