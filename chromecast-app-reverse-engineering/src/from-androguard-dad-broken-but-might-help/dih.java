	final java.util.List a
	final dkd b
	  c
	  d
	 Ldie e
	private  f
	private  g
	private  h
	
	    dih(int p3, dkv p4)
	    {
	        this.a = new java.util.ArrayList();
	        dkd v0_3 = new die[8];
	        this.e = v0_3;
	        this.f = (this.e.length - 1);
	        this.g = 0;
	        this.h = 0;
	        this.c = p3;
	        this.d = p3;
	        this.b = dkk.a(p4);
	        return;
	    }
	
	
	    private void c()
	    {
	        this.a.clear();
	        java.util.Arrays.fill(this.e, 0);
	        this.f = (this.e.length - 1);
	        this.g = 0;
	        this.h = 0;
	        return;
	    }
	
	
	    static boolean c(int p1)
	    {
	        if ((p1 < 0) || (p1 > (dig.a().length - 1))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    private int d()
	    {
	        return (this.b.g() & 255);
	    }
	
	
	    private int d(int p7)
	    {
	        int v1 = 0;
	        if (p7 > 0) {
	            int v0_2 = (this.e.length - 1);
	            while ((v0_2 >= this.f) && (p7 > 0)) {
	                p7 -= this.e[v0_2].j;
	                this.h = (this.h - this.e[v0_2].j);
	                this.g = (this.g - 1);
	                v1++;
	                v0_2--;
	            }
	            System.arraycopy(this.e, (this.f + 1), this.e, ((this.f + 1) + v1), this.g);
	            this.f = (this.f + v1);
	        }
	        return v1;
	    }
	
	
	    int a(int p2)
	    {
	        return ((this.f + 1) + p2);
	    }
	
	
	    final int a(int p4, int p5)
	    {
	        int v0_0 = (p4 & p5);
	        if (v0_0 >= p5) {
	            int v0_1 = 0;
	            while(true) {
	                int v1_0 = this.d();
	                if ((v1_0 & 128) == 0) {
	                    break;
	                }
	                p5 += ((v1_0 & 127) << v0_1);
	                v0_1 += 7;
	            }
	            v0_0 = ((v1_0 << v0_1) + p5);
	        }
	        return v0_0;
	    }
	
	
	    void a()
	    {
	        if (this.d < this.h) {
	            if (this.d != 0) {
	                this.d((this.h - this.d));
	            } else {
	                this.c();
	            }
	        }
	        return;
	    }
	
	
	    void a(int p7, die p8)
	    {
	        this.a.add(p8);
	        int v0_1 = p8.j;
	        if (v0_1 <= this.d) {
	            this.d(((this.h + v0_1) - this.d));
	            if ((this.g + 1) > this.e.length) {
	                int v1_9 = new die[(this.e.length << 1)];
	                System.arraycopy(this.e, 0, v1_9, this.e.length, this.e.length);
	                this.f = (this.e.length - 1);
	                this.e = v1_9;
	            }
	            int v1_10 = this.f;
	            this.f = (v1_10 - 1);
	            this.e[v1_10] = p8;
	            this.g = (this.g + 1);
	            this.h = (v0_1 + this.h);
	        } else {
	            this.c();
	        }
	        return;
	    }
	
	
	    final dke b()
	    {
	        int v0_1;
	        int v1_0 = 0;
	        int v2_0 = this.d();
	        if ((v2_0 & 128) != 128) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        int v0_3;
	        int v2_1 = this.a(v2_0, 127);
	        if (v0_1 == 0) {
	            v0_3 = this.b.c(((long) v2_1));
	        } else {
	            dio v4 = dio.a();
	            byte[] v5 = this.b.e(((long) v2_1));
	            java.io.ByteArrayOutputStream v6_1 = new java.io.ByteArrayOutputStream();
	            int v2_4 = 0;
	            dip v3_2 = v4.a;
	            int v0_6 = 0;
	            while (v1_0 < v5.length) {
	                v2_4 = ((v2_4 << 8) | (v5[v1_0] & 255));
	                v0_6 += 8;
	                while (v0_6 >= 8) {
	                    v3_2 = v3_2.a[((v2_4 >> (v0_6 - 8)) & 255)];
	                    if (v3_2.a != null) {
	                        v0_6 -= 8;
	                    } else {
	                        v6_1.write(v3_2.b);
	                        v0_6 -= v3_2.c;
	                        v3_2 = v4.a;
	                    }
	                }
	                v1_0++;
	            }
	            while (v0_6 > 0) {
	                int v1_4 = v3_2.a[((v2_4 << (8 - v0_6)) & 255)];
	                if ((v1_4.a != null) || (v1_4.c > v0_6)) {
	                    break;
	                }
	                v6_1.write(v1_4.b);
	                v0_6 -= v1_4.c;
	                v3_2 = v4.a;
	            }
	            v0_3 = dke.a(v6_1.toByteArray());
	        }
	        return v0_3;
	    }
	
	
	    dke b(int p3)
	    {
	        dke v0_3;
	        if (!dih.c(p3)) {
	            v0_3 = this.e[this.a((p3 - dig.a().length))].h;
	        } else {
	            v0_3 = dig.a()[p3].h;
	        }
	        return v0_3;
	    }
	
