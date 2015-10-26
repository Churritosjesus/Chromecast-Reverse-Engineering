	private static bridge Ldal m
	public java.lang.Long a
	public  b
	public I c
	public java.lang.Long d
	public  e
	public java.lang.String f
	public java.lang.String g
	public dak h
	public dak i
	public  j
	public java.lang.String k
	public java.lang.Long l
	private I n
	private Ljava.lang.String o
	private  p
	private  q
	private java.lang.String r
	private I s
	private java.lang.String u
	
	    public dal()
	    {
	        this.a = 0;
	        this.b = -2147483648;
	        this.n = dey.a;
	        this.c = dey.a;
	        this.o = dey.b;
	        this.p = -2147483648;
	        this.q = -2147483648;
	        this.d = 0;
	        this.e = -2147483648;
	        this.f = 0;
	        this.g = 0;
	        this.r = 0;
	        this.s = dey.a;
	        this.h = 0;
	        this.i = 0;
	        this.j = -2147483648;
	        this.k = 0;
	        this.u = 0;
	        this.l = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dal[] b()
	    {
	        if (dal.m == null) {
	            if (dal.m == null) {
	                dal[] v0_3 = new dal[0];
	                dal.m = v0_3;
	            }
	        }
	        return dal.m;
	    }
	
	
	    protected final int a()
	    {
	        long v2_0 = 0;
	        int v0_1 = (super.a() + dep.b(1, this.a.longValue()));
	        if (this.b != -2147483648) {
	            v0_1 += dep.b(2, this.b);
	        }
	        if ((this.n != null) && (this.n.length > 0)) {
	            int v1_8 = 0;
	            int v3_2 = 0;
	            while (v1_8 < this.n.length) {
	                v3_2 += dep.a(this.n[v1_8]);
	                v1_8++;
	            }
	            v0_1 = ((v0_1 + v3_2) + (this.n.length * 1));
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            int v1_15 = 0;
	            int v3_3 = 0;
	            while (v1_15 < this.c.length) {
	                v3_3 += dep.a(this.c[v1_15]);
	                v1_15++;
	            }
	            v0_1 = ((v0_1 + v3_3) + (this.c.length * 1));
	        }
	        if ((this.o != null) && (this.o.length > 0)) {
	            int v1_22 = 0;
	            int v3_4 = 0;
	            int v4_5 = 0;
	            while (v1_22 < this.o.length) {
	                int v5_3 = this.o[v1_22];
	                if (v5_3 != 0) {
	                    v4_5++;
	                    v3_4 += dep.a(v5_3);
	                }
	                v1_22++;
	            }
	            v0_1 = ((v0_1 + v3_4) + (v4_5 * 1));
	        }
	        if (this.p != -2147483648) {
	            v0_1 += dep.b(6, this.p);
	        }
	        if (this.q != -2147483648) {
	            v0_1 += dep.b(7, this.q);
	        }
	        if (this.d != null) {
	            v0_1 += dep.b(8, this.d.longValue());
	        }
	        if (this.e != -2147483648) {
	            v0_1 += dep.b(9, this.e);
	        }
	        if (this.f != null) {
	            v0_1 += dep.b(10, this.f);
	        }
	        if (this.g != null) {
	            v0_1 += dep.b(11, this.g);
	        }
	        if (this.r != null) {
	            v0_1 += dep.b(12, this.r);
	        }
	        if ((this.s != null) && (this.s.length > 0)) {
	            int v1_48 = 0;
	            while (v2_0 < this.s.length) {
	                v1_48 += dep.a(this.s[v2_0]);
	                v2_0++;
	            }
	            v0_1 = ((v0_1 + v1_48) + (this.s.length * 1));
	        }
	        if (this.h != null) {
	            v0_1 += dep.b(14, this.h);
	        }
	        if (this.i != null) {
	            v0_1 += dep.b(15, this.i);
	        }
	        if (this.j != -2147483648) {
	            v0_1 += dep.b(16, this.j);
	        }
	        if (this.k != null) {
	            v0_1 += dep.b(17, this.k);
	        }
	        if (this.u != null) {
	            v0_1 += dep.b(18, this.u);
	        }
	        if (this.l != null) {
	            v0_1 += dep.b(19, this.l.longValue());
	        }
	        return v0_1;
	    }
	
	
	    public final synthetic dew a(deo p8)
	    {
	        while(true) {
	            int v0_0 = p8.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.a = Long.valueOf(p8.b());
	                    break;
	                case 16:
	                    int v0_59 = p8.e();
	                    switch (v0_59) {
	                        case 0:
	                        case 1:
	                        case 2:
	                        case 3:
	                            this.b = v0_59;
	                            break;
	                        default:
	                    }
	                    int[] v3_16++;
	                    int v1_19 = int v0_58;
	                    while (v3_16 < int[] v4_13) {
	                        if (v3_16 != null) {
	                            p8.a();
	                        }
	                        int v6_2 = p8.e();
	                        switch (v6_2) {
	                            case 0:
	                            case 1:
	                            case 2:
	                            case 3:
	                                v0_58 = (v1_19 + 1);
	                                int v5_5[v1_19] = v6_2;
	                                break;
	                            default:
	                                v0_58 = v1_19;
	                        }
	                    }
	                    if (v1_19 != 0) {
	                        int v0_57;
	                        if (this.n != null) {
	                            v0_57 = this.n.length;
	                        } else {
	                            v0_57 = 0;
	                        }
	                        if ((v0_57 != 0) || (v1_19 != v5_5.length)) {
	                            int[] v3_19 = new int[(v0_57 + v1_19)];
	                            if (v0_57 != 0) {
	                                System.arraycopy(this.n, 0, v3_19, 0, v0_57);
	                            }
	                            System.arraycopy(v5_5, 0, v3_19, v0_57, v1_19);
	                            this.n = v3_19;
	                        } else {
	                            this.n = v5_5;
	                        }
	                    }
	                    break;
	                case 24:
	                    v4_13 = dey.b(p8, 24);
	                    v5_5 = new int[v4_13];
	                    v3_16 = 0;
	                    v1_19 = 0;
	                    break;
	                case 26:
	                    int[] v3_15 = p8.c(p8.e());
	                    int v1_15 = p8.i();
	                    int v0_49 = 0;
	                    while (p8.h() > 0) {
	                        switch (p8.e()) {
	                            case 0:
	                            case 1:
	                            case 2:
	                            case 3:
	                                v0_49++;
	                                break;
	                            default:
	                        }
	                        int[] v3_11++;
	                        int v1_13 = int v0_47;
	                        while (v3_11 < int[] v4_8) {
	                            if (v3_11 != null) {
	                                p8.a();
	                            }
	                            int v6_1 = p8.e();
	                            switch (v6_1) {
	                                case 0:
	                                case 1:
	                                case 2:
	                                    v0_47 = (v1_13 + 1);
	                                    int v5_3[v1_13] = v6_1;
	                                    break;
	                                default:
	                                    v0_47 = v1_13;
	                            }
	                        }
	                        if (v1_13 == 0) {
	                        } else {
	                            int v0_46;
	                            if (this.c != null) {
	                                v0_46 = this.c.length;
	                            } else {
	                                v0_46 = 0;
	                            }
	                            if ((v0_46 != 0) || (v1_13 != v5_3.length)) {
	                                int[] v3_14 = new int[(v0_46 + v1_13)];
	                                if (v0_46 != 0) {
	                                    System.arraycopy(this.c, 0, v3_14, 0, v0_46);
	                                }
	                                System.arraycopy(v5_3, 0, v3_14, v0_46, v1_13);
	                                this.c = v3_14;
	                            } else {
	                                this.c = v5_3;
	                            }
	                        }
	                    }
	                    if (v0_49 != 0) {
	                        int v1_18;
	                        p8.e(v1_15);
	                        if (this.n != null) {
	                            v1_18 = this.n.length;
	                        } else {
	                            v1_18 = 0;
	                        }
	                        int[] v4_11 = new int[(v0_49 + v1_18)];
	                        if (v1_18 != 0) {
	                            System.arraycopy(this.n, 0, v4_11, 0, v1_18);
	                        }
	                        while (p8.h() > 0) {
	                            int v5_4 = p8.e();
	                            switch (v5_4) {
	                                case 0:
	                                case 1:
	                                case 2:
	                                case 3:
	                                    int v0_53 = (v1_18 + 1);
	                                    v4_11[v1_18] = v5_4;
	                                    v1_18 = v0_53;
	                                    break;
	                                default:
	                            }
	                        }
	                        this.n = v4_11;
	                    }
	                    p8.d(v3_15);
	                    break;
	                case 32:
	                    v4_8 = dey.b(p8, 32);
	                    v5_3 = new int[v4_8];
	                    v3_11 = 0;
	                    v1_13 = 0;
	                    break;
	                case 34:
	                    int[] v3_10 = p8.c(p8.e());
	                    int v1_9 = p8.i();
	                    int v0_38 = 0;
	                    while (p8.h() > 0) {
	                        switch (p8.e()) {
	                            case 0:
	                            case 1:
	                            case 2:
	                                v0_38++;
	                                break;
	                            default:
	                        }
	                        int[] v3_1++;
	                        int v1_4 = int v0_24;
	                        while (v3_1 < int[] v4_3) {
	                            if (v3_1 != null) {
	                                p8.a();
	                            }
	                            int v6_0 = p8.e();
	                            switch (v6_0) {
	                                case 0:
	                                case 1:
	                                case 2:
	                                    v0_24 = (v1_4 + 1);
	                                    int v5_1[v1_4] = v6_0;
	                                    break;
	                                default:
	                                    v0_24 = v1_4;
	                            }
	                        }
	                        if (v1_4 == 0) {
	                        } else {
	                            int v0_23;
	                            if (this.s != null) {
	                                v0_23 = this.s.length;
	                            } else {
	                                v0_23 = 0;
	                            }
	                            if ((v0_23 != 0) || (v1_4 != v5_1.length)) {
	                                int[] v3_4 = new int[(v0_23 + v1_4)];
	                                if (v0_23 != 0) {
	                                    System.arraycopy(this.s, 0, v3_4, 0, v0_23);
	                                }
	                                System.arraycopy(v5_1, 0, v3_4, v0_23, v1_4);
	                                this.s = v3_4;
	                            } else {
	                                this.s = v5_1;
	                            }
	                        }
	                    }
	                    if (v0_38 != 0) {
	                        int v1_12;
	                        p8.e(v1_9);
	                        if (this.c != null) {
	                            v1_12 = this.c.length;
	                        } else {
	                            v1_12 = 0;
	                        }
	                        int[] v4_6 = new int[(v0_38 + v1_12)];
	                        if (v1_12 != 0) {
	                            System.arraycopy(this.c, 0, v4_6, 0, v1_12);
	                        }
	                        while (p8.h() > 0) {
	                            int v5_2 = p8.e();
	                            switch (v5_2) {
	                                case 0:
	                                case 1:
	                                case 2:
	                                    int v0_42 = (v1_12 + 1);
	                                    v4_6[v1_12] = v5_2;
	                                    v1_12 = v0_42;
	                                    break;
	                                default:
	                            }
	                        }
	                        this.c = v4_6;
	                    }
	                    p8.d(v3_10);
	                    break;
	                case 42:
	                    int v0_36;
	                    int v1_6 = dey.b(p8, 42);
	                    if (this.o != null) {
	                        v0_36 = this.o.length;
	                    } else {
	                        v0_36 = 0;
	                    }
	                    int v1_8 = new String[(v1_6 + v0_36)];
	                    if (v0_36 != 0) {
	                        System.arraycopy(this.o, 0, v1_8, 0, v0_36);
	                    }
	                    while (v0_36 < (v1_8.length - 1)) {
	                        v1_8[v0_36] = p8.d();
	                        p8.a();
	                        v0_36++;
	                    }
	                    v1_8[v0_36] = p8.d();
	                    this.o = v1_8;
	                    break;
	                case 48:
	                    int v0_32 = p8.e();
	                    switch (v0_32) {
	                        case 0:
	                        case 1:
	                        case 2:
	                        case 3:
	                        case 4:
	                            this.p = v0_32;
	                            break;
	                        default:
	                    }
	                    break;
	                case 56:
	                    int v0_31 = p8.e();
	                    switch (v0_31) {
	                        case 0:
	                        case 1:
	                            this.q = v0_31;
	                            break;
	                        default:
	                    }
	                    break;
	                case 64:
	                    this.d = Long.valueOf(p8.b());
	                    break;
	                case 72:
	                    int v0_28 = p8.e();
	                    switch (v0_28) {
	                        case 0:
	                        case 1:
	                            this.e = v0_28;
	                            break;
	                        default:
	                    }
	                    break;
	                case 82:
	                    this.f = p8.d();
	                    break;
	                case 90:
	                    this.g = p8.d();
	                    break;
	                case 98:
	                    this.r = p8.d();
	                    break;
	                case 104:
	                    v4_3 = dey.b(p8, 104);
	                    v5_1 = new int[v4_3];
	                    v3_1 = 0;
	                    v1_4 = 0;
	                    break;
	                case 106:
	                    int[] v3_0 = p8.c(p8.e());
	                    int v1_0 = p8.i();
	                    int v0_15 = 0;
	                    while (p8.h() > 0) {
	                        switch (p8.e()) {
	                            case 0:
	                            case 1:
	                            case 2:
	                                v0_15++;
	                                break;
	                            default:
	                        }
	                    }
	                    if (v0_15 != 0) {
	                        int v1_3;
	                        p8.e(v1_0);
	                        if (this.s != null) {
	                            v1_3 = this.s.length;
	                        } else {
	                            v1_3 = 0;
	                        }
	                        int[] v4_1 = new int[(v0_15 + v1_3)];
	                        if (v1_3 != 0) {
	                            System.arraycopy(this.s, 0, v4_1, 0, v1_3);
	                        }
	                        while (p8.h() > 0) {
	                            int v5_0 = p8.e();
	                            switch (v5_0) {
	                                case 0:
	                                case 1:
	                                case 2:
	                                    int v0_19 = (v1_3 + 1);
	                                    v4_1[v1_3] = v5_0;
	                                    v1_3 = v0_19;
	                                    break;
	                                default:
	                            }
	                        }
	                        this.s = v4_1;
	                    }
	                    p8.d(v3_0);
	                    break;
	                case 114:
	                    if (this.h == null) {
	                        this.h = new dak();
	                    }
	                    p8.a(this.h);
	                    break;
	                case 122:
	                    if (this.i == null) {
	                        this.i = new dak();
	                    }
	                    p8.a(this.i);
	                    break;
	                case 128:
	                    int v0_5 = p8.e();
	                    switch (v0_5) {
	                        case 0:
	                        case 1:
	                            this.j = v0_5;
	                            break;
	                        default:
	                    }
	                    break;
	                case 138:
	                    this.k = p8.d();
	                    break;
	                case 146:
	                    this.u = p8.d();
	                    break;
	                case 152:
	                    this.l = Long.valueOf(p8.b());
	                    break;
	                default:
	                    if (dey.a(p8, v0_0)) {
	                    } else {
	                    }
	            }
	            return this;
	        }
	    }
	
	
	    public final void a(dep p6)
	    {
	        Long v1_0 = 0;
	        p6.a(1, this.a.longValue());
	        if (this.b != -2147483648) {
	            p6.a(2, this.b);
	        }
	        if ((this.n != null) && (this.n.length > 0)) {
	            int v0_6 = 0;
	            while (v0_6 < this.n.length) {
	                p6.a(3, this.n[v0_6]);
	                v0_6++;
	            }
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            int v0_10 = 0;
	            while (v0_10 < this.c.length) {
	                p6.a(4, this.c[v0_10]);
	                v0_10++;
	            }
	        }
	        if ((this.o != null) && (this.o.length > 0)) {
	            int v0_14 = 0;
	            while (v0_14 < this.o.length) {
	                long v2_21 = this.o[v0_14];
	                if (v2_21 != 0) {
	                    p6.a(5, v2_21);
	                }
	                v0_14++;
	            }
	        }
	        if (this.p != -2147483648) {
	            p6.a(6, this.p);
	        }
	        if (this.q != -2147483648) {
	            p6.a(7, this.q);
	        }
	        if (this.d != null) {
	            p6.a(8, this.d.longValue());
	        }
	        if (this.e != -2147483648) {
	            p6.a(9, this.e);
	        }
	        if (this.f != null) {
	            p6.a(10, this.f);
	        }
	        if (this.g != null) {
	            p6.a(11, this.g);
	        }
	        if (this.r != null) {
	            p6.a(12, this.r);
	        }
	        if ((this.s != null) && (this.s.length > 0)) {
	            while (v1_0 < this.s.length) {
	                p6.a(13, this.s[v1_0]);
	                v1_0++;
	            }
	        }
	        if (this.h != null) {
	            p6.a(14, this.h);
	        }
	        if (this.i != null) {
	            p6.a(15, this.i);
	        }
	        if (this.j != -2147483648) {
	            p6.a(16, this.j);
	        }
	        if (this.k != null) {
	            p6.a(17, this.k);
	        }
	        if (this.u != null) {
	            p6.a(18, this.u);
	        }
	        if (this.l != null) {
	            p6.a(19, this.l.longValue());
	        }
	        super.a(p6);
	        return;
	    }
	
