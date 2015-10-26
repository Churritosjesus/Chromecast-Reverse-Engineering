	public static final enum  a
	public static final enum  b
	public static final enum  c
	private static final synthetic I d
	
	    static cvu()
	    {
	        cvu.a = 1;
	        cvu.b = 2;
	        cvu.c = 3;
	        int[] v0_1 = new int[3];
	        v0_1[0] = cvu.a;
	        v0_1[1] = cvu.b;
	        v0_1[2] = cvu.c;
	        cvu.d = v0_1;
	        return;
	    }
	
	
	    public static int[] a()
	    {
	        return ((int[]) cvu.d.clone());
	    }
	
