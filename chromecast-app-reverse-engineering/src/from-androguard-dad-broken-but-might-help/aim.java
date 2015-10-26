	public static final enum aim a
	private static enum aim b
	private static enum aim c
	private static enum aim d
	private static enum aim e
	private static enum aim f
	private static enum aim g
	private static enum aim h
	private static final synthetic Laim j
	private final  i
	
	    static aim()
	    {
	        aim.a = new aim("Login", 0, 0);
	        aim.b = new aim("Share", 1, 1);
	        aim.c = new aim("Message", 2, 2);
	        aim.d = new aim("Like", 3, 3);
	        aim.e = new aim("GameRequest", 4, 4);
	        aim.f = new aim("AppGroupCreate", 5, 5);
	        aim.g = new aim("AppGroupJoin", 6, 6);
	        aim.h = new aim("AppInvite", 7, 7);
	        aim[] v0_17 = new aim[8];
	        v0_17[0] = aim.a;
	        v0_17[1] = aim.b;
	        v0_17[2] = aim.c;
	        v0_17[3] = aim.d;
	        v0_17[4] = aim.e;
	        v0_17[5] = aim.f;
	        v0_17[6] = aim.g;
	        v0_17[7] = aim.h;
	        aim.j = v0_17;
	        return;
	    }
	
	
	    private aim(String p1, int p2, int p3)
	    {
	        this(p1, p2);
	        this.i = p3;
	        return;
	    }
	
	
	    public static aim valueOf(String p1)
	    {
	        return ((aim) Enum.valueOf(aim, p1));
	    }
	
	
	    public static aim[] values()
	    {
	        return ((aim[]) aim.j.clone());
	    }
	
	
	    public final int a()
	    {
	        return (afv.k() + this.i);
	    }
	
