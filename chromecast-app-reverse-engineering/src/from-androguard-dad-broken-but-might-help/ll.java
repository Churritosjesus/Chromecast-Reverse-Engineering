	private synthetic li a
	
	    ll(li p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void invalidateDrawable(android.graphics.drawable.Drawable p2)
	    {
	        this.a.invalidateSelf();
	        return;
	    }
	
	
	    public final void scheduleDrawable(android.graphics.drawable.Drawable p2, Runnable p3, long p4)
	    {
	        this.a.scheduleSelf(p3, p4);
	        return;
	    }
	
	
	    public final void unscheduleDrawable(android.graphics.drawable.Drawable p2, Runnable p3)
	    {
	        this.a.unscheduleSelf(p3);
	        return;
	    }
	
