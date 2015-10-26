	public Ldbf a
	private dbb b
	
	    public dbp()
	    {
	        this.b = 0;
	        this.a = dbf.b();
	        this.t = -1;
	        return;
	    }
	
	
	    public static dbp a(byte[] p1)
	    {
	        return ((dbp) dew.a(new dbp(), p1));
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
	                int v2_4 = this.a[v0_1];
	                if (v2_4 != 0) {
	                    v1_7 += dep.b(2, v2_4);
	                }
	                v0_1++;
	            }
	            v0_0 = v1_7;
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            dbf v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    if (this.b == null) {
	                        this.b = new dbb();
	                    }
	                    p5.a(this.b);
	                    break;
	                case 18:
	                    dbf v0_4;
	                    dbf[] v2_0 = dey.b(p5, 18);
	                    if (this.a != null) {
	                        v0_4 = this.a.length;
	                    } else {
	                        v0_4 = 0;
	                    }
	                    dbf[] v2_2 = new dbf[(v2_0 + v0_4)];
	                    if (v0_4 != null) {
	                        System.arraycopy(this.a, 0, v2_2, 0, v0_4);
	                    }
	                    while (v0_4 < (v2_2.length - 1)) {
	                        v2_2[v0_4] = new dbf();
	                        p5.a(v2_2[v0_4]);
	                        p5.a();
	                        v0_4++;
	                    }
	                    v2_2[v0_4] = new dbf();
	                    p5.a(v2_2[v0_4]);
	                    this.a = v2_2;
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
	                dbf v1_4 = this.a[v0_5];
	                if (v1_4 != null) {
	                    p4.a(2, v1_4);
	                }
	                v0_5++;
	            }
	        }
	        super.a(p4);
	        return;
	    }
	
