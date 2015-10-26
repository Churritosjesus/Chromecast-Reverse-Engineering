	public java.lang.Integer a
	public java.lang.String b
	public Ldbt c
	private java.lang.String d
	
	    public dcg()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.d = 0;
	        this.c = dbt.b();
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0_0 = super.a();
	        if (this.a != null) {
	            v0_0 += dep.b(1, this.a.intValue());
	        }
	        if (this.b != null) {
	            v0_0 += dep.b(2, this.b);
	        }
	        if (this.d != null) {
	            v0_0 += dep.b(3, this.d);
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            int v1_13 = v0_0;
	            int v0_1 = 0;
	            while (v0_1 < this.c.length) {
	                int v2_7 = this.c[v0_1];
	                if (v2_7 != 0) {
	                    v1_13 += dep.b(4, v2_7);
	                }
	                v0_1++;
	            }
	            v0_0 = v1_13;
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            dbt v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    dbt v0_8 = p5.e();
	                    switch (v0_8) {
	                        case 1:
	                        case 2:
	                            this.a = Integer.valueOf(v0_8);
	                            break;
	                        default:
	                    }
	                    break;
	                case 18:
	                    this.b = p5.d();
	                    break;
	                case 26:
	                    this.d = p5.d();
	                    break;
	                case 34:
	                    dbt v0_4;
	                    dbt[] v2_0 = dey.b(p5, 34);
	                    if (this.c != null) {
	                        v0_4 = this.c.length;
	                    } else {
	                        v0_4 = 0;
	                    }
	                    dbt[] v2_2 = new dbt[(v2_0 + v0_4)];
	                    if (v0_4 != null) {
	                        System.arraycopy(this.c, 0, v2_2, 0, v0_4);
	                    }
	                    while (v0_4 < (v2_2.length - 1)) {
	                        v2_2[v0_4] = new dbt();
	                        p5.a(v2_2[v0_4]);
	                        p5.a();
	                        v0_4++;
	                    }
	                    v2_2[v0_4] = new dbt();
	                    p5.a(v2_2[v0_4]);
	                    this.c = v2_2;
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
	        if (this.b != null) {
	            p4.a(2, this.b);
	        }
	        if (this.d != null) {
	            p4.a(3, this.d);
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            int v0_9 = 0;
	            while (v0_9 < this.c.length) {
	                dbt v1_7 = this.c[v0_9];
	                if (v1_7 != null) {
	                    p4.a(4, v1_7);
	                }
	                v0_9++;
	            }
	        }
	        super.a(p4);
	        return;
	    }
	
