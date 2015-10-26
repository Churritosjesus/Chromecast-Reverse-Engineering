	final java.lang.CharSequence a
	final  b
	final java.lang.Long c
	final java.lang.String d
	final  e
	final acx f
	private final java.lang.CharSequence g
	private  h
	private java.lang.CharSequence i
	
	    public add(acx p3)
	    {
	        this.h = 0;
	        this.g = p3.c;
	        this.a = p3.d.trim();
	        this.b = p3.g;
	        this.c = p3.h;
	        this.d = p3.l;
	        this.e = p3.i;
	        this.f = p3;
	        return;
	    }
	
	
	    public final void a(String p2)
	    {
	        if (!android.text.TextUtils.isEmpty(p2)) {
	            this.i = p2.trim();
	        } else {
	            this.i = p2;
	        }
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        return 0;
	    }
	
	
	    public final CharSequence b()
	    {
	        return this.a;
	    }
	
	
	    public final long c()
	    {
	        return this.b;
	    }
	
	
	    public final Long d()
	    {
	        return this.c;
	    }
	
	
	    public final String e()
	    {
	        return this.d;
	    }
	
	
	    public final long f()
	    {
	        return this.e;
	    }
	
	
	    public final acx g()
	    {
	        return this.f;
	    }
	
	
	    public final CharSequence h()
	    {
	        String v0_3;
	        if (android.text.TextUtils.isEmpty(this.i)) {
	            v0_3 = this.f.d;
	        } else {
	            v0_3 = this.i;
	        }
	        return v0_3;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = String.valueOf(this.g);
	        String v1_1 = String.valueOf(this.a);
	        return new StringBuilder(((String.valueOf(v0_1).length() + 3) + String.valueOf(v1_1).length())).append(v0_1).append(" <").append(v1_1).append(">").toString();
	    }
	
