	public static final dkw b
	private  a
	private  c
	private  d
	
	    static dkw()
	    {
	        dkw.b = new dkx();
	        return;
	    }
	
	
	    public dkw()
	    {
	        return;
	    }
	
	
	    public dkw a(long p2)
	    {
	        this.a = 1;
	        this.c = p2;
	        return this;
	    }
	
	
	    public dkw a(long p4, java.util.concurrent.TimeUnit p6)
	    {
	        if (p4 >= 0) {
	            if (p6 != null) {
	                this.d = p6.toNanos(p4);
	                return this;
	            } else {
	                throw new IllegalArgumentException("unit == null");
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("timeout < 0: ").append(p4).toString());
	        }
	    }
	
	
	    public long c()
	    {
	        if (this.a) {
	            return this.c;
	        } else {
	            throw new IllegalStateException("No deadline");
	        }
	    }
	
	
	    public dkw d()
	    {
	        this.d = 0;
	        return this;
	    }
	
	
	    public void f()
	    {
	        if (!Thread.interrupted()) {
	            if ((!this.a) || ((this.c - System.nanoTime()) > 0)) {
	                return;
	            } else {
	                throw new java.io.InterruptedIOException("deadline reached");
	            }
	        } else {
	            throw new java.io.InterruptedIOException("thread interrupted");
	        }
	    }
	
	
	    public long l_()
	    {
	        return this.d;
	    }
	
	
	    public boolean m_()
	    {
	        return this.a;
	    }
	
	
	    public dkw n_()
	    {
	        this.a = 0;
	        return this;
	    }
	
