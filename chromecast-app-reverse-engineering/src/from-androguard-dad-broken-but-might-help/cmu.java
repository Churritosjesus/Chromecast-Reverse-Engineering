	public static final I a
	public static final Ljava.lang.String b
	public static final [B c
	public static final B d
	
	    static cmu()
	    {
	        byte[] v0_0 = new int[0];
	        cmu.a = v0_0;
	        byte[] v0_1 = new String[0];
	        cmu.b = v0_1;
	        byte[] v0_2 = new byte[][0];
	        cmu.c = v0_2;
	        byte[] v0_3 = new byte[0];
	        cmu.d = v0_3;
	        return;
	    }
	
	
	    static int a(int p1)
	    {
	        return (p1 & 7);
	    }
	
	
	    static int a(int p1, int p2)
	    {
	        return ((p1 << 3) | p2);
	    }
	
	
	    public static final int a(cmj p3, int p4)
	    {
	        int v0 = 1;
	        int v1 = p3.i();
	        p3.b(p4);
	        while (p3.a() == p4) {
	            p3.b(p4);
	            v0++;
	        }
	        p3.e(v1);
	        return v0;
	    }
	
	
	    public static int b(int p1)
	    {
	        return (p1 >> 3);
	    }
	
