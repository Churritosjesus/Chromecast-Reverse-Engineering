	static final  serialVersionUID
	private  a
	private java.lang.String b
	
	    public afp(String p1, int p2, String p3)
	    {
	        this(p1);
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("{FacebookDialogException: ").append("errorCode: ").append(this.a).append(", message: ").append(this.getMessage()).append(", url: ").append(this.b).append("}").toString();
	    }
	
