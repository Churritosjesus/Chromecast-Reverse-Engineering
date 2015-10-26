	private static final java.util.regex.Pattern v
	public java.lang.String a
	public com.google.android.gms.cast.CastDevice b
	public bdf c
	public  d
	 android.bluetooth.BluetoothDevice e
	 java.lang.String f
	public atu g
	public java.util.ArrayList h
	public java.util.ArrayList i
	public java.lang.String j
	public java.lang.String k
	public java.util.List l
	public  m
	public  n
	public java.lang.String o
	public java.lang.String p
	public java.lang.String q
	public final java.lang.Runnable r
	  s
	public java.lang.String t
	public final J u
	private final bkl w
	private final blp x
	
	    static aow()
	    {
	        new aoy();
	        aow.v = java.util.regex.Pattern.compile("\\.([a-z][a-z0-9]{0,3})$");
	        return;
	    }
	
	
	    public aow(bkl p5)
	    {
	        int v0 = 0;
	        this.c = new bdf();
	        this.d = 0;
	        this.g = new atu();
	        this.h = new java.util.ArrayList();
	        this.i = new java.util.ArrayList();
	        this.m = 0;
	        this.r = new aox(this);
	        long[] v1_11 = new long[5];
	        this.u = v1_11;
	        this.w = p5;
	        this.x = new blp("UnifiedDevice");
	        while (v0 < this.u.length) {
	            this.u[v0] = -1;
	            v0++;
	        }
	        return;
	    }
	
	
	    static synthetic blp a(aow p1)
	    {
	        return p1.x;
	    }
	
	
	    public static String b(String p2)
	    {
	        if (p2 != null) {
	            p2 = p2.replace("-", "");
	        }
	        return p2;
	    }
	
	
	    public final long a()
	    {
	        long v2 = -1;
	        int v0 = 0;
	        while (v0 < this.u.length) {
	            if (this.u[v0] > v2) {
	                v2 = this.u[v0];
	            }
	            v0++;
	        }
	        return v2;
	    }
	
	
	    public final void a(double p8)
	    {
	        java.util.Iterator v1_0 = 1;
	        atu v2 = this.o();
	        alu v0_0 = 0;
	        if (v2.d == null) {
	            v2.d = new atv();
	            v0_0 = 1;
	        }
	        if (v2.d.b == p8) {
	            v1_0 = v0_0;
	        } else {
	            v2.d.b = p8;
	        }
	        if (v1_0 != null) {
	            java.util.Iterator v1_1 = this.i.iterator();
	            while (v1_1.hasNext()) {
	                ((alu) v1_1.next()).b(this);
	            }
	        }
	        return;
	    }
	
	
	    void a(int p5)
	    {
	        this.u[(p5 - 1)] = bkl.b();
	        return;
	    }
	
	
	    public final void a(als p2)
	    {
	        this.h.add(p2);
	        return;
	    }
	
	
	    public final void a(bdf p2)
	    {
	        this.b(p2);
	        this.a(aoz.a);
	        return;
	    }
	
	
	    void a(String p2)
	    {
	        if (p2 != null) {
	            this.a = aow.b(p2);
	        }
	        return;
	    }
	
	
	    public final void a(String p8, String p9)
	    {
	        bdf v0_3;
	        this.f = p8;
	        this.c.a(p9);
	        bdf v0_2 = aow.v.matcher(p8);
	        if (!v0_2.find()) {
	            v0_3 = 0;
	        } else {
	            v0_3 = v0_2.group(1);
	        }
	        if (!this.d) {
	            if (android.text.TextUtils.isEmpty(v0_3)) {
	                this.c.F = "";
	            } else {
	                bdf v1_4 = this.c;
	                int v2_1 = v0_3.substring(0, 1);
	                v1_4.F = v2_1;
	                switch (bdh.a[(v1_4.b() - 1)]) {
	                    case 1:
	                        v1_4.h = 0;
	                        v1_4.k = 1;
	                        break;
	                    case 2:
	                        v1_4.h = 1;
	                        v1_4.k = 1;
	                        break;
	                    case 3:
	                        v1_4.h = 1;
	                        v1_4.k = 0;
	                        break;
	                    case 4:
	                        v1_4.h = 0;
	                        v1_4.k = 0;
	                        break;
	                    case 5:
	                        v1_4.h = 1;
	                        v1_4.k = 0;
	                        break;
	                    default:
	                        Object[] v3_2 = new Object[1];
	                        v3_2[0] = v2_1;
	                        v1_4.h = 1;
	                        v1_4.k = 0;
	                }
	            }
	            if (android.text.TextUtils.isEmpty(v0_3)) {
	                this.c.b = p8;
	            } else {
	                this.c.b = p8.substring(0, ((p8.length() - v0_3.length()) - 1));
	            }
	        }
	        this.a(aoz.b);
	        return;
	    }
	
	
	    public final void a(java.util.List p2)
	    {
	        if ((this.l != null) && (this.l.equals(p2))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        this.l = p2;
	        if (v0_3 != 0) {
	            this.p();
	        }
	        return;
	    }
	
	
	    public final long b(int p3)
	    {
	        return this.u[(p3 - 1)];
	    }
	
	
	    public final void b()
	    {
	        boolean v0_1 = this.o().d;
	        if ((v0_1) && (v0_1.a())) {
	            aqj v1_3 = com.google.android.apps.chromecast.app.SetupApplication.a().j.a(this);
	            if (v1_3 != null) {
	                v1_3.a(v0_1.b());
	            }
	        }
	        return;
	    }
	
	
	    public final void b(bdf p2)
	    {
	        if (p2 != null) {
	            this.c = p2;
	            this.a(this.c.n);
	        }
	        this.d = 1;
	        return;
	    }
	
	
	    public final void b(String p5, String p6)
	    {
	        if ((!android.text.TextUtils.equals(p5, this.o)) || (!android.text.TextUtils.equals(p6, this.p))) {
	            this.o = p5;
	            this.p = p6;
	            atu v0_4 = this.o();
	            String v1 = this.p;
	            if (!android.text.TextUtils.equals(v1, v0_4.a)) {
	                v0_4.b = 0;
	                v0_4.c = 0;
	                v0_4.d = 0;
	                v0_4.e = 0;
	                v0_4.f = 0;
	                v0_4.g = 0;
	                v0_4.h = 0;
	                v0_4.i = 0;
	            }
	            v0_4.a = v1;
	            this.p();
	        }
	        return;
	    }
	
	
	    public final void c()
	    {
	        aqj v0_2 = com.google.android.apps.chromecast.app.SetupApplication.a().j.a(this);
	        if (v0_2 != null) {
	            v0_2.a(1, 0);
	        }
	        return;
	    }
	
	
	    boolean c(int p7)
	    {
	        int v0_4;
	        int v0_1 = this.u[(p7 - 1)];
	        if ((v0_1 == -1) || ((bkl.b() - v0_1) < 30000)) {
	            v0_4 = 0;
	        } else {
	            this.u[(p7 - 1)] = -1;
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public final boolean d()
	    {
	        return "E8C28D3C".equals(this.o);
	    }
	
	
	    public final boolean d(int p5)
	    {
	        int v0_3;
	        if (this.u[(p5 - 1)] == -1) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final boolean e()
	    {
	        return "674A0243".equals(this.o);
	    }
	
	
	    public final String f()
	    {
	        if ((this.c == null) || (this.c.q == null)) {
	            String v0_3 = this.a;
	            if (v0_3 == null) {
	                v0_3 = "";
	            }
	        } else {
	            v0_3 = this.c.q;
	        }
	        return v0_3;
	    }
	
	
	    public final String g()
	    {
	        return this.c.b;
	    }
	
	
	    public final int h()
	    {
	        if ((this.d) && (!this.c.h)) {
	            int v0_3 = a.eL;
	        } else {
	            v0_3 = a.eM;
	        }
	        return v0_3;
	    }
	
	
	    public final void i()
	    {
	        if (this.m) {
	            this.m = 0;
	            this.n = -1;
	            this.p();
	        }
	        return;
	    }
	
	
	    public final void j()
	    {
	        Object[] v0_2 = com.google.android.apps.chromecast.app.SetupApplication.a().j.a(this);
	        if (v0_2 == null) {
	            Object[] v0_4 = new Object[1];
	            v0_4[0] = this.g();
	        } else {
	            v0_2.f();
	        }
	        return;
	    }
	
	
	    public final boolean k()
	    {
	        int v0_1;
	        if (this.n <= 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean l()
	    {
	        int v0_1;
	        if (this.n >= (this.l.size() - 1)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final String m()
	    {
	        return this.c.q;
	    }
	
	
	    public final String n()
	    {
	        String v0_4;
	        if (this.b == null) {
	            if (android.text.TextUtils.isEmpty(this.c.u)) {
	                v0_4 = "192.168.255.249";
	            } else {
	                v0_4 = this.c.u;
	            }
	        } else {
	            v0_4 = this.b.d.getHostAddress();
	        }
	        return v0_4;
	    }
	
	
	    public final atu o()
	    {
	        if (this.g == null) {
	            this.g = new atu();
	        }
	        return this.g;
	    }
	
	
	    public final void p()
	    {
	        java.util.Iterator v1 = this.h.iterator();
	        while (v1.hasNext()) {
	            ((als) v1.next()).a(this);
	        }
	        return;
	    }
	
	
	    public final boolean q()
	    {
	        int v0 = 0;
	        if ((!this.r()) || ((this.c.w) && (!this.c.E))) {
	            v0 = 1;
	        } else {
	            int v2_7;
	            if (this.c.G != bdj.o) {
	                v2_7 = 0;
	            } else {
	                v2_7 = 1;
	            }
	            if (v2_7 != 0) {
	            }
	        }
	        return v0;
	    }
	
	
	    public final boolean r()
	    {
	        if ((!this.d(aoz.a)) && (!this.d(aoz.d))) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public final boolean s()
	    {
	        if ((this.l == null) || (this.l.isEmpty())) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1;
	        String v1_0 = this.g();
	        if (!this.q()) {
	            v0_1 = "ready to cast";
	        } else {
	            v0_1 = "needs set up";
	        }
	        return new StringBuilder(((String.valueOf(v1_0).length() + 3) + String.valueOf(v0_1).length())).append(v1_0).append(" (").append(v0_1).append(")").toString();
	    }
	
