	private final bwz a
	
	    public bwy(bwz p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final bwp a(bwp p2)
	    {
	        this.a.f.add(p2);
	        return p2;
	    }
	
	
	    public final void a()
	    {
	        java.util.Iterator v1 = this.a.j.values().iterator();
	        while (v1.hasNext()) {
	            ((bwc) v1.next()).a();
	        }
	        return;
	    }
	
	
	    public final void a(int p3)
	    {
	        java.util.Map v0_1;
	        if (p3 != -1) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        if (v0_1 != null) {
	            java.util.Iterator v1 = this.a.f.iterator();
	            while (v1.hasNext()) {
	                ((bxi) v1.next()).b();
	            }
	            this.a.f.clear();
	            this.a.f();
	            this.a.k.clear();
	        }
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p1)
	    {
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p1, bvz p2, int p3)
	    {
	        return;
	    }
	
	
	    public final bwp b(bwp p3)
	    {
	        throw new IllegalStateException("GoogleApiClient is not connected yet.");
	    }
	
	
	    public final void b()
	    {
	        java.util.concurrent.locks.Lock v1_0 = this.a;
	        v1_0.a.lock();
	        try {
	            v1_0.p = new bws(v1_0, v1_0.m, v1_0.n, v1_0.o, v1_0.a, v1_0.d);
	            v1_0.p.a();
	            v1_0.b.signalAll();
	            v1_0.a.unlock();
	            return;
	        } catch (Throwable v0_6) {
	            v1_0.a.unlock();
	            throw v0_6;
	        }
	    }
	
	
	    public final String c()
	    {
	        return "DISCONNECTED";
	    }
	
