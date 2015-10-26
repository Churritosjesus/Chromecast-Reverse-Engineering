	private static final java.util.logging.Logger a
	
	    static dkk()
	    {
	        dkk.a = java.util.logging.Logger.getLogger(dkk.getName());
	        return;
	    }
	
	
	    private dkk()
	    {
	        return;
	    }
	
	
	    public static dkc a(dku p2)
	    {
	        if (p2 != null) {
	            return new dko(p2);
	        } else {
	            throw new IllegalArgumentException("sink == null");
	        }
	    }
	
	
	    public static dkd a(dkv p2)
	    {
	        if (p2 != null) {
	            return new dkq(p2);
	        } else {
	            throw new IllegalArgumentException("source == null");
	        }
	    }
	
	
	    public static dku a(java.net.Socket p3)
	    {
	        if (p3 != null) {
	            IllegalArgumentException v0_0 = dkk.c(p3);
	            djv v1_0 = p3.getOutputStream();
	            if (v1_0 != null) {
	                if (v0_0 != null) {
	                    return new djv(v0_0, new dkl(v0_0, v1_0));
	                } else {
	                    throw new IllegalArgumentException("timeout == null");
	                }
	            } else {
	                throw new IllegalArgumentException("out == null");
	            }
	        } else {
	            throw new IllegalArgumentException("socket == null");
	        }
	    }
	
	
	    static synthetic java.util.logging.Logger a()
	    {
	        return dkk.a;
	    }
	
	
	    public static dkv b(java.net.Socket p3)
	    {
	        if (p3 != null) {
	            IllegalArgumentException v0_0 = dkk.c(p3);
	            djw v1_0 = p3.getInputStream();
	            if (v1_0 != null) {
	                if (v0_0 != null) {
	                    return new djw(v0_0, new dkm(v0_0, v1_0));
	                } else {
	                    throw new IllegalArgumentException("timeout == null");
	                }
	            } else {
	                throw new IllegalArgumentException("in == null");
	            }
	        } else {
	            throw new IllegalArgumentException("socket == null");
	        }
	    }
	
	
	    private static dju c(java.net.Socket p1)
	    {
	        return new dkn(p1);
	    }
	
