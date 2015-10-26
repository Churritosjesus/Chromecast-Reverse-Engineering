	private synthetic java.lang.String a
	private synthetic com.google.android.apps.chromecast.app.DeviceSettingsActivity b
	
	    public alv(com.google.android.apps.chromecast.app.DeviceSettingsActivity p1, String p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void a()
	    {
	        android.widget.Toast v0_0 = this.b;
	        int v1_0 = this.a;
	        v0_0.i.b = v1_0;
	        android.widget.Toast v0_2 = com.google.android.apps.chromecast.app.SetupApplication.a().b().c(v0_0.h);
	        if (v0_2 != null) {
	            v0_2.c.b = v1_0;
	            v0_2.p();
	        }
	        android.widget.Toast.makeText(this.b, b.do, 0).show();
	        return;
	    }
	
	
	    public final void b()
	    {
	        if (com.google.android.apps.chromecast.app.DeviceSettingsActivity.a(this.b)) {
	            com.google.android.apps.chromecast.app.DeviceSettingsActivity.b(this.b).a(this.b.i.b);
	        }
	        return;
	    }
	
