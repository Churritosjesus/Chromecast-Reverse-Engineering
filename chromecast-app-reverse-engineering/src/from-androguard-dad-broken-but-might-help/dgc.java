	public final dfy a
	public final dfx b
	public final  c
	public final java.lang.String d
	public final dfn e
	public final dfo f
	public final dge g
	public dgc h
	public dgc i
	final dgc j
	private bridge dfb k
	
	    dgc(dgd p2)
	    {
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
	
	
	    public final dgd a()
	    {
	        return new dgd(this);
	    }
	
	
	    public final String a(String p2)
	    {
	        int v0_1 = this.f.a(p2);
	        if (v0_1 == 0) {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final java.util.List b()
	    {
	        java.util.List v0_3;
	        java.util.List v0_2;
	        if (this.c != 401) {
	            if (this.c != 407) {
	                v0_2 = java.util.Collections.emptyList();
	            } else {
	                v0_3 = "Proxy-Authenticate";
	                v0_2 = dhl.b(this.f, v0_3);
	            }
	        } else {
	            v0_3 = "WWW-Authenticate";
	        }
	        return v0_2;
	    }
	
	
	    public final dfb c()
	    {
	        dfb v0_0 = this.k;
	        if (v0_0 == null) {
	            v0_0 = dfb.a(this.f);
	            this.k = v0_0;
	        }
	        return v0_0;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("Response{protocol=").append(this.b).append(", code=").append(this.c).append(", message=").append(this.d).append(", url=").append(this.a.a.toString()).append(125).toString();
	    }
	
