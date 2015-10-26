	final android.content.Context a
	final java.util.ArrayList b
	final java.util.ArrayList c
	final java.util.ArrayList d
	final ve e
	 uz f
	 uh g
	 tu h
	private final java.util.ArrayList i
	private final vd j
	private final uf k
	private final ue l
	private final  m
	private uh n
	private tp o
	
	    uc(android.content.Context p2)
	    {
	        this.b = new java.util.ArrayList();
	        this.c = new java.util.ArrayList();
	        this.d = new java.util.ArrayList();
	        this.i = new java.util.ArrayList();
	        this.j = new vd();
	        this.k = new uf(this);
	        this.l = new ue(this);
	        new ud(this);
	        this.a = p2;
	        bz.a(p2);
	        this.m = a.a(((android.app.ActivityManager) p2.getSystemService("activity")));
	        this.e = ve.a(p2, this);
	        this.a(this.e);
	        return;
	    }
	
	
	    private void a(boolean p7)
	    {
	        if ((this.n != null) && (!uc.a(this.n))) {
	            new StringBuilder("Clearing the default route because it is no longer selectable: ").append(this.n);
	            this.n = 0;
	        }
	        if ((this.n == null) && (!this.c.isEmpty())) {
	            java.util.Iterator v3 = this.c.iterator();
	            while (v3.hasNext()) {
	                uh v1_5;
	                StringBuilder v0_11 = ((uh) v3.next());
	                if ((v0_11.d() != this.e) || (!v0_11.a.equals("DEFAULT_ROUTE"))) {
	                    v1_5 = 0;
	                } else {
	                    v1_5 = 1;
	                }
	                if ((v1_5 != null) && (uc.a(v0_11))) {
	                    this.n = v0_11;
	                    new StringBuilder("Found default route: ").append(this.n);
	                    break;
	                }
	            }
	        }
	        if ((this.g != null) && (!uc.a(this.g))) {
	            new StringBuilder("Unselecting the current route because it is no longer selectable: ").append(this.g);
	            this.b(0, 0);
	        }
	        if (this.g != null) {
	            if (p7) {
	                this.e();
	            }
	        } else {
	            this.b(this.d(), 0);
	        }
	        return;
	    }
	
	
	    private static boolean a(uh p1)
	    {
	        if ((p1.o == null) || (!p1.e)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    private int b(String p4)
	    {
	        int v2 = this.c.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            if (!((uh) this.c.get(v1)).b.equals(p4)) {
	                v1++;
	            } else {
	                int v0_1 = v1;
	            }
	            return v0_1;
	        }
	        v0_1 = -1;
	        return v0_1;
	    }
	
	
	    private void b(uh p4, int p5)
	    {
	        if (this.g != p4) {
	            if (this.g != null) {
	                if (tz.g()) {
	                    new StringBuilder("Route unselected: ").append(this.g).append(" reason: ").append(p5);
	                }
	                this.l.a(263, this.g);
	                if (this.h != null) {
	                    this.h.a(p5);
	                    this.h.a();
	                    this.h = 0;
	                }
	            }
	            this.g = p4;
	            if (this.g != null) {
	                this.h = p4.d().a(p4.a);
	                if (this.h != null) {
	                    this.h.b();
	                }
	                if (tz.g()) {
	                    new StringBuilder("Route selected: ").append(this.g);
	                }
	                this.l.a(262, this.g);
	            }
	            this.e();
	        }
	        return;
	    }
	
	
	    private uh d()
	    {
	        java.util.Iterator v2 = this.c.iterator();
	        while (v2.hasNext()) {
	            uh v0_2 = ((uh) v2.next());
	            if (v0_2 != this.n) {
	                if ((v0_2.d() != this.e) || ((!v0_2.a("android.media.intent.category.LIVE_AUDIO")) || (v0_2.a("android.media.intent.category.LIVE_VIDEO")))) {
	                    boolean v1_6 = 0;
	                } else {
	                    v1_6 = 1;
	                }
	                if ((v1_6) && (uc.a(v0_2))) {
	                }
	            }
	            return v0_2;
	        }
	        v0_2 = this.n;
	        return v0_2;
	    }
	
	
	    private void e()
	    {
	        if (this.g != null) {
	            this.j.a = this.g.k;
	            this.j.b = this.g.l;
	            this.j.c = this.g.j;
	            this.j.d = this.g.i;
	            int v1_8 = this.i.size();
	            int v0_6 = 0;
	            while (v0_6 < v1_8) {
	                this.i.get(v0_6);
	                v0_6++;
	            }
	        }
	        return;
	    }
	
	
	    public final tz a(android.content.Context p4)
	    {
	        java.util.ArrayList v0_1 = this.b.size();
	        while(true) {
	            java.util.ArrayList v0_3;
	            java.util.ArrayList v1_0 = (v0_1 - 1);
	            if (v1_0 < null) {
	                break;
	            }
	            v0_3 = ((tz) ((ref.WeakReference) this.b.get(v1_0)).get());
	            if (v0_3 != null) {
	                if (v0_3.b != p4) {
	                    v0_1 = v1_0;
	                }
	            } else {
	                this.b.remove(v1_0);
	                v0_1 = v1_0;
	            }
	            return v0_3;
	        }
	        v0_3 = new tz(p4);
	        this.b.add(new ref.WeakReference(v0_3));
	        return v0_3;
	    }
	
	
	    public final uh a()
	    {
	        if (this.n != null) {
	            return this.n;
	        } else {
	            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
	        }
	    }
	
	
	    public final uh a(String p3)
	    {
	        uh v0_4;
	        uh v0_1 = this.c(this.e);
	        if (v0_1 < null) {
	            v0_4 = 0;
	        } else {
	            uh v0_3 = ((ug) this.d.get(v0_1));
	            int v1_1 = v0_3.a(p3);
	            if (v1_1 < 0) {
	            } else {
	                v0_4 = ((uh) v0_3.b.get(v1_1));
	            }
	        }
	        return v0_4;
	    }
	
	
	    public final void a(tq p4)
	    {
	        if (this.c(p4) < 0) {
	            tp v0_2 = new ug(p4);
	            this.d.add(v0_2);
	            if (tz.g()) {
	                new StringBuilder("Provider added: ").append(v0_2);
	            }
	            this.l.a(513, v0_2);
	            this.a(v0_2, p4.g);
	            p4.a(this.k);
	            p4.a(this.o);
	        }
	        return;
	    }
	
	
	    void a(ug p17, tv p18)
	    {
	        int v2_1;
	        if (p17.c == p18) {
	            v2_1 = 0;
	        } else {
	            p17.c = p18;
	            v2_1 = 1;
	        }
	        if (v2_1 != 0) {
	            int v7_0 = 0;
	            boolean v6 = 0;
	            if (p18 != null) {
	                if (!p18.b()) {
	                    android.util.Log.w("MediaRouter", new StringBuilder("Ignoring invalid provider descriptor: ").append(p18).toString());
	                } else {
	                    java.util.List v9 = p18.a();
	                    int v10 = v9.size();
	                    int v8 = 0;
	                    while (v8 < v10) {
	                        int v2_32;
	                        int v3_11;
	                        int v2_24 = ((tn) v9.get(v8));
	                        java.util.ArrayList v11_0 = v2_24.a();
	                        int v5_2 = p17.a(v11_0);
	                        if (v5_2 >= 0) {
	                            if (v5_2 >= v7_0) {
	                                int v3_10 = ((uh) p17.b.get(v5_2));
	                                int v4_7 = (v7_0 + 1);
	                                java.util.Collections.swap(p17.b, v5_2, v7_0);
	                                int v2_25 = v3_10.a(v2_24);
	                                if (v2_25 != 0) {
	                                    if ((v2_25 & 1) != 0) {
	                                        if (tz.g()) {
	                                            new StringBuilder("Route changed: ").append(v3_10);
	                                        }
	                                        this.l.a(259, v3_10);
	                                    }
	                                    if ((v2_25 & 2) != 0) {
	                                        if (tz.g()) {
	                                            new StringBuilder("Route volume changed: ").append(v3_10);
	                                        }
	                                        this.l.a(260, v3_10);
	                                    }
	                                    if ((v2_25 & 4) != 0) {
	                                        if (tz.g()) {
	                                            new StringBuilder("Route presentation display changed: ").append(v3_10);
	                                        }
	                                        this.l.a(261, v3_10);
	                                    }
	                                    if (v3_10 == this.g) {
	                                        v2_32 = 1;
	                                        v3_11 = v4_7;
	                                        v8++;
	                                        v6 = v2_32;
	                                        v7_0 = v3_11;
	                                    }
	                                }
	                                v2_32 = v6;
	                                v3_11 = v4_7;
	                            } else {
	                                android.util.Log.w("MediaRouter", new StringBuilder("Ignoring route descriptor with duplicate id: ").append(v2_24).toString());
	                                v2_32 = v6;
	                                v3_11 = v7_0;
	                            }
	                        } else {
	                            int v3_20;
	                            int v4_13 = new StringBuilder().append(p17.b().flattenToShortString()).append(":").append(v11_0).toString();
	                            if (this.b(v4_13) >= 0) {
	                                int v3_19 = 2;
	                                while(true) {
	                                    Object[] v13_1 = new Object[2];
	                                    v13_1[0] = v4_13;
	                                    v13_1[1] = Integer.valueOf(v3_19);
	                                    int v5_17 = String.format(java.util.Locale.US, "%s_%d", v13_1);
	                                    if (this.b(v5_17) < 0) {
	                                        break;
	                                    }
	                                    v3_19++;
	                                }
	                                v3_20 = v5_17;
	                            } else {
	                                v3_20 = v4_13;
	                            }
	                            int v4_15 = new uh(p17, v11_0, v3_20);
	                            v3_11 = (v7_0 + 1);
	                            p17.b.add(v7_0, v4_15);
	                            this.c.add(v4_15);
	                            v4_15.a(v2_24);
	                            if (tz.g()) {
	                                new StringBuilder("Route added: ").append(v4_15);
	                            }
	                            this.l.a(257, v4_15);
	                            v2_32 = v6;
	                        }
	                    }
	                }
	            }
	            int v3_4 = (p17.b.size() - 1);
	            while (v3_4 >= v7_0) {
	                int v2_21 = ((uh) p17.b.get(v3_4));
	                v2_21.a(0);
	                this.c.remove(v2_21);
	                v3_4--;
	            }
	            this.a(v6);
	            int v3_5 = (p17.b.size() - 1);
	            while (v3_5 >= v7_0) {
	                int v2_17 = ((uh) p17.b.remove(v3_5));
	                if (tz.g()) {
	                    new StringBuilder("Route removed: ").append(v2_17);
	                }
	                this.l.a(258, v2_17);
	                v3_5--;
	            }
	            if (tz.g()) {
	                new StringBuilder("Provider changed: ").append(p17);
	            }
	            this.l.a(515, p17);
	        }
	        return;
	    }
	
	
	    public final void a(uh p4, int p5)
	    {
	        if (this.c.contains(p4)) {
	            if (p4.e) {
	                this.b(p4, p5);
	            } else {
	                android.util.Log.w("MediaRouter", new StringBuilder("Ignoring attempt to select disabled route: ").append(p4).toString());
	            }
	        } else {
	            android.util.Log.w("MediaRouter", new StringBuilder("Ignoring attempt to select removed route: ").append(p4).toString());
	        }
	        return;
	    }
	
	
	    public final boolean a(tx p7, int p8)
	    {
	        int v0_4;
	        if (!p7.c()) {
	            if (((p8 & 2) != 0) || (!this.m)) {
	                int v4 = this.c.size();
	                int v3 = 0;
	                while (v3 < v4) {
	                    int v0_7 = ((uh) this.c.get(v3));
	                    if ((((p8 & 1) != 0) && (v0_7.b())) || (!v0_7.a(p7))) {
	                        v3++;
	                    } else {
	                        v0_4 = 1;
	                    }
	                }
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public final uh b()
	    {
	        if (this.g != null) {
	            return this.g;
	        } else {
	            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
	        }
	    }
	
	
	    public final void b(tq p5)
	    {
	        int v1 = this.c(p5);
	        if (v1 >= 0) {
	            p5.a(0);
	            p5.a(0);
	            java.util.ArrayList v0_2 = ((ug) this.d.get(v1));
	            this.a(v0_2, 0);
	            if (tz.g()) {
	                new StringBuilder("Provider removed: ").append(v0_2);
	            }
	            this.l.a(514, v0_2);
	            this.d.remove(v1);
	        }
	        return;
	    }
	
	
	    int c(tq p4)
	    {
	        int v2 = this.d.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            if (((ug) this.d.get(v1)).a != p4) {
	                v1++;
	            } else {
	                int v0_1 = v1;
	            }
	            return v0_1;
	        }
	        v0_1 = -1;
	        return v0_1;
	    }
	
	
	    public final void c()
	    {
	        ty v8_1 = new ty();
	        int v0_1 = this.b.size();
	        int v2_0 = 0;
	        int v4 = 0;
	        while(true) {
	            int v7 = (v0_1 - 1);
	            if (v7 < 0) {
	                int v0_2;
	                if (v4 == 0) {
	                    v0_2 = tx.c;
	                } else {
	                    v0_2 = v8_1.a();
	                }
	                if ((this.o == null) || ((!this.o.a().equals(v0_2)) || (this.o.b() != v2_0))) {
	                    if ((!v0_2.c()) || (v2_0 != 0)) {
	                        this.o = new tp(v0_2, v2_0);
	                    } else {
	                        if (this.o == null) {
	                            return;
	                        } else {
	                            this.o = 0;
	                        }
	                    }
	                    if (tz.g()) {
	                        new StringBuilder("Updated discovery request: ").append(this.o);
	                    }
	                    int v2_1 = this.d.size();
	                    int v1_11 = 0;
	                    while (v1_11 < v2_1) {
	                        ((ug) this.d.get(v1_11)).a.a(this.o);
	                        v1_11++;
	                    }
	                }
	                return;
	            } else {
	                int v0_18 = ((tz) ((ref.WeakReference) this.b.get(v7)).get());
	                if (v0_18 == 0) {
	                    break;
	                }
	                int v9 = v0_18.c.size();
	                int v6 = 0;
	                while (v6 < v9) {
	                    int v1_15 = ((ub) v0_18.c.get(v6));
	                    v8_1.a(v1_15.c);
	                    if ((v1_15.d & 1) != 0) {
	                        v2_0 = 1;
	                        v4 = 1;
	                    }
	                    if (((v1_15.d & 4) != 0) && (!this.m)) {
	                        v4 = 1;
	                    }
	                    if ((v1_15.d & 8) != 0) {
	                        v4 = 1;
	                    }
	                    v6++;
	                }
	                v0_1 = v7;
	            }
	        }
	        this.b.remove(v7);
	        v0_1 = v7;
	    }
	
