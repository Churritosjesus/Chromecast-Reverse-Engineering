	private synthetic afb a
	private synthetic java.util.concurrent.atomic.AtomicBoolean b
	private synthetic afk c
	private synthetic java.util.Set d
	private synthetic java.util.Set e
	private synthetic aff f
	
	    afj(aff p1, afb p2, java.util.concurrent.atomic.AtomicBoolean p3, afk p4, java.util.Set p5, java.util.Set p6)
	    {
	        this.f = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.d = p5;
	        this.e = p6;
	        return;
	    }
	
	
	    public final void a()
	    {
	        if ((aff.a().b != null) && (aff.a().b.h == this.a.h)) {
	            try {
	                if ((this.b.get()) || ((this.c.a != null) || (this.c.b != 0))) {
	                    aff v1_5;
	                    if (this.c.a == null) {
	                        v1_5 = this.a.d;
	                    } else {
	                        v1_5 = this.c.a;
	                    }
	                    java.util.Set v4_3;
	                    int v2_1 = this.a.g;
	                    String v3_1 = this.a.h;
	                    if (!this.b.get()) {
	                        v4_3 = this.a.b;
	                    } else {
	                        v4_3 = this.d;
	                    }
	                    java.util.Set v5_3;
	                    if (!this.b.get()) {
	                        v5_3 = this.a.c;
	                    } else {
	                        v5_3 = this.e;
	                    }
	                    java.util.Date v7_3;
	                    afl v6_1 = this.a.e;
	                    if (this.c.b == 0) {
	                        v7_3 = this.a.a;
	                    } else {
	                        v7_3 = new java.util.Date((((long) this.c.b) * 1000));
	                    }
	                    aff.a().a(new afb(v1_5, v2_1, v3_1, v4_3, v5_3, v6_1, v7_3, new java.util.Date()), 1);
	                    aff.b(this.f).set(0);
	                } else {
	                    aff.b(this.f).set(0);
	                }
	            } catch (java.util.concurrent.atomic.AtomicBoolean v0_12) {
	                aff.b(this.f).set(0);
	                throw v0_12;
	            }
	        }
	        return;
	    }
	
