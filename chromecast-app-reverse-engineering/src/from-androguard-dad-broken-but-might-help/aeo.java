	private  a
	
	    aeo(java.io.InputStream p2)
	    {
	        this(p2);
	        this.a = 0;
	        return;
	    }
	
	
	    static synthetic int a(aeo p1)
	    {
	        return p1.a;
	    }
	
	
	    public final int read()
	    {
	        int v0 = super.read();
	        if (v0 != -1) {
	            this.a = (this.a + 1);
	        }
	        return v0;
	    }
	
	
	    public final int read(byte[] p3, int p4, int p5)
	    {
	        int v0 = super.read(p3, p4, p5);
	        if (v0 != -1) {
	            this.a = (this.a + v0);
	        }
	        return v0;
	    }
	
