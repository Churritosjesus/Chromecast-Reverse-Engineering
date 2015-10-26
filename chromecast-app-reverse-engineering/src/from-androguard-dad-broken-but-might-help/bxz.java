	private bxv a
	private  b
	
	    public bxz(bxv p2)
	    {
	        this.a = ((bxv) a.c(p2));
	        this.b = -1;
	        return;
	    }
	
	
	    public final boolean hasNext()
	    {
	        int v0_1;
	        if (this.b >= (this.a.b() - 1)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final Object next()
	    {
	        if (this.hasNext()) {
	            Object v0_1 = this.a;
	            int v1_1 = (this.b + 1);
	            this.b = v1_1;
	            return v0_1.a(v1_1);
	        } else {
	            throw new java.util.NoSuchElementException(new StringBuilder("Cannot advance the iterator beyond ").append(this.b).toString());
	        }
	    }
	
	
	    public final void remove()
	    {
	        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
	    }
	
