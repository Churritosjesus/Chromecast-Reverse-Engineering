	public des i
	
	    public der()
	    {
	        return;
	    }
	
	
	    private der b()
	    {
	        der v0_1 = ((der) super.c());
	        deu.a(this, v0_1);
	        return v0_1;
	    }
	
	
	    public int a()
	    {
	        int v1_1;
	        int v0 = 0;
	        if (this.i == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = 0;
	            while (v0 < this.i.d) {
	                v1_1 += this.i.c[v0].a();
	                v0++;
	            }
	        }
	        return v1_1;
	    }
	
	
	    public void a(dep p3)
	    {
	        if (this.i != null) {
	            int v0_1 = 0;
	            while (v0_1 < this.i.d) {
	                this.i.c[v0_1].a(p3);
	                v0_1++;
	            }
	        }
	        return;
	    }
	
	
	    public final boolean a(deo p11, int p12)
	    {
	        det v0_11;
	        dex v3_0 = p11.i();
	        if (p11.b(p12)) {
	            det v0_2;
	            int v4 = dey.b(p12);
	            int v5_0 = (p11.i() - v3_0);
	            if (v5_0 != 0) {
	                v0_2 = new byte[v5_0];
	                System.arraycopy(p11.a, (v3_0 + p11.b), v0_2, 0, v5_0);
	            } else {
	                v0_2 = dey.c;
	            }
	            det v0_6;
	            dex v3_3 = new dex(p12, v0_2);
	            if (this.i != null) {
	                det v0_4 = this.i;
	                int v5_1 = v0_4.b(v4);
	                if ((v5_1 >= 0) && (v0_4.c[v5_1] != des.a)) {
	                    v0_6 = v0_4.c[v5_1];
	                } else {
	                    v0_6 = 0;
	                }
	            } else {
	                this.i = new des();
	                v0_6 = 0;
	            }
	            if (v0_6 == null) {
	                v0_6 = new det();
	                det[] v1_1 = this.i;
	                int v5_2 = v1_1.b(v4);
	                if (v5_2 < 0) {
	                    int v5_3 = (v5_2 ^ -1);
	                    if ((v5_3 >= v1_1.d) || (v1_1.c[v5_3] != des.a)) {
	                        if (v1_1.d >= v1_1.b.length) {
	                            det[] v6_10 = v1_1.a((v1_1.d + 1));
	                            int v7_4 = new int[v6_10];
	                            det[] v6_11 = new det[v6_10];
	                            System.arraycopy(v1_1.b, 0, v7_4, 0, v1_1.b.length);
	                            System.arraycopy(v1_1.c, 0, v6_11, 0, v1_1.c.length);
	                            v1_1.b = v7_4;
	                            v1_1.c = v6_11;
	                        }
	                        if ((v1_1.d - v5_3) != 0) {
	                            System.arraycopy(v1_1.b, v5_3, v1_1.b, (v5_3 + 1), (v1_1.d - v5_3));
	                            System.arraycopy(v1_1.c, v5_3, v1_1.c, (v5_3 + 1), (v1_1.d - v5_3));
	                        }
	                        v1_1.b[v5_3] = v4;
	                        v1_1.c[v5_3] = v0_6;
	                        v1_1.d = (v1_1.d + 1);
	                    } else {
	                        v1_1.b[v5_3] = v4;
	                        v1_1.c[v5_3] = v0_6;
	                    }
	                } else {
	                    v1_1.c[v5_2] = v0_6;
	                }
	            }
	            v0_6.a.add(v3_3);
	            v0_11 = 1;
	        } else {
	            v0_11 = 0;
	        }
	        return v0_11;
	    }
	
	
	    public final synthetic dew c()
	    {
	        return this.b();
	    }
	
	
	    public synthetic Object clone()
	    {
	        return this.b();
	    }
	
