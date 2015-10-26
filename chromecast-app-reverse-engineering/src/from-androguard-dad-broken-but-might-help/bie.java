	private synthetic bhf a
	
	    bie(bhf p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p4)
	    {
	        if (!bhf.a(this.a).g.b) {
	            bhf.a(this.a);
	            if ((!com.google.android.apps.chromecast.app.DeviceSettingsActivity.n()) || (!bhf.a(this.a).g.r())) {
	                bhf.a(this.a).m();
	            } else {
	                bhf.a(this.a).b(bhf.a(this.a).g.t().b, "backdropSettingsFragment");
	            }
	        } else {
	            blx.a(this.a.y, 0);
	        }
	        return;
	    }
	
