	final java.lang.String a
	final B b
	
	    czl(String p1, byte[] p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("KeyAndSerialized: key = ").append(this.a).append(" serialized hash = ").append(java.util.Arrays.hashCode(this.b)).toString();
	    }
	
