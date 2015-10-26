	  a
	  b
	final  c
	final djb d
	 java.util.List e
	public final djp f
	final djo g
	public final djq h
	private final djq i
	private dia j
	
	    djn(int p5, djb p6, boolean p7, boolean p8, java.util.List p9)
	    {
	        this.a = 0;
	        this.h = new djq(this);
	        this.i = new djq(this);
	        this.j = 0;
	        if (p6 != null) {
	            if (p9 != null) {
	                this.c = p5;
	                this.d = p6;
	                this.b = ((long) p6.f.c(65536));
	                this.f = new djp(this, ((long) p6.e.c(65536)));
	                this.g = new djo(this);
	                djp.a(this.f, p8);
	                djo.a(this.g, p7);
	                return;
	            } else {
	                throw new NullPointerException("requestHeaders == null");
	            }
	        } else {
	            throw new NullPointerException("connection == null");
	        }
	    }
	
	
	    static synthetic djb a(djn p1)
	    {
	        return p1.d;
	    }
	
	
	    static synthetic int b(djn p1)
	    {
	        return p1.c;
	    }
	
	
	    static synthetic djq c(djn p1)
	    {
	        return p1.h;
	    }
	
	
	    static synthetic dia d(djn p1)
	    {
	        return p1.j;
	    }
	
	
	    private boolean d(dia p3)
	    {
	        int v0_0 = 0;
	        try {
	            if (this.j == null) {
	                if ((!djp.a(this.f)) || (!djo.a(this.g))) {
	                    this.j = p3;
	                    this.notifyAll();
	                    this.d.b(this.c);
	                    v0_0 = 1;
	                } else {
	                }
	            } else {
	            }
	        } catch (int v0_2) {
	            throw v0_2;
	        }
	        return v0_0;
	    }
	
	
	    static synthetic void e(djn p0)
	    {
	        p0.f();
	        return;
	    }
	
	
	    private void f()
	    {
	        try {
	            this.wait();
	            return;
	        } catch (java.io.InterruptedIOException v0) {
	            throw new java.io.InterruptedIOException();
	        }
	    }
	
	
	    static synthetic void f(djn p2)
	    {
	        if ((djp.a(p2.f)) || ((!djp.b(p2.f)) || ((!djo.a(p2.g)) && (!djo.b(p2.g))))) {
	            djb v0_8 = 0;
	        } else {
	            v0_8 = 1;
	        }
	        int v1_0 = p2.a();
	        if (v0_8 == null) {
	            if (v1_0 == 0) {
	                p2.d.b(p2.c);
	            }
	        } else {
	            p2.a(dia.h);
	        }
	        return;
	    }
	
	
	    static synthetic djq g(djn p1)
	    {
	        return p1.i;
	    }
	
	
	    static synthetic void h(djn p3)
	    {
	        if (!djo.b(p3.g)) {
	            if (!djo.a(p3.g)) {
	                if (p3.j == null) {
	                    return;
	                } else {
	                    throw new java.io.IOException(new StringBuilder("stream was reset: ").append(p3.j).toString());
	                }
	            } else {
	                throw new java.io.IOException("stream finished");
	            }
	        } else {
	            throw new java.io.IOException("stream closed");
	        }
	    }
	
	
	    final void a(long p4)
	    {
	        this.b = (this.b + p4);
	        if (p4 > 0) {
	            this.notifyAll();
	        }
	        return;
	    }
	
	
	    public final void a(dia p3)
	    {
	        if (this.d(p3)) {
	            this.d.b(this.c, p3);
	        }
	        return;
	    }
	
	
	    public final declared_synchronized boolean a()
	    {
	        int v0_0 = 0;
	        try {
	            if ((this.j == null) && (((!djp.a(this.f)) && (!djp.b(this.f))) || (((!djo.a(this.g)) && (!djo.b(this.g))) || (this.e == null)))) {
	                v0_0 = 1;
	            }
	        } catch (int v0_1) {
	            throw v0_1;
	        }
	        return v0_0;
	    }
	
	
	    public final void b(dia p3)
	    {
	        if (this.d(p3)) {
	            this.d.a(this.c, p3);
	        }
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        int v0_2;
	        int v1 = 1;
	        if ((this.c & 1) != 1) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        if (this.d.b != v0_2) {
	            v1 = 0;
	        }
	        return v1;
	    }
	
	
	    public final declared_synchronized java.util.List c()
	    {
	        try {
	            this.h.j_();
	        } catch (java.io.IOException v0_8) {
	            throw v0_8;
	        }
	        try {
	            while ((this.e == null) && (this.j == null)) {
	                this.f();
	            }
	        } catch (java.io.IOException v0_3) {
	            this.h.b();
	            throw v0_3;
	        }
	        this.h.b();
	        if (this.e == null) {
	            throw new java.io.IOException(new StringBuilder("stream was reset: ").append(this.j).toString());
	        } else {
	            return this.e;
	        }
	    }
	
	
	    final declared_synchronized void c(dia p2)
	    {
	        try {
	            if (this.j == null) {
	                this.j = p2;
	                this.notifyAll();
	            }
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	        return;
	    }
	
	
	    public final dku d()
	    {
	        try {
	            if ((this.e != null) || (this.b())) {
	                return this.g;
	            } else {
	                throw new IllegalStateException("reply before requesting the sink");
	            }
	        } catch (IllegalStateException v0_5) {
	            throw v0_5;
	        }
	    }
	
	
	    final void e()
	    {
	        djp.a(this.f, 1);
	        djb v0_1 = this.a();
	        this.notifyAll();
	        if (v0_1 == null) {
	            this.d.b(this.c);
	        }
	        return;
	    }
	
