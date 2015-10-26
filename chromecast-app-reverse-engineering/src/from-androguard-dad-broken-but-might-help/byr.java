	private java.lang.Object a
	private  b
	private synthetic byo c
	
	    public byr(byo p2, Object p3)
	    {
	        this.c = p2;
	        this.a = p3;
	        this.b = 0;
	        return;
	    }
	
	
	    public final void b()
	    {
	        Throwable v0_0 = this.a;
	        if (this.b) {
	            android.util.Log.w("GmsClient", new StringBuilder("Callback proxy ").append(this).append(" being reused. This is not safe.").toString());
	        }
	        if (v0_0 != null) {
	            try {
	                this.a(v0_0);
	            } catch (Throwable v0_2) {
	                throw v0_2;
	            }
	        }
	        this.b = 1;
	        this.c();
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.d();
	        byo.d(this.c);
	        try {
	            byo.d(this.c).remove(this);
	            return;
	        } catch (Throwable v0_3) {
	            throw v0_3;
	        }
	    }
	
	
	    public final void d()
	    {
	        try {
	            this.a = 0;
	            return;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
