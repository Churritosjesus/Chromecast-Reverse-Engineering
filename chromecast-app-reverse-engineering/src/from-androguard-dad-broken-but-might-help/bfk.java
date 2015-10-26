	public static final enum  a
	public static final enum  b
	public static final enum  c
	public static final enum  d
	public static final enum  e
	private static final synthetic I f
	
	    static bfk()
	    {
	        bfk.a = 1;
	        bfk.b = 2;
	        bfk.c = 3;
	        bfk.d = 4;
	        bfk.e = 5;
	        int[] v0_1 = new int[5];
	        v0_1[0] = bfk.a;
	        v0_1[1] = bfk.b;
	        v0_1[2] = bfk.c;
	        v0_1[3] = bfk.d;
	        v0_1[4] = bfk.e;
	        bfk.f = v0_1;
	        return;
	    }
	
	
	    public static int[] a()
	    {
	        return ((int[]) bfk.f.clone());
	    }
	
