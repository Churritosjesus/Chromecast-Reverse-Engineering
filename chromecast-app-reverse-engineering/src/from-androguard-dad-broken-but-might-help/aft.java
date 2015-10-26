	public static final enum  a
	public static final enum  b
	public static final enum  c
	private static final synthetic I d
	
	    static aft()
	    {
	        aft.a = 1;
	        aft.b = 2;
	        aft.c = 3;
	        int[] v0_1 = new int[3];
	        v0_1[0] = aft.a;
	        v0_1[1] = aft.b;
	        v0_1[2] = aft.c;
	        aft.d = v0_1;
	        return;
	    }
	
	
	    public static int[] a()
	    {
	        return ((int[]) aft.d.clone());
	    }
	
