	public static final enum  a
	public static final enum  b
	public static final enum  c
	public static final enum  d
	public static final enum  e
	public static final enum  f
	public static final enum  g
	public static final enum  h
	private static final synthetic I i
	
	    static ddt()
	    {
	        ddt.a = 1;
	        ddt.b = 2;
	        ddt.c = 3;
	        ddt.d = 4;
	        ddt.e = 5;
	        ddt.f = 6;
	        ddt.g = 7;
	        ddt.h = 8;
	        int[] v0_4 = new int[8];
	        v0_4[0] = ddt.a;
	        v0_4[1] = ddt.b;
	        v0_4[2] = ddt.c;
	        v0_4[3] = ddt.d;
	        v0_4[4] = ddt.e;
	        v0_4[5] = ddt.f;
	        v0_4[6] = ddt.g;
	        v0_4[7] = ddt.h;
	        ddt.i = v0_4;
	        return;
	    }
	
	
	    public static int[] a()
	    {
	        return ((int[]) ddt.i.clone());
	    }
	
