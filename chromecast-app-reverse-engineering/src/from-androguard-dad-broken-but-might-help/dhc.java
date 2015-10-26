	private  b
	private synthetic dgx c
	
	    public dhc(dgx p5, long p6)
	    {
	        this.c = p5;
	        this(p5, 0);
	        this.b = p6;
	        if (this.b == 0) {
	            this.a(1);
	        }
	        return;
	    }
	
	
	    public final long a(djz p9, long p10)
	    {
	        long v0_0 = -1;
	        if (p10 >= 0) {
	            if (!this.a) {
	                if (this.b != 0) {
	                    long v2_6 = this.c.c.a(p9, Math.min(this.b, p10));
	                    if (v2_6 != -1) {
	                        this.b = (this.b - v2_6);
	                        if (this.b == 0) {
	                            this.a(1);
	                        }
	                        v0_0 = v2_6;
	                    } else {
	                        this.b();
	                        throw new java.net.ProtocolException("unexpected end of stream");
	                    }
	                }
	                return v0_0;
	            } else {
	                throw new IllegalStateException("closed");
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("byteCount < 0: ").append(p10).toString());
	        }
	    }
	
	
	    public final void close()
	    {
	        if (!this.a) {
	            if ((this.b != 0) && (!dgs.a(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS))) {
	                this.b();
	            }
	            this.a = 1;
	        }
	        return;
	    }
	
