	private static final java.util.logging.Logger e
	final B a
	final  b
	  c
	  d
	private final java.io.OutputStream f
	
	    static ddo()
	    {
	        ddo.e = java.util.logging.Logger.getLogger(ddo.getName());
	        return;
	    }
	
	
	    private ddo(byte[] p2, int p3, int p4)
	    {
	        this.d = 0;
	        this.f = 0;
	        this.a = p2;
	        this.c = p3;
	        this.b = (p3 + p4);
	        return;
	    }
	
	
	    public static int a(int p3, long p4)
	    {
	        return (ddo.b(p3) + ddo.b(p4));
	    }
	
	
	    public static int a(int p3, ddl p4)
	    {
	        return (ddo.b(p3) + (ddo.d(p4.b()) + p4.b()));
	    }
	
	
	    public static ddo a(byte[] p3)
	    {
	        return new ddo(p3, 0, p3.length);
	    }
	
	
	    private void a(String p7)
	    {
	        int v0_3;
	        int v0_2 = ddo.d((p7.length() * 3));
	        int v1_1 = ddo.d(p7.length());
	        int v2 = this.c;
	        try {
	            if (v1_1 != v0_2) {
	                v0_3 = a.a(p7);
	                this.c(v0_3);
	                this.c = a.a(p7, this.a, this.c, (this.b - this.c));
	            } else {
	                this.c = (v2 + v1_1);
	                int v3_2 = a.a(p7, this.a, this.c, (this.b - this.c));
	                this.c = v2;
	                v0_3 = ((v3_2 - v2) - v1_1);
	                this.c(v0_3);
	                this.c = v3_2;
	            }
	        } catch (int v0_8) {
	            this.c = v2;
	            throw v0_8;
	        } catch (int v0_7) {
	            throw new cml(v0_7);
	        }
	        this.d = (v0_3 + this.d);
	        return;
	    }
	
	
	    public static int b(int p1)
	    {
	        return ddo.d(den.a(p1, 0));
	    }
	
	
	    public static int b(int p1, int p2)
	    {
	        return (ddo.b(p1) + 4);
	    }
	
	
	    public static int b(int p3, long p4)
	    {
	        return (ddo.b(4) + ddo.b(p4));
	    }
	
	
	    public static int b(int p3, dea p4)
	    {
	        int v0_0 = ddo.b(p3);
	        int v1_0 = p4.a();
	        return (v0_0 + (v1_0 + ddo.d(v1_0)));
	    }
	
	
	    public static int b(int p2, String p3)
	    {
	        return (ddo.b(p2) + ddo.b(p3));
	    }
	
	
	    private static int b(long p4)
	    {
	        int v0_27;
	        if ((-128 & p4) != 0) {
	            if ((-16384 & p4) != 0) {
	                if ((-2097152 & p4) != 0) {
	                    if ((-268435456 & p4) != 0) {
	                        if ((nan & p4) != 0) {
	                            if ((nan & p4) != 0) {
	                                if ((nan & p4) != 0) {
	                                    if ((-5.486124068793689e+303 & p4) != 0) {
	                                        if ((-0.0 & p4) != 0) {
	                                            v0_27 = 10;
	                                        } else {
	                                            v0_27 = 9;
	                                        }
	                                    } else {
	                                        v0_27 = 8;
	                                    }
	                                } else {
	                                    v0_27 = 7;
	                                }
	                            } else {
	                                v0_27 = 6;
	                            }
	                        } else {
	                            v0_27 = 5;
	                        }
	                    } else {
	                        v0_27 = 4;
	                    }
	                } else {
	                    v0_27 = 3;
	                }
	            } else {
	                v0_27 = 2;
	            }
	        } else {
	            v0_27 = 1;
	        }
	        return v0_27;
	    }
	
	
	    private static int b(String p2)
	    {
	        try {
	            int v0_0 = a.a(p2);
	        } catch (int v0) {
	            v0_0 = p2.getBytes(ddv.a).length;
	        }
	        return (v0_0 + ddo.d(v0_0));
	    }
	
	
	    public static int c(int p2, int p3)
	    {
	        int v0_0;
	        int v1 = ddo.b(p2);
	        if (p3 < 0) {
	            v0_0 = 10;
	        } else {
	            v0_0 = ddo.d(p3);
	        }
	        return (v0_0 + v1);
	    }
	
	
	    public static int c(int p1, long p2)
	    {
	        return (ddo.b(p1) + 8);
	    }
	
	
	    private static int d(int p1)
	    {
	        int v0_6;
	        if ((p1 & -128) != 0) {
	            if ((p1 & -16384) != 0) {
	                if ((-2097152 & p1) != 0) {
	                    if ((-268435456 & p1) != 0) {
	                        v0_6 = 5;
	                    } else {
	                        v0_6 = 4;
	                    }
	                } else {
	                    v0_6 = 3;
	                }
	            } else {
	                v0_6 = 2;
	            }
	        } else {
	            v0_6 = 1;
	        }
	        return v0_6;
	    }
	
	
	    public final void a()
	    {
	        if ((this.b - this.c) == 0) {
	            return;
	        } else {
	            throw new IllegalStateException("Did not write as much data as expected.");
	        }
	    }
	
	
	    public final void a(int p5)
	    {
	        if (this.c != this.b) {
	            byte[] v1_1 = this.a;
	            int v2_1 = this.c;
	            this.c = (v2_1 + 1);
	            v1_1[v2_1] = ((byte) p5);
	            this.d = (this.d + 1);
	            return;
	        } else {
	            throw new cml();
	        }
	    }
	
	
	    public final void a(int p3, int p4)
	    {
	        this.d(p3, 0);
	        if (p4 < 0) {
	            this.a(((long) p4));
	        } else {
	            this.c(p4);
	        }
	        return;
	    }
	
	
	    public final void a(int p2, dea p3)
	    {
	        this.d(p2, 2);
	        this.c(p3.a());
	        p3.a(this);
	        return;
	    }
	
	
	    public final void a(int p7, String p8)
	    {
	        this.d(p7, 2);
	        try {
	            this.a(p8);
	        } catch (cml v0_1) {
	            ddo.e.log(java.util.logging.Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", v0_1);
	            cml v0_3 = p8.getBytes(ddv.a);
	            this.c(v0_3.length);
	            int v1_2 = v0_3.length;
	            if ((this.b - this.c) < v1_2) {
	                int v2_4 = (this.b - this.c);
	                System.arraycopy(v0_3, 0, this.a, this.c, v2_4);
	                this.c = this.b;
	                this.d = (this.d + v2_4);
	                throw new cml();
	            } else {
	                System.arraycopy(v0_3, 0, this.a, this.c, v1_2);
	                this.c = (this.c + v1_2);
	                this.d = (this.d + v1_2);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(long p6)
	    {
	        while ((-128 & p6) != 0) {
	            this.a(((((int) p6) & 127) | 128));
	            p6 >>= 7;
	        }
	        this.a(((int) p6));
	        return;
	    }
	
	
	    public final void c(int p2)
	    {
	        while ((p2 & -128) != 0) {
	            this.a(((p2 & 127) | 128));
	            p2 >>= 7;
	        }
	        this.a(p2);
	        return;
	    }
	
	
	    public final void d(int p2, int p3)
	    {
	        this.c(den.a(p2, p3));
	        return;
	    }
	
