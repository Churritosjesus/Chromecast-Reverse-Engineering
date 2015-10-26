	public cmo m
	
	    public cmm()
	    {
	        return;
	    }
	
	
	    private cmm b()
	    {
	        cmm v0_1 = ((cmm) super.d());
	        cmq.a(this, v0_1);
	        return v0_1;
	    }
	
	
	    protected int a()
	    {
	        int v1_1;
	        int v0 = 0;
	        if (this.m == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = 0;
	            while (v0 < this.m.d) {
	                v1_1 += this.m.c[v0].a();
	                v0++;
	            }
	        }
	        return v1_1;
	    }
	
	
	    public final Object a(cmn p5)
	    {
	        Object v1_0 = 0;
	        if (this.m != null) {
	            cmp v2_2 = this.m.a(cmu.b(p5.b));
	            if (v2_2 != null) {
	                if (v2_2.b == null) {
	                    Object v0_4;
	                    v2_2.a = p5;
	                    Object v0_3 = v2_2.c;
	                    if (v0_3 != null) {
	                        if (!p5.c) {
	                            v0_4 = p5.b(v0_3);
	                        } else {
	                            v0_4 = p5.a(v0_3);
	                        }
	                    } else {
	                        v0_4 = 0;
	                    }
	                    v2_2.b = v0_4;
	                    v2_2.c = 0;
	                } else {
	                    if (v2_2.a != p5) {
	                        throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
	                    }
	                }
	                v1_0 = v2_2.b;
	            }
	        }
	        return v1_0;
	    }
	
	
	    public void a(cmk p3)
	    {
	        if (this.m != null) {
	            int v0_1 = 0;
	            while (v0_1 < this.m.d) {
	                this.m.c[v0_1].a(p3);
	                v0_1++;
	            }
	        }
	        return;
	    }
	
	
	    protected final boolean a(cmj p11, int p12)
	    {
	        int v0_7;
	        cmt v2_0 = p11.i();
	        if (p11.b(p12)) {
	            int v0_2;
	            int v3 = cmu.b(p12);
	            cmo v4_0 = (p11.i() - v2_0);
	            if (v4_0 != null) {
	                v0_2 = new byte[v4_0];
	                System.arraycopy(p11.a, (v2_0 + p11.b), v0_2, 0, v4_0);
	            } else {
	                v0_2 = cmu.d;
	            }
	            cmt v2_3 = new cmt(p12, v0_2);
	            int v0_3 = 0;
	            if (this.m != null) {
	                v0_3 = this.m.a(v3);
	            } else {
	                this.m = new cmo();
	            }
	            if (v0_3 == 0) {
	                v0_3 = new cmp();
	                cmo v4_4 = this.m;
	                int v5_2 = v4_4.c(v3);
	                if (v5_2 < 0) {
	                    int v5_3 = (v5_2 ^ -1);
	                    if ((v5_3 >= v4_4.d) || (v4_4.c[v5_3] != cmo.a)) {
	                        if (v4_4.d >= v4_4.b.length) {
	                            cmp[] v6_6 = v4_4.b((v4_4.d + 1));
	                            int v7_3 = new int[v6_6];
	                            cmp[] v6_7 = new cmp[v6_6];
	                            System.arraycopy(v4_4.b, 0, v7_3, 0, v4_4.b.length);
	                            System.arraycopy(v4_4.c, 0, v6_7, 0, v4_4.c.length);
	                            v4_4.b = v7_3;
	                            v4_4.c = v6_7;
	                        }
	                        if ((v4_4.d - v5_3) != 0) {
	                            System.arraycopy(v4_4.b, v5_3, v4_4.b, (v5_3 + 1), (v4_4.d - v5_3));
	                            System.arraycopy(v4_4.c, v5_3, v4_4.c, (v5_3 + 1), (v4_4.d - v5_3));
	                        }
	                        v4_4.b[v5_3] = v3;
	                        v4_4.c[v5_3] = v0_3;
	                        v4_4.d = (v4_4.d + 1);
	                    } else {
	                        v4_4.b[v5_3] = v3;
	                        v4_4.c[v5_3] = v0_3;
	                    }
	                } else {
	                    v4_4.c[v5_2] = v0_3;
	                }
	            }
	            v0_3.c.add(v2_3);
	            v0_7 = 1;
	        } else {
	            v0_7 = 0;
	        }
	        return v0_7;
	    }
	
	
	    protected final boolean a(cmm p3)
	    {
	        if ((this.m != null) && (!this.m.a())) {
	            int v0_4 = this.m.equals(p3.m);
	        } else {
	            if ((p3.m != null) && (!p3.m.a())) {
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	        }
	        return v0_4;
	    }
	
	
	    protected final int c()
	    {
	        if ((this.m != null) && (!this.m.a())) {
	            int v0_4 = this.m.hashCode();
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public synthetic Object clone()
	    {
	        return this.b();
	    }
	
	
	    public final synthetic cms d()
	    {
	        return this.b();
	    }
	
