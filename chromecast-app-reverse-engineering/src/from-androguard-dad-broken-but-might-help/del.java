	private  a
	private I b
	private Ljava.lang.Object c
	private  d
	
	    del()
	    {
	        this.a = 0;
	        this.b = dek.d();
	        this.c = dek.e();
	        return;
	    }
	
	
	    private void a(int p3, Object p4)
	    {
	        if (this.a == this.b.length) {
	            Object[] v0_3;
	            if (this.a >= 4) {
	                v0_3 = (this.a >> 1);
	            } else {
	                v0_3 = 8;
	            }
	            Object[] v0_4 = (v0_3 + this.a);
	            this.b = java.util.Arrays.copyOf(this.b, v0_4);
	            this.c = java.util.Arrays.copyOf(this.c, v0_4);
	        }
	        this.b[this.a] = p3;
	        this.c[this.a] = p4;
	        this.a = (this.a + 1);
	        return;
	    }
	
	
	    private void b()
	    {
	        if (!this.d) {
	            return;
	        } else {
	            throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
	        }
	    }
	
	
	    public final dek a()
	    {
	        if (!this.d) {
	            dek v0_4;
	            this.d = 1;
	            if (this.a != 0) {
	                v0_4 = new dek(this.a, this.b, this.c);
	            } else {
	                v0_4 = dek.f();
	            }
	            return v0_4;
	        } else {
	            throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
	        }
	    }
	
	
	    public final del a(int p5, int p6)
	    {
	        if (p5 != 0) {
	            this.b();
	            this.a(den.a(p5, 0), Long.valueOf(((long) p6)));
	            return this;
	        } else {
	            throw new IllegalArgumentException("Zero is not a valid field number.");
	        }
	    }
	
	
	    public final boolean a(int p12, ddn p13)
	    {
	        int v0_8;
	        this.b();
	        int v0_0 = den.b(p12);
	        switch (den.a(p12)) {
	            case 0:
	                this.a(p12, Long.valueOf(p13.b()));
	                v0_8 = 1;
	                break;
	            case 1:
	                int v0_16 = p13.c;
	                if ((p13.b - v0_16) < 8) {
	                    p13.b(8);
	                    v0_16 = p13.c;
	                }
	                byte[] v2_10 = p13.a;
	                p13.c = (v0_16 + 8);
	                this.a(p12, Long.valueOf((((((long) v2_10[(v0_16 + 7)]) & 255) << 56) | (((((((((long) v2_10[v0_16]) & 255) | ((((long) v2_10[(v0_16 + 1)]) & 255) << 8)) | ((((long) v2_10[(v0_16 + 2)]) & 255) << 16)) | ((((long) v2_10[(v0_16 + 3)]) & 255) << 24)) | ((((long) v2_10[(v0_16 + 4)]) & 255) << 32)) | ((((long) v2_10[(v0_16 + 5)]) & 255) << 40)) | ((((long) v2_10[(v0_16 + 6)]) & 255) << 48)))));
	                v0_8 = 1;
	                break;
	            case 2:
	                int v0_14;
	                byte[] v2_5 = p13.d();
	                if ((v2_5 > (p13.b - p13.c)) || (v2_5 <= null)) {
	                    if (v2_5 != null) {
	                        v0_14 = new ddy(p13.c(v2_5));
	                    } else {
	                        v0_14 = ddl.a;
	                    }
	                } else {
	                    v0_14 = ddl.a(p13.a, p13.c, v2_5);
	                    p13.c = (v2_5 + p13.c);
	                }
	                this.a(p12, v0_14);
	                v0_8 = 1;
	                break;
	            case 3:
	                byte[] v2_4 = dek.b();
	                do {
	                    boolean v3_5 = p13.a();
	                } while((v3_5) && (v2_4.a(v3_5, p13)));
	                p13.a(den.a(v0_0, 4));
	                this.a(p12, v2_4.a());
	                v0_8 = 1;
	                break;
	            case 4:
	                v0_8 = 0;
	                break;
	            case 5:
	                int v0_1 = p13.c;
	                if ((p13.b - v0_1) < 4) {
	                    p13.b(4);
	                    v0_1 = p13.c;
	                }
	                byte[] v2_3 = p13.a;
	                p13.c = (v0_1 + 4);
	                this.a(p12, Integer.valueOf((((v2_3[(v0_1 + 3)] & 255) << 24) | (((v2_3[v0_1] & 255) | ((v2_3[(v0_1 + 1)] & 255) << 8)) | ((v2_3[(v0_1 + 2)] & 255) << 16)))));
	                v0_8 = 1;
	                break;
	            default:
	                throw ddx.f();
	        }
	        return v0_8;
	    }
	
