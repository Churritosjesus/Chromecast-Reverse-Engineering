	private final  a
	private final com.google.android.gms.common.ConnectionResult b
	private synthetic bxn c
	
	    public bxp(bxn p1, int p2, com.google.android.gms.common.ConnectionResult p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        if ((bxn.a(this.c)) && (!bxn.b(this.c))) {
	            bxn.a(this.c, 1);
	            bxn.a(this.c, this.a);
	            bxn.a(this.c, this.b);
	            if (!this.b.a()) {
	                if (!bvt.b(this.b.c)) {
	                    bxn.a(this.c, this.a, this.b);
	                } else {
	                    bvt.a(this.b.c, this.c.y, this.c, 2, this.c);
	                }
	            } else {
	                try {
	                    this.b.a(this.c.y, (((this.c.y.b.f().indexOf(this.c) + 1) << 16) + 1));
	                } catch (bxn v0) {
	                    bxn.c(this.c);
	                }
	            }
	        }
	        return;
	    }
	
