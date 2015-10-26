	private final r b
	private af c
	private j d
	
	    public ac(r p2)
	    {
	        this.c = 0;
	        this.d = 0;
	        this.b = p2;
	        return;
	    }
	
	
	    private static String a(int p3, long p4)
	    {
	        return new StringBuilder("android:switcher:").append(p3).append(":").append(p4).toString();
	    }
	
	
	    public final Object a(android.view.ViewGroup p8, int p9)
	    {
	        if (this.c == null) {
	            this.c = this.b.a();
	        }
	        j v0_5 = this.b.a(ac.a(p8.getId(), ((long) p9)));
	        if (v0_5 == null) {
	            v0_5 = this.a(p9);
	            this.c.a(p8.getId(), v0_5, ac.a(p8.getId(), ((long) p9)));
	        } else {
	            this.c.c(v0_5);
	        }
	        if (v0_5 != this.d) {
	            v0_5.e(0);
	            v0_5.f(0);
	        }
	        return v0_5;
	    }
	
	
	    public final void a(android.view.ViewGroup p2)
	    {
	        if (this.c != null) {
	            this.c.c();
	            this.c = 0;
	            this.b.b();
	        }
	        return;
	    }
	
	
	    public final void a(android.view.ViewGroup p2, int p3, Object p4)
	    {
	        if (this.c == null) {
	            this.c = this.b.a();
	        }
	        this.c.b(((j) p4));
	        return;
	    }
	
	
	    public final boolean a(android.view.View p2, Object p3)
	    {
	        int v0_1;
	        if (((j) p3).N != p2) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final void b(android.view.ViewGroup p4, int p5, Object p6)
	    {
	        if (((j) p6) != this.d) {
	            if (this.d != null) {
	                this.d.e(0);
	                this.d.f(0);
	            }
	            if (((j) p6) != null) {
	                ((j) p6).e(1);
	                ((j) p6).f(1);
	            }
	            this.d = ((j) p6);
	        }
	        return;
	    }
	
