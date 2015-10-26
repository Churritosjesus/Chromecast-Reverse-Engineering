	private fd d
	
	    public qm(ql p1, android.content.Context p2, android.view.ActionProvider p3)
	    {
	        this(p1, p2, p3);
	        return;
	    }
	
	
	    public final android.view.View a(android.view.MenuItem p2)
	    {
	        return this.c.onCreateActionView(p2);
	    }
	
	
	    public final void a(fd p2)
	    {
	        this.d = p2;
	        android.view.ActionProvider v0 = this.c;
	        if (p2 == null) {
	            this = 0;
	        }
	        v0.setVisibilityListener(this);
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        return this.c.overridesItemVisibility();
	    }
	
	
	    public final boolean c()
	    {
	        return this.c.isVisible();
	    }
	
	
	    public final void d()
	    {
	        this.c.refreshVisibility();
	        return;
	    }
	
	
	    public final void onActionProviderVisibilityChanged(boolean p2)
	    {
	        if (this.d != null) {
	            this.d.a();
	        }
	        return;
	    }
	
