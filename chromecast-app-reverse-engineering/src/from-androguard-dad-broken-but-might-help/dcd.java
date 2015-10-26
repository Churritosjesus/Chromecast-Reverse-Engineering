	public Ldce a
	private java.lang.String b
	private java.lang.String c
	private java.lang.Integer d
	private java.lang.String e
	
	    public dcd()
	    {
	        this.b = 0;
	        this.a = dce.b();
	        this.c = 0;
	        this.d = 0;
	        this.e = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dcd a(byte[] p1)
	    {
	        return ((dcd) dew.a(new dcd(), p1));
	    }
	
	
	    protected final int a()
	    {
	        int v0_0 = super.a();
	        if (this.b != null) {
	            v0_0 += dep.b(1, this.b);
	        }
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v1_7 = v0_0;
	            int v0_1 = 0;
	            while (v0_1 < this.a.length) {
	                int v2_8 = this.a[v0_1];
	                if (v2_8 != 0) {
	                    v1_7 += dep.b(2, v2_8);
	                }
	                v0_1++;
	            }
	            v0_0 = v1_7;
	        }
	        if (this.c != null) {
	            v0_0 += dep.b(3, this.c);
	        }
	        if (this.d != null) {
	            v0_0 += dep.b(4, this.d.intValue());
	        }
	        if (this.e != null) {
	            v0_0 += dep.b(5, this.e);
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            dce v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.b = p5.d();
	                    break;
	                case 18:
	                    dce v0_8;
	                    dce[] v2_0 = dey.b(p5, 18);
	                    if (this.a != null) {
	                        v0_8 = this.a.length;
	                    } else {
	                        v0_8 = 0;
	                    }
	                    dce[] v2_2 = new dce[(v2_0 + v0_8)];
	                    if (v0_8 != null) {
	                        System.arraycopy(this.a, 0, v2_2, 0, v0_8);
	                    }
	                    while (v0_8 < (v2_2.length - 1)) {
	                        v2_2[v0_8] = new dce();
	                        p5.a(v2_2[v0_8]);
	                        p5.a();
	                        v0_8++;
	                    }
	                    v2_2[v0_8] = new dce();
	                    p5.a(v2_2[v0_8]);
	                    this.a = v2_2;
	                    break;
	                case 26:
	                    this.c = p5.d();
	                    break;
	                case 32:
	                    dce v0_2 = p5.e();
	                    switch (v0_2) {
	                        case 0:
	                        case 1:
	                        case 2:
	                        case 3:
	                        case 4:
	                            this.d = Integer.valueOf(v0_2);
	                            break;
	                        default:
	                    }
	                    break;
	                case 42:
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
	        if (this.b != null) {
	            p4.a(1, this.b);
	        }
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_5 = 0;
	            while (v0_5 < this.a.length) {
	                String v1_8 = this.a[v0_5];
	                if (v1_8 != null) {
	                    p4.a(2, v1_8);
	                }
	                v0_5++;
	            }
	        }
	        if (this.c != null) {
	            p4.a(3, this.c);
	        }
	        if (this.d != null) {
	            p4.a(4, this.d.intValue());
	        }
	        if (this.e != null) {
	            p4.a(5, this.e);
	        }
	        super.a(p4);
	        return;
	    }
	
