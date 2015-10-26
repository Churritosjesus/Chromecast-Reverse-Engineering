	public dbj a
	public java.lang.String b
	public java.lang.String c
	public java.lang.Boolean d
	public java.lang.String e
	public java.lang.String f
	public java.lang.String g
	public Ldar h
	
	    public daq()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.e = 0;
	        this.f = 0;
	        this.g = 0;
	        this.h = dar.b();
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
	        if (this.e != null) {
	            v0_0 += dep.b(4, this.e);
	        }
	        if (this.f != null) {
	            v0_0 += dep.b(5, this.f);
	        }
	        if ((this.h != null) && (this.h.length > 0)) {
	            int v1_19 = v0_0;
	            int v0_1 = 0;
	            while (v0_1 < this.h.length) {
	                int v2_10 = this.h[v0_1];
	                if (v2_10 != 0) {
	                    v1_19 += dep.b(6, v2_10);
	                }
	                v0_1++;
	            }
	            v0_0 = v1_19;
	        }
	        if (this.d != null) {
	            this.d.booleanValue();
	            v0_0 += (dep.b(7) + 1);
	        }
	        if (this.g != null) {
	            v0_0 += dep.b(8, this.g);
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            dar v0_0 = p5.a();
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
	                    this.e = p5.d();
	                    break;
	                case 42:
	                    this.f = p5.d();
	                    break;
	                case 50:
	                    dar v0_7;
	                    dar[] v2_0 = dey.b(p5, 50);
	                    if (this.h != null) {
	                        v0_7 = this.h.length;
	                    } else {
	                        v0_7 = 0;
	                    }
	                    dar[] v2_2 = new dar[(v2_0 + v0_7)];
	                    if (v0_7 != null) {
	                        System.arraycopy(this.h, 0, v2_2, 0, v0_7);
	                    }
	                    while (v0_7 < (v2_2.length - 1)) {
	                        v2_2[v0_7] = new dar();
	                        p5.a(v2_2[v0_7]);
	                        p5.a();
	                        v0_7++;
	                    }
	                    v2_2[v0_7] = new dar();
	                    p5.a(v2_2[v0_7]);
	                    this.h = v2_2;
	                    break;
	                case 56:
	                    this.d = Boolean.valueOf(p5.c());
	                    break;
	                case 66:
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
	        if (this.e != null) {
	            p4.a(4, this.e);
	        }
	        if (this.f != null) {
	            p4.a(5, this.f);
	        }
	        if ((this.h != null) && (this.h.length > 0)) {
	            int v0_13 = 0;
	            while (v0_13 < this.h.length) {
	                dar v1_11 = this.h[v0_13];
	                if (v1_11 != null) {
	                    p4.a(6, v1_11);
	                }
	                v0_13++;
	            }
	        }
	        if (this.d != null) {
	            p4.a(7, this.d.booleanValue());
	        }
	        if (this.g != null) {
	            p4.a(8, this.g);
	        }
	        super.a(p4);
	        return;
	    }
	
