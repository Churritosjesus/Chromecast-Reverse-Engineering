	private static final java.util.Locale c
	public final  a
	private final java.lang.String b
	
	    static blp()
	    {
	        blp.c = java.util.Locale.US;
	        return;
	    }
	
	
	    public blp(String p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public blp(String p2, boolean p3)
	    {
	        this.b = p2;
	        this.a = 0;
	        return;
	    }
	
	
	    public final varargs void a(String p3, Object[] p4)
	    {
	        android.util.Log.w(this.b, String.format(blp.c, p3, p4));
	        return;
	    }
	
	
	    public final varargs void a(Throwable p3, String p4, Object[] p5)
	    {
	        android.util.Log.w(this.b, String.format(blp.c, p4, p5), p3);
	        return;
	    }
	
	
	    public final varargs void b(String p3, Object[] p4)
	    {
	        android.util.Log.e(this.b, String.format(blp.c, p3, p4));
	        return;
	    }
	
	
	    public final varargs void b(Throwable p3, String p4, Object[] p5)
	    {
	        android.util.Log.e(this.b, String.format(blp.c, p4, p5), p3);
	        return;
	    }
	
