	private final java.util.Stack a
	private ddy b
	
	    deh(ddl p2)
	    {
	        this.a = new java.util.Stack();
	        this.b = this.a(p2);
	        return;
	    }
	
	
	    private ddy a(ddl p3)
	    {
	        ddy v0_0 = p3;
	        while ((v0_0 instanceof deg)) {
	            ddy v0_2 = ((deg) v0_0);
	            this.a.push(v0_2);
	            v0_0 = deg.a(v0_2);
	        }
	        return ((ddy) v0_0);
	    }
	
	
	    private ddy b()
	    {
	        while (!this.a.isEmpty()) {
	            int v1_1;
	            ddy v0_6 = this.a(deg.b(((deg) this.a.pop())));
	            if (v0_6.b() != 0) {
	                v1_1 = 0;
	            } else {
	                v1_1 = 1;
	            }
	            if (v1_1 == 0) {
	            }
	            return v0_6;
	        }
	        v0_6 = 0;
	        return v0_6;
	    }
	
	
	    public final ddy a()
	    {
	        if (this.b != null) {
	            ddy v0_1 = this.b;
	            this.b = this.b();
	            return v0_1;
	        } else {
	            throw new java.util.NoSuchElementException();
	        }
	    }
	
	
	    public final boolean hasNext()
	    {
	        int v0_1;
	        if (this.b == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final synthetic Object next()
	    {
	        return this.a();
	    }
	
	
	    public final void remove()
	    {
	        throw new UnsupportedOperationException();
	    }
	
