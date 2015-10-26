	private static final java.util.ArrayList o
	private static final java.util.ArrayList p
	public final java.lang.Object i
	public final java.lang.Object j
	public  k
	public  l
	public  m
	public final java.util.ArrayList n
	private final vo q
	private java.lang.Object r
	private java.lang.Object s
	private java.util.ArrayList t
	private ul u
	private uk v
	
	    static vf()
	    {
	        android.content.IntentFilter v0_1 = new android.content.IntentFilter();
	        v0_1.addCategory("android.media.intent.category.LIVE_AUDIO");
	        java.util.ArrayList v1_2 = new java.util.ArrayList();
	        vf.o = v1_2;
	        v1_2.add(v0_1);
	        android.content.IntentFilter v0_3 = new android.content.IntentFilter();
	        v0_3.addCategory("android.media.intent.category.LIVE_VIDEO");
	        java.util.ArrayList v1_5 = new java.util.ArrayList();
	        vf.p = v1_5;
	        v1_5.add(v0_3);
	        return;
	    }
	
	
	    public vf(android.content.Context p4, vo p5)
	    {
	        this(p4);
	        this.n = new java.util.ArrayList();
	        this.t = new java.util.ArrayList();
	        this.q = p5;
	        this.i = p4.getSystemService("media_router");
	        this.j = this.c();
	        this.r = new un(this);
	        this.s = ((android.media.MediaRouter) this.i).createRouteCategory(p4.getResources().getString(a.cr), 0);
	        this.e();
	        return;
	    }
	
	
	    private void a(vh p4)
	    {
	        tn v0_1 = new to(p4.b, this.j(p4.a));
	        this.a(p4, v0_1);
	        p4.c = v0_1.a();
	        return;
	    }
	
	
	    private int b(String p4)
	    {
	        int v2 = this.n.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            if (!((vh) this.n.get(v1)).b.equals(p4)) {
	                v1++;
	            } else {
	                int v0_1 = v1;
	            }
	            return v0_1;
	        }
	        v0_1 = -1;
	        return v0_1;
	    }
	
	
	    private int e(uh p4)
	    {
	        int v2 = this.t.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            if (((vi) this.t.get(v1)).a != p4) {
	                v1++;
	            } else {
	                int v0_1 = v1;
	            }
	            return v0_1;
	        }
	        v0_1 = -1;
	        return v0_1;
	    }
	
	
	    private void e()
	    {
	        int v0_1 = ((android.media.MediaRouter) this.i);
	        int v3 = v0_1.getRouteCount();
	        java.util.ArrayList v4_1 = new java.util.ArrayList(v3);
	        java.util.Iterator v2_0 = 0;
	        while (v2_0 < v3) {
	            v4_1.add(v0_1.getRouteAt(v2_0));
	            v2_0++;
	        }
	        java.util.Iterator v2_1 = v4_1.iterator();
	        int v0_2 = 0;
	        while (v2_1.hasNext()) {
	            v0_2 |= this.f(v2_1.next());
	        }
	        if (v0_2 != 0) {
	            this.a();
	        }
	        return;
	    }
	
	
	    private boolean f(Object p10)
	    {
	        if ((vf.i(p10) != null) || (this.g(p10) >= 0)) {
	            String v0_2 = 0;
	        } else {
	            String v0_4;
	            if (this.d() != p10) {
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	            String v0_6;
	            if (v0_4 == null) {
	                String v3_0 = new Object[1];
	                v3_0[0] = Integer.valueOf(this.j(p10).hashCode());
	                v0_6 = String.format(java.util.Locale.US, "ROUTE_%08x", v3_0);
	            } else {
	                v0_6 = "DEFAULT_ROUTE";
	            }
	            if (this.b(v0_6) >= 0) {
	                int v1_2 = 2;
	                while(true) {
	                    Object[] v7 = new Object[2];
	                    v7[0] = v0_6;
	                    v7[1] = Integer.valueOf(v1_2);
	                    String v3_2 = String.format(java.util.Locale.US, "%s_%d", v7);
	                    if (this.b(v3_2) < 0) {
	                        break;
	                    }
	                    v1_2++;
	                }
	                v0_6 = v3_2;
	            }
	            int v1_4 = new vh(p10, v0_6);
	            this.a(v1_4);
	            this.n.add(v1_4);
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    private static vi i(Object p2)
	    {
	        int v0_1;
	        int v0_0 = ((android.media.MediaRouter$RouteInfo) p2).getTag();
	        if (!(v0_0 instanceof vi)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = ((vi) v0_0);
	        }
	        return v0_1;
	    }
	
	
	    private String j(Object p2)
	    {
	        String v0_2;
	        String v0_1 = ((android.media.MediaRouter$RouteInfo) p2).getName(this.a);
	        if (v0_1 == null) {
	            v0_2 = "";
	        } else {
	            v0_2 = v0_1.toString();
	        }
	        return v0_2;
	    }
	
	
	    public final tu a(String p3)
	    {
	        int v0_1;
	        int v0_0 = this.b(p3);
	        if (v0_0 < 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = new vg(this, ((vh) this.n.get(v0_0)).a);
	        }
	        return v0_1;
	    }
	
	
	    protected final void a()
	    {
	        tw v2_1 = new tw();
	        int v3 = this.n.size();
	        int v1 = 0;
	        while (v1 < v3) {
	            v2_1.a(((vh) this.n.get(v1)).c);
	            v1++;
	        }
	        this.a(v2_1.a());
	        return;
	    }
	
	
	    public final void a(Object p3)
	    {
	        if (p3 == a.a(this.i, 8388611)) {
	            uh v0_2 = vf.i(p3);
	            if (v0_2 == null) {
	                uh v0_3 = this.g(p3);
	                if (v0_3 >= null) {
	                    uh v0_7 = this.q.a(((vh) this.n.get(v0_3)).b);
	                    if (v0_7 != null) {
	                        v0_7.c();
	                    }
	                }
	            } else {
	                v0_2.a.c();
	            }
	        }
	        return;
	    }
	
	
	    public final void a(Object p2, int p3)
	    {
	        uh v0_0 = vf.i(p2);
	        if (v0_0 != null) {
	            v0_0.a.a(p3);
	        }
	        return;
	    }
	
	
	    public final void a(uh p4)
	    {
	        if (p4.d() == this) {
	            boolean v0_3 = this.g(a.a(this.i, 8388611));
	            if ((v0_3) && (((vh) this.n.get(v0_3)).b.equals(p4.a))) {
	                p4.c();
	            }
	        } else {
	            String v1_5 = ((android.media.MediaRouter) this.i).createUserRoute(((android.media.MediaRouter$RouteCategory) this.s));
	            boolean v0_11 = new vi(p4, v1_5);
	            a.b(v1_5, v0_11);
	            a.c(v1_5, this.r);
	            this.a(v0_11);
	            this.t.add(v0_11);
	            ((android.media.MediaRouter) this.i).addUserRoute(((android.media.MediaRouter$UserRouteInfo) v1_5));
	        }
	        return;
	    }
	
	
	    protected void a(vh p3, to p4)
	    {
	        int v0_2 = ((android.media.MediaRouter$RouteInfo) p3.a).getSupportedTypes();
	        if ((v0_2 & 1) != 0) {
	            p4.a(vf.o);
	        }
	        if ((v0_2 & 2) != 0) {
	            p4.a(vf.p);
	        }
	        p4.a(((android.media.MediaRouter$RouteInfo) p3.a).getPlaybackType());
	        p4.b(((android.media.MediaRouter$RouteInfo) p3.a).getPlaybackStream());
	        p4.c(((android.media.MediaRouter$RouteInfo) p3.a).getVolume());
	        p4.d(((android.media.MediaRouter$RouteInfo) p3.a).getVolumeMax());
	        p4.e(((android.media.MediaRouter$RouteInfo) p3.a).getVolumeHandling());
	        return;
	    }
	
	
	    protected void a(vi p3)
	    {
	        ((android.media.MediaRouter$UserRouteInfo) p3.b).setName(p3.a.c);
	        ((android.media.MediaRouter$UserRouteInfo) p3.b).setPlaybackType(p3.a.h);
	        ((android.media.MediaRouter$UserRouteInfo) p3.b).setPlaybackStream(p3.a.i);
	        ((android.media.MediaRouter$UserRouteInfo) p3.b).setVolume(p3.a.k);
	        ((android.media.MediaRouter$UserRouteInfo) p3.b).setVolumeMax(p3.a.l);
	        ((android.media.MediaRouter$UserRouteInfo) p3.b).setVolumeHandling(p3.a.j);
	        return;
	    }
	
	
	    protected void b()
	    {
	        if (this.m) {
	            this.m = 0;
	            a.a(this.i, this.j);
	        }
	        if (this.k != 0) {
	            this.m = 1;
	            ((android.media.MediaRouter) this.i).addCallback(this.k, ((android.media.MediaRouter$Callback) this.j));
	        }
	        return;
	    }
	
	
	    public final void b(Object p2)
	    {
	        if (this.f(p2)) {
	            this.a();
	        }
	        return;
	    }
	
	
	    public final void b(Object p2, int p3)
	    {
	        uh v0_0 = vf.i(p2);
	        if (v0_0 != null) {
	            v0_0.a.b(p3);
	        }
	        return;
	    }
	
	
	    public final void b(tp p7)
	    {
	        boolean v1_0;
	        int v0_0 = 0;
	        if (p7 == null) {
	            v1_0 = 0;
	        } else {
	            java.util.List v3 = p7.a().a();
	            int v4 = v3.size();
	            int v2_0 = 0;
	            v1_0 = 0;
	            while (v2_0 < v4) {
	                int v0_5;
	                int v0_2 = ((String) v3.get(v2_0));
	                if (!v0_2.equals("android.media.intent.category.LIVE_AUDIO")) {
	                    if (!v0_2.equals("android.media.intent.category.LIVE_VIDEO")) {
	                        v0_5 = (8388608 | v1_0);
	                    } else {
	                        v0_5 = (v1_0 | 2);
	                    }
	                } else {
	                    v0_5 = (v1_0 | 1);
	                }
	                v2_0++;
	                v1_0 = v0_5;
	            }
	            v0_0 = p7.b();
	        }
	        if ((this.k != v1_0) || (this.l != v0_0)) {
	            this.k = v1_0;
	            this.l = v0_0;
	            this.b();
	            this.e();
	        }
	        return;
	    }
	
	
	    public final void b(uh p4)
	    {
	        if (p4.d() != this) {
	            android.media.MediaRouter v0_1 = this.e(p4);
	            if (v0_1 >= null) {
	                android.media.MediaRouter v0_3 = ((vi) this.t.remove(v0_1));
	                a.b(v0_3.b, 0);
	                a.c(v0_3.b, 0);
	                ((android.media.MediaRouter) this.i).removeUserRoute(((android.media.MediaRouter$UserRouteInfo) v0_3.b));
	            }
	        }
	        return;
	    }
	
	
	    protected Object c()
	    {
	        return new uj(this);
	    }
	
	
	    public final void c(Object p3)
	    {
	        if (vf.i(p3) == null) {
	            int v0_1 = this.g(p3);
	            if (v0_1 >= 0) {
	                this.n.remove(v0_1);
	                this.a();
	            }
	        }
	        return;
	    }
	
	
	    public final void c(uh p3)
	    {
	        if (p3.d() != this) {
	            vi v0_1 = this.e(p3);
	            if (v0_1 >= null) {
	                this.a(((vi) this.t.get(v0_1)));
	            }
	        }
	        return;
	    }
	
	
	    protected Object d()
	    {
	        if (this.v == null) {
	            this.v = new uk();
	        }
	        return this.v.a(this.i);
	    }
	
	
	    public final void d(Object p3)
	    {
	        if (vf.i(p3) == null) {
	            vh v0_1 = this.g(p3);
	            if (v0_1 >= null) {
	                this.a(((vh) this.n.get(v0_1)));
	                this.a();
	            }
	        }
	        return;
	    }
	
	
	    public final void d(uh p3)
	    {
	        if (p3.a()) {
	            if (p3.d() == this) {
	                Object v0_3 = this.b(p3.a);
	                if (v0_3 >= null) {
	                    this.h(((vh) this.n.get(v0_3)).a);
	                }
	            } else {
	                Object v0_7 = this.e(p3);
	                if (v0_7 >= null) {
	                    this.h(((vi) this.t.get(v0_7)).b);
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void e(Object p5)
	    {
	        if (vf.i(p5) == null) {
	            vh v0_1 = this.g(p5);
	            if (v0_1 >= null) {
	                vh v0_3 = ((vh) this.n.get(v0_1));
	                tn v1_1 = ((android.media.MediaRouter$RouteInfo) p5).getVolume();
	                if (v1_1 != v0_3.c.l()) {
	                    v0_3.c = new to(v0_3.c).c(v1_1).a();
	                    this.a();
	                }
	            }
	        }
	        return;
	    }
	
	
	    protected final int g(Object p4)
	    {
	        int v2 = this.n.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            if (((vh) this.n.get(v1)).a != p4) {
	                v1++;
	            } else {
	                int v0_1 = v1;
	            }
	            return v0_1;
	        }
	        v0_1 = -1;
	        return v0_1;
	    }
	
	
	    protected void h(Object p7)
	    {
	        if (this.u == null) {
	            this.u = new ul();
	        }
	        reflect.InvocationTargetException v1_0 = this.u;
	        android.media.MediaRouter v0_4 = ((android.media.MediaRouter) this.i);
	        if ((((android.media.MediaRouter$RouteInfo) p7).getSupportedTypes() & 8388608) != 0) {
	            v0_4.selectRoute(8388611, ((android.media.MediaRouter$RouteInfo) p7));
	        } else {
	            if (v1_0.a == null) {
	                android.util.Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
	            } else {
	                try {
	                    reflect.InvocationTargetException v1_2 = v1_0.a;
	                    String v2_5 = new Object[2];
	                    v2_5[0] = Integer.valueOf(8388611);
	                    v2_5[1] = ((android.media.MediaRouter$RouteInfo) p7);
	                    v1_2.invoke(v0_4, v2_5);
	                } catch (reflect.InvocationTargetException v1_3) {
	                    android.util.Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", v1_3);
	                } catch (reflect.InvocationTargetException v1_4) {
	                    android.util.Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", v1_4);
	                }
	            }
	        }
	        return;
	    }
	
