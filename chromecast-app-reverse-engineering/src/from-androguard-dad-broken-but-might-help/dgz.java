	private final dkh a
	private  b
	private synthetic dgx c
	
	    dgz(dgx p3)
	    {
	        this.c = p3;
	        this.a = new dkh(this.c.d.a());
	        return;
	    }
	
	
	    public final dkw a()
	    {
	        return this.a;
	    }
	
	
	    public final void a_(djz p3, long p4)
	    {
	        if (!this.b) {
	            if (p4 != 0) {
	                this.c.d.h(p4);
	                this.c.d.b("\r\n");
	                this.c.d.a_(p3, p4);
	                this.c.d.b("\r\n");
	            }
	            return;
	        } else {
	            throw new IllegalStateException("closed");
	        }
	    }
	
	
	    public final declared_synchronized void close()
	    {
	        try {
	            if (!this.b) {
	                this.b = 1;
	                this.c.d.b("0\r\n\r\n");
	                dgx.a(this.c, this.a);
	                this.c.e = 3;
	            }
	        } catch (dgx v0_6) {
	            throw v0_6;
	        }
	        return;
	    }
	
	
	    public final declared_synchronized void flush()
	    {
	        try {
	            if (!this.b) {
	                this.c.d.flush();
	            }
	        } catch (dkc v0_3) {
	            throw v0_3;
	        }
	        return;
	    }
	
