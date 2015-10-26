	final B a
	  b
	private  c
	private  d
	private  e
	private  f
	private  g
	private  h
	private  i
	
	    deo(byte[] p2, int p3, int p4)
	    {
	        this.g = 2147483647;
	        this.i = 64;
	        this.a = p2;
	        this.b = p3;
	        this.c = (p3 + p4);
	        this.e = p3;
	        return;
	    }
	
	
	    private void f(int p3)
	    {
	        if (p3 >= 0) {
	            if ((this.e + p3) <= this.g) {
	                if (p3 > (this.c - this.e)) {
	                    throw dev.a();
	                } else {
	                    this.e = (this.e + p3);
	                    return;
	                }
	            } else {
	                this.f((this.g - this.e));
	                throw dev.a();
	            }
	        } else {
	            throw dev.b();
	        }
	    }
	
	
	    private void j()
	    {
	        this.c = (this.c + this.d);
	        int v0_2 = this.c;
	        if (v0_2 <= this.g) {
	            this.d = 0;
	        } else {
	            this.d = (v0_2 - this.g);
	            this.c = (this.c - this.d);
	        }
	        return;
	    }
	
	
	    private byte k()
	    {
	        if (this.e != this.c) {
	            byte v0_1 = this.a;
	            int v1_1 = this.e;
	            this.e = (v1_1 + 1);
	            return v0_1[v1_1];
	        } else {
	            throw dev.a();
	        }
	    }
	
	
	    public final int a()
	    {
	        int v1_1;
	        int v0_0 = 0;
	        if (this.e != this.c) {
	            v1_1 = 0;
	        } else {
	            v1_1 = 1;
	        }
	        if (v1_1 == 0) {
	            this.f = this.e();
	            if (this.f != 0) {
	                v0_0 = this.f;
	            } else {
	                throw dev.d();
	            }
	        } else {
	            this.f = 0;
	        }
	        return v0_0;
	    }
	
	
	    public final void a(int p2)
	    {
	        if (this.f == p2) {
	            return;
	        } else {
	            throw dev.e();
	        }
	    }
	
	
	    public final void a(dew p4)
	    {
	        int v0_0 = this.e();
	        if (this.h < this.i) {
	            int v0_1 = this.c(v0_0);
	            this.h = (this.h + 1);
	            p4.a(this);
	            this.a(0);
	            this.h = (this.h - 1);
	            this.d(v0_1);
	            return;
	        } else {
	            throw dev.g();
	        }
	    }
	
	
	    public final long b()
	    {
	        int v2 = 0;
	        dev v0_0 = 0;
	        while (v2 < 64) {
	            int v3_1 = this.k();
	            v0_0 |= (((long) (v3_1 & 127)) << v2);
	            if ((v3_1 & 128) != 0) {
	                v2 += 7;
	            } else {
	                return v0_0;
	            }
	        }
	        throw dev.c();
	    }
	
	
	    public final boolean b(int p4)
	    {
	        int v0_0 = 1;
	        switch (dey.a(p4)) {
	            case 0:
	                this.e();
	                break;
	            case 1:
	                this.g();
	                break;
	            case 2:
	                this.f(this.e());
	                break;
	            case 3:
	                do {
	                    int v1_1 = this.a();
	                } while((v1_1 != 0) && (this.b(v1_1)));
	                this.a(dey.a(dey.b(p4), 4));
	                break;
	            case 4:
	                v0_0 = 0;
	                break;
	            case 5:
	                this.f();
	                break;
	            default:
	                throw dev.f();
	        }
	        return v0_0;
	    }
	
	
	    public final int c(int p3)
	    {
	        if (p3 >= 0) {
	            dev v0_1 = (this.e + p3);
	            int v1 = this.g;
	            if (v0_1 <= v1) {
	                this.g = v0_1;
	                this.j();
	                return v1;
	            } else {
	                throw dev.a();
	            }
	        } else {
	            throw dev.b();
	        }
	    }
	
	
	    public final boolean c()
	    {
	        int v0_1;
	        if (this.e() == 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final String d()
	    {
	        dev v0_4;
	        String v1_0 = this.e();
	        if ((v1_0 > (this.c - this.e)) || (v1_0 <= null)) {
	            if (v1_0 >= null) {
	                if ((this.e + v1_0) <= this.g) {
	                    if (v1_0 > (this.c - this.e)) {
	                        throw dev.a();
	                    } else {
	                        byte[] v2_5 = new byte[v1_0];
	                        System.arraycopy(this.a, this.e, v2_5, 0, v1_0);
	                        this.e = (v1_0 + this.e);
	                        v0_4 = new String(v2_5, "UTF-8");
	                    }
	                } else {
	                    this.f((this.g - this.e));
	                    throw dev.a();
	                }
	            } else {
	                throw dev.b();
	            }
	        } else {
	            v0_4 = new String(this.a, this.e, v1_0, "UTF-8");
	            this.e = (v1_0 + this.e);
	        }
	        return v0_4;
	    }
	
	
	    public final void d(int p1)
	    {
	        this.g = p1;
	        this.j();
	        return;
	    }
	
	
	    public final int e()
	    {
	        dev v0_0 = this.k();
	        if (v0_0 < null) {
	            dev v0_1 = (v0_0 & 127);
	            int v1_0 = this.k();
	            if (v1_0 < 0) {
	                dev v0_2 = (v0_1 | ((v1_0 & 127) << 7));
	                int v1_3 = this.k();
	                if (v1_3 < 0) {
	                    dev v0_3 = (v0_2 | ((v1_3 & 127) << 14));
	                    int v1_6 = this.k();
	                    if (v1_6 < 0) {
	                        dev v0_4 = (v0_3 | ((v1_6 & 127) << 21));
	                        int v1_9 = this.k();
	                        v0_0 = (v0_4 | (v1_9 << 28));
	                        if (v1_9 < 0) {
	                            int v1_10 = 0;
	                            while (v1_10 < 5) {
	                                if (this.k() < 0) {
	                                    v1_10++;
	                                }
	                            }
	                            throw dev.c();
	                        }
	                    } else {
	                        v0_0 = (v0_3 | (v1_6 << 21));
	                    }
	                } else {
	                    v0_0 = (v0_2 | (v1_3 << 14));
	                }
	            } else {
	                v0_0 = (v0_1 | (v1_0 << 7));
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final void e(int p5)
	    {
	        if (p5 <= (this.e - this.b)) {
	            if (p5 >= 0) {
	                this.e = (this.b + p5);
	                return;
	            } else {
	                throw new IllegalArgumentException(new StringBuilder(24).append("Bad position ").append(p5).toString());
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder(50).append("Position ").append(p5).append(" is beyond current ").append((this.e - this.b)).toString());
	        }
	    }
	
	
	    public final int f()
	    {
	        return ((((this.k() & 255) | ((this.k() & 255) << 8)) | ((this.k() & 255) << 16)) | ((this.k() & 255) << 24));
	    }
	
	
	    public final long g()
	    {
	        return (((((((((((long) this.k()) & 255) << 8) | (((long) this.k()) & 255)) | ((((long) this.k()) & 255) << 16)) | ((((long) this.k()) & 255) << 24)) | ((((long) this.k()) & 255) << 32)) | ((((long) this.k()) & 255) << 40)) | ((((long) this.k()) & 255) << 48)) | ((((long) this.k()) & 255) << 56));
	    }
	
	
	    public final int h()
	    {
	        int v0_2;
	        if (this.g != 2147483647) {
	            v0_2 = (this.g - this.e);
	        } else {
	            v0_2 = -1;
	        }
	        return v0_2;
	    }
	
	
	    public final int i()
	    {
	        return (this.e - this.b);
	    }
	
