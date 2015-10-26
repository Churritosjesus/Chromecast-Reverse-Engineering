	final android.graphics.RectF a
	final android.graphics.Paint b
	final android.graphics.Paint c
	  d
	  e
	  f
	  g
	  h
	 I i
	  j
	  k
	  l
	  m
	  n
	 android.graphics.Path o
	  p
	  q
	  r
	  s
	  t
	final android.graphics.Paint u
	  v
	  w
	private final android.graphics.drawable.Drawable$Callback x
	
	    public lm(android.graphics.drawable.Drawable$Callback p4)
	    {
	        this.a = new android.graphics.RectF();
	        this.b = new android.graphics.Paint();
	        this.c = new android.graphics.Paint();
	        this.d = 0;
	        this.e = 0;
	        this.f = 0;
	        this.g = 1084227584;
	        this.h = 1075838976;
	        this.u = new android.graphics.Paint(1);
	        this.x = p4;
	        this.b.setStrokeCap(android.graphics.Paint$Cap.SQUARE);
	        this.b.setAntiAlias(1);
	        this.b.setStyle(android.graphics.Paint$Style.STROKE);
	        this.c.setStyle(android.graphics.Paint$Style.FILL);
	        this.c.setAntiAlias(1);
	        return;
	    }
	
	
	    int a()
	    {
	        return ((this.j + 1) % this.i.length);
	    }
	
	
	    public final void a(float p1)
	    {
	        this.d = p1;
	        this.d();
	        return;
	    }
	
	
	    public final void a(int p3)
	    {
	        this.j = p3;
	        this.w = this.i[this.j];
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        if (this.n != p2) {
	            this.n = p2;
	            this.d();
	        }
	        return;
	    }
	
	
	    public final void a(int[] p2)
	    {
	        this.i = p2;
	        this.a(0);
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.k = this.d;
	        this.l = this.e;
	        this.m = this.f;
	        return;
	    }
	
	
	    public final void b(float p1)
	    {
	        this.e = p1;
	        this.d();
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.k = 0;
	        this.l = 0;
	        this.m = 0;
	        this.a(0);
	        this.b(0);
	        this.c(0);
	        return;
	    }
	
	
	    public final void c(float p1)
	    {
	        this.f = p1;
	        this.d();
	        return;
	    }
	
	
	    void d()
	    {
	        this.x.invalidateDrawable(0);
	        return;
	    }
	
