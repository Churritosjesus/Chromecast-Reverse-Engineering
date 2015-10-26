	public static final java.util.Comparator a
	public java.util.concurrent.ScheduledFuture b
	public final java.util.Set c
	public final java.util.Set d
	public final java.util.Set e
	private java.util.concurrent.ScheduledExecutorService f
	private final  g
	private final blp h
	private final atf i
	private java.lang.String j
	private final java.util.Map k
	private final java.util.Set l
	private final aea m
	
	    static bcn()
	    {
	        bcn.a = new bco();
	        return;
	    }
	
	
	    public bcn(atf p4, String p5, android.os.Bundle p6)
	    {
	        this.f = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
	        this.g = blf.g(com.google.android.apps.chromecast.app.SetupApplication.a());
	        this.h = new blp("OffersManager");
	        this.m = new bcp(this);
	        this.i = p4;
	        this.j = p5;
	        this.k = new java.util.HashMap();
	        this.l = new java.util.HashSet();
	        this.e = new java.util.HashSet();
	        this.c = new java.util.HashSet();
	        java.util.ArrayList v0_17 = android.preference.PreferenceManager.getDefaultSharedPreferences(com.google.android.apps.chromecast.app.SetupApplication.a()).getString("hiddenOffers", "");
	        this.d = new java.util.HashSet();
	        if (!android.text.TextUtils.isEmpty(v0_17)) {
	            this.d.addAll(java.util.Arrays.asList(v0_17.split(",")));
	        }
	        if ((p6 == null) || (!p6.containsKey("getAppsOffers"))) {
	            this.b();
	        } else {
	            this.c.addAll(p6.getParcelableArrayList("getAppsOffers"));
	        }
	        return;
	    }
	
	
	    static synthetic blp a(bcn p1)
	    {
	        return p1.h;
	    }
	
	
	    static synthetic java.util.Set b(bcn p1)
	    {
	        return p1.c;
	    }
	
	
	    private declared_synchronized void b()
	    {
	        try {
	            Throwable v0_1 = new dbl();
	            bcr v1_1 = new Object[1];
	            v1_1[0] = Integer.valueOf(this.l.size());
	            bcr v1_4 = new String[this.l.size()];
	            v0_1.b = v1_4;
	            this.l.toArray(v0_1.b);
	            this.l.clear();
	            bcr v1_8 = new bcr(this);
	            this.i.a(new bcs(this, v0_1, v1_8), v1_8);
	            return;
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	    }
	
	
	    static synthetic java.util.Map c(bcn p1)
	    {
	        return p1.k;
	    }
	
	
	    static synthetic java.util.Set d(bcn p1)
	    {
	        return p1.d;
	    }
	
	
	    static synthetic void e(bcn p0)
	    {
	        p0.b();
	        return;
	    }
	
	
	    static synthetic aea f(bcn p1)
	    {
	        return p1.m;
	    }
	
	
	    static synthetic atf g(bcn p1)
	    {
	        return p1.i;
	    }
	
	
	    public final void a()
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList(this.c.size());
	        v1_1.addAll(this.c);
	        java.util.Collections.sort(v1_1, bcn.a);
	        java.util.Iterator v2 = this.e.iterator();
	        while (v2.hasNext()) {
	            ((bct) v2.next()).a(v1_1);
	        }
	        return;
	    }
	
	
	    public final declared_synchronized void a(aow p6)
	    {
	        try {
	            java.util.concurrent.ScheduledFuture v0_0 = p6.q;
	        } catch (java.util.concurrent.ScheduledFuture v0_3) {
	            throw v0_3;
	        }
	        if (!this.k.containsKey(v0_0)) {
	            this.k.put(v0_0, p6);
	            this.l.add(v0_0);
	            if (this.b != null) {
	                this.b.cancel(0);
	            }
	            java.util.concurrent.ScheduledFuture v0_5 = new Object[1];
	            v0_5[0] = Integer.valueOf(this.l.size());
	            this.b = this.f.schedule(new bcq(this), ((long) this.g), java.util.concurrent.TimeUnit.MILLISECONDS);
	        }
	        return;
	    }
	
	
	    public final void a(bcd p7)
	    {
	        bcu v1_1 = new bcu(p7.a.c, p7.a.a, new bcf(p7), new bcg(p7, com.google.android.apps.chromecast.app.SetupApplication.a()));
	        atf v0_2 = new Object[1];
	        v0_2[0] = v1_1.b;
	        this.i.a(v1_1);
	        return;
	    }
	
	
	    public final void a(bcd p3, int p4)
	    {
	        this.d.add(p3.a());
	        if (this.c.remove(p3)) {
	            java.util.Iterator v1_1 = this.e.iterator();
	            while (v1_1.hasNext()) {
	                ((bct) v1_1.next()).a(p3, p4);
	            }
	        }
	        return;
	    }
	
	
	    public final declared_synchronized void a(String p2)
	    {
	        try {
	            if (!android.text.TextUtils.equals(p2, this.j)) {
	                this.j = p2;
	                this.k.clear();
	                this.l.clear();
	                this.c.clear();
	                this.a();
	            }
	        } catch (java.util.Set v0_5) {
	            throw v0_5;
	        }
	        return;
	    }
	
