	public Ldau a
	
	    public dat()
	    {
	        this.a = dau.b();
	        this.t = -1;
	        return;
	    }
	
	
	    public static dat a(byte[] p1)
	    {
	        return ((dat) dew.a(new dat(), p1));
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
	            dau v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    dau v0_4;
	                    dau[] v2_0 = dey.b(p5, 10);
	                    if (this.a != null) {
	                        v0_4 = this.a.length;
	                    } else {
	                        v0_4 = 0;
	                    }
	                    dau[] v2_2 = new dau[(v2_0 + v0_4)];
	                    if (v0_4 != null) {
	                        System.arraycopy(this.a, 0, v2_2, 0, v0_4);
	                    }
	                    while (v0_4 < (v2_2.length - 1)) {
	                        v2_2[v0_4] = new dau();
	                        p5.a(v2_2[v0_4]);
	                        p5.a();
	                        v0_4++;
	                    }
	                    v2_2[v0_4] = new dau();
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
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_3 = 0;
	            while (v0_3 < this.a.length) {
	                dau v1_3 = this.a[v0_3];
	                if (v1_3 != null) {
	                    p4.a(1, v1_3);
	                }
	                v0_3++;
	            }
	        }
	        super.a(p4);
	        return;
	    }
	
