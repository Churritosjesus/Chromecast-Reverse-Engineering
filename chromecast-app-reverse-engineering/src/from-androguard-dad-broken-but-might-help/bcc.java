	private aea n
	private final blp o
	
	    public bcc(dbl p4, aea p5, adz p6)
	    {
	        this("LoadOffersRequest", com.google.android.apps.chromecast.app.SetupApplication.b("/browse/offers"), dbl.a(p4), p6);
	        this.o = new blp("LoadOffersRequest");
	        this.n = p5;
	        return;
	    }
	
	
	    public final synthetic void a(Object p6)
	    {
	        try {
	            this.n.a(((dbm) dew.a(new dbm(), ((byte[]) p6))));
	        } catch (dev v0_4) {
	            blp v1_1 = this.o;
	            Object[] v3_1 = new Object[1];
	            v3_1[0] = v0_4;
	            v1_1.a("Couldn\'t parse OffersResponse: %s", v3_1);
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
	
