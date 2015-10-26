	
	    diu(dis p1)
	    {
	        return;
	    }
	
	
	    public final int inflate(byte[] p3, int p4, int p5)
	    {
	        int v0_0 = super.inflate(p3, p4, p5);
	        if ((v0_0 == 0) && (this.needsDictionary())) {
	            this.setDictionary(diy.a);
	            v0_0 = super.inflate(p3, p4, p5);
	        }
	        return v0_0;
	    }
	
