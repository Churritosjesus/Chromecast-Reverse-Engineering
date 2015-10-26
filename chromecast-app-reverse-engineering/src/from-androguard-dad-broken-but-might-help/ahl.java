	private static final  serialVersionUID
	private final java.lang.String a
	private final java.lang.String b
	
	    ahl(String p1, String p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    private Object readResolve()
	    {
	        return new ahk(this.a, this.b);
	    }
	
