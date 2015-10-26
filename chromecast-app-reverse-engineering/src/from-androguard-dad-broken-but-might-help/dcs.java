	private static bridge ded g
	private static final dcs j
	private static bridge dee k
	private static final  serialVersionUID
	private  a
	private java.lang.String b
	private java.lang.String c
	private java.lang.String d
	private  e
	private java.lang.String f
	
	    static dcs()
	    {
	        dcs.g = 0;
	        dcs.j = new dcs(ddv.c, ddp.a());
	        return;
	    }
	
	
	    private dcs(ddn p7, ddp p8)
	    {
	        this.b = "";
	        this.c = "";
	        this.d = "";
	        this.e = 0;
	        this.f = "";
	        del v2_1 = dek.b();
	        RuntimeException v0_4 = 0;
	        while (v0_4 == null) {
	            try {
	                ddx v3_0 = p7.a();
	                switch (v3_0) {
	                    case 0:
	                        v0_4 = 1;
	                        break;
	                    case 10:
	                        ddx v3_6 = p7.c();
	                        this.a = (this.a | 1);
	                        this.b = v3_6;
	                        break;
	                    case 18:
	                        ddx v3_5 = p7.c();
	                        this.a = (this.a | 2);
	                        this.c = v3_5;
	                        break;
	                    case 26:
	                        ddx v3_4 = p7.c();
	                        this.a = (this.a | 4);
	                        this.d = v3_4;
	                        break;
	                    case 32:
	                        this.a = (this.a | 8);
	                        this.e = p7.b();
	                        break;
	                    case 42:
	                        ddx v3_1 = p7.c();
	                        this.a = (this.a | 16);
	                        this.f = v3_1;
	                        break;
	                    default:
	                        if (!v2_1.a(v3_0, p7)) {
	                            v0_4 = 1;
	                        }
	                }
	            } catch (RuntimeException v0_9) {
	            } catch (RuntimeException v0_6) {
	                ddx v3_9 = new ddx(v0_6.getMessage());
	                v3_9.a = this;
	                throw new RuntimeException(v3_9);
	            } catch (RuntimeException v0_8) {
	                v0_8.a = this;
	                throw new RuntimeException(v0_8);
	            }
	            this.h = v2_1.a();
	            throw v0_9;
	        }
	        this.h = v2_1.a();
	        return;
	    }
	
	
	    static synthetic void a(dcs p1, String p2)
	    {
	        if (p2 != null) {
	            p1.a = (p1.a | 1);
	            p1.b = p2;
	            return;
	        } else {
	            throw new NullPointerException();
	        }
	    }
	
	
	    public static dct b()
	    {
	        return ((dct) dcs.j.i());
	    }
	
	
	    static synthetic void b(dcs p1, String p2)
	    {
	        if (p2 != null) {
	            p1.a = (p1.a | 4);
	            p1.d = p2;
	            return;
	        } else {
	            throw new NullPointerException();
	        }
	    }
	
	
	    static synthetic dcs c()
	    {
	        return dcs.j;
	    }
	
	
	    public final int a()
	    {
	        int v0_0 = this.i;
	        if (v0_0 == -1) {
	            int v0_1 = 0;
	            if ((this.a & 1) == 1) {
	                v0_1 = (ddo.b(1, this.b) + 0);
	            }
	            if ((this.a & 2) == 2) {
	                v0_1 += ddo.b(2, this.c);
	            }
	            if ((this.a & 4) == 4) {
	                v0_1 += ddo.b(3, this.d);
	            }
	            if ((this.a & 8) == 8) {
	                v0_1 += ddo.b(4, this.e);
	            }
	            if ((this.a & 16) == 16) {
	                v0_1 += ddo.b(5, this.f);
	            }
	            v0_0 = (v0_1 + this.h.c());
	            this.i = v0_0;
	        }
	        return v0_0;
	    }
	
	
	    protected final Object a(int p6, Object p7, Object p8)
	    {
	        dek v0_0 = 1;
	        switch (dcn.a[(p6 - 1)]) {
	            case 1:
	                this = new dcs;
	                this(((ddn) p7), ((ddp) p8));
	                break;
	            case 2:
	                this = new dcs;
	                this(ddv.c, ddp.a());
	                break;
	            case 3:
	                this = dcs.j;
	                break;
	            case 4:
	                this = 0;
	                break;
	            case 5:
	                this = new dct;
	                this();
	                break;
	            case 6:
	                if (p7 == dcs.j) {
	                } else {
	                    int v2_6;
	                    if ((((dcs) p7).a & 1) != 1) {
	                        v2_6 = 0;
	                    } else {
	                        v2_6 = 1;
	                    }
	                    if (v2_6 != 0) {
	                        this.a = (this.a | 1);
	                        this.b = ((dcs) p7).b;
	                    }
	                    int v2_12;
	                    if ((((dcs) p7).a & 2) != 2) {
	                        v2_12 = 0;
	                    } else {
	                        v2_12 = 1;
	                    }
	                    if (v2_12 != 0) {
	                        this.a = (this.a | 2);
	                        this.c = ((dcs) p7).c;
	                    }
	                    int v2_18;
	                    if ((((dcs) p7).a & 4) != 4) {
	                        v2_18 = 0;
	                    } else {
	                        v2_18 = 1;
	                    }
	                    if (v2_18 != 0) {
	                        this.a = (this.a | 4);
	                        this.d = ((dcs) p7).d;
	                    }
	                    int v2_24;
	                    if ((((dcs) p7).a & 8) != 8) {
	                        v2_24 = 0;
	                    } else {
	                        v2_24 = 1;
	                    }
	                    if (v2_24 != 0) {
	                        int v2_25 = ((dcs) p7).e;
	                        this.a = (this.a | 8);
	                        this.e = v2_25;
	                    }
	                    if ((((dcs) p7).a & 16) != 16) {
	                        v0_0 = 0;
	                    }
	                    if (v0_0 != null) {
	                        this.a = (this.a | 16);
	                        this.f = ((dcs) p7).f;
	                    }
	                    this.a(((dcs) p7).h);
	                }
	                break;
	            case 7:
	                this = dcs.j;
	                break;
	            case 8:
	                if (dcs.k == null) {
	                    if (dcs.k == null) {
	                        dcs.k = new dds(dcs.j);
	                    }
	                }
	                this = dcs.k;
	                break;
	            default:
	                throw new UnsupportedOperationException();
	        }
	        return this;
	    }
	
	
	    public final void a(ddo p5)
	    {
	        if ((this.a & 1) == 1) {
	            p5.a(1, this.b);
	        }
	        if ((this.a & 2) == 2) {
	            p5.a(2, this.c);
	        }
	        if ((this.a & 4) == 4) {
	            p5.a(3, this.d);
	        }
	        if ((this.a & 8) == 8) {
	            dek v0_11 = this.e;
	            p5.d(4, 0);
	            p5.a(v0_11);
	        }
	        if ((this.a & 16) == 16) {
	            p5.a(5, this.f);
	        }
	        this.h.a(p5);
	        return;
	    }
	
