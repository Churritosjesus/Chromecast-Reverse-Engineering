	public final djz a
	private  b
	private final  c
	
	    public dhp()
	    {
	        this(-1);
	        return;
	    }
	
	
	    public dhp(int p2)
	    {
	        this.a = new djz();
	        this.c = p2;
	        return;
	    }
	
	
	    public final dkw a()
	    {
	        return dkw.b;
	    }
	
	
	    public final void a(dku p7)
	    {
	        djz v1_1 = new djz();
	        this.a.a(v1_1, 0, this.a.b);
	        p7.a_(v1_1, v1_1.b);
	        return;
	    }
	
	
	    public final void a_(djz p7, long p8)
	    {
	        if (!this.b) {
	            dgs.a(p7.b, 0, p8);
	            if ((this.c == -1) || (this.a.b <= (((long) this.c) - p8))) {
	                this.a.a_(p7, p8);
	                return;
	            } else {
	                throw new java.net.ProtocolException(new StringBuilder("exceeded content-length limit of ").append(this.c).append(" bytes").toString());
	            }
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final void close()
	    {
	        if (!this.b) {
	            this.b = 1;
	            if (this.a.b < ((long) this.c)) {
	                throw new java.net.ProtocolException(new StringBuilder("content-length promised ").append(this.c).append(" bytes, but received ").append(this.a.b).toString());
	            }
	        }
	        return;
	    }
	
	
	    public final void flush()
	    {
	        return;
	    }
	
