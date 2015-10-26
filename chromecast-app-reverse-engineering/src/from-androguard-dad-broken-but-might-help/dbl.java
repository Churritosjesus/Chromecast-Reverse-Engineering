	public dax a
	public Ljava.lang.String b
	
	    public dbl()
	    {
	        this.a = 0;
	        this.b = dey.b;
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
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v2_6 = 0;
	            int v3_1 = 0;
	            while (v1_0 < this.b.length) {
	                int v4_3 = this.b[v1_0];
	                if (v4_3 != 0) {
	                    v3_1++;
	                    v2_6 += dep.a(v4_3);
	                }
	                v1_0++;
	            }
	            v0_0 = ((v0_0 + v2_6) + (v3_1 * 1));
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
	                case 10:
	                    if (this.a == null) {
	                        this.a = new dax();
	                    }
	                    p5.a(this.a);
	                    break;
	                case 18:
	                    int v0_4;
	                    String[] v2_0 = dey.b(p5, 18);
	                    if (this.b != null) {
	                        v0_4 = this.b.length;
	                    } else {
	                        v0_4 = 0;
	                    }
	                    String[] v2_2 = new String[(v2_0 + v0_4)];
	                    if (v0_4 != 0) {
	                        System.arraycopy(this.b, 0, v2_2, 0, v0_4);
	                    }
	                    while (v0_4 < (v2_2.length - 1)) {
	                        v2_2[v0_4] = p5.d();
	                        p5.a();
	                        v0_4++;
	                    }
	                    v2_2[v0_4] = p5.d();
	                    this.b = v2_2;
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
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v0_5 = 0;
	            while (v0_5 < this.b.length) {
	                String v1_4 = this.b[v0_5];
	                if (v1_4 != null) {
	                    p4.a(2, v1_4);
	                }
	                v0_5++;
	            }
	        }
	        super.a(p4);
	        return;
	    }
	
