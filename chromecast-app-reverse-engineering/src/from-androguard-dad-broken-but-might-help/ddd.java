	private Ldda a
	
	    public ddd()
	    {
	        this.a = dda.b();
	        this.i = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v1 = super.a();
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_3 = 0;
	            while (v0_3 < this.a.length) {
	                int v2_3 = this.a[v0_3];
	                if (v2_3 != 0) {
	                    v1 += dep.b(1, v2_3);
	                }
	                v0_3++;
	            }
	        }
	        return v1;
	    }
	
	
	    public final synthetic dew a(deo p5)
	    {
	        while(true) {
	            dda v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    dda v0_4;
	                    dda[] v2_0 = dey.b(p5, 10);
	                    if (this.a != null) {
	                        v0_4 = this.a.length;
	                    } else {
	                        v0_4 = 0;
	                    }
	                    dda[] v2_2 = new dda[(v2_0 + v0_4)];
	                    if (v0_4 != null) {
	                        System.arraycopy(this.a, 0, v2_2, 0, v0_4);
	                    }
	                    while (v0_4 < (v2_2.length - 1)) {
	                        v2_2[v0_4] = new dda();
	                        p5.a(v2_2[v0_4]);
	                        p5.a();
	                        v0_4++;
	                    }
	                    v2_2[v0_4] = new dda();
	                    p5.a(v2_2[v0_4]);
	                    this.a = v2_2;
	                    break;
	                default:
	                    if (super.a(p5, v0_0)) {
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
	                dda v1_3 = this.a[v0_3];
	                if (v1_3 != null) {
	                    p4.a(1, v1_3);
	                }
	                v0_3++;
	            }
	        }
	        super.a(p4);
	        return;
	    }
	
