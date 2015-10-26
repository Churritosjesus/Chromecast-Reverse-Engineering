	private static s c
	private static  d
	public final java.lang.String a
	public final java.lang.Object b
	private java.lang.Object e
	
	    static cks()
	    {
	        new Object();
	        cks.c = 0;
	        cks.d = 0;
	        return;
	    }
	
	
	    protected cks(String p2, Object p3)
	    {
	        this.e = 0;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public static int a()
	    {
	        return 0;
	    }
	
	
	    public static cks a(String p1, Float p2)
	    {
	        return new ckw(p1, p2);
	    }
	
	
	    public static cks a(String p1, Integer p2)
	    {
	        return new ckv(p1, p2);
	    }
	
	
	    public static cks a(String p1, Long p2)
	    {
	        return new cku(p1, p2);
	    }
	
	
	    public static cks a(String p1, String p2)
	    {
	        return new ckx(p1, p2);
	    }
	
	
	    public static cks a(String p2, boolean p3)
	    {
	        return new ckt(p2, Boolean.valueOf(p3));
	    }
	
	
	    public static boolean b()
	    {
	        return 0;
	    }
	
	
	    public final Object c()
	    {
	        return this.a(this.a);
	    }
	
	
	    public final Object d()
	    {
	        long v0 = android.os.Binder.clearCallingIdentity();
	        try {
	            Throwable v2_0 = this.c();
	            android.os.Binder.restoreCallingIdentity(v0);
	            return v2_0;
	        } catch (Throwable v2_1) {
	            android.os.Binder.restoreCallingIdentity(v0);
	            throw v2_1;
	        }
	    }
	
