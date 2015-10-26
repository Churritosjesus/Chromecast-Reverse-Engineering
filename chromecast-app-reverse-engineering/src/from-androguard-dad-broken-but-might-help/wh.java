	final java.util.ArrayList a
	private eo b
	private java.util.ArrayList c
	private wi d
	private  e
	private yo f
	
	    public wh(wi p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    private wh(wi p3, boolean p4)
	    {
	        this.b = new eo(30);
	        this.a = new java.util.ArrayList();
	        this.c = new java.util.ArrayList();
	        this.d = p3;
	        this.e = 0;
	        this.f = new yo(this);
	        return;
	    }
	
	
	    private void a(java.util.List p4)
	    {
	        int v2 = p4.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            this.a(((wj) p4.get(v1)));
	            v1++;
	        }
	        p4.clear();
	        return;
	    }
	
	
	    private void a(wj p3, int p4)
	    {
	        this.d.a(p3);
	        switch (p3.a) {
	            case 1:
	                this.d.a(p4, p3.c);
	                break;
	            case 2:
	                this.d.c(p4, p3.c);
	                break;
	            default:
	                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
	        }
	        return;
	    }
	
	
	    private int b(int p8, int p9)
	    {
	        int v4_0 = (this.c.size() - 1);
	        int v1_0 = p8;
	        while (v4_0 >= 0) {
	            int v0_13;
	            int v0_12 = ((wj) this.c.get(v4_0));
	            if (v0_12.a != 3) {
	                if (v0_12.b > v1_0) {
	                    if (p9 != 0) {
	                        if (p9 == 1) {
	                            v0_12.b = (v0_12.b - 1);
	                        }
	                    } else {
	                        v0_12.b = (v0_12.b + 1);
	                        v0_13 = v1_0;
	                        v4_0--;
	                        v1_0 = v0_13;
	                    }
	                } else {
	                    if (v0_12.a != 0) {
	                        if (v0_12.a == 1) {
	                            v0_13 = (v0_12.c + v1_0);
	                        }
	                    } else {
	                        v0_13 = (v1_0 - v0_12.c);
	                    }
	                }
	                v0_13 = v1_0;
	            } else {
	                java.util.ArrayList v3_7;
	                int v2_10;
	                if (v0_12.b >= v0_12.c) {
	                    v3_7 = v0_12.c;
	                    v2_10 = v0_12.b;
	                } else {
	                    v3_7 = v0_12.b;
	                    v2_10 = v0_12.c;
	                }
	                if ((v1_0 < v3_7) || (v1_0 > v2_10)) {
	                    if (v1_0 < v0_12.b) {
	                        if (p9 != 0) {
	                            if (p9 == 1) {
	                                v0_12.b = (v0_12.b - 1);
	                                v0_12.c = (v0_12.c - 1);
	                            }
	                        } else {
	                            v0_12.b = (v0_12.b + 1);
	                            v0_12.c = (v0_12.c + 1);
	                            v0_13 = v1_0;
	                        }
	                    }
	                    v0_13 = v1_0;
	                } else {
	                    if (v3_7 != v0_12.b) {
	                        if (p9 != 0) {
	                            if (p9 == 1) {
	                                v0_12.b = (v0_12.b - 1);
	                            }
	                        } else {
	                            v0_12.b = (v0_12.b + 1);
	                        }
	                        v0_13 = (v1_0 - 1);
	                    } else {
	                        if (p9 != 0) {
	                            if (p9 == 1) {
	                                v0_12.c = (v0_12.c - 1);
	                            }
	                        } else {
	                            v0_12.c = (v0_12.c + 1);
	                        }
	                        v0_13 = (v1_0 + 1);
	                    }
	                }
	            }
	        }
	        int v2_0 = (this.c.size() - 1);
	        while (v2_0 >= 0) {
	            int v0_8 = ((wj) this.c.get(v2_0));
	            if (v0_8.a != 3) {
	                if (v0_8.c <= 0) {
	                    this.c.remove(v2_0);
	                    this.a(v0_8);
	                }
	            } else {
	                if ((v0_8.c == v0_8.b) || (v0_8.c < 0)) {
	                    this.c.remove(v2_0);
	                    this.a(v0_8);
	                }
	            }
	            v2_0--;
	        }
	        return v1_0;
	    }
	
	
	    private void b(wj p10)
	    {
	        if ((p10.a != 0) && (p10.a != 3)) {
	            wj v0_4;
	            int v4_0 = this.b(p10.b, p10.a);
	            switch (p10.a) {
	                case 1:
	                    v0_4 = 0;
	                    break;
	                case 2:
	                    v0_4 = 1;
	                    break;
	                default:
	                    throw new IllegalArgumentException(new StringBuilder("op should be remove or update.").append(p10).toString());
	            }
	            String v5 = 1;
	            int v6_0 = v4_0;
	            int v4_1 = p10.b;
	            int v3_3 = 1;
	            while (v3_3 < p10.c) {
	                int v7_5;
	                int v8_2 = this.b((p10.b + (v0_4 * v3_3)), p10.a);
	                switch (p10.a) {
	                    case 1:
	                        if (v8_2 != v6_0) {
	                            v7_5 = 0;
	                        } else {
	                            v7_5 = 1;
	                        }
	                        break;
	                    case 2:
	                        if (v8_2 != (v6_0 + 1)) {
	                            v7_5 = 0;
	                        } else {
	                            v7_5 = 1;
	                        }
	                        break;
	                    default:
	                        v7_5 = 0;
	                }
	                if (v7_5 == 0) {
	                    int v6_1 = this.a(p10.a, v6_0, v5);
	                    this.a(v6_1, v4_1);
	                    this.a(v6_1);
	                    if (p10.a == 2) {
	                        v4_1 += v5;
	                    }
	                    v5 = 1;
	                    v6_0 = v8_2;
	                } else {
	                    v5++;
	                }
	                v3_3++;
	            }
	            this.a(p10);
	            if (v5 > null) {
	                wj v0_6 = this.a(p10.a, v6_0, v5);
	                this.a(v0_6, v4_1);
	                this.a(v0_6);
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
	        }
	    }
	
	
	    private boolean b(int p8)
	    {
	        int v4 = this.c.size();
	        int v3 = 0;
	        while (v3 < v4) {
	            int v0_4 = ((wj) this.c.get(v3));
	            if (v0_4.a != 3) {
	                if (v0_4.a == 0) {
	                    int v0_5 = v0_4.b;
	                    while (v0_5 < (v0_4.b + v0_4.c)) {
	                        if (this.a(v0_5, (v3 + 1)) != p8) {
	                            v0_5++;
	                        } else {
	                            int v0_1 = 1;
	                            return v0_1;
	                        }
	                    }
	                }
	            } else {
	                if (this.a(v0_4.c, (v3 + 1)) == p8) {
	                    v0_1 = 1;
	                    return v0_1;
	                }
	            }
	            v3++;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    private void c(wj p4)
	    {
	        this.c.add(p4);
	        switch (p4.a) {
	            case 0:
	                this.d.d(p4.b, p4.c);
	                break;
	            case 1:
	                this.d.b(p4.b, p4.c);
	                break;
	            case 2:
	                this.d.c(p4.b, p4.c);
	                break;
	            case 3:
	                this.d.e(p4.b, p4.c);
	                break;
	            default:
	                throw new IllegalArgumentException(new StringBuilder("Unknown update op type for ").append(p4).toString());
	        }
	        return;
	    }
	
	
	    final int a(int p2)
	    {
	        return this.a(p2, 0);
	    }
	
	
	    final int a(int p6, int p7)
	    {
	        int v2 = this.c.size();
	        int v1 = p6;
	        while (p7 < v2) {
	            int v0_3 = ((wj) this.c.get(p7));
	            if (v0_3.a != 3) {
	                if (v0_3.b <= v1) {
	                    if (v0_3.a != 1) {
	                        if (v0_3.a == 0) {
	                            v1 += v0_3.c;
	                        }
	                    } else {
	                        if (v1 >= (v0_3.b + v0_3.c)) {
	                            v1 -= v0_3.c;
	                        } else {
	                            v1 = -1;
	                            break;
	                        }
	                    }
	                }
	            } else {
	                if (v0_3.b != v1) {
	                    if (v0_3.b < v1) {
	                        v1--;
	                    }
	                    if (v0_3.c <= v1) {
	                        v1++;
	                    }
	                } else {
	                    v1 = v0_3.c;
	                }
	            }
	            p7++;
	        }
	        return v1;
	    }
	
	
	    public final wj a(int p2, int p3, int p4)
	    {
	        wj v0_2 = ((wj) this.b.a());
	        if (v0_2 != null) {
	            v0_2.a = p2;
	            v0_2.b = p3;
	            v0_2.c = p4;
	        } else {
	            v0_2 = new wj(p2, p3, p4);
	        }
	        return v0_2;
	    }
	
	
	    public final void a()
	    {
	        this.a(this.a);
	        this.a(this.c);
	        return;
	    }
	
	
	    public final void a(wj p2)
	    {
	        if (!this.e) {
	            this.b.a(p2);
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        int v6_0 = this.f;
	        int v7_0 = this.a;
	        do {
	            int v1_0 = 0;
	            int v2_0 = (v7_0.size() - 1);
	            int v5_0;
	            if (v2_0 < 0) {
	                v5_0 = -1;
	            } else {
	                wj v0_5;
	                if (((wj) v7_0.get(v2_0)).a != 3) {
	                    v0_5 = 1;
	                } else {
	                    if (v1_0 == 0) {
	                        v0_5 = v1_0;
	                    } else {
	                        v5_0 = v2_0;
	                        if (v5_0 == -1) {
	                            int v7_1 = this.a.size();
	                            int v5_1 = 0;
	                            while (v5_1 < v7_1) {
	                                wj v0_12 = ((wj) this.a.get(v5_1));
	                                switch (v0_12.a) {
	                                    case 0:
	                                        this.c(v0_12);
	                                        break;
	                                    case 1:
	                                        int v8_4 = v0_12.b;
	                                        int v3_5 = (v0_12.c + v0_12.b);
	                                        int v4_7 = -1;
	                                        int v2_6 = v0_12.b;
	                                        int v6_2 = 0;
	                                        while (v2_6 < v3_5) {
	                                            int v1_10 = 0;
	                                            if ((this.d.a(v2_6) == null) && (!this.b(v2_6))) {
	                                                if (v4_7 == 1) {
	                                                    this.c(this.a(1, v8_4, v6_2));
	                                                    v1_10 = 1;
	                                                }
	                                                v4_7 = 0;
	                                            } else {
	                                                if (v4_7 == 0) {
	                                                    this.b(this.a(1, v8_4, v6_2));
	                                                    v1_10 = 1;
	                                                }
	                                                v4_7 = 1;
	                                            }
	                                            int v3_6;
	                                            int v1_16;
	                                            int v2_7;
	                                            if (v1_10 == 0) {
	                                                v2_7 = v3_5;
	                                                v3_6 = (v6_2 + 1);
	                                                v1_16 = v2_6;
	                                            } else {
	                                                v1_16 = (v2_6 - v6_2);
	                                                v2_7 = (v3_5 - v6_2);
	                                                v3_6 = 1;
	                                            }
	                                            v6_2 = v3_6;
	                                            v3_5 = v2_7;
	                                            v2_6 = (v1_16 + 1);
	                                        }
	                                        if (v6_2 != v0_12.c) {
	                                            this.a(v0_12);
	                                            v0_12 = this.a(1, v8_4, v6_2);
	                                        }
	                                        if (v4_7 != 0) {
	                                            this.c(v0_12);
	                                        } else {
	                                            this.b(v0_12);
	                                        }
	                                        break;
	                                    case 2:
	                                        int v6_1 = (v0_12.b + v0_12.c);
	                                        int v3_2 = v0_12.b;
	                                        int v1_4 = 0;
	                                        int v2_2 = v0_12.b;
	                                        int v4_1 = -1;
	                                        while (v3_2 < v6_1) {
	                                            if ((this.d.a(v3_2) == null) && (!this.b(v3_2))) {
	                                                if (v4_1 == 1) {
	                                                    this.c(this.a(2, v2_2, v1_4));
	                                                    v1_4 = 0;
	                                                    v2_2 = v3_2;
	                                                }
	                                                int v4_4 = v2_2;
	                                                int v2_3 = v1_4;
	                                                int v1_6 = 0;
	                                            } else {
	                                                if (v4_1 == 0) {
	                                                    this.b(this.a(2, v2_2, v1_4));
	                                                    v1_4 = 0;
	                                                    v2_2 = v3_2;
	                                                }
	                                                v4_4 = v2_2;
	                                                v2_3 = v1_4;
	                                                v1_6 = 1;
	                                            }
	                                            v3_2++;
	                                            v1_4 = (v2_3 + 1);
	                                            v2_2 = v4_4;
	                                            v4_1 = v1_6;
	                                        }
	                                        if (v1_4 != v0_12.c) {
	                                            this.a(v0_12);
	                                            v0_12 = this.a(2, v2_2, v1_4);
	                                        }
	                                        if (v4_1 != 0) {
	                                            this.c(v0_12);
	                                        } else {
	                                            this.b(v0_12);
	                                        }
	                                        break;
	                                    case 3:
	                                        this.c(v0_12);
	                                        break;
	                                }
	                                v5_1++;
	                            }
	                            this.a.clear();
	                            return;
	                        } else {
	                            int v8_5 = (v5_0 + 1);
	                            wj v0_17 = ((wj) v7_0.get(v5_0));
	                            int v1_19 = ((wj) v7_0.get(v8_5));
	                            switch (v1_19.a) {
	                                case 0:
	                                    int v2_44 = 0;
	                                    if (v0_17.c < v1_19.b) {
	                                        v2_44 = -1;
	                                    }
	                                    if (v0_17.b < v1_19.b) {
	                                        v2_44++;
	                                    }
	                                    if (v1_19.b <= v0_17.b) {
	                                        v0_17.b = (v0_17.b + v1_19.c);
	                                    }
	                                    if (v1_19.b <= v0_17.c) {
	                                        v0_17.c = (v0_17.c + v1_19.c);
	                                    }
	                                    v1_19.b = (v2_44 + v1_19.b);
	                                    v7_0.set(v5_0, v1_19);
	                                    v7_0.set(v8_5, v0_17);
	                                case 1:
	                                    int v2_14;
	                                    int v4_21 = 0;
	                                    int v3_11 = 0;
	                                    if (v0_17.b >= v0_17.c) {
	                                        v2_14 = 1;
	                                        if ((v1_19.b == (v0_17.c + 1)) && (v1_19.c == (v0_17.b - v0_17.c))) {
	                                            v3_11 = 1;
	                                        }
	                                    } else {
	                                        v2_14 = 0;
	                                        if ((v1_19.b == v0_17.b) && (v1_19.c == (v0_17.c - v0_17.b))) {
	                                            v3_11 = 1;
	                                        }
	                                    }
	                                    if (v0_17.c >= v1_19.b) {
	                                        if (v0_17.c < (v1_19.b + v1_19.c)) {
	                                            v1_19.c = (v1_19.c - 1);
	                                            v0_17.a = 1;
	                                            v0_17.c = 1;
	                                            if (v1_19.c == 0) {
	                                                v7_0.remove(v8_5);
	                                                v6_0.a.a(v1_19);
	                                            }
	                                        }
	                                    } else {
	                                        v1_19.b = (v1_19.b - 1);
	                                    }
	                                    if (v0_17.b > v1_19.b) {
	                                        if (v0_17.b < (v1_19.b + v1_19.c)) {
	                                            v4_21 = v6_0.a.a(1, (v0_17.b + 1), ((v1_19.b + v1_19.c) - v0_17.b));
	                                            v1_19.c = (v0_17.b - v1_19.b);
	                                        }
	                                    } else {
	                                        v1_19.b = (v1_19.b + 1);
	                                    }
	                                    if (v3_11 == 0) {
	                                        if (v2_14 == 0) {
	                                            if (v4_21 != 0) {
	                                                if (v0_17.b >= v4_21.b) {
	                                                    v0_17.b = (v0_17.b - v4_21.c);
	                                                }
	                                                if (v0_17.c >= v4_21.b) {
	                                                    v0_17.c = (v0_17.c - v4_21.c);
	                                                }
	                                            }
	                                            if (v0_17.b >= v1_19.b) {
	                                                v0_17.b = (v0_17.b - v1_19.c);
	                                            }
	                                            if (v0_17.c >= v1_19.b) {
	                                                v0_17.c = (v0_17.c - v1_19.c);
	                                            }
	                                        } else {
	                                            if (v4_21 != 0) {
	                                                if (v0_17.b > v4_21.b) {
	                                                    v0_17.b = (v0_17.b - v4_21.c);
	                                                }
	                                                if (v0_17.c > v4_21.b) {
	                                                    v0_17.c = (v0_17.c - v4_21.c);
	                                                }
	                                            }
	                                            if (v0_17.b > v1_19.b) {
	                                                v0_17.b = (v0_17.b - v1_19.c);
	                                            }
	                                            if (v0_17.c > v1_19.b) {
	                                                v0_17.c = (v0_17.c - v1_19.c);
	                                            }
	                                        }
	                                        v7_0.set(v5_0, v1_19);
	                                        if (v0_17.b == v0_17.c) {
	                                            v7_0.remove(v8_5);
	                                        } else {
	                                            v7_0.set(v8_5, v0_17);
	                                        }
	                                        if (v4_21 == 0) {
	                                        } else {
	                                            v7_0.add(v5_0, v4_21);
	                                        }
	                                    } else {
	                                        v7_0.set(v5_0, v1_19);
	                                        v7_0.remove(v8_5);
	                                        v6_0.a.a(v0_17);
	                                    }
	                                    break;
	                                case 2:
	                                    int v2_9 = 0;
	                                    int v3_7 = 0;
	                                    if (v0_17.c >= v1_19.b) {
	                                        if (v0_17.c < (v1_19.b + v1_19.c)) {
	                                            v1_19.c = (v1_19.c - 1);
	                                            v2_9 = v6_0.a.a(2, v0_17.b, 1);
	                                        }
	                                    } else {
	                                        v1_19.b = (v1_19.b - 1);
	                                    }
	                                    if (v0_17.b > v1_19.b) {
	                                        if (v0_17.b < (v1_19.b + v1_19.c)) {
	                                            int v4_17 = ((v1_19.b + v1_19.c) - v0_17.b);
	                                            v3_7 = v6_0.a.a(2, (v0_17.b + 1), v4_17);
	                                            v1_19.c = (v1_19.c - v4_17);
	                                        }
	                                    } else {
	                                        v1_19.b = (v1_19.b + 1);
	                                    }
	                                    v7_0.set(v8_5, v0_17);
	                                    if (v1_19.c <= 0) {
	                                        v7_0.remove(v5_0);
	                                        v6_0.a.a(v1_19);
	                                    } else {
	                                        v7_0.set(v5_0, v1_19);
	                                    }
	                                    if (v2_9 != 0) {
	                                        v7_0.add(v5_0, v2_9);
	                                    }
	                                    break;
	                                default:
	                            }
	                        }
	                    }
	                }
	                v2_0--;
	                v1_0 = v0_5;
	                while (v2_0 >= 0) {
	                }
	            }
	        } while(v3_7 == 0);
	        v7_0.add(v5_0, v3_7);
	    }
	
	
	    public final void c()
	    {
	        int v2 = this.c.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            this.d.b(((wj) this.c.get(v1)));
	            v1++;
	        }
	        this.a(this.c);
	        return;
	    }
	
	
	    final boolean d()
	    {
	        int v0_2;
	        if (this.a.size() <= 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final void e()
	    {
	        this.c();
	        int v2 = this.a.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            int v0_5 = ((wj) this.a.get(v1));
	            switch (v0_5.a) {
	                case 0:
	                    this.d.b(v0_5);
	                    this.d.d(v0_5.b, v0_5.c);
	                    break;
	                case 1:
	                    this.d.b(v0_5);
	                    this.d.a(v0_5.b, v0_5.c);
	                    break;
	                case 2:
	                    this.d.b(v0_5);
	                    this.d.c(v0_5.b, v0_5.c);
	                    break;
	                case 3:
	                    this.d.b(v0_5);
	                    this.d.e(v0_5.b, v0_5.c);
	                    break;
	            }
	            v1++;
	        }
	        this.a(this.a);
	        return;
	    }
	
