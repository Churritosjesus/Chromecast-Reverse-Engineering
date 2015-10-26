	private final dkh a
	private  b
	private  c
	private synthetic dgx d
	
	    dhb(dgx p3, long p4)
	    {
	        this.d = p3;
	        this.a = new dkh(this.d.d.a());
	        this.c = p4;
	        return;
	    }
	
	
	    public final dkw a()
	    {
	        return this.a;
	    }
	
	
	    public final void a_(djz p7, long p8)
	    {
	        if (!this.b) {
	            dgs.a(p7.b, 0, p8);
	            if (p8 <= this.c) {
	                this.d.d.a_(p7, p8);
	                this.c = (this.c - p8);
	                return;
	            } else {
	                throw new java.net.ProtocolException(new StringBuilder("expected ").append(this.c).append(" bytes but received ").append(p8).toString());
	            }
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final void close()
	    {
	        if (!this.b) {
	            this.b = 1;
	            if (this.c <= 0) {
	                dgx.a(this.d, this.a);
	                this.d.e = 3;
	            } else {
	                throw new java.net.ProtocolException("unexpected end of stream");
	            }
	        }
	        return;
	    }
	
	
	    public final void flush()
	    {
	        if (!this.b) {
	            this.d.d.flush();
	        }
	        return;
	    }
	
