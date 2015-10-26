	private static final  b
	private static final  c
	private static final  d
	private static final  e
	public java.util.List a
	private android.content.Context f
	private ayx g
	private azm h
	private android.os.Handler i
	private java.lang.Runnable j
	private  k
	private final blp l
	
	    static ayq()
	    {
	        ayq.b = ((int) java.util.concurrent.TimeUnit.SECONDS.toSeconds(1));
	        int v0_5 = ((int) java.util.concurrent.TimeUnit.MILLISECONDS.toMillis(1000));
	        ayq.c = v0_5;
	        ayq.d = (v0_5 * 10);
	        ayq.e = ((int) java.util.concurrent.TimeUnit.SECONDS.toMillis(3));
	        return;
	    }
	
	
	    public ayq(android.content.Context p4)
	    {
	        this.k = 0;
	        this.f = p4.getApplicationContext();
	        this.l = new blp("LegacyDeviceManager", 0);
	        this.g = new ayx(this);
	        this.a = new java.util.ArrayList();
	        this.i = new android.os.Handler(android.os.Looper.getMainLooper());
	        this.j = new ayr(this);
	        return;
	    }
	
	
	    private void a(int p4)
	    {
	        if (this.k != p4) {
	            java.util.List v0_2 = new Object[1];
	            v0_2[0] = Integer.valueOf(p4);
	            this.k = p4;
	            java.util.List v0_3 = this.g();
	            if (v0_3 != null) {
	                this.i.post(new ayu(this, v0_3, p4));
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void a(ayq p7)
	    {
	        aym v1_0 = 0;
	        long v2_0 = System.currentTimeMillis();
	        try {
	            java.util.Iterator v5_0 = p7.g.a.iterator();
	        } catch (ayw v0_19) {
	            throw v0_19;
	        }
	        while (v5_0.hasNext()) {
	            if (((ayv) v5_0.next()).a(v2_0)) {
	                v5_0.remove();
	            }
	        }
	        java.util.Iterator v5_1 = p7.g.b.iterator();
	        while (v5_1.hasNext()) {
	            ayw v0_13 = ((ayv) v5_1.next());
	            if ((v0_13.f) || (v0_13.a(v2_0))) {
	                if (v1_0 == null) {
	                    v1_0 = new java.util.LinkedList();
	                }
	                v1_0.add(v0_13.b);
	                v5_1.remove();
	            }
	        }
	        if (v1_0 != null) {
	            long v2_1 = p7.g();
	            if (v2_1 != 0) {
	                java.util.Iterator v3 = v1_0.iterator();
	                while (v3.hasNext()) {
	                    aym v1_3 = ((aym) v3.next());
	                    java.util.Iterator v4 = v2_1.iterator();
	                    while (v4.hasNext()) {
	                        ((ayw) v4.next()).b(v1_3);
	                    }
	                }
	            }
	        }
	        p7.i.postDelayed(p7.j, ((long) ayq.e));
	        return;
	    }
	
	
	    static synthetic void a(ayq p1, int p2)
	    {
	        p1.a(2);
	        return;
	    }
	
	
	    static synthetic void a(ayq p9, azu p10)
	    {
	        ayt v2_0 = System.currentTimeMillis();
	        int v1_0 = android.net.Uri.parse(p10.a);
	        ayl v4_0 = v1_0.getHost();
	        try {
	            if (v4_0 != null) {
	                aym v6_0 = p9.g.a.iterator();
	                while (v6_0.hasNext()) {
	                    bfe v0_13 = ((ayv) v6_0.next());
	                    if (v0_13.a.equals(p10.b)) {
	                        if (!v0_13.f) {
	                            if (!v0_13.b.b.equals(v4_0)) {
	                                v0_13.f = 1;
	                            } else {
	                                v0_13.e = v2_0;
	                            }
	                        }
	                    }
	                }
	                aym v6_1 = p9.g.b.iterator();
	                while (v6_1.hasNext()) {
	                    bfe v0_11 = ((ayv) v6_1.next());
	                    if (v0_11.a.equals(p10.b)) {
	                        if (!v0_11.f) {
	                            if (!v0_11.b.b.equals(v4_0)) {
	                                v0_11.f = 1;
	                            } else {
	                                v0_11.e = v2_0;
	                            }
	                        }
	                    }
	                }
	                bfe v0_8 = new ayv(p9);
	                v0_8.b = new aym(v4_0);
	                v0_8.a = p10.b;
	                v0_8.e = v2_0;
	                v0_8.c = new ayl(v1_0, v0_8.b);
	                ayt v2_4 = new bfd[1];
	                v2_4[0] = v0_8.c;
	                v0_8.d = new bfe(v2_4);
	                v0_8.d.a = new ayt(p9, v0_8);
	                p9.g.a.add(v0_8);
	                v0_8.d.a();
	            }
	        } catch (bfe v0_14) {
	            throw v0_14;
	        }
	        return;
	    }
	
	
	    static synthetic void b(ayq p0)
	    {
	        p0.e();
	        return;
	    }
	
	
	    static synthetic ayx c(ayq p1)
	    {
	        return p1.g;
	    }
	
	
	    static synthetic blp d(ayq p1)
	    {
	        return p1.l;
	    }
	
	
	    static synthetic java.util.List e(ayq p1)
	    {
	        return p1.g();
	    }
	
	
	    static synthetic int f()
	    {
	        return ayq.d;
	    }
	
	
	    private java.util.List g()
	    {
	        java.util.ArrayList v0_0 = 0;
	        try {
	            if (!this.a.isEmpty()) {
	                v0_0 = new java.util.ArrayList(this.a);
	            }
	        } catch (java.util.ArrayList v0_2) {
	            throw v0_2;
	        }
	        return v0_0;
	    }
	
	
	    public final void a()
	    {
	        try {
	            this.a.clear();
	            return;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public final void a(ayw p4)
	    {
	        try {
	            if (!this.a.contains(p4)) {
	                this.a.add(p4);
	                return;
	            } else {
	                throw new IllegalArgumentException("the same listener cannot be added twice");
	            }
	        } catch (java.util.List v0_5) {
	            throw v0_5;
	        }
	    }
	
	
	    public final void b()
	    {
	        a.c();
	        if (this.h == null) {
	            this.h = new azm(this.f, "urn:dial-multiscreen-org:service:dial:1", ayq.b, ayq.c, this.i);
	            this.h.a = new ays(this);
	        }
	        this.a(1);
	        this.h.a();
	        this.i.postDelayed(this.j, ((long) ayq.e));
	        return;
	    }
	
	
	    public final void c()
	    {
	        a.c();
	        if (this.h != null) {
	            bfe v0_1 = this.h;
	            v0_1.c();
	            v0_1.b();
	            this.i.removeCallbacksAndMessages(0);
	            try {
	                java.util.Iterator v2 = this.g.a.iterator();
	            } catch (bfe v0_12) {
	                throw v0_12;
	            }
	            while (v2.hasNext()) {
	                bfe v0_10 = ((ayv) v2.next());
	                if (v0_10.d != null) {
	                    v0_10.d.b();
	                }
	            }
	            this.g.a.clear();
	        }
	        this.a(0);
	        return;
	    }
	
	
	    public final java.util.List d()
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList();
	        try {
	            java.util.Iterator v3 = this.g.b.iterator();
	        } catch (aym v0_6) {
	            throw v0_6;
	        }
	        while (v3.hasNext()) {
	            aym v0_4 = ((ayv) v3.next());
	            if (!v0_4.f) {
	                v1_1.add(v0_4.b);
	            }
	        }
	        return v1_1;
	    }
	
	
	    void e()
	    {
	        try {
	            this.g.a.clear();
	        } catch (ayv v0_12) {
	            throw v0_12;
	        }
	        if (!this.g.b.isEmpty()) {
	            java.util.List v3 = this.g();
	            if (v3 != null) {
	                java.util.Iterator v4 = this.g.b.iterator();
	                while (v4.hasNext()) {
	                    ayv v0_11 = ((ayv) v4.next());
	                    java.util.Iterator v5 = v3.iterator();
	                    while (v5.hasNext()) {
	                        ((ayw) v5.next()).b(v0_11.b);
	                    }
	                }
	            }
	            this.g.b.clear();
	        }
	        return;
	    }
	
