	public final java.util.Map a
	public final cje b
	
	    clx(java.util.Map p1, cje p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public static cly a()
	    {
	        return new cly();
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("Properties: ").append(java.util.Collections.unmodifiableMap(this.a)).append(" pushAfterEvaluate: ").append(this.b).toString();
	    }
	
