	static java.lang.Object a
	static android.os.PowerManager$WakeLock b
	private static java.lang.Boolean c
	
	    static bpj()
	    {
	        bpj.a = new Object();
	        return;
	    }
	
	
	    public bpj()
	    {
	        return;
	    }
	
	
	    public static boolean a(android.content.Context p2)
	    {
	        boolean v0_2;
	        a.c(p2);
	        if (bpj.c == null) {
	            v0_2 = bqs.a(p2, bpj, 1);
	            bpj.c = Boolean.valueOf(v0_2);
	        } else {
	            v0_2 = bpj.c.booleanValue();
	        }
	        return v0_2;
	    }
	
	
	    public void onReceive(android.content.Context p7, android.content.Intent p8)
	    {
	        bql v1 = brb.a(p7).a();
	        android.os.PowerManager$WakeLock v0_2 = p8.getStringExtra("referrer");
	        int v2_0 = p8.getAction();
	        v1.a("CampaignTrackingReceiver received", v2_0);
	        if (("com.android.vending.INSTALL_REFERRER".equals(v2_0)) && (!android.text.TextUtils.isEmpty(v0_2))) {
	            int v2_3 = bpk.a(p7);
	            if (v2_3 == 0) {
	                v1.e("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
	            }
	            if (!byk.a) {
	                a.c(bpk);
	                long v4_1 = new android.content.Intent(p7, bpk);
	                v4_1.putExtra("referrer", v0_2);
	                try {
	                    p7.startService(v4_1);
	                } catch (android.os.PowerManager$WakeLock v0_9) {
	                    throw v0_9;
	                }
	                if (v2_3 != 0) {
	                    try {
	                        if (bpj.b != null) {
	                            bpj.b.acquire(1000);
	                        } else {
	                            android.os.PowerManager$WakeLock v0_6 = ((android.os.PowerManager) p7.getSystemService("power")).newWakeLock(1, "Analytics campaign WakeLock");
	                            bpj.b = v0_6;
	                            v0_6.setReferenceCounted(0);
	                        }
	                    } catch (android.os.PowerManager$WakeLock v0) {
	                        v1.e("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
	                    }
	                } else {
	                }
	            } else {
	                v1.f("Received unexpected installation campaign on package side");
	            }
	        } else {
	            v1.e("CampaignTrackingReceiver received unexpected intent without referrer extra");
	        }
	        return;
	    }
	
