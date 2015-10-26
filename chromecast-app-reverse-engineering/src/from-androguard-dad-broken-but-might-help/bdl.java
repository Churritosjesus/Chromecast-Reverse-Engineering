	public static final enum bdl a
	private static enum bdl c
	private static enum bdl d
	private static enum bdl e
	private static enum bdl f
	private static enum bdl g
	private static enum bdl h
	private static enum bdl i
	private static enum bdl j
	private static enum bdl k
	private static enum bdl l
	private static final synthetic Lbdl m
	public final  b
	
	    static bdl()
	    {
	        bdl.a = new bdl("UNKNOWN", 0, 0);
	        bdl.c = new bdl("DISCONNECTED", 1, 1);
	        bdl.d = new bdl("INTERFACE_DISABLED", 2, 2);
	        bdl.e = new bdl("INACTIVE", 3, 3);
	        bdl.f = new bdl("SCANNING", 4, 4);
	        bdl.g = new bdl("AUTHENTICATING", 5, 5);
	        bdl.h = new bdl("ASSOCIATING", 6, 6);
	        bdl.i = new bdl("ASSOCIATED", 7, 7);
	        bdl.j = new bdl("FOUR_WAY_HANDSHAKE", 8, 8);
	        bdl.k = new bdl("GROUP_HANDSHAKE", 9, 9);
	        bdl.l = new bdl("COMPLETED", 10, 10);
	        bdl[] v0_23 = new bdl[11];
	        v0_23[0] = bdl.a;
	        v0_23[1] = bdl.c;
	        v0_23[2] = bdl.d;
	        v0_23[3] = bdl.e;
	        v0_23[4] = bdl.f;
	        v0_23[5] = bdl.g;
	        v0_23[6] = bdl.h;
	        v0_23[7] = bdl.i;
	        v0_23[8] = bdl.j;
	        v0_23[9] = bdl.k;
	        v0_23[10] = bdl.l;
	        bdl.m = v0_23;
	        return;
	    }
	
	
	    private bdl(String p1, int p2, int p3)
	    {
	        this(p1, p2);
	        this.b = p3;
	        return;
	    }
	
	
	    public static bdl a(int p5)
	    {
	        bdl[] v2 = bdl.values();
	        int v1 = 0;
	        while (v1 < v2.length) {
	            int v0_1 = v2[v1];
	            if (v0_1.b != p5) {
	                v1++;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public static bdl valueOf(String p1)
	    {
	        return ((bdl) Enum.valueOf(bdl, p1));
	    }
	
	
	    public static bdl[] values()
	    {
	        return ((bdl[]) bdl.m.clone());
	    }
	
