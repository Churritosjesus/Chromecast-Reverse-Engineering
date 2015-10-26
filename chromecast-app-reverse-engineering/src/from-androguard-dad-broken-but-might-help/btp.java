	private synthetic com.google.android.gms.common.api.GoogleApiClient g
	private synthetic org.json.JSONObject h
	private synthetic btl i
	
	    public btp(btl p1, com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.common.api.GoogleApiClient p3, org.json.JSONObject p4)
	    {
	        this.i = p1;
	        this.g = p3;
	        this.h = p4;
	        this(p2);
	        return;
	    }
	
	
	    protected final synthetic void a(bwc p5)
	    {
	        try {
	            this.i.c.a = this.g;
	        } catch (bts v0_13) {
	            throw v0_13;
	        }
	        try {
	            this.i.b.b(this.a, this.h);
	        } catch (bts v0_10) {
	            this.i.c.a = 0;
	            throw v0_10;
	        } catch (bts v0) {
	            this.a(this.b(new com.google.android.gms.common.api.Status(2100)));
	            this.i.c.a = 0;
	            return;
	        }
	        this.i.c.a = 0;
	        return;
	    }
	
