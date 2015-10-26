	public static final enum  a
	public static final enum  b
	public static final enum  c
	public static final enum  d
	private static final synthetic I e
	
	    static biv()
	    {
	        biv.a = 1;
	        biv.b = 2;
	        biv.c = 3;
	        biv.d = 4;
	        int[] v0_1 = new int[4];
	        v0_1[0] = biv.a;
	        v0_1[1] = biv.b;
	        v0_1[2] = biv.c;
	        v0_1[3] = biv.d;
	        biv.e = v0_1;
	        return;
	    }
	
	
	    public static int[] a()
	    {
	        return ((int[]) biv.e.clone());
	    }
	
