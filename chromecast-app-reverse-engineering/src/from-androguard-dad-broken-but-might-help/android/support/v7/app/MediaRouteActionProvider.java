	public ob c
	private final tz d
	private tx e
	private op f
	
	    public MediaRouteActionProvider(android.content.Context p2)
	    {
	        this(p2);
	        this.e = tx.c;
	        this.f = op.a();
	        this.d = tz.a(p2);
	        new oa(this);
	        return;
	    }
	
	
	    public static synthetic void a(android.support.v7.app.MediaRouteActionProvider p0)
	    {
	        p0.d();
	        return;
	    }
	
	
	    public android.view.View a()
	    {
	        if (this.c != null) {
	            android.util.Log.e("MediaRouteActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don\'t reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
	        }
	        this.c = new ob(this.a);
	        this.c.e = 1;
	        ob v0_5 = this.c;
	        android.view.ViewGroup$LayoutParams v1_3 = this.e;
	        if (v1_3 != null) {
	            if (!v0_5.c.equals(v1_3)) {
	                if (v0_5.d) {
	                    if (!v0_5.c.c()) {
	                        v0_5.a.a(v0_5.b);
	                    }
	                    if (!v1_3.c()) {
	                        v0_5.a.a(v1_3, v0_5.b, 0);
	                    }
	                }
	                v0_5.c = v1_3;
	                v0_5.b();
	            }
	            this.c.a(this.f);
	            this.c.setLayoutParams(new android.view.ViewGroup$LayoutParams(-2, -1));
	            return this.c;
	        } else {
	            throw new IllegalArgumentException("selector must not be null");
	        }
	    }
	
	
	    public final boolean b()
	    {
	        return 1;
	    }
	
	
	    public final boolean c()
	    {
	        return tz.a(this.e, 1);
	    }
	
	
	    public final boolean e()
	    {
	        int v0_1;
	        if (this.c == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.c.a();
	        }
	        return v0_1;
	    }
	
