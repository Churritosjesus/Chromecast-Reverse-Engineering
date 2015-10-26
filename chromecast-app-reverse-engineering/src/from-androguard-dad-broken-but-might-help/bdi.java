	public static final enum  a
	public static final enum  b
	public static final enum  c
	public static final enum  d
	public static final enum  e
	public static final enum  f
	private static final synthetic I g
	
	    static bdi()
	    {
	        bdi.a = 1;
	        bdi.b = 2;
	        bdi.c = 3;
	        bdi.d = 4;
	        bdi.e = 5;
	        bdi.f = 6;
	        int[] v0_2 = new int[6];
	        v0_2[0] = bdi.a;
	        v0_2[1] = bdi.b;
	        v0_2[2] = bdi.c;
	        v0_2[3] = bdi.d;
	        v0_2[4] = bdi.e;
	        v0_2[5] = bdi.f;
	        bdi.g = v0_2;
	        return;
	    }
	
	
	    public static int[] a()
	    {
	        return ((int[]) bdi.g.clone());
	    }
	
