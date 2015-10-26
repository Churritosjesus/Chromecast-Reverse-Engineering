	private static bridge Ldan i
	public java.lang.Long a
	public java.lang.Long b
	public  c
	public I d
	public Ljava.lang.String e
	public I f
	public Ldap g
	public java.lang.String h
	private I j
	private java.lang.String k
	
	    public dan()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = -2147483648;
	        this.j = dey.a;
	        this.d = dey.a;
	        this.e = dey.b;
	        this.f = dey.a;
	        this.g = dap.b();
	        this.h = 0;
	        this.k = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dan[] b()
	    {
	        if (dan.i == null) {
	            if (dan.i == null) {
	                dan[] v0_3 = new dan[0];
	                dan.i = v0_3;
	            }
	        }
	        return dan.i;
	    }
	
	
	    protected final int a()
	    {
	        long v2_0 = 0;
	        int v0_1 = (super.a() + dep.b(1, this.a.longValue()));
	        if (this.c != -2147483648) {
	            v0_1 += dep.b(2, this.c);
	        }
	        if ((this.j != null) && (this.j.length > 0)) {
	            int v1_8 = 0;
	            int v3_3 = 0;
	            while (v1_8 < this.j.length) {
	                v3_3 += dep.a(this.j[v1_8]);
	                v1_8++;
	            }
	            v0_1 = ((v0_1 + v3_3) + (this.j.length * 1));
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            int v1_15 = 0;
	            int v3_4 = 0;
	            while (v1_15 < this.d.length) {
	                v3_4 += dep.a(this.d[v1_15]);
	                v1_15++;
	            }
	            v0_1 = ((v0_1 + v3_4) + (this.d.length * 1));
	        }
	        if ((this.e != null) && (this.e.length > 0)) {
	            int v1_22 = 0;
	            int v3_5 = 0;
	            int v4_5 = 0;
	            while (v1_22 < this.e.length) {
	                int v5_3 = this.e[v1_22];
	                if (v5_3 != 0) {
	                    v4_5++;
	                    v3_5 += dep.a(v5_3);
	                }
	                v1_22++;
	            }
	            v0_1 = ((v0_1 + v3_5) + (v4_5 * 1));
	        }
	        if ((this.f != null) && (this.f.length > 0)) {
	            int v1_27 = 0;
	            int v3_6 = 0;
	            while (v1_27 < this.f.length) {
	                v3_6 += dep.a(this.f[v1_27]);
	                v1_27++;
	            }
	            v0_1 = ((v0_1 + v3_6) + (this.f.length * 1));
	        }
	        if ((this.g != null) && (this.g.length > 0)) {
	            while (v2_0 < this.g.length) {
	                int v1_46 = this.g[v2_0];
	                if (v1_46 != 0) {
	                    v0_1 += dep.b(7, v1_46);
	                }
	                v2_0++;
	            }
	        }
	        if (this.h != null) {
	            v0_1 += dep.b(9, this.h);
	        }
	        if (this.k != null) {
	            v0_1 += dep.b(10, this.k);
	        }
	        if (this.b != null) {
	            v0_1 += dep.b(11, this.b.longValue());
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
	                    int v0_47 = p8.e();
	                    switch (v0_47) {
	                        case 0:
	                        case 1:
	                            this.c = v0_47;
	                            break;
	                        default:
	                    }
	                    int[] v3_24++;
	                    int v1_22 = int v0_46;
	                    while (v3_24 < int[] v4_13) {
	                        if (v3_24 != null) {
	                            p8.a();
	                        }
	                        int v6_2 = p8.e();
	                        switch (v6_2) {
	                            case 0:
	                            case 1:
	                            case 2:
	                            case 3:
	                                v0_46 = (v1_22 + 1);
	                                int v5_5[v1_22] = v6_2;
	                                break;
	                            default:
	                                v0_46 = v1_22;
	                        }
	                    }
	                    if (v1_22 != 0) {
	                        int v0_45;
	                        if (this.j != null) {
	                            v0_45 = this.j.length;
	                        } else {
	                            v0_45 = 0;
	                        }
	                        if ((v0_45 != 0) || (v1_22 != v5_5.length)) {
	                            int[] v3_27 = new int[(v0_45 + v1_22)];
	                            if (v0_45 != 0) {
	                                System.arraycopy(this.j, 0, v3_27, 0, v0_45);
	                            }
	                            System.arraycopy(v5_5, 0, v3_27, v0_45, v1_22);
	                            this.j = v3_27;
	                        } else {
	                            this.j = v5_5;
	                        }
	                    }
	                    break;
	                case 24:
	                    v4_13 = dey.b(p8, 24);
	                    v5_5 = new int[v4_13];
	                    v3_24 = 0;
	                    v1_22 = 0;
	                    break;
	                case 26:
	                    int[] v3_23 = p8.c(p8.e());
	                    int v1_18 = p8.i();
	                    int v0_37 = 0;
	                    while (p8.h() > 0) {
	                        switch (p8.e()) {
	                            case 0:
	                            case 1:
	                            case 2:
	                            case 3:
	                                v0_37++;
	                                break;
	                            default:
	                        }
	                        int[] v3_19++;
	                        int v1_16 = int v0_35;
	                        while (v3_19 < int[] v4_8) {
	                            if (v3_19 != null) {
	                                p8.a();
	                            }
	                            int v6_1 = p8.e();
	                            switch (v6_1) {
	                                case 0:
	                                case 1:
	                                case 2:
	                                    v0_35 = (v1_16 + 1);
	                                    int v5_3[v1_16] = v6_1;
	                                    break;
	                                default:
	                                    v0_35 = v1_16;
	                            }
	                        }
	                        if (v1_16 == 0) {
	                        } else {
	                            int v0_34;
	                            if (this.d != null) {
	                                v0_34 = this.d.length;
	                            } else {
	                                v0_34 = 0;
	                            }
	                            if ((v0_34 != 0) || (v1_16 != v5_3.length)) {
	                                int[] v3_22 = new int[(v0_34 + v1_16)];
	                                if (v0_34 != 0) {
	                                    System.arraycopy(this.d, 0, v3_22, 0, v0_34);
	                                }
	                                System.arraycopy(v5_3, 0, v3_22, v0_34, v1_16);
	                                this.d = v3_22;
	                            } else {
	                                this.d = v5_3;
	                            }
	                        }
	                    }
	                    if (v0_37 != 0) {
	                        int v1_21;
	                        p8.e(v1_18);
	                        if (this.j != null) {
	                            v1_21 = this.j.length;
	                        } else {
	                            v1_21 = 0;
	                        }
	                        int[] v4_11 = new int[(v0_37 + v1_21)];
	                        if (v1_21 != 0) {
	                            System.arraycopy(this.j, 0, v4_11, 0, v1_21);
	                        }
	                        while (p8.h() > 0) {
	                            int v5_4 = p8.e();
	                            switch (v5_4) {
	                                case 0:
	                                case 1:
	                                case 2:
	                                case 3:
	                                    int v0_41 = (v1_21 + 1);
	                                    v4_11[v1_21] = v5_4;
	                                    v1_21 = v0_41;
	                                    break;
	                                default:
	                            }
	                        }
	                        this.j = v4_11;
	                    }
	                    p8.d(v3_23);
	                    break;
	                case 32:
	                    v4_8 = dey.b(p8, 32);
	                    v5_3 = new int[v4_8];
	                    v3_19 = 0;
	                    v1_16 = 0;
	                    break;
	                case 34:
	                    int[] v3_18 = p8.c(p8.e());
	                    int v1_12 = p8.i();
	                    int v0_26 = 0;
	                    while (p8.h() > 0) {
	                        switch (p8.e()) {
	                            case 0:
	                            case 1:
	                            case 2:
	                                v0_26++;
	                                break;
	                            default:
	                        }
	                        int[] v3_9++;
	                        int v1_7 = int v0_20;
	                        while (v3_9 < int[] v4_3) {
	                            if (v3_9 != null) {
	                                p8.a();
	                            }
	                            int v6_0 = p8.e();
	                            switch (v6_0) {
	                                case 0:
	                                case 1:
	                                case 2:
	                                case 3:
	                                case 4:
	                                case 5:
	                                    v0_20 = (v1_7 + 1);
	                                    int v5_1[v1_7] = v6_0;
	                                    break;
	                                default:
	                                    v0_20 = v1_7;
	                            }
	                        }
	                        if (v1_7 == 0) {
	                        } else {
	                            int v0_19;
	                            if (this.f != null) {
	                                v0_19 = this.f.length;
	                            } else {
	                                v0_19 = 0;
	                            }
	                            if ((v0_19 != 0) || (v1_7 != v5_1.length)) {
	                                int[] v3_12 = new int[(v0_19 + v1_7)];
	                                if (v0_19 != 0) {
	                                    System.arraycopy(this.f, 0, v3_12, 0, v0_19);
	                                }
	                                System.arraycopy(v5_1, 0, v3_12, v0_19, v1_7);
	                                this.f = v3_12;
	                            } else {
	                                this.f = v5_1;
	                            }
	                        }
	                    }
	                    if (v0_26 != 0) {
	                        int v1_15;
	                        p8.e(v1_12);
	                        if (this.d != null) {
	                            v1_15 = this.d.length;
	                        } else {
	                            v1_15 = 0;
	                        }
	                        int[] v4_6 = new int[(v0_26 + v1_15)];
	                        if (v1_15 != 0) {
	                            System.arraycopy(this.d, 0, v4_6, 0, v1_15);
	                        }
	                        while (p8.h() > 0) {
	                            int v5_2 = p8.e();
	                            switch (v5_2) {
	                                case 0:
	                                case 1:
	                                case 2:
	                                    int v0_30 = (v1_15 + 1);
	                                    v4_6[v1_15] = v5_2;
	                                    v1_15 = v0_30;
	                                    break;
	                                default:
	                            }
	                        }
	                        this.d = v4_6;
	                    }
	                    p8.d(v3_18);
	                    break;
	                case 42:
	                    int v0_24;
	                    int v1_9 = dey.b(p8, 42);
	                    if (this.e != null) {
	                        v0_24 = this.e.length;
	                    } else {
	                        v0_24 = 0;
	                    }
	                    int v1_11 = new String[(v1_9 + v0_24)];
	                    if (v0_24 != 0) {
	                        System.arraycopy(this.e, 0, v1_11, 0, v0_24);
	                    }
	                    while (v0_24 < (v1_11.length - 1)) {
	                        v1_11[v0_24] = p8.d();
	                        p8.a();
	                        v0_24++;
	                    }
	                    v1_11[v0_24] = p8.d();
	                    this.e = v1_11;
	                    break;
	                case 48:
	                    v4_3 = dey.b(p8, 48);
	                    v5_1 = new int[v4_3];
	                    v3_9 = 0;
	                    v1_7 = 0;
	                    break;
	                case 50:
	                    int[] v3_8 = p8.c(p8.e());
	                    int v1_3 = p8.i();
	                    int v0_11 = 0;
	                    while (p8.h() > 0) {
	                        switch (p8.e()) {
	                            case 0:
	                            case 1:
	                            case 2:
	                            case 3:
	                            case 4:
	                            case 5:
	                                v0_11++;
	                                break;
	                            default:
	                        }
	                    }
	                    if (v0_11 != 0) {
	                        int v1_6;
	                        p8.e(v1_3);
	                        if (this.f != null) {
	                            v1_6 = this.f.length;
	                        } else {
	                            v1_6 = 0;
	                        }
	                        int[] v4_1 = new int[(v0_11 + v1_6)];
	                        if (v1_6 != 0) {
	                            System.arraycopy(this.f, 0, v4_1, 0, v1_6);
	                        }
	                        while (p8.h() > 0) {
	                            int v5_0 = p8.e();
	                            switch (v5_0) {
	                                case 0:
	                                case 1:
	                                case 2:
	                                case 3:
	                                case 4:
	                                case 5:
	                                    int v0_15 = (v1_6 + 1);
	                                    v4_1[v1_6] = v5_0;
	                                    v1_6 = v0_15;
	                                    break;
	                                default:
	                            }
	                        }
	                        this.f = v4_1;
	                    }
	                    p8.d(v3_8);
	                    break;
	                case 58:
	                    int v0_8;
	                    int v1_0 = dey.b(p8, 58);
	                    if (this.g != null) {
	                        v0_8 = this.g.length;
	                    } else {
	                        v0_8 = 0;
	                    }
	                    int v1_2 = new dap[(v1_0 + v0_8)];
	                    if (v0_8 != 0) {
	                        System.arraycopy(this.g, 0, v1_2, 0, v0_8);
	                    }
	                    while (v0_8 < (v1_2.length - 1)) {
	                        v1_2[v0_8] = new dap();
	                        p8.a(v1_2[v0_8]);
	                        p8.a();
	                        v0_8++;
	                    }
	                    v1_2[v0_8] = new dap();
	                    p8.a(v1_2[v0_8]);
	                    this.g = v1_2;
	                    break;
	                case 74:
	                    this.h = p8.d();
	                    break;
	                case 82:
	                    this.k = p8.d();
	                    break;
	                case 88:
	                    this.b = Long.valueOf(p8.b());
	                    break;
	                default:
	                    if (dey.a(p8, v0_0)) {
	                    } else {
	                    }
	            }
	            return this;
	        }
	    }
	
	
	    public final void a(dep p5)
	    {
	        Long v1_0 = 0;
	        p5.a(1, this.a.longValue());
	        if (this.c != -2147483648) {
	            p5.a(2, this.c);
	        }
	        if ((this.j != null) && (this.j.length > 0)) {
	            int v0_6 = 0;
	            while (v0_6 < this.j.length) {
	                p5.a(3, this.j[v0_6]);
	                v0_6++;
	            }
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            int v0_10 = 0;
	            while (v0_10 < this.d.length) {
	                p5.a(4, this.d[v0_10]);
	                v0_10++;
	            }
	        }
	        if ((this.e != null) && (this.e.length > 0)) {
	            int v0_14 = 0;
	            while (v0_14 < this.e.length) {
	                long v2_16 = this.e[v0_14];
	                if (v2_16 != 0) {
	                    p5.a(5, v2_16);
	                }
	                v0_14++;
	            }
	        }
	        if ((this.f != null) && (this.f.length > 0)) {
	            int v0_18 = 0;
	            while (v0_18 < this.f.length) {
	                p5.a(6, this.f[v0_18]);
	                v0_18++;
	            }
	        }
	        if ((this.g != null) && (this.g.length > 0)) {
	            while (v1_0 < this.g.length) {
	                int v0_31 = this.g[v1_0];
	                if (v0_31 != 0) {
	                    p5.a(7, v0_31);
	                }
	                v1_0++;
	            }
	        }
	        if (this.h != null) {
	            p5.a(9, this.h);
	        }
	        if (this.k != null) {
	            p5.a(10, this.k);
	        }
	        if (this.b != null) {
	            p5.a(11, this.b.longValue());
	        }
	        super.a(p5);
	        return;
	    }
	
