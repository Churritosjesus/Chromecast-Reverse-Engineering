	  a
	private java.lang.Object b
	
	    bkz()
	    {
	        this.a = bla.b;
	        return;
	    }
	
	
	    public final boolean hasNext()
	    {
	        int v0_0 = 0;
	        if (this.a != bla.d) {
	            switch (bkt.a[(this.a - 1)]) {
	                case 1:
	                    break;
	                case 2:
	                    v0_0 = 1;
	                    break;
	                default:
	                    this.a = bla.d;
	                    this.b = this.a();
	                    if (this.a == bla.c) {
	                    } else {
	                        this.a = bla.a;
	                        v0_0 = 1;
	                    }
	            }
	            return v0_0;
	        } else {
	            throw new IllegalStateException();
	        }
	    }
	
	
	    public final Object next()
	    {
	        if (this.hasNext()) {
	            this.a = bla.b;
	            return this.b;
	        } else {
	            throw new java.util.NoSuchElementException();
	        }
	    }
	
	
	    public void remove()
	    {
	        throw new UnsupportedOperationException();
	    }
	
