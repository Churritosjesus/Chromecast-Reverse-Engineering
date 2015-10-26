	private static final wy a
	private  b
	private  c
	private final android.graphics.Rect d
	private final android.graphics.Rect e
	
	    static CardView()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            if (android.os.Build$VERSION.SDK_INT < 17) {
	                android.support.v7.widget.CardView.a = new ww();
	            } else {
	                android.support.v7.widget.CardView.a = new wz();
	            }
	        } else {
	            android.support.v7.widget.CardView.a = new wu();
	        }
	        android.support.v7.widget.CardView.a.a();
	        return;
	    }
	
	
	    public CardView(android.content.Context p3)
	    {
	        this(p3);
	        this.d = new android.graphics.Rect();
	        this.e = new android.graphics.Rect();
	        this.a(p3, 0, 0);
	        return;
	    }
	
	
	    public CardView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3);
	        this.d = new android.graphics.Rect();
	        this.e = new android.graphics.Rect();
	        this.a(p2, p3, 0);
	        return;
	    }
	
	
	    public CardView(android.content.Context p2, android.util.AttributeSet p3, int p4)
	    {
	        this(p2, p3, p4);
	        this.d = new android.graphics.Rect();
	        this.e = new android.graphics.Rect();
	        this.a(p2, p3, p4);
	        return;
	    }
	
	
	    private void a(android.content.Context p9, android.util.AttributeSet p10, int p11)
	    {
	        wy v0_1 = p9.obtainStyledAttributes(p10, or.a, p11, a.ce);
	        int v3 = v0_1.getColor(or.b, 0);
	        float v4 = v0_1.getDimension(or.c, 0);
	        float v5 = v0_1.getDimension(or.d, 0);
	        float v6 = v0_1.getDimension(or.e, 0);
	        this.b = v0_1.getBoolean(or.g, 0);
	        this.c = v0_1.getBoolean(or.f, 1);
	        android.support.v7.widget.CardView v1_10 = v0_1.getDimensionPixelSize(or.h, 0);
	        this.d.left = v0_1.getDimensionPixelSize(or.j, v1_10);
	        this.d.top = v0_1.getDimensionPixelSize(or.l, v1_10);
	        this.d.right = v0_1.getDimensionPixelSize(or.k, v1_10);
	        this.d.bottom = v0_1.getDimensionPixelSize(or.i, v1_10);
	        if (v5 > v6) {
	            v6 = v5;
	        }
	        v0_1.recycle();
	        android.support.v7.widget.CardView.a.a(this, p9, v3, v4, v5, v6);
	        return;
	    }
	
	
	    public final void a(int p5, int p6, int p7, int p8)
	    {
	        this.e.set(p5, p6, p7, p8);
	        super.setPadding((this.d.left + p5), (this.d.top + p6), (this.d.right + p7), (this.d.bottom + p8));
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        return this.b;
	    }
	
	
	    public final boolean b()
	    {
	        return this.c;
	    }
	
	
	    protected void onMeasure(int p5, int p6)
	    {
	        if ((android.support.v7.widget.CardView.a instanceof wu)) {
	            super.onMeasure(p5, p6);
	        } else {
	            int v0_2 = android.view.View$MeasureSpec.getMode(p5);
	            switch (v0_2) {
	                case -2147483648:
	                case 1073741824:
	                    p5 = android.view.View$MeasureSpec.makeMeasureSpec(Math.max(((int) Math.ceil(((double) android.support.v7.widget.CardView.a.a(this)))), android.view.View$MeasureSpec.getSize(p5)), v0_2);
	                    break;
	            }
	            int v0_3 = android.view.View$MeasureSpec.getMode(p6);
	            switch (v0_3) {
	                case -2147483648:
	                case 1073741824:
	                    p6 = android.view.View$MeasureSpec.makeMeasureSpec(Math.max(((int) Math.ceil(((double) android.support.v7.widget.CardView.a.b(this)))), android.view.View$MeasureSpec.getSize(p6)), v0_3);
	                    break;
	            }
	            super.onMeasure(p5, p6);
	        }
	        return;
	    }
	
	
	    public void setPadding(int p1, int p2, int p3, int p4)
	    {
	        return;
	    }
	
	
	    public void setPaddingRelative(int p1, int p2, int p3, int p4)
	    {
	        return;
	    }
	
