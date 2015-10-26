	private synthetic vl a
	
	    vm(vl p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void b(int p4)
	    {
	        vl.a(this.a).setStreamVolume(3, p4, 0);
	        vl.b(this.a);
	        return;
	    }
	
	
	    public final void c(int p6)
	    {
	        vl v0_2 = vl.a(this.a).getStreamVolume(3);
	        if (Math.min(vl.a(this.a).getStreamMaxVolume(3), Math.max(0, (v0_2 + p6))) != v0_2) {
	            vl.a(this.a).setStreamVolume(3, v0_2, 0);
	        }
	        vl.b(this.a);
	        return;
	    }
	
