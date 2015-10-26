	private uo o
	private ur p
	
	    public vj(android.content.Context p1, vo p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    protected void a(vh p4, to p5)
	    {
	        super.a(p4, p5);
	        if (!((android.media.MediaRouter$RouteInfo) p4.a).isEnabled()) {
	            p5.a.putBoolean("enabled", 0);
	        }
	        if (this.a(p4)) {
	            p5.a.putBoolean("connecting", 1);
	        }
	        int v0_8 = ((android.media.MediaRouter$RouteInfo) p4.a).getPresentationDisplay();
	        if (v0_8 != 0) {
	            p5.f(v0_8.getDisplayId());
	        }
	        return;
	    }
	
	
	    protected boolean a(vh p3)
	    {
	        if (this.p == null) {
	            this.p = new ur();
	        }
	        return this.p.a(p3.a);
	    }
	
	
	    protected void b()
	    {
	        super.b();
	        if (this.o == null) {
	            this.o = new uo(this.a, this.c);
	        }
	        String v0_4;
	        uo v2_1 = this.o;
	        if (!this.l) {
	            v0_4 = 0;
	        } else {
	            v0_4 = this.k;
	        }
	        if ((v0_4 & 2) == 0) {
	            if (v2_1.c) {
	                v2_1.c = 0;
	                v2_1.a.removeCallbacks(v2_1);
	            }
	        } else {
	            if (!v2_1.c) {
	                if (v2_1.b == null) {
	                    android.util.Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
	                } else {
	                    v2_1.c = 1;
	                    v2_1.a.post(v2_1);
	                }
	            }
	        }
	        return;
	    }
	
	
	    protected final Object c()
	    {
	        return new uq(this);
	    }
	
	
	    public final void f(Object p5)
	    {
	        vh v0_0 = this.g(p5);
	        if (v0_0 >= null) {
	            tn v1_2;
	            vh v0_2 = ((vh) this.n.get(v0_0));
	            tn v1_1 = ((android.media.MediaRouter$RouteInfo) p5).getPresentationDisplay();
	            if (v1_1 == null) {
	                v1_2 = -1;
	            } else {
	                v1_2 = v1_1.getDisplayId();
	            }
	            if (v1_2 != v0_2.c.o()) {
	                v0_2.c = new to(v0_2.c).f(v1_2).a();
	                this.a();
	            }
	        }
	        return;
	    }
	
