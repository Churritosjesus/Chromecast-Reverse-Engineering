	private final bwq a
	
	    public csf(bwq p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p5, android.os.Bundle p6, com.google.android.gms.common.data.DataHolder p7)
	    {
	        csr v0_0 = 0;
	        if (a.b(3)) {
	            new StringBuilder("Owner callback: status=").append(p5).append("\nresolution=").append(p6).append("\nholder=").append(p7).toString();
	            a.b(3);
	        }
	        com.google.android.gms.common.api.Status v1_8 = csa.a(p5, 0, p6);
	        if (p7 != null) {
	            v0_0 = new csr(p7);
	        }
	        this.a.a(new csh(v1_8, v0_0));
	        return;
	    }
	
