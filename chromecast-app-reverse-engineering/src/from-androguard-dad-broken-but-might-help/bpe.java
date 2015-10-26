	static java.lang.Object a
	static android.os.PowerManager$WakeLock b
	private static java.lang.Boolean c
	
	    static bpe()
	    {
	        bpe.a = new Object();
	        return;
	    }
	
	
	    public bpe()
	    {
	        return;
	    }
	
	
	    public static boolean a(android.content.Context p2)
	    {
	        boolean v0_2;
	        a.c(p2);
	        if (bpe.c == null) {
	            v0_2 = bqs.a(p2, bpe, 0);
	            bpe.c = Boolean.valueOf(v0_2);
	        } else {
	            v0_2 = bpe.c.booleanValue();
	        }
	        return v0_2;
	    }
	
	
	    public final void onReceive(android.content.Context p7, android.content.Intent p8)
	    {
	        bql v1 = brb.a(p7).a();
	        String v0_1 = p8.getAction();
	        if (!byk.a) {
	            v1.a("Local AnalyticsReceiver got", v0_1);
	        } else {
	            v1.a("Device AnalyticsReceiver got", v0_1);
	        }
	        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(v0_1)) {
	            String v0_3 = bpf.a(p7);
	            int v2_5 = new android.content.Intent(p7, bpf);
	            v2_5.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
	            try {
	                p7.startService(v2_5);
	            } catch (String v0_10) {
	                throw v0_10;
	            }
	            if (v0_3 != null) {
	                try {
	                    if (bpe.b != null) {
	                        bpe.b.acquire(1000);
	                    } else {
	                        String v0_7 = ((android.os.PowerManager) p7.getSystemService("power")).newWakeLock(1, "Analytics WakeLock");
	                        bpe.b = v0_7;
	                        v0_7.setReferenceCounted(0);
	                    }
	                } catch (String v0) {
	                    v1.e("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
	                }
	            } else {
	            }
	        }
	        return;
	    }
	
