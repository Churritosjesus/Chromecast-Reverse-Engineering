	public final android.content.Context a
	final atf b
	public dat c
	public dat d
	public I e
	public final blp f
	 axn g
	public axn h
	  i
	 aef j
	public aef k
	public  l
	  m
	public  n
	public final android.os.Handler o
	public final java.lang.Runnable p
	
	    public axd(android.content.Context p3, atf p4)
	    {
	        this.f = new blp("ContentDiscoveryManager");
	        this.o = new android.os.Handler();
	        this.p = new axe(this);
	        this.a = p3;
	        this.b = p4;
	        this.m = blf.w(p3);
	        this.i = axd.a(android.preference.PreferenceManager.getDefaultSharedPreferences(this.a));
	        android.preference.PreferenceManager.getDefaultSharedPreferences(p3).registerOnSharedPreferenceChangeListener(new axf(this));
	        return;
	    }
	
	
	    static synthetic void a(axd p4)
	    {
	        p4.l = android.os.SystemClock.elapsedRealtime();
	        p4.o.removeCallbacks(p4.p);
	        p4.o.postDelayed(p4.p, p4.m);
	        return;
	    }
	
	
	    static boolean a(android.content.SharedPreferences p2)
	    {
	        int v0 = 0;
	        if (!p2.contains("manualAudio")) {
	            if ((p2.getBoolean("hendrixDiscovered", 0)) && (!p2.getBoolean("nonhendrixDiscovered", 0))) {
	                v0 = 1;
	            }
	        } else {
	            v0 = p2.getBoolean("manualAudio", 0);
	        }
	        return v0;
	    }
	
	
	    public final void a()
	    {
	        this.j = 0;
	        axg v0_2 = new axg(this);
	        this.b.a(new axh(this, v0_2), v0_2);
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.k = 0;
	        axj v0_2 = new axj(this);
	        this.b.a(new axk(this, v0_2), v0_2);
	        return;
	    }
	
