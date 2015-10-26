	private static final  serialVersionUID
	
	    private dev(String p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    static dev a()
	    {
	        return new dev("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
	    }
	
	
	    static dev b()
	    {
	        return new dev("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
	    }
	
	
	    static dev c()
	    {
	        return new dev("CodedInputStream encountered a malformed varint.");
	    }
	
	
	    static dev d()
	    {
	        return new dev("Protocol message contained an invalid tag (zero).");
	    }
	
	
	    static dev e()
	    {
	        return new dev("Protocol message end-group tag did not match expected tag.");
	    }
	
	
	    static dev f()
	    {
	        return new dev("Protocol message tag had invalid wire type.");
	    }
	
	
	    static dev g()
	    {
	        return new dev("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
	    }
	
