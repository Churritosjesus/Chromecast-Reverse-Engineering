	public static final enum dgg a
	public static final enum dgg b
	public static final enum dgg c
	private static enum dgg e
	private static final synthetic Ldgg f
	final java.lang.String d
	
	    static dgg()
	    {
	        dgg.a = new dgg("TLS_1_2", 0, "TLSv1.2");
	        dgg.b = new dgg("TLS_1_1", 1, "TLSv1.1");
	        dgg.c = new dgg("TLS_1_0", 2, "TLSv1");
	        dgg.e = new dgg("SSL_3_0", 3, "SSLv3");
	        dgg[] v0_9 = new dgg[4];
	        v0_9[0] = dgg.a;
	        v0_9[1] = dgg.b;
	        v0_9[2] = dgg.c;
	        v0_9[3] = dgg.e;
	        dgg.f = v0_9;
	        return;
	    }
	
	
	    private dgg(String p1, int p2, String p3)
	    {
	        this(p1, p2);
	        this.d = p3;
	        return;
	    }
	
	
	    public static dgg a(String p3)
	    {
	        int v0_0 = -1;
	        switch (p3.hashCode()) {
	            case -503070503:
	                if (!p3.equals("TLSv1.1")) {
	                } else {
	                    v0_0 = 1;
	                }
	                break;
	            case -503070502:
	                if (!p3.equals("TLSv1.2")) {
	                } else {
	                    v0_0 = 0;
	                }
	                break;
	            case 79201641:
	                if (!p3.equals("SSLv3")) {
	                } else {
	                    v0_0 = 3;
	                }
	                break;
	            case 79923350:
	                if (!p3.equals("TLSv1")) {
	                } else {
	                    v0_0 = 2;
	                }
	                break;
	        }
	        int v0_1;
	        switch (v0_0) {
	            case 0:
	                v0_1 = dgg.a;
	                break;
	            case 1:
	                v0_1 = dgg.b;
	                break;
	            case 2:
	                v0_1 = dgg.c;
	                break;
	            case 3:
	                v0_1 = dgg.e;
	                break;
	            default:
	                throw new IllegalArgumentException(new StringBuilder("Unexpected TLS version: ").append(p3).toString());
	        }
	        return v0_1;
	    }
	
	
	    public static dgg valueOf(String p1)
	    {
	        return ((dgg) Enum.valueOf(dgg, p1));
	    }
	
	
	    public static dgg[] values()
	    {
	        return ((dgg[]) dgg.f.clone());
	    }
	
