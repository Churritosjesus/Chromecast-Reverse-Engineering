	private synthetic bmn a
	
	    bmr(bmn p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onProgressChanged(android.widget.SeekBar p5, int p6, boolean p7)
	    {
	        if (p7) {
	            aqj v0_1 = bmn.a(this.a);
	            double v2 = bmn.a(this.a, p6);
	            if (v0_1.o().d != null) {
	                aqj v0_2 = com.google.android.apps.chromecast.app.SetupApplication.a().j.a(v0_1);
	                if (v0_2 != null) {
	                    v0_2.a(v2);
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void onStartTrackingTouch(android.widget.SeekBar p1)
	    {
	        return;
	    }
	
	
	    public final void onStopTrackingTouch(android.widget.SeekBar p1)
	    {
	        return;
	    }
	
