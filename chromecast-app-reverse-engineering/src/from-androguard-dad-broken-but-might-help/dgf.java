	public final dez a
	public final java.net.Proxy b
	public final java.net.InetSocketAddress c
	
	    public dgf(dez p3, java.net.Proxy p4, java.net.InetSocketAddress p5)
	    {
	        if (p3 != null) {
	            if (p4 != null) {
	                if (p5 != null) {
	                    this.a = p3;
	                    this.b = p4;
	                    this.c = p5;
	                    return;
	                } else {
	                    throw new NullPointerException("inetSocketAddress == null");
	                }
	            } else {
	                throw new NullPointerException("proxy == null");
	            }
	        } else {
	            throw new NullPointerException("address == null");
	        }
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        int v0 = 0;
	        if (((p4 instanceof dgf)) && ((this.a.equals(((dgf) p4).a)) && ((this.b.equals(((dgf) p4).b)) && (this.c.equals(((dgf) p4).c))))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        return (((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode());
	    }
	
