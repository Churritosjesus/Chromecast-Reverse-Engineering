	 dfq a
	 java.lang.String b
	 dfp c
	 dga d
	 java.lang.Object e
	
	    public dfz()
	    {
	        this.b = "GET";
	        this.c = new dfp();
	        return;
	    }
	
	
	    dfz(dfy p2)
	    {
	        this.a = p2.a;
	        this.b = p2.b;
	        this.d = p2.d;
	        this.e = p2.e;
	        this.c = p2.c.a();
	        return;
	    }
	
	
	    public final dfy a()
	    {
	        if (this.a != null) {
	            return new dfy(this);
	        } else {
	            throw new IllegalStateException("url == null");
	        }
	    }
	
	
	    public final dfz a(String p2)
	    {
	        this.c.a(p2);
	        return this;
	    }
	
	
	    public final dfz a(String p4, dga p5)
	    {
	        if ((p4 != null) && (p4.length() != 0)) {
	            if ((p5 == null) || (a.q(p4))) {
	                if ((p5 != null) || (!a.p(p4))) {
	                    this.b = p4;
	                    this.d = p5;
	                    return this;
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder("method ").append(p4).append(" must have a request body.").toString());
	                }
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("method ").append(p4).append(" must not have a request body.").toString());
	            }
	        } else {
	            throw new IllegalArgumentException("method == null || method.length() == 0");
	        }
	    }
	
	
	    public final dfz a(String p2, String p3)
	    {
	        this.c.c(p2, p3);
	        return this;
	    }
	
	
	    public final dfz a(java.net.URL p4)
	    {
	        if (p4 != null) {
	            IllegalArgumentException v0_0 = dfq.a(p4);
	            if (v0_0 != null) {
	                if (v0_0 != null) {
	                    this.a = v0_0;
	                    return this;
	                } else {
	                    throw new IllegalArgumentException("url == null");
	                }
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("unexpected url: ").append(p4).toString());
	            }
	        } else {
	            throw new IllegalArgumentException("url == null");
	        }
	    }
	
	
	    public final dfz b(String p2, String p3)
	    {
	        this.c.a(p2, p3);
	        return this;
	    }
	
