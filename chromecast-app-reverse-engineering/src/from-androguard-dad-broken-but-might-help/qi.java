	final android.view.CollapsibleActionView a
	
	    qi(android.view.View p2)
	    {
	        this(p2.getContext());
	        this.a = ((android.view.CollapsibleActionView) p2);
	        this.addView(p2);
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.a.onActionViewExpanded();
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.a.onActionViewCollapsed();
	        return;
	    }
	
