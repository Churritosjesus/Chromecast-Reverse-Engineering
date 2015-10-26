	private static final I a
	private qa b
	
	    static ExpandedMenuView()
	    {
	        int[] v0_1 = new int[2];
	        v0_1 = {16842964, 16843049};
	        android.support.v7.internal.view.menu.ExpandedMenuView.a = v0_1;
	        return;
	    }
	
	
	    public ExpandedMenuView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 16842868);
	        return;
	    }
	
	
	    public ExpandedMenuView(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6);
	        this.setOnItemClickListener(this);
	        android.content.res.TypedArray v0_1 = th.a(p5, p6, android.support.v7.internal.view.menu.ExpandedMenuView.a, p7, 0);
	        if (v0_1.d(0)) {
	            this.setBackgroundDrawable(v0_1.a(0));
	        }
	        if (v0_1.d(1)) {
	            this.setDivider(v0_1.a(1));
	        }
	        v0_1.a.recycle();
	        return;
	    }
	
	
	    public final void a(qa p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    public final boolean a(qe p4)
	    {
	        return this.b.a(p4, 0, 0);
	    }
	
	
	    protected final void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        this.setChildrenDrawingCacheEnabled(0);
	        return;
	    }
	
	
	    public final void onItemClick(android.widget.AdapterView p2, android.view.View p3, int p4, long p5)
	    {
	        this.a(((qe) this.getAdapter().getItem(p4)));
	        return;
	    }
	
