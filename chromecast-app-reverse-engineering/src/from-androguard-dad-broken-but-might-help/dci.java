	private static bridge Ldci d
	public java.lang.Boolean a
	public Ldca b
	public java.lang.String c
	private java.lang.Integer e
	private java.lang.Long f
	private Ldby g
	private Ldcb h
	private java.lang.Boolean i
	private java.lang.Integer j
	
	    public dci()
	    {
	        this.e = 0;
	        this.f = 0;
	        this.a = 0;
	        this.g = dby.b();
	        this.b = dca.b();
	        this.h = dcb.b();
	        this.c = 0;
	        this.i = 0;
	        this.j = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dci[] b()
	    {
	        if (dci.d == null) {
	            if (dci.d == null) {
	                dci[] v0_3 = new dci[0];
	                dci.d = v0_3;
	            }
	        }
	        return dci.d;
	    }
	
	
	    protected final int a()
	    {
	        int v1_0 = 0;
	        int v0_0 = super.a();
	        if (this.e != null) {
	            v0_0 += dep.b(1, this.e.intValue());
	        }
	        if (this.a != null) {
	            this.a.booleanValue();
	            v0_0 += (dep.b(2) + 1);
	        }
	        if ((this.g != null) && (this.g.length > 0)) {
	            int v2_10 = v0_0;
	            int v0_1 = 0;
	            while (v0_1 < this.g.length) {
	                int v3_15 = this.g[v0_1];
	                if (v3_15 != 0) {
	                    v2_10 += dep.b(3, v3_15);
	                }
	                v0_1++;
	            }
	            v0_0 = v2_10;
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v2_14 = v0_0;
	            int v0_2 = 0;
	            while (v0_2 < this.b.length) {
	                int v3_12 = this.b[v0_2];
	                if (v3_12 != 0) {
	                    v2_14 += dep.b(4, v3_12);
	                }
	                v0_2++;
	            }
	            v0_0 = v2_14;
	        }
	        if (this.f != null) {
	            v0_0 += dep.b(5, this.f.longValue());
	        }
	        if (this.c != null) {
	            v0_0 += dep.b(7, this.c);
	        }
	        if (this.i != null) {
	            this.i.booleanValue();
	            v0_0 += (dep.b(8) + 1);
	        }
	        if ((this.h != null) && (this.h.length > 0)) {
	            while (v1_0 < this.h.length) {
	                int v2_33 = this.h[v1_0];
	                if (v2_33 != 0) {
	                    v0_0 += dep.b(9, v2_33);
	                }
	                v1_0++;
	            }
	        }
	        if (this.j != null) {
	            v0_0 += dep.b(10, this.j.intValue());
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            dcb v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.e = Integer.valueOf(p5.e());
	                    break;
	                case 16:
	                    this.a = Boolean.valueOf(p5.c());
	                    break;
	                case 26:
	                    dcb v0_20;
	                    dcb[] v2_7 = dey.b(p5, 26);
	                    if (this.g != null) {
	                        v0_20 = this.g.length;
	                    } else {
	                        v0_20 = 0;
	                    }
	                    dcb[] v2_9 = new dby[(v2_7 + v0_20)];
	                    if (v0_20 != null) {
	                        System.arraycopy(this.g, 0, v2_9, 0, v0_20);
	                    }
	                    while (v0_20 < (v2_9.length - 1)) {
	                        v2_9[v0_20] = new dby();
	                        p5.a(v2_9[v0_20]);
	                        p5.a();
	                        v0_20++;
	                    }
	                    v2_9[v0_20] = new dby();
	                    p5.a(v2_9[v0_20]);
	                    this.g = v2_9;
	                    break;
	                case 34:
	                    dcb v0_15;
	                    dcb[] v2_4 = dey.b(p5, 34);
	                    if (this.b != null) {
	                        v0_15 = this.b.length;
	                    } else {
	                        v0_15 = 0;
	                    }
	                    dcb[] v2_6 = new dca[(v2_4 + v0_15)];
	                    if (v0_15 != null) {
	                        System.arraycopy(this.b, 0, v2_6, 0, v0_15);
	                    }
	                    while (v0_15 < (v2_6.length - 1)) {
	                        v2_6[v0_15] = new dca();
	                        p5.a(v2_6[v0_15]);
	                        p5.a();
	                        v0_15++;
	                    }
	                    v2_6[v0_15] = new dca();
	                    p5.a(v2_6[v0_15]);
	                    this.b = v2_6;
	                    break;
	                case 40:
	                    this.f = Long.valueOf(p5.b());
	                    break;
	                case 58:
	                    this.c = p5.d();
	                    break;
	                case 64:
	                    this.i = Boolean.valueOf(p5.c());
	                    break;
	                case 74:
	                    dcb v0_6;
	                    dcb[] v2_0 = dey.b(p5, 74);
	                    if (this.h != null) {
	                        v0_6 = this.h.length;
	                    } else {
	                        v0_6 = 0;
	                    }
	                    dcb[] v2_2 = new dcb[(v2_0 + v0_6)];
	                    if (v0_6 != null) {
	                        System.arraycopy(this.h, 0, v2_2, 0, v0_6);
	                    }
	                    while (v0_6 < (v2_2.length - 1)) {
	                        v2_2[v0_6] = new dcb();
	                        p5.a(v2_2[v0_6]);
	                        p5.a();
	                        v0_6++;
	                    }
	                    v2_2[v0_6] = new dcb();
	                    p5.a(v2_2[v0_6]);
	                    this.h = v2_2;
	                    break;
	                case 80:
	                    dcb v0_1 = p5.e();
	                    switch (v0_1) {
	                        case 0:
	                        case 1:
	                        case 2:
	                            this.j = Integer.valueOf(v0_1);
	                            break;
	                        default:
	                    }
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
	        int v1_0 = 0;
	        if (this.e != null) {
	            p5.a(1, this.e.intValue());
	        }
	        if (this.a != null) {
	            p5.a(2, this.a.booleanValue());
	        }
	        if ((this.g != null) && (this.g.length > 0)) {
	            dcb v0_7 = 0;
	            while (v0_7 < this.g.length) {
	                int v2_17 = this.g[v0_7];
	                if (v2_17 != 0) {
	                    p5.a(3, v2_17);
	                }
	                v0_7++;
	            }
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            dcb v0_11 = 0;
	            while (v0_11 < this.b.length) {
	                int v2_15 = this.b[v0_11];
	                if (v2_15 != 0) {
	                    p5.a(4, v2_15);
	                }
	                v0_11++;
	            }
	        }
	        if (this.f != null) {
	            p5.a(5, this.f.longValue());
	        }
	        if (this.c != null) {
	            p5.a(7, this.c);
	        }
	        if (this.i != null) {
	            p5.a(8, this.i.booleanValue());
	        }
	        if ((this.h != null) && (this.h.length > 0)) {
	            while (v1_0 < this.h.length) {
	                dcb v0_26 = this.h[v1_0];
	                if (v0_26 != null) {
	                    p5.a(9, v0_26);
	                }
	                v1_0++;
	            }
	        }
	        if (this.j != null) {
	            p5.a(10, this.j.intValue());
	        }
	        super.a(p5);
	        return;
	    }
	
