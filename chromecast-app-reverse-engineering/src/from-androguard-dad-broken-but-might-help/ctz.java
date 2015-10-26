	public final java.lang.String a
	public final java.lang.Object b
	
	    ctz(String p1, Object p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        int v0 = 0;
	        if (((p4 instanceof ctz)) && ((this.a.equals(((ctz) p4).a)) && (this.b.equals(((ctz) p4).b)))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_1 = new Integer[2];
	        v0_1[0] = Integer.valueOf(this.a.hashCode());
	        v0_1[1] = Integer.valueOf(this.b.hashCode());
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("Key: ").append(this.a).append(" value: ").append(this.b.toString()).toString();
	    }
	
