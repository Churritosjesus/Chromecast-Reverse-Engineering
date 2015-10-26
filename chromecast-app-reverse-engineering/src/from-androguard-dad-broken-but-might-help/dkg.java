	private final dkv a
	
	    public dkg(dkv p3)
	    {
	        if (p3 != null) {
	            this.a = p3;
	            return;
	        } else {
	            throw new IllegalArgumentException("delegate == null");
	        }
	    }
	
	
	    public long a(djz p3, long p4)
	    {
	        return this.a.a(p3, p4);
	    }
	
	
	    public final dkw a()
	    {
	        return this.a.a();
	    }
	
	
	    public void close()
	    {
	        this.a.close();
	        return;
	    }
	
	
	    public String toString()
	    {
	        return new StringBuilder().append(this.getClass().getSimpleName()).append("(").append(this.a.toString()).append(")").toString();
	    }
	
