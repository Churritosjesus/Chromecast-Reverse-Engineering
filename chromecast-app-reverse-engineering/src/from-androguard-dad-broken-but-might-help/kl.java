	private synthetic kj a
	
	    kl(kj p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onChanged()
	    {
	        this.a.a = 1;
	        this.a.notifyDataSetChanged();
	        return;
	    }
	
	
	    public final void onInvalidated()
	    {
	        this.a.a = 0;
	        this.a.notifyDataSetInvalidated();
	        return;
	    }
	
