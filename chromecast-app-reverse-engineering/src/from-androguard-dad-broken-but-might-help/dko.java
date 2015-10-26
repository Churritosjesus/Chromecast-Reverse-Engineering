	public final djz a
	  b
	private dku c
	
	    public dko(dku p2)
	    {
	        this(p2, new djz());
	        return;
	    }
	
	
	    private dko(dku p3, djz p4)
	    {
	        if (p3 != null) {
	            this.a = p4;
	            this.c = p3;
	            return;
	        } else {
	            throw new IllegalArgumentException("sink == null");
	        }
	    }
	
	
	    public final long a(dkv p7)
	    {
	        if (p7 != null) {
	            long v0_0 = 0;
	            while(true) {
	                long v2_1 = p7.a(this.a, 2048);
	                if (v2_1 == -1) {
	                    break;
	                }
	                v0_0 += v2_1;
	                this.r();
	            }
	            return v0_0;
	        } else {
	            throw new IllegalArgumentException("source == null");
	        }
	    }
	
	
	    public final dkw a()
	    {
	        return this.c.a();
	    }
	
	
	    public final void a_(djz p3, long p4)
	    {
	        if (!this.b) {
	            this.a.a_(p3, p4);
	            this.r();
	            return;
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final djz b()
	    {
	        return this.a;
	    }
	
	
	    public final dkc b(dke p3)
	    {
	        if (!this.b) {
	            this.a.a(p3);
	            return this.r();
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final dkc b(String p3)
	    {
	        if (!this.b) {
	            this.a.a(p3);
	            return this.r();
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final dkc b(byte[] p3)
	    {
	        if (!this.b) {
	            this.a.a(p3);
	            return this.r();
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final dkc c(byte[] p3, int p4, int p5)
	    {
	        if (!this.b) {
	            this.a.b(p3, p4, p5);
	            return this.r();
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final java.io.OutputStream c()
	    {
	        return new dkp(this);
	    }
	
	
	    public final void close()
	    {
	        if (!this.b) {
	            int v0_1 = 0;
	            try {
	                if (this.a.b > 0) {
	                    this.c.a_(this.a, this.a.b);
	                }
	                try {
	                    this.c.close();
	                } catch (int v1_4) {
	                    if (v0_1 != 0) {
	                    } else {
	                        v0_1 = v1_4;
	                    }
	                }
	                this.b = 1;
	                if (v0_1 != 0) {
	                    dky.a(v0_1);
	                }
	            } catch (int v0_1) {
	            }
	        }
	        return;
	    }
	
	
	    public final dkc d()
	    {
	        if (!this.b) {
	            long v0_2 = this.a.b;
	            if (v0_2 > 0) {
	                this.c.a_(this.a, v0_2);
	            }
	            return this;
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final dkc f(int p3)
	    {
	        if (!this.b) {
	            this.a.d(p3);
	            return this.r();
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final void flush()
	    {
	        if (!this.b) {
	            if (this.a.b > 0) {
	                this.c.a_(this.a, this.a.b);
	            }
	            this.c.flush();
	            return;
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final dkc g(int p3)
	    {
	        if (!this.b) {
	            this.a.c(p3);
	            return this.r();
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final dkc h(int p3)
	    {
	        if (!this.b) {
	            this.a.b(p3);
	            return this.r();
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final dkc h(long p4)
	    {
	        if (!this.b) {
	            this.a.g(p4);
	            return this.r();
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final dkc r()
	    {
	        if (!this.b) {
	            long v4_0 = this.a;
	            long v0_1 = v4_0.b;
	            if (v0_1 != 0) {
	                long v4_2 = v4_0.a.g;
	                if ((v4_2.c < 2048) && (v4_2.e)) {
	                    v0_1 -= ((long) (v4_2.c - v4_2.b));
	                }
	            } else {
	                v0_1 = 0;
	            }
	            if (v0_1 > 0) {
	                this.c.a_(this.a, v0_1);
	            }
	            return this;
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("buffer(").append(this.c).append(")").toString();
	    }
	
