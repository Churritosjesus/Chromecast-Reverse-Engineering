	public java.lang.Integer a
	public Ljava.lang.String b
	public  c
	public java.lang.String d
	private java.lang.String e
	
	    public dax()
	    {
	        this.a = 0;
	        this.b = dey.b;
	        this.c = -2147483648;
	        this.d = 0;
	        this.e = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v1_0 = 0;
	        int v0_0 = super.a();
	        if (this.a != null) {
	            v0_0 += dep.b(1, this.a.intValue());
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v2_6 = 0;
	            int v3_2 = 0;
	            while (v1_0 < this.b.length) {
	                int v4_3 = this.b[v1_0];
	                if (v4_3 != 0) {
	                    v3_2++;
	                    v2_6 += dep.a(v4_3);
	                }
	                v1_0++;
	            }
	            v0_0 = ((v0_0 + v2_6) + (v3_2 * 1));
	        }
	        if (this.c != -2147483648) {
	            v0_0 += dep.b(3, this.c);
	        }
	        if (this.d != null) {
	            v0_0 += dep.b(4, this.d);
	        }
	        if (this.e != null) {
	            v0_0 += dep.b(5, this.e);
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
	                    this.a = Integer.valueOf(p5.e());
	                    break;
	                case 18:
	                    int v0_7;
	                    String[] v2_0 = dey.b(p5, 18);
	                    if (this.b != null) {
	                        v0_7 = this.b.length;
	                    } else {
	                        v0_7 = 0;
	                    }
	                    String[] v2_2 = new String[(v2_0 + v0_7)];
	                    if (v0_7 != 0) {
	                        System.arraycopy(this.b, 0, v2_2, 0, v0_7);
	                    }
	                    while (v0_7 < (v2_2.length - 1)) {
	                        v2_2[v0_7] = p5.d();
	                        p5.a();
	                        v0_7++;
	                    }
	                    v2_2[v0_7] = p5.d();
	                    this.b = v2_2;
	                    break;
	                case 24:
	                    int v0_3 = p5.e();
	                    switch (v0_3) {
	                        case 0:
	                        case 1:
	                        case 2:
	                        case 4:
	                            this.c = v0_3;
	                            break;
	                        case 3:
	                        default:
	                            break;
	                    }
	                    break;
	                case 34:
	                    this.d = p5.d();
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
	        if (this.a != null) {
	            p4.a(1, this.a.intValue());
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v0_5 = 0;
	            while (v0_5 < this.b.length) {
	                String v1_9 = this.b[v0_5];
	                if (v1_9 != null) {
	                    p4.a(2, v1_9);
	                }
	                v0_5++;
	            }
	        }
	        if (this.c != -2147483648) {
	            p4.a(3, this.c);
	        }
	        if (this.d != null) {
	            p4.a(4, this.d);
	        }
	        if (this.e != null) {
	            p4.a(5, this.e);
	        }
	        super.a(p4);
	        return;
	    }
	
