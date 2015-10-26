	private synthetic com.google.android.apps.chromecast.app.mirror.CastScreenActivity a
	
	    public bbk(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.a.disconnectMirroring(0);
	        return;
	    }
	
	
	    public final void a(tz p1, uh p2)
	    {
	        return;
	    }
	
	
	    public final void a(uh p8)
	    {
	        com.google.android.apps.chromecast.app.mirror.CastScreenActivity.b(this.a);
	        com.google.android.apps.chromecast.app.mirror.CastScreenActivity.a(this.a, this.a.getString(b.ao), 0);
	        boolean v0_3 = com.google.android.apps.chromecast.app.mirror.CastScreenActivity.d(this.a);
	        android.content.SharedPreferences$Editor v1_3 = com.google.android.gms.cast.CastDevice.a(p8.m);
	        String v2_3 = com.google.android.apps.chromecast.app.mirror.CastScreenActivity.c(this.a);
	        if ((v0_3.c != null) && (v0_3.c.d())) {
	            bvc.c.startMirroring(v0_3.c, v1_3.b, v2_3).a(new bbq(v0_3, v1_3));
	        }
	        boolean v0_4 = com.google.android.apps.chromecast.app.SetupApplication.a();
	        if (1 != v0_4.d) {
	            v0_4.d = 1;
	            android.content.SharedPreferences$Editor v1_6 = v0_4.a.edit();
	            v1_6.putBoolean("CAST_SCREEN_LAUNCHED", v0_4.d);
	            v1_6.apply();
	        }
	        return;
	    }
	
	
	    public final void b(tz p1, uh p2)
	    {
	        return;
	    }
	
