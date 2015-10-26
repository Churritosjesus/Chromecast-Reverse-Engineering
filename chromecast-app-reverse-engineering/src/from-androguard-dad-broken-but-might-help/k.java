	private synthetic j a
	
	    k(j p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final android.view.View a(int p3)
	    {
	        if (this.a.N != null) {
	            return this.a.N.findViewById(p3);
	        } else {
	            throw new IllegalStateException("Fragment does not have a view");
	        }
	    }
	
	
	    public final boolean a()
	    {
	        int v0_2;
	        if (this.a.N == null) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
