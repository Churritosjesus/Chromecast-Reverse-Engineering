	private java.util.concurrent.atomic.AtomicReference a
	final bwe f
	
	    public bwp(bwe p2, com.google.android.gms.common.api.GoogleApiClient p3)
	    {
	        this(((com.google.android.gms.common.api.GoogleApiClient) a.f(p3, "GoogleApiClient must not be null")).a());
	        this.a = new java.util.concurrent.atomic.AtomicReference();
	        this.f = ((bwe) a.c(p2));
	        return;
	    }
	
	
	    private void a(android.os.RemoteException p5)
	    {
	        this.d(new com.google.android.gms.common.api.Status(8, p5.getLocalizedMessage(), 0));
	        return;
	    }
	
	
	    public final void a(bxg p2)
	    {
	        this.a.set(p2);
	        return;
	    }
	
	
	    public final synthetic void a(Object p1)
	    {
	        super.a(((bwm) p1));
	        return;
	    }
	
	
	    public final void b(bwc p2)
	    {
	        try {
	            this.a(p2);
	        } catch (android.os.RemoteException v0_1) {
	            this.a(v0_1);
	            throw v0_1;
	        } catch (android.os.RemoteException v0_0) {
	            this.a(v0_0);
	        }
	        return;
	    }
	
	
	    protected final void d()
	    {
	        bxg v0_2 = ((bxg) this.a.getAndSet(0));
	        if (v0_2 != null) {
	            v0_2.a(this);
	        }
	        return;
	    }
	
	
	    public final void d(com.google.android.gms.common.api.Status p3)
	    {
	        bwm v0_1;
	        if (p3.a()) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        a.b(v0_1, "Failed result must not be success");
	        this.a(this.a(p3));
	        return;
	    }
	
	
	    public final bwe e()
	    {
	        return this.f;
	    }
	
