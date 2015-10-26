	private android.os.IBinder a
	private synthetic byo b
	
	    public byu(byo p1, int p2, android.os.IBinder p3, android.os.Bundle p4)
	    {
	        this.b = p1;
	        this(p1, p2, p4);
	        this.a = p3;
	        return;
	    }
	
	
	    protected final void a(com.google.android.gms.common.ConnectionResult p2)
	    {
	        byo.c(this.b).a(p2);
	        return;
	    }
	
	
	    protected final boolean a()
	    {
	        Throwable v0_0 = 0;
	        try {
	            Object v1_1 = this.a.getInterfaceDescriptor();
	        } catch (Object v1) {
	            android.util.Log.w("GmsClient", "service probably died");
	            return v0_0;
	        }
	        if (this.b.d().equals(v1_1)) {
	            Object v1_4 = this.b.a(this.a);
	            if ((v1_4 == null) || (!byo.a(this.b, 2, 3, v1_4))) {
	                return v0_0;
	            } else {
	                Throwable v0_2 = byo.c(this.b);
	                v0_2.a(v0_2.a.b());
	                bvt.c(byo.f(this.b));
	                v0_0 = 1;
	                return v0_0;
	            }
	        } else {
	            android.util.Log.e("GmsClient", new StringBuilder("service descriptor mismatch: ").append(this.b.d()).append(" vs. ").append(v1_1).toString());
	            return v0_0;
	        }
	    }
	
