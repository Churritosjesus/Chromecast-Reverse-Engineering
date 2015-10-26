	private Ljava.lang.String a
	private Ljava.lang.String b
	private I c
	
	    public cmv()
	    {
	        this.a = cmu.b;
	        this.b = cmu.b;
	        this.c = cmu.a;
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
	            int v2_5 = 0;
	            int v3_1 = 0;
	            int v4_1 = 0;
	            while (v2_5 < this.b.length) {
	                int v5_5 = this.b[v2_5];
	                if (v5_5 != 0) {
	                    v4_1++;
	                    v3_1 += cmk.a(v5_5);
	                }
	                v2_5++;
	            }
	            v0_3 = ((v0_3 + v3_1) + (v4_1 * 1));
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            int v2_10 = 0;
	            while (v1_0 < this.c.length) {
	                v2_10 += cmk.a(this.c[v1_0]);
	                v1_0++;
	            }
	            v0_3 = ((v0_3 + v2_10) + (this.c.length * 1));
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
	                case 10:
	                    int[] v0_16;
	                    int v2_10 = cmu.a(p6, 10);
	                    if (this.a != null) {
	                        v0_16 = this.a.length;
	                    } else {
	                        v0_16 = 0;
	                    }
	                    int v2_12 = new String[(v2_10 + v0_16)];
	                    if (v0_16 != null) {
	                        System.arraycopy(this.a, 0, v2_12, 0, v0_16);
	                    }
	                    while (v0_16 < (v2_12.length - 1)) {
	                        v2_12[v0_16] = p6.c();
	                        p6.a();
	                        v0_16++;
	                    }
	                    v2_12[v0_16] = p6.c();
	                    this.a = v2_12;
	                    break;
	                case 18:
	                    int[] v0_12;
	                    int v2_7 = cmu.a(p6, 18);
	                    if (this.b != null) {
	                        v0_12 = this.b.length;
	                    } else {
	                        v0_12 = 0;
	                    }
	                    int v2_9 = new String[(v2_7 + v0_12)];
	                    if (v0_12 != null) {
	                        System.arraycopy(this.b, 0, v2_9, 0, v0_12);
	                    }
	                    while (v0_12 < (v2_9.length - 1)) {
	                        v2_9[v0_12] = p6.c();
	                        p6.a();
	                        v0_12++;
	                    }
	                    v2_9[v0_12] = p6.c();
	                    this.b = v2_9;
	                    break;
	                case 24:
	                    int[] v0_8;
	                    int v2_4 = cmu.a(p6, 24);
	                    if (this.c != null) {
	                        v0_8 = this.c.length;
	                    } else {
	                        v0_8 = 0;
	                    }
	                    int v2_6 = new int[(v2_4 + v0_8)];
	                    if (v0_8 != null) {
	                        System.arraycopy(this.c, 0, v2_6, 0, v0_8);
	                    }
	                    while (v0_8 < (v2_6.length - 1)) {
	                        v2_6[v0_8] = p6.e();
	                        p6.a();
	                        v0_8++;
	                    }
	                    v2_6[v0_8] = p6.e();
	                    this.c = v2_6;
	                    break;
	                case 26:
	                    int v3_0 = p6.c(p6.e());
	                    int v2_0 = p6.i();
	                    int[] v0_2 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_2++;
	                    }
	                    int v2_3;
	                    p6.e(v2_0);
	                    if (this.c != null) {
	                        v2_3 = this.c.length;
	                    } else {
	                        v2_3 = 0;
	                    }
	                    int[] v0_4 = new int[(v0_2 + v2_3)];
	                    if (v2_3 != 0) {
	                        System.arraycopy(this.c, 0, v0_4, 0, v2_3);
	                    }
	                    while (v2_3 < v0_4.length) {
	                        v0_4[v2_3] = p6.e();
	                        v2_3++;
	                    }
	                    this.c = v0_4;
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
	                int v2_9 = this.a[v0_3];
	                if (v2_9 != 0) {
	                    p5.a(1, v2_9);
	                }
	                v0_3++;
	            }
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v0_7 = 0;
	            while (v0_7 < this.b.length) {
	                int v2_7 = this.b[v0_7];
	                if (v2_7 != 0) {
	                    p5.a(2, v2_7);
	                }
	                v0_7++;
	            }
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            while (v1 < this.c.length) {
	                p5.a(3, this.c[v1]);
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
	            if (((p4 instanceof cmv)) && ((cmq.a(this.a, ((cmv) p4).a)) && ((cmq.a(this.b, ((cmv) p4).b)) && (cmq.a(this.c, ((cmv) p4).c))))) {
	                v0 = this.a(((cmv) p4));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        return (((((((cmq.a(this.a) + 527) * 31) + cmq.a(this.b)) * 31) + cmq.a(this.c)) * 31) + this.c());
	    }
	
