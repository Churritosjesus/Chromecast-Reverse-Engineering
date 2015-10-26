	private synthetic aqj a
	
	    aqs(aqj p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void run()
	    {
	        try {
	            aqj.b(this.a).a(bsr.b.c(this.a.a));
	            aqj.h();
	            IllegalStateException v0_3 = new Object[2];
	            v0_3[0] = aqj.b(this.a).g();
	            v0_3[1] = aqj.b(this.a).o().a();
	        } catch (IllegalStateException v0_4) {
	            blp v1_3 = aqj.h();
	            Object[] v3 = new Object[1];
	            v3[0] = v0_4;
	            v1_3.a("Got unexpected error calling getVolume: %s", v3);
	        }
	        return;
	    }
	
