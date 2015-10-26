	private synthetic cwl a
	
	    cwm(cwl p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(cvk p5)
	    {
	        cwl.a(this.a, p5.a);
	        return;
	    }
	
	
	    public final void b(cvk p5)
	    {
	        cwl.a(this.a, p5.a);
	        cuh.e(new StringBuilder("Permanent failure dispatching hitId: ").append(p5.a).toString());
	        return;
	    }
	
	
	    public final void c(cvk p7)
	    {
	        String v0_0 = p7.b;
	        if (v0_0 != 0) {
	            if ((v0_0 + 14400000) < cwl.a(this.a).a()) {
	                cwl.a(this.a, p7.a);
	                cuh.e(new StringBuilder("Giving up on failed hitId: ").append(p7.a).toString());
	            }
	        } else {
	            cwl.a(this.a, p7.a, cwl.a(this.a).a());
	        }
	        return;
	    }
	
