	private aea n
	
	    public bbc(das p5, aea p6, adz p7)
	    {
	        this("BrowseContent", com.google.android.apps.chromecast.app.SetupApplication.b("/browse/apps"), das.a(p5), p7);
	        this.i = new aec(blf.x(com.google.android.apps.chromecast.app.SetupApplication.a().getApplicationContext()), 1, 1065353216);
	        this.n = p6;
	        return;
	    }
	
	
	    public final synthetic void a(Object p5)
	    {
	        try {
	            this.n.a(dat.a(((byte[]) p5)));
	        } catch (String v0_1) {
	            String v0_3 = String.valueOf(v0_1.getMessage());
	            if (v0_3.length() == 0) {
	                String v0_5 = new String("Couldn\'t parse GetAppsResponse: ");
	            } else {
	                v0_5 = "Couldn\'t parse GetAppsResponse: ".concat(v0_3);
	            }
	            android.util.Log.w("GetAppsRequest", v0_5);
	        }
	        return;
	    }
	
	
	    public final String g()
	    {
	        return 0;
	    }
	
	
	    public final String h()
	    {
	        return 0;
	    }
	
