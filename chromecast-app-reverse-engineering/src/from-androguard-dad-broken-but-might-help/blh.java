	public static final enum  a
	public static final enum  b
	public static final enum  c
	private static final synthetic I d
	
	    static blh()
	    {
	        blh.a = 1;
	        blh.b = 2;
	        blh.c = 3;
	        int[] v0_1 = new int[3];
	        v0_1[0] = blh.a;
	        v0_1[1] = blh.b;
	        v0_1[2] = blh.c;
	        blh.d = v0_1;
	        return;
	    }
	
	
	    public static int[] a()
	    {
	        return ((int[]) blh.d.clone());
	    }
	
