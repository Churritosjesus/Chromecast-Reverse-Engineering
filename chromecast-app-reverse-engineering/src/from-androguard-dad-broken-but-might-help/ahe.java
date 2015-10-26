	private static final java.lang.String a
	private static java.util.Map d
	private static java.util.concurrent.ScheduledThreadPoolExecutor e
	private static  f
	private static  g
	private static android.content.Context h
	private static java.lang.Object i
	private static java.lang.String j
	private final java.lang.String b
	private final ahk c
	
	    static ahe()
	    {
	        ahe.a = ahe.getCanonicalName();
	        ahe.d = new java.util.concurrent.ConcurrentHashMap();
	        ahe.f = aho.a;
	        ahe.i = new Object();
	        return;
	    }
	
	
	    private ahe(android.content.Context p8, String p9, afb p10)
	    {
	        ajp.a(p8, "context");
	        this.b = aji.c(p8);
	        java.util.concurrent.ScheduledThreadPoolExecutor v0_2 = afb.a();
	        if ((v0_2 == null) || ((p9 != null) && (!p9.equals(v0_2.g)))) {
	            if (p9 == null) {
	                p9 = aji.a(p8);
	            }
	            this.c = new ahk(0, p9);
	        } else {
	            this.c = new ahk(v0_2);
	        }
	        if (ahe.h == null) {
	            ahe.h = p8.getApplicationContext();
	        }
	        if (ahe.e == null) {
	            ahe.e = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
	            ahe.e.scheduleAtFixedRate(new ahf(), 0, 15, java.util.concurrent.TimeUnit.SECONDS);
	            ahe.e.scheduleAtFixedRate(new ahg(), 0, 86400, java.util.concurrent.TimeUnit.SECONDS);
	        } else {
	        }
	        return;
	    }
	
	
	    public static int a()
	    {
	        try {
	            return ahe.f;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public static ahe a(android.content.Context p2)
	    {
	        return new ahe(p2, 0, 0);
	    }
	
	
	    public static ahe a(android.content.Context p2, String p3)
	    {
	        return new ahe(p2, p3, 0);
	    }
	
	
	    private static ahr a(ahp p14, java.util.Set p15)
	    {
	        ahr v2_1 = new ahr();
	        String v5_0 = afv.b(ahe.h);
	        java.util.ArrayList v6_1 = new java.util.ArrayList();
	        java.util.Iterator v7 = p15.iterator();
	        while (v7.hasNext()) {
	            Object[] v0_9 = ((ahk) v7.next());
	            aht v8 = ahe.a(v0_9);
	            if (v8 != null) {
	                ahj v1_2 = v0_9.b;
	                int v9_0 = aji.a(v1_2, 0);
	                String v10_0 = new Object[1];
	                v10_0[0] = v1_2;
	                Object[] v4_3 = aga.a(0, String.format("%s/activities", v10_0), 0, 0);
	                ahj v1_4 = v4_3.d;
	                if (v1_4 == null) {
	                    v1_4 = new android.os.Bundle();
	                }
	                Object[] v0_10;
	                v1_4.putString("access_token", v0_9.a);
	                v4_3.d = v1_4;
	                if (v9_0 != 0) {
	                    ahj v1_7 = v8.a(v4_3, v9_0.a, v5_0);
	                    if (v1_7 != null) {
	                        v2_1.a = (v1_7 + v2_1.a);
	                        v4_3.a(new ahj(v0_9, v4_3, v8, v2_1));
	                        v0_10 = v4_3;
	                    } else {
	                        v0_10 = 0;
	                    }
	                } else {
	                    v0_10 = 0;
	                }
	                if (v0_10 != null) {
	                    v6_1.add(v0_10);
	                }
	            }
	        }
	        Object[] v0_3;
	        if (v6_1.size() <= 0) {
	            v0_3 = 0;
	        } else {
	            Object[] v4_1 = new Object[2];
	            v4_1[0] = Integer.valueOf(v2_1.a);
	            v4_1[1] = p14.toString();
	            aiw.a(ags.e, ahe.a, "Flushing %d events due to %s.", v4_1);
	            ahj v1_1 = v6_1.iterator();
	            while (v1_1.hasNext()) {
	                ((aga) v1_1.next()).a();
	            }
	            v0_3 = v2_1;
	        }
	        return v0_3;
	    }
	
	
	    private static aht a(ahk p2)
	    {
	        try {
	            return ((aht) ahe.d.get(p2));
	        } catch (Throwable v0_3) {
	            throw v0_3;
	        }
	    }
	
	
	    static synthetic aht a(android.content.Context p1, ahk p2)
	    {
	        return ahe.b(p1, p2);
	    }
	
	
	    static synthetic void a(ahk p10, aga p11, agp p12, aht p13, ahr p14)
	    {
	        ahq v1_1;
	        ahq v2_0;
	        afs v3 = p12.b;
	        if (v3 == null) {
	            v2_0 = "Success";
	            v1_1 = ahq.a;
	        } else {
	            if (v3.b != -1) {
	                ahq v1_4 = new Object[2];
	                v1_4[0] = p12.toString();
	                v1_4[1] = v3.toString();
	                v2_0 = String.format("Failed:\n  Response: %s\n  Error %s", v1_4);
	                v1_1 = ahq.b;
	            } else {
	                v2_0 = "Failed: No Connectivity";
	                v1_1 = ahq.c;
	            }
	        }
	        if (afv.a(ags.e)) {
	            try {
	                ahq v0_10 = new org.json.JSONArray(((String) p11.f)).toString(2);
	            } catch (ahq v0) {
	                v0_10 = "<Can\'t encode events for debug logging>";
	            }
	            Object[] v7_1 = new Object[3];
	            v7_1[0] = p11.c.toString();
	            v7_1[1] = v2_0;
	            v7_1[2] = v0_10;
	            aiw.a(ags.e, ahe.a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", v7_1);
	        }
	        ahq v0_11;
	        if (v3 == null) {
	            v0_11 = 0;
	        } else {
	            v0_11 = 1;
	        }
	        p13.a(v0_11);
	        if (v1_1 == ahq.c) {
	            ahs.a(ahe.h, p10, p13);
	        }
	        if ((v1_1 != ahq.a) && (p14.b != ahq.c)) {
	            p14.b = v1_1;
	        }
	        return;
	    }
	
	
	    static synthetic void a(ahp p4)
	    {
	        if (!ahe.g) {
	            ahe.g = 1;
	            String v2_1 = new java.util.HashSet(ahe.d.keySet());
	            ahe.h();
	            try {
	                bk v0_4 = ahe.a(p4, v2_1);
	            } catch (android.content.Intent v1_0) {
	                aji.a(ahe.a, "Caught unexpected exception while flushing: ", v1_0);
	            }
	            ahe.g = 0;
	            if (v0_4 != null) {
	                android.content.Intent v1_2 = new android.content.Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
	                v1_2.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", v0_4.a);
	                v1_2.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", v0_4.b);
	                bk.a(ahe.h).a(v1_2);
	            }
	        } else {
	        }
	        return;
	    }
	
	
	    private static aht b(android.content.Context p5, ahk p6)
	    {
	        java.util.Map v1_0 = 0;
	        if (((aht) ahe.d.get(p6)) == null) {
	            v1_0 = ahx.a(p5);
	        }
	        try {
	            aht v0_6 = ((aht) ahe.d.get(p6));
	        } catch (aht v0_8) {
	            throw v0_8;
	        }
	        if (v0_6 == null) {
	            v0_6 = new aht(v1_0, p5.getPackageName(), ahe.b(p5));
	            ahe.d.put(p6, v0_6);
	        }
	        return v0_6;
	    }
	
	
	    static synthetic Object b()
	    {
	        return ahe.i;
	    }
	
	
	    private static String b(android.content.Context p4)
	    {
	        if (ahe.j == null) {
	            try {
	                if (ahe.j == null) {
	                    android.content.SharedPreferences$Editor v0_4 = p4.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", 0);
	                    ahe.j = v0_4;
	                    if (v0_4 == null) {
	                        android.content.SharedPreferences$Editor v0_9;
	                        android.content.SharedPreferences$Editor v0_7 = String.valueOf(java.util.UUID.randomUUID().toString());
	                        if (v0_7.length() == 0) {
	                            v0_9 = new String("XZ");
	                        } else {
	                            v0_9 = "XZ".concat(v0_7);
	                        }
	                        ahe.j = v0_9;
	                        p4.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", ahe.j).apply();
	                    }
	                }
	            } catch (android.content.SharedPreferences$Editor v0_14) {
	                throw v0_14;
	            }
	        }
	        return ahe.j;
	    }
	
	
	    static synthetic java.util.Map c()
	    {
	        return ahe.d;
	    }
	
	
	    static synthetic void d()
	    {
	        try {
	            if ((ahe.a() != aho.b) && (ahe.g() > 100)) {
	                afv.d().execute(new ahi(ahp.b));
	            }
	        } catch (ahp v0_3) {
	            throw v0_3;
	        }
	        return;
	    }
	
	
	    static synthetic android.content.Context e()
	    {
	        return ahe.h;
	    }
	
	
	    static synthetic String f()
	    {
	        return ahe.a;
	    }
	
	
	    private static int g()
	    {
	        try {
	            java.util.Iterator v3 = ahe.d.values().iterator();
	            int v1_2 = 0;
	        } catch (int v0_6) {
	            throw v0_6;
	        }
	        while (v3.hasNext()) {
	            v1_2 = (((aht) v3.next()).a() + v1_2);
	        }
	        return v1_2;
	    }
	
	
	    private static int h()
	    {
	        ahs v2 = ahs.a(ahe.h);
	        java.util.Iterator v3 = v2.a.keySet().iterator();
	        int v1_2 = 0;
	        while (v3.hasNext()) {
	            int v0_4 = ((ahk) v3.next());
	            int v0_6 = ((java.util.List) v2.a.get(v0_4));
	            ahe.b(ahe.h, v0_4).a(v0_6);
	            v1_2 = (v0_6.size() + v1_2);
	        }
	        return v1_2;
	    }
	
	
	    public final void a(String p3, android.os.Bundle p4)
	    {
	        this.a(p3, 0, p4, 0);
	        return;
	    }
	
	
	    public final void a(String p3, Double p4, android.os.Bundle p5)
	    {
	        this.a(p3, 0, p5, 1);
	        return;
	    }
	
	
	    void a(String p7, Double p8, android.os.Bundle p9, boolean p10)
	    {
	        afv.d().execute(new ahh(ahe.h, this.c, new ahm(this.b, p7, p8, p9, p10)));
	        return;
	    }
	
