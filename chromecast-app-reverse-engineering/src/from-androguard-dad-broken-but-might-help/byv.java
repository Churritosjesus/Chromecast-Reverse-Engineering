	private synthetic byo a
	
	    public byv(byo p3)
	    {
	        this.a = p3;
	        this(p3, 0, 0);
	        return;
	    }
	
	
	    protected final void a(com.google.android.gms.common.ConnectionResult p2)
	    {
	        if (!byo.a(this.a)) {
	            byo.c(this.a).a(p2);
	        } else {
	            byo.b(this.a).a(p2);
	        }
	        return;
	    }
	
	
	    protected final boolean a()
	    {
	        if (!byo.a(this.a)) {
	            this.a.a(0, byo.e(this.a));
	        } else {
	            bwi v0_5;
	            if (byo.b(this.a) == null) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 1;
	            }
	            a.a(v0_5, "mConnectionProgressReportCallbacks should not be null if mReportProgress");
	            byo.b(this.a).a(com.google.android.gms.common.ConnectionResult.a);
	        }
	        return 1;
	    }
	
