	private static java.lang.Boolean b
	private final android.os.Handler a
	
	    public bpf()
	    {
	        this.a = new android.os.Handler();
	        return;
	    }
	
	
	    static synthetic android.os.Handler a(bpf p1)
	    {
	        return p1.a;
	    }
	
	
	    public static boolean a(android.content.Context p2)
	    {
	        boolean v0_2;
	        a.c(p2);
	        if (bpf.b == null) {
	            v0_2 = bqs.a(p2, bpf);
	            bpf.b = Boolean.valueOf(v0_2);
	        } else {
	            v0_2 = bpf.b.booleanValue();
	        }
	        return v0_2;
	    }
	
	
	    public final android.os.IBinder onBind(android.content.Intent p2)
	    {
	        return 0;
	    }
	
	
	    public final void onCreate()
	    {
	        super.onCreate();
	        bql v0_1 = brb.a(this).a();
	        if (!byk.a) {
	            v0_1.b("Local AnalyticsService is starting up");
	        } else {
	            v0_1.b("Device AnalyticsService is starting up");
	        }
	        return;
	    }
	
	
	    public final void onDestroy()
	    {
	        bql v0_1 = brb.a(this).a();
	        if (!byk.a) {
	            v0_1.b("Local AnalyticsService is shutting down");
	        } else {
	            v0_1.b("Device AnalyticsService is shutting down");
	        }
	        super.onDestroy();
	        return;
	    }
	
	
	    public final int onStartCommand(android.content.Intent p7, int p8, int p9)
	    {
	        try {
	        } catch (Throwable v0) {
	            Throwable v0_2 = brb.a(this);
	            bql v1 = v0_2.a();
	            bqu v2_1 = p7.getAction();
	            if (!byk.a) {
	                v1.a("Local AnalyticsService called. startId, action", Integer.valueOf(p9), v2_1);
	            } else {
	                v1.a("Device AnalyticsService called. startId, action", Integer.valueOf(p9), v2_1);
	            }
	            if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(v2_1)) {
	                v0_2.c().a(new bpg(this, p9, v0_2, v1));
	            }
	            return 2;
	        }
	        Throwable v0_0 = bpe.b;
	        if ((v0_0 != null) && (v0_0.isHeld())) {
	            v0_0.release();
	        }
	    }
	
