	private synthetic com.google.android.gms.common.api.GoogleApiClient g
	private synthetic btl h
	
	    public btn(btl p1, com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.common.api.GoogleApiClient p3)
	    {
	        this.h = p1;
	        this.g = p3;
	        this(p2);
	        return;
	    }
	
	
	    protected final synthetic void a(bwc p5)
	    {
	        try {
	            this.h.c.a = this.g;
	        } catch (bts v0_13) {
	            throw v0_13;
	        }
	        try {
	            this.h.b.a(this.a);
	        } catch (bts v0_10) {
	            this.h.c.a = 0;
	            throw v0_10;
	        } catch (bts v0) {
	            this.a(this.b(new com.google.android.gms.common.api.Status(2100)));
	            this.h.c.a = 0;
	            return;
	        }
	        this.h.c.a = 0;
	        return;
	    }
	
