	private synthetic cto a
	
	    cts(cto p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        try {
	            if (!this.a.a()) {
	                if (this.a.m == null) {
	                    this.a.a(this.a.b(com.google.android.gms.common.api.Status.c));
	                } else {
	                    this.a.a(this.a.m);
	                }
	            }
	        } catch (cto v0_6) {
	            throw v0_6;
	        }
	        this.a.a(3600000);
	        return;
	    }
	
	
	    public final synthetic void a(Object p6)
	    {
	        try {
	            if (((cjd) p6).b != null) {
	                cto.a(this.a, ((cjd) p6), this.a.a.a(), 0);
	                cuh.e(new StringBuilder("setting refresh time to current time: ").append(this.a.p).toString());
	                if (!this.a.e()) {
	                    this.a.a(((cjd) p6));
	                }
	            } else {
	                if (this.a.o.b != null) {
	                    ((cjd) p6).b = this.a.o.b;
	                } else {
	                    cuh.a("Current resource is null; network resource is also null");
	                    this.a.a(3600000);
	                }
	            }
	        } catch (cto v0_17) {
	            throw v0_17;
	        }
	        return;
	    }
	
