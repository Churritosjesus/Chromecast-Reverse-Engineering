	private  a
	private java.lang.String b
	
	    public atd(int p1, String p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        if ((!(p4 instanceof atd)) || ((this.a != ((atd) p4).a) || (!this.b.equals(((atd) p4).b)))) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public final int hashCode()
	    {
	        return ((((this.b.hashCode() ^ (this.b.hashCode() >> 16)) * 31) + 31) + this.a);
	    }
	
