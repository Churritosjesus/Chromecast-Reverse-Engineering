	final B a
	  b
	  c
	private final  d
	private  e
	private final java.io.InputStream f
	private  g
	private  h
	private  i
	private  j
	private  k
	private  l
	private  m
	private s n
	
	    private ddn(byte[] p4, int p5, int p6)
	    {
	        this.h = 0;
	        this.j = 2147483647;
	        this.l = 100;
	        this.m = 67108864;
	        this.n = 0;
	        this.a = p4;
	        this.b = (p5 + p6);
	        this.c = p5;
	        this.i = (- p5);
	        this.f = 0;
	        this.d = 0;
	        return;
	    }
	
	
	    public static ddn a(byte[] p2, int p3, int p4)
	    {
	        ddx v0_1 = new ddn(p2, p3, p4);
	        try {
	            v0_1.d(p4);
	            return v0_1;
	        } catch (ddx v0_2) {
	            throw new IllegalArgumentException(v0_2);
	        }
	    }
	
	
	    private int d(int p3)
	    {
	        if (p3 >= 0) {
	            ddx v0_2 = ((this.i + this.c) + p3);
	            int v1_1 = this.j;
	            if (v0_2 <= v1_1) {
	                this.j = v0_2;
	                this.f();
	                return v1_1;
	            } else {
	                throw ddx.a();
	            }
	        } else {
	            throw ddx.b();
	        }
	    }
	
	
	    private long e()
	    {
	        long v2 = 0;
	        int v0_0 = 0;
	        while (v0_0 < 64) {
	            if (this.c == this.b) {
	                this.b(1);
	            }
	            int v1_3 = this.a;
	            long v4_1 = this.c;
	            this.c = (v4_1 + 1);
	            int v1_4 = v1_3[v4_1];
	            v2 |= (((long) (v1_4 & 127)) << v0_0);
	            if ((v1_4 & 128) != 0) {
	                v0_0 += 7;
	            } else {
	                return v2;
	            }
	        }
	        throw ddx.c();
	    }
	
	
	    private boolean e(int p4)
	    {
	        if ((this.c + p4) > this.b) {
	            // Both branches of the condition point to the same code.
	            // if (((this.i + this.c) + p4) <= this.j) {
	                return 0;
	            // }
	        } else {
	            throw new IllegalStateException(new StringBuilder(77).append("refillBuffer() called when ").append(p4).append(" bytes were already available in buffer").toString());
	        }
	    }
	
	
	    private void f()
	    {
	        this.b = (this.b + this.e);
	        int v0_3 = (this.i + this.b);
	        if (v0_3 <= this.j) {
	            this.e = 0;
	        } else {
	            this.e = (v0_3 - this.j);
	            this.b = (this.b - this.e);
	        }
	        return;
	    }
	
	
	    private void f(int p5)
	    {
	        if ((p5 > (this.b - this.c)) || (p5 < 0)) {
	            if (p5 >= 0) {
	                if (((this.i + this.c) + p5) <= this.j) {
	                    int v0_6 = (this.b - this.c);
	                    this.c = this.b;
	                    this.b(1);
	                    while ((p5 - v0_6) > this.b) {
	                        v0_6 += this.b;
	                        this.c = this.b;
	                        this.b(1);
	                    }
	                    this.c = (p5 - v0_6);
	                } else {
	                    this.f(((this.j - this.i) - this.c));
	                    throw ddx.a();
	                }
	            } else {
	                throw ddx.b();
	            }
	        } else {
	            this.c = (this.c + p5);
	        }
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v1 = 1;
	        int v0_0 = 0;
	        if ((this.c != this.b) || (this.e(1))) {
	            v1 = 0;
	        }
	        if (v1 == 0) {
	            this.g = this.d();
	            if (den.b(this.g) != 0) {
	                v0_0 = this.g;
	            } else {
	                throw ddx.d();
	            }
	        } else {
	            this.g = 0;
	        }
	        return v0_0;
	    }
	
	
	    public final ddq a(ddq p4, ddp p5)
	    {
	        int v0_0 = this.d();
	        if (this.k < this.l) {
	            int v0_1 = this.d(v0_0);
	            this.k = (this.k + 1);
	            ddq v1_3 = ddq.a(p4, this, p5);
	            this.a(0);
	            this.k = (this.k - 1);
	            this.j = v0_1;
	            this.f();
	            return v1_3;
	        } else {
	            throw ddx.g();
	        }
	    }
	
	
	    public final void a(int p2)
	    {
	        if (this.g == p2) {
	            return;
	        } else {
	            throw ddx.e();
	        }
	    }
	
	
	    public final long b()
	    {
	        long v0_11;
	        long v0_0 = this.c;
	        if (this.b == v0_0) {
	            v0_11 = this.e();
	        } else {
	            long v4_0 = this.a;
	            int v1_1 = (v0_0 + 1);
	            long v0_1 = v4_0[v0_0];
	            if (v0_1 < 0) {
	                if ((this.b - v1_1) < 9) {
	                } else {
	                    long v2_2 = (v1_1 + 1);
	                    long v0_2 = (v0_1 ^ (v4_0[v1_1] << 7));
	                    if (v0_2 >= 0) {
	                        long v3_1 = (v2_2 + 1);
	                        long v0_3 = (v0_2 ^ (v4_0[v2_2] << 14));
	                        if (v0_3 < 0) {
	                            v2_2 = (v3_1 + 1);
	                            long v0_4 = (v0_3 ^ (v4_0[v3_1] << 21));
	                            if (v0_4 >= 0) {
	                                long v3_2 = (v2_2 + 1);
	                                long v0_6 = (((long) v0_4) ^ (((long) v4_0[v2_2]) << 28));
	                                if (v0_6 < 0) {
	                                    v2_2 = (v3_2 + 1);
	                                    long v0_7 = (v0_6 ^ (((long) v4_0[v3_2]) << 35));
	                                    if (v0_7 >= 0) {
	                                        long v3_6 = (v2_2 + 1);
	                                        long v0_8 = (v0_7 ^ (((long) v4_0[v2_2]) << 42));
	                                        if (v0_8 < 0) {
	                                            v2_2 = (v3_6 + 1);
	                                            long v0_9 = (v0_8 ^ (((long) v4_0[v3_6]) << 49));
	                                            if (v0_9 >= 0) {
	                                                long v3_10 = (v2_2 + 1);
	                                                v0_11 = ((v0_9 ^ (((long) v4_0[v2_2]) << 56)) ^ 6.838959413692434e-304);
	                                                if (v0_11 >= 0) {
	                                                    v2_2 = v3_10;
	                                                } else {
	                                                    v2_2 = (v3_10 + 1);
	                                                    if (((long) v4_0[v3_10]) < 0) {
	                                                    }
	                                                }
	                                            } else {
	                                                v0_11 = (v0_9 ^ nan);
	                                            }
	                                        } else {
	                                            v0_11 = (v0_8 ^ 2.1560793202584e-311);
	                                            v2_2 = v3_6;
	                                        }
	                                    } else {
	                                        v0_11 = (v0_7 ^ nan);
	                                    }
	                                } else {
	                                    v0_11 = (v0_6 ^ 266354560);
	                                    v2_2 = v3_2;
	                                }
	                            } else {
	                                v0_11 = ((long) (v0_4 ^ -2080896));
	                            }
	                        } else {
	                            v0_11 = ((long) (v0_3 ^ 16256));
	                            v2_2 = v3_1;
	                        }
	                    } else {
	                        v0_11 = ((long) (v0_2 ^ -128));
	                    }
	                    this.c = v2_2;
	                }
	            } else {
	                this.c = v1_1;
	                v0_11 = ((long) v0_1);
	            }
	        }
	        return v0_11;
	    }
	
	
	    void b(int p2)
	    {
	        if (this.e(p2)) {
	            return;
	        } else {
	            throw ddx.a();
	        }
	    }
	
	
	    public final String c()
	    {
	        String v0_3;
	        byte[] v1_0 = this.d();
	        if ((v1_0 > (this.b - this.c)) || (v1_0 <= null)) {
	            if (v1_0 != null) {
	                v0_3 = new String(this.c(v1_0), ddv.a);
	            } else {
	                v0_3 = "";
	            }
	        } else {
	            v0_3 = new String(this.a, this.c, v1_0, ddv.a);
	            this.c = (v1_0 + this.c);
	        }
	        return v0_3;
	    }
	
	
	    byte[] c(int p9)
	    {
	        byte[] v0_9;
	        if (p9 > 0) {
	            if (((this.i + this.c) + p9) <= this.j) {
	                if (p9 >= 4096) {
	                    int v1_2 = this.c;
	                    java.util.Iterator v3_0 = this.b;
	                    this.i = (this.i + this.b);
	                    this.c = 0;
	                    this.b = 0;
	                    byte[] v0_6 = (p9 - (v3_0 - v1_2));
	                    int v4_1 = new java.util.ArrayList();
	                    while (v0_6 > null) {
	                        byte[] v2_3 = new byte[Math.min(v0_6, 4096)];
	                        if (v2_3.length <= 0) {
	                            v0_6 -= v2_3.length;
	                            v4_1.add(v2_3);
	                        } else {
	                            throw ddx.a();
	                        }
	                    }
	                    byte[] v2_1 = new byte[p9];
	                    byte[] v0_7 = (v3_0 - v1_2);
	                    System.arraycopy(this.a, v1_2, v2_1, 0, v0_7);
	                    java.util.Iterator v3_2 = v4_1.iterator();
	                    int v1_3 = v0_7;
	                    while (v3_2.hasNext()) {
	                        byte[] v0_11 = ((byte[]) v3_2.next());
	                        System.arraycopy(v0_11, 0, v2_1, v1_3, v0_11.length);
	                        v1_3 = (v0_11.length + v1_3);
	                    }
	                    v0_9 = v2_1;
	                } else {
	                    v0_9 = new byte[p9];
	                    int v1_5 = (this.b - this.c);
	                    System.arraycopy(this.a, this.c, v0_9, 0, v1_5);
	                    this.c = this.b;
	                    byte[] v2_7 = (p9 - v1_5);
	                    if ((this.b - this.c) < v2_7) {
	                        this.b(v2_7);
	                    }
	                    System.arraycopy(this.a, 0, v0_9, v1_5, (p9 - v1_5));
	                    this.c = (p9 - v1_5);
	                }
	            } else {
	                this.f(((this.j - this.i) - this.c));
	                throw ddx.a();
	            }
	        } else {
	            if (p9 != 0) {
	                throw ddx.b();
	            } else {
	                v0_9 = ddv.b;
	            }
	        }
	        return v0_9;
	    }
	
	
	    public final int d()
	    {
	        int v0_1;
	        int v0_0 = this.c;
	        if (this.b == v0_0) {
	            v0_1 = ((int) this.e());
	        } else {
	            byte[] v3 = this.a;
	            byte v2_0 = (v0_0 + 1);
	            v0_1 = v3[v0_0];
	            if (v0_1 < 0) {
	                if ((this.b - v2_0) < 9) {
	                } else {
	                    int v1_3 = (v2_0 + 1);
	                    int v0_2 = (v0_1 ^ (v3[v2_0] << 7));
	                    if (v0_2 >= 0) {
	                        byte v2_3 = (v1_3 + 1);
	                        int v0_3 = (v0_2 ^ (v3[v1_3] << 14));
	                        if (v0_3 < 0) {
	                            v1_3 = (v2_3 + 1);
	                            int v0_4 = (v0_3 ^ (v3[v2_3] << 21));
	                            if (v0_4 >= 0) {
	                                byte v2_6 = (v1_3 + 1);
	                                int v1_6 = v3[v1_3];
	                                v0_1 = ((v0_4 ^ (v1_6 << 28)) ^ 266354560);
	                                if (v1_6 < 0) {
	                                    v1_3 = (v2_6 + 1);
	                                    if (v3[v2_6] >= 0) {
	                                        this.c = v1_3;
	                                        return v0_1;
	                                    } else {
	                                        v2_6 = (v1_3 + 1);
	                                        if (v3[v1_3] < 0) {
	                                            v1_3 = (v2_6 + 1);
	                                            if (v3[v2_6] >= 0) {
	                                            } else {
	                                                v2_6 = (v1_3 + 1);
	                                                if (v3[v1_3] < 0) {
	                                                    v1_3 = (v2_6 + 1);
	                                                    if (v3[v2_6] >= 0) {
	                                                    }
	                                                }
	                                            }
	                                        }
	                                    }
	                                }
	                                v1_3 = v2_6;
	                            } else {
	                                v0_1 = (v0_4 ^ -2080896);
	                            }
	                        } else {
	                            v0_1 = (v0_3 ^ 16256);
	                            v1_3 = v2_3;
	                        }
	                    } else {
	                        v0_1 = (v0_2 ^ -128);
	                    }
	                }
	            } else {
	                this.c = v2_0;
	            }
	        }
	        return v0_1;
	    }
	
