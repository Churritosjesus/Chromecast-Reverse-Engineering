	private static final java.util.HashSet a
	private static bridge java.util.concurrent.Executor b
	private static bridge java.lang.String c
	private static bridge java.lang.String d
	private static bridge java.lang.String e
	private static bridge  f
	private static bridge java.lang.String g
	private static java.util.concurrent.atomic.AtomicLong h
	private static bridge  i
	private static  j
	private static android.content.Context k
	private static  l
	private static final java.lang.Object m
	private static final java.util.concurrent.BlockingQueue n
	private static final java.util.concurrent.ThreadFactory o
	private static java.lang.Boolean p
	
	    static afv()
	    {
	        afv.getCanonicalName();
	        int v1_0 = new ags[1];
	        v1_0[0] = ags.f;
	        afv.a = new java.util.HashSet(java.util.Arrays.asList(v1_0));
	        afv.g = "facebook.com";
	        afv.h = new java.util.concurrent.atomic.AtomicLong(65536);
	        afv.i = 1;
	        afv.j = 0;
	        afv.l = 64206;
	        afv.m = new Object();
	        afv.n = new java.util.concurrent.LinkedBlockingQueue(10);
	        afv.o = new afw();
	        afv.p = Boolean.valueOf(0);
	        return;
	    }
	
	
	    public afv()
	    {
	        return;
	    }
	
	
	    public static declared_synchronized void a(android.content.Context p2)
	    {
	        try {
	            afv.a(p2, 0);
	            return;
	        } catch (Throwable v1_1) {
	            throw v1_1;
	        }
	    }
	
	
	    private static declared_synchronized void a(android.content.Context p4, s p5)
	    {
	        try {
	            if (!afv.p.booleanValue()) {
	                ajp.a(p4, "applicationContext");
	                ajp.b(p4, 0);
	                ajp.a(p4, 0);
	                int v0_5 = p4.getApplicationContext();
	                afv.k = v0_5;
	                if (v0_5 != 0) {
	                    try {
	                        String v2_1 = v0_5.getPackageManager().getApplicationInfo(v0_5.getPackageName(), 128);
	                    } catch (int v0) {
	                    }
	                    if ((v2_1 != null) && (v2_1.metaData != null)) {
	                        if (afv.c == null) {
	                            int v0_10 = v2_1.metaData.get("com.facebook.sdk.ApplicationId");
	                            if (!(v0_10 instanceof String)) {
	                                if ((v0_10 instanceof Integer)) {
	                                    afv.c = v0_10.toString();
	                                }
	                            } else {
	                                afv.c = ((String) v0_10);
	                            }
	                        }
	                        if (afv.d == null) {
	                            afv.d = v2_1.metaData.getString("com.facebook.sdk.ApplicationName");
	                        }
	                        if (afv.e == null) {
	                            afv.e = v2_1.metaData.getString("com.facebook.sdk.ClientToken");
	                        }
	                        if (afv.f == 0) {
	                            afv.f = v2_1.metaData.getInt("com.facebook.sdk.WebDialogTheme");
	                        }
	                    }
	                }
	                aji.a(afv.k, afv.c);
	                aix.b();
	                aia.a(afv.k);
	                afv.k.getCacheDir();
	                afv.d().execute(new java.util.concurrent.FutureTask(new afx(0)));
	                afv.p = Boolean.valueOf(1);
	            }
	        } catch (int v0_22) {
	            throw v0_22;
	        }
	        return;
	    }
	
	
	    public static declared_synchronized boolean a()
	    {
	        try {
	            return afv.p.booleanValue();
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	    }
	
	
	    public static boolean a(ags p2)
	    {
	        try {
	            if ((!afv.i) || (!afv.a.contains(p2))) {
	                int v0_3 = 0;
	            } else {
	                v0_3 = 1;
	            }
	        } catch (int v0_4) {
	            throw v0_4;
	        }
	        return v0_3;
	    }
	
	
	    public static boolean b()
	    {
	        return afv.i;
	    }
	
	
	    public static boolean b(android.content.Context p3)
	    {
	        ajp.b();
	        return p3.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", 0);
	    }
	
	
	    public static boolean c()
	    {
	        return 0;
	    }
	
	
	    public static java.util.concurrent.Executor d()
	    {
	        if (afv.b == null) {
	            java.util.concurrent.ThreadPoolExecutor v1_0 = afv.l();
	            if (v1_0 == null) {
	                v1_0 = new java.util.concurrent.ThreadPoolExecutor(5, 128, 1, java.util.concurrent.TimeUnit.SECONDS, afv.n, afv.o);
	            }
	            afv.b = v1_0;
	        }
	        return afv.b;
	    }
	
	
	    public static String e()
	    {
	        return afv.g;
	    }
	
	
	    public static android.content.Context f()
	    {
	        ajp.b();
	        return afv.k;
	    }
	
	
	    public static long g()
	    {
	        ajp.b();
	        return afv.h.get();
	    }
	
	
	    public static String h()
	    {
	        ajp.b();
	        return afv.c;
	    }
	
	
	    public static String i()
	    {
	        ajp.b();
	        return afv.e;
	    }
	
	
	    public static int j()
	    {
	        ajp.b();
	        return afv.f;
	    }
	
	
	    public static int k()
	    {
	        ajp.b();
	        return afv.l;
	    }
	
	
	    private static java.util.concurrent.Executor l()
	    {
	        try {
	            try {
	                java.util.concurrent.Executor v0_2;
	                java.util.concurrent.Executor v0_3 = android.os.AsyncTask.getField("THREAD_POOL_EXECUTOR").get(0);
	            } catch (java.util.concurrent.Executor v0) {
	                v0_2 = 0;
	                return v0_2;
	            }
	            if (v0_3 != null) {
	                if ((v0_3 instanceof java.util.concurrent.Executor)) {
	                    v0_2 = ((java.util.concurrent.Executor) v0_3);
	                    return v0_2;
	                } else {
	                    v0_2 = 0;
	                    return v0_2;
	                }
	            } else {
	                v0_2 = 0;
	                return v0_2;
	            }
	        } catch (java.util.concurrent.Executor v0) {
	            v0_2 = 0;
	            return v0_2;
	        }
	    }
	
