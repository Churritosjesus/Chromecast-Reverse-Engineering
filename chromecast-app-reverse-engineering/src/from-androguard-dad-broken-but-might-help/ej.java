	private  a
	private  b
	private  c
	private  d
	private synthetic ei e
	
	    ej(ei p2, int p3)
	    {
	        this.e = p2;
	        this.d = 0;
	        this.a = p3;
	        this.b = p2.a();
	        return;
	    }
	
	
	    public final boolean hasNext()
	    {
	        int v0_1;
	        if (this.c >= this.b) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final Object next()
	    {
	        Object v0_1 = this.e.a(this.c, this.a);
	        this.c = (this.c + 1);
	        this.d = 1;
	        return v0_1;
	    }
	
	
	    public final void remove()
	    {
	        if (this.d) {
	            this.c = (this.c - 1);
	            this.b = (this.b - 1);
	            this.d = 0;
	            this.e.a(this.c);
	            return;
	        } else {
	            throw new IllegalStateException();
	        }
	    }
	
