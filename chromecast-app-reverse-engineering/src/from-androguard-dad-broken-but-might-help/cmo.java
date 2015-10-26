	static final cmp a
	 I b
	 Lcmp c
	  d
	private  e
	
	    static cmo()
	    {
	        cmo.a = new cmp();
	        return;
	    }
	
	
	    public cmo()
	    {
	        this(10);
	        return;
	    }
	
	
	    private cmo(int p4)
	    {
	        this.e = 0;
	        cmp[] v0_0 = this.b(p4);
	        int[] v1 = new int[v0_0];
	        this.b = v1;
	        cmp[] v0_1 = new cmp[v0_0];
	        this.c = v0_1;
	        this.d = 0;
	        return;
	    }
	
	
	    public final cmp a(int p4)
	    {
	        cmp v0_1;
	        cmp v0_0 = this.c(p4);
	        if ((v0_0 >= null) && (this.c[v0_0] != cmo.a)) {
	            v0_1 = this.c[v0_0];
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean a()
	    {
	        int v0_1;
	        if (this.d != 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    int b(int p5)
	    {
	        int v0_0 = (p5 << 2);
	        int v1 = 4;
	        while (v1 < 32) {
	            if (v0_0 > ((1 << v1) - 12)) {
	                v1++;
	            } else {
	                v0_0 = ((1 << v1) - 12);
	                break;
	            }
	        }
	        return (v0_0 / 4);
	    }
	
	
	    public final cmo b()
	    {
	        int v0 = 0;
	        int v1 = this.d;
	        cmo v2_1 = new cmo(v1);
	        System.arraycopy(this.b, 0, v2_1.b, 0, v1);
	        while (v0 < v1) {
	            if (this.c[v0] != null) {
	                v2_1.c[v0] = this.c[v0].b();
	            }
	            v0++;
	        }
	        v2_1.d = v1;
	        return v2_1;
	    }
	
	
	    int c(int p5)
	    {
	        int v2 = 0;
	        int v1_1 = (this.d - 1);
	        while (v2 <= v1_1) {
	            int v0_2 = ((v2 + v1_1) >> 1);
	            int v3_1 = this.b[v0_2];
	            if (v3_1 >= p5) {
	                if (v3_1 > p5) {
	                    v1_1 = (v0_2 - 1);
	                }
	            } else {
	                v2 = (v0_2 + 1);
	            }
	            return v0_2;
	        }
	        v0_2 = (v2 ^ -1);
	        return v0_2;
	    }
	
	
	    public final synthetic Object clone()
	    {
	        return this.b();
	    }
	
	
	    public final boolean equals(Object p9)
	    {
	        int v0 = 1;
	        if (p9 != this) {
	            if ((p9 instanceof cmo)) {
	                if (this.d == ((cmo) p9).d) {
	                    int v2_2 = 0;
	                    while (v2_2 < this.d) {
	                        if (this.b[v2_2] == ((cmo) p9).b[v2_2]) {
	                            v2_2++;
	                        } else {
	                            int v2_3 = 0;
	                        }
	                        if (v2_3 != 0) {
	                            int v2_4 = 0;
	                            while (v2_4 < this.d) {
	                                if (this.c[v2_4].equals(((cmo) p9).c[v2_4])) {
	                                    v2_4++;
	                                } else {
	                                    int v2_5 = 0;
	                                }
	                                if (v2_5 != 0) {
	                                    return v0;
	                                }
	                            }
	                            v2_5 = 1;
	                        }
	                        v0 = 0;
	                    }
	                    v2_3 = 1;
	                } else {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v1_0 = 17;
	        int v0 = 0;
	        while (v0 < this.d) {
	            v1_0 = ((((v1_0 * 31) + this.b[v0]) * 31) + this.c[v0].hashCode());
	            v0++;
	        }
	        return v1_0;
	    }
	
