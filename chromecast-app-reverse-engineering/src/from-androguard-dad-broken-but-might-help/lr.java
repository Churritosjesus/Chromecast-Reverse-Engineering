	public java.lang.Object a
	public ls b
	
	    private lr(int p2, android.content.Context p3, android.view.animation.Interpolator p4)
	    {
	        if (p2 < 14) {
	            if (p2 < 9) {
	                this.b = new lt();
	            } else {
	                this.b = new lu();
	            }
	        } else {
	            this.b = new lv();
	        }
	        this.a = this.b.a(p3, p4);
	        return;
	    }
	
	
	    private lr(android.content.Context p2, android.view.animation.Interpolator p3)
	    {
	        this(android.os.Build$VERSION.SDK_INT, p2, p3);
	        return;
	    }
	
	
	    public static lr a(android.content.Context p1, android.view.animation.Interpolator p2)
	    {
	        return new lr(p1, p2);
	    }
	
	
	    public final int a()
	    {
	        return this.b.b(this.a);
	    }
	
	
	    public final void a(int p8, int p9, int p10, int p11, int p12)
	    {
	        this.b.a(this.a, p8, p9, p10, p11, p12);
	        return;
	    }
	
	
	    public final void a(int p11, int p12, int p13, int p14, int p15, int p16, int p17, int p18)
	    {
	        this.b.a(this.a, 0, 0, p13, p14, p15, p16, -2147483648, 2147483647);
	        return;
	    }
	
	
	    public final int b()
	    {
	        return this.b.c(this.a);
	    }
	
	
	    public final int c()
	    {
	        return this.b.g(this.a);
	    }
	
	
	    public final int d()
	    {
	        return this.b.h(this.a);
	    }
	
	
	    public final boolean e()
	    {
	        return this.b.e(this.a);
	    }
	
	
	    public final void f()
	    {
	        this.b.f(this.a);
	        return;
	    }
	
