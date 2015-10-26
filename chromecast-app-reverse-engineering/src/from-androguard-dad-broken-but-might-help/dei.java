	private final deh a
	private ddm b
	private  c
	
	    dei(deg p2)
	    {
	        this.a = new deh(p2);
	        this.b = this.a.a().a();
	        this.c = 0;
	        return;
	    }
	
	
	    public final byte a()
	    {
	        if (!this.b.hasNext()) {
	            this.b = this.a.a().a();
	        }
	        this.c = (this.c - 1);
	        return this.b.a();
	    }
	
	
	    public final boolean hasNext()
	    {
	        int v0_1;
	        if (this.c <= 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final synthetic Object next()
	    {
	        return Byte.valueOf(this.a());
	    }
	
	
	    public final void remove()
	    {
	        throw new UnsupportedOperationException();
	    }
	
