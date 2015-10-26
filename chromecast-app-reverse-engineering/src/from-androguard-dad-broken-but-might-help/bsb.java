	private static bridge android.os.Handler d
	final brb a
	final java.lang.Runnable b
	bridge  c
	
	    bsb(brb p2)
	    {
	        a.c(p2);
	        this.a = p2;
	        this.b = new bsc(this);
	        return;
	    }
	
	
	    static synthetic long a(bsb p2, long p3)
	    {
	        p2.c = 0;
	        return 0;
	    }
	
	
	    static synthetic brb a(bsb p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic boolean b(bsb p1)
	    {
	        return 0;
	    }
	
	
	    public final void a(long p4)
	    {
	        this.c();
	        if (p4 >= 0) {
	            this.c = this.a.c.a();
	            if (!this.d().postDelayed(this.b, p4)) {
	                this.a.a().e("Failed to schedule delayed post. time", Long.valueOf(p4));
	            }
	        }
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        int v0_2;
	        if (this.c == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final void c()
	    {
	        this.c = 0;
	        this.d().removeCallbacks(this.b);
	        return;
	    }
	
	
	    android.os.Handler d()
	    {
	        android.os.Handler v0_4;
	        if (bsb.d == null) {
	            try {
	                if (bsb.d == null) {
	                    bsb.d = new android.os.Handler(this.a.a.getMainLooper());
	                }
	            } catch (android.os.Handler v0_5) {
	                throw v0_5;
	            }
	            v0_4 = bsb.d;
	        } else {
	            v0_4 = bsb.d;
	        }
	        return v0_4;
	    }
	
