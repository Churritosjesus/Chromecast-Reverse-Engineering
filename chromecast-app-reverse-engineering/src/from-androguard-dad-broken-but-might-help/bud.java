	public final buu b
	public final java.lang.String c
	public buw d
	
	    protected bud(String p5, String p6, String p7)
	    {
	        a.d(p5);
	        this.c = p5;
	        this.b = new buu(p6);
	        if (!android.text.TextUtils.isEmpty(p7)) {
	            String v0_5;
	            buu v1 = this.b;
	            if (!android.text.TextUtils.isEmpty(p7)) {
	                Object[] v2_1 = new Object[1];
	                v2_1[0] = p7;
	                v0_5 = String.format("[%s] ", v2_1);
	            } else {
	                v0_5 = 0;
	            }
	            v1.a = v0_5;
	        }
	        return;
	    }
	
	
	    public void a(String p1)
	    {
	        return;
	    }
	
	
	    protected final void a(String p7, long p8, String p10)
	    {
	        buw v0_0 = this.b;
	        Object[] v2_1 = new Object[2];
	        v2_1[0] = p7;
	        v2_1[1] = 0;
	        v0_0.a("Sending text message: %s to: %s", v2_1);
	        this.d.a(this.c, p7, p8);
	        return;
	    }
	
	
	    public void c()
	    {
	        return;
	    }
	
	
	    protected final long d()
	    {
	        return this.d.a();
	    }
	
