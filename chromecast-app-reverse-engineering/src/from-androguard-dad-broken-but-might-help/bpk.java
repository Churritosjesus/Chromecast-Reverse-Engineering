	private static java.lang.Boolean b
	private android.os.Handler a
	
	    public bpk()
	    {
	        return;
	    }
	
	
	    public static boolean a(android.content.Context p2)
	    {
	        boolean v0_2;
	        a.c(p2);
	        if (bpk.b == null) {
	            v0_2 = bqs.a(p2, bpk);
	            bpk.b = Boolean.valueOf(v0_2);
	        } else {
	            v0_2 = bpk.b.booleanValue();
	        }
	        return v0_2;
	    }
	
	
	    protected final void a(bql p2, android.os.Handler p3, int p4)
	    {
	        p3.post(new bpn(this, p4, p2));
	        return;
	    }
	
	
	    public android.os.IBinder onBind(android.content.Intent p2)
	    {
	        return 0;
	    }
	
	
	    public void onCreate()
	    {
	        super.onCreate();
	        brb.a(this).a().b("CampaignTrackingService is starting up");
	        return;
	    }
	
	
	    public void onDestroy()
	    {
	        brb.a(this).a().b("CampaignTrackingService is shutting down");
	        super.onDestroy();
	        return;
	    }
	
	
	    public int onStartCommand(android.content.Intent p10, int p11, int p12)
	    {
	        try {
	        } catch (String v0) {
	            bqu v2_1 = brb.a(this);
	            bql v3 = v2_1.a();
	            String v0_2 = 0;
	            if (!byk.a) {
	                v0_2 = p10.getStringExtra("referrer");
	            } else {
	                v3.f("Unexpected installation campaign (package side)");
	            }
	            android.os.Handler v1_2 = this.a;
	            if (v1_2 == null) {
	                v1_2 = new android.os.Handler(this.getMainLooper());
	                this.a = v1_2;
	            }
	            if (!android.text.TextUtils.isEmpty(v0_2)) {
	                bpm v4_2 = brz.c();
	                if (v0_2.length() > v4_2) {
	                    v3.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(v0_2.length()), Integer.valueOf(v4_2));
	                    v0_2 = v0_2.substring(0, v4_2);
	                }
	                v3.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(p12), v0_2);
	                v2_1.c().a(v0_2, new bpm(this, v3, v1_2, p12));
	            } else {
	                if (!byk.a) {
	                    v3.e("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
	                }
	                v2_1.b().a(new bpl(this, v3, v1_2, p12));
	            }
	            return 2;
	        }
	        String v0_0 = bpj.b;
	        if ((v0_0 != null) && (v0_0.isHeld())) {
	            v0_0.release();
	        }
	    }
	
