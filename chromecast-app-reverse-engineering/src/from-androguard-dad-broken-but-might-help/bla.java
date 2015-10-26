	public static final enum  a
	public static final enum  b
	public static final enum  c
	public static final enum  d
	private static final synthetic I e
	
	    static bla()
	    {
	        bla.a = 1;
	        bla.b = 2;
	        bla.c = 3;
	        bla.d = 4;
	        int[] v0_1 = new int[4];
	        v0_1[0] = bla.a;
	        v0_1[1] = bla.b;
	        v0_1[2] = bla.c;
	        v0_1[3] = bla.d;
	        bla.e = v0_1;
	        return;
	    }
	
	
	    public static int[] a()
	    {
	        return ((int[]) bla.e.clone());
	    }
	
