	public static final enum ajy a
	private static enum ajy c
	private static enum ajy d
	private static enum ajy e
	private static final synthetic Lajy f
	public final java.lang.String b
	
	    static ajy()
	    {
	        ajy.c = new ajy("NONE", 0, 0);
	        ajy.d = new ajy("ONLY_ME", 1, "only_me");
	        ajy.a = new ajy("FRIENDS", 2, "friends");
	        ajy.e = new ajy("EVERYONE", 3, "everyone");
	        ajy[] v0_9 = new ajy[4];
	        v0_9[0] = ajy.c;
	        v0_9[1] = ajy.d;
	        v0_9[2] = ajy.a;
	        v0_9[3] = ajy.e;
	        ajy.f = v0_9;
	        return;
	    }
	
	
	    private ajy(String p1, int p2, String p3)
	    {
	        this(p1, p2);
	        this.b = p3;
	        return;
	    }
	
	
	    public static ajy valueOf(String p1)
	    {
	        return ((ajy) Enum.valueOf(ajy, p1));
	    }
	
	
	    public static ajy[] values()
	    {
	        return ((ajy[]) ajy.f.clone());
	    }
	
