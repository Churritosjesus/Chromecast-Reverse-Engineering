	public java.lang.String a
	public java.lang.String b
	public java.lang.String c
	public java.lang.String d
	public Ldaw e
	
	    public dav()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.e = daw.b();
	        this.t = -1;
	        return;
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
	        if ((this.e != null) && (this.e.length > 0)) {
	            int v1_16 = v0_0;
	            int v0_1 = 0;
	            while (v0_1 < this.e.length) {
	                int v2_7 = this.e[v0_1];
	                if (v2_7 != 0) {
	                    v1_16 += dep.b(5, v2_7);
	                }
	                v0_1++;
	            }
	            v0_0 = v1_16;
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            daw v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p5.d();
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
	                    daw v0_4;
	                    daw[] v2_0 = dey.b(p5, 42);
	                    if (this.e != null) {
	                        v0_4 = this.e.length;
	                    } else {
	                        v0_4 = 0;
	                    }
	                    daw[] v2_2 = new daw[(v2_0 + v0_4)];
	                    if (v0_4 != null) {
	                        System.arraycopy(this.e, 0, v2_2, 0, v0_4);
	                    }
	                    while (v0_4 < (v2_2.length - 1)) {
	                        v2_2[v0_4] = new daw();
	                        p5.a(v2_2[v0_4]);
	                        p5.a();
	                        v0_4++;
	                    }
	                    v2_2[v0_4] = new daw();
	                    p5.a(v2_2[v0_4]);
	                    this.e = v2_2;
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
	        if ((this.e != null) && (this.e.length > 0)) {
	            int v0_11 = 0;
	            while (v0_11 < this.e.length) {
	                daw v1_7 = this.e[v0_11];
	                if (v1_7 != null) {
	                    p4.a(5, v1_7);
	                }
	                v0_11++;
	            }
	        }
	        super.a(p4);
	        return;
	    }
	
