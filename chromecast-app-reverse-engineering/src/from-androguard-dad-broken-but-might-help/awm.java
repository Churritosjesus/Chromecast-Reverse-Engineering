	private aea n
	private final blp o
	
	    public awm(das p5, aea p6, adz p7)
	    {
	        this("BrowseContent", com.google.android.apps.chromecast.app.SetupApplication.b("/browse/whatson"), das.a(p5), p7);
	        this.o = new blp("BrowseContentRequest");
	        this.i = new aec(blf.x(com.google.android.apps.chromecast.app.SetupApplication.a().getApplicationContext()), 1, 1065353216);
	        this.n = p6;
	        return;
	    }
	
	
	    public final synthetic void a(Object p6)
	    {
	        try {
	            this.n.a(dat.a(((byte[]) p6)));
	        } catch (dev v0_1) {
	            blp v1_1 = this.o;
	            Object[] v3_1 = new Object[1];
	            v3_1[0] = v0_1;
	            v1_1.a("Couldn\'t parse BrowseContentResponse: %s", v3_1);
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
	
