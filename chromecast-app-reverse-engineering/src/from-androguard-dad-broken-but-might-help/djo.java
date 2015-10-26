	private final djz a
	private  b
	private  c
	private synthetic djn d
	
	    djo(djn p2)
	    {
	        this.d = p2;
	        this.a = new djz();
	        return;
	    }
	
	
	    private void a(boolean p7)
	    {
	        try {
	            djn.g(this.d).j_();
	            try {
	                while ((this.d.b <= 0) && ((!this.c) && ((!this.b) && (djn.d(this.d) == null)))) {
	                    djn.e(this.d);
	                }
	            } catch (djq v0_8) {
	                djn.g(this.d).b();
	                throw v0_8;
	            }
	            djn.g(this.d).b();
	            djn.h(this.d);
	            long v4_2 = Math.min(this.d.b, this.a.b);
	            djq v0_14 = this.d;
	            v0_14.b = (v0_14.b - v4_2);
	            djn.g(this.d).j_();
	            try {
	                int v2_9;
	                djq v0_19 = djn.a(this.d);
	                djq v1_1 = djn.b(this.d);
	            } catch (djq v0_20) {
	                djn.g(this.d).b();
	                throw v0_20;
	            }
	            if ((!p7) || (v4_2 != this.a.b)) {
	                v2_9 = 0;
	            } else {
	                v2_9 = 1;
	            }
	            v0_19.a(v1_1, v2_9, this.a, v4_2);
	            djn.g(this.d).b();
	            return;
	        } catch (djq v0_17) {
	            throw v0_17;
	        }
	    }
	
	
	    static synthetic boolean a(djo p1)
	    {
	        return p1.c;
	    }
	
	
	    static synthetic boolean a(djo p0, boolean p1)
	    {
	        p0.c = p1;
	        return p1;
	    }
	
	
	    static synthetic boolean b(djo p1)
	    {
	        return p1.b;
	    }
	
	
	    public final dkw a()
	    {
	        return djn.g(this.d);
	    }
	
	
	    public final void a_(djz p5, long p6)
	    {
	        this.a.a_(p5, p6);
	        while (this.a.b >= 16384) {
	            this.a(0);
	        }
	        return;
	    }
	
	
	    public final void close()
	    {
	        if (!this.b) {
	            if (!this.d.g.c) {
	                if (this.a.b <= 0) {
	                    djn.a(this.d).a(djn.b(this.d), 1, 0, 0);
	                    this.b = 1;
	                    djn.a(this.d).c();
	                    djn.f(this.d);
	                    return;
	                }
	                while (this.a.b > 0) {
	                    this.a(1);
	                }
	            }
	        } else {
	        }
	        return;
	    }
	
	
	    public final void flush()
	    {
	        djn.h(this.d);
	        while (this.a.b > 0) {
	            this.a(0);
	            djn.a(this.d).c();
	        }
	        return;
	    }
	
