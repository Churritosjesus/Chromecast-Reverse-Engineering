	private static  b
	 java.lang.String a
	private java.lang.String c
	private  d
	private  e
	
	    static buu()
	    {
	        buu.b = 0;
	        return;
	    }
	
	
	    public buu(String p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    private buu(String p2, boolean p3)
	    {
	        this.c = p2;
	        this.d = p3;
	        this.e = 0;
	        return;
	    }
	
	
	    private varargs String e(String p3, Object[] p4)
	    {
	        if (p4.length != 0) {
	            p3 = String.format(java.util.Locale.ROOT, p3, p4);
	        }
	        if (!android.text.TextUtils.isEmpty(this.a)) {
	            p3 = new StringBuilder().append(this.a).append(p3).toString();
	        }
	        return p3;
	    }
	
	
	    public final varargs void a(String p1, Object[] p2)
	    {
	        return;
	    }
	
	
	    public final varargs void a(Throwable p2, String p3, Object[] p4)
	    {
	        if (this.d) {
	            this.e(p3, p4);
	        }
	        return;
	    }
	
	
	    public final varargs void b(String p2, Object[] p3)
	    {
	        if (this.d) {
	            this.e(p2, p3);
	        }
	        return;
	    }
	
	
	    public final varargs void c(String p1, Object[] p2)
	    {
	        this.e(p1, p2);
	        return;
	    }
	
	
	    public final varargs void d(String p3, Object[] p4)
	    {
	        android.util.Log.w(this.c, this.e(p3, p4));
	        return;
	    }
	
