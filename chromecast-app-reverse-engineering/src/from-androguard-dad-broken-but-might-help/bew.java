	public static final enum  a
	public static final enum  b
	public static final enum  c
	public static final enum  d
	private static final synthetic I e
	
	    static bew()
	    {
	        bew.a = 1;
	        bew.b = 2;
	        bew.c = 3;
	        bew.d = 4;
	        int[] v0_1 = new int[4];
	        v0_1[0] = bew.a;
	        v0_1[1] = bew.b;
	        v0_1[2] = bew.c;
	        v0_1[3] = bew.d;
	        bew.e = v0_1;
	        return;
	    }
	
	
	    public static int[] a()
	    {
	        return ((int[]) bew.e.clone());
	    }
	
