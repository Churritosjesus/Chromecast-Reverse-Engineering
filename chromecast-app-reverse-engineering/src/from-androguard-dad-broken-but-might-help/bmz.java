	private synthetic android.content.Intent a
	
	    bmz(bmu p1, android.content.Intent p2)
	    {
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p3)
	    {
	        this.a.addFlags(268435456);
	        com.google.android.apps.chromecast.app.SetupApplication.a().startActivity(this.a);
	        return;
	    }
	
