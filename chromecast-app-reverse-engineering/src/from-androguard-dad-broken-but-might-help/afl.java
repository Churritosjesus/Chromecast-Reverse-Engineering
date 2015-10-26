	public static final enum afl a
	public static final enum afl b
	public static final enum afl c
	private static enum afl e
	private static enum afl f
	private static enum afl g
	private static enum afl h
	private static final synthetic Lafl i
	final  d
	
	    static afl()
	    {
	        afl.e = new afl("NONE", 0, 0);
	        afl.a = new afl("FACEBOOK_APPLICATION_WEB", 1, 1);
	        afl.f = new afl("FACEBOOK_APPLICATION_NATIVE", 2, 1);
	        afl.b = new afl("FACEBOOK_APPLICATION_SERVICE", 3, 1);
	        afl.c = new afl("WEB_VIEW", 4, 0);
	        afl.g = new afl("TEST_USER", 5, 1);
	        afl.h = new afl("CLIENT_TOKEN", 6, 1);
	        afl[] v0_15 = new afl[7];
	        v0_15[0] = afl.e;
	        v0_15[1] = afl.a;
	        v0_15[2] = afl.f;
	        v0_15[3] = afl.b;
	        v0_15[4] = afl.c;
	        v0_15[5] = afl.g;
	        v0_15[6] = afl.h;
	        afl.i = v0_15;
	        return;
	    }
	
	
	    private afl(String p1, int p2, boolean p3)
	    {
	        this(p1, p2);
	        this.d = p3;
	        return;
	    }
	
	
	    public static afl valueOf(String p1)
	    {
	        return ((afl) Enum.valueOf(afl, p1));
	    }
	
	
	    public static afl[] values()
	    {
	        return ((afl[]) afl.i.clone());
	    }
	
