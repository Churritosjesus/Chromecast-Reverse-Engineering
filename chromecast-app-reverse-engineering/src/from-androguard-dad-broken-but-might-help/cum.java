	private static final java.lang.Object a
	private static cum n
	private android.content.Context b
	private cvo c
	private bridge cvl d
	private  e
	private  f
	private  g
	private  h
	private  i
	private cvp j
	private android.os.Handler k
	private cwg l
	private  m
	
	    static cum()
	    {
	        cum.a = new Object();
	        return;
	    }
	
	
	    private cum()
	    {
	        this.e = 1800000;
	        this.f = 1;
	        this.g = 0;
	        this.h = 1;
	        this.i = 1;
	        this.j = new cun(this);
	        this.m = 0;
	        return;
	    }
	
	
	    public static cum a()
	    {
	        if (cum.n == null) {
	            cum.n = new cum();
	        }
	        return cum.n;
	    }
	
	
	    static synthetic boolean a(cum p1)
	    {
	        return p1.h;
	    }
	
	
	    static synthetic int b(cum p1)
	    {
	        return p1.e;
	    }
	
	
	    static synthetic boolean c(cum p1)
	    {
	        return p1.m;
	    }
	
	
	    static synthetic android.os.Handler d(cum p1)
	    {
	        return p1.k;
	    }
	
	
	    static synthetic cvo e(cum p1)
	    {
	        return p1.c;
	    }
	
	
	    static synthetic Object e()
	    {
	        return cum.a;
	    }
	
	
	    final declared_synchronized void a(android.content.Context p2, cvl p3)
	    {
	        try {
	            if (this.b == null) {
	                this.b = p2.getApplicationContext();
	                if (this.d == null) {
	                    this.d = p3;
	                }
	            }
	        } catch (cvl v0_3) {
	            throw v0_3;
	        }
	        return;
	    }
	
	
	    final declared_synchronized void a(boolean p2)
	    {
	        try {
	            this.a(this.m, p2);
	            return;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    final declared_synchronized void a(boolean p5, boolean p6)
	    {
	        try {
	            if ((this.m != p5) || (this.h != p6)) {
	                if (((p5) || (!p6)) && (this.e > 0)) {
	                    this.k.removeMessages(1, cum.a);
	                }
	                if ((!p5) && ((p6) && (this.e > 0))) {
	                    this.k.sendMessageDelayed(this.k.obtainMessage(1, cum.a), ((long) this.e));
	                }
	                String v0_7;
	                android.os.Message v1_4 = new StringBuilder("PowerSaveMode ");
	                if ((!p5) && (p6)) {
	                    v0_7 = "terminated.";
	                } else {
	                    v0_7 = "initiated.";
	                }
	                cuh.e(v1_4.append(v0_7).toString());
	                this.m = p5;
	                this.h = p6;
	            }
	        } catch (String v0_8) {
	            throw v0_8;
	        }
	        return;
	    }
	
	
	    final declared_synchronized cvo b()
	    {
	        try {
	            if (this.c == null) {
	                if (this.b != null) {
	                    this.c = new cwl(this.j, this.b);
	                } else {
	                    throw new IllegalStateException("Cant get a store unless we have a context");
	                }
	            }
	        } catch (cwg v0_20) {
	            throw v0_20;
	        }
	        if (this.k == null) {
	            this.k = new android.os.Handler(this.b.getMainLooper(), new cuo(this));
	            if (this.e > 0) {
	                this.k.sendMessageDelayed(this.k.obtainMessage(1, cum.a), ((long) this.e));
	            }
	        }
	        this.g = 1;
	        if (this.f) {
	            this.c();
	            this.f = 0;
	        }
	        if ((this.l == null) && (this.i)) {
	            this.l = new cwg(this);
	            cwg v0_16 = this.l;
	            android.content.Context v1_5 = this.b;
	            android.content.IntentFilter v2_7 = new android.content.IntentFilter();
	            v2_7.addAction("android.net.conn.CONNECTIVITY_CHANGE");
	            v1_5.registerReceiver(v0_16, v2_7);
	            android.content.IntentFilter v2_9 = new android.content.IntentFilter();
	            v2_9.addAction("com.google.analytics.RADIO_POWERED");
	            v2_9.addCategory(v1_5.getPackageName());
	            v1_5.registerReceiver(v0_16, v2_9);
	        }
	        return this.c;
	    }
	
	
	    public final declared_synchronized void c()
	    {
	        try {
	            if (this.g) {
	                this.d.a(new cup(this));
	            } else {
	                cuh.e("Dispatch call queued. Dispatch will run once initialization is complete.");
	                this.f = 1;
	            }
	        } catch (cvl v0_4) {
	            throw v0_4;
	        }
	        return;
	    }
	
	
	    final declared_synchronized void d()
	    {
	        try {
	            if ((!this.m) && ((this.h) && (this.e > 0))) {
	                this.k.removeMessages(1, cum.a);
	                this.k.sendMessage(this.k.obtainMessage(1, cum.a));
	            }
	        } catch (android.os.Handler v0_5) {
	            throw v0_5;
	        }
	        return;
	    }
	
