	private static final blp a
	private static com.google.android.gms.common.api.GoogleApiClient b
	
	    static bkq()
	    {
	        bkq.a = new blp("FeedbackHelper", 0);
	        return;
	    }
	
	
	    private static String a(android.app.Activity p3, String p4)
	    {
	        String v0 = 0;
	        try {
	            android.content.pm.PackageManager$NameNotFoundException v1_1 = p3.getPackageManager().getPackageInfo(p4, 0);
	        } catch (android.content.pm.PackageManager$NameNotFoundException v1) {
	            return v0;
	        }
	        if (v1_1 == null) {
	            return v0;
	        } else {
	            v0 = v1_1.versionName;
	            return v0;
	        }
	    }
	
	
	    public static void a(android.app.Activity p3, baq p4)
	    {
	        android.content.Intent v0_0 = p4.e();
	        if (v0_0 == null) {
	            v0_0 = com.google.android.apps.chromecast.app.HelpActivity.a(p3, p3.getString(b.dG));
	        }
	        if (bkq.a(p3)) {
	            v0_0.putExtra("screenShot", bkq.b(p3));
	        }
	        v0_0.putExtra("feedbackSupported", 1);
	        v0_0.putParcelableArrayListExtra("feedbackDevices", p4.b_());
	        p3.startActivity(v0_0);
	        return;
	    }
	
	
	    public static void a(android.app.Activity p12, java.util.List p13)
	    {
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        blf.a(v1_1, p12);
	        bfe v0_0 = com.google.android.apps.chromecast.app.SetupApplication.a();
	        if (v0_0.k()) {
	            long v4_1 = new Object[2];
	            v4_1[0] = Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds((android.os.SystemClock.elapsedRealtime() - v0_0.k)));
	            v4_1[1] = v0_0.l;
	            v1_1.putString("last-setup-failure", String.format("%d seconds ago: %s", v4_1));
	        }
	        bkq.a(v1_1, "gms-core-version", bkq.a(p12, "com.google.android.gms"));
	        bkq.a(v1_1, "app-version-youtube", bkq.a(p12, "com.google.android.youtube"));
	        bkq.a(v1_1, "app-version-play-movies", bkq.a(p12, "com.google.android.videos"));
	        bkq.a(v1_1, "app-version-play-music", bkq.a(p12, "com.google.android.music"));
	        bkq.a(v1_1, "app-version-netflix", bkq.a(p12, "com.netflix.mediaclient"));
	        if ((p13 != null) && (!p13.isEmpty())) {
	            com.google.android.gms.common.api.GoogleApiClient v2_12 = java.util.UUID.randomUUID().toString();
	            bfe v0_10 = new Object[1];
	            v0_10[0] = v2_12;
	            long v4_2 = blf.J(p12);
	            Object[] v5_2 = new Object[1];
	            v5_2[0] = v2_12;
	            v1_1.putString("feedback-id", String.format(java.util.Locale.US, v4_2, v5_2));
	            long v4_3 = android.os.SystemClock.elapsedRealtime();
	            java.util.ArrayList v3_4 = new java.util.ArrayList();
	            java.util.ArrayList v6_4 = new java.util.ArrayList();
	            java.util.Iterator v7 = p13.iterator();
	            while (v7.hasNext()) {
	                bfe v0_29 = ((bko) v7.next());
	                if (android.text.TextUtils.isEmpty(v0_29.a)) {
	                    v3_4.add("???");
	                } else {
	                    v3_4.add(v0_29.a);
	                    bfn v8_5 = new Object[1];
	                    v8_5[0] = v0_29.a;
	                }
	                if (android.text.TextUtils.isEmpty(v0_29.c)) {
	                    v6_4.add("?");
	                } else {
	                    v6_4.add(v0_29.c);
	                }
	                if (v0_29.b != null) {
	                    bfn v8_12 = new bfn(v0_29.b, v2_12);
	                    bkr v9_1 = new bfd[1];
	                    v9_1[0] = v8_12;
	                    bfe v0_32 = new bfe(v9_1);
	                    v0_32.a = new bkr(v8_12, v4_3);
	                    v0_32.a();
	                }
	            }
	            v1_1.putString("build-Chromecast", android.text.TextUtils.join(",", v3_4));
	            v1_1.putString("type-Chromecast", android.text.TextUtils.join(",", v6_4));
	        }
	        if (bkq.b == null) {
	            bkq.b = new bwf(com.google.android.apps.chromecast.app.SetupApplication.a()).a(cib.a).b();
	        }
	        if ((!bkq.b.d()) && (!bkq.b.e())) {
	            bkq.b.b();
	        }
	        bfe v0_25 = 0;
	        com.google.android.gms.common.api.GoogleApiClient v2_20 = p12.getIntent().getExtras();
	        if (v2_20 != null) {
	            v0_25 = ((android.graphics.Bitmap) v2_20.getParcelable("screenShot"));
	        }
	        if ((v0_25 == null) && (bkq.a(p12))) {
	            v0_25 = bkq.b(p12);
	        }
	        cib.a(bkq.b, v0_25, v1_1);
	        return;
	    }
	
	
	    private static void a(android.os.Bundle p0, String p1, String p2)
	    {
	        if (p2 != null) {
	            p0.putString(p1, p2);
	        }
	        return;
	    }
	
	
	    public static boolean a()
	    {
	        return 1;
	    }
	
	
	    private static boolean a(android.app.Activity p4)
	    {
	        int v0_1;
	        if (!(p4 instanceof com.google.android.apps.chromecast.app.setup.DeviceSetupActivity)) {
	            v0_1 = 1;
	        } else {
	            int v0_3 = ((com.google.android.apps.chromecast.app.setup.DeviceSetupActivity) p4).b.a(f.ai);
	            if ((v0_3 instanceof bgr)) {
	                int v0_8;
	                if (((bgr) v0_3).a.c.isChecked()) {
	                    v0_8 = 0;
	                } else {
	                    v0_8 = 1;
	                }
	                if (v0_8 == 0) {
	                    v0_1 = 0;
	                    return v0_1;
	                }
	            }
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    private static android.graphics.Bitmap b(android.app.Activity p10)
	    {
	        try {
	            android.graphics.Bitmap v0_4;
	            android.view.View v4 = p10.getWindow().getDecorView().getRootView();
	            boolean v5 = v4.isDrawingCacheEnabled();
	            v4.setDrawingCacheEnabled(1);
	            android.graphics.Bitmap v0_3 = v4.getDrawingCache();
	        } catch (android.graphics.Bitmap v0_5) {
	            int v2_3 = new Object[1];
	            v2_3[0] = v0_5.toString();
	            v0_4 = 0;
	            return v0_4;
	        }
	        if (v0_3 == null) {
	            v0_4 = 0;
	            return v0_4;
	        } else {
	            int v3_0 = v0_3.getWidth();
	            int v2_0 = v0_3.getHeight();
	            while ((v3_0 * v2_0) > 360000) {
	                v3_0 /= 2;
	                v2_0 /= 2;
	            }
	            if (v3_0 != v0_3.getWidth()) {
	                v0_3 = android.graphics.Bitmap.createScaledBitmap(v0_3, v3_0, v2_0, 1);
	            }
	            v0_4 = v0_3.copy(android.graphics.Bitmap$Config.RGB_565, 0);
	            if (v5) {
	                return v0_4;
	            } else {
	                v4.setDrawingCacheEnabled(0);
	                v4.destroyDrawingCache();
	                return v0_4;
	            }
	        }
	    }
	
	
	    static synthetic blp b()
	    {
	        return bkq.a;
	    }
	
