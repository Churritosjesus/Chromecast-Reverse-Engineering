	private synthetic bws a
	
	    bwx(bws p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p1)
	    {
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p4)
	    {
	        this.a.d.a(new bwv(this.a));
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p3)
	    {
	        this.a.b.lock();
	        try {
	            if (!this.a.a(p3)) {
	                this.a.b(p3);
	            } else {
	                this.a.h();
	                this.a.g();
	            }
	        } catch (java.util.concurrent.locks.Lock v0_7) {
	            this.a.b.unlock();
	            throw v0_7;
	        }
	        this.a.b.unlock();
	        return;
	    }
	
