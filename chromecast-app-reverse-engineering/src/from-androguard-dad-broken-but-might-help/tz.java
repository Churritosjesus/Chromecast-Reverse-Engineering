	public static uc a
	private static final  d
	final android.content.Context b
	final java.util.ArrayList c
	
	    static tz()
	    {
	        tz.d = android.util.Log.isLoggable("MediaRouter", 3);
	        return;
	    }
	
	
	    tz(android.content.Context p2)
	    {
	        this.c = new java.util.ArrayList();
	        this.b = p2;
	        return;
	    }
	
	
	    public static java.util.List a()
	    {
	        tz.f();
	        return tz.a.c;
	    }
	
	
	    public static tz a(android.content.Context p6)
	    {
	        if (p6 != null) {
	            tz.f();
	            if (tz.a == null) {
	                Runnable v0_2 = new uc(p6.getApplicationContext());
	                tz.a = v0_2;
	                v0_2.f = new uz(v0_2.a, v0_2);
	                Runnable v0_3 = v0_2.f;
	                if (!v0_3.c) {
	                    v0_3.c = 1;
	                    android.os.Handler v1_6 = new android.content.IntentFilter();
	                    v1_6.addAction("android.intent.action.PACKAGE_ADDED");
	                    v1_6.addAction("android.intent.action.PACKAGE_REMOVED");
	                    v1_6.addAction("android.intent.action.PACKAGE_CHANGED");
	                    v1_6.addAction("android.intent.action.PACKAGE_REPLACED");
	                    v1_6.addAction("android.intent.action.PACKAGE_RESTARTED");
	                    v1_6.addDataScheme("package");
	                    v0_3.a.registerReceiver(v0_3.d, v1_6, 0, v0_3.b);
	                    v0_3.b.post(v0_3.e);
	                }
	            }
	            return tz.a.a(p6);
	        } else {
	            throw new IllegalArgumentException("context must not be null");
	        }
	    }
	
	
	    public static void a(uh p2)
	    {
	        if (p2 != null) {
	            tz.f();
	            if (tz.d) {
	                new StringBuilder("selectRoute: ").append(p2);
	            }
	            tz.a.a(p2, 3);
	            return;
	        } else {
	            throw new IllegalArgumentException("route must not be null");
	        }
	    }
	
	
	    static boolean a(Object p1, Object p2)
	    {
	        if ((p1 != p2) && ((p1 == null) || ((p2 == null) || (!p1.equals(p2))))) {
	            boolean v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public static boolean a(tx p2, int p3)
	    {
	        if (p2 != null) {
	            tz.f();
	            return tz.a.a(p2, 1);
	        } else {
	            throw new IllegalArgumentException("selector must not be null");
	        }
	    }
	
	
	    private int b(ua p4)
	    {
	        int v2 = this.c.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            if (((ub) this.c.get(v1)).b != p4) {
	                v1++;
	            } else {
	                int v0_1 = v1;
	            }
	            return v0_1;
	        }
	        v0_1 = -1;
	        return v0_1;
	    }
	
	
	    public static java.util.List b()
	    {
	        tz.f();
	        return tz.a.d;
	    }
	
	
	    public static uh c()
	    {
	        tz.f();
	        return tz.a.a();
	    }
	
	
	    public static uh d()
	    {
	        tz.f();
	        return tz.a.b();
	    }
	
	
	    public static dm e()
	    {
	        return 0;
	    }
	
	
	    public static void f()
	    {
	        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
	            return;
	        } else {
	            throw new IllegalStateException("The media router service must only be accessed on the application\'s main thread.");
	        }
	    }
	
	
	    static synthetic boolean g()
	    {
	        return tz.d;
	    }
	
	
	    public final void a(tx p6, ua p7, int p8)
	    {
	        tx v2 = 1;
	        tx v3_0 = 0;
	        if (p6 != null) {
	            if (p7 != null) {
	                tz.f();
	                if (tz.d) {
	                    new StringBuilder("addCallback: selector=").append(p6).append(", callback=").append(p7).append(", flags=").append(Integer.toHexString(p8));
	                }
	                uc v0_9;
	                uc v0_7 = this.b(p7);
	                if (v0_7 >= null) {
	                    v0_9 = ((ub) this.c.get(v0_7));
	                } else {
	                    v0_9 = new ub(this, p7);
	                    this.c.add(v0_9);
	                }
	                tx v1_9;
	                if (((v0_9.d ^ -1) & p8) == 0) {
	                    v1_9 = 0;
	                } else {
	                    v0_9.d = (v0_9.d | p8);
	                    v1_9 = 1;
	                }
	                java.util.List v4_0 = v0_9.c;
	                if (p6 != null) {
	                    v4_0.b();
	                    p6.b();
	                    v3_0 = v4_0.b.containsAll(p6.b);
	                }
	                if (v3_0 != null) {
	                    v2 = v1_9;
	                } else {
	                    v0_9.c = new ty(v0_9.c).a(p6).a();
	                }
	                if (v2 != null) {
	                    tz.a.c();
	                }
	                return;
	            } else {
	                throw new IllegalArgumentException("callback must not be null");
	            }
	        } else {
	            throw new IllegalArgumentException("selector must not be null");
	        }
	    }
	
	
	    public final void a(ua p3)
	    {
	        if (p3 != null) {
	            tz.f();
	            if (tz.d) {
	                new StringBuilder("removeCallback: callback=").append(p3);
	            }
	            uc v0_3 = this.b(p3);
	            if (v0_3 >= null) {
	                this.c.remove(v0_3);
	                tz.a.c();
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("callback must not be null");
	        }
	    }
	
