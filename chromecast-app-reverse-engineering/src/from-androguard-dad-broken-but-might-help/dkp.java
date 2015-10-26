	private synthetic dko a
	
	    dkp(dko p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void close()
	    {
	        this.a.close();
	        return;
	    }
	
	
	    public final void flush()
	    {
	        if (!this.a.b) {
	            this.a.flush();
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder().append(this.a).append(".outputStream()").toString();
	    }
	
	
	    public final void write(int p3)
	    {
	        if (!this.a.b) {
	            this.a.a.b(((byte) p3));
	            this.a.r();
	            return;
	        } else {
	            throw new java.io.IOException("closed");
	        }
	    }
	
	
	    public final void write(byte[] p3, int p4, int p5)
	    {
	        if (!this.a.b) {
	            this.a.a.b(p3, p4, p5);
	            this.a.r();
	            return;
	        } else {
	            throw new java.io.IOException("closed");
	        }
	    }
	
