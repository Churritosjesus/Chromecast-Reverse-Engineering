	private synthetic java.util.List a
	private synthetic  b
	
	    ayu(ayq p1, java.util.List p2, int p3)
	    {
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        java.util.Iterator v1 = this.a.iterator();
	        while (v1.hasNext()) {
	            ((ayw) v1.next()).a(this.b);
	        }
	        return;
	    }
	
