	public dbj a
	public java.lang.String b
	public dbj c
	public java.lang.String d
	public java.lang.String e
	public java.lang.String f
	public java.lang.String g
	public Ldbc h
	public Ldbd i
	public Ldbe j
	
	    public dbb()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.e = 0;
	        this.f = 0;
	        this.g = 0;
	        this.h = dbc.b();
	        this.i = dbd.b();
	        this.j = dbe.b();
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v1_0 = 0;
	        int v0_0 = super.a();
	        if (this.a != null) {
	            v0_0 += dep.b(1, this.a);
	        }
	        if (this.b != null) {
	            v0_0 += dep.b(2, this.b);
	        }
	        if (this.c != null) {
	            v0_0 += dep.b(3, this.c);
	        }
	        if (this.d != null) {
	            v0_0 += dep.b(4, this.d);
	        }
	        if (this.e != null) {
	            v0_0 += dep.b(5, this.e);
	        }
	        if (this.f != null) {
	            v0_0 += dep.b(6, this.f);
	        }
	        if ((this.i != null) && (this.i.length > 0)) {
	            int v2_21 = v0_0;
	            int v0_1 = 0;
	            while (v0_1 < this.i.length) {
	                int v3_15 = this.i[v0_1];
	                if (v3_15 != 0) {
	                    v2_21 += dep.b(7, v3_15);
	                }
	                v0_1++;
	            }
	            v0_0 = v2_21;
	        }
	        if ((this.j != null) && (this.j.length > 0)) {
	            int v2_25 = v0_0;
	            int v0_2 = 0;
	            while (v0_2 < this.j.length) {
	                int v3_12 = this.j[v0_2];
	                if (v3_12 != 0) {
	                    v2_25 += dep.b(8, v3_12);
	                }
	                v0_2++;
	            }
	            v0_0 = v2_25;
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
	        if (this.g != null) {
	            v0_0 += dep.b(10, this.g);
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            dbc v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    if (this.a == null) {
	                        this.a = new dbj();
	                    }
	                    p5.a(this.a);
	                    break;
	                case 18:
	                    this.b = p5.d();
	                    break;
	                case 26:
	                    if (this.c == null) {
	                        this.c = new dbj();
	                    }
	                    p5.a(this.c);
	                    break;
	                case 34:
	                    this.d = p5.d();
	                    break;
	                case 42:
	                    this.e = p5.d();
	                    break;
	                case 50:
	                    this.f = p5.d();
	                    break;
	                case 58:
	                    dbc v0_15;
	                    dbc[] v2_6 = dey.b(p5, 58);
	                    if (this.i != null) {
	                        v0_15 = this.i.length;
	                    } else {
	                        v0_15 = 0;
	                    }
	                    dbc[] v2_8 = new dbd[(v2_6 + v0_15)];
	                    if (v0_15 != null) {
	                        System.arraycopy(this.i, 0, v2_8, 0, v0_15);
	                    }
	                    while (v0_15 < (v2_8.length - 1)) {
	                        v2_8[v0_15] = new dbd();
	                        p5.a(v2_8[v0_15]);
	                        p5.a();
	                        v0_15++;
	                    }
	                    v2_8[v0_15] = new dbd();
	                    p5.a(v2_8[v0_15]);
	                    this.i = v2_8;
	                    break;
	                case 66:
	                    dbc v0_10;
	                    dbc[] v2_3 = dey.b(p5, 66);
	                    if (this.j != null) {
	                        v0_10 = this.j.length;
	                    } else {
	                        v0_10 = 0;
	                    }
	                    dbc[] v2_5 = new dbe[(v2_3 + v0_10)];
	                    if (v0_10 != null) {
	                        System.arraycopy(this.j, 0, v2_5, 0, v0_10);
	                    }
	                    while (v0_10 < (v2_5.length - 1)) {
	                        v2_5[v0_10] = new dbe();
	                        p5.a(v2_5[v0_10]);
	                        p5.a();
	                        v0_10++;
	                    }
	                    v2_5[v0_10] = new dbe();
	                    p5.a(v2_5[v0_10]);
	                    this.j = v2_5;
	                    break;
	                case 74:
	                    dbc v0_5;
	                    dbc[] v2_0 = dey.b(p5, 74);
	                    if (this.h != null) {
	                        v0_5 = this.h.length;
	                    } else {
	                        v0_5 = 0;
	                    }
	                    dbc[] v2_2 = new dbc[(v2_0 + v0_5)];
	                    if (v0_5 != null) {
	                        System.arraycopy(this.h, 0, v2_2, 0, v0_5);
	                    }
	                    while (v0_5 < (v2_2.length - 1)) {
	                        v2_2[v0_5] = new dbc();
	                        p5.a(v2_2[v0_5]);
	                        p5.a();
	                        v0_5++;
	                    }
	                    v2_2[v0_5] = new dbc();
	                    p5.a(v2_2[v0_5]);
	                    this.h = v2_2;
	                    break;
	                case 82:
	                    this.g = p5.d();
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
	        if (this.a != null) {
	            p5.a(1, this.a);
	        }
	        if (this.b != null) {
	            p5.a(2, this.b);
	        }
	        if (this.c != null) {
	            p5.a(3, this.c);
	        }
	        if (this.d != null) {
	            p5.a(4, this.d);
	        }
	        if (this.e != null) {
	            p5.a(5, this.e);
	        }
	        if (this.f != null) {
	            p5.a(6, this.f);
	        }
	        if ((this.i != null) && (this.i.length > 0)) {
	            int v0_15 = 0;
	            while (v0_15 < this.i.length) {
	                int v2_14 = this.i[v0_15];
	                if (v2_14 != 0) {
	                    p5.a(7, v2_14);
	                }
	                v0_15++;
	            }
	        }
	        if ((this.j != null) && (this.j.length > 0)) {
	            int v0_19 = 0;
	            while (v0_19 < this.j.length) {
	                int v2_12 = this.j[v0_19];
	                if (v2_12 != 0) {
	                    p5.a(8, v2_12);
	                }
	                v0_19++;
	            }
	        }
	        if ((this.h != null) && (this.h.length > 0)) {
	            while (v1_0 < this.h.length) {
	                int v0_28 = this.h[v1_0];
	                if (v0_28 != 0) {
	                    p5.a(9, v0_28);
	                }
	                v1_0++;
	            }
	        }
	        if (this.g != null) {
	            p5.a(10, this.g);
	        }
	        super.a(p5);
	        return;
	    }
	
