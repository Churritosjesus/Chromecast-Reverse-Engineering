	private synthetic com.google.android.gms.common.api.GoogleApiClient a
	private synthetic ckc g
	
	    cke(ckc p1, com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.common.api.GoogleApiClient p3)
	    {
	        this.g = p1;
	        this.a = p3;
	        this(p2);
	        return;
	    }
	
	
	    protected final synthetic bwm a(com.google.android.gms.common.api.Status p1)
	    {
	        return p1;
	    }
	
	
	    protected final synthetic void a(bwc p5)
	    {
	        try {
	            if (!ckc.a().a(10, java.util.concurrent.TimeUnit.MILLISECONDS)) {
	                ckc.a(this.g, this.a, this);
	            } else {
	                Thread.sleep(100);
	                this.a.c();
	            }
	        } catch (ckc v0) {
	            Thread.currentThread().interrupt();
	        }
	        return;
	    }
	
