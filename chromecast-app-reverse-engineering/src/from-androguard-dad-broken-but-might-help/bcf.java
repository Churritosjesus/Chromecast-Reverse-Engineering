	
	    bcf(bcd p1)
	    {
	        return;
	    }
	
	
	    public final synthetic void a(Object p5)
	    {
	        com.google.android.apps.chromecast.app.SetupApplication v1_0 = com.google.android.apps.chromecast.app.SetupApplication.a();
	        android.content.Intent v0_0 = 0;
	        if (((ddf) p5).b != null) {
	            try {
	                v0_0 = android.content.Intent.parseUri(((ddf) p5).b, 1);
	            } catch (android.net.Uri v2) {
	            }
	        }
	        if ((v0_0 == null) || (v1_0.getPackageManager().resolveActivity(v0_0, 65536) == null)) {
	            v0_0 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(((ddf) p5).a));
	        }
	        v0_0.addFlags(268435456);
	        com.google.android.apps.chromecast.app.SetupApplication.a().startActivity(v0_0);
	        return;
	    }
	
