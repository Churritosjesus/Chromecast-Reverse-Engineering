	private static final java.lang.String n
	private static final java.lang.String o
	private aea p
	
	    public axc(dbh p5, boolean p6, aea p7)
	    {
	        String v0_0;
	        if (!p6) {
	            v0_0 = axc.n;
	        } else {
	            v0_0 = axc.o;
	        }
	        this("ContentDetails", com.google.android.apps.chromecast.app.SetupApplication.b(v0_0), dbh.a(p5), 0);
	        this.p = p7;
	        return;
	    }
	
	
	    protected final synthetic void a(Object p4)
	    {
	        try {
	            this.p.a(((dbi) dew.a(new dbi(), ((byte[]) p4))));
	        } catch (dev v0_4) {
	            android.util.Log.w("ContentDetailsRequest", "Could not read server response", v0_4);
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
	
