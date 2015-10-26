	  a
	  b
	  c
	  d
	private final android.graphics.Paint e
	private final android.graphics.RectF f
	private final android.graphics.Rect g
	
	    public zu(int p3, float p4)
	    {
	        this.c = 0;
	        this.d = 1;
	        this.a = p4;
	        this.e = new android.graphics.Paint(5);
	        this.e.setColor(p3);
	        this.f = new android.graphics.RectF();
	        this.g = new android.graphics.Rect();
	        return;
	    }
	
	
	    void a(android.graphics.Rect p7)
	    {
	        if (p7 == null) {
	            p7 = this.getBounds();
	        }
	        this.f.set(((float) p7.left), ((float) p7.top), ((float) p7.right), ((float) p7.bottom));
	        this.g.set(p7);
	        if (this.c) {
	            this.g.inset(((int) Math.ceil(((double) zv.b(this.b, this.a, this.d)))), ((int) Math.ceil(((double) zv.a(this.b, this.a, this.d)))));
	            this.f.set(this.g);
	        }
	        return;
	    }
	
	
	    public final void draw(android.graphics.Canvas p5)
	    {
	        p5.drawRoundRect(this.f, this.a, this.a, this.e);
	        return;
	    }
	
	
	    public final int getOpacity()
	    {
	        return -3;
	    }
	
	
	    public final void getOutline(android.graphics.Outline p3)
	    {
	        p3.setRoundRect(this.g, this.a);
	        return;
	    }
	
	
	    protected final void onBoundsChange(android.graphics.Rect p1)
	    {
	        super.onBoundsChange(p1);
	        this.a(p1);
	        return;
	    }
	
	
	    public final void setAlpha(int p1)
	    {
	        return;
	    }
	
	
	    public final void setColorFilter(android.graphics.ColorFilter p1)
	    {
	        return;
	    }
	
