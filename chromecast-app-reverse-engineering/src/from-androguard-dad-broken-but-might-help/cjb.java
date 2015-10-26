	public static final cmn a
	public I b
	public I c
	public I d
	public I e
	public  f
	private  g
	private  h
	
	    static cjb()
	    {
	        cjb.a = new cmn(11, cjb, 810, 0);
	        return;
	    }
	
	
	    public cjb()
	    {
	        this.b = cmu.a;
	        this.c = cmu.a;
	        this.d = cmu.a;
	        this.g = 0;
	        this.e = cmu.a;
	        this.f = 0;
	        this.h = 0;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0_3;
	        int v1_0 = 0;
	        int v3_0 = super.a();
	        if ((this.b == null) || (this.b.length <= 0)) {
	            v0_3 = v3_0;
	        } else {
	            int v0_4 = 0;
	            int v2_0 = 0;
	            while (v0_4 < this.b.length) {
	                v2_0 += cmk.a(this.b[v0_4]);
	                v0_4++;
	            }
	            v0_3 = ((v3_0 + v2_0) + (this.b.length * 1));
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            int v2_7 = 0;
	            int v3_1 = 0;
	            while (v2_7 < this.c.length) {
	                v3_1 += cmk.a(this.c[v2_7]);
	                v2_7++;
	            }
	            v0_3 = ((v0_3 + v3_1) + (this.c.length * 1));
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            int v2_14 = 0;
	            int v3_2 = 0;
	            while (v2_14 < this.d.length) {
	                v3_2 += cmk.a(this.d[v2_14]);
	                v2_14++;
	            }
	            v0_3 = ((v0_3 + v3_2) + (this.d.length * 1));
	        }
	        if (this.g != 0) {
	            v0_3 += cmk.b(4, this.g);
	        }
	        if ((this.e != null) && (this.e.length > 0)) {
	            int v2_24 = 0;
	            while (v1_0 < this.e.length) {
	                v2_24 += cmk.a(this.e[v1_0]);
	                v1_0++;
	            }
	            v0_3 = ((v0_3 + v2_24) + (this.e.length * 1));
	        }
	        if (this.f != 0) {
	            v0_3 += cmk.b(6, this.f);
	        }
	        if (this.h != 0) {
	            v0_3 += cmk.b(7, this.h);
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
	                    int[] v0_35;
	                    int v2_25 = cmu.a(p6, 8);
	                    if (this.b != null) {
	                        v0_35 = this.b.length;
	                    } else {
	                        v0_35 = 0;
	                    }
	                    int v2_27 = new int[(v2_25 + v0_35)];
	                    if (v0_35 != null) {
	                        System.arraycopy(this.b, 0, v2_27, 0, v0_35);
	                    }
	                    while (v0_35 < (v2_27.length - 1)) {
	                        v2_27[v0_35] = p6.e();
	                        p6.a();
	                        v0_35++;
	                    }
	                    v2_27[v0_35] = p6.e();
	                    this.b = v2_27;
	                    break;
	                case 10:
	                    int v3_18 = p6.c(p6.e());
	                    int v2_21 = p6.i();
	                    int[] v0_29 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_29++;
	                    }
	                    int v2_24;
	                    p6.e(v2_21);
	                    if (this.b != null) {
	                        v2_24 = this.b.length;
	                    } else {
	                        v2_24 = 0;
	                    }
	                    int[] v0_31 = new int[(v0_29 + v2_24)];
	                    if (v2_24 != 0) {
	                        System.arraycopy(this.b, 0, v0_31, 0, v2_24);
	                    }
	                    while (v2_24 < v0_31.length) {
	                        v0_31[v2_24] = p6.e();
	                        v2_24++;
	                    }
	                    this.b = v0_31;
	                    p6.d(v3_18);
	                    break;
	                case 16:
	                    int[] v0_27;
	                    int v2_18 = cmu.a(p6, 16);
	                    if (this.c != null) {
	                        v0_27 = this.c.length;
	                    } else {
	                        v0_27 = 0;
	                    }
	                    int v2_20 = new int[(v2_18 + v0_27)];
	                    if (v0_27 != null) {
	                        System.arraycopy(this.c, 0, v2_20, 0, v0_27);
	                    }
	                    while (v0_27 < (v2_20.length - 1)) {
	                        v2_20[v0_27] = p6.e();
	                        p6.a();
	                        v0_27++;
	                    }
	                    v2_20[v0_27] = p6.e();
	                    this.c = v2_20;
	                    break;
	                case 18:
	                    int v3_12 = p6.c(p6.e());
	                    int v2_14 = p6.i();
	                    int[] v0_21 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_21++;
	                    }
	                    int v2_17;
	                    p6.e(v2_14);
	                    if (this.c != null) {
	                        v2_17 = this.c.length;
	                    } else {
	                        v2_17 = 0;
	                    }
	                    int[] v0_23 = new int[(v0_21 + v2_17)];
	                    if (v2_17 != 0) {
	                        System.arraycopy(this.c, 0, v0_23, 0, v2_17);
	                    }
	                    while (v2_17 < v0_23.length) {
	                        v0_23[v2_17] = p6.e();
	                        v2_17++;
	                    }
	                    this.c = v0_23;
	                    p6.d(v3_12);
	                    break;
	                case 24:
	                    int[] v0_19;
	                    int v2_11 = cmu.a(p6, 24);
	                    if (this.d != null) {
	                        v0_19 = this.d.length;
	                    } else {
	                        v0_19 = 0;
	                    }
	                    int v2_13 = new int[(v2_11 + v0_19)];
	                    if (v0_19 != null) {
	                        System.arraycopy(this.d, 0, v2_13, 0, v0_19);
	                    }
	                    while (v0_19 < (v2_13.length - 1)) {
	                        v2_13[v0_19] = p6.e();
	                        p6.a();
	                        v0_19++;
	                    }
	                    v2_13[v0_19] = p6.e();
	                    this.d = v2_13;
	                    break;
	                case 26:
	                    int v3_6 = p6.c(p6.e());
	                    int v2_7 = p6.i();
	                    int[] v0_13 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_13++;
	                    }
	                    int v2_10;
	                    p6.e(v2_7);
	                    if (this.d != null) {
	                        v2_10 = this.d.length;
	                    } else {
	                        v2_10 = 0;
	                    }
	                    int[] v0_15 = new int[(v0_13 + v2_10)];
	                    if (v2_10 != 0) {
	                        System.arraycopy(this.d, 0, v0_15, 0, v2_10);
	                    }
	                    while (v2_10 < v0_15.length) {
	                        v0_15[v2_10] = p6.e();
	                        v2_10++;
	                    }
	                    this.d = v0_15;
	                    p6.d(v3_6);
	                    break;
	                case 32:
	                    this.g = p6.e();
	                    break;
	                case 40:
	                    int[] v0_10;
	                    int v2_4 = cmu.a(p6, 40);
	                    if (this.e != null) {
	                        v0_10 = this.e.length;
	                    } else {
	                        v0_10 = 0;
	                    }
	                    int v2_6 = new int[(v2_4 + v0_10)];
	                    if (v0_10 != null) {
	                        System.arraycopy(this.e, 0, v2_6, 0, v0_10);
	                    }
	                    while (v0_10 < (v2_6.length - 1)) {
	                        v2_6[v0_10] = p6.e();
	                        p6.a();
	                        v0_10++;
	                    }
	                    v2_6[v0_10] = p6.e();
	                    this.e = v2_6;
	                    break;
	                case 42:
	                    int v3_0 = p6.c(p6.e());
	                    int v2_0 = p6.i();
	                    int[] v0_4 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_4++;
	                    }
	                    int v2_3;
	                    p6.e(v2_0);
	                    if (this.e != null) {
	                        v2_3 = this.e.length;
	                    } else {
	                        v2_3 = 0;
	                    }
	                    int[] v0_6 = new int[(v0_4 + v2_3)];
	                    if (v2_3 != 0) {
	                        System.arraycopy(this.e, 0, v0_6, 0, v2_3);
	                    }
	                    while (v2_3 < v0_6.length) {
	                        v0_6[v2_3] = p6.e();
	                        v2_3++;
	                    }
	                    this.e = v0_6;
	                    p6.d(v3_0);
	                    break;
	                case 48:
	                    this.f = p6.e();
	                    break;
	                case 56:
	                    this.h = p6.e();
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
	        int v1_0 = 0;
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v0_3 = 0;
	            while (v0_3 < this.b.length) {
	                p5.a(1, this.b[v0_3]);
	                v0_3++;
	            }
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            int v0_7 = 0;
	            while (v0_7 < this.c.length) {
	                p5.a(2, this.c[v0_7]);
	                v0_7++;
	            }
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            int v0_11 = 0;
	            while (v0_11 < this.d.length) {
	                p5.a(3, this.d[v0_11]);
	                v0_11++;
	            }
	        }
	        if (this.g != 0) {
	            p5.a(4, this.g);
	        }
	        if ((this.e != null) && (this.e.length > 0)) {
	            while (v1_0 < this.e.length) {
	                p5.a(5, this.e[v1_0]);
	                v1_0++;
	            }
	        }
	        if (this.f != 0) {
	            p5.a(6, this.f);
	        }
	        if (this.h != 0) {
	            p5.a(7, this.h);
	        }
	        super.a(p5);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if (((p4 instanceof cjb)) && ((cmq.a(this.b, ((cjb) p4).b)) && ((cmq.a(this.c, ((cjb) p4).c)) && ((cmq.a(this.d, ((cjb) p4).d)) && ((this.g == ((cjb) p4).g) && ((cmq.a(this.e, ((cjb) p4).e)) && ((this.f == ((cjb) p4).f) && (this.h == ((cjb) p4).h)))))))) {
	                v0 = this.a(((cjb) p4));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        return (((((((((((((((cmq.a(this.b) + 527) * 31) + cmq.a(this.c)) * 31) + cmq.a(this.d)) * 31) + this.g) * 31) + cmq.a(this.e)) * 31) + this.f) * 31) + this.h) * 31) + this.c());
	    }
	
