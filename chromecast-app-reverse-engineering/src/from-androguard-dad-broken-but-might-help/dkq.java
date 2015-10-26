	public final djz a
	public final dkv b
	  c
	
	    public dkq(dkv p2)
	    {
	        this(p2, new djz());
	        return;
	    }
	
	
	    private dkq(dkv p3, djz p4)
	    {
	        if (p3 != null) {
	            this.a = p4;
	            this.b = p3;
	            return;
	        } else {
	            throw new IllegalArgumentException("source == null");
	        }
	    }
	
	
	    private boolean b(long p6)
	    {
	        if (p6 >= 0) {
	            if (this.c) {
	                throw new IllegalStateException("closed");
	            }
	            while (this.a.b < p6) {
	                if (this.b.a(this.a, 2048) == -1) {
	                    int v0_6 = 0;
	                }
	                return v0_6;
	            }
	            v0_6 = 1;
	            return v0_6;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("byteCount < 0: ").append(p6).toString());
	        }
	    }
	
	
	    public final long a(byte p9)
	    {
	        long v0_0 = 0;
	        if (this.c) {
	            throw new IllegalStateException("closed");
	        }
	        while (0 >= this.a.b) {
	            if (this.b.a(this.a, 2048) == -1) {
	                long v0_1 = -1;
	            }
	            return v0_1;
	        }
	        do {
	            v0_1 = this.a.a(p9, v0_0);
	            if (v0_1 == -1) {
	                v0_0 = this.a.b;
	            }
	            return v0_1;
	        } while(this.b.a(this.a, 2048) != -1);
	        v0_1 = -1;
	        return v0_1;
	    }
	
	
	    public final long a(djz p7, long p8)
	    {
	        long v0_0 = -1;
	        if (p7 != null) {
	            if (p8 >= 0) {
	                if (!this.c) {
	                    if ((this.a.b != 0) || (this.b.a(this.a, 2048) != -1)) {
	                        v0_0 = this.a.a(p7, Math.min(p8, this.a.b));
	                    }
	                    return v0_0;
	                } else {
	                    throw new IllegalStateException("closed");
	                }
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("byteCount < 0: ").append(p8).toString());
	            }
	        } else {
	            throw new IllegalArgumentException("sink == null");
	        }
	    }
	
	
	    public final dkw a()
	    {
	        return this.b.a();
	    }
	
	
	    public final void a(long p2)
	    {
	        if (this.b(p2)) {
	            return;
	        } else {
	            throw new java.io.EOFException();
	        }
	    }
	
	
	    public final djz b()
	    {
	        return this.a;
	    }
	
	
	    public final dke c(long p2)
	    {
	        this.a(p2);
	        return this.a.c(p2);
	    }
	
	
	    public final void close()
	    {
	        if (!this.c) {
	            this.c = 1;
	            this.b.close();
	            this.a.q();
	        }
	        return;
	    }
	
	
	    public final boolean e()
	    {
	        if (!this.c) {
	            if ((!this.a.e()) || (this.b.a(this.a, 2048) != -1)) {
	                int v0_6 = 0;
	            } else {
	                v0_6 = 1;
	            }
	            return v0_6;
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final byte[] e(long p2)
	    {
	        this.a(p2);
	        return this.a.e(p2);
	    }
	
	
	    public final java.io.InputStream f()
	    {
	        return new dkr(this);
	    }
	
	
	    public final void f(long p8)
	    {
	        if (this.c) {
	            throw new IllegalStateException("closed");
	        }
	        while (p8 > 0) {
	            if ((this.a.b != 0) || (this.b.a(this.a, 2048) != -1)) {
	                java.io.EOFException v0_10 = Math.min(p8, this.a.b);
	                this.a.f(v0_10);
	                p8 -= v0_10;
	            } else {
	                throw new java.io.EOFException();
	            }
	        }
	        return;
	    }
	
	
	    public final byte g()
	    {
	        this.a(1);
	        return this.a.g();
	    }
	
	
	    public final short h()
	    {
	        this.a(2);
	        return this.a.h();
	    }
	
	
	    public final int i()
	    {
	        this.a(4);
	        return this.a.i();
	    }
	
	
	    public final short j()
	    {
	        this.a(2);
	        return dky.a(this.a.h());
	    }
	
	
	    public final int k()
	    {
	        this.a(4);
	        return dky.a(this.a.i());
	    }
	
	
	    public final long l()
	    {
	        this.a(1);
	        NumberFormatException v0_0 = 0;
	        while (this.b(((long) (v0_0 + 1)))) {
	            Byte v2_5 = this.a.b(((long) v0_0));
	            if (((v2_5 >= 48) && (v2_5 <= 57)) || (((v2_5 >= 97) && (v2_5 <= 102)) || ((v2_5 >= 65) && (v2_5 <= 70)))) {
	                v0_0++;
	            } else {
	                if (v0_0 != null) {
	                    break;
	                }
	                Object[] v4_2 = new Object[1];
	                v4_2[0] = Byte.valueOf(v2_5);
	                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", v4_2));
	            }
	        }
	        return this.a.l();
	    }
	
	
	    public final String o()
	    {
	        String v0_1 = this.a(10);
	        if (v0_1 != -1) {
	            return this.a.d(v0_1);
	        } else {
	            String v1_1 = new djz();
	            this.a.a(v1_1, 0, Math.min(32, this.a.b));
	            throw new java.io.EOFException(new StringBuilder("\\n not found: size=").append(this.a.b).append(" content=").append(v1_1.m().b()).append("...").toString());
	        }
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("buffer(").append(this.b).append(")").toString();
	    }
	
