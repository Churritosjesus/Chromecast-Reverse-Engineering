	public final android.content.Context a
	public fc b
	private fd c
	
	    public fb(android.content.Context p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public android.view.View a(android.view.MenuItem p2)
	    {
	        return this.a();
	    }
	
	
	    public void a(android.view.SubMenu p1)
	    {
	        return;
	    }
	
	
	    public void a(fd p4)
	    {
	        if ((this.c != null) && (p4 != null)) {
	            android.util.Log.w("ActionProvider(support)", new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ").append(this.getClass().getSimpleName()).append(" instance while it is still in use somewhere else?").toString());
	        }
	        this.c = p4;
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        if (this.b != null) {
	            this.b.a(p2);
	        }
	        return;
	    }
	
	
	    public boolean b()
	    {
	        return 0;
	    }
	
	
	    public boolean c()
	    {
	        return 1;
	    }
	
	
	    public void d()
	    {
	        if ((this.c != null) && (this.b())) {
	            fd v0_2 = this.c;
	            this.c();
	            v0_2.a();
	        }
	        return;
	    }
	
	
	    public boolean e()
	    {
	        return 0;
	    }
	
	
	    public boolean f()
	    {
	        return 0;
	    }
	
