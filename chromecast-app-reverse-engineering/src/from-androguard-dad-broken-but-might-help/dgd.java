	public dfy a
	public dfx b
	public  c
	public java.lang.String d
	public dfn e
	 dfp f
	public dge g
	 dgc h
	 dgc i
	 dgc j
	
	    public dgd()
	    {
	        this.c = -1;
	        this.f = new dfp();
	        return;
	    }
	
	
	    dgd(dgc p2)
	    {
	        this.c = -1;
	        this.a = p2.a;
	        this.b = p2.b;
	        this.c = p2.c;
	        this.d = p2.d;
	        this.e = p2.e;
	        this.f = p2.f.a();
	        this.g = p2.g;
	        this.h = p2.h;
	        this.i = p2.i;
	        this.j = p2.j;
	        return;
	    }
	
	
	    private static void a(String p3, dgc p4)
	    {
	        if (p4.g == null) {
	            if (p4.h == null) {
	                if (p4.i == null) {
	                    if (p4.j == null) {
	                        return;
	                    } else {
	                        throw new IllegalArgumentException(new StringBuilder().append(p3).append(".priorResponse != null").toString());
	                    }
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder().append(p3).append(".cacheResponse != null").toString());
	                }
	            } else {
	                throw new IllegalArgumentException(new StringBuilder().append(p3).append(".networkResponse != null").toString());
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder().append(p3).append(".body != null").toString());
	        }
	    }
	
	
	    public final dgc a()
	    {
	        if (this.a != null) {
	            if (this.b != null) {
	                if (this.c >= 0) {
	                    return new dgc(this);
	                } else {
	                    throw new IllegalStateException(new StringBuilder("code < 0: ").append(this.c).toString());
	                }
	            } else {
	                throw new IllegalStateException("protocol == null");
	            }
	        } else {
	            throw new IllegalStateException("request == null");
	        }
	    }
	
	
	    public final dgd a(dfo p2)
	    {
	        this.f = p2.a();
	        return this;
	    }
	
	
	    public final dgd a(dgc p2)
	    {
	        if (p2 != null) {
	            dgd.a("networkResponse", p2);
	        }
	        this.h = p2;
	        return this;
	    }
	
	
	    public final dgd a(String p2, String p3)
	    {
	        this.f.c(p2, p3);
	        return this;
	    }
	
	
	    public final dgd b(dgc p2)
	    {
	        if (p2 != null) {
	            dgd.a("cacheResponse", p2);
	        }
	        this.i = p2;
	        return this;
	    }
	
	
	    public final dgd b(String p2, String p3)
	    {
	        this.f.a(p2, p3);
	        return this;
	    }
	
	
	    public final dgd c(dgc p3)
	    {
	        if ((p3 == null) || (p3.g == null)) {
	            this.j = p3;
	            return this;
	        } else {
	            throw new IllegalArgumentException("priorResponse.body != null");
	        }
	    }
	
