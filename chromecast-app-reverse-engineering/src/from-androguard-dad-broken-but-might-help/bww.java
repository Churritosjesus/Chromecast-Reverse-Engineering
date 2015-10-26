	private synthetic bws a
	private synthetic com.google.android.gms.common.internal.ResolveAccountResponse b
	
	    bww(bwv p1, bws p2, com.google.android.gms.common.internal.ResolveAccountResponse p3)
	    {
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        java.util.concurrent.locks.Lock v1_0 = this.a;
	        int v0_0 = this.b;
	        boolean v2_0 = v0_0.c;
	        v1_0.b.lock();
	        try {
	            if (v1_0.b(0)) {
	                if (!v2_0.b()) {
	                    if (!v1_0.a(v2_0)) {
	                        v1_0.b(v2_0);
	                    } else {
	                        v1_0.h();
	                        if (v1_0.c == 0) {
	                            v1_0.g();
	                        }
	                    }
	                } else {
	                    v1_0.g = bzg.a(v0_0.b);
	                    v1_0.f = 1;
	                    v1_0.h = v0_0.d;
	                    v1_0.i = v0_0.e;
	                    v1_0.e();
	                }
	                v1_0.b.unlock();
	            } else {
	                v1_0.b.unlock();
	            }
	        } catch (int v0_4) {
	            v1_0.b.unlock();
	            throw v0_4;
	        }
	        return;
	    }
	
