	private synthetic byo a
	
	    public byw(byo p1, int p2, android.os.Bundle p3)
	    {
	        this.a = p1;
	        this(p1, p2, p3);
	        return;
	    }
	
	
	    protected final void a(com.google.android.gms.common.ConnectionResult p2)
	    {
	        if (!byo.a(this.a)) {
	            byo.c(this.a).a(p2);
	        } else {
	            byo.b(this.a).b(p2);
	        }
	        return;
	    }
	
	
	    protected final boolean a()
	    {
	        if ((!byo.a(this.a)) || (byo.b(this.a) == null)) {
	            bwi v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        a.a(v0_4, "PostValidationCallback should not happen when mReportProgress is false ormConnectionProgressReportCallbacks is null");
	        byo.b(this.a).b(com.google.android.gms.common.ConnectionResult.a);
	        return 1;
	    }
	
