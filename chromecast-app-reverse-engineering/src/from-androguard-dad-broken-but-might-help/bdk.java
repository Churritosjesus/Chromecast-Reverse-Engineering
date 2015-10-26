	public static final enum bdk a
	public static final enum bdk b
	private static enum bdk d
	private static final synthetic Lbdk e
	public final  c
	
	    static bdk()
	    {
	        bdk.d = new bdk("DEFAULT", 0, 0);
	        bdk.a = new bdk("HOURS_12", 1, 1);
	        bdk.b = new bdk("HOURS_24", 2, 2);
	        bdk[] v0_7 = new bdk[3];
	        v0_7[0] = bdk.d;
	        v0_7[1] = bdk.a;
	        v0_7[2] = bdk.b;
	        bdk.e = v0_7;
	        return;
	    }
	
	
	    private bdk(String p1, int p2, int p3)
	    {
	        this(p1, p2);
	        this.c = p3;
	        return;
	    }
	
	
	    public static bdk a(int p5)
	    {
	        bdk[] v2 = bdk.values();
	        int v1 = 0;
	        while (v1 < v2.length) {
	            int v0_1 = v2[v1];
	            if (v0_1.c != p5) {
	                v1++;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public static bdk valueOf(String p1)
	    {
	        return ((bdk) Enum.valueOf(bdk, p1));
	    }
	
	
	    public static bdk[] values()
	    {
	        return ((bdk[]) bdk.e.clone());
	    }
	
