	final java.lang.String a
	final android.content.Context b
	private final java.util.concurrent.ScheduledExecutorService c
	private final cxd d
	private java.util.concurrent.ScheduledFuture e
	private  f
	private czb g
	private java.lang.String h
	private cwb i
	
	    public cxa(android.content.Context p7, String p8, czb p9)
	    {
	        this(p7, p8, p9, 0, 0);
	        return;
	    }
	
	
	    private cxa(android.content.Context p2, String p3, czb p4, cxe p5, cxd p6)
	    {
	        this.g = p4;
	        this.b = p2;
	        this.a = p3;
	        this.c = new cxb(this).a();
	        this.d = new cxc(this);
	        return;
	    }
	
	
	    private declared_synchronized void b()
	    {
	        try {
	            if (!this.f) {
	                return;
	            } else {
	                throw new IllegalStateException("called method after closed");
	            }
	        } catch (IllegalStateException v0_3) {
	            throw v0_3;
	        }
	    }
	
	
	    public final declared_synchronized void a()
	    {
	        try {
	            this.b();
	        } catch (int v0_2) {
	            throw v0_2;
	        }
	        if (this.e != null) {
	            this.e.cancel(0);
	        }
	        this.c.shutdown();
	        this.f = 1;
	        return;
	    }
	
	
	    public final declared_synchronized void a(long p6, String p8)
	    {
	        try {
	            cuh.e(new StringBuilder("loadAfterDelay: containerId=").append(this.a).append(" delay=").append(p6).toString());
	            this.b();
	        } catch (java.util.concurrent.ScheduledFuture v0_13) {
	            throw v0_13;
	        }
	        if (this.i != null) {
	            if (this.e != null) {
	                this.e.cancel(0);
	            }
	            java.util.concurrent.ScheduledFuture v0_9 = this.c;
	            cwz v1_5 = this.d.a(this.g);
	            v1_5.b = this.i;
	            java.util.concurrent.TimeUnit v2_2 = this.h;
	            if (v2_2 != null) {
	                cuh.d(new StringBuilder("Setting CTFE URL path: ").append(v2_2).toString());
	                v1_5.c = v2_2;
	            } else {
	                v1_5.c = v1_5.a;
	            }
	            cuh.d(new StringBuilder("Setting previous container version: ").append(p8).toString());
	            v1_5.d = p8;
	            this.e = v0_9.schedule(v1_5, p6, java.util.concurrent.TimeUnit.MILLISECONDS);
	            return;
	        } else {
	            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
	        }
	    }
	
	
	    public final declared_synchronized void a(cwb p2)
	    {
	        try {
	            this.b();
	            this.i = p2;
	            return;
	        } catch (Throwable v0) {
	            throw v0;
	        }
	    }
	
	
	    public final declared_synchronized void a(String p2)
	    {
	        try {
	            this.b();
	            this.h = p2;
	            return;
	        } catch (Throwable v0) {
	            throw v0;
	        }
	    }
	
