	final Ldip a
	final  b
	final  c
	
	    dip()
	    {
	        dip[] v0_1 = new dip[256];
	        this.a = v0_1;
	        this.b = 0;
	        this.c = 0;
	        return;
	    }
	
	
	    dip(int p2, int p3)
	    {
	        this.a = 0;
	        this.b = p2;
	        int v0_1 = (p3 & 7);
	        if (v0_1 == 0) {
	            v0_1 = 8;
	        }
	        this.c = v0_1;
	        return;
	    }
	
