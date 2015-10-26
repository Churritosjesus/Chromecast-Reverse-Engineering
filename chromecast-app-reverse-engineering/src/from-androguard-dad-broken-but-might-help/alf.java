	private synthetic com.google.android.apps.chromecast.app.DebugActivity a
	
	    public alf(com.google.android.apps.chromecast.app.DebugActivity p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onItemSelected(android.widget.AdapterView p3, android.view.View p4, int p5, long p6)
	    {
	        a.a(this.a, ((String) bld.a.get(p5)));
	        com.google.android.apps.chromecast.app.SetupApplication.a().j();
	        return;
	    }
	
	
	    public final void onNothingSelected(android.widget.AdapterView p3)
	    {
	        a.a(this.a, 0);
	        com.google.android.apps.chromecast.app.SetupApplication.a().j();
	        return;
	    }
	
