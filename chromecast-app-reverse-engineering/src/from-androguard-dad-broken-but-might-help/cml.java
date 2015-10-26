	private static final  serialVersionUID
	
	    public cml()
	    {
	        this("CodedOutputStream was writing to a flat byte array and ran out of space.");
	        return;
	    }
	
	
	    cml(int p3, int p4)
	    {
	        this(new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(p3).append(" limit ").append(p4).append(").").toString());
	        return;
	    }
	
	
	    public cml(Throwable p2)
	    {
	        this("CodedOutputStream was writing to a flat byte array and ran out of space.", p2);
	        return;
	    }
	
