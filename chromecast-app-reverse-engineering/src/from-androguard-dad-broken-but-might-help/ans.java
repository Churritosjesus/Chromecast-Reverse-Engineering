	private synthetic apd a
	private synthetic ayq b
	private synthetic  c
	private synthetic bdf d
	private synthetic and e
	
	    ans(and p1, apd p2, ayq p3, long p4, bdf p6)
	    {
	        this.e = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.d = p6;
	        return;
	    }
	
	
	    public final void run()
	    {
	        if (!this.e.u) {
	            this.b.c();
	            if (android.os.SystemClock.elapsedRealtime() >= this.c) {
	                String v4;
	                ape.a().a(this.a.a(0));
	                if (this.d == null) {
	                    v4 = this.e.getString(b.dD);
	                } else {
	                    v4 = this.e.getString(b.dE);
	                }
	                if (!and.c(this.e)) {
	                    and v0_11 = this.e;
	                    String v1_4 = this.e;
	                    Object[] v3_0 = new Object[1];
	                    v3_0[0] = this.e.D();
	                    and.b(v0_11, v1_4.getString(b.aA, v3_0), v4);
	                } else {
	                    and v0_12 = this.e;
	                    String v1_6 = this.e;
	                    Object[] v3_1 = new Object[1];
	                    v3_1[0] = this.e.D();
	                    and.a(v0_12, v1_6.getString(b.dx, v3_1), b.dy, b.dz, v4, 0);
	                }
	            } else {
	                and.l(this.e).postDelayed(this, ((long) and.s(this.e)));
	                and.a(this.e, this.b);
	            }
	        } else {
	            ape.a().a(this.a.a(2));
	        }
	        return;
	    }
	
