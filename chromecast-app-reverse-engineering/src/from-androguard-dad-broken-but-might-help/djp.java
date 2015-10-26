	final djz a
	final djz b
	final  c
	  d
	final synthetic djn e
	private  f
	
	    djp(djn p3, long p4)
	    {
	        this.e = p3;
	        this.a = new djz();
	        this.b = new djz();
	        this.c = p4;
	        return;
	    }
	
	
	    static synthetic boolean a(djp p1)
	    {
	        return p1.d;
	    }
	
	
	    static synthetic boolean a(djp p0, boolean p1)
	    {
	        p0.d = p1;
	        return p1;
	    }
	
	
	    private void b()
	    {
	        djn.c(this.e).j_();
	        try {
	            while ((this.b.b == 0) && ((!this.d) && ((!this.f) && (djn.d(this.e) == null)))) {
	                djn.e(this.e);
	            }
	        } catch (djn v0_9) {
	            djn.c(this.e).b();
	            throw v0_9;
	        }
	        djn.c(this.e).b();
	        return;
	    }
	
	
	    static synthetic boolean b(djp p1)
	    {
	        return p1.f;
	    }
	
	
	    public final long a(djz p9, long p10)
	    {
	        if (p10 >= 0) {
	            try {
	                this.b();
	            } catch (Throwable v0_14) {
	                throw v0_14;
	            }
	            if (!this.f) {
	                if (djn.d(this.e) == null) {
	                    Throwable v0_8;
	                    if (this.b.b != 0) {
	                        v0_8 = this.b.a(p9, Math.min(p10, this.b.b));
	                        djb v3_0 = this.e;
	                        v3_0.a = (v3_0.a + v0_8);
	                        if (this.e.a >= ((long) (djn.a(this.e).e.c(65536) / 2))) {
	                            djn.a(this.e).a(djn.b(this.e), this.e.a);
	                            this.e.a = 0;
	                        }
	                        djn.a(this.e);
	                        try {
	                            djb v3_12 = djn.a(this.e);
	                            v3_12.c = (v3_12.c + v0_8);
	                        } catch (Throwable v0_9) {
	                            throw v0_9;
	                        }
	                        if (djn.a(this.e).c >= ((long) (djn.a(this.e).e.c(65536) / 2))) {
	                            djn.a(this.e).a(0, djn.a(this.e).c);
	                            djn.a(this.e).c = 0;
	                        }
	                    } else {
	                        v0_8 = -1;
	                    }
	                    return v0_8;
	                } else {
	                    throw new java.io.IOException(new StringBuilder("stream was reset: ").append(djn.d(this.e)).toString());
	                }
	            } else {
	                throw new java.io.IOException("stream closed");
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("byteCount < 0: ").append(p10).toString());
	        }
	    }
	
	
	    public final dkw a()
	    {
	        return djn.c(this.e);
	    }
	
	
	    final void a(dkd p13, long p14)
	    {
	        while (p14 > 0) {
	            djn v0_3;
	            if ((this.b.b + p14) <= this.c) {
	                v0_3 = 0;
	            } else {
	                v0_3 = 1;
	            }
	            if (v0_3 == null) {
	                if (!this.d) {
	                    djz v4_1 = p13.a(this.a, p14);
	                    if (v4_1 != -1) {
	                        p14 -= v4_1;
	                        try {
	                            djn v0_9;
	                            if (this.b.b != 0) {
	                                v0_9 = 0;
	                            } else {
	                                v0_9 = 1;
	                            }
	                        } catch (djn v0_11) {
	                            throw v0_11;
	                        }
	                        this.b.a(this.a);
	                        if (v0_9 != null) {
	                            this.e.notifyAll();
	                        }
	                    } else {
	                        throw new java.io.EOFException();
	                    }
	                } else {
	                    p13.f(p14);
	                    break;
	                }
	            } else {
	                p13.f(p14);
	                this.e.b(dia.f);
	                break;
	            }
	        }
	        return;
	    }
	
	
	    public final void close()
	    {
	        this.f = 1;
	        this.b.q();
	        this.e.notifyAll();
	        djn.f(this.e);
	        return;
	    }
	
