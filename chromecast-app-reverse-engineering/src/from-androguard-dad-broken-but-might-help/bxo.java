	public final  a
	public final com.google.android.gms.common.api.GoogleApiClient b
	public final bwh c
	private synthetic bxn d
	
	    public bxo(bxn p1, int p2, com.google.android.gms.common.api.GoogleApiClient p3, bwh p4)
	    {
	        this.d = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        p3.a(this);
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p5)
	    {
	        bxn.d(this.d).post(new bxp(this.d, this.a, p5));
	        return;
	    }
	
