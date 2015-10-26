	private static bridge Ldbf h
	public dbj a
	public java.lang.String b
	public java.lang.String c
	public java.lang.String d
	public java.lang.String e
	public  f
	public Ldbg g
	
	    public dbf()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.e = 0;
	        this.f = -2147483648;
	        this.g = dbg.b();
	        this.t = -1;
	        return;
	    }
	
	
	    public static dbf[] b()
	    {
	        if (dbf.h == null) {
	            if (dbf.h == null) {
	                dbf[] v0_3 = new dbf[0];
	                dbf.h = v0_3;
	            }
	        }
	        return dbf.h;
	    }
	
	
	    protected final int a()
	    {
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
	        if ((this.g != null) && (this.g.length > 0)) {
	            int v1_16 = v0_0;
	            int v0_1 = 0;
	            while (v0_1 < this.g.length) {
	                int v2_10 = this.g[v0_1];
	                if (v2_10 != 0) {
	                    v1_16 += dep.b(5, v2_10);
	                }
	                v0_1++;
	            }
	            v0_0 = v1_16;
	        }
	        if (this.f != -2147483648) {
	            v0_0 += dep.b(6, this.f);
	        }
	        if (this.e != null) {
	            v0_0 += dep.b(7, this.e);
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            dbg v0_0 = p5.a();
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
	                    this.c = p5.d();
	                    break;
	                case 34:
	                    this.d = p5.d();
	                    break;
	                case 42:
	                    dbg v0_6;
	                    dbg[] v2_0 = dey.b(p5, 42);
	                    if (this.g != null) {
	                        v0_6 = this.g.length;
	                    } else {
	                        v0_6 = 0;
	                    }
	                    dbg[] v2_2 = new dbg[(v2_0 + v0_6)];
	                    if (v0_6 != null) {
	                        System.arraycopy(this.g, 0, v2_2, 0, v0_6);
	                    }
	                    while (v0_6 < (v2_2.length - 1)) {
	                        v2_2[v0_6] = new dbg();
	                        p5.a(v2_2[v0_6]);
	                        p5.a();
	                        v0_6++;
	                    }
	                    v2_2[v0_6] = new dbg();
	                    p5.a(v2_2[v0_6]);
	                    this.g = v2_2;
	                    break;
	                case 48:
	                    dbg v0_2 = p5.e();
	                    switch (v0_2) {
	                        case 0:
	                        case 1:
	                        case 2:
	                            this.f = v0_2;
	                            break;
	                        default:
	                    }
	                    break;
	                case 58:
	                    this.e = p5.d();
	                    break;
	                default:
	                    if (dey.a(p5, v0_0)) {
	                    } else {
	                    }
	            }
	            return this;
	        }
	    }
	
	
	    public final void a(dep p4)
	    {
	        if (this.a != null) {
	            p4.a(1, this.a);
	        }
	        if (this.b != null) {
	            p4.a(2, this.b);
	        }
	        if (this.c != null) {
	            p4.a(3, this.c);
	        }
	        if (this.d != null) {
	            p4.a(4, this.d);
	        }
	        if ((this.g != null) && (this.g.length > 0)) {
	            int v0_11 = 0;
	            while (v0_11 < this.g.length) {
	                dbg v1_10 = this.g[v0_11];
	                if (v1_10 != null) {
	                    p4.a(5, v1_10);
	                }
	                v0_11++;
	            }
	        }
	        if (this.f != -2147483648) {
	            p4.a(6, this.f);
	        }
	        if (this.e != null) {
	            p4.a(7, this.e);
	        }
	        super.a(p4);
	        return;
	    }
	
