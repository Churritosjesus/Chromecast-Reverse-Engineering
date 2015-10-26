	private final aek a
	
	    public afa(aek p3, int p4)
	    {
	        this.a = p3;
	        this.buf = this.a.a(Math.max(p4, 256));
	        return;
	    }
	
	
	    private void a(int p5)
	    {
	        if ((this.count + p5) > this.buf.length) {
	            byte[] v0_3 = this.a.a(((this.count + p5) << 1));
	            System.arraycopy(this.buf, 0, v0_3, 0, this.count);
	            this.a.a(this.buf);
	            this.buf = v0_3;
	        }
	        return;
	    }
	
	
	    public final void close()
	    {
	        this.a.a(this.buf);
	        this.buf = 0;
	        super.close();
	        return;
	    }
	
	
	    public final void finalize()
	    {
	        this.a.a(this.buf);
	        return;
	    }
	
	
	    public final declared_synchronized void write(int p2)
	    {
	        try {
	            this.a(1);
	            super.write(p2);
	            return;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public final declared_synchronized void write(byte[] p2, int p3, int p4)
	    {
	        try {
	            this.a(p4);
	            super.write(p2, p3, p4);
	            return;
	        } catch (Throwable v0) {
	            throw v0;
	        }
	    }
	
