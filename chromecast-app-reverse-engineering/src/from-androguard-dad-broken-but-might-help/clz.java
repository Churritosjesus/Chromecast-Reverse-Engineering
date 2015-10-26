	public final java.util.List a
	public final java.util.Map b
	public final java.lang.String c
	
	    clz(java.util.List p2, java.util.Map p3, String p4, int p5)
	    {
	        this.a = java.util.Collections.unmodifiableList(p2);
	        this.b = java.util.Collections.unmodifiableMap(p3);
	        this.c = p4;
	        return;
	    }
	
	
	    public static cma a()
	    {
	        return new cma();
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("Rules: ").append(this.a).append("  Macros: ").append(this.b).toString();
	    }
	
