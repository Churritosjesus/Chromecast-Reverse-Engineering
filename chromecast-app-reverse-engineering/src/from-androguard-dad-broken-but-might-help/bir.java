	private synthetic com.google.android.apps.chromecast.app.setup.DeviceSetupActivity a
	
	    public bir(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(String p4)
	    {
	        bgv v0_2;
	        this.a.y();
	        if (android.text.TextUtils.isEmpty(p4)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        if (v0_2 == null) {
	            if (!this.a.isFinishing()) {
	                new bgv().a(this.a.b, 0);
	            }
	        } else {
	            this.a.a_(p4);
	        }
	        return;
	    }
	
