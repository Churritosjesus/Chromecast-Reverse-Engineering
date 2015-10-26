	private  b
	private synthetic dgx c
	
	    dhd(dgx p2)
	    {
	        this.c = p2;
	        this(p2, 0);
	        return;
	    }
	
	
	    public final long a(djz p7, long p8)
	    {
	        int v0_0 = -1;
	        if (p8 >= 0) {
	            if (!this.a) {
	                if (!this.b) {
	                    int v2_6 = this.c.c.a(p7, p8);
	                    if (v2_6 != -1) {
	                        v0_0 = v2_6;
	                    } else {
	                        this.b = 1;
	                        this.a(0);
	                    }
	                }
	                return v0_0;
	            } else {
	                throw new IllegalStateException("closed");
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("byteCount < 0: ").append(p8).toString());
	        }
	    }
	
	
	    public final void close()
	    {
	        if (!this.a) {
	            if (!this.b) {
	                this.b();
	            }
	            this.a = 1;
	        }
	        return;
	    }
	
