	private static bridge Lcje o
	public  a
	public java.lang.String b
	public Lcje c
	public Lcje d
	public Lcje e
	public java.lang.String f
	public java.lang.String g
	public  h
	public  i
	public Lcje j
	public I k
	public  l
	
	    public cje()
	    {
	        this.a = 1;
	        this.b = "";
	        this.c = cje.b();
	        this.d = cje.b();
	        this.e = cje.b();
	        this.f = "";
	        this.g = "";
	        this.h = 0;
	        this.i = 0;
	        this.j = cje.b();
	        this.k = cmu.a;
	        this.l = 0;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    public static cje[] b()
	    {
	        if (cje.o == null) {
	            if (cje.o == null) {
	                cje[] v0_3 = new cje[0];
	                cje.o = v0_3;
	            }
	        }
	        return cje.o;
	    }
	
	
	    protected final int a()
	    {
	        int v1_0 = 0;
	        int v0_1 = (super.a() + cmk.b(1, this.a));
	        if (!this.b.equals("")) {
	            v0_1 += cmk.b(2, this.b);
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            int v2_9 = v0_1;
	            int v0_2 = 0;
	            while (v0_2 < this.c.length) {
	                int v3_22 = this.c[v0_2];
	                if (v3_22 != 0) {
	                    v2_9 += cmk.b(3, v3_22);
	                }
	                v0_2++;
	            }
	            v0_1 = v2_9;
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            int v2_13 = v0_1;
	            int v0_3 = 0;
	            while (v0_3 < this.d.length) {
	                int v3_19 = this.d[v0_3];
	                if (v3_19 != 0) {
	                    v2_13 += cmk.b(4, v3_19);
	                }
	                v0_3++;
	            }
	            v0_1 = v2_13;
	        }
	        if ((this.e != null) && (this.e.length > 0)) {
	            int v2_17 = v0_1;
	            int v0_4 = 0;
	            while (v0_4 < this.e.length) {
	                int v3_16 = this.e[v0_4];
	                if (v3_16 != 0) {
	                    v2_17 += cmk.b(5, v3_16);
	                }
	                v0_4++;
	            }
	            v0_1 = v2_17;
	        }
	        if (!this.f.equals("")) {
	            v0_1 += cmk.b(6, this.f);
	        }
	        if (!this.g.equals("")) {
	            v0_1 += cmk.b(7, this.g);
	        }
	        if (this.h != 0) {
	            v0_1 += cmk.b(8, this.h);
	        }
	        if (this.l) {
	            v0_1 += (cmk.c(9) + 1);
	        }
	        if ((this.k != null) && (this.k.length > 0)) {
	            int v2_37 = 0;
	            int v3_13 = 0;
	            while (v2_37 < this.k.length) {
	                v3_13 += cmk.a(this.k[v2_37]);
	                v2_37++;
	            }
	            v0_1 = ((v0_1 + v3_13) + (this.k.length * 1));
	        }
	        if ((this.j != null) && (this.j.length > 0)) {
	            while (v1_0 < this.j.length) {
	                int v2_47 = this.j[v1_0];
	                if (v2_47 != 0) {
	                    v0_1 += cmk.b(11, v2_47);
	                }
	                v1_0++;
	            }
	        }
	        if (this.i) {
	            v0_1 += (cmk.c(12) + 1);
	        }
	        return v0_1;
	    }
	
	
	    public final synthetic cms a(cmj p8)
	    {
	        while(true) {
	            int v0_0 = p8.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    int v0_37 = p8.e();
	                    switch (v0_37) {
	                        case 1:
	                        case 2:
	                        case 3:
	                        case 4:
	                        case 5:
	                        case 6:
	                        case 7:
	                        case 8:
	                            this.a = v0_37;
	                            break;
	                        default:
	                    }
	                    int[] v3_9++;
	                    int v2_7 = int v0_17;
	                    while (v3_9 < int[] v4_3) {
	                        if (v3_9 != null) {
	                            p8.a();
	                        }
	                        int v6 = p8.e();
	                        switch (v6) {
	                            case 1:
	                            case 2:
	                            case 3:
	                            case 4:
	                            case 5:
	                            case 6:
	                            case 7:
	                            case 8:
	                            case 9:
	                            case 10:
	                            case 11:
	                            case 12:
	                            case 13:
	                            case 14:
	                            case 15:
	                            case 16:
	                            case 17:
	                                v0_17 = (v2_7 + 1);
	                                int v5_1[v2_7] = v6;
	                                break;
	                            default:
	                                v0_17 = v2_7;
	                        }
	                    }
	                    if (v2_7 != 0) {
	                        int v0_16;
	                        if (this.k != null) {
	                            v0_16 = this.k.length;
	                        } else {
	                            v0_16 = 0;
	                        }
	                        if ((v0_16 != 0) || (v2_7 != v5_1.length)) {
	                            int[] v3_12 = new int[(v0_16 + v2_7)];
	                            if (v0_16 != 0) {
	                                System.arraycopy(this.k, 0, v3_12, 0, v0_16);
	                            }
	                            System.arraycopy(v5_1, 0, v3_12, v0_16, v2_7);
	                            this.k = v3_12;
	                        } else {
	                            this.k = v5_1;
	                        }
	                    }
	                    break;
	                case 18:
	                    this.b = p8.c();
	                    break;
	                case 26:
	                    int v0_34;
	                    int v2_16 = cmu.a(p8, 26);
	                    if (this.c != null) {
	                        v0_34 = this.c.length;
	                    } else {
	                        v0_34 = 0;
	                    }
	                    int v2_18 = new cje[(v2_16 + v0_34)];
	                    if (v0_34 != 0) {
	                        System.arraycopy(this.c, 0, v2_18, 0, v0_34);
	                    }
	                    while (v0_34 < (v2_18.length - 1)) {
	                        v2_18[v0_34] = new cje();
	                        p8.a(v2_18[v0_34]);
	                        p8.a();
	                        v0_34++;
	                    }
	                    v2_18[v0_34] = new cje();
	                    p8.a(v2_18[v0_34]);
	                    this.c = v2_18;
	                    break;
	                case 34:
	                    int v0_29;
	                    int v2_13 = cmu.a(p8, 34);
	                    if (this.d != null) {
	                        v0_29 = this.d.length;
	                    } else {
	                        v0_29 = 0;
	                    }
	                    int v2_15 = new cje[(v2_13 + v0_29)];
	                    if (v0_29 != 0) {
	                        System.arraycopy(this.d, 0, v2_15, 0, v0_29);
	                    }
	                    while (v0_29 < (v2_15.length - 1)) {
	                        v2_15[v0_29] = new cje();
	                        p8.a(v2_15[v0_29]);
	                        p8.a();
	                        v0_29++;
	                    }
	                    v2_15[v0_29] = new cje();
	                    p8.a(v2_15[v0_29]);
	                    this.d = v2_15;
	                    break;
	                case 42:
	                    int v0_24;
	                    int v2_10 = cmu.a(p8, 42);
	                    if (this.e != null) {
	                        v0_24 = this.e.length;
	                    } else {
	                        v0_24 = 0;
	                    }
	                    int v2_12 = new cje[(v2_10 + v0_24)];
	                    if (v0_24 != 0) {
	                        System.arraycopy(this.e, 0, v2_12, 0, v0_24);
	                    }
	                    while (v0_24 < (v2_12.length - 1)) {
	                        v2_12[v0_24] = new cje();
	                        p8.a(v2_12[v0_24]);
	                        p8.a();
	                        v0_24++;
	                    }
	                    v2_12[v0_24] = new cje();
	                    p8.a(v2_12[v0_24]);
	                    this.e = v2_12;
	                    break;
	                case 50:
	                    this.f = p8.c();
	                    break;
	                case 58:
	                    this.g = p8.c();
	                    break;
	                case 64:
	                    this.h = p8.f();
	                    break;
	                case 72:
	                    this.l = p8.b();
	                    break;
	                case 80:
	                    v4_3 = cmu.a(p8, 80);
	                    v5_1 = new int[v4_3];
	                    v3_9 = 0;
	                    v2_7 = 0;
	                    break;
	                case 82:
	                    int[] v3_8 = p8.c(p8.e());
	                    int v2_3 = p8.i();
	                    int v0_8 = 0;
	                    while (p8.h() > 0) {
	                        switch (p8.e()) {
	                            case 1:
	                            case 2:
	                            case 3:
	                            case 4:
	                            case 5:
	                            case 6:
	                            case 7:
	                            case 8:
	                            case 9:
	                            case 10:
	                            case 11:
	                            case 12:
	                            case 13:
	                            case 14:
	                            case 15:
	                            case 16:
	                            case 17:
	                                v0_8++;
	                                break;
	                            default:
	                        }
	                    }
	                    if (v0_8 != 0) {
	                        int v2_6;
	                        p8.e(v2_3);
	                        if (this.k != null) {
	                            v2_6 = this.k.length;
	                        } else {
	                            v2_6 = 0;
	                        }
	                        int[] v4_1 = new int[(v0_8 + v2_6)];
	                        if (v2_6 != 0) {
	                            System.arraycopy(this.k, 0, v4_1, 0, v2_6);
	                        }
	                        while (p8.h() > 0) {
	                            int v5_0 = p8.e();
	                            switch (v5_0) {
	                                case 1:
	                                case 2:
	                                case 3:
	                                case 4:
	                                case 5:
	                                case 6:
	                                case 7:
	                                case 8:
	                                case 9:
	                                case 10:
	                                case 11:
	                                case 12:
	                                case 13:
	                                case 14:
	                                case 15:
	                                case 16:
	                                case 17:
	                                    int v0_12 = (v2_6 + 1);
	                                    v4_1[v2_6] = v5_0;
	                                    v2_6 = v0_12;
	                                    break;
	                                default:
	                            }
	                        }
	                        this.k = v4_1;
	                    }
	                    p8.d(v3_8);
	                    break;
	                case 90:
	                    int v0_5;
	                    int v2_0 = cmu.a(p8, 90);
	                    if (this.j != null) {
	                        v0_5 = this.j.length;
	                    } else {
	                        v0_5 = 0;
	                    }
	                    int v2_2 = new cje[(v2_0 + v0_5)];
	                    if (v0_5 != 0) {
	                        System.arraycopy(this.j, 0, v2_2, 0, v0_5);
	                    }
	                    while (v0_5 < (v2_2.length - 1)) {
	                        v2_2[v0_5] = new cje();
	                        p8.a(v2_2[v0_5]);
	                        p8.a();
	                        v0_5++;
	                    }
	                    v2_2[v0_5] = new cje();
	                    p8.a(v2_2[v0_5]);
	                    this.j = v2_2;
	                    break;
	                case 96:
	                    this.i = p8.b();
	                    break;
	                default:
	                    if (this.a(p8, v0_0)) {
	                    } else {
	                    }
	            }
	            return this;
	        }
	    }
	
	
	    public final void a(cmk p7)
	    {
	        int v1_0 = 0;
	        p7.a(1, this.a);
	        if (!this.b.equals("")) {
	            p7.a(2, this.b);
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            cje v0_7 = 0;
	            while (v0_7 < this.c.length) {
	                int v2_25 = this.c[v0_7];
	                if (v2_25 != 0) {
	                    p7.a(3, v2_25);
	                }
	                v0_7++;
	            }
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            cje v0_11 = 0;
	            while (v0_11 < this.d.length) {
	                int v2_23 = this.d[v0_11];
	                if (v2_23 != 0) {
	                    p7.a(4, v2_23);
	                }
	                v0_11++;
	            }
	        }
	        if ((this.e != null) && (this.e.length > 0)) {
	            cje v0_15 = 0;
	            while (v0_15 < this.e.length) {
	                int v2_21 = this.e[v0_15];
	                if (v2_21 != 0) {
	                    p7.a(5, v2_21);
	                }
	                v0_15++;
	            }
	        }
	        if (!this.f.equals("")) {
	            p7.a(6, this.f);
	        }
	        if (!this.g.equals("")) {
	            p7.a(7, this.g);
	        }
	        if (this.h != 0) {
	            p7.a(8, this.h);
	        }
	        if (this.l) {
	            p7.a(9, this.l);
	        }
	        if ((this.k != null) && (this.k.length > 0)) {
	            cje v0_29 = 0;
	            while (v0_29 < this.k.length) {
	                p7.a(10, this.k[v0_29]);
	                v0_29++;
	            }
	        }
	        if ((this.j != null) && (this.j.length > 0)) {
	            while (v1_0 < this.j.length) {
	                cje v0_38 = this.j[v1_0];
	                if (v0_38 != null) {
	                    p7.a(11, v0_38);
	                }
	                v1_0++;
	            }
	        }
	        if (this.i) {
	            p7.a(12, this.i);
	        }
	        super.a(p7);
	        return;
	    }
	
	
	    public final boolean equals(Object p7)
	    {
	        boolean v0 = 0;
	        if (p7 != this) {
	            if (((p7 instanceof cje)) && (this.a == ((cje) p7).a)) {
	                if (this.b != null) {
	                    if (!this.b.equals(((cje) p7).b)) {
	                        return v0;
	                    }
	                } else {
	                    if (((cje) p7).b != null) {
	                        return v0;
	                    }
	                }
	                if ((cmq.a(this.c, ((cje) p7).c)) && ((cmq.a(this.d, ((cje) p7).d)) && (cmq.a(this.e, ((cje) p7).e)))) {
	                    if (this.f != null) {
	                        if (!this.f.equals(((cje) p7).f)) {
	                            return v0;
	                        }
	                    } else {
	                        if (((cje) p7).f != null) {
	                            return v0;
	                        }
	                    }
	                    if (this.g != null) {
	                        if (!this.g.equals(((cje) p7).g)) {
	                            return v0;
	                        }
	                    } else {
	                        if (((cje) p7).g != null) {
	                            return v0;
	                        }
	                    }
	                    if ((this.h == ((cje) p7).h) && ((this.i == ((cje) p7).i) && ((cmq.a(this.j, ((cje) p7).j)) && ((cmq.a(this.k, ((cje) p7).k)) && (this.l == ((cje) p7).l))))) {
	                        v0 = this.a(((cje) p7));
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
	        int v0_4;
	        int v2 = 1231;
	        int v1_0 = 0;
	        long v4_0 = ((this.a + 527) * 31);
	        if (this.b != null) {
	            v0_4 = this.b.hashCode();
	        } else {
	            v0_4 = 0;
	        }
	        int v0_14;
	        long v4_7 = ((((((((v0_4 + v4_0) * 31) + cmq.a(this.c)) * 31) + cmq.a(this.d)) * 31) + cmq.a(this.e)) * 31);
	        if (this.f != null) {
	            v0_14 = this.f.hashCode();
	        } else {
	            v0_14 = 0;
	        }
	        int v0_16 = ((v0_14 + v4_7) * 31);
	        if (this.g != null) {
	            v1_0 = this.g.hashCode();
	        }
	        int v0_21;
	        if (!this.i) {
	            v0_21 = 1237;
	        } else {
	            v0_21 = 1231;
	        }
	        int v0_27 = ((((((v0_21 + ((((v0_16 + v1_0) * 31) + ((int) (this.h ^ (this.h >> 32)))) * 31)) * 31) + cmq.a(this.j)) * 31) + cmq.a(this.k)) * 31);
	        if (!this.l) {
	            v2 = 1237;
	        }
	        return (((v0_27 + v2) * 31) + this.c());
	    }
	
