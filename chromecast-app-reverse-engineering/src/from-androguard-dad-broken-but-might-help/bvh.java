	public static final bwe a
	public static final bvz b
	private static bwd d
	private static bvm e
	public final bvm c
	private final java.lang.String f
	private final  g
	private java.lang.String h
	private  i
	private java.lang.String j
	private java.lang.String k
	private final  l
	private final cac m
	private final bvl n
	
	    static bvh()
	    {
	        bvh.a = new bwe();
	        bvh.d = new bvi();
	        com.google.android.gms.common.api.Scope[] v4_1 = new com.google.android.gms.common.api.Scope[0];
	        bvh.b = new bvz("ClearcutLogger.API", bvh.d, bvh.a, v4_1);
	        bvh.e = new ckc();
	        return;
	    }
	
	
	    private bvh(android.content.Context p4, int p5, String p6, String p7, String p8, boolean p9, bvm p10, cac p11, bvl p12)
	    {
	        int v0 = 0;
	        this.i = -1;
	        this.f = p4.getPackageName();
	        this.g = bvh.a(p4);
	        this.i = -1;
	        this.h = p6;
	        this.j = p7;
	        this.k = p8;
	        this.l = 0;
	        this.c = p10;
	        this.m = p11;
	        this.n = p12;
	        if (this.l) {
	            if (this.j == null) {
	                v0 = 1;
	            }
	            a.b(v0, "can\'t be anonymous with an upload account");
	        }
	        return;
	    }
	
	
	    public bvh(android.content.Context p11, String p12, String p13, String p14)
	    {
	        this(p11, -1, p12, 0, 0, 0, bvh.e, cad.c(), new bvl());
	        return;
	    }
	
	
	    private static int a(android.content.Context p4)
	    {
	        try {
	            int v0 = p4.getPackageManager().getPackageInfo(p4.getPackageName(), 0).versionCode;
	        } catch (String v1) {
	            android.util.Log.wtf("ClearcutLogger", "This can\'t happen.");
	        }
	        return v0;
	    }
	
	
	    static synthetic int a(bvh p1)
	    {
	        return p1.i;
	    }
	
	
	    static synthetic String b(bvh p1)
	    {
	        return p1.h;
	    }
	
	
	    static synthetic String c(bvh p1)
	    {
	        return p1.j;
	    }
	
	
	    static synthetic String d(bvh p1)
	    {
	        return p1.k;
	    }
	
	
	    static synthetic cac e(bvh p1)
	    {
	        return p1.m;
	    }
	
	
	    static synthetic bvl f(bvh p1)
	    {
	        return p1.n;
	    }
	
	
	    public static synthetic boolean g(bvh p1)
	    {
	        return p1.l;
	    }
	
	
	    public static synthetic String h(bvh p1)
	    {
	        return p1.f;
	    }
	
	
	    public static synthetic int i(bvh p1)
	    {
	        return p1.g;
	    }
	
	
	    public static synthetic bvm j(bvh p1)
	    {
	        return p1.c;
	    }
	
