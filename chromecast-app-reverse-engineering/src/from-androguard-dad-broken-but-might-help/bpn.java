	private synthetic  a
	private synthetic bql b
	private synthetic bpk c
	
	    bpn(bpk p1, int p2, bql p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        Boolean v0_1 = this.c.stopSelfResult(this.a);
	        if (v0_1 != null) {
	            this.b.a("Install campaign broadcast processed", Boolean.valueOf(v0_1));
	        }
	        return;
	    }
	
