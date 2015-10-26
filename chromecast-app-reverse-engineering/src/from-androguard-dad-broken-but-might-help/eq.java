	public static final java.lang.Object a
	public  b
	public I c
	public Ljava.lang.Object d
	public  e
	
	    static eq()
	    {
	        eq.a = new Object();
	        return;
	    }
	
	
	    public eq()
	    {
	        this(10);
	        return;
	    }
	
	
	    private eq(int p4)
	    {
	        this.b = 0;
	        Object[] v0_1 = ef.a(10);
	        int[] v1 = new int[v0_1];
	        this.c = v1;
	        Object[] v0_2 = new Object[v0_1];
	        this.d = v0_2;
	        this.e = 0;
	        return;
	    }
	
	
	    private eq c()
	    {
	        try {
	            int v0_1 = ((eq) super.clone());
	            try {
	                v0_1.c = ((int[]) this.c.clone());
	                v0_1.d = ((Object[]) this.d.clone());
	            } catch (CloneNotSupportedException v1) {
	            }
	            return v0_1;
	        } catch (int v0) {
	            v0_1 = 0;
	            return v0_1;
	        }
	    }
	
	
	    private void d()
	    {
	        int v3 = this.e;
	        int[] v4 = this.c;
	        Object[] v5 = this.d;
	        int v1 = 0;
	        int v0 = 0;
	        while (v1 < v3) {
	            int v6_0 = v5[v1];
	            if (v6_0 != eq.a) {
	                if (v1 != v0) {
	                    v4[v0] = v4[v1];
	                    v5[v0] = v6_0;
	                    v5[v1] = 0;
	                }
	                v0++;
	            }
	            v1++;
	        }
	        this.b = 0;
	        this.e = v0;
	        return;
	    }
	
	
	    public final int a()
	    {
	        if (this.b) {
	            this.d();
	        }
	        return this.e;
	    }
	
	
	    public final Object a(int p4)
	    {
	        Object v0_2;
	        Object v0_1 = ef.a(this.c, this.e, p4);
	        if ((v0_1 >= null) && (this.d[v0_1] != eq.a)) {
	            v0_2 = this.d[v0_1];
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final void a(int p7, Object p8)
	    {
	        int v0_1 = ef.a(this.c, this.e, p7);
	        if (v0_1 < 0) {
	            int v0_2 = (v0_1 ^ -1);
	            if ((v0_2 >= this.e) || (this.d[v0_2] != eq.a)) {
	                if ((this.b) && (this.e >= this.c.length)) {
	                    this.d();
	                    v0_2 = (ef.a(this.c, this.e, p7) ^ -1);
	                }
	                if (this.e >= this.c.length) {
	                    Object[] v1_10 = ef.a((this.e + 1));
	                    Object[] v2_5 = new int[v1_10];
	                    Object[] v1_11 = new Object[v1_10];
	                    System.arraycopy(this.c, 0, v2_5, 0, this.c.length);
	                    System.arraycopy(this.d, 0, v1_11, 0, this.d.length);
	                    this.c = v2_5;
	                    this.d = v1_11;
	                }
	                if ((this.e - v0_2) != 0) {
	                    System.arraycopy(this.c, v0_2, this.c, (v0_2 + 1), (this.e - v0_2));
	                    System.arraycopy(this.d, v0_2, this.d, (v0_2 + 1), (this.e - v0_2));
	                }
	                this.c[v0_2] = p7;
	                this.d[v0_2] = p8;
	                this.e = (this.e + 1);
	            } else {
	                this.c[v0_2] = p7;
	                this.d[v0_2] = p8;
	            }
	        } else {
	            this.d[v0_1] = p8;
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        int v2 = this.e;
	        int v0 = 0;
	        while (v0 < v2) {
	            this.d[v0] = 0;
	            v0++;
	        }
	        this.e = 0;
	        this.b = 0;
	        return;
	    }
	
	
	    public final void b(int p3)
	    {
	        if (this.d[p3] != eq.a) {
	            this.d[p3] = eq.a;
	            this.b = 1;
	        }
	        return;
	    }
	
	
	    public final int c(int p2)
	    {
	        if (this.b) {
	            this.d();
	        }
	        return this.c[p2];
	    }
	
	
	    public final synthetic Object clone()
	    {
	        return this.c();
	    }
	
	
	    public final Object d(int p2)
	    {
	        if (this.b) {
	            this.d();
	        }
	        return this.d[p2];
	    }
	
	
	    public final int e(int p3)
	    {
	        if (this.b) {
	            this.d();
	        }
	        return ef.a(this.c, this.e, p3);
	    }
	
	
	    public final String toString()
	    {
	        int v0_6;
	        if (this.a() > 0) {
	            StringBuilder v1_1 = new StringBuilder((this.e * 28));
	            v1_1.append(123);
	            int v0_4 = 0;
	            while (v0_4 < this.e) {
	                if (v0_4 > 0) {
	                    v1_1.append(", ");
	                }
	                v1_1.append(this.c(v0_4));
	                v1_1.append(61);
	                String v2_4 = this.d(v0_4);
	                if (v2_4 == this) {
	                    v1_1.append("(this Map)");
	                } else {
	                    v1_1.append(v2_4);
	                }
	                v0_4++;
	            }
	            v1_1.append(125);
	            v0_6 = v1_1.toString();
	        } else {
	            v0_6 = "{}";
	        }
	        return v0_6;
	    }
	
