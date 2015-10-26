	public java.lang.Boolean a
	public java.lang.Boolean b
	public java.lang.Boolean c
	public Ljava.lang.String d
	public java.lang.String e
	public Ldba f
	private java.lang.Boolean g
	
	    public daz()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.g = 0;
	        this.d = dey.b;
	        this.e = 0;
	        this.f = dba.b();
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v1_0 = 0;
	        int v0_0 = super.a();
	        if (this.a != null) {
	            this.a.booleanValue();
	            v0_0 += (dep.b(1) + 1);
	        }
	        if (this.b != null) {
	            this.b.booleanValue();
	            v0_0 += (dep.b(2) + 1);
	        }
	        if ((this.f != null) && (this.f.length > 0)) {
	            int v2_11 = v0_0;
	            int v0_1 = 0;
	            while (v0_1 < this.f.length) {
	                int v3_9 = this.f[v0_1];
	                if (v3_9 != 0) {
	                    v2_11 += dep.b(3, v3_9);
	                }
	                v0_1++;
	            }
	            v0_0 = v2_11;
	        }
	        if (this.c != null) {
	            this.c.booleanValue();
	            v0_0 += (dep.b(4) + 1);
	        }
	        if (this.g != null) {
	            this.g.booleanValue();
	            v0_0 += (dep.b(5) + 1);
	        }
	        if (this.e != null) {
	            v0_0 += dep.b(6, this.e);
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            int v2_26 = 0;
	            int v3_7 = 0;
	            while (v1_0 < this.d.length) {
	                int v4_3 = this.d[v1_0];
	                if (v4_3 != 0) {
	                    v3_7++;
	                    v2_26 += dep.a(v4_3);
	                }
	                v1_0++;
	            }
	            v0_0 = ((v0_0 + v2_26) + (v3_7 * 1));
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            int v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.a = Boolean.valueOf(p5.c());
	                    break;
	                case 16:
	                    this.b = Boolean.valueOf(p5.c());
	                    break;
	                case 26:
	                    int v0_13;
	                    String[] v2_3 = dey.b(p5, 26);
	                    if (this.f != null) {
	                        v0_13 = this.f.length;
	                    } else {
	                        v0_13 = 0;
	                    }
	                    String[] v2_5 = new dba[(v2_3 + v0_13)];
	                    if (v0_13 != 0) {
	                        System.arraycopy(this.f, 0, v2_5, 0, v0_13);
	                    }
	                    while (v0_13 < (v2_5.length - 1)) {
	                        v2_5[v0_13] = new dba();
	                        p5.a(v2_5[v0_13]);
	                        p5.a();
	                        v0_13++;
	                    }
	                    v2_5[v0_13] = new dba();
	                    p5.a(v2_5[v0_13]);
	                    this.f = v2_5;
	                    break;
	                case 32:
	                    this.c = Boolean.valueOf(p5.c());
	                    break;
	                case 40:
	                    this.g = Boolean.valueOf(p5.c());
	                    break;
	                case 50:
	                    this.e = p5.d();
	                    break;
	                case 58:
	                    int v0_4;
	                    String[] v2_0 = dey.b(p5, 58);
	                    if (this.d != null) {
	                        v0_4 = this.d.length;
	                    } else {
	                        v0_4 = 0;
	                    }
	                    String[] v2_2 = new String[(v2_0 + v0_4)];
	                    if (v0_4 != 0) {
	                        System.arraycopy(this.d, 0, v2_2, 0, v0_4);
	                    }
	                    while (v0_4 < (v2_2.length - 1)) {
	                        v2_2[v0_4] = p5.d();
	                        p5.a();
	                        v0_4++;
	                    }
	                    v2_2[v0_4] = p5.d();
	                    this.d = v2_2;
	                    break;
	                default:
	                    if (dey.a(p5, v0_0)) {
	                    } else {
	                    }
	            }
	            return this;
	        }
	    }
	
	
	    public final void a(dep p5)
	    {
	        int v1 = 0;
	        if (this.a != null) {
	            p5.a(1, this.a.booleanValue());
	        }
	        if (this.b != null) {
	            p5.a(2, this.b.booleanValue());
	        }
	        if ((this.f != null) && (this.f.length > 0)) {
	            String v0_7 = 0;
	            while (v0_7 < this.f.length) {
	                int v2_13 = this.f[v0_7];
	                if (v2_13 != 0) {
	                    p5.a(3, v2_13);
	                }
	                v0_7++;
	            }
	        }
	        if (this.c != null) {
	            p5.a(4, this.c.booleanValue());
	        }
	        if (this.g != null) {
	            p5.a(5, this.g.booleanValue());
	        }
	        if (this.e != null) {
	            p5.a(6, this.e);
	        }
	        if ((this.d != null) && (this.d.length > 0)) {
	            while (v1 < this.d.length) {
	                String v0_20 = this.d[v1];
	                if (v0_20 != null) {
	                    p5.a(7, v0_20);
	                }
	                v1++;
	            }
	        }
	        super.a(p5);
	        return;
	    }
	
