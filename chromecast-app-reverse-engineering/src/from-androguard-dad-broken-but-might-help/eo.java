	final Ljava.lang.Object a
	  b
	
	    public eo(int p2)
	    {
	        Object[] v0_1 = new Object[30];
	        this.a = v0_1;
	        return;
	    }
	
	
	    public Object a()
	    {
	        int v0_1;
	        if (this.b <= 0) {
	            v0_1 = 0;
	        } else {
	            int v2 = (this.b - 1);
	            v0_1 = this.a[v2];
	            this.a[v2] = 0;
	            this.b = (this.b - 1);
	        }
	        return v0_1;
	    }
	
	
	    public boolean a(Object p3)
	    {
	        if (!this.b(p3)) {
	            int v0_2;
	            if (this.b >= this.a.length) {
	                v0_2 = 0;
	            } else {
	                this.a[this.b] = p3;
	                this.b = (this.b + 1);
	                v0_2 = 1;
	            }
	            return v0_2;
	        } else {
	            throw new IllegalStateException("Already in the pool!");
	        }
	    }
	
	
	    boolean b(Object p4)
	    {
	        int v1 = 0;
	        int v0 = 0;
	        while (v0 < this.b) {
	            if (this.a[v0] != p4) {
	                v0++;
	            } else {
	                v1 = 1;
	                break;
	            }
	        }
	        return v1;
	    }
	
