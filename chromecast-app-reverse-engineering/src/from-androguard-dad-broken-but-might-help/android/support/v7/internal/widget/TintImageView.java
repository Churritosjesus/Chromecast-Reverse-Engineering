	private static final I a
	private final tf b
	
	    static TintImageView()
	    {
	        int[] v0_1 = new int[2];
	        v0_1 = {16842964, 16843033};
	        android.support.v7.internal.widget.TintImageView.a = v0_1;
	        return;
	    }
	
	
	    public TintImageView(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public TintImageView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public TintImageView(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6, p7);
	        tf v0_1 = th.a(this.getContext(), p6, android.support.v7.internal.widget.TintImageView.a, p7, 0);
	        if (v0_1.a.length() > 0) {
	            if (v0_1.d(0)) {
	                this.setBackgroundDrawable(v0_1.a(0));
	            }
	            if (v0_1.d(1)) {
	                this.setImageDrawable(v0_1.a(1));
	            }
	        }
	        v0_1.a.recycle();
	        this.b = v0_1.a();
	        return;
	    }
	
	
	    public void setImageResource(int p3)
	    {
	        this.setImageDrawable(this.b.a(p3, 0));
	        return;
	    }
	
