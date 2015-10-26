	final java.util.ArrayList a
	private final bwd b
	private final s c
	private final bwe d
	private final a e
	
	    public varargs bvz(String p3, bwd p4, bwe p5, com.google.android.gms.common.api.Scope[] p6)
	    {
	        a.f(p4, "Cannot construct an Api with a null ClientBuilder");
	        a.f(p5, "Cannot construct an Api with a null ClientKey");
	        this.b = p4;
	        this.c = 0;
	        this.d = p5;
	        this.e = 0;
	        this.a = new java.util.ArrayList(java.util.Arrays.asList(p6));
	        return;
	    }
	
	
	    public final bwd a()
	    {
	        bwd v0_1;
	        if (this.b == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        a.a(v0_1, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
	        return this.b;
	    }
	
	
	    public final bwe b()
	    {
	        bwe v0_1;
	        if (this.d == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        a.a(v0_1, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
	        return this.d;
	    }
	
