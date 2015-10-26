	static final I a
	static final Ljava.lang.Object b
	
	    static ef()
	    {
	        Object[] v0_0 = new int[0];
	        ef.a = v0_0;
	        Object[] v0_1 = new Object[0];
	        ef.b = v0_1;
	        return;
	    }
	
	
	    public static int a(int p4)
	    {
	        int v0_0 = (p4 << 2);
	        int v1 = 4;
	        while (v1 < 32) {
	            if (v0_0 > ((1 << v1) - 12)) {
	                v1++;
	            } else {
	                v0_0 = ((1 << v1) - 12);
	                break;
	            }
	        }
	        return (v0_0 / 4);
	    }
	
	
	    public static int a(int[] p4, int p5, int p6)
	    {
	        int v2 = 0;
	        int v1_1 = (p5 - 1);
	        while (v2 <= v1_1) {
	            int v0_1 = ((v2 + v1_1) >> 1);
	            int v3 = p4[v0_1];
	            if (v3 >= p6) {
	                if (v3 > p6) {
	                    v1_1 = (v0_1 - 1);
	                }
	            } else {
	                v2 = (v0_1 + 1);
	            }
	            return v0_1;
	        }
	        v0_1 = (v2 ^ -1);
	        return v0_1;
	    }
	
	
	    public static boolean a(Object p1, Object p2)
	    {
	        if ((p1 != p2) && ((p1 == null) || (!p1.equals(p2)))) {
	            int v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
