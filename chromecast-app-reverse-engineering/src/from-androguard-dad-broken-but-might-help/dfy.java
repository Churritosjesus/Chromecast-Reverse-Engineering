	final dfq a
	public final java.lang.String b
	public final dfo c
	public final dga d
	final java.lang.Object e
	private bridge java.net.URL f
	private bridge java.net.URI g
	private bridge dfb h
	
	    dfy(dfz p2)
	    {
	        dfy v0_6;
	        this.a = p2.a;
	        this.b = p2.b;
	        this.c = p2.c.a();
	        this.d = p2.d;
	        if (p2.e == null) {
	            v0_6 = this;
	        } else {
	            v0_6 = p2.e;
	        }
	        this.e = v0_6;
	        return;
	    }
	
	
	    public final String a(String p2)
	    {
	        return this.c.a(p2);
	    }
	
	
	    public final java.net.URL a()
	    {
	        java.net.URL v0_0 = this.f;
	        if (v0_0 == null) {
	            v0_0 = this.a.a();
	            this.f = v0_0;
	        }
	        return v0_0;
	    }
	
	
	    public final java.net.URI b()
	    {
	        try {
	            java.net.URI v0_0 = this.g;
	        } catch (java.net.URI v0_2) {
	            throw new java.io.IOException(v0_2.getMessage());
	        }
	        if (v0_0 == null) {
	            v0_0 = this.a.b();
	            this.g = v0_0;
	        }
	        return v0_0;
	    }
	
	
	    public final dfz c()
	    {
	        return new dfz(this);
	    }
	
	
	    public final dfb d()
	    {
	        dfb v0_0 = this.h;
	        if (v0_0 == null) {
	            v0_0 = dfb.a(this.c);
	            this.h = v0_0;
	        }
	        return v0_0;
	    }
	
	
	    public final boolean e()
	    {
	        return this.a.a.equals("https");
	    }
	
	
	    public final String toString()
	    {
	        String v0_6;
	        int v1_5 = new StringBuilder("Request{method=").append(this.b).append(", url=").append(this.a).append(", tag=");
	        if (this.e == this) {
	            v0_6 = 0;
	        } else {
	            v0_6 = this.e;
	        }
	        return v1_5.append(v0_6).append(125).toString();
	    }
	
