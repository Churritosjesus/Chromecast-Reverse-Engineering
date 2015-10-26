	static final  i
	final android.content.ComponentName j
	  k
	 ut l
	private final ux m
	private final java.util.ArrayList n
	private  o
	private  p
	
	    static us()
	    {
	        us.i = android.util.Log.isLoggable("MediaRouteProviderProxy", 3);
	        return;
	    }
	
	
	    public us(android.content.Context p2, android.content.ComponentName p3)
	    {
	        this(p2, new tt(p3));
	        this.n = new java.util.ArrayList();
	        this.j = p3;
	        this.m = new ux(this);
	        return;
	    }
	
	
	    static synthetic ux a(us p1)
	    {
	        return p1.m;
	    }
	
	
	    static synthetic void a(us p4, ut p5)
	    {
	        if (p4.l == p5) {
	            p4.p = 1;
	            int v2 = p4.n.size();
	            ut v1_0 = 0;
	            while (v1_0 < v2) {
	                ((uw) p4.n.get(v1_0)).a(p4.l);
	                v1_0++;
	            }
	            tp v0_4 = p4.e;
	            if (v0_4 != null) {
	                p4.l.a(v0_4);
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void a(us p2, ut p3, String p4)
	    {
	        if (p2.l == p3) {
	            if (us.i) {
	                new StringBuilder().append(p2).append(": Service connection error - ").append(p4);
	            }
	            p2.e();
	        }
	        return;
	    }
	
	
	    static synthetic void a(us p2, ut p3, tv p4)
	    {
	        if (p2.l == p3) {
	            if (us.i) {
	                new StringBuilder().append(p2).append(": Descriptor changed, descriptor=").append(p4);
	            }
	            p2.a(p4);
	        }
	        return;
	    }
	
	
	    static synthetic void a(us p1, uw p2)
	    {
	        p1.n.remove(p2);
	        p2.d();
	        p1.b();
	        return;
	    }
	
	
	    static synthetic void b(us p2, ut p3)
	    {
	        if (p2.l == p3) {
	            if (us.i) {
	                new StringBuilder().append(p2).append(": Service connection died");
	            }
	            p2.g();
	        }
	        return;
	    }
	
	
	    static synthetic boolean f()
	    {
	        return us.i;
	    }
	
	
	    private void g()
	    {
	        if (this.l != null) {
	            this.a(0);
	            this.p = 0;
	            int v3_0 = this.n.size();
	            ux v1_0 = 0;
	            while (v1_0 < v3_0) {
	                ((uw) this.n.get(v1_0)).d();
	                v1_0++;
	            }
	            ut v0_2 = this.l;
	            v0_2.a(2, 0, 0, 0, 0);
	            v0_2.b.a.clear();
	            v0_2.a.getBinder().unlinkToDeath(v0_2, 0);
	            v0_2.h.m.post(new uu(v0_2));
	            this.l = 0;
	        }
	        return;
	    }
	
	
	    public final tu a(String p5)
	    {
	        int v0_2;
	        int v0_0 = this.g;
	        if (v0_0 == 0) {
	            v0_2 = 0;
	        } else {
	            java.util.List v2 = v0_0.a();
	            int v3 = v2.size();
	            ut v1_0 = 0;
	            while (v1_0 < v3) {
	                if (!((tn) v2.get(v1_0)).a().equals(p5)) {
	                    v1_0++;
	                } else {
	                    v0_2 = new uw(this, p5);
	                    this.n.add(v0_2);
	                    if (this.p) {
	                        v0_2.a(this.l);
	                    }
	                    this.b();
	                }
	            }
	        }
	        return v0_2;
	    }
	
	
	    public final void a()
	    {
	        if (!this.k) {
	            if (us.i) {
	                new StringBuilder().append(this).append(": Starting");
	            }
	            this.k = 1;
	            this.b();
	        }
	        return;
	    }
	
	
	    void b()
	    {
	        if (!this.c()) {
	            this.e();
	        } else {
	            this.d();
	        }
	        return;
	    }
	
	
	    public final void b(tp p2)
	    {
	        if (this.p) {
	            this.l.a(p2);
	        }
	        this.b();
	        return;
	    }
	
	
	    boolean c()
	    {
	        int v0 = 1;
	        if ((!this.k) || ((this.e == null) && (this.n.isEmpty()))) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    void d()
	    {
	        if (!this.o) {
	            if (us.i) {
	                new StringBuilder().append(this).append(": Binding");
	            }
	            StringBuilder v0_6 = new android.content.Intent("android.media.MediaRouteProviderService");
	            v0_6.setComponent(this.j);
	            try {
	                this.o = this.a.bindService(v0_6, this, 1);
	            } catch (StringBuilder v0) {
	                if (us.i) {
	                    new StringBuilder().append(this).append(": Bind failed");
	                }
	            }
	            if ((!this.o) && (us.i)) {
	                new StringBuilder().append(this).append(": Bind failed");
	            }
	        }
	        return;
	    }
	
	
	    void e()
	    {
	        if (this.o) {
	            if (us.i) {
	                new StringBuilder().append(this).append(": Unbinding");
	            }
	            this.o = 0;
	            this.g();
	            this.a.unbindService(this);
	        }
	        return;
	    }
	
	
	    public final void onServiceConnected(android.content.ComponentName p4, android.os.IBinder p5)
	    {
	        if (us.i) {
	            new StringBuilder().append(this).append(": Connected");
	        }
	        if (this.o) {
	            StringBuilder v0_5;
	            this.g();
	            if (p5 == null) {
	                v0_5 = 0;
	            } else {
	                v0_5 = new android.os.Messenger(p5);
	            }
	            if (!a.a(v0_5)) {
	                android.util.Log.e("MediaRouteProviderProxy", new StringBuilder().append(this).append(": Service returned invalid messenger binder").toString());
	            } else {
	                String v1_8 = new ut(this, v0_5);
	                if (!v1_8.a()) {
	                    if (us.i) {
	                        new StringBuilder().append(this).append(": Registration failed");
	                    }
	                } else {
	                    this.l = v1_8;
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void onServiceDisconnected(android.content.ComponentName p3)
	    {
	        if (us.i) {
	            new StringBuilder().append(this).append(": Service disconnected");
	        }
	        this.g();
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("Service connection ").append(this.j.flattenToShortString()).toString();
	    }
	
