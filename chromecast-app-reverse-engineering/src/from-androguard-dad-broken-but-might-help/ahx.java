	private static final java.lang.String e
	private static ahx g
	 java.lang.String a
	 java.lang.String b
	 java.lang.String c
	  d
	private  f
	
	    static ahx()
	    {
	        ahx.e = ahx.getCanonicalName();
	        return;
	    }
	
	
	    public ahx()
	    {
	        return;
	    }
	
	
	    public static ahx a(android.content.Context p8)
	    {
	        int v6;
	        int v7 = 0;
	        if ((ahx.g == null) || ((System.currentTimeMillis() - ahx.g.f) >= 3600000)) {
	            ahx.b(p8);
	            boolean v0_4 = ahx.c(p8);
	            if (v0_4) {
	                v6 = v0_4;
	            } else {
	                v6 = new ahx();
	            }
	            try {
	                android.database.Cursor v1_5;
	                int v2_3 = new String[3];
	                v2_3[0] = "aid";
	                v2_3[1] = "androidid";
	                v2_3[2] = "limit_tracking";
	            } catch (boolean v0_19) {
	                android.database.Cursor v1_6 = 0;
	                boolean v0_31 = String.valueOf(v0_19.toString());
	                if (v0_31.length() == 0) {
	                    new String("Caught unexpected exception in getAttributionId(): ");
	                } else {
	                    "Caught unexpected exception in getAttributionId(): ".concat(v0_31);
	                }
	                if (v1_6 != null) {
	                    v1_6.close();
	                }
	                v6 = 0;
	            } catch (boolean v0_20) {
	                if (v7 != 0) {
	                    v7.close();
	                }
	                throw v0_20;
	            } catch (boolean v0_20) {
	                v7 = v1_6;
	            }
	            if (p8.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) == null) {
	                if (p8.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0) == null) {
	                    v1_5 = 0;
	                } else {
	                    v1_5 = android.net.Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
	                }
	            } else {
	                v1_5 = android.net.Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
	            }
	            boolean v0_18;
	            boolean v0_17 = p8.getPackageManager();
	            if (!v0_17) {
	                v0_18 = 0;
	            } else {
	                v0_18 = v0_17.getInstallerPackageName(p8.getPackageName());
	            }
	            if (v0_18) {
	                v6.c = v0_18;
	            }
	            if (v1_5 != null) {
	                v1_6 = p8.getContentResolver().query(v1_5, v2_3, 0, 0, 0);
	                try {
	                    if ((v1_6 != null) && (v1_6.moveToFirst())) {
	                        boolean v0_24 = v1_6.getColumnIndex("aid");
	                        int v2_5 = v1_6.getColumnIndex("androidid");
	                        int v3_5 = v1_6.getColumnIndex("limit_tracking");
	                        v6.a = v1_6.getString(v0_24);
	                        if ((v2_5 > 0) && ((v3_5 > 0) && (v6.b == null))) {
	                            v6.b = v1_6.getString(v2_5);
	                            v6.d = Boolean.parseBoolean(v1_6.getString(v3_5));
	                        }
	                        if (v1_6 != null) {
	                            v1_6.close();
	                        }
	                        v6.f = System.currentTimeMillis();
	                        ahx.g = v6;
	                    } else {
	                        if (v1_6 != null) {
	                            v1_6.close();
	                        }
	                    }
	                } catch (boolean v0_19) {
	                }
	            }
	        } else {
	            v6 = ahx.g;
	        }
	        return v6;
	    }
	
	
	    private static ahx b(android.content.Context p6)
	    {
	        try {
	            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
	                reflect.Method v2_1 = new Class[1];
	                v2_1[0] = android.content.Context;
	                boolean v0_2 = aji.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", v2_1);
	                if (v0_2) {
	                    reflect.Method v2_3 = new Object[1];
	                    v2_3[0] = p6;
	                    boolean v0_3 = aji.a(0, v0_2, v2_3);
	                    if (((v0_3 instanceof Integer)) && (((Integer) v0_3).intValue() == 0)) {
	                        reflect.Method v2_5 = new Class[1];
	                        v2_5[0] = android.content.Context;
	                        boolean v0_7 = aji.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", v2_5);
	                        if (v0_7) {
	                            reflect.Method v2_7 = new Object[1];
	                            v2_7[0] = p6;
	                            Object v1_6 = aji.a(0, v0_7, v2_7);
	                            if (v1_6 != null) {
	                                ahx v3_5 = new Class[0];
	                                boolean v0_9 = aji.a(v1_6.getClass(), "getId", v3_5);
	                                Object[] v4_3 = new Class[0];
	                                reflect.Method v2_10 = aji.a(v1_6.getClass(), "isLimitAdTrackingEnabled", v4_3);
	                                if ((v0_9) && (v2_10 != null)) {
	                                    ahx v3_8 = new ahx();
	                                    Object[] v4_5 = new Object[0];
	                                    v3_8.b = ((String) aji.a(v1_6, v0_9, v4_5));
	                                    boolean v0_13 = new Object[0];
	                                    v3_8.d = ((Boolean) aji.a(v1_6, v2_10, v0_13)).booleanValue();
	                                }
	                            }
	                        }
	                    }
	                }
	            } else {
	                throw new afq("getAndroidId cannot be called on the main thread.");
	            }
	        } catch (boolean v0_19) {
	            aji.a("android_id", v0_19);
	        }
	        return 0;
	    }
	
	
	    private static ahx c(android.content.Context p5)
	    {
	        ahx v0_9;
	        ahz v1_1 = new ahz();
	        ahx v0_1 = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
	        v0_1.setPackage("com.google.android.gms");
	        if (!p5.bindService(v0_1, v1_1, 1)) {
	            v0_9 = 0;
	        } else {
	            try {
	                if (!v1_1.a.compareAndSet(1, 1)) {
	                    String v2_3 = new ahy(((android.os.IBinder) v1_1.b.take()));
	                    v0_9 = new ahx();
	                    v0_9.b = v2_3.a();
	                    v0_9.d = v2_3.b();
	                    p5.unbindService(v1_1);
	                } else {
	                    throw new IllegalStateException("Binder already consumed");
	                }
	            } catch (ahx v0_13) {
	                p5.unbindService(v1_1);
	                throw v0_13;
	            } catch (ahx v0_12) {
	                aji.a("android_id", v0_12);
	                p5.unbindService(v1_1);
	            }
	        }
	        return v0_9;
	    }
	
