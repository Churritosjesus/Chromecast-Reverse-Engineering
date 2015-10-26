	private synthetic bwz a
	
	    bxe(bwz p1, android.os.Looper p2)
	    {
	        this.a = p1;
	        this(p2);
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p4)
	    {
	        switch (p4.what) {
	            case 1:
	                bwz.g(this.a);
	                break;
	            case 2:
	                bwz.f(this.a);
	                break;
	            default:
	                android.util.Log.w("GoogleApiClientImpl", new StringBuilder("Unknown message id: ").append(p4.what).toString());
	        }
	        return;
	    }
	
