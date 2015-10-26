	public android.content.Context a
	public qa b
	public qn c
	public wg d
	private android.view.View e
	
	    public yt(android.content.Context p7, android.view.View p8, int p9)
	    {
	        this(p7, p8, 5, a.L, 0);
	        return;
	    }
	
	
	    private yt(android.content.Context p8, android.view.View p9, int p10, int p11, int p12)
	    {
	        this.a = p8;
	        this.b = new qa(p8);
	        this.b.a(this);
	        this.e = p9;
	        this.c = new qn(p8, this.b, p9, 0, p11, 0);
	        this.c.f = p10;
	        this.c.d = this;
	        return;
	    }
	
	
	    public final void a(qa p1)
	    {
	        return;
	    }
	
	
	    public final void a(qa p1, boolean p2)
	    {
	        return;
	    }
	
	
	    public final boolean a(qa p2, android.view.MenuItem p3)
	    {
	        int v0_1;
	        if (this.d == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.d.a(p3);
	        }
	        return v0_1;
	    }
	
	
	    public final boolean a_(qa p5)
	    {
	        int v0 = 1;
	        if (p5 != null) {
	            if (p5.hasVisibleItems()) {
	                new qn(this.a, p5, this.e).b();
	            }
	        } else {
	            v0 = 0;
	        }
	        return v0;
	    }
	
