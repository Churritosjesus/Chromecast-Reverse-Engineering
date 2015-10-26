	private static java.lang.String a
	private static final android.content.ComponentName b
	
	    static bsn()
	    {
	        bsn.a = "androidPackageName";
	        bsn.b = new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
	        new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
	        return;
	    }
	
	
	    private static android.os.Bundle a(android.content.Context p7, android.accounts.Account p8, String p9, android.os.Bundle p10, Boolean p11)
	    {
	        bsp v3_0 = p7.getApplicationContext();
	        a.h("Calling this from your main thread can lead to deadlock");
	        try {
	            bsm v0_6;
	            bvt.b(v3_0);
	        } catch (bsm v0_3) {
	            throw new bso(v0_3.a, v0_3.getMessage(), new android.content.Intent(v0_3.b));
	        } catch (bsm v0_1) {
	            throw new bsm(v0_1.getMessage());
	        }
	        if (p10 != null) {
	            v0_6 = new android.os.Bundle(p10);
	        } else {
	            v0_6 = new android.os.Bundle();
	        }
	        caf v4_3 = p7.getApplicationInfo().packageName;
	        v0_6.putString("clientPackageName", v4_3);
	        if (android.text.TextUtils.isEmpty(v0_6.getString(bsn.a))) {
	            v0_6.putString(bsn.a, v4_3);
	        }
	        if (p11 != null) {
	            v0_6.putBoolean("UseCache", p11.booleanValue());
	        }
	        caf v4_6 = new caf();
	        byz v5_6 = byz.a(v3_0);
	        if (!v5_6.a(bsn.b, v4_6, "GoogleAuthUtil")) {
	            throw new java.io.IOException("Could not bind to service with the given context.");
	        } else {
	            try {
	                bsm v0_10 = cln.a(v4_6.a()).a(p8, p9, v0_6);
	            } catch (bsm v0) {
	                throw new java.io.IOException("remote exception");
	            } catch (bsm v0_31) {
	                v5_6.b(bsn.b, v4_6, "GoogleAuthUtil");
	                throw v0_31;
	            } catch (bsm v0) {
	                throw new bsm("Interrupted");
	            }
	            if (v0_10 != null) {
	                if (android.text.TextUtils.isEmpty(v0_10.getString("authtoken"))) {
	                    bsp v3_46;
	                    String v6_1 = v0_10.getString("Error");
	                    if ((!"BadAuthentication".equals(v6_1)) && ((!"CaptchaRequired".equals(v6_1)) && ((!"DeviceManagementRequiredOrSyncDisabled".equals(v6_1)) && ((!"NeedPermission".equals(v6_1)) && ((!"NeedsBrowser".equals(v6_1)) && ((!"UserCancel".equals(v6_1)) && ((!"AppDownloadRequired".equals(v6_1)) && ((!bsq.b.h.equals(v6_1)) && ((!bsq.c.h.equals(v6_1)) && ((!bsq.d.h.equals(v6_1)) && ((!bsq.e.h.equals(v6_1)) && ((!bsq.f.h.equals(v6_1)) && ((!bsq.g.h.equals(v6_1)) && (!bsq.a.h.equals(v6_1))))))))))))))) {
	                        v3_46 = 0;
	                    } else {
	                        v3_46 = 1;
	                    }
	                    if (v3_46 == null) {
	                        if ((!"NetworkError".equals(v6_1)) && ((!"ServiceUnavailable".equals(v6_1)) && (!"Timeout".equals(v6_1)))) {
	                            bsm v0_19 = 0;
	                        } else {
	                            v0_19 = 1;
	                        }
	                        if (v0_19 == null) {
	                            throw new bsm(v6_1);
	                        } else {
	                            throw new java.io.IOException(v6_1);
	                        }
	                    } else {
	                        throw new bsp(v6_1, ((android.content.Intent) v0_10.getParcelable("userRecoveryIntent")));
	                    }
	                } else {
	                    v5_6.b(bsn.b, v4_6, "GoogleAuthUtil");
	                    return v0_10;
	                }
	            } else {
	                android.util.Log.w("GoogleAuthUtil", "Binder call returned null.");
	                throw new bsm("ServiceUnavailable");
	            }
	        }
	    }
	
	
	    public static String a(android.content.Context p3, String p4, String p5)
	    {
	        return bsn.a(p3, new android.accounts.Account(p4, "com.google"), p5, new android.os.Bundle(), 0).getString("authtoken");
	    }
	
	
	    public static void a(android.content.Context p2, String p3)
	    {
	        android.accounts.AccountManager.get(p2).invalidateAuthToken("com.google", p3);
	        return;
	    }
	
