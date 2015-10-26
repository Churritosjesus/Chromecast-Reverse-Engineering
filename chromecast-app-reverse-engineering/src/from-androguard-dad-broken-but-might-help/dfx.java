	public static final enum dfx a
	public static final enum dfx b
	public static final enum dfx c
	public static final enum dfx d
	private static final synthetic Ldfx f
	private final java.lang.String e
	
	    static dfx()
	    {
	        dfx.a = new dfx("HTTP_1_0", 0, "http/1.0");
	        dfx.b = new dfx("HTTP_1_1", 1, "http/1.1");
	        dfx.c = new dfx("SPDY_3", 2, "spdy/3.1");
	        dfx.d = new dfx("HTTP_2", 3, "h2");
	        dfx[] v0_9 = new dfx[4];
	        v0_9[0] = dfx.a;
	        v0_9[1] = dfx.b;
	        v0_9[2] = dfx.c;
	        v0_9[3] = dfx.d;
	        dfx.f = v0_9;
	        return;
	    }
	
	
	    private dfx(String p1, int p2, String p3)
	    {
	        this(p1, p2);
	        this.e = p3;
	        return;
	    }
	
	
	    public static dfx a(String p3)
	    {
	        java.io.IOException v0_14;
	        if (!p3.equals(dfx.a.e)) {
	            if (!p3.equals(dfx.b.e)) {
	                if (!p3.equals(dfx.d.e)) {
	                    if (!p3.equals(dfx.c.e)) {
	                        throw new java.io.IOException(new StringBuilder("Unexpected protocol: ").append(p3).toString());
	                    } else {
	                        v0_14 = dfx.c;
	                    }
	                } else {
	                    v0_14 = dfx.d;
	                }
	            } else {
	                v0_14 = dfx.b;
	            }
	        } else {
	            v0_14 = dfx.a;
	        }
	        return v0_14;
	    }
	
	
	    public static dfx valueOf(String p1)
	    {
	        return ((dfx) Enum.valueOf(dfx, p1));
	    }
	
	
	    public static dfx[] values()
	    {
	        return ((dfx[]) dfx.f.clone());
	    }
	
	
	    public final String toString()
	    {
	        return this.e;
	    }
	
