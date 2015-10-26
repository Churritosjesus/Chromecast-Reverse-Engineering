	public static final enum bnw a
	public static final enum bnw b
	public static final enum bnw c
	public static final enum bnw d
	public static final enum bnw e
	private static final synthetic Lbnw g
	public final  f
	
	    static bnw()
	    {
	        bnw.a = new bnw("ACTIVE_AUDIO", 0, a.ei);
	        bnw.b = new bnw("IDLE_AUDIO", 1, a.eV);
	        bnw.c = new bnw("ACTIVE", 2, a.ej);
	        bnw.d = new bnw("IDLE", 3, a.eW);
	        bnw.e = new bnw("MIRRORING", 4, a.ex);
	        bnw[] v0_11 = new bnw[5];
	        v0_11[0] = bnw.a;
	        v0_11[1] = bnw.b;
	        v0_11[2] = bnw.c;
	        v0_11[3] = bnw.d;
	        v0_11[4] = bnw.e;
	        bnw.g = v0_11;
	        return;
	    }
	
	
	    private bnw(String p1, int p2, int p3)
	    {
	        this(p1, p2);
	        this.f = p3;
	        return;
	    }
	
	
	    public static bnw valueOf(String p1)
	    {
	        return ((bnw) Enum.valueOf(bnw, p1));
	    }
	
	
	    public static bnw[] values()
	    {
	        return ((bnw[]) bnw.g.clone());
	    }
	
