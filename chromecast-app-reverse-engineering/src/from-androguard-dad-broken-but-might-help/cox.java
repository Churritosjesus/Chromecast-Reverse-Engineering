	private static bridge cox d
	public final android.content.Context a
	public final coz b
	public java.lang.Thread$UncaughtExceptionHandler c
	private final java.util.List e
	private bridge cpe f
	
	    private cox(android.content.Context p2)
	    {
	        cos v0_0 = p2.getApplicationContext();
	        a.c(v0_0);
	        this.a = v0_0;
	        this.b = new coz(this);
	        this.e = new java.util.concurrent.CopyOnWriteArrayList();
	        new cos();
	        return;
	    }
	
	
	    public static cox a(android.content.Context p2)
	    {
	        a.c(p2);
	        if (cox.d == null) {
	            if (cox.d == null) {
	                cox.d = new cox(p2);
	            }
	        }
	        return cox.d;
	    }
	
	
	    static synthetic java.util.List a(cox p1)
	    {
	        return p1.e;
	    }
	
	
	    static synthetic void a(cox p5, cou p6)
	    {
	        a.h("deliver should be called from worker thread");
	        a.b(p6.c, "Measurement must be submitted");
	        cpd v0_2 = p6.i;
	        if (!v0_2.isEmpty()) {
	            java.util.HashSet v1_3 = new java.util.HashSet();
	            java.util.Iterator v2 = v0_2.iterator();
	            while (v2.hasNext()) {
	                cpd v0_5 = ((cpd) v2.next());
	                android.net.Uri v3 = v0_5.a();
	                if (!v1_3.contains(v3)) {
	                    v1_3.add(v3);
	                    v0_5.a(p6);
	                }
	            }
	        }
	        return;
	    }
	
	
	    static synthetic Thread$UncaughtExceptionHandler b(cox p1)
	    {
	        return p1.c;
	    }
	
	
	    public static void b()
	    {
	        if ((Thread.currentThread() instanceof cpc)) {
	            return;
	        } else {
	            throw new IllegalStateException("Call expected from worker thread");
	        }
	    }
	
	
	    public final cpe a()
	    {
	        if (this.f == null) {
	            try {
	                if (this.f == null) {
	                    cpe v2_1 = new cpe();
	                    String v3_0 = this.a.getPackageManager();
	                    String v1 = this.a.getPackageName();
	                    v2_1.c = v1;
	                    v2_1.d = v3_0.getInstallerPackageName(v1);
	                    String v0_5 = 0;
	                    try {
	                        String v4_2 = v3_0.getPackageInfo(this.a.getPackageName(), 0);
	                    } catch (String v3) {
	                        android.util.Log.e("GAv4", new StringBuilder("Error retrieving package info: appName set to ").append(v1).toString());
	                        v2_1.a = v1;
	                        v2_1.b = v0_5;
	                        this.f = v2_1;
	                    }
	                    if (v4_2 == null) {
	                    } else {
	                        String v3_1 = v3_0.getApplicationLabel(v4_2.applicationInfo);
	                        if (!android.text.TextUtils.isEmpty(v3_1)) {
	                            v1 = v3_1.toString();
	                        }
	                        v0_5 = v4_2.versionName;
	                    }
	                }
	            } catch (String v0_6) {
	                throw v0_6;
	            }
	        }
	        return this.f;
	    }
	
	
	    public final java.util.concurrent.Future a(java.util.concurrent.Callable p2)
	    {
	        java.util.concurrent.Future v0_3;
	        a.c(p2);
	        if (!(Thread.currentThread() instanceof cpc)) {
	            v0_3 = this.b.submit(p2);
	        } else {
	            v0_3 = new java.util.concurrent.FutureTask(p2);
	            v0_3.run();
	        }
	        return v0_3;
	    }
	
	
	    public final void a(Runnable p2)
	    {
	        a.c(p2);
	        this.b.submit(p2);
	        return;
	    }
	
