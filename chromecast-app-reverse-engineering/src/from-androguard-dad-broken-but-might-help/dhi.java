	private  a
	private synthetic dkd b
	private synthetic s c
	private synthetic dkc d
	
	    public dhi(dhg p1, dkd p2, s p3, dkc p4)
	    {
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        return;
	    }
	
	
	    public final long a(djz p7, long p8)
	    {
	        try {
	            dkc v4 = this.b.a(p7, p8);
	        } catch (dkc v0_1) {
	            if (!this.a) {
	                this.a = 1;
	            }
	            throw v0_1;
	        }
	        if (v4 != -1) {
	            p7.a(this.d.b(), (p7.b - v4), v4);
	            this.d.r();
	        } else {
	            if (!this.a) {
	                this.a = 1;
	                this.d.close();
	            }
	            v4 = -1;
	        }
	        return v4;
	    }
	
	
	    public final dkw a()
	    {
	        return this.b.a();
	    }
	
	
	    public final void close()
	    {
	        if ((!this.a) && (!dgs.a(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS))) {
	            this.a = 1;
	        }
	        this.b.close();
	        return;
	    }
	
