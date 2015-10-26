	private static  a
	private static  b
	private static  c
	private static final java.lang.Object d
	private static java.lang.String e
	private static java.lang.Integer f
	
	    static bvt()
	    {
	        bvt.a = 0;
	        bvt.b = 0;
	        bvt.c = -1;
	        bvt.d = new Object();
	        bvt.e = 0;
	        bvt.f = 0;
	        return;
	    }
	
	
	    public static int a(android.content.Context p9)
	    {
	        IllegalStateException v0_0 = 9;
	        android.content.pm.PackageManager v4 = p9.getPackageManager();
	        if (!byk.a) {
	            try {
	                p9.getResources().getString(a.hB);
	            } catch (String v3) {
	                android.util.Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
	            }
	        }
	        if ((!byk.a) && (!"com.google.android.gms".equals(p9.getPackageName()))) {
	            try {
	                if (bvt.e != null) {
	                    if (!bvt.e.equals(p9.getPackageName())) {
	                        throw new IllegalArgumentException(new StringBuilder("isGooglePlayServicesAvailable should only be called with Context from your application\'s package. A previous call used package \'").append(bvt.e).append("\' and this call used package \'").append(p9.getPackageName()).append("\'.").toString());
	                    }
	                } else {
	                    bvt.e = p9.getPackageName();
	                    try {
	                        String v3_12 = p9.getPackageManager().getApplicationInfo(p9.getPackageName(), 128).metaData;
	                    } catch (String v3_16) {
	                        android.util.Log.wtf("GooglePlayServicesUtil", "This should never happen.", v3_16);
	                    }
	                    if (v3_12 == null) {
	                        bvt.f = 0;
	                    } else {
	                        bvt.f = Integer.valueOf(v3_12.getInt("com.google.android.gms.version"));
	                    }
	                }
	            } catch (IllegalStateException v0_3) {
	                throw v0_3;
	            }
	            String v3_17 = bvt.f;
	            if (v3_17 != null) {
	                if (v3_17.intValue() != 7327000) {
	                    throw new IllegalStateException(new StringBuilder("The meta-data tag in your app\'s AndroidManifest.xml does not have the right value.  Expected 7327000 but found ").append(v3_17).append(".  You must have the following declaration within the <application> element: ").append("    <meta-data android:name=\"com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
	                }
	            } else {
	                throw new IllegalStateException("A required meta-data tag in your app\'s AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
	            }
	        }
	        try {
	            String v3_19 = v4.getPackageInfo("com.google.android.gms", 64);
	            bvu.a();
	        } catch (IllegalStateException v0) {
	            android.util.Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
	            v0_0 = 1;
	            return v0_0;
	        }
	        if ((!cab.b(v3_19.versionCode)) && (!cab.a(p9))) {
	            try {
	                String v5_10 = bvu.a(v4.getPackageInfo("com.android.vending", 64), cdr.a);
	            } catch (String v5) {
	                if (!bvt.a(p9, "com.android.vending")) {
	                    android.util.Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
	                    return v0_0;
	                } else {
	                    android.util.Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
	                    if (bvu.a(v3_19, cdr.a) == null) {
	                        android.util.Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
	                        return v0_0;
	                    }
	                }
	            }
	            if (v5_10 != null) {
	                String v6_7 = new cah[1];
	                v6_7[0] = v5_10;
	                if (bvu.a(v3_19, v6_7) == null) {
	                    android.util.Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
	                    return v0_0;
	                }
	            } else {
	                android.util.Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
	                return v0_0;
	            }
	        } else {
	            if (bvu.a(v3_19, cdr.a) == null) {
	                android.util.Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
	                return v0_0;
	            }
	        }
	        if (cab.a(v3_19.versionCode) >= cab.a(7327000)) {
	            IllegalStateException v0_6 = v3_19.applicationInfo;
	            if (v0_6 == null) {
	                try {
	                    v0_6 = v4.getApplicationInfo("com.google.android.gms", 0);
	                } catch (IllegalStateException v0_8) {
	                    android.util.Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
	                    v0_8.printStackTrace();
	                    v0_0 = 1;
	                    return v0_0;
	                }
	            }
	            if (v0_6.enabled) {
	                v0_0 = 0;
	                return v0_0;
	            } else {
	                v0_0 = 3;
	                return v0_0;
	            }
	        } else {
	            android.util.Log.w("GooglePlayServicesUtil", new StringBuilder("Google Play services out of date.  Requires 7327000 but found ").append(v3_19.versionCode).toString());
	            v0_0 = 2;
	            return v0_0;
	        }
	    }
	
	
	    public static android.app.Dialog a(int p2, android.app.Activity p3, int p4)
	    {
	        return bvt.b(p2, p3, 0, 9001, 0);
	    }
	
	
	    public static android.content.Intent a(int p1)
	    {
	        android.content.Intent v0_0;
	        switch (p1) {
	            case 1:
	            case 2:
	            case 18:
	                v0_0 = bze.b("com.google.android.gms");
	                break;
	            case 3:
	                v0_0 = bze.a("com.google.android.gms");
	                break;
	            case 42:
	                v0_0 = bze.a();
	                break;
	            default:
	                v0_0 = 0;
	        }
	        return v0_0;
	    }
	
	
	    public static boolean a(int p3, android.app.Activity p4, j p5, int p6, android.content.DialogInterface$OnCancelListener p7)
	    {
	        RuntimeException v0_6;
	        RuntimeException v0_1 = bvt.b(p3, p4, p5, 2, p7);
	        if (v0_1 != null) {
	            if (!(p4 instanceof m)) {
	                if (!a.a(11)) {
	                    throw new RuntimeException("This Activity does not support Fragments.");
	                } else {
	                    bvp.a(v0_1, p7).show(p4.getFragmentManager(), "GooglePlayServicesErrorDialog");
	                }
	            } else {
	                bvv.a(v0_1, p7).a(((m) p4).b, "GooglePlayServicesErrorDialog");
	            }
	            v0_6 = 1;
	        } else {
	            v0_6 = 0;
	        }
	        return v0_6;
	    }
	
	
	    public static boolean a(android.content.Context p2, int p3)
	    {
	        if ((!bvt.a(p2, p3, "com.google.android.gms")) || (!bvt.a(p2.getPackageManager(), "com.google.android.gms"))) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    private static boolean a(android.content.Context p5, int p6, String p7)
	    {
	        int v1 = 0;
	        if (!a.a(19)) {
	            String[] v3 = p5.getPackageManager().getPackagesForUid(p6);
	            if (v3 != null) {
	                int v0_3 = 0;
	                while (v0_3 < v3.length) {
	                    if (!p7.equals(v3[v0_3])) {
	                        v0_3++;
	                    } else {
	                        v1 = 1;
	                        break;
	                    }
	                }
	            }
	        } else {
	            try {
	                ((android.app.AppOpsManager) p5.getSystemService("appops")).checkPackage(p6, p7);
	                v1 = 1;
	            } catch (int v0) {
	            }
	        }
	        return v1;
	    }
	
	
	    private static boolean a(android.content.Context p3, String p4)
	    {
	        int v0_5;
	        if (!a.a(21)) {
	            try {
	                if (!p3.getPackageManager().getApplicationInfo(p4, 8192).enabled) {
	                    v0_5 = 0;
	                } else {
	                    v0_5 = 1;
	                }
	            } catch (int v0) {
	            }
	        } else {
	            int v2_1 = p3.getPackageManager().getPackageInstaller().getAllSessions().iterator();
	            while (v2_1.hasNext()) {
	                if (p4.equals(((android.content.pm.PackageInstaller$SessionInfo) v2_1.next()).getAppPackageName())) {
	                    v0_5 = 1;
	                }
	            }
	        }
	        return v0_5;
	    }
	
	
	    public static boolean a(android.content.pm.PackageManager p2)
	    {
	        if ((!bvt.b(p2)) && ("user".equals(android.os.Build.TYPE))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public static boolean a(android.content.pm.PackageManager p1, String p2)
	    {
	        return bvu.a().a(p1, p2);
	    }
	
	
	    private static android.app.Dialog b(int p9, android.app.Activity p10, j p11, int p12, android.content.DialogInterface$OnCancelListener p13)
	    {
	        android.app.AlertDialog v0_12;
	        int v2_0 = 1;
	        String v4 = 0;
	        if (p9 != 0) {
	            if ((cab.a(p10)) && (p9 == 2)) {
	                p9 = 42;
	            }
	            android.app.AlertDialog v0_9;
	            if (!a.a(14)) {
	                v0_9 = 0;
	            } else {
	                android.app.AlertDialog v0_5 = new android.util.TypedValue();
	                p10.getTheme().resolveAttribute(16843529, v0_5, 1);
	                if (!"Theme.Dialog.Alert".equals(p10.getResources().getResourceEntryName(v0_5.resourceId))) {
	                } else {
	                    v0_9 = new android.app.AlertDialog$Builder(p10, 5);
	                }
	            }
	            if (v0_9 == null) {
	                v0_9 = new android.app.AlertDialog$Builder(p10);
	            }
	            String v1_5;
	            android.content.res.Resources v5_1 = p10.getResources();
	            switch (p9) {
	                case 1:
	                    int v6_0 = p10.getResources();
	                    if (v6_0 == 0) {
	                        v2_0 = 0;
	                    } else {
	                        String v1_16;
	                        if ((v6_0.getConfiguration().screenLayout & 15) <= 3) {
	                            v1_16 = 0;
	                        } else {
	                            v1_16 = 1;
	                        }
	                        if ((!a.a(11)) || (v1_16 == null)) {
	                            String v1_18;
	                            String v1_17 = v6_0.getConfiguration();
	                            if (!a.a(13)) {
	                                v1_18 = 0;
	                            } else {
	                                if (((v1_17.screenLayout & 15) > 3) || (v1_17.smallestScreenWidthDp < 600)) {
	                                    v1_18 = 0;
	                                } else {
	                                    v1_18 = 1;
	                                }
	                            }
	                            if (v1_18 == null) {
	                            }
	                        }
	                    }
	                    if (v2_0 == 0) {
	                        v1_5 = v5_1.getString(a.hs);
	                    } else {
	                        v1_5 = v5_1.getString(a.ht);
	                    }
	                    break;
	                case 2:
	                case 18:
	                    v1_5 = v5_1.getString(a.hF);
	                    break;
	                case 3:
	                    v1_5 = v5_1.getString(a.hp);
	                    break;
	                case 5:
	                    v1_5 = v5_1.getString(a.hv);
	                    break;
	                case 7:
	                    v1_5 = v5_1.getString(a.hx);
	                    break;
	                case 9:
	                    v1_5 = v5_1.getString(a.hC);
	                    break;
	                case 16:
	                    v1_5 = v5_1.getString(a.hH);
	                    break;
	                case 17:
	                    v1_5 = v5_1.getString(a.hz);
	                    break;
	                case 42:
	                    v1_5 = v5_1.getString(a.hm);
	                    break;
	                default:
	                    v1_5 = v5_1.getString(a.hB);
	            }
	            v0_9.setMessage(v1_5);
	            if (p13 != null) {
	                v0_9.setOnCancelListener(p13);
	            }
	            String v1_24;
	            int v2_1 = bvt.a(p9);
	            if (p11 != null) {
	                v1_24 = new bym(p11, v2_1, p12);
	            } else {
	                v1_24 = new bym(p10, v2_1, p12);
	            }
	            int v2_3;
	            int v2_2 = p10.getResources();
	            switch (p9) {
	                case 1:
	                    v2_3 = v2_2.getString(a.hr);
	                    break;
	                case 2:
	                case 18:
	                case 42:
	                    v2_3 = v2_2.getString(a.hE);
	                    break;
	                case 3:
	                    v2_3 = v2_2.getString(a.ho);
	                    break;
	                default:
	                    v2_3 = v2_2.getString(17039370);
	            }
	            if (v2_3 != 0) {
	                v0_9.setPositiveButton(v2_3, v1_24);
	            }
	            String v1_26 = p10.getResources();
	            switch (p9) {
	                case 1:
	                    v4 = v1_26.getString(a.hu);
	                    break;
	                case 2:
	                case 18:
	                    v4 = v1_26.getString(a.hG);
	                    break;
	                case 3:
	                    v4 = v1_26.getString(a.hq);
	                case 4:
	                case 6:
	                    break;
	                case 5:
	                    android.util.Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
	                    v4 = v1_26.getString(a.hw);
	                case 4:
	                case 6:
	                    break;
	                case 7:
	                    android.util.Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
	                    v4 = v1_26.getString(a.hy);
	                    break;
	                case 8:
	                    android.util.Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
	                    break;
	                case 9:
	                    android.util.Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
	                    v4 = v1_26.getString(a.hD);
	                    break;
	                case 10:
	                    android.util.Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
	                    break;
	                case 11:
	                    android.util.Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
	                    break;
	                case 16:
	                    android.util.Log.e("GooglePlayServicesUtil", "One of the API components you attempted to connect to is not available.");
	                    break;
	                case 17:
	                    android.util.Log.e("GooglePlayServicesUtil", "The specified account could not be signed in.");
	                    v4 = v1_26.getString(a.hA);
	                    break;
	                case 42:
	                    v4 = v1_26.getString(a.hn);
	                    break;
	                default:
	                    android.util.Log.e("GooglePlayServicesUtil", new StringBuilder("Unexpected error code ").append(p9).toString());
	            }
	            if (v4 != null) {
	                v0_9.setTitle(v4);
	            }
	            v0_12 = v0_9.create();
	        } else {
	            v0_12 = 0;
	        }
	        return v0_12;
	    }
	
	
	    public static void b(android.content.Context p5)
	    {
	        int v0 = bvt.a(p5);
	        if (v0 == 0) {
	            return;
	        } else {
	            bvr v1_0 = bvt.a(v0);
	            android.util.Log.e("GooglePlayServicesUtil", new StringBuilder("GooglePlayServices not available due to error ").append(v0).toString());
	            if (v1_0 != null) {
	                throw new bvs(v0, "Google Play Services not available", v1_0);
	            } else {
	                throw new bvr(v0);
	            }
	        }
	    }
	
	
	    public static boolean b(int p1)
	    {
	        int v0;
	        switch (p1) {
	            case 1:
	            case 2:
	            case 3:
	            case 9:
	                v0 = 1;
	                break;
	            case 4:
	            case 5:
	            case 6:
	            case 7:
	            case 8:
	            default:
	                v0 = 0;
	                break;
	        }
	        return v0;
	    }
	
	
	    public static boolean b(android.content.Context p2, int p3)
	    {
	        int v0_0 = 1;
	        if (p3 != 18) {
	            if (p3 != 1) {
	                v0_0 = 0;
	            } else {
	                v0_0 = bvt.a(p2, "com.google.android.gms");
	            }
	        }
	        return v0_0;
	    }
	
	
	    private static boolean b(android.content.pm.PackageManager p8)
	    {
	        int v0_0 = 1;
	        try {
	            if (bvt.c == -1) {
	                try {
	                    int v3_2 = p8.getPackageInfo("com.google.android.gms", 64);
	                    bvu.a();
	                    cah[] v4_3 = new cah[1];
	                    v4_3[0] = cag.a[1];
	                } catch (int v3) {
	                    bvt.c = 0;
	                }
	                if (bvu.a(v3_2, v4_3) == null) {
	                    bvt.c = 0;
	                } else {
	                    bvt.c = 1;
	                }
	            }
	        } catch (int v0_1) {
	            throw v0_1;
	        }
	        if (bvt.c == 0) {
	            v0_0 = 0;
	        }
	        return v0_0;
	    }
	
	
	    public static void c(android.content.Context p2)
	    {
	        try {
	            ((android.app.NotificationManager) p2.getSystemService("notification")).cancel(10436);
	        } catch (SecurityException v0) {
	        }
	        return;
	    }
	
