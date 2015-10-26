	static final java.util.List a
	static final java.util.List b
	private static javax.net.ssl.SSLSocketFactory y
	private final java.util.List A
	final dgr c
	public java.net.Proxy d
	public java.util.List e
	public java.util.List f
	public final java.util.List g
	public java.net.ProxySelector h
	public java.net.CookieHandler i
	public s j
	public dh k
	public javax.net.SocketFactory l
	public javax.net.ssl.SSLSocketFactory m
	public javax.net.ssl.HostnameVerifier n
	public dfd o
	public dfa p
	public dfi q
	 dgk r
	public  s
	public  t
	public  u
	public  v
	public  w
	  x
	private dfm z
	
	    static dft()
	    {
	        dfu v0_0 = new dfx[3];
	        v0_0[0] = dfx.d;
	        v0_0[1] = dfx.c;
	        v0_0[2] = dfx.b;
	        dft.a = dgs.a(v0_0);
	        dfu v0_2 = new dfk[3];
	        v0_2[0] = dfk.a;
	        v0_2[1] = dfk.b;
	        v0_2[2] = dfk.c;
	        dft.b = dgs.a(v0_2);
	        dgi.b = new dfu();
	        return;
	    }
	
	
	    public dft()
	    {
	        this.A = new java.util.ArrayList();
	        this.g = new java.util.ArrayList();
	        this.s = 1;
	        this.t = 1;
	        this.u = 1;
	        this.c = new dgr();
	        this.z = new dfm();
	        return;
	    }
	
	
	    dft(dft p3)
	    {
	        int v0_15;
	        this.A = new java.util.ArrayList();
	        this.g = new java.util.ArrayList();
	        this.s = 1;
	        this.t = 1;
	        this.u = 1;
	        this.c = p3.c;
	        this.z = p3.z;
	        this.d = p3.d;
	        this.e = p3.e;
	        this.f = p3.f;
	        this.A.addAll(p3.A);
	        this.g.addAll(p3.g);
	        this.h = p3.h;
	        this.i = p3.i;
	        this.k = p3.k;
	        if (this.k == null) {
	            v0_15 = p3.j;
	        } else {
	            v0_15 = 0;
	        }
	        this.j = v0_15;
	        this.l = p3.l;
	        this.m = p3.m;
	        this.n = p3.n;
	        this.o = p3.o;
	        this.p = p3.p;
	        this.q = p3.q;
	        this.r = p3.r;
	        this.s = p3.s;
	        this.t = p3.t;
	        this.u = p3.u;
	        this.v = p3.v;
	        this.w = p3.w;
	        this.x = p3.x;
	        return;
	    }
	
	
	    static synthetic dgk a(dft p1)
	    {
	        return p1.r;
	    }
	
	
	    declared_synchronized javax.net.ssl.SSLSocketFactory a()
	    {
	        try {
	            if (dft.y == null) {
	                try {
	                    AssertionError v0_2 = javax.net.ssl.SSLContext.getInstance("TLS");
	                    v0_2.init(0, 0, 0);
	                    dft.y = v0_2.getSocketFactory();
	                } catch (AssertionError v0) {
	                    throw new AssertionError();
	                }
	            }
	        } catch (AssertionError v0_7) {
	            throw v0_7;
	        }
	        return dft.y;
	    }
	
	
	    public final dft b()
	    {
	        return new dft(this);
	    }
	
	
	    public synthetic Object clone()
	    {
	        return this.b();
	    }
	
