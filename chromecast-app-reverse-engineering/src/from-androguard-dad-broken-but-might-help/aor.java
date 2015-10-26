	private static final blp a
	private static final java.util.concurrent.ScheduledExecutorService d
	private static final java.lang.Runnable g
	private  b
	private  c
	private java.util.concurrent.Future e
	private final  f
	private final java.util.Set h
	
	    static aor()
	    {
	        aor.a = new blp("SetupApplicationLifecycleHandler");
	        aor.d = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
	        aor.g = new aos();
	        return;
	    }
	
	
	    public aor()
	    {
	        this.f = blf.u(com.google.android.apps.chromecast.app.SetupApplication.a());
	        this.h = new java.util.HashSet();
	        return;
	    }
	
	
	    static synthetic int a(aor p2)
	    {
	        int v0 = p2.c;
	        p2.c = (v0 - 1);
	        return v0;
	    }
	
	
	    static synthetic blp a()
	    {
	        return aor.a;
	    }
	
	
	    static synthetic java.util.concurrent.Future a(aor p0, java.util.concurrent.Future p1)
	    {
	        p0.e = p1;
	        return p1;
	    }
	
	
	    static synthetic int b(aor p1)
	    {
	        return p1.c;
	    }
	
	
	    static synthetic Runnable b()
	    {
	        return aor.g;
	    }
	
	
	    static synthetic java.util.concurrent.Future c(aor p1)
	    {
	        return p1.e;
	    }
	
	
	    static synthetic java.util.concurrent.ScheduledExecutorService c()
	    {
	        return aor.d;
	    }
	
	
	    static synthetic long d(aor p2)
	    {
	        return p2.f;
	    }
	
	
	    static synthetic java.util.Set e(aor p1)
	    {
	        return p1.h;
	    }
	
	
	    public final void onActivityCreated(android.app.Activity p1, android.os.Bundle p2)
	    {
	        return;
	    }
	
	
	    public final void onActivityDestroyed(android.app.Activity p1)
	    {
	        return;
	    }
	
	
	    public final void onActivityPaused(android.app.Activity p6)
	    {
	        aot v0_1 = new Object[2];
	        v0_1[0] = Integer.valueOf((this.c - 1));
	        v0_1[1] = p6.getClass().getSimpleName();
	        aor.d.schedule(new aot(this), 2000, java.util.concurrent.TimeUnit.MILLISECONDS);
	        return;
	    }
	
	
	    public final void onActivityResumed(android.app.Activity p5)
	    {
	        int v0_1 = new Object[2];
	        v0_1[0] = Integer.valueOf(this.c);
	        v0_1[1] = p5.getClass().getSimpleName();
	        if (this.c == 0) {
	            int v0_3 = ape.a();
	            v0_3.g = v0_3.a.nextInt();
	            ape.a().b(108);
	            if (this.e != null) {
	                this.e.cancel(0);
	                this.e = 0;
	            }
	        }
	        this.c = (this.c + 1);
	        return;
	    }
	
	
	    public final void onActivitySaveInstanceState(android.app.Activity p1, android.os.Bundle p2)
	    {
	        return;
	    }
	
	
	    public final void onActivityStarted(android.app.Activity p4)
	    {
	        int v0_1 = new Object[2];
	        v0_1[0] = Integer.valueOf(this.b);
	        v0_1[1] = p4.getClass().getSimpleName();
	        this.b = (this.b + 1);
	        return;
	    }
	
	
	    public final void onActivityStopped(android.app.Activity p4)
	    {
	        this.b = (this.b - 1);
	        Object[] v0_3 = new Object[2];
	        v0_3[0] = Integer.valueOf(this.b);
	        v0_3[1] = p4.getClass().getSimpleName();
	        return;
	    }
	
