	public Ldbr a
	private java.lang.String b
	
	    public dbs()
	    {
	        this.a = dbr.b();
	        this.b = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dbs a(byte[] p1)
	    {
	        return ((dbs) dew.a(new dbs(), p1));
	    }
	
	
	    protected final int a()
	    {
	        int v1 = super.a();
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_3 = 0;
	            while (v0_3 < this.a.length) {
	                int v2_4 = this.a[v0_3];
	                if (v2_4 != 0) {
	                    v1 += dep.b(1, v2_4);
	                }
	                v0_3++;
	            }
	        }
	        if (this.b != null) {
	            v1 += dep.b(2, this.b);
	        }
	        return v1;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            dbr v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    dbr v0_5;
	                    dbr[] v2_0 = dey.b(p5, 10);
	                    if (this.a != null) {
	                        v0_5 = this.a.length;
	                    } else {
	                        v0_5 = 0;
	                    }
	                    dbr[] v2_2 = new dbr[(v2_0 + v0_5)];
	                    if (v0_5 != null) {
	                        System.arraycopy(this.a, 0, v2_2, 0, v0_5);
	                    }
	                    while (v0_5 < (v2_2.length - 1)) {
	                        v2_2[v0_5] = new dbr();
	                        p5.a(v2_2[v0_5]);
	                        p5.a();
	                        v0_5++;
	                    }
	                    v2_2[v0_5] = new dbr();
	                    p5.a(v2_2[v0_5]);
	                    this.a = v2_2;
	                    break;
	                case 18:
	                    this.b = p5.d();
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
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_3 = 0;
	            while (v0_3 < this.a.length) {
	                dbr v1_4 = this.a[v0_3];
	                if (v1_4 != null) {
	                    p4.a(1, v1_4);
	                }
	                v0_3++;
	            }
	        }
	        if (this.b != null) {
	            p4.a(2, this.b);
	        }
	        super.a(p4);
	        return;
	    }
	
