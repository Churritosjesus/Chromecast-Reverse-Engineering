	private  a
	private final  b
	private synthetic ddy c
	
	    ddz(ddy p2)
	    {
	        this.c = p2;
	        this.a = 0;
	        this.b = p2.b();
	        return;
	    }
	
	
	    public final byte a()
	    {
	        try {
	            String v0_1 = this.c.b;
	            java.util.NoSuchElementException v1_0 = this.a;
	            this.a = (v1_0 + 1);
	            return v0_1[v1_0];
	        } catch (String v0_3) {
	            throw new java.util.NoSuchElementException(v0_3.getMessage());
	        }
	    }
	
	
	    public final boolean hasNext()
	    {
	        int v0_1;
	        if (this.a >= this.b) {
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
	
