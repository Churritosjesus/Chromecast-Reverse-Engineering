	public static final java.lang.Object b
	private static final buu f
	  a
	private  c
	private  d
	private bux e
	
	    static buy()
	    {
	        buy.f = new buu("RequestTracker");
	        buy.b = new Object();
	        return;
	    }
	
	
	    public buy(long p3)
	    {
	        this.c = 86400000;
	        this.a = -1;
	        this.d = 0;
	        return;
	    }
	
	
	    void a()
	    {
	        this.a = -1;
	        this.e = 0;
	        this.d = 0;
	        return;
	    }
	
	
	    public final void a(long p6, bux p8)
	    {
	        Throwable v0_0 = this.e;
	        this.a = p6;
	        this.e = p8;
	        this.d = android.os.SystemClock.elapsedRealtime();
	        if (v0_0 != null) {
	            v0_0.a();
	        }
	        return;
	    }
	
	
	    public final boolean a(long p8)
	    {
	        try {
	            if ((this.a == -1) || (this.a != p8)) {
	                int v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	        } catch (int v0_3) {
	            throw v0_3;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean a(long p12, int p14)
	    {
	        Throwable v2 = 1;
	        if ((this.a == -1) || ((p12 - this.d) < this.c)) {
	            v2 = 0;
	            bux v0_1 = 0;
	        } else {
	            Object[] v5_1 = new Object[1];
	            v5_1[0] = Long.valueOf(this.a);
	            buy.f.b("request %d timed out", v5_1);
	            v0_1 = this.e;
	            this.a();
	        }
	        if (v0_1 != null) {
	            v0_1.a(2102, 0);
	        }
	        return v2;
	    }
	
	
	    public final boolean a(long p10, int p12, Object p13)
	    {
	        int v1 = 1;
	        bux v0_0 = 0;
	        if ((this.a == -1) || (this.a != p10)) {
	            v1 = 0;
	        } else {
	            Object[] v4_5 = new Object[1];
	            v4_5[0] = Long.valueOf(this.a);
	            buy.f.b("request %d completed", v4_5);
	            v0_0 = this.e;
	            this.a();
	        }
	        if (v0_0 != null) {
	            v0_0.a(p12, p13);
	        }
	        return v1;
	    }
	
	
	    public final boolean b()
	    {
	        try {
	            int v0_1;
	            if (this.a == -1) {
	                v0_1 = 0;
	            } else {
	                v0_1 = 1;
	            }
	        } catch (int v0_2) {
	            throw v0_2;
	        }
	        return v0_1;
	    }
	
