	
	    private cmr(String p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    static cmr a()
	    {
	        return new cmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
	    }
	
	
	    static cmr b()
	    {
	        return new cmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
	    }
	
	
	    static cmr c()
	    {
	        return new cmr("CodedInputStream encountered a malformed varint.");
	    }
	
	
	    static cmr d()
	    {
	        return new cmr("Protocol message contained an invalid tag (zero).");
	    }
	
	
	    static cmr e()
	    {
	        return new cmr("Protocol message end-group tag did not match expected tag.");
	    }
	
	
	    static cmr f()
	    {
	        return new cmr("Protocol message tag had invalid wire type.");
	    }
	
	
	    static cmr g()
	    {
	        return new cmr("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
	    }
	
