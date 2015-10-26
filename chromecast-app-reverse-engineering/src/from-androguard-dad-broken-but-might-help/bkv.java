	final  a
	final blc b
	
	    private bkv(blc p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    private bkv(blc p1, boolean p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public static bkv a(String p2)
	    {
	        if (p2.length() != 0) {
	            return new bkv(new bkw(p2));
	        } else {
	            throw new IllegalArgumentException("separator may not be empty or null");
	        }
	    }
	
	
	    public final bkv a()
	    {
	        return new bkv(this.b, 1);
	    }
	
	
	    public final Iterable a(CharSequence p2)
	    {
	        return new bky(this, p2);
	    }
	
