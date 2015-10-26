	private static bridge ded d
	private static final dcq e
	private static bridge dee f
	private static final  serialVersionUID
	public java.lang.String a
	private  b
	private java.lang.String c
	
	    static dcq()
	    {
	        dcq.d = 0;
	        dcq.e = new dcq(ddv.c, ddp.a());
	        return;
	    }
	
	
	    private dcq(ddn p6, ddp p7)
	    {
	        this.a = "";
	        this.c = "";
	        del v2 = dek.b();
	        RuntimeException v0_2 = 0;
	        while (v0_2 == null) {
	            try {
	                ddx v3_0 = p6.a();
	                switch (v3_0) {
	                    case 0:
	                        v0_2 = 1;
	                        break;
	                    case 10:
	                        ddx v3_2 = p6.c();
	                        this.b = (this.b | 1);
	                        this.a = v3_2;
	                        break;
	                    case 18:
	                        ddx v3_1 = p6.c();
	                        this.b = (this.b | 2);
	                        this.c = v3_1;
	                        break;
	                    default:
	                        if (!v2.a(v3_0, p6)) {
	                            v0_2 = 1;
	                        }
	                }
	            } catch (RuntimeException v0_6) {
	                v0_6.a = this;
	                throw new RuntimeException(v0_6);
	            } catch (RuntimeException v0_7) {
	            } catch (RuntimeException v0_4) {
	                ddx v3_5 = new ddx(v0_4.getMessage());
	                v3_5.a = this;
	                throw new RuntimeException(v3_5);
	            }
	            this.h = v2.a();
	            throw v0_7;
	        }
	        this.h = v2.a();
	        return;
	    }
	
	
	    public static dcq b()
	    {
	        return dcq.e;
	    }
	
	
	    static synthetic dcq c()
	    {
	        return dcq.e;
	    }
	
	
	    public final int a()
	    {
	        int v0_0 = this.i;
	        if (v0_0 == -1) {
	            int v0_1 = 0;
	            if ((this.b & 1) == 1) {
	                v0_1 = (ddo.b(1, this.a) + 0);
	            }
	            if ((this.b & 2) == 2) {
	                v0_1 += ddo.b(2, this.c);
	            }
	            v0_0 = (v0_1 + this.h.c());
	            this.i = v0_0;
	        }
	        return v0_0;
	    }
	
	
	    protected final Object a(int p5, Object p6, Object p7)
	    {
	        dek v0_0 = 1;
	        switch (dcn.a[(p5 - 1)]) {
	            case 1:
	                this = new dcq;
	                this(((ddn) p6), ((ddp) p7));
	                break;
	            case 2:
	                this = new dcq;
	                this(ddv.c, ddp.a());
	                break;
	            case 3:
	                this = dcq.e;
	                break;
	            case 4:
	                this = 0;
	                break;
	            case 5:
	                this = new dcr;
	                this();
	                break;
	            case 6:
	                if (p6 == dcq.e) {
	                } else {
	                    int v2_6;
	                    if ((((dcq) p6).b & 1) != 1) {
	                        v2_6 = 0;
	                    } else {
	                        v2_6 = 1;
	                    }
	                    if (v2_6 != 0) {
	                        this.b = (this.b | 1);
	                        this.a = ((dcq) p6).a;
	                    }
	                    if ((((dcq) p6).b & 2) != 2) {
	                        v0_0 = 0;
	                    }
	                    if (v0_0 != null) {
	                        this.b = (this.b | 2);
	                        this.c = ((dcq) p6).c;
	                    }
	                    this.a(((dcq) p6).h);
	                }
	                break;
	            case 7:
	                this = dcq.e;
	                break;
	            case 8:
	                if (dcq.f == null) {
	                    if (dcq.f == null) {
	                        dcq.f = new dds(dcq.e);
	                    }
	                }
	                this = dcq.f;
	                break;
	            default:
	                throw new UnsupportedOperationException();
	        }
	        return this;
	    }
	
	
	    public final void a(ddo p4)
	    {
	        if ((this.b & 1) == 1) {
	            p4.a(1, this.a);
	        }
	        if ((this.b & 2) == 2) {
	            p4.a(2, this.c);
	        }
	        this.h.a(p4);
	        return;
	    }
	
