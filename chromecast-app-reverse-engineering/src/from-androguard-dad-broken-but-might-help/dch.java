	public Ljava.lang.String a
	private Ldbv b
	
	    public dch()
	    {
	        this.a = dey.b;
	        this.b = dbv.b();
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0_3;
	        int v1 = 0;
	        int v4 = super.a();
	        if ((this.a == null) || (this.a.length <= 0)) {
	            v0_3 = v4;
	        } else {
	            int v0_4 = 0;
	            int v2_0 = 0;
	            int v3_0 = 0;
	            while (v0_4 < this.a.length) {
	                int v5_3 = this.a[v0_4];
	                if (v5_3 != 0) {
	                    v3_0++;
	                    v2_0 += dep.a(v5_3);
	                }
	                v0_4++;
	            }
	            v0_3 = ((v4 + v2_0) + (v3_0 * 1));
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            while (v1 < this.b.length) {
	                int v2_8 = this.b[v1];
	                if (v2_8 != 0) {
	                    v0_3 += dep.b(2, v2_8);
	                }
	                v1++;
	            }
	        }
	        return v0_3;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            dbv v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    dbv v0_9;
	                    dbv[] v2_3 = dey.b(p5, 10);
	                    if (this.a != null) {
	                        v0_9 = this.a.length;
	                    } else {
	                        v0_9 = 0;
	                    }
	                    dbv[] v2_5 = new String[(v2_3 + v0_9)];
	                    if (v0_9 != null) {
	                        System.arraycopy(this.a, 0, v2_5, 0, v0_9);
	                    }
	                    while (v0_9 < (v2_5.length - 1)) {
	                        v2_5[v0_9] = p5.d();
	                        p5.a();
	                        v0_9++;
	                    }
	                    v2_5[v0_9] = p5.d();
	                    this.a = v2_5;
	                    break;
	                case 18:
	                    dbv v0_4;
	                    dbv[] v2_0 = dey.b(p5, 18);
	                    if (this.b != null) {
	                        v0_4 = this.b.length;
	                    } else {
	                        v0_4 = 0;
	                    }
	                    dbv[] v2_2 = new dbv[(v2_0 + v0_4)];
	                    if (v0_4 != null) {
	                        System.arraycopy(this.b, 0, v2_2, 0, v0_4);
	                    }
	                    while (v0_4 < (v2_2.length - 1)) {
	                        v2_2[v0_4] = new dbv();
	                        p5.a(v2_2[v0_4]);
	                        p5.a();
	                        v0_4++;
	                    }
	                    v2_2[v0_4] = new dbv();
	                    p5.a(v2_2[v0_4]);
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
	
	
	    public final void a(dep p5)
	    {
	        int v1 = 0;
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_3 = 0;
	            while (v0_3 < this.a.length) {
	                int v2_4 = this.a[v0_3];
	                if (v2_4 != 0) {
	                    p5.a(1, v2_4);
	                }
	                v0_3++;
	            }
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            while (v1 < this.b.length) {
	                int v0_10 = this.b[v1];
	                if (v0_10 != 0) {
	                    p5.a(2, v0_10);
	                }
	                v1++;
	            }
	        }
	        super.a(p5);
	        return;
	    }
	
