	final synthetic djb a
	private dib b
	
	    djk(djb p5)
	    {
	        this.a = p5;
	        Object[] v1_1 = new Object[1];
	        v1_1[0] = djb.a(p5);
	        this("OkHttp %s", v1_1);
	        return;
	    }
	
	
	    protected final void a()
	    {
	        dib v0_0 = dia.e;
	        try {
	            this.b = this.a.g.a(dkk.a(dkk.b(this.a.h)), this.a.b);
	        } catch (dib v1) {
	            dib v1_9 = dia.b;
	            try {
	                try {
	                    djb.a(this.a, v1_9, dia.b);
	                } catch (dib v0) {
	                }
	                dgs.a(this.b);
	                return;
	            } catch (dib v0_2) {
	                try {
	                    djb.a(this.a, v1_9, dia.e);
	                } catch (dib v1) {
	                }
	                dgs.a(this.b);
	                throw v0_2;
	            }
	        } catch (dib v1_10) {
	            v1_9 = v0_0;
	            v0_2 = v1_10;
	        }
	        if (!this.a.b) {
	            this.b.a();
	        }
	        while (this.b.a(this)) {
	        }
	        v0_0 = dia.a;
	        try {
	            djb.a(this.a, v0_0, dia.h);
	        } catch (dib v0) {
	        }
	        dgs.a(this.b);
	        return;
	    }
	
	
	    public final void a(int p5, long p6)
	    {
	        try {
	            if (p5 != 0) {
	                djn v1 = this.a.a(p5);
	                if (v1 != null) {
	                    try {
	                        v1.a(p6);
	                    } catch (Throwable v0_1) {
	                        throw v0_1;
	                    }
	                }
	            } else {
	                Throwable v0_2 = this.a;
	                v0_2.d = (v0_2.d + p6);
	                this.a.notifyAll();
	            }
	        } catch (Throwable v0_4) {
	            throw v0_4;
	        }
	        return;
	    }
	
	
	    public final void a(int p2, dia p3)
	    {
	        if (!djb.a(this.a, p2)) {
	            djn v0_3 = this.a.b(p2);
	            if (v0_3 != null) {
	                v0_3.c(p3);
	            }
	        } else {
	            djb.a(this.a, p2, p3);
	        }
	        return;
	    }
	
	
	    public final void a(int p6, dke p7)
	    {
	        int v2_3 = new djn[djb.e(this.a).size()];
	        Throwable v0_5 = ((djn[]) djb.e(this.a).values().toArray(v2_3));
	        djb.b(this.a, 1);
	        int v2_5 = v0_5.length;
	        int v1 = 0;
	        while (v1 < v2_5) {
	            int v3_1 = v0_5[v1];
	            if ((v3_1.c > p6) && (v3_1.b())) {
	                v3_1.c(dia.g);
	                this.a.b(v3_1.c);
	            }
	            v1++;
	        }
	        return;
	    }
	
	
	    public final void a(int p2, java.util.List p3)
	    {
	        djb.a(this.a, p2, p3);
	        return;
	    }
	
	
	    public final void a(boolean p4, int p5, int p6)
	    {
	        if (!p4) {
	            djb.b(this.a, 1, p5, p6, 0);
	        } else {
	            djb v0_2 = djb.c(this.a, p5);
	            if (v0_2 != null) {
	                v0_2.h();
	            }
	        }
	        return;
	    }
	
	
	    public final void a(boolean p5, int p6, dkd p7, int p8)
	    {
	        if (!djb.a(this.a, p6)) {
	            long v0_3 = this.a.a(p6);
	            if (v0_3 != 0) {
	                v0_3.f.a(p7, ((long) p8));
	                if (p5) {
	                    v0_3.e();
	                }
	            } else {
	                this.a.a(p6, dia.c);
	                p7.f(((long) p8));
	            }
	        } else {
	            djb.a(this.a, p6, p7, p8, p5);
	        }
	        return;
	    }
	
	
	    public final void a(boolean p13, dix p14)
	    {
	        int v3_1 = this.a.f.c(65536);
	        if (p13) {
	            djn[] v2_3 = this.a.f;
	            v2_3.c = 0;
	            v2_3.b = 0;
	            v2_3.a = 0;
	            java.util.Arrays.fill(v2_3.d, 0);
	        }
	        djn[] v2_6 = 0;
	        while (v2_6 < 10) {
	            if (p14.a(v2_6)) {
	                this.a.f.a(v2_6, p14.b(v2_6), p14.d[v2_6]);
	            }
	            v2_6++;
	        }
	        if (this.a.a == dfx.d) {
	            djn[] v2_9 = djb.d();
	            Object[] v9_1 = new Object[1];
	            v9_1[0] = djb.a(this.a);
	            v2_9.execute(new djm(this, "OkHttp %s ACK Settings", v9_1, p14));
	        }
	        djn[] v4_8;
	        djn[] v2_13;
	        djn[] v2_12 = this.a.f.c(65536);
	        if ((v2_12 == -1) || (v2_12 == v3_1)) {
	            v2_13 = 0;
	            v4_8 = 0;
	        } else {
	            djn[] v2_15 = ((long) (v2_12 - v3_1));
	            if (!djb.g(this.a)) {
	                djn[] v4_11 = this.a;
	                v4_11.d = (v4_11.d + v2_15);
	                if (v2_15 > 0) {
	                    v4_11.notifyAll();
	                }
	                djb.a(this.a, 1);
	            }
	            if (djb.e(this.a).isEmpty()) {
	                v4_8 = v2_15;
	                v2_13 = 0;
	            } else {
	                djn[] v4_19 = new djn[djb.e(this.a).size()];
	                v4_8 = v2_15;
	                v2_13 = ((djn[]) djb.e(this.a).values().toArray(v4_19));
	            }
	        }
	        if ((v2_13 != null) && (v4_8 != 0)) {
	            int v3_2 = v2_13.length;
	            Throwable v0_7 = 0;
	            while (v0_7 < v3_2) {
	                v2_13[v0_7].a(v4_8);
	                v0_7++;
	            }
	        }
	        return;
	    }
	
	
	    public final void a(boolean p9, boolean p10, int p11, java.util.List p12, dif p13)
	    {
	        java.util.ArrayList v2_0 = 0;
	        djb v0_0 = 1;
	        if (!djb.a(this.a, p11)) {
	            try {
	                if (!djb.b(this.a)) {
	                    String v3_0 = this.a.a(p11);
	                    if (v3_0 != null) {
	                        int v1_6;
	                        if (p13 != dif.a) {
	                            v1_6 = 0;
	                        } else {
	                            v1_6 = 1;
	                        }
	                        if (v1_6 == 0) {
	                            int v1_7 = 0;
	                            try {
	                                if (v3_0.e != null) {
	                                    if (p13 == dif.b) {
	                                        v2_0 = 1;
	                                    }
	                                    if (v2_0 == null) {
	                                        java.util.ArrayList v2_2 = new java.util.ArrayList();
	                                        v2_2.addAll(v3_0.e);
	                                        v2_2.addAll(p12);
	                                        v3_0.e = v2_2;
	                                    } else {
	                                        v1_7 = dia.d;
	                                    }
	                                } else {
	                                    if (p13 == dif.c) {
	                                        v2_0 = 1;
	                                    }
	                                    if (v2_0 == null) {
	                                        v3_0.e = p12;
	                                        v0_0 = v3_0.a();
	                                        v3_0.notifyAll();
	                                    } else {
	                                        v1_7 = dia.b;
	                                    }
	                                }
	                            } catch (djb v0_1) {
	                                throw v0_1;
	                            }
	                            if (v1_7 == 0) {
	                                if (v0_0 == null) {
	                                    v3_0.d.b(v3_0.c);
	                                }
	                            } else {
	                                v3_0.b(v1_7);
	                            }
	                            if (p10) {
	                                v3_0.e();
	                            }
	                        } else {
	                            v3_0.b(dia.b);
	                            this.a.b(p11);
	                        }
	                    } else {
	                        if ((p13 == dif.b) || (p13 == dif.c)) {
	                            v2_0 = 1;
	                        }
	                        if (v2_0 == null) {
	                            if (p11 > djb.c(this.a)) {
	                                if ((p11 % 2) != (djb.d(this.a) % 2)) {
	                                    djb v0_9 = new djn(p11, this.a, p9, p10, p12);
	                                    djb.b(this.a, p11);
	                                    djb.e(this.a).put(Integer.valueOf(p11), v0_9);
	                                    int v1_18 = djb.d();
	                                    java.util.List v4_6 = new Object[2];
	                                    v4_6[0] = djb.a(this.a);
	                                    v4_6[1] = Integer.valueOf(p11);
	                                    v1_18.execute(new djl(this, "OkHttp %s stream %d", v4_6, v0_9));
	                                } else {
	                                }
	                            } else {
	                            }
	                        } else {
	                            this.a.a(p11, dia.c);
	                        }
	                    }
	                } else {
	                }
	            } catch (djb v0_11) {
	                throw v0_11;
	            }
	        } else {
	            djb.a(this.a, p11, p12, p10);
	        }
	        return;
	    }
	
