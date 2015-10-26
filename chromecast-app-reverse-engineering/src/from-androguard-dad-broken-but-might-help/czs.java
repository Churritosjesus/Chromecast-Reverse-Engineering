	private synthetic com.google.android.libraries.view.pagingindicator.PagingIndicator a
	
	    public czs(com.google.android.libraries.view.pagingindicator.PagingIndicator p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onViewAttachedToWindow(android.view.View p3)
	    {
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.a(this.a, 1);
	        return;
	    }
	
	
	    public final void onViewDetachedFromWindow(android.view.View p3)
	    {
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.a(this.a, 0);
	        return;
	    }
	
