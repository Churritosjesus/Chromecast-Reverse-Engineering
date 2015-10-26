	public Ljava.lang.String a
	public Lcje b
	public Lciy c
	public Lciv d
	public Lciv e
	public Lciv f
	public Lcja g
	public java.lang.String h
	public  i
	private Ljava.lang.String j
	private java.lang.String k
	private java.lang.String l
	private java.lang.String o
	private ciu p
	private  q
	private  r
	private Ljava.lang.String s
	
	    public ciz()
	    {
	        this.j = cmu.b;
	        this.a = cmu.b;
	        this.b = cje.b();
	        this.c = ciy.b();
	        this.d = civ.b();
	        this.e = civ.b();
	        this.f = civ.b();
	        this.g = cja.b();
	        this.k = "";
	        this.l = "";
	        this.o = "0";
	        this.h = "";
	        this.p = 0;
	        this.q = 0;
	        this.r = 0;
	        this.s = cmu.b;
	        this.i = 0;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0_3;
	        int v1_0 = 0;
	        int v4_0 = super.a();
	        if ((this.a == null) || (this.a.length <= 0)) {
	            v0_3 = v4_0;
	        } else {
	            int v0_4 = 0;
	            int v2_0 = 0;
	            int v3_0 = 0;
	            while (v0_4 < this.a.length) {
	                int v5_8 = this.a[v0_4];
	                if (v5_8 != 0) {
	                    v3_0++;
	                    v2_0 += cmk.a(v5_8);
	                }
	                v0_4++;
	            }
	            v0_3 = ((v4_0 + v2_0) + (v3_0 * 1));
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v2_5 = v0_3;
	            int v0_6 = 0;
	            while (v0_6 < this.b.length) {
	                int v3_43 = this.b[v0_6];
	                if (v3_43 != 0) {
	                    v2_5 += cmk.b(2, v3_43);
	                }
	                v0_6++;
	            }
	            v0_3 = v2_5;
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            int v2_9 = v0_3;
	            int v0_7 = 0;
	            while (v0_7 < this.c.length) {
	                int v3_40 = this.c[v0_7];
	                if (v3_40 != 0) {
	                    v2_9 += cmk.b(3, v3_40);
	                }
	                v0_7++;
	            }
	            v0_3 = v2_9;
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            int v2_13 = v0_3;
	            int v0_8 = 0;
	            while (v0_8 < this.d.length) {
	                int v3_37 = this.d[v0_8];
	                if (v3_37 != 0) {
	                    v2_13 += cmk.b(4, v3_37);
	                }
	                v0_8++;
	            }
	            v0_3 = v2_13;
	        }
	        if ((this.e != null) && (this.e.length > 0)) {
	            int v2_17 = v0_3;
	            int v0_9 = 0;
	            while (v0_9 < this.e.length) {
	                int v3_34 = this.e[v0_9];
	                if (v3_34 != 0) {
	                    v2_17 += cmk.b(5, v3_34);
	                }
	                v0_9++;
	            }
	            v0_3 = v2_17;
	        }
	        if ((this.f != null) && (this.f.length > 0)) {
	            int v2_21 = v0_3;
	            int v0_10 = 0;
	            while (v0_10 < this.f.length) {
	                int v3_31 = this.f[v0_10];
	                if (v3_31 != 0) {
	                    v2_21 += cmk.b(6, v3_31);
	                }
	                v0_10++;
	            }
	            v0_3 = v2_21;
	        }
	        if ((this.g != null) && (this.g.length > 0)) {
	            int v2_25 = v0_3;
	            int v0_11 = 0;
	            while (v0_11 < this.g.length) {
	                int v3_28 = this.g[v0_11];
	                if (v3_28 != 0) {
	                    v2_25 += cmk.b(7, v3_28);
	                }
	                v0_11++;
	            }
	            v0_3 = v2_25;
	        }
	        if (!this.k.equals("")) {
	            v0_3 += cmk.b(9, this.k);
	        }
	        if (!this.l.equals("")) {
	            v0_3 += cmk.b(10, this.l);
	        }
	        if (!this.o.equals("0")) {
	            v0_3 += cmk.b(12, this.o);
	        }
	        if (!this.h.equals("")) {
	            v0_3 += cmk.b(13, this.h);
	        }
	        if (this.p != null) {
	            v0_3 += cmk.b(14, this.p);
	        }
	        if (Float.floatToIntBits(this.q) != Float.floatToIntBits(0)) {
	            v0_3 += (cmk.c(15) + 4);
	        }
	        if ((this.s != null) && (this.s.length > 0)) {
	            int v2_53 = 0;
	            int v3_24 = 0;
	            int v4_1 = 0;
	            while (v2_53 < this.s.length) {
	                int v5_5 = this.s[v2_53];
	                if (v5_5 != 0) {
	                    v4_1++;
	                    v3_24 += cmk.a(v5_5);
	                }
	                v2_53++;
	            }
	            v0_3 = ((v0_3 + v3_24) + (v4_1 * 2));
	        }
	        if (this.i != 0) {
	            v0_3 += cmk.b(17, this.i);
	        }
	        if (this.r) {
	            v0_3 += (cmk.c(18) + 1);
	        }
	        if ((this.j != null) && (this.j.length > 0)) {
	            int v2_65 = 0;
	            int v3_26 = 0;
	            while (v1_0 < this.j.length) {
	                int v4_5 = this.j[v1_0];
	                if (v4_5 != 0) {
	                    v3_26++;
	                    v2_65 += cmk.a(v4_5);
	                }
	                v1_0++;
	            }
	            v0_3 = ((v0_3 + v2_65) + (v3_26 * 2));
	        }
	        return v0_3;
	    }
	
	
	    public final synthetic cms a(cmj p5)
	    {
	        while(true) {
	            int v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    int v0_54;
	                    String[] v2_24 = cmu.a(p5, 10);
	                    if (this.a != null) {
	                        v0_54 = this.a.length;
	                    } else {
	                        v0_54 = 0;
	                    }
	                    String[] v2_26 = new String[(v2_24 + v0_54)];
	                    if (v0_54 != 0) {
	                        System.arraycopy(this.a, 0, v2_26, 0, v0_54);
	                    }
	                    while (v0_54 < (v2_26.length - 1)) {
	                        v2_26[v0_54] = p5.c();
	                        p5.a();
	                        v0_54++;
	                    }
	                    v2_26[v0_54] = p5.c();
	                    this.a = v2_26;
	                    break;
	                case 18:
	                    int v0_49;
	                    String[] v2_21 = cmu.a(p5, 18);
	                    if (this.b != null) {
	                        v0_49 = this.b.length;
	                    } else {
	                        v0_49 = 0;
	                    }
	                    String[] v2_23 = new cje[(v2_21 + v0_49)];
	                    if (v0_49 != 0) {
	                        System.arraycopy(this.b, 0, v2_23, 0, v0_49);
	                    }
	                    while (v0_49 < (v2_23.length - 1)) {
	                        v2_23[v0_49] = new cje();
	                        p5.a(v2_23[v0_49]);
	                        p5.a();
	                        v0_49++;
	                    }
	                    v2_23[v0_49] = new cje();
	                    p5.a(v2_23[v0_49]);
	                    this.b = v2_23;
	                    break;
	                case 26:
	                    int v0_44;
	                    String[] v2_18 = cmu.a(p5, 26);
	                    if (this.c != null) {
	                        v0_44 = this.c.length;
	                    } else {
	                        v0_44 = 0;
	                    }
	                    String[] v2_20 = new ciy[(v2_18 + v0_44)];
	                    if (v0_44 != 0) {
	                        System.arraycopy(this.c, 0, v2_20, 0, v0_44);
	                    }
	                    while (v0_44 < (v2_20.length - 1)) {
	                        v2_20[v0_44] = new ciy();
	                        p5.a(v2_20[v0_44]);
	                        p5.a();
	                        v0_44++;
	                    }
	                    v2_20[v0_44] = new ciy();
	                    p5.a(v2_20[v0_44]);
	                    this.c = v2_20;
	                    break;
	                case 34:
	                    int v0_39;
	                    String[] v2_15 = cmu.a(p5, 34);
	                    if (this.d != null) {
	                        v0_39 = this.d.length;
	                    } else {
	                        v0_39 = 0;
	                    }
	                    String[] v2_17 = new civ[(v2_15 + v0_39)];
	                    if (v0_39 != 0) {
	                        System.arraycopy(this.d, 0, v2_17, 0, v0_39);
	                    }
	                    while (v0_39 < (v2_17.length - 1)) {
	                        v2_17[v0_39] = new civ();
	                        p5.a(v2_17[v0_39]);
	                        p5.a();
	                        v0_39++;
	                    }
	                    v2_17[v0_39] = new civ();
	                    p5.a(v2_17[v0_39]);
	                    this.d = v2_17;
	                    break;
	                case 42:
	                    int v0_34;
	                    String[] v2_12 = cmu.a(p5, 42);
	                    if (this.e != null) {
	                        v0_34 = this.e.length;
	                    } else {
	                        v0_34 = 0;
	                    }
	                    String[] v2_14 = new civ[(v2_12 + v0_34)];
	                    if (v0_34 != 0) {
	                        System.arraycopy(this.e, 0, v2_14, 0, v0_34);
	                    }
	                    while (v0_34 < (v2_14.length - 1)) {
	                        v2_14[v0_34] = new civ();
	                        p5.a(v2_14[v0_34]);
	                        p5.a();
	                        v0_34++;
	                    }
	                    v2_14[v0_34] = new civ();
	                    p5.a(v2_14[v0_34]);
	                    this.e = v2_14;
	                    break;
	                case 50:
	                    int v0_29;
	                    String[] v2_9 = cmu.a(p5, 50);
	                    if (this.f != null) {
	                        v0_29 = this.f.length;
	                    } else {
	                        v0_29 = 0;
	                    }
	                    String[] v2_11 = new civ[(v2_9 + v0_29)];
	                    if (v0_29 != 0) {
	                        System.arraycopy(this.f, 0, v2_11, 0, v0_29);
	                    }
	                    while (v0_29 < (v2_11.length - 1)) {
	                        v2_11[v0_29] = new civ();
	                        p5.a(v2_11[v0_29]);
	                        p5.a();
	                        v0_29++;
	                    }
	                    v2_11[v0_29] = new civ();
	                    p5.a(v2_11[v0_29]);
	                    this.f = v2_11;
	                    break;
	                case 58:
	                    int v0_24;
	                    String[] v2_6 = cmu.a(p5, 58);
	                    if (this.g != null) {
	                        v0_24 = this.g.length;
	                    } else {
	                        v0_24 = 0;
	                    }
	                    String[] v2_8 = new cja[(v2_6 + v0_24)];
	                    if (v0_24 != 0) {
	                        System.arraycopy(this.g, 0, v2_8, 0, v0_24);
	                    }
	                    while (v0_24 < (v2_8.length - 1)) {
	                        v2_8[v0_24] = new cja();
	                        p5.a(v2_8[v0_24]);
	                        p5.a();
	                        v0_24++;
	                    }
	                    v2_8[v0_24] = new cja();
	                    p5.a(v2_8[v0_24]);
	                    this.g = v2_8;
	                    break;
	                case 74:
	                    this.k = p5.c();
	                    break;
	                case 82:
	                    this.l = p5.c();
	                    break;
	                case 98:
	                    this.o = p5.c();
	                    break;
	                case 106:
	                    this.h = p5.c();
	                    break;
	                case 114:
	                    if (this.p == null) {
	                        this.p = new ciu();
	                    }
	                    p5.a(this.p);
	                    break;
	                case 125:
	                    this.q = Float.intBitsToFloat(p5.g());
	                    break;
	                case 130:
	                    int v0_10;
	                    String[] v2_3 = cmu.a(p5, 130);
	                    if (this.s != null) {
	                        v0_10 = this.s.length;
	                    } else {
	                        v0_10 = 0;
	                    }
	                    String[] v2_5 = new String[(v2_3 + v0_10)];
	                    if (v0_10 != 0) {
	                        System.arraycopy(this.s, 0, v2_5, 0, v0_10);
	                    }
	                    while (v0_10 < (v2_5.length - 1)) {
	                        v2_5[v0_10] = p5.c();
	                        p5.a();
	                        v0_10++;
	                    }
	                    v2_5[v0_10] = p5.c();
	                    this.s = v2_5;
	                    break;
	                case 136:
	                    this.i = p5.e();
	                    break;
	                case 144:
	                    this.r = p5.b();
	                    break;
	                case 154:
	                    int v0_4;
	                    String[] v2_0 = cmu.a(p5, 154);
	                    if (this.j != null) {
	                        v0_4 = this.j.length;
	                    } else {
	                        v0_4 = 0;
	                    }
	                    String[] v2_2 = new String[(v2_0 + v0_4)];
	                    if (v0_4 != 0) {
	                        System.arraycopy(this.j, 0, v2_2, 0, v0_4);
	                    }
	                    while (v0_4 < (v2_2.length - 1)) {
	                        v2_2[v0_4] = p5.c();
	                        p5.a();
	                        v0_4++;
	                    }
	                    v2_2[v0_4] = p5.c();
	                    this.j = v2_2;
	                    break;
	                default:
	                    if (this.a(p5, v0_0)) {
	                    } else {
	                    }
	            }
	            return this;
	        }
	    }
	
	
	    public final void a(cmk p6)
	    {
	        int v1 = 0;
	        if ((this.a != null) && (this.a.length > 0)) {
	            String v0_3 = 0;
	            while (v0_3 < this.a.length) {
	                int v2_51 = this.a[v0_3];
	                if (v2_51 != 0) {
	                    p6.a(1, v2_51);
	                }
	                v0_3++;
	            }
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            String v0_7 = 0;
	            while (v0_7 < this.b.length) {
	                int v2_49 = this.b[v0_7];
	                if (v2_49 != 0) {
	                    p6.a(2, v2_49);
	                }
	                v0_7++;
	            }
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            String v0_11 = 0;
	            while (v0_11 < this.c.length) {
	                int v2_47 = this.c[v0_11];
	                if (v2_47 != 0) {
	                    p6.a(3, v2_47);
	                }
	                v0_11++;
	            }
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            String v0_15 = 0;
	            while (v0_15 < this.d.length) {
	                int v2_45 = this.d[v0_15];
	                if (v2_45 != 0) {
	                    p6.a(4, v2_45);
	                }
	                v0_15++;
	            }
	        }
	        if ((this.e != null) && (this.e.length > 0)) {
	            String v0_19 = 0;
	            while (v0_19 < this.e.length) {
	                int v2_43 = this.e[v0_19];
	                if (v2_43 != 0) {
	                    p6.a(5, v2_43);
	                }
	                v0_19++;
	            }
	        }
	        if ((this.f != null) && (this.f.length > 0)) {
	            String v0_23 = 0;
	            while (v0_23 < this.f.length) {
	                int v2_41 = this.f[v0_23];
	                if (v2_41 != 0) {
	                    p6.a(6, v2_41);
	                }
	                v0_23++;
	            }
	        }
	        if ((this.g != null) && (this.g.length > 0)) {
	            String v0_27 = 0;
	            while (v0_27 < this.g.length) {
	                int v2_39 = this.g[v0_27];
	                if (v2_39 != 0) {
	                    p6.a(7, v2_39);
	                }
	                v0_27++;
	            }
	        }
	        if (!this.k.equals("")) {
	            p6.a(9, this.k);
	        }
	        if (!this.l.equals("")) {
	            p6.a(10, this.l);
	        }
	        if (!this.o.equals("0")) {
	            p6.a(12, this.o);
	        }
	        if (!this.h.equals("")) {
	            p6.a(13, this.h);
	        }
	        if (this.p != null) {
	            p6.a(14, this.p);
	        }
	        if (Float.floatToIntBits(this.q) != Float.floatToIntBits(0)) {
	            String v0_44 = this.q;
	            p6.c(15, 5);
	            String v0_45 = Float.floatToIntBits(v0_44);
	            p6.b((v0_45 & 255));
	            p6.b(((v0_45 >> 8) & 255));
	            p6.b(((v0_45 >> 16) & 255));
	            p6.b((v0_45 >> 24));
	        }
	        if ((this.s != null) && (this.s.length > 0)) {
	            String v0_50 = 0;
	            while (v0_50 < this.s.length) {
	                int v2_37 = this.s[v0_50];
	                if (v2_37 != 0) {
	                    p6.a(16, v2_37);
	                }
	                v0_50++;
	            }
	        }
	        if (this.i != 0) {
	            p6.a(17, this.i);
	        }
	        if (this.r) {
	            p6.a(18, this.r);
	        }
	        if ((this.j != null) && (this.j.length > 0)) {
	            while (v1 < this.j.length) {
	                String v0_61 = this.j[v1];
	                if (v0_61 != null) {
	                    p6.a(19, v0_61);
	                }
	                v1++;
	            }
	        }
	        super.a(p6);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if (((p4 instanceof ciz)) && ((cmq.a(this.j, ((ciz) p4).j)) && ((cmq.a(this.a, ((ciz) p4).a)) && ((cmq.a(this.b, ((ciz) p4).b)) && ((cmq.a(this.c, ((ciz) p4).c)) && ((cmq.a(this.d, ((ciz) p4).d)) && ((cmq.a(this.e, ((ciz) p4).e)) && ((cmq.a(this.f, ((ciz) p4).f)) && (cmq.a(this.g, ((ciz) p4).g)))))))))) {
	                if (this.k != null) {
	                    if (!this.k.equals(((ciz) p4).k)) {
	                        return v0;
	                    }
	                } else {
	                    if (((ciz) p4).k != null) {
	                        return v0;
	                    }
	                }
	                if (this.l != null) {
	                    if (!this.l.equals(((ciz) p4).l)) {
	                        return v0;
	                    }
	                } else {
	                    if (((ciz) p4).l != null) {
	                        return v0;
	                    }
	                }
	                if (this.o != null) {
	                    if (!this.o.equals(((ciz) p4).o)) {
	                        return v0;
	                    }
	                } else {
	                    if (((ciz) p4).o != null) {
	                        return v0;
	                    }
	                }
	                if (this.h != null) {
	                    if (!this.h.equals(((ciz) p4).h)) {
	                        return v0;
	                    }
	                } else {
	                    if (((ciz) p4).h != null) {
	                        return v0;
	                    }
	                }
	                if (this.p != null) {
	                    if (!this.p.equals(((ciz) p4).p)) {
	                        return v0;
	                    }
	                } else {
	                    if (((ciz) p4).p != null) {
	                        return v0;
	                    }
	                }
	                if ((Float.floatToIntBits(this.q) == Float.floatToIntBits(((ciz) p4).q)) && ((this.r == ((ciz) p4).r) && ((cmq.a(this.s, ((ciz) p4).s)) && (this.i == ((ciz) p4).i)))) {
	                    v0 = this.a(((ciz) p4));
	                }
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_19;
	        int v1_0 = 0;
	        ciu v2_14 = ((((((((((((((((cmq.a(this.j) + 527) * 31) + cmq.a(this.a)) * 31) + cmq.a(this.b)) * 31) + cmq.a(this.c)) * 31) + cmq.a(this.d)) * 31) + cmq.a(this.e)) * 31) + cmq.a(this.f)) * 31) + cmq.a(this.g)) * 31);
	        if (this.k != null) {
	            v0_19 = this.k.hashCode();
	        } else {
	            v0_19 = 0;
	        }
	        int v0_23;
	        ciu v2_15 = ((v0_19 + v2_14) * 31);
	        if (this.l != null) {
	            v0_23 = this.l.hashCode();
	        } else {
	            v0_23 = 0;
	        }
	        int v0_27;
	        ciu v2_16 = ((v0_23 + v2_15) * 31);
	        if (this.o != null) {
	            v0_27 = this.o.hashCode();
	        } else {
	            v0_27 = 0;
	        }
	        int v0_31;
	        ciu v2_17 = ((v0_27 + v2_16) * 31);
	        if (this.h != null) {
	            v0_31 = this.h.hashCode();
	        } else {
	            v0_31 = 0;
	        }
	        int v0_33 = ((v0_31 + v2_17) * 31);
	        if (this.p != null) {
	            v1_0 = this.p.hashCode();
	        }
	        int v0_38;
	        int v1_4 = ((((v0_33 + v1_0) * 31) + Float.floatToIntBits(this.q)) * 31);
	        if (!this.r) {
	            v0_38 = 1237;
	        } else {
	            v0_38 = 1231;
	        }
	        return (((((((v0_38 + v1_4) * 31) + cmq.a(this.s)) * 31) + this.i) * 31) + this.c());
	    }
	
