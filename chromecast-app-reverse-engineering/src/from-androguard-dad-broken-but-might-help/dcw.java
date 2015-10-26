	private static bridge ded f
	private static final dcw g
	private static bridge dee j
	private static final  serialVersionUID
	public java.lang.String a
	public java.lang.String b
	private  c
	private java.lang.String d
	private  e
	
	    static dcw()
	    {
	        dcw.f = 0;
	        dcw.g = new dcw(ddv.c, ddp.a());
	        return;
	    }
	
	
	    private dcw(ddn p6, ddp p7)
	    {
	        this.a = "";
	        this.b = "";
	        this.d = "";
	        this.e = 2;
	        del v2 = dek.b();
	        RuntimeException v0_4 = 0;
	        while (v0_4 == null) {
	            try {
	                ddx v3_0 = p6.a();
	                switch (v3_0) {
	                    case 0:
	                        v0_4 = 1;
	                        break;
	                    case 10:
	                        ddx v3_4 = p6.c();
	                        this.c = (this.c | 1);
	                        this.a = v3_4;
	                        break;
	                    case 18:
	                        ddx v3_3 = p6.c();
	                        this.c = (this.c | 2);
	                        this.b = v3_3;
	                        break;
	                    case 26:
	                        ddx v3_2 = p6.c();
	                        this.c = (this.c | 4);
	                        this.d = v3_2;
	                        break;
	                    case 32:
	                        ddx v3_1 = p6.d();
	                        if (dco.a(v3_1) != null) {
	                            this.c = (this.c | 8);
	                            this.e = v3_1;
	                        } else {
	                            v2.a(4, v3_1);
	                        }
	                        break;
	                    default:
	                        if (!v2.a(v3_0, p6)) {
	                            v0_4 = 1;
	                        }
	                }
	            } catch (RuntimeException v0_8) {
	                v0_8.a = this;
	                throw new RuntimeException(v0_8);
	            } catch (RuntimeException v0_9) {
	            } catch (RuntimeException v0_6) {
	                ddx v3_7 = new ddx(v0_6.getMessage());
	                v3_7.a = this;
	                throw new RuntimeException(v3_7);
	            }
	            this.h = v2.a();
	            throw v0_9;
	        }
	        this.h = v2.a();
	        return;
	    }
	
	
	    public static dcw c()
	    {
	        return dcw.g;
	    }
	
	
	    static synthetic dcw d()
	    {
	        return dcw.g;
	    }
	
	
	    public final int a()
	    {
	        int v0_0 = this.i;
	        if (v0_0 == -1) {
	            int v0_1 = 0;
	            if ((this.c & 1) == 1) {
	                v0_1 = (ddo.b(1, this.a) + 0);
	            }
	            if ((this.c & 2) == 2) {
	                v0_1 += ddo.b(2, this.b);
	            }
	            if ((this.c & 4) == 4) {
	                v0_1 += ddo.b(3, this.d);
	            }
	            if ((this.c & 8) == 8) {
	                v0_1 += ddo.c(4, this.e);
	            }
	            v0_0 = (v0_1 + this.h.c());
	            this.i = v0_0;
	        }
	        return v0_0;
	    }
	
	
	    protected final Object a(int p5, Object p6, Object p7)
	    {
	        int v0_0 = 1;
	        switch (dcn.a[(p5 - 1)]) {
	            case 1:
	                this = new dcw;
	                this(((ddn) p6), ((ddp) p7));
	                break;
	            case 2:
	                this = new dcw;
	                this(ddv.c, ddp.a());
	                break;
	            case 3:
	                this = dcw.g;
	                break;
	            case 4:
	                this = 0;
	                break;
	            case 5:
	                this = new dcx;
	                this();
	                break;
	            case 6:
	                if (p6 == dcw.g) {
	                } else {
	                    int v2_6;
	                    if ((((dcw) p6).c & 1) != 1) {
	                        v2_6 = 0;
	                    } else {
	                        v2_6 = 1;
	                    }
	                    if (v2_6 != 0) {
	                        this.c = (this.c | 1);
	                        this.a = ((dcw) p6).a;
	                    }
	                    int v2_12;
	                    if ((((dcw) p6).c & 2) != 2) {
	                        v2_12 = 0;
	                    } else {
	                        v2_12 = 1;
	                    }
	                    if (v2_12 != 0) {
	                        this.c = (this.c | 2);
	                        this.b = ((dcw) p6).b;
	                    }
	                    int v2_18;
	                    if ((((dcw) p6).c & 4) != 4) {
	                        v2_18 = 0;
	                    } else {
	                        v2_18 = 1;
	                    }
	                    if (v2_18 != 0) {
	                        this.c = (this.c | 4);
	                        this.d = ((dcw) p6).d;
	                    }
	                    if ((((dcw) p6).c & 8) != 8) {
	                        v0_0 = 0;
	                    }
	                    if (v0_0 != 0) {
	                        int v0_6 = ((dcw) p6).b();
	                        if (v0_6 != 0) {
	                            this.c = (this.c | 8);
	                            this.e = v0_6.d;
	                        } else {
	                            throw new NullPointerException();
	                        }
	                    }
	                    this.a(((dcw) p6).h);
	                }
	                break;
	            case 7:
	                this = dcw.g;
	                break;
	            case 8:
	                if (dcw.j == null) {
	                    if (dcw.j == null) {
	                        dcw.j = new dds(dcw.g);
	                    }
	                }
	                this = dcw.j;
	                break;
	            default:
	                throw new UnsupportedOperationException();
	        }
	        return this;
	    }
	
	
	    public final void a(ddo p5)
	    {
	        if ((this.c & 1) == 1) {
	            p5.a(1, this.a);
	        }
	        if ((this.c & 2) == 2) {
	            p5.a(2, this.b);
	        }
	        if ((this.c & 4) == 4) {
	            p5.a(3, this.d);
	        }
	        if ((this.c & 8) == 8) {
	            p5.a(4, this.e);
	        }
	        this.h.a(p5);
	        return;
	    }
	
	
	    public final dco b()
	    {
	        dco v0_1 = dco.a(this.e);
	        if (v0_1 == null) {
	            v0_1 = dco.b;
	        }
	        return v0_1;
	    }
	
