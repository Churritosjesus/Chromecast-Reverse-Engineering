	private final ads a
	private final ady b
	private final java.lang.Runnable c
	
	    public adl(aeb p1, ads p2, ady p3, Runnable p4)
	    {
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final void run()
	    {
	        if (!this.a.g) {
	            Runnable v0_4;
	            if (this.b.c != null) {
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	            if (v0_4 == null) {
	                this.a.b(this.b.c);
	            } else {
	                this.a.a(this.b.a);
	            }
	            if (!this.b.d) {
	                this.a.b("done");
	            } else {
	                this.a.a("intermediate-response");
	            }
	            if (this.c != null) {
	                this.c.run();
	            }
	        } else {
	            this.a.b("canceled-at-delivery");
	        }
	        return;
	    }
	
