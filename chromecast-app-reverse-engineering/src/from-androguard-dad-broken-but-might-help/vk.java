	
	    public vk(android.content.Context p1, vo p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    protected final void a(vh p4, to p5)
	    {
	        super.a(p4, p5);
	        String v0_2 = ((android.media.MediaRouter$RouteInfo) p4.a).getDescription();
	        if (v0_2 != null) {
	            p5.a.putString("status", v0_2.toString());
	        }
	        return;
	    }
	
	
	    protected final void a(vi p3)
	    {
	        super.a(p3);
	        ((android.media.MediaRouter$UserRouteInfo) p3.b).setDescription(p3.a.d);
	        return;
	    }
	
	
	    protected final boolean a(vh p2)
	    {
	        return ((android.media.MediaRouter$RouteInfo) p2.a).isConnecting();
	    }
	
	
	    protected final void b()
	    {
	        int v2_0 = 1;
	        if (this.m) {
	            a.a(this.i, this.j);
	        }
	        this.m = 1;
	        if (!this.l) {
	            v2_0 = 0;
	        }
	        ((android.media.MediaRouter) this.i).addCallback(this.k, ((android.media.MediaRouter$Callback) this.j), (v2_0 | 2));
	        return;
	    }
	
	
	    protected final Object d()
	    {
	        return ((android.media.MediaRouter) this.i).getDefaultRoute();
	    }
	
	
	    protected final void h(Object p3)
	    {
	        ((android.media.MediaRouter) this.i).selectRoute(8388611, ((android.media.MediaRouter$RouteInfo) p3));
	        return;
	    }
	
