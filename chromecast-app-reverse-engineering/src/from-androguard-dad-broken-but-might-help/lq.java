	private  e
	private  f
	private android.view.LayoutInflater g
	
	    public lq(android.content.Context p3, int p4, android.database.Cursor p5, boolean p6)
	    {
	        this(p3, 0, 1);
	        this.f = p4;
	        this.e = p4;
	        this.g = ((android.view.LayoutInflater) p3.getSystemService("layout_inflater"));
	        return;
	    }
	
	
	    public android.view.View a(android.content.Context p4, android.database.Cursor p5, android.view.ViewGroup p6)
	    {
	        return this.g.inflate(this.e, p6, 0);
	    }
	
	
	    public final android.view.View b(android.content.Context p4, android.database.Cursor p5, android.view.ViewGroup p6)
	    {
	        return this.g.inflate(this.f, p6, 0);
	    }
	
