	final B a
	  b
	  c
	  d
	private  e
	private  f
	private  g
	private  h
	private  i
	
	    private cmj(byte[] p2, int p3, int p4)
	    {
	        this.i = 2147483647;
	        this.d = 64;
	        this.a = p2;
	        this.b = p3;
	        this.e = (p3 + p4);
	        this.g = p3;
	        return;
	    }
	
	
	    public static cmj a(byte[] p1, int p2, int p3)
	    {
	        return new cmj(p1, p2, p3);
	    }
	
	
	    private byte[] f(int p5)
	    {
	        if (p5 >= 0) {
	            if ((this.g + p5) <= this.i) {
	                if (p5 > (this.e - this.g)) {
	                    throw cmr.a();
	                } else {
	                    cmr v0_5 = new byte[p5];
	                    System.arraycopy(this.a, this.g, v0_5, 0, p5);
	                    this.g = (this.g + p5);
	                    return v0_5;
	                }
	            } else {
	                this.g((this.i - this.g));
	                throw cmr.a();
	            }
	        } else {
	            throw cmr.b();
	        }
	    }
	
	
	    private void g(int p3)
	    {
	        if (p3 >= 0) {
	            if ((this.g + p3) <= this.i) {
	                if (p3 > (this.e - this.g)) {
	                    throw cmr.a();
	                } else {
	                    this.g = (this.g + p3);
	                    return;
	                }
	            } else {
	                this.g((this.i - this.g));
	                throw cmr.a();
	            }
	        } else {
	            throw cmr.b();
	        }
	    }
	
	
	    private void j()
	    {
	        this.e = (this.e + this.f);
	        int v0_2 = this.e;
	        if (v0_2 <= this.i) {
	            this.f = 0;
	        } else {
	            this.f = (v0_2 - this.i);
	            this.e = (this.e - this.f);
	        }
	        return;
	    }
	
	
	    private byte k()
	    {
	        if (this.g != this.e) {
	            byte v0_1 = this.a;
	            int v1_1 = this.g;
	            this.g = (v1_1 + 1);
	            return v0_1[v1_1];
	        } else {
	            throw cmr.a();
	        }
	    }
	
	
	    public final int a()
	    {
	        int v1_1;
	        int v0_0 = 0;
	        if (this.g != this.e) {
	            v1_1 = 0;
	        } else {
	            v1_1 = 1;
	        }
	        if (v1_1 == 0) {
	            this.h = this.e();
	            if (this.h != 0) {
	                v0_0 = this.h;
	            } else {
	                throw cmr.d();
	            }
	        } else {
	            this.h = 0;
	        }
	        return v0_0;
	    }
	
	
	    public final void a(int p2)
	    {
	        if (this.h == p2) {
	            return;
	        } else {
	            throw cmr.e();
	        }
	    }
	
	
	    public final void a(cms p4)
	    {
	        int v0_0 = this.e();
	        if (this.c < this.d) {
	            int v0_1 = this.c(v0_0);
	            this.c = (this.c + 1);
	            p4.a(this);
	            this.a(0);
	            this.c = (this.c - 1);
	            this.d(v0_1);
	            return;
	        } else {
	            throw cmr.g();
	        }
	    }
	
	
	    public final boolean b()
	    {
	        int v0_1;
	        if (this.e() == 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean b(int p13)
	    {
	        int v0_1;
	        switch (cmu.a(p13)) {
	            case 0:
	                this.e();
	                v0_1 = 1;
	                break;
	            case 1:
	                this.k();
	                this.k();
	                this.k();
	                this.k();
	                this.k();
	                this.k();
	                this.k();
	                this.k();
	                v0_1 = 1;
	                break;
	            case 2:
	                this.g(this.e());
	                v0_1 = 1;
	                break;
	            case 3:
	                do {
	                    int v0_2 = this.a();
	                } while((v0_2 != 0) && (this.b(v0_2)));
	                this.a(cmu.a(cmu.b(p13), 4));
	                v0_1 = 1;
	                break;
	            case 4:
	                v0_1 = 0;
	                break;
	            case 5:
	                this.g();
	                v0_1 = 1;
	                break;
	            default:
	                throw cmr.f();
	        }
	        return v0_1;
	    }
	
	
	    public final int c(int p3)
	    {
	        if (p3 >= 0) {
	            cmr v0_1 = (this.g + p3);
	            int v1 = this.i;
	            if (v0_1 <= v1) {
	                this.i = v0_1;
	                this.j();
	                return v1;
	            } else {
	                throw cmr.a();
	            }
	        } else {
	            throw cmr.b();
	        }
	    }
	
	
	    public final String c()
	    {
	        String v0_3;
	        int v1_0 = this.e();
	        if ((v1_0 > (this.e - this.g)) || (v1_0 <= 0)) {
	            v0_3 = new String(this.f(v1_0), "UTF-8");
	        } else {
	            v0_3 = new String(this.a, this.g, v1_0, "UTF-8");
	            this.g = (v1_0 + this.g);
	        }
	        return v0_3;
	    }
	
	
	    public final void d(int p1)
	    {
	        this.i = p1;
	        this.j();
	        return;
	    }
	
	
	    public final byte[] d()
	    {
	        byte[] v0_2;
	        int v1_0 = this.e();
	        if ((v1_0 > (this.e - this.g)) || (v1_0 <= 0)) {
	            v0_2 = this.f(v1_0);
	        } else {
	            v0_2 = new byte[v1_0];
	            System.arraycopy(this.a, this.g, v0_2, 0, v1_0);
	            this.g = (v1_0 + this.g);
	        }
	        return v0_2;
	    }
	
	
	    public final int e()
	    {
	        cmr v0_0 = this.k();
	        if (v0_0 < null) {
	            cmr v0_1 = (v0_0 & 127);
	            int v1_0 = this.k();
	            if (v1_0 < 0) {
	                cmr v0_2 = (v0_1 | ((v1_0 & 127) << 7));
	                int v1_3 = this.k();
	                if (v1_3 < 0) {
	                    cmr v0_3 = (v0_2 | ((v1_3 & 127) << 14));
	                    int v1_6 = this.k();
	                    if (v1_6 < 0) {
	                        cmr v0_4 = (v0_3 | ((v1_6 & 127) << 21));
	                        int v1_9 = this.k();
	                        v0_0 = (v0_4 | (v1_9 << 28));
	                        if (v1_9 < 0) {
	                            int v1_10 = 0;
	                            while (v1_10 < 5) {
	                                if (this.k() < 0) {
	                                    v1_10++;
	                                }
	                            }
	                            throw cmr.c();
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
	        if (p5 <= (this.g - this.b)) {
	            if (p5 >= 0) {
	                this.g = (this.b + p5);
	                return;
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("Bad position ").append(p5).toString());
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("Position ").append(p5).append(" is beyond current ").append((this.g - this.b)).toString());
	        }
	    }
	
	
	    public final long f()
	    {
	        int v2 = 0;
	        cmr v0_0 = 0;
	        while (v2 < 64) {
	            int v3_1 = this.k();
	            v0_0 |= (((long) (v3_1 & 127)) << v2);
	            if ((v3_1 & 128) != 0) {
	                v2 += 7;
	            } else {
	                return v0_0;
	            }
	        }
	        throw cmr.c();
	    }
	
	
	    public final int g()
	    {
	        return ((((this.k() & 255) | ((this.k() & 255) << 8)) | ((this.k() & 255) << 16)) | ((this.k() & 255) << 24));
	    }
	
	
	    public final int h()
	    {
	        int v0_2;
	        if (this.i != 2147483647) {
	            v0_2 = (this.i - this.g);
	        } else {
	            v0_2 = -1;
	        }
	        return v0_2;
	    }
	
	
	    public final int i()
	    {
	        return (this.g - this.b);
	    }
	
