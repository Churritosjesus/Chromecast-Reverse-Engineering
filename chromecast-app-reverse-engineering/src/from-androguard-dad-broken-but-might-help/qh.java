	final android.view.ActionProvider c
	private synthetic qg d
	
	    public qh(qg p1, android.content.Context p2, android.view.ActionProvider p3)
	    {
	        this.d = p1;
	        this(p2);
	        this.c = p3;
	        return;
	    }
	
	
	    public final android.view.View a()
	    {
	        return this.c.onCreateActionView();
	    }
	
	
	    public final void a(android.view.SubMenu p3)
	    {
	        this.c.onPrepareSubMenu(this.d.a(p3));
	        return;
	    }
	
	
	    public final boolean e()
	    {
	        return this.c.onPerformDefaultAction();
	    }
	
	
	    public final boolean f()
	    {
	        return this.c.hasSubMenu();
	    }
	
