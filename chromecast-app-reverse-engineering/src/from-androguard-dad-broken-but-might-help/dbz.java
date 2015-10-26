	public Ldbq a
	public java.lang.String b
	private java.lang.Integer c
	private java.lang.String d
	private java.lang.Boolean e
	
	    public dbz()
	    {
	        this.c = 0;
	        this.a = dbq.b();
	        this.b = 0;
	        this.d = 0;
	        this.e = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0_0 = super.a();
	        if (this.c != null) {
	            v0_0 += dep.b(1, this.c.intValue());
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
	        if (this.b != null) {
	            v0_0 += dep.b(3, this.b);
	        }
	        if (this.d != null) {
	            v0_0 += dep.b(4, this.d);
	        }
	        if (this.e != null) {
	            this.e.booleanValue();
	            v0_0 += (dep.b(5) + 1);
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            dbq v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.c = Integer.valueOf(p5.e());
	                    break;
	                case 18:
	                    dbq v0_8;
	                    dbq[] v2_0 = dey.b(p5, 18);
	                    if (this.a != null) {
	                        v0_8 = this.a.length;
	                    } else {
	                        v0_8 = 0;
	                    }
	                    dbq[] v2_2 = new dbq[(v2_0 + v0_8)];
	                    if (v0_8 != null) {
	                        System.arraycopy(this.a, 0, v2_2, 0, v0_8);
	                    }
	                    while (v0_8 < (v2_2.length - 1)) {
	                        v2_2[v0_8] = new dbq();
	                        p5.a(v2_2[v0_8]);
	                        p5.a();
	                        v0_8++;
	                    }
	                    v2_2[v0_8] = new dbq();
	                    p5.a(v2_2[v0_8]);
	                    this.a = v2_2;
	                    break;
	                case 26:
	                    this.b = p5.d();
	                    break;
	                case 34:
	                    this.d = p5.d();
	                    break;
	                case 40:
	                    this.e = Boolean.valueOf(p5.c());
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
	        if (this.c != null) {
	            p4.a(1, this.c.intValue());
	        }
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_5 = 0;
	            while (v0_5 < this.a.length) {
	                boolean v1_9 = this.a[v0_5];
	                if (v1_9) {
	                    p4.a(2, v1_9);
	                }
	                v0_5++;
	            }
	        }
	        if (this.b != null) {
	            p4.a(3, this.b);
	        }
	        if (this.d != null) {
	            p4.a(4, this.d);
	        }
	        if (this.e != null) {
	            p4.a(5, this.e.booleanValue());
	        }
	        super.a(p4);
	        return;
	    }
	
