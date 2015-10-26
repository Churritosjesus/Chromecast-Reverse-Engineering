	public  a
	public B b
	public  c
	private  d
	private java.lang.String e
	private  f
	private  g
	private  h
	private Lcmz i
	private cmw j
	private B k
	private B l
	private cmv o
	private java.lang.String p
	private cmx q
	
	    public cmy()
	    {
	        this.a = 0;
	        this.d = 0;
	        this.e = "";
	        this.f = 0;
	        this.g = 0;
	        this.h = 0;
	        this.i = cmz.b();
	        this.j = 0;
	        this.b = cmu.d;
	        this.k = cmu.d;
	        this.l = cmu.d;
	        this.o = 0;
	        this.p = "";
	        this.c = 180000;
	        this.q = 0;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0_0 = super.a();
	        if (this.a != 0) {
	            v0_0 += cmk.b(1, this.a);
	        }
	        if (!this.e.equals("")) {
	            v0_0 += cmk.b(2, this.e);
	        }
	        if ((this.i != null) && (this.i.length > 0)) {
	            int v1_11 = v0_0;
	            int v0_1 = 0;
	            while (v0_1 < this.i.length) {
	                long v2_26 = this.i[v0_1];
	                if (v2_26 != 0) {
	                    v1_11 += cmk.b(3, v2_26);
	                }
	                v0_1++;
	            }
	            v0_0 = v1_11;
	        }
	        if (!java.util.Arrays.equals(this.b, cmu.d)) {
	            v0_0 += cmk.b(6, this.b);
	        }
	        if (this.o != null) {
	            v0_0 += cmk.b(7, this.o);
	        }
	        if (!java.util.Arrays.equals(this.k, cmu.d)) {
	            v0_0 += cmk.b(8, this.k);
	        }
	        if (this.j != null) {
	            v0_0 += cmk.b(9, this.j);
	        }
	        if (this.h) {
	            v0_0 += (cmk.c(10) + 1);
	        }
	        if (this.f != 0) {
	            v0_0 += cmk.b(11, this.f);
	        }
	        if (this.g != 0) {
	            v0_0 += cmk.b(12, this.g);
	        }
	        if (!java.util.Arrays.equals(this.l, cmu.d)) {
	            v0_0 += cmk.b(13, this.l);
	        }
	        if (!this.p.equals("")) {
	            v0_0 += cmk.b(14, this.p);
	        }
	        if (this.c != 180000) {
	            v0_0 += (cmk.c(15) + cmk.b(cmk.c(this.c)));
	        }
	        if (this.q != null) {
	            v0_0 += cmk.b(16, this.q);
	        }
	        if (this.d != 0) {
	            v0_0 += cmk.b(17, this.d);
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic cms a(cmj p9)
	    {
	        while(true) {
	            cmz v0_0 = p9.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.a = p9.f();
	                    break;
	                case 18:
	                    this.e = p9.c();
	                    break;
	                case 26:
	                    cmz v0_24;
	                    cmz[] v2_5 = cmu.a(p9, 26);
	                    if (this.i != null) {
	                        v0_24 = this.i.length;
	                    } else {
	                        v0_24 = 0;
	                    }
	                    cmz[] v2_7 = new cmz[(v2_5 + v0_24)];
	                    if (v0_24 != null) {
	                        System.arraycopy(this.i, 0, v2_7, 0, v0_24);
	                    }
	                    while (v0_24 < (v2_7.length - 1)) {
	                        v2_7[v0_24] = new cmz();
	                        p9.a(v2_7[v0_24]);
	                        p9.a();
	                        v0_24++;
	                    }
	                    v2_7[v0_24] = new cmz();
	                    p9.a(v2_7[v0_24]);
	                    this.i = v2_7;
	                    break;
	                case 50:
	                    this.b = p9.d();
	                    break;
	                case 58:
	                    if (this.o == null) {
	                        this.o = new cmv();
	                    }
	                    p9.a(this.o);
	                    break;
	                case 66:
	                    this.k = p9.d();
	                    break;
	                case 74:
	                    if (this.j == null) {
	                        this.j = new cmw();
	                    }
	                    p9.a(this.j);
	                    break;
	                case 80:
	                    this.h = p9.b();
	                    break;
	                case 88:
	                    this.f = p9.e();
	                    break;
	                case 96:
	                    this.g = p9.e();
	                    break;
	                case 106:
	                    this.l = p9.d();
	                    break;
	                case 114:
	                    this.p = p9.c();
	                    break;
	                case 120:
	                    cmz[] v2_1 = p9.f();
	                    this.c = ((- (v2_1 & 1)) ^ (v2_1 >> 1));
	                    break;
	                case 130:
	                    if (this.q == null) {
	                        this.q = new cmx();
	                    }
	                    p9.a(this.q);
	                    break;
	                case 136:
	                    this.d = p9.f();
	                    break;
	                default:
	                    if (this.a(p9, v0_0)) {
	                    } else {
	                    }
	            }
	            return this;
	        }
	    }
	
	
	    public final void a(cmk p9)
	    {
	        if (this.a != 0) {
	            p9.a(1, this.a);
	        }
	        if (!this.e.equals("")) {
	            p9.a(2, this.e);
	        }
	        if ((this.i != null) && (this.i.length > 0)) {
	            int v0_8 = 0;
	            while (v0_8 < this.i.length) {
	                long v2_23 = this.i[v0_8];
	                if (v2_23 != 0) {
	                    p9.a(3, v2_23);
	                }
	                v0_8++;
	            }
	        }
	        if (!java.util.Arrays.equals(this.b, cmu.d)) {
	            p9.a(6, this.b);
	        }
	        if (this.o != null) {
	            p9.a(7, this.o);
	        }
	        if (!java.util.Arrays.equals(this.k, cmu.d)) {
	            p9.a(8, this.k);
	        }
	        if (this.j != null) {
	            p9.a(9, this.j);
	        }
	        if (this.h) {
	            p9.a(10, this.h);
	        }
	        if (this.f != 0) {
	            p9.a(11, this.f);
	        }
	        if (this.g != 0) {
	            p9.a(12, this.g);
	        }
	        if (!java.util.Arrays.equals(this.l, cmu.d)) {
	            p9.a(13, this.l);
	        }
	        if (!this.p.equals("")) {
	            p9.a(14, this.p);
	        }
	        if (this.c != 180000) {
	            long v2_20 = this.c;
	            p9.c(15, 0);
	            p9.a(cmk.c(v2_20));
	        }
	        if (this.q != null) {
	            p9.a(16, this.q);
	        }
	        if (this.d != 0) {
	            p9.a(17, this.d);
	        }
	        super.a(p9);
	        return;
	    }
	
	
	    public final boolean equals(Object p7)
	    {
	        boolean v0 = 0;
	        if (p7 != this) {
	            if (((p7 instanceof cmy)) && ((this.a == ((cmy) p7).a) && (this.d == ((cmy) p7).d))) {
	                if (this.e != null) {
	                    if (!this.e.equals(((cmy) p7).e)) {
	                        return v0;
	                    }
	                } else {
	                    if (((cmy) p7).e != null) {
	                        return v0;
	                    }
	                }
	                if ((this.f == ((cmy) p7).f) && ((this.g == ((cmy) p7).g) && ((this.h == ((cmy) p7).h) && (cmq.a(this.i, ((cmy) p7).i))))) {
	                    if (this.j != null) {
	                        if (!this.j.equals(((cmy) p7).j)) {
	                            return v0;
	                        }
	                    } else {
	                        if (((cmy) p7).j != null) {
	                            return v0;
	                        }
	                    }
	                    if ((java.util.Arrays.equals(this.b, ((cmy) p7).b)) && ((java.util.Arrays.equals(this.k, ((cmy) p7).k)) && (java.util.Arrays.equals(this.l, ((cmy) p7).l)))) {
	                        if (this.o != null) {
	                            if (!this.o.equals(((cmy) p7).o)) {
	                                return v0;
	                            }
	                        } else {
	                            if (((cmy) p7).o != null) {
	                                return v0;
	                            }
	                        }
	                        if (this.p != null) {
	                            if (!this.p.equals(((cmy) p7).p)) {
	                                return v0;
	                            }
	                        } else {
	                            if (((cmy) p7).p != null) {
	                                return v0;
	                            }
	                        }
	                        if (this.c == ((cmy) p7).c) {
	                            if (this.q != null) {
	                                if (!this.q.equals(((cmy) p7).q)) {
	                                    return v0;
	                                }
	                            } else {
	                                if (((cmy) p7).q != null) {
	                                    return v0;
	                                }
	                            }
	                            v0 = this.a(((cmy) p7));
	                        }
	                    }
	                }
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_6;
	        int v1_0 = 0;
	        cmx v2_5 = ((((((int) (this.a ^ (this.a >> 32))) + 527) * 31) + ((int) (this.d ^ (this.d >> 32)))) * 31);
	        if (this.e != null) {
	            v0_6 = this.e.hashCode();
	        } else {
	            v0_6 = 0;
	        }
	        int v0_13;
	        if (!this.h) {
	            v0_13 = 1237;
	        } else {
	            v0_13 = 1231;
	        }
	        int v0_19;
	        cmx v2_11 = ((((v0_13 + ((((((v0_6 + v2_5) * 31) + this.f) * 31) + this.g) * 31)) * 31) + cmq.a(this.i)) * 31);
	        if (this.j != null) {
	            v0_19 = this.j.hashCode();
	        } else {
	            v0_19 = 0;
	        }
	        int v0_29;
	        cmx v2_18 = ((((((((v0_19 + v2_11) * 31) + java.util.Arrays.hashCode(this.b)) * 31) + java.util.Arrays.hashCode(this.k)) * 31) + java.util.Arrays.hashCode(this.l)) * 31);
	        if (this.o != null) {
	            v0_29 = this.o.hashCode();
	        } else {
	            v0_29 = 0;
	        }
	        int v0_33;
	        cmx v2_19 = ((v0_29 + v2_18) * 31);
	        if (this.p != null) {
	            v0_33 = this.p.hashCode();
	        } else {
	            v0_33 = 0;
	        }
	        int v0_37 = ((((v0_33 + v2_19) * 31) + ((int) (this.c ^ (this.c >> 32)))) * 31);
	        if (this.q != null) {
	            v1_0 = this.q.hashCode();
	        }
	        return (((v0_37 + v1_0) * 31) + this.c());
	    }
	
