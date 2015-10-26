	final java.lang.String a
	final java.lang.String b
	public java.lang.String c
	public java.lang.String d
	public  e
	public  f
	public  g
	  h
	  i
	public  j
	public  k
	public  l
	public android.os.Bundle m
	public android.content.IntentSender n
	 tn o
	private final ug p
	private final java.util.ArrayList q
	private  r
	
	    uh(ug p2, String p3, String p4)
	    {
	        this.q = new java.util.ArrayList();
	        this.r = -1;
	        this.p = p2;
	        this.a = p3;
	        this.b = p4;
	        return;
	    }
	
	
	    final int a(tn p5)
	    {
	        int v1 = 1;
	        int v0_0 = 0;
	        if (this.o != p5) {
	            this.o = p5;
	            if (p5 != null) {
	                if (!tz.a(this.c, p5.b())) {
	                    this.c = p5.b();
	                    v0_0 = 1;
	                }
	                if (!tz.a(this.d, p5.c())) {
	                    this.d = p5.c();
	                    v0_0 = 1;
	                }
	                if (this.e == p5.d()) {
	                    v1 = v0_0;
	                } else {
	                    this.e = p5.d();
	                }
	                if (this.f != p5.e()) {
	                    this.f = p5.e();
	                    v1 |= 1;
	                }
	                if (!this.q.equals(p5.h())) {
	                    this.q.clear();
	                    this.q.addAll(p5.h());
	                    v1 |= 1;
	                }
	                if (this.h != p5.j()) {
	                    this.h = p5.j();
	                    v1 |= 1;
	                }
	                if (this.i != p5.k()) {
	                    this.i = p5.k();
	                    v1 |= 1;
	                }
	                if (this.j != p5.n()) {
	                    this.j = p5.n();
	                    v1 |= 3;
	                }
	                if (this.k != p5.l()) {
	                    this.k = p5.l();
	                    v1 |= 3;
	                }
	                if (this.l != p5.m()) {
	                    this.l = p5.m();
	                    v1 |= 3;
	                }
	                if (this.r != p5.o()) {
	                    this.r = p5.o();
	                    v1 |= 5;
	                }
	                if (!tz.a(this.m, p5.p())) {
	                    this.m = p5.p();
	                    v1 |= 1;
	                }
	                if (!tz.a(this.n, p5.g())) {
	                    this.n = p5.g();
	                    v1 |= 1;
	                }
	                if (this.g == p5.f()) {
	                    v0_0 = v1;
	                } else {
	                    this.g = p5.f();
	                    v0_0 = (v1 | 5);
	                }
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final void a(int p4)
	    {
	        tz.f();
	        tu v0_0 = tz.a;
	        int v1_1 = Math.min(this.l, Math.max(0, p4));
	        if ((this == v0_0.g) && (v0_0.h != null)) {
	            v0_0.h.b(v1_1);
	        }
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        int v0_2;
	        tz.f();
	        if (tz.a.b() != this) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean a(String p5)
	    {
	        tz.f();
	        int v3 = this.q.size();
	        int v2 = 0;
	        while (v2 < v3) {
	            if (!((android.content.IntentFilter) this.q.get(v2)).hasCategory(p5)) {
	                v2++;
	            } else {
	                int v0_1 = 1;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public final boolean a(tx p3)
	    {
	        if (p3 != null) {
	            tz.f();
	            return p3.a(this.q);
	        } else {
	            throw new IllegalArgumentException("selector must not be null");
	        }
	    }
	
	
	    public final void b(int p3)
	    {
	        tz.f();
	        if (p3 != 0) {
	            tu v0_0 = tz.a;
	            if ((this == v0_0.g) && (v0_0.h != null)) {
	                v0_0.h.c(p3);
	            }
	        }
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        int v0_2;
	        tz.f();
	        if (tz.a.a() != this) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final void c()
	    {
	        tz.f();
	        tz.a.a(this, 3);
	        return;
	    }
	
	
	    final tq d()
	    {
	        tq v0_0 = this.p;
	        tz.f();
	        return v0_0.a;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("MediaRouter.RouteInfo{ uniqueId=").append(this.b).append(", name=").append(this.c).append(", description=").append(this.d).append(", enabled=").append(this.e).append(", connecting=").append(this.f).append(", canDisconnect=").append(this.g).append(", playbackType=").append(this.h).append(", playbackStream=").append(this.i).append(", volumeHandling=").append(this.j).append(", volume=").append(this.k).append(", volumeMax=").append(this.l).append(", presentationDisplayId=").append(this.r).append(", extras=").append(this.m).append(", settingsIntent=").append(this.n).append(", providerPackageName=").append(this.p.a()).append(" }").toString();
	    }
	
