	private static bridge Ldbt d
	public java.lang.String a
	public java.lang.String b
	public java.lang.String c
	
	    public dbt()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dbt[] b()
	    {
	        if (dbt.d == null) {
	            if (dbt.d == null) {
	                dbt[] v0_3 = new dbt[0];
	                dbt.d = v0_3;
	            }
	        }
	        return dbt.d;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            v0 += dep.b(1, this.a);
	        }
	        if (this.b != null) {
	            v0 += dep.b(2, this.b);
	        }
	        if (this.c != null) {
	            v0 += dep.b(3, this.c);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p2)
	    {
	        while(true) {
	            String v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p2.d();
	                    break;
	                case 18:
	                    this.b = p2.d();
	                    break;
	                case 26:
	                    this.c = p2.d();
	                    break;
	                default:
	                    if (!dey.a(p2, v0_0)) {
	                        break;
	                    }
	            }
	        }
	        return this;
	    }
	
	
	    public final void a(dep p3)
	    {
	        if (this.a != null) {
	            p3.a(1, this.a);
	        }
	        if (this.b != null) {
	            p3.a(2, this.b);
	        }
	        if (this.c != null) {
	            p3.a(3, this.c);
	        }
	        super.a(p3);
	        return;
	    }
	
