	public static final enum  a
	public static final enum  b
	public static final enum  c
	private static final synthetic I d
	
	    static abn()
	    {
	        abn.a = 1;
	        abn.b = 2;
	        abn.c = 3;
	        int[] v0_1 = new int[3];
	        v0_1[0] = abn.a;
	        v0_1[1] = abn.b;
	        v0_1[2] = abn.c;
	        abn.d = v0_1;
	        return;
	    }
	
	
	    public static int[] a()
	    {
	        return ((int[]) abn.d.clone());
	    }
	
