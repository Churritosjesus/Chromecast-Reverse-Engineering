	public final coh a
	private final java.lang.String b
	
	    public cno(android.content.Context p8, android.os.Looper p9, bwg p10, bwh p11, String p12, byl p13)
	    {
	        this(p8, p9, 23, p10, p11, p13);
	        this.a = new cnp(this);
	        this.b = p12;
	        return;
	    }
	
	
	    static synthetic void a(cno p0)
	    {
	        p0.n();
	        return;
	    }
	
	
	    protected final synthetic android.os.IInterface a(android.os.IBinder p2)
	    {
	        return cnv.a(p2);
	    }
	
	
	    protected final String c()
	    {
	        return "com.google.android.location.internal.GoogleLocationManagerService.START";
	    }
	
	
	    protected final String d()
	    {
	        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
	    }
	
	
	    protected final android.os.Bundle e()
	    {
	        android.os.Bundle v0_1 = new android.os.Bundle();
	        v0_1.putString("client_name", this.b);
	        return v0_1;
	    }
	
