	private synthetic bfp a
	private synthetic bff b
	
	    bem(bdu p1, bfp p2, bff p3)
	    {
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        bff v0_1 = this.a.a();
	        if ((!this.a.i) && (v0_1 != null)) {
	            this.b.a(v0_1);
	        } else {
	            this.b.a();
	        }
	        return;
	    }
	
