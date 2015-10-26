	private final java.lang.String a
	private  b
	private  c
	private  d
	private ut e
	private  f
	private synthetic us g
	
	    public uw(us p2, String p3)
	    {
	        this.g = p2;
	        this.c = -1;
	        this.a = p3;
	        return;
	    }
	
	
	    public final void a()
	    {
	        us.a(this.g, this);
	        return;
	    }
	
	
	    public final void a(int p7)
	    {
	        this.b = 0;
	        if (this.e != null) {
	            ut v0_2 = this.e;
	            int v3 = this.f;
	            android.os.Bundle v5_1 = new android.os.Bundle();
	            v5_1.putInt("unselectReason", p7);
	            int v2 = v0_2.c;
	            v0_2.c = (v2 + 1);
	            v0_2.a(6, v2, v3, 0, v5_1);
	        }
	        return;
	    }
	
	
	    public final void a(ut p7)
	    {
	        this.e = p7;
	        int v0_0 = this.a;
	        int v3 = p7.d;
	        p7.d = (v3 + 1);
	        android.os.Bundle v5_1 = new android.os.Bundle();
	        v5_1.putString("routeId", v0_0);
	        int v2 = p7.c;
	        p7.c = (v2 + 1);
	        p7.a(3, v2, v3, 0, v5_1);
	        this.f = v3;
	        if (this.b) {
	            p7.a(this.f);
	            if (this.c >= 0) {
	                p7.a(this.f, this.c);
	                this.c = -1;
	            }
	            if (this.d != 0) {
	                p7.b(this.f, this.d);
	                this.d = 0;
	            }
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.b = 1;
	        if (this.e != null) {
	            this.e.a(this.f);
	        }
	        return;
	    }
	
	
	    public final void b(int p3)
	    {
	        if (this.e == null) {
	            this.c = p3;
	            this.d = 0;
	        } else {
	            this.e.a(this.f, p3);
	        }
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.a(0);
	        return;
	    }
	
	
	    public final void c(int p3)
	    {
	        if (this.e == null) {
	            this.d = (this.d + p3);
	        } else {
	            this.e.b(this.f, p3);
	        }
	        return;
	    }
	
	
	    public final void d()
	    {
	        if (this.e != null) {
	            int v0_1 = this.e;
	            int v3 = this.f;
	            int v2 = v0_1.c;
	            v0_1.c = (v2 + 1);
	            v0_1.a(4, v2, v3, 0, 0);
	            this.e = 0;
	            this.f = 0;
	        }
	        return;
	    }
	
