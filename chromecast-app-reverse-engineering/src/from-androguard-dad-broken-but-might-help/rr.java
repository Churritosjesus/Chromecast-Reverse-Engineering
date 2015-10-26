	private synthetic android.support.v7.internal.widget.ActivityChooserView a
	
	    public rr(android.support.v7.internal.widget.ActivityChooserView p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onChanged()
	    {
	        super.onChanged();
	        android.support.v7.internal.widget.ActivityChooserView.a(this.a).notifyDataSetChanged();
	        return;
	    }
	
	
	    public final void onInvalidated()
	    {
	        super.onInvalidated();
	        android.support.v7.internal.widget.ActivityChooserView.a(this.a).notifyDataSetInvalidated();
	        return;
	    }
	
