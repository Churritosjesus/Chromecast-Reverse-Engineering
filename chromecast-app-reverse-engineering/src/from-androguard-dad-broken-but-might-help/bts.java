	 com.google.android.gms.common.api.GoogleApiClient a
	final synthetic btl b
	private  c
	
	    public bts(btl p3)
	    {
	        this.b = p3;
	        this.c = 0;
	        return;
	    }
	
	
	    public final long a()
	    {
	        long v0_1 = (this.c + 1);
	        this.c = v0_1;
	        return v0_1;
	    }
	
	
	    public final void a(String p4, String p5, long p6)
	    {
	        if (this.a != null) {
	            bsr.b.a(this.a, p4, p5).a(new btt(this, p6));
	            return;
	        } else {
	            throw new java.io.IOException("No GoogleApiClient available");
	        }
	    }
	
