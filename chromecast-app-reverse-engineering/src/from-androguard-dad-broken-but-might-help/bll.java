	private synthetic com.google.android.gms.common.api.GoogleApiClient a
	private synthetic bln b
	private synthetic m c
	
	    bll(com.google.android.gms.common.api.GoogleApiClient p1, bln p2, m p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final void a(int p1)
	    {
	        blj.f();
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p5)
	    {
	        blj.f();
	        try {
	            bln v0_1 = cni.b.a(this.a);
	        } catch (bln v0) {
	            blj.f();
	            v0_1 = 0;
	        }
	        this.a.c();
	        if (v0_1 != null) {
	            blo v1_2 = new blo(this.c, this.b);
	            android.location.Location[] v2_4 = new android.location.Location[1];
	            v2_4[0] = v0_1;
	            v1_2.execute(v2_4);
	        } else {
	            blj.f();
	            this.b.a(0);
	        }
	        return;
	    }
	
