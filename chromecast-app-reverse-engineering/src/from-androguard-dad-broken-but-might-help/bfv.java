	public static final enum bfv a
	private static enum bfv c
	private static enum bfv d
	private static enum bfv e
	private static enum bfv f
	private static enum bfv g
	private static final synthetic Lbfv h
	public final  b
	
	    static bfv()
	    {
	        bfv.a = new bfv("UNKNOWN", 0, 0);
	        bfv.c = new bfv("NONE", 1, 1);
	        bfv.d = new bfv("WEP", 2, 2);
	        bfv.e = new bfv("TKIP", 3, 3);
	        bfv.f = new bfv("CCMP", 4, 4);
	        bfv.g = new bfv("AES", 5, 5);
	        bfv[] v0_13 = new bfv[6];
	        v0_13[0] = bfv.a;
	        v0_13[1] = bfv.c;
	        v0_13[2] = bfv.d;
	        v0_13[3] = bfv.e;
	        v0_13[4] = bfv.f;
	        v0_13[5] = bfv.g;
	        bfv.h = v0_13;
	        return;
	    }
	
	
	    private bfv(String p1, int p2, int p3)
	    {
	        this(p1, p2);
	        this.b = p3;
	        return;
	    }
	
	
	    public static bfv a(int p5)
	    {
	        bfv[] v2 = bfv.values();
	        int v1 = 0;
	        while (v1 < v2.length) {
	            int v0_1 = v2[v1];
	            if (v0_1.b != p5) {
	                v1++;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public static bfv valueOf(String p1)
	    {
	        return ((bfv) Enum.valueOf(bfv, p1));
	    }
	
	
	    public static bfv[] values()
	    {
	        return ((bfv[]) bfv.h.clone());
	    }
	
