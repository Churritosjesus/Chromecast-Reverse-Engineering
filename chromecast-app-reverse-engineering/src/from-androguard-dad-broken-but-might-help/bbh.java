	private synthetic com.google.android.apps.chromecast.app.mirror.CastScreenActivity a
	
	    public bbh(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onReceive(android.content.Context p4, android.content.Intent p5)
	    {
	        if (p5.getIntExtra("wifi_state", 4) == 3) {
	            this.a.unregisterReceiver(this);
	            if ((com.google.android.apps.chromecast.app.mirror.CastScreenActivity.d(this.a).a()) && ((!com.google.android.apps.chromecast.app.mirror.CastScreenActivity.d(this.a).b()) && (com.google.android.apps.chromecast.app.mirror.CastScreenActivity.g(this.a)))) {
	                com.google.android.apps.chromecast.app.mirror.CastScreenActivity.b(this.a, 0);
	                com.google.android.apps.chromecast.app.mirror.CastScreenActivity.h(this.a);
	                com.google.android.apps.chromecast.app.mirror.CastScreenActivity.a(this.a, 0);
	            }
	        }
	        return;
	    }
	
