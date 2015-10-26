	private final abj a
	private final android.graphics.drawable.StateListDrawable b
	
	    public acy(android.content.Context p4, acx p5, abj p6, android.graphics.drawable.StateListDrawable p7)
	    {
	        int v0_1 = abj.b(abn.c);
	        acx[] v1_1 = new acx[1];
	        v1_1[0] = p5;
	        this(p4, v0_1, v1_1);
	        this.a = p6;
	        this.b = p7;
	        return;
	    }
	
	
	    public final android.view.View getView(int p9, android.view.View p10, android.view.ViewGroup p11)
	    {
	        return this.a.a(p10, p11, ((acx) this.getItem(p9)), p9, abn.c, 0, this.b);
	    }
	
