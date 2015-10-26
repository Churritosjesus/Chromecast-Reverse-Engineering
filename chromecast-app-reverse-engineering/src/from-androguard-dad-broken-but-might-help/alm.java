	public final bkl a
	public final android.content.SharedPreferences b
	public final ass c
	 bmu d
	final java.util.List e
	public final java.util.List f
	public final java.util.List g
	public final java.util.List h
	public final java.util.HashSet i
	final java.util.Set j
	final java.util.Set k
	final java.util.Set l
	final java.util.List m
	private final als n
	private final java.lang.String o
	private final blp p
	private java.lang.String q
	private java.util.List r
	private final java.util.concurrent.ExecutorService s
	
	    public alm(bkl p4, android.content.SharedPreferences p5)
	    {
	        this.n = new aln(this);
	        this.p = new blp("DeviceManager");
	        this.e = new java.util.ArrayList();
	        this.f = new java.util.ArrayList();
	        this.g = java.util.Collections.synchronizedList(new java.util.ArrayList());
	        this.h = java.util.Collections.synchronizedList(new java.util.ArrayList());
	        this.j = java.util.Collections.synchronizedSet(new java.util.HashSet());
	        this.k = java.util.Collections.synchronizedSet(new java.util.HashSet());
	        this.l = java.util.Collections.synchronizedSet(new java.util.HashSet());
	        this.m = java.util.Collections.synchronizedList(new java.util.ArrayList());
	        this.a = p4;
	        this.b = p5;
	        this.o = blf.I(com.google.android.apps.chromecast.app.SetupApplication.a());
	        this.c = com.google.android.apps.chromecast.app.SetupApplication.a().j;
	        java.util.concurrent.ExecutorService v0_31 = this.b.getString("hiddenDevices", "");
	        this.i = new java.util.HashSet();
	        if (!android.text.TextUtils.isEmpty(v0_31)) {
	            this.i.addAll(java.util.Arrays.asList(v0_31.split(",")));
	        }
	        this.s = java.util.concurrent.Executors.newFixedThreadPool(4);
	        return;
	    }
	
	
	    private boolean a(int p9, int p10)
	    {
	        bmu v1_1;
	        Object[] v0_3;
	        if (p10 != alr.a) {
	            if (p10 != alr.b) {
	                Object[] v3_1 = new Object[0];
	                this.p.a("purgeStaleDevice: Unknown device list type passed in", v3_1);
	                v0_3 = 0;
	            } else {
	                v1_1 = this.h;
	                boolean v4_11;
	                Object[] v0_7 = ((aow) v1_1.get(p9));
	                v0_7.c(aoz.a);
	                v0_7.c(aoz.b);
	                v0_7.c(aoz.c);
	                if ((!v0_7.d(aoz.a)) && ((!v0_7.d(aoz.d)) && ((!v0_7.d(aoz.c)) && (!v0_7.d(aoz.b))))) {
	                    v4_11 = 0;
	                } else {
	                    v4_11 = 1;
	                }
	                if (!v4_11) {
	                    this.a(p9, v1_1);
	                    if (this.d != null) {
	                        if (v1_1 != this.g) {
	                            if (v1_1 == this.h) {
	                                this.d.a(this.h.isEmpty());
	                            }
	                        } else {
	                            this.d.g(p9);
	                        }
	                    }
	                    bmu v1_5 = new Object[3];
	                    v1_5[0] = v0_7.c.b;
	                    v1_5[1] = v0_7.f();
	                    v1_5[2] = Long.valueOf((bkl.b() - v0_7.a()));
	                    v0_3 = 1;
	                } else {
	                    v0_3 = 0;
	                }
	            }
	        } else {
	            v1_1 = this.g;
	        }
	        return v0_3;
	    }
	
	
	    private void g(String p7)
	    {
	        if (!android.text.TextUtils.isEmpty(p7)) {
	            int v1_0 = this.m.isEmpty();
	            if (this.r != null) {
	                Integer v2_0 = this.r.iterator();
	                while (v2_0.hasNext()) {
	                    bmu v0_6 = ((ast) v2_0.next());
	                    if (v0_6.b.equals(p7)) {
	                        this.m.add(v0_6);
	                        bmu v0_7 = new Object[1];
	                        v0_7[0] = Integer.valueOf(this.m.size());
	                        if (this.d == null) {
	                            break;
	                        }
	                        bmu v0_9 = this.d;
	                        Integer v2_5 = new Object[1];
	                        v2_5[0] = v0_9.d;
	                        if (v1_0 == 0) {
	                            int v1_1 = new Object[1];
	                            v1_1[0] = Integer.valueOf(v0_9.b());
	                            v0_9.b(v0_9.b());
	                            break;
	                        } else {
	                            int v1_3 = new Object[1];
	                            v1_3[0] = Integer.valueOf(v0_9.b());
	                            v0_9.c(v0_9.b());
	                            break;
	                        }
	                    }
	                }
	            }
	        }
	        return;
	    }
	
	
	    public aow a(String p4, String p5)
	    {
	        int v0_0 = this.e(p4);
	        if (v0_0 == 0) {
	            java.util.Iterator v1 = this.g.iterator();
	            while (v1.hasNext()) {
	                v0_0 = ((aow) v1.next());
	                if ((v0_0.n() != null) && (v0_0.n().equals(p5))) {
	                }
	            }
	            v0_0 = 0;
	        }
	        return v0_0;
	    }
	
	
	    public aow a(boolean p4)
	    {
	        int v0_2;
	        aow v1_1 = new aow(this.a);
	        v1_1.a(this.n);
	        if (!p4) {
	            v0_2 = this.e();
	        } else {
	            v0_2 = this.g.size();
	        }
	        this.a(v0_2, v1_1);
	        if (this.d != null) {
	            this.d.f(v0_2);
	        }
	        this.g();
	        return v1_1;
	    }
	
	
	    void a(int p4, aow p5)
	    {
	        this.g.add(p4, p5);
	        String v0_2 = new Object[1];
	        v0_2[0] = Integer.valueOf(this.g.size());
	        this.f(p5.j);
	        return;
	    }
	
	
	    void a(int p5, java.util.List p6)
	    {
	        String v0_1 = ((aow) p6.remove(p5));
	        java.util.List v1_1 = new Object[2];
	        v1_1[0] = Integer.valueOf(p5);
	        v1_1[1] = Integer.valueOf(p6.size());
	        if ((v0_1 != null) && (p6 == this.g)) {
	            this.g(v0_1.j);
	        }
	        return;
	    }
	
	
	    public final void a(aow p4)
	    {
	        ass v0_1 = new Object[1];
	        v0_1[0] = p4.c.b;
	        ass v0_3 = this.g.indexOf(p4);
	        if (v0_3 != -1) {
	            this.a(v0_3, this.g);
	            if (this.d != null) {
	                this.d.g(v0_3);
	            }
	        }
	        this.c.b(p4);
	        return;
	    }
	
	
	    public final void a(azf p7, String p8)
	    {
	        String v0_0 = new Object[1];
	        v0_0[0] = p8;
	        this.e.add(p7);
	        if (this.e.size() == 1) {
	            java.util.Iterator v1 = this.c.a.values().iterator();
	            while (v1.hasNext()) {
	                String v0_9 = ((aqj) v1.next());
	                if (!v0_9.b.m) {
	                    Object[] v2_2 = new Object[1];
	                    v2_2[0] = v0_9.b.c.b;
	                    v0_9.f();
	                } else {
	                    Object[] v2_3 = new Object[1];
	                    v2_3[0] = v0_9.b.c.b;
	                }
	            }
	        }
	        this.a(p8);
	        this.q = p8;
	        return;
	    }
	
	
	    public final void a(String p11)
	    {
	        String v0_1 = new Object[2];
	        v0_1[0] = this.q;
	        v0_1[1] = p11;
	        if (!android.text.TextUtils.equals(this.q, p11)) {
	            this.q = p11;
	            try {
	                java.util.Iterator v2_1 = this.g.iterator();
	            } catch (String v0_9) {
	                throw v0_9;
	            }
	            while (v2_1.hasNext()) {
	                String v0_7 = ((aow) v2_1.next());
	                if ((v0_7.b(aoz.b) == -1) && (v0_7.b(aoz.c) == -1)) {
	                    this.c.b(v0_7);
	                    int v3_7 = this.g.indexOf(v0_7);
	                    v2_1.remove();
	                    bmu v4_3 = new Object[1];
	                    v4_3[0] = Integer.valueOf(this.g.size());
	                    if (this.d != null) {
	                        this.d.g(v3_7);
	                    }
	                    this.g(v0_7.j);
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void a(java.util.List p4)
	    {
	        za v0_1 = new Object[1];
	        v0_1[0] = p4;
	        this.r = p4;
	        this.m.clear();
	        java.util.Iterator v1_1 = p4.iterator();
	        while (v1_1.hasNext()) {
	            za v0_8 = ((ast) v1_1.next());
	            if (this.b(v0_8.b) == null) {
	                this.m.add(v0_8);
	            }
	        }
	        if (this.d != null) {
	            this.d.a.a();
	        }
	        return;
	    }
	
	
	    public final void a(java.util.Set p7)
	    {
	        java.util.Iterator v1 = this.g.iterator();
	        while (v1.hasNext()) {
	            long[] v0_3 = ((aow) v1.next());
	            if ((v0_3.r()) && (p7.contains(v0_3.n()))) {
	                v0_3.u[(aoz.a - 1)] = bkl.b();
	            }
	        }
	        return;
	    }
	
	
	    public final void a(uh p13)
	    {
	        com.google.android.gms.cast.CastDevice v10 = com.google.android.gms.cast.CastDevice.a(p13.m);
	        if (ayy.a(v10)) {
	            if ((v10 == null) || ((!v10.b.startsWith(this.o)) && (!"__opencast__".equals(v10.b)))) {
	                aqj v0_6 = 0;
	            } else {
	                v0_6 = 1;
	            }
	            if (v0_6 == null) {
	                try {
	                    boolean v9;
	                    aqj v0_8 = this.a(v10.b, v10.d.getHostAddress());
	                } catch (aqj v0_13) {
	                    throw v0_13;
	                }
	                if (v0_8 != null) {
	                    if (v0_8.q()) {
	                        this.b(v0_8);
	                    }
	                    v9 = v0_8;
	                } else {
	                    v9 = this.a(1);
	                }
	                v9.b = v10;
	                if (!v9.d) {
	                    v9.c.b = v9.b.e;
	                }
	                v9.a(v9.b.b);
	                v9.a(aoz.d);
	                Object[] v1_2 = v9.n();
	                aqj v0_18 = new bdu(v1_2, 0, 0, bew.c, 0, this.s);
	                if ((!this.k.contains(v1_2)) && (android.text.TextUtils.isEmpty(v9.j))) {
	                    int v2_10 = v9.n();
	                    int v3_2 = v9.c.b;
	                    alo v11_1 = new alo(this, v3_2, v2_10, v9);
	                    String v4_2 = new Object[1];
	                    v4_2[0] = v3_2;
	                    aqi.a();
	                    this.k.add(v2_10);
	                    String v4_3 = v0_18.d();
	                    bee v6_2 = new bdo(v0_18.d, "E8C28D3C");
	                    v0_18.a("getAppDeviceId", v4_3, v6_2, v0_18.e, new bed(v0_18, v11_1, v6_2));
	                }
	                if ((!this.j.contains(v1_2)) && (!v9.d)) {
	                    int v2_16 = v9.n();
	                    int v3_7 = v9.c.b;
	                    String v4_5 = new alp(this, v3_7, v2_16, v9);
	                    int v5_3 = new Object[1];
	                    v5_3[0] = v3_7;
	                    this.j.add(v2_16);
	                    v0_18.a(1198, 0, 0, v4_5);
	                }
	                if ((!this.l.contains(v1_2)) && (v9.q == null)) {
	                    Object[] v1_5 = v9.n();
	                    int v2_20 = v9.c.b;
	                    alq v7_2 = new alq(this, v2_20, v1_5, v9);
	                    int v3_11 = new Object[1];
	                    v3_11[0] = v2_20;
	                    this.l.add(v1_5);
	                    int v2_22 = v0_18.d();
	                    String v4_8 = new bfg(v0_18.d);
	                    v0_18.a("getOffersToken", v2_22, v4_8, v0_18.e, new bee(v0_18, v7_2, v4_8));
	                }
	                if (this.c.a(v9) == null) {
	                    Object[] v1_8 = this.c;
	                    if (v9.b != null) {
	                        try {
	                            aqj v0_24 = ((aqj) v1_8.a.get(v9.a));
	                        } catch (aqj v0_28) {
	                            throw v0_28;
	                        }
	                        if (v0_24 != null) {
	                            Object[] v1_10 = new Object[1];
	                            v1_10[0] = v9.c.b;
	                        } else {
	                            aqj v0_26 = new Object[1];
	                            v0_26[0] = v9.c.b;
	                            v0_24 = new aqj(v9, com.google.android.apps.chromecast.app.SetupApplication.a(), atf.a(com.google.android.apps.chromecast.app.SetupApplication.a()));
	                            v1_8.a.put(v9.a, v0_24);
	                        }
	                        v0_24.f();
	                    } else {
	                        aqj v0_29 = v1_8.b;
	                        int v2_24 = new Object[1];
	                        v2_24[0] = v9.c.b;
	                        v0_29.a("Tried to create a connection for %s but castDevice was null", v2_24);
	                    }
	                }
	                if ((!v10.a(4)) || (v10.a(1))) {
	                    if (v10.a(1)) {
	                        this.b.edit().putBoolean("nonhendrixDiscovered", 1).apply();
	                    }
	                } else {
	                    this.b.edit().putBoolean("hendrixDiscovered", 1).apply();
	                }
	            }
	        } else {
	            aqj v0_43 = new Object[2];
	            v0_43[0] = v10.e;
	            v0_43[1] = v10.f;
	        }
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        return this.g.isEmpty();
	    }
	
	
	    public final boolean a(int p4)
	    {
	        int v0_4;
	        if (!this.g.isEmpty()) {
	            java.util.Iterator v2 = this.g.iterator();
	            while (v2.hasNext()) {
	                if (((aow) v2.next()).d(p4)) {
	                    v0_4 = 1;
	                }
	            }
	            v0_4 = 0;
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public final int b()
	    {
	        return this.g.size();
	    }
	
	
	    public final aow b(String p4)
	    {
	        java.util.Iterator v1 = this.g.iterator();
	        while (v1.hasNext()) {
	            int v0_2 = ((aow) v1.next());
	            if (android.text.TextUtils.equals(v0_2.j, p4)) {
	            }
	            return v0_2;
	        }
	        v0_2 = 0;
	        return v0_2;
	    }
	
	
	    public void b(aow p7)
	    {
	        int v0_1 = this.g.indexOf(p7);
	        this.g.remove(p7);
	        bmu v1_1 = new Object[1];
	        v1_1[0] = Integer.valueOf(this.g.size());
	        bmu v1_2 = this.e();
	        this.a(v1_2, p7);
	        bmu v2_4 = new Object[2];
	        v2_4[0] = Integer.valueOf(v0_1);
	        v2_4[1] = Integer.valueOf(v1_2);
	        if (this.d != null) {
	            if (v0_1 != v1_2) {
	                this.d.a(v0_1, v1_2);
	            } else {
	                this.d.e(v0_1);
	            }
	        }
	        return;
	    }
	
	
	    public final aow c(String p4)
	    {
	        java.util.Iterator v1_0 = this.g.iterator();
	        while (v1_0.hasNext()) {
	            int v0_4 = ((aow) v1_0.next());
	            if (v0_4.f().equals(p4)) {
	            }
	            return v0_4;
	        }
	        java.util.Iterator v1_1 = this.h.iterator();
	        while (v1_1.hasNext()) {
	            v0_4 = ((aow) v1_1.next());
	            if (v0_4.f().equals(p4)) {
	            }
	            return v0_4;
	        }
	        v0_4 = 0;
	        return v0_4;
	    }
	
	
	    public final boolean c()
	    {
	        int v0_4;
	        if (!this.g.isEmpty()) {
	            java.util.Iterator v2 = this.g.iterator();
	            while (v2.hasNext()) {
	                if (!((aow) v2.next()).q()) {
	                    v0_4 = 0;
	                }
	            }
	            v0_4 = 1;
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public final boolean c(aow p7)
	    {
	        int v0_0 = 0;
	        int v1_3;
	        int v4_0 = this.g.indexOf(p7);
	        if ((v4_0 < 0) || (!this.a(v4_0, alr.a))) {
	            v1_3 = 0;
	        } else {
	            v1_3 = 1;
	        }
	        if (v4_0 != -1) {
	            v0_0 = v1_3;
	            if (v0_0 != 0) {
	                this.g();
	            }
	        } else {
	            int v4_2 = this.h.indexOf(p7);
	            if (v4_2 != -1) {
	                if (!this.a(v4_2, alr.b)) {
	                    v0_0 = v1_3;
	                } else {
	                    v0_0 = 1;
	                }
	            } else {
	            }
	        }
	        return v0_0;
	    }
	
	
	    public aow d(String p4)
	    {
	        java.util.Iterator v1 = this.g.iterator();
	        while (v1.hasNext()) {
	            int v0_2 = ((aow) v1.next());
	            if ((v0_2.c.q != null) && (v0_2.c.q.equals(p4))) {
	            }
	            return v0_2;
	        }
	        v0_2 = 0;
	        return v0_2;
	    }
	
	
	    public final java.util.ArrayList d()
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList();
	        java.util.Iterator v2 = this.g.iterator();
	        while (v2.hasNext()) {
	            aow v0_3 = ((aow) v2.next());
	            if (!v0_3.q()) {
	                v1_1.add(v0_3);
	            }
	        }
	        return v1_1;
	    }
	
	
	    public void d(aow p6)
	    {
	        try {
	            int v0_1 = this.h.isEmpty();
	            this.h.add(p6);
	            bmu v2_2 = new Object[1];
	            v2_2[0] = Integer.valueOf(this.h.size());
	        } catch (int v0_10) {
	            throw v0_10;
	        }
	        if (this.d != null) {
	            bmu v2_4 = this.d;
	            if (v0_1 == 0) {
	                int v0_3 = new Object[1];
	                v0_3[0] = Integer.valueOf((v2_4.a() - 1));
	                v2_4.b((v2_4.a() - 1));
	            } else {
	                int v0_7 = new Object[1];
	                v0_7[0] = Integer.valueOf((v2_4.a() - 1));
	                v2_4.c((v2_4.a() - 1));
	            }
	        }
	        return;
	    }
	
	
	    int e()
	    {
	        int v1 = 0;
	        while (v1 < this.g.size()) {
	            if (((aow) this.g.get(v1)).q()) {
	                v1++;
	            }
	            return v1;
	        }
	        v1 = this.g.size();
	        return v1;
	    }
	
	
	    public aow e(String p5)
	    {
	        java.util.Iterator v1 = this.g.iterator();
	        while (v1.hasNext()) {
	            int v0_2 = ((aow) v1.next());
	            if ((v0_2.a != null) && (v0_2.a.equals(aow.b(p5)))) {
	            }
	            return v0_2;
	        }
	        v0_2 = 0;
	        return v0_2;
	    }
	
	
	    void f(String p7)
	    {
	        if (!android.text.TextUtils.isEmpty(p7)) {
	            int v1_0 = this.m.iterator();
	            while (v1_0.hasNext()) {
	                if (p7.equals(((ast) v1_0.next()).b)) {
	                    v1_0.remove();
	                    bmu v0_7 = new Object[1];
	                    v0_7[0] = Integer.valueOf(this.m.size());
	                    if (this.d == null) {
	                        break;
	                    }
	                    bmu v0_9 = this.d;
	                    int v1_5 = this.m.isEmpty();
	                    Integer v2_0 = new Object[1];
	                    v2_0[0] = v0_9.d;
	                    if (v1_5 == 0) {
	                        int v1_6 = new Object[1];
	                        v1_6[0] = Integer.valueOf(v0_9.b());
	                        v0_9.b(v0_9.b());
	                        break;
	                    } else {
	                        int v1_8 = new Object[1];
	                        v1_8[0] = Integer.valueOf(v0_9.b());
	                        v0_9.d(v0_9.b());
	                        break;
	                    }
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final boolean f()
	    {
	        int v0_3 = 0;
	        int v2_1 = (this.g.size() - 1);
	        while (v2_1 >= 0) {
	            if (this.a(v2_1, alr.a)) {
	                v0_3 = 1;
	            }
	            v2_1--;
	        }
	        int v2_4 = (this.h.size() - 1);
	        while (v2_4 >= 0) {
	            if (this.a(v2_4, alr.b)) {
	                v0_3 = 1;
	            }
	            v2_4--;
	        }
	        if (v0_3 != 0) {
	            this.g();
	        }
	        return v0_3;
	    }
	
	
	    void g()
	    {
	        java.util.Iterator v1 = this.e.iterator();
	        while (v1.hasNext()) {
	            ((azf) v1.next()).s();
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList();
	        java.util.Iterator v2 = this.g.iterator();
	        while (v2.hasNext()) {
	            v1_1.add(((aow) v2.next()).toString());
	        }
	        return android.text.TextUtils.join(", ", v1_1);
	    }
	
