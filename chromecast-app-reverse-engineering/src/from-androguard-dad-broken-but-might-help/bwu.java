	private synthetic bws a
	private synthetic com.google.android.gms.common.ConnectionResult b
	
	    bwu(bwt p1, bws p2, com.google.android.gms.common.ConnectionResult p3)
	    {
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        java.util.concurrent.locks.Lock v1_0 = this.a;
	        java.util.concurrent.locks.Lock v0_0 = this.b;
	        v1_0.b.lock();
	        try {
	            if (v1_0.b(2)) {
	                if (!v0_0.b()) {
	                    if (!v1_0.a(v0_0)) {
	                        v1_0.b(v0_0);
	                    } else {
	                        v1_0.h();
	                        v1_0.g();
	                    }
	                } else {
	                    v1_0.g();
	                }
	                v1_0.b.unlock();
	            } else {
	                v1_0.b.unlock();
	            }
	        } catch (java.util.concurrent.locks.Lock v0_1) {
	            v1_0.b.unlock();
	            throw v0_1;
	        }
	        return;
	    }
	
