	public final ui a
	
	    public uj(ui p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public void onRouteAdded(android.media.MediaRouter p2, android.media.MediaRouter$RouteInfo p3)
	    {
	        this.a.b(p3);
	        return;
	    }
	
	
	    public void onRouteChanged(android.media.MediaRouter p2, android.media.MediaRouter$RouteInfo p3)
	    {
	        this.a.d(p3);
	        return;
	    }
	
	
	    public void onRouteGrouped(android.media.MediaRouter p1, android.media.MediaRouter$RouteInfo p2, android.media.MediaRouter$RouteGroup p3, int p4)
	    {
	        return;
	    }
	
	
	    public void onRouteRemoved(android.media.MediaRouter p2, android.media.MediaRouter$RouteInfo p3)
	    {
	        this.a.c(p3);
	        return;
	    }
	
	
	    public void onRouteSelected(android.media.MediaRouter p2, int p3, android.media.MediaRouter$RouteInfo p4)
	    {
	        this.a.a(p4);
	        return;
	    }
	
	
	    public void onRouteUngrouped(android.media.MediaRouter p1, android.media.MediaRouter$RouteInfo p2, android.media.MediaRouter$RouteGroup p3)
	    {
	        return;
	    }
	
	
	    public void onRouteUnselected(android.media.MediaRouter p1, int p2, android.media.MediaRouter$RouteInfo p3)
	    {
	        return;
	    }
	
	
	    public void onRouteVolumeChanged(android.media.MediaRouter p2, android.media.MediaRouter$RouteInfo p3)
	    {
	        this.a.e(p3);
	        return;
	    }
	
