	final synthetic aqd a
	private final  b
	
	    public aqg(aqd p1, boolean p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final void a(int p3)
	    {
	        this.a.j = 1;
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p7)
	    {
	        if (!this.a.j) {
	            aqd v0_3 = new aqh(this);
	            try {
	                if (!this.b) {
	                    this.a.h.a(this.a.c, v0_3);
	                } else {
	                    this.a.h.b(this.a.c, v0_3);
	                }
	            } catch (aqd v0_4) {
	                apk v1_4 = this.a.a;
	                Object[] v3 = new Object[1];
	                v3[0] = v0_4.toString();
	                v1_4.a("Failed to launch application: %s", v3);
	                this.a.a(1);
	            }
	        } else {
	            this.a.j = 0;
	        }
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p3)
	    {
	        this.a.a(1);
	        return;
	    }
	
