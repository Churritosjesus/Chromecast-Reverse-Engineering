	private static bridge Lcja k
	public I a
	public I b
	public I c
	public I d
	public I e
	public I f
	public I g
	public I h
	public I i
	public I j
	
	    public cja()
	    {
	        this.a = cmu.a;
	        this.b = cmu.a;
	        this.c = cmu.a;
	        this.d = cmu.a;
	        this.e = cmu.a;
	        this.f = cmu.a;
	        this.g = cmu.a;
	        this.h = cmu.a;
	        this.i = cmu.a;
	        this.j = cmu.a;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    public static cja[] b()
	    {
	        if (cja.k == null) {
	            if (cja.k == null) {
	                cja[] v0_3 = new cja[0];
	                cja.k = v0_3;
	            }
	        }
	        return cja.k;
	    }
	
	
	    protected final int a()
	    {
	        int v0_3;
	        int v1_0 = 0;
	        int v3_0 = super.a();
	        if ((this.a == null) || (this.a.length <= 0)) {
	            v0_3 = v3_0;
	        } else {
	            int v0_4 = 0;
	            int v2_0 = 0;
	            while (v0_4 < this.a.length) {
	                v2_0 += cmk.a(this.a[v0_4]);
	                v0_4++;
	            }
	            v0_3 = ((v3_0 + v2_0) + (this.a.length * 1));
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v2_7 = 0;
	            int v3_1 = 0;
	            while (v2_7 < this.b.length) {
	                v3_1 += cmk.a(this.b[v2_7]);
	                v2_7++;
	            }
	            v0_3 = ((v0_3 + v3_1) + (this.b.length * 1));
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            int v2_14 = 0;
	            int v3_2 = 0;
	            while (v2_14 < this.c.length) {
	                v3_2 += cmk.a(this.c[v2_14]);
	                v2_14++;
	            }
	            v0_3 = ((v0_3 + v3_2) + (this.c.length * 1));
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            int v2_21 = 0;
	            int v3_3 = 0;
	            while (v2_21 < this.d.length) {
	                v3_3 += cmk.a(this.d[v2_21]);
	                v2_21++;
	            }
	            v0_3 = ((v0_3 + v3_3) + (this.d.length * 1));
	        }
	        if ((this.e != null) && (this.e.length > 0)) {
	            int v2_28 = 0;
	            int v3_4 = 0;
	            while (v2_28 < this.e.length) {
	                v3_4 += cmk.a(this.e[v2_28]);
	                v2_28++;
	            }
	            v0_3 = ((v0_3 + v3_4) + (this.e.length * 1));
	        }
	        if ((this.f != null) && (this.f.length > 0)) {
	            int v2_35 = 0;
	            int v3_5 = 0;
	            while (v2_35 < this.f.length) {
	                v3_5 += cmk.a(this.f[v2_35]);
	                v2_35++;
	            }
	            v0_3 = ((v0_3 + v3_5) + (this.f.length * 1));
	        }
	        if ((this.g != null) && (this.g.length > 0)) {
	            int v2_42 = 0;
	            int v3_6 = 0;
	            while (v2_42 < this.g.length) {
	                v3_6 += cmk.a(this.g[v2_42]);
	                v2_42++;
	            }
	            v0_3 = ((v0_3 + v3_6) + (this.g.length * 1));
	        }
	        if ((this.h != null) && (this.h.length > 0)) {
	            int v2_49 = 0;
	            int v3_7 = 0;
	            while (v2_49 < this.h.length) {
	                v3_7 += cmk.a(this.h[v2_49]);
	                v2_49++;
	            }
	            v0_3 = ((v0_3 + v3_7) + (this.h.length * 1));
	        }
	        if ((this.i != null) && (this.i.length > 0)) {
	            int v2_56 = 0;
	            int v3_8 = 0;
	            while (v2_56 < this.i.length) {
	                v3_8 += cmk.a(this.i[v2_56]);
	                v2_56++;
	            }
	            v0_3 = ((v0_3 + v3_8) + (this.i.length * 1));
	        }
	        if ((this.j != null) && (this.j.length > 0)) {
	            int v2_63 = 0;
	            while (v1_0 < this.j.length) {
	                v2_63 += cmk.a(this.j[v1_0]);
	                v1_0++;
	            }
	            v0_3 = ((v0_3 + v2_63) + (this.j.length * 1));
	        }
	        return v0_3;
	    }
	
	
	    public final synthetic cms a(cmj p6)
	    {
	        while(true) {
	            int[] v0_0 = p6.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    int[] v0_80;
	                    int v2_67 = cmu.a(p6, 8);
	                    if (this.a != null) {
	                        v0_80 = this.a.length;
	                    } else {
	                        v0_80 = 0;
	                    }
	                    int v2_69 = new int[(v2_67 + v0_80)];
	                    if (v0_80 != null) {
	                        System.arraycopy(this.a, 0, v2_69, 0, v0_80);
	                    }
	                    while (v0_80 < (v2_69.length - 1)) {
	                        v2_69[v0_80] = p6.e();
	                        p6.a();
	                        v0_80++;
	                    }
	                    v2_69[v0_80] = p6.e();
	                    this.a = v2_69;
	                    break;
	                case 10:
	                    int v3_54 = p6.c(p6.e());
	                    int v2_63 = p6.i();
	                    int[] v0_74 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_74++;
	                    }
	                    int v2_66;
	                    p6.e(v2_63);
	                    if (this.a != null) {
	                        v2_66 = this.a.length;
	                    } else {
	                        v2_66 = 0;
	                    }
	                    int[] v0_76 = new int[(v0_74 + v2_66)];
	                    if (v2_66 != 0) {
	                        System.arraycopy(this.a, 0, v0_76, 0, v2_66);
	                    }
	                    while (v2_66 < v0_76.length) {
	                        v0_76[v2_66] = p6.e();
	                        v2_66++;
	                    }
	                    this.a = v0_76;
	                    p6.d(v3_54);
	                    break;
	                case 16:
	                    int[] v0_72;
	                    int v2_60 = cmu.a(p6, 16);
	                    if (this.b != null) {
	                        v0_72 = this.b.length;
	                    } else {
	                        v0_72 = 0;
	                    }
	                    int v2_62 = new int[(v2_60 + v0_72)];
	                    if (v0_72 != null) {
	                        System.arraycopy(this.b, 0, v2_62, 0, v0_72);
	                    }
	                    while (v0_72 < (v2_62.length - 1)) {
	                        v2_62[v0_72] = p6.e();
	                        p6.a();
	                        v0_72++;
	                    }
	                    v2_62[v0_72] = p6.e();
	                    this.b = v2_62;
	                    break;
	                case 18:
	                    int v3_48 = p6.c(p6.e());
	                    int v2_56 = p6.i();
	                    int[] v0_66 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_66++;
	                    }
	                    int v2_59;
	                    p6.e(v2_56);
	                    if (this.b != null) {
	                        v2_59 = this.b.length;
	                    } else {
	                        v2_59 = 0;
	                    }
	                    int[] v0_68 = new int[(v0_66 + v2_59)];
	                    if (v2_59 != 0) {
	                        System.arraycopy(this.b, 0, v0_68, 0, v2_59);
	                    }
	                    while (v2_59 < v0_68.length) {
	                        v0_68[v2_59] = p6.e();
	                        v2_59++;
	                    }
	                    this.b = v0_68;
	                    p6.d(v3_48);
	                    break;
	                case 24:
	                    int[] v0_64;
	                    int v2_53 = cmu.a(p6, 24);
	                    if (this.c != null) {
	                        v0_64 = this.c.length;
	                    } else {
	                        v0_64 = 0;
	                    }
	                    int v2_55 = new int[(v2_53 + v0_64)];
	                    if (v0_64 != null) {
	                        System.arraycopy(this.c, 0, v2_55, 0, v0_64);
	                    }
	                    while (v0_64 < (v2_55.length - 1)) {
	                        v2_55[v0_64] = p6.e();
	                        p6.a();
	                        v0_64++;
	                    }
	                    v2_55[v0_64] = p6.e();
	                    this.c = v2_55;
	                    break;
	                case 26:
	                    int v3_42 = p6.c(p6.e());
	                    int v2_49 = p6.i();
	                    int[] v0_58 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_58++;
	                    }
	                    int v2_52;
	                    p6.e(v2_49);
	                    if (this.c != null) {
	                        v2_52 = this.c.length;
	                    } else {
	                        v2_52 = 0;
	                    }
	                    int[] v0_60 = new int[(v0_58 + v2_52)];
	                    if (v2_52 != 0) {
	                        System.arraycopy(this.c, 0, v0_60, 0, v2_52);
	                    }
	                    while (v2_52 < v0_60.length) {
	                        v0_60[v2_52] = p6.e();
	                        v2_52++;
	                    }
	                    this.c = v0_60;
	                    p6.d(v3_42);
	                    break;
	                case 32:
	                    int[] v0_56;
	                    int v2_46 = cmu.a(p6, 32);
	                    if (this.d != null) {
	                        v0_56 = this.d.length;
	                    } else {
	                        v0_56 = 0;
	                    }
	                    int v2_48 = new int[(v2_46 + v0_56)];
	                    if (v0_56 != null) {
	                        System.arraycopy(this.d, 0, v2_48, 0, v0_56);
	                    }
	                    while (v0_56 < (v2_48.length - 1)) {
	                        v2_48[v0_56] = p6.e();
	                        p6.a();
	                        v0_56++;
	                    }
	                    v2_48[v0_56] = p6.e();
	                    this.d = v2_48;
	                    break;
	                case 34:
	                    int v3_36 = p6.c(p6.e());
	                    int v2_42 = p6.i();
	                    int[] v0_50 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_50++;
	                    }
	                    int v2_45;
	                    p6.e(v2_42);
	                    if (this.d != null) {
	                        v2_45 = this.d.length;
	                    } else {
	                        v2_45 = 0;
	                    }
	                    int[] v0_52 = new int[(v0_50 + v2_45)];
	                    if (v2_45 != 0) {
	                        System.arraycopy(this.d, 0, v0_52, 0, v2_45);
	                    }
	                    while (v2_45 < v0_52.length) {
	                        v0_52[v2_45] = p6.e();
	                        v2_45++;
	                    }
	                    this.d = v0_52;
	                    p6.d(v3_36);
	                    break;
	                case 40:
	                    int[] v0_48;
	                    int v2_39 = cmu.a(p6, 40);
	                    if (this.e != null) {
	                        v0_48 = this.e.length;
	                    } else {
	                        v0_48 = 0;
	                    }
	                    int v2_41 = new int[(v2_39 + v0_48)];
	                    if (v0_48 != null) {
	                        System.arraycopy(this.e, 0, v2_41, 0, v0_48);
	                    }
	                    while (v0_48 < (v2_41.length - 1)) {
	                        v2_41[v0_48] = p6.e();
	                        p6.a();
	                        v0_48++;
	                    }
	                    v2_41[v0_48] = p6.e();
	                    this.e = v2_41;
	                    break;
	                case 42:
	                    int v3_30 = p6.c(p6.e());
	                    int v2_35 = p6.i();
	                    int[] v0_42 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_42++;
	                    }
	                    int v2_38;
	                    p6.e(v2_35);
	                    if (this.e != null) {
	                        v2_38 = this.e.length;
	                    } else {
	                        v2_38 = 0;
	                    }
	                    int[] v0_44 = new int[(v0_42 + v2_38)];
	                    if (v2_38 != 0) {
	                        System.arraycopy(this.e, 0, v0_44, 0, v2_38);
	                    }
	                    while (v2_38 < v0_44.length) {
	                        v0_44[v2_38] = p6.e();
	                        v2_38++;
	                    }
	                    this.e = v0_44;
	                    p6.d(v3_30);
	                    break;
	                case 48:
	                    int[] v0_40;
	                    int v2_32 = cmu.a(p6, 48);
	                    if (this.f != null) {
	                        v0_40 = this.f.length;
	                    } else {
	                        v0_40 = 0;
	                    }
	                    int v2_34 = new int[(v2_32 + v0_40)];
	                    if (v0_40 != null) {
	                        System.arraycopy(this.f, 0, v2_34, 0, v0_40);
	                    }
	                    while (v0_40 < (v2_34.length - 1)) {
	                        v2_34[v0_40] = p6.e();
	                        p6.a();
	                        v0_40++;
	                    }
	                    v2_34[v0_40] = p6.e();
	                    this.f = v2_34;
	                    break;
	                case 50:
	                    int v3_24 = p6.c(p6.e());
	                    int v2_28 = p6.i();
	                    int[] v0_34 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_34++;
	                    }
	                    int v2_31;
	                    p6.e(v2_28);
	                    if (this.f != null) {
	                        v2_31 = this.f.length;
	                    } else {
	                        v2_31 = 0;
	                    }
	                    int[] v0_36 = new int[(v0_34 + v2_31)];
	                    if (v2_31 != 0) {
	                        System.arraycopy(this.f, 0, v0_36, 0, v2_31);
	                    }
	                    while (v2_31 < v0_36.length) {
	                        v0_36[v2_31] = p6.e();
	                        v2_31++;
	                    }
	                    this.f = v0_36;
	                    p6.d(v3_24);
	                    break;
	                case 56:
	                    int[] v0_32;
	                    int v2_25 = cmu.a(p6, 56);
	                    if (this.g != null) {
	                        v0_32 = this.g.length;
	                    } else {
	                        v0_32 = 0;
	                    }
	                    int v2_27 = new int[(v2_25 + v0_32)];
	                    if (v0_32 != null) {
	                        System.arraycopy(this.g, 0, v2_27, 0, v0_32);
	                    }
	                    while (v0_32 < (v2_27.length - 1)) {
	                        v2_27[v0_32] = p6.e();
	                        p6.a();
	                        v0_32++;
	                    }
	                    v2_27[v0_32] = p6.e();
	                    this.g = v2_27;
	                    break;
	                case 58:
	                    int v3_18 = p6.c(p6.e());
	                    int v2_21 = p6.i();
	                    int[] v0_26 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_26++;
	                    }
	                    int v2_24;
	                    p6.e(v2_21);
	                    if (this.g != null) {
	                        v2_24 = this.g.length;
	                    } else {
	                        v2_24 = 0;
	                    }
	                    int[] v0_28 = new int[(v0_26 + v2_24)];
	                    if (v2_24 != 0) {
	                        System.arraycopy(this.g, 0, v0_28, 0, v2_24);
	                    }
	                    while (v2_24 < v0_28.length) {
	                        v0_28[v2_24] = p6.e();
	                        v2_24++;
	                    }
	                    this.g = v0_28;
	                    p6.d(v3_18);
	                    break;
	                case 64:
	                    int[] v0_24;
	                    int v2_18 = cmu.a(p6, 64);
	                    if (this.h != null) {
	                        v0_24 = this.h.length;
	                    } else {
	                        v0_24 = 0;
	                    }
	                    int v2_20 = new int[(v2_18 + v0_24)];
	                    if (v0_24 != null) {
	                        System.arraycopy(this.h, 0, v2_20, 0, v0_24);
	                    }
	                    while (v0_24 < (v2_20.length - 1)) {
	                        v2_20[v0_24] = p6.e();
	                        p6.a();
	                        v0_24++;
	                    }
	                    v2_20[v0_24] = p6.e();
	                    this.h = v2_20;
	                    break;
	                case 66:
	                    int v3_12 = p6.c(p6.e());
	                    int v2_14 = p6.i();
	                    int[] v0_18 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_18++;
	                    }
	                    int v2_17;
	                    p6.e(v2_14);
	                    if (this.h != null) {
	                        v2_17 = this.h.length;
	                    } else {
	                        v2_17 = 0;
	                    }
	                    int[] v0_20 = new int[(v0_18 + v2_17)];
	                    if (v2_17 != 0) {
	                        System.arraycopy(this.h, 0, v0_20, 0, v2_17);
	                    }
	                    while (v2_17 < v0_20.length) {
	                        v0_20[v2_17] = p6.e();
	                        v2_17++;
	                    }
	                    this.h = v0_20;
	                    p6.d(v3_12);
	                    break;
	                case 72:
	                    int[] v0_16;
	                    int v2_11 = cmu.a(p6, 72);
	                    if (this.i != null) {
	                        v0_16 = this.i.length;
	                    } else {
	                        v0_16 = 0;
	                    }
	                    int v2_13 = new int[(v2_11 + v0_16)];
	                    if (v0_16 != null) {
	                        System.arraycopy(this.i, 0, v2_13, 0, v0_16);
	                    }
	                    while (v0_16 < (v2_13.length - 1)) {
	                        v2_13[v0_16] = p6.e();
	                        p6.a();
	                        v0_16++;
	                    }
	                    v2_13[v0_16] = p6.e();
	                    this.i = v2_13;
	                    break;
	                case 74:
	                    int v3_6 = p6.c(p6.e());
	                    int v2_7 = p6.i();
	                    int[] v0_10 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_10++;
	                    }
	                    int v2_10;
	                    p6.e(v2_7);
	                    if (this.i != null) {
	                        v2_10 = this.i.length;
	                    } else {
	                        v2_10 = 0;
	                    }
	                    int[] v0_12 = new int[(v0_10 + v2_10)];
	                    if (v2_10 != 0) {
	                        System.arraycopy(this.i, 0, v0_12, 0, v2_10);
	                    }
	                    while (v2_10 < v0_12.length) {
	                        v0_12[v2_10] = p6.e();
	                        v2_10++;
	                    }
	                    this.i = v0_12;
	                    p6.d(v3_6);
	                    break;
	                case 80:
	                    int[] v0_8;
	                    int v2_4 = cmu.a(p6, 80);
	                    if (this.j != null) {
	                        v0_8 = this.j.length;
	                    } else {
	                        v0_8 = 0;
	                    }
	                    int v2_6 = new int[(v2_4 + v0_8)];
	                    if (v0_8 != null) {
	                        System.arraycopy(this.j, 0, v2_6, 0, v0_8);
	                    }
	                    while (v0_8 < (v2_6.length - 1)) {
	                        v2_6[v0_8] = p6.e();
	                        p6.a();
	                        v0_8++;
	                    }
	                    v2_6[v0_8] = p6.e();
	                    this.j = v2_6;
	                    break;
	                case 82:
	                    int v3_0 = p6.c(p6.e());
	                    int v2_0 = p6.i();
	                    int[] v0_2 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_2++;
	                    }
	                    int v2_3;
	                    p6.e(v2_0);
	                    if (this.j != null) {
	                        v2_3 = this.j.length;
	                    } else {
	                        v2_3 = 0;
	                    }
	                    int[] v0_4 = new int[(v0_2 + v2_3)];
	                    if (v2_3 != 0) {
	                        System.arraycopy(this.j, 0, v0_4, 0, v2_3);
	                    }
	                    while (v2_3 < v0_4.length) {
	                        v0_4[v2_3] = p6.e();
	                        v2_3++;
	                    }
	                    this.j = v0_4;
	                    p6.d(v3_0);
	                    break;
	                default:
	                    if (this.a(p6, v0_0)) {
	                    } else {
	                    }
	            }
	            return this;
	        }
	    }
	
	
	    public final void a(cmk p5)
	    {
	        int v1 = 0;
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_3 = 0;
	            while (v0_3 < this.a.length) {
	                p5.a(1, this.a[v0_3]);
	                v0_3++;
	            }
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v0_7 = 0;
	            while (v0_7 < this.b.length) {
	                p5.a(2, this.b[v0_7]);
	                v0_7++;
	            }
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            int v0_11 = 0;
	            while (v0_11 < this.c.length) {
	                p5.a(3, this.c[v0_11]);
	                v0_11++;
	            }
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            int v0_15 = 0;
	            while (v0_15 < this.d.length) {
	                p5.a(4, this.d[v0_15]);
	                v0_15++;
	            }
	        }
	        if ((this.e != null) && (this.e.length > 0)) {
	            int v0_19 = 0;
	            while (v0_19 < this.e.length) {
	                p5.a(5, this.e[v0_19]);
	                v0_19++;
	            }
	        }
	        if ((this.f != null) && (this.f.length > 0)) {
	            int v0_23 = 0;
	            while (v0_23 < this.f.length) {
	                p5.a(6, this.f[v0_23]);
	                v0_23++;
	            }
	        }
	        if ((this.g != null) && (this.g.length > 0)) {
	            int v0_27 = 0;
	            while (v0_27 < this.g.length) {
	                p5.a(7, this.g[v0_27]);
	                v0_27++;
	            }
	        }
	        if ((this.h != null) && (this.h.length > 0)) {
	            int v0_31 = 0;
	            while (v0_31 < this.h.length) {
	                p5.a(8, this.h[v0_31]);
	                v0_31++;
	            }
	        }
	        if ((this.i != null) && (this.i.length > 0)) {
	            int v0_35 = 0;
	            while (v0_35 < this.i.length) {
	                p5.a(9, this.i[v0_35]);
	                v0_35++;
	            }
	        }
	        if ((this.j != null) && (this.j.length > 0)) {
	            while (v1 < this.j.length) {
	                p5.a(10, this.j[v1]);
	                v1++;
	            }
	        }
	        super.a(p5);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if (((p4 instanceof cja)) && ((cmq.a(this.a, ((cja) p4).a)) && ((cmq.a(this.b, ((cja) p4).b)) && ((cmq.a(this.c, ((cja) p4).c)) && ((cmq.a(this.d, ((cja) p4).d)) && ((cmq.a(this.e, ((cja) p4).e)) && ((cmq.a(this.f, ((cja) p4).f)) && ((cmq.a(this.g, ((cja) p4).g)) && ((cmq.a(this.h, ((cja) p4).h)) && ((cmq.a(this.i, ((cja) p4).i)) && (cmq.a(this.j, ((cja) p4).j)))))))))))) {
	                v0 = this.a(((cja) p4));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        return (((((((((((((((((((((cmq.a(this.a) + 527) * 31) + cmq.a(this.b)) * 31) + cmq.a(this.c)) * 31) + cmq.a(this.d)) * 31) + cmq.a(this.e)) * 31) + cmq.a(this.f)) * 31) + cmq.a(this.g)) * 31) + cmq.a(this.h)) * 31) + cmq.a(this.i)) * 31) + cmq.a(this.j)) * 31) + this.c());
	    }
	
