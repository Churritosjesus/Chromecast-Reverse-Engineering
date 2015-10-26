	public final android.support.v7.widget.Toolbar a
	public final android.graphics.drawable.Drawable b
	public final java.lang.CharSequence c
	public bridge java.lang.Object d
	public final java.util.concurrent.CountDownLatch e
	public  f
	public  g
	
	    dh()
	    {
	        this.e = new java.util.concurrent.CountDownLatch(1);
	        this.f = -1;
	        this.g = -1;
	        return;
	    }
	
	
	    public int a(Object p2)
	    {
	        return this.b(p2);
	    }
	
	
	    public android.graphics.drawable.Drawable a()
	    {
	        return this.b;
	    }
	
	
	    public void a(int p3)
	    {
	        if (p3 != 0) {
	            this.a.b(p3);
	        } else {
	            this.a.c(this.c);
	        }
	        return;
	    }
	
	
	    public void a(agp p1)
	    {
	        return;
	    }
	
	
	    public void a(android.graphics.drawable.Drawable p2, int p3)
	    {
	        this.a.a(p2);
	        this.a(p3);
	        return;
	    }
	
	
	    public void a(bxl p3)
	    {
	        a.f(p3, "Notifier must not be null");
	        0.sendMessage(0.obtainMessage(1, p3));
	        return;
	    }
	
	
	    public void a(Object p1, dep p2)
	    {
	        this.b(p1, p2);
	        return;
	    }
	
	
	    public int b(Object p4)
	    {
	        throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type 0").toString());
	    }
	
	
	    public android.content.Context b()
	    {
	        return this.a.getContext();
	    }
	
	
	    public void b(bxl p2)
	    {
	        return;
	    }
	
	
	    public void b(Object p4, dep p5)
	    {
	        try {
	            p5.c(0);
	            throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type 0").toString());
	        } catch (java.io.IOException v0_3) {
	            throw new IllegalStateException(v0_3);
	        }
	    }
	
	
	    public boolean c()
	    {
	        return 1;
	    }
	
	
	    public boolean d()
	    {
	        return 0;
	    }
	
	
	    public java.util.Set e()
	    {
	        return 0;
	    }
	
	
	    public void f()
	    {
	        this.d = 0;
	        return;
	    }
	
	
	    public void g()
	    {
	        if (this.f == -1) {
	            this.f = System.nanoTime();
	            return;
	        } else {
	            throw new IllegalStateException();
	        }
	    }
	
	
	    public void h()
	    {
	        if ((this.g == -1) && (this.f != -1)) {
	            this.g = System.nanoTime();
	            this.e.countDown();
	            return;
	        } else {
	            throw new IllegalStateException();
	        }
	    }
	
