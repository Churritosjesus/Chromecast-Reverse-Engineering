	private synthetic android.widget.Spinner a
	private synthetic com.google.android.apps.chromecast.app.DebugActivity b
	
	    public alg(com.google.android.apps.chromecast.app.DebugActivity p1, android.widget.Spinner p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onItemSelected(android.widget.AdapterView p3, android.view.View p4, int p5, long p6)
	    {
	        a.b(this.b, ((blm) this.a.getSelectedItem()).a);
	        com.google.android.apps.chromecast.app.SetupApplication.a().j();
	        return;
	    }
	
	
	    public final void onNothingSelected(android.widget.AdapterView p3)
	    {
	        a.b(this.b, 0);
	        com.google.android.apps.chromecast.app.SetupApplication.a().j();
	        return;
	    }
	
