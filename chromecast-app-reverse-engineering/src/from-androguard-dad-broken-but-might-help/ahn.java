	private static final  serialVersionUID
	private final java.lang.String a
	private final  b
	
	    ahn(String p1, boolean p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    private Object readResolve()
	    {
	        return new ahm(this.a, this.b);
	    }
	
