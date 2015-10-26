	private nh a
	
	    public ny(android.content.Context p5, int p6)
	    {
	        if (p6 == 0) {
	            nh v0_1 = new android.util.TypedValue();
	            p5.getTheme().resolveAttribute(a.E, v0_1, 1);
	            p6 = v0_1.resourceId;
	        }
	        this(p5, p6);
	        this.a().a(0);
	        return;
	    }
	
	
	    public final nh a()
	    {
	        if (this.a == null) {
	            this.a = nh.a(this.getContext(), this.getWindow(), this);
	        }
	        return this.a;
	    }
	
	
	    public void addContentView(android.view.View p2, android.view.ViewGroup$LayoutParams p3)
	    {
	        this.a().b(p2, p3);
	        return;
	    }
	
	
	    public void invalidateOptionsMenu()
	    {
	        this.a().f();
	        return;
	    }
	
	
	    protected void onCreate(android.os.Bundle p2)
	    {
	        this.a().i();
	        super.onCreate(p2);
	        this.a().a(p2);
	        return;
	    }
	
	
	    protected void onStop()
	    {
	        super.onStop();
	        this.a().d();
	        return;
	    }
	
	
	    public void setContentView(int p2)
	    {
	        this.a().a(p2);
	        return;
	    }
	
	
	    public void setContentView(android.view.View p2)
	    {
	        this.a().a(p2);
	        return;
	    }
	
	
	    public void setContentView(android.view.View p2, android.view.ViewGroup$LayoutParams p3)
	    {
	        this.a().a(p2, p3);
	        return;
	    }
	
	
	    public void setTitle(int p3)
	    {
	        super.setTitle(p3);
	        this.a().a(this.getContext().getString(p3));
	        return;
	    }
	
	
	    public void setTitle(CharSequence p2)
	    {
	        super.setTitle(p2);
	        this.a().a(p2);
	        return;
	    }
	
