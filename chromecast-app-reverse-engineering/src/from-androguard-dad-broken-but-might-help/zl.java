	public final java.util.ArrayList a
	public java.util.ArrayList b
	public final java.util.ArrayList c
	final java.util.List d
	public final synthetic android.support.v7.widget.RecyclerView e
	private  f
	private zk g
	
	    public zl(android.support.v7.widget.RecyclerView p2)
	    {
	        this.e = p2;
	        this.a = new java.util.ArrayList();
	        this.b = 0;
	        this.c = new java.util.ArrayList();
	        this.d = java.util.Collections.unmodifiableList(this.a);
	        this.f = 2;
	        return;
	    }
	
	
	    private zr a(int p9, int p10, boolean p11)
	    {
	        int v2 = 0;
	        android.support.v7.widget.RecyclerView v4_0 = this.a.size();
	        zc v3_0 = 0;
	        while (v3_0 < v4_0) {
	            zr v0_9 = ((zr) this.a.get(v3_0));
	            if ((v0_9.g()) || ((v0_9.d() != p9) || ((v0_9.j()) || ((!this.e.n.j) && (v0_9.n()))))) {
	                v3_0++;
	            } else {
	                v0_9.a(32);
	            }
	            return v0_9;
	        }
	        if (!p11) {
	            android.support.v7.widget.RecyclerView v4_1 = this.e.c;
	            boolean v5_0 = v4_1.c.size();
	            zc v3_1 = 0;
	            while (v3_1 < v5_0) {
	                zr v0_3 = ((android.view.View) v4_1.c.get(v3_1));
	                boolean v6_1 = v4_1.a.b(v0_3);
	                if ((v6_1.d() != p9) || (v6_1.j())) {
	                    v3_1++;
	                }
	                if (v0_3 != null) {
	                    this.e.m.c(this.e.a(v0_3));
	                }
	            }
	            v0_3 = 0;
	        }
	        zc v3_4 = this.c.size();
	        while (v2 < v3_4) {
	            v0_9 = ((zr) this.c.get(v2));
	            if ((v0_9.j()) || (v0_9.d() != p9)) {
	                v2++;
	            } else {
	                if (!p11) {
	                    this.c.remove(v2);
	                }
	            }
	            return v0_9;
	        }
	        v0_9 = 0;
	        return v0_9;
	    }
	
	
	    private void a(android.view.ViewGroup p5, boolean p6)
	    {
	        int v1 = (p5.getChildCount() - 1);
	        while (v1 >= 0) {
	            int v0_5 = p5.getChildAt(v1);
	            if ((v0_5 instanceof android.view.ViewGroup)) {
	                this.a(((android.view.ViewGroup) v0_5), 1);
	            }
	            v1--;
	        }
	        if (p6) {
	            if (p5.getVisibility() != 4) {
	                int v0_3 = p5.getVisibility();
	                p5.setVisibility(4);
	                p5.setVisibility(v0_3);
	            } else {
	                p5.setVisibility(0);
	                p5.setVisibility(4);
	            }
	        }
	        return;
	    }
	
	
	    private zr c(int p6)
	    {
	        int v0_4;
	        if (this.b == null) {
	            v0_4 = 0;
	        } else {
	            int v3 = this.b.size();
	            if (v3 != 0) {
	                int v2 = 0;
	                while (v2 < v3) {
	                    v0_4 = ((zr) this.b.get(v2));
	                    if ((v0_4.g()) || (v0_4.d() != p6)) {
	                        v2++;
	                    } else {
	                        v0_4.a(32);
	                    }
	                }
	                android.support.v7.widget.RecyclerView.f(this.e);
	                v0_4 = 0;
	            }
	        }
	        return v0_4;
	    }
	
	
	    private void c(zr p6)
	    {
	        gt.a(p6.a, 0);
	        if (android.support.v7.widget.RecyclerView.s(this.e) != null) {
	            android.support.v7.widget.RecyclerView.s(this.e);
	        }
	        if (android.support.v7.widget.RecyclerView.f(this.e) != null) {
	            android.support.v7.widget.RecyclerView.f(this.e);
	        }
	        if (this.e.n != null) {
	            this.e.n.a(p6);
	        }
	        int v1_1 = this.c();
	        int v2_0 = p6.e;
	        java.util.ArrayList v0_13 = ((java.util.ArrayList) v1_1.a.get(v2_0));
	        if (v0_13 == null) {
	            v0_13 = new java.util.ArrayList();
	            v1_1.a.put(v2_0, v0_13);
	            if (v1_1.b.indexOfKey(v2_0) < 0) {
	                v1_1.b.put(v2_0, 5);
	            }
	        }
	        if (v1_1.b.get(v2_0) > v0_13.size()) {
	            p6.p();
	            v0_13.add(p6);
	        }
	        return;
	    }
	
	
	    public final int a(int p4)
	    {
	        if ((p4 >= 0) && (p4 < this.e.n.a())) {
	            if (this.e.n.j) {
	                p4 = this.e.b.a(p4);
	            }
	            return p4;
	        } else {
	            throw new IndexOutOfBoundsException(new StringBuilder("invalid position ").append(p4).append(". State item count is ").append(this.e.n.a()).toString());
	        }
	    }
	
	
	    final android.view.View a(int p9, boolean p10)
	    {
	        zr v1_0 = 0;
	        String v2_0 = 1;
	        if ((p9 >= 0) && (p9 < this.e.n.a())) {
	            er v4_0;
	            android.view.View v0_6;
	            if (!this.e.n.j) {
	                v0_6 = 0;
	                v4_0 = 0;
	            } else {
	                android.view.View v0_7;
	                er v4_1 = this.c(p9);
	                if (v4_1 == null) {
	                    v0_7 = 0;
	                } else {
	                    v0_7 = 1;
	                }
	                v4_0 = v0_7;
	                v0_6 = v4_1;
	            }
	            android.view.accessibility.AccessibilityManager v5_0;
	            if (v0_6 != null) {
	                v5_0 = v4_0;
	            } else {
	                v0_6 = this.a(p9, -1, 0);
	                if (v0_6 == null) {
	                } else {
	                    android.view.accessibility.AccessibilityManager v5_11;
	                    if (v0_6.n()) {
	                        v5_11 = 1;
	                    } else {
	                        if ((v0_6.b >= 0) && (v0_6.b < android.support.v7.widget.RecyclerView.f(this.e).a())) {
	                            if ((this.e.n.j) || (android.support.v7.widget.RecyclerView.f(this.e).a(v0_6.b) == v0_6.e)) {
	                                android.support.v7.widget.RecyclerView.f(this.e);
	                            } else {
	                                v5_11 = 0;
	                            }
	                        } else {
	                            throw new IndexOutOfBoundsException(new StringBuilder("Inconsistency detected. Invalid view holder adapter position").append(v0_6).toString());
	                        }
	                    }
	                    if (v5_11 != null) {
	                        v5_0 = 1;
	                    } else {
	                        v0_6.a(4);
	                        if (!v0_6.e()) {
	                            if (v0_6.g()) {
	                                v0_6.h();
	                            }
	                        } else {
	                            this.e.removeDetachedView(v0_6.a, 0);
	                            v0_6.f();
	                        }
	                        this.a(v0_6);
	                        v0_6 = 0;
	                        v5_0 = v4_0;
	                    }
	                }
	            }
	            zr v1_3;
	            if (v0_6 != null) {
	                v1_3 = v0_6;
	            } else {
	                er v4_4 = this.e.b.a(p9);
	                if ((v4_4 >= null) && (v4_4 < android.support.v7.widget.RecyclerView.f(this.e).a())) {
	                    er v4_5 = android.support.v7.widget.RecyclerView.f(this.e).a(v4_4);
	                    android.support.v7.widget.RecyclerView.f(this.e);
	                    if (v0_6 == null) {
	                        android.view.View v0_12 = ((java.util.ArrayList) this.c().a.get(v4_5));
	                        if ((v0_12 != null) && (!v0_12.isEmpty())) {
	                            android.view.View v6_13 = (v0_12.size() - 1);
	                            v1_0 = ((zr) v0_12.get(v6_13));
	                            v0_12.remove(v6_13);
	                        }
	                        if (v1_0 != null) {
	                            v1_0.p();
	                            if ((android.support.v7.widget.RecyclerView.j()) && ((v1_0.a instanceof android.view.ViewGroup))) {
	                                this.a(((android.view.ViewGroup) v1_0.a), 0);
	                            }
	                        }
	                        v0_6 = v1_0;
	                    }
	                    if (v0_6 != null) {
	                    } else {
	                        android.view.View v0_19 = android.support.v7.widget.RecyclerView.f(this.e);
	                        zr v1_4 = this.e;
	                        a.a("RV CreateView");
	                        android.view.View v0_20 = v0_19.a(v1_4, v4_5);
	                        v0_20.e = v4_5;
	                        a.b();
	                        v1_3 = v0_20;
	                    }
	                } else {
	                    throw new IndexOutOfBoundsException(new StringBuilder("Inconsistency detected. Invalid item position ").append(p9).append("(offset:").append(v4_4).append(").state:").append(this.e.n.a()).toString());
	                }
	            }
	            if ((!this.e.n.j) || (!v1_3.m())) {
	                if ((v1_3.m()) && ((!v1_3.k()) && (!v1_3.j()))) {
	                    er v4_6 = 0;
	                } else {
	                    android.support.v7.widget.RecyclerView.f(this.e).b(v1_3, this.e.b.a(p9));
	                    android.view.View v0_31 = v1_3.a;
	                    if ((android.support.v7.widget.RecyclerView.q(this.e) != null) && (android.support.v7.widget.RecyclerView.q(this.e).isEnabled())) {
	                        if (gt.e(v0_31) == 0) {
	                            gt.c(v0_31, 1);
	                        }
	                        if (!gt.b(v0_31)) {
	                            gt.a(v0_31, android.support.v7.widget.RecyclerView.r(this.e).c);
	                        }
	                    }
	                    if (this.e.n.j) {
	                        v1_3.f = p9;
	                    }
	                    v4_6 = 1;
	                }
	            } else {
	                v1_3.f = p9;
	                v4_6 = 0;
	            }
	            android.view.View v0_37;
	            android.view.View v0_36 = v1_3.a.getLayoutParams();
	            if (v0_36 != null) {
	                if (this.e.checkLayoutParams(v0_36)) {
	                    v0_37 = ((zi) v0_36);
	                } else {
	                    v0_37 = ((zi) this.e.generateLayoutParams(v0_36));
	                    v1_3.a.setLayoutParams(v0_37);
	                }
	            } else {
	                v0_37 = ((zi) this.e.generateDefaultLayoutParams());
	                v1_3.a.setLayoutParams(v0_37);
	            }
	            v0_37.c = v1_3;
	            if ((v5_0 == null) || (v4_6 == null)) {
	                v2_0 = 0;
	            }
	            v0_37.f = v2_0;
	            return v1_3.a;
	        } else {
	            throw new IndexOutOfBoundsException(new StringBuilder("Invalid item position ").append(p9).append("(").append(p9).append("). Item count:").append(this.e.n.a()).toString());
	        }
	    }
	
	
	    public final void a()
	    {
	        this.a.clear();
	        this.b();
	        return;
	    }
	
	
	    public final void a(android.view.View p4)
	    {
	        zr v0 = android.support.v7.widget.RecyclerView.b(p4);
	        if (v0.o()) {
	            this.e.removeDetachedView(p4, 0);
	        }
	        if (!v0.e()) {
	            if (v0.g()) {
	                v0.h();
	            }
	        } else {
	            v0.f();
	        }
	        this.a(v0);
	        return;
	    }
	
	
	    public final void a(zr p6)
	    {
	        zp v0_0 = 1;
	        zp v1_0 = 0;
	        if ((!p6.e()) && (p6.a.getParent() == null)) {
	            if (!p6.o()) {
	                if (!p6.b()) {
	                    if (((p6.i & 16) != 0) || (!gt.c(p6.a))) {
	                        int v2_9 = 0;
	                    } else {
	                        v2_9 = 1;
	                    }
	                    if ((android.support.v7.widget.RecyclerView.f(this.e) != null) && (v2_9 != 0)) {
	                        android.support.v7.widget.RecyclerView.f(this.e);
	                    }
	                    if (p6.q()) {
	                        int v2_14;
	                        if ((p6.i & 78) == 0) {
	                            v2_14 = 0;
	                        } else {
	                            v2_14 = 1;
	                        }
	                        if (v2_14 == 0) {
	                            int v2_16 = this.c.size();
	                            if ((v2_16 == this.f) && (v2_16 > 0)) {
	                                this.b(0);
	                            }
	                            if (v2_16 < this.f) {
	                                this.c.add(p6);
	                                v1_0 = 1;
	                            }
	                        }
	                        if (v1_0 == null) {
	                            this.c(p6);
	                        }
	                    }
	                    this.e.n.a(p6);
	                    return;
	                } else {
	                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
	                }
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ").append(p6).toString());
	            }
	        } else {
	            int v3_7 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(p6.e()).append(" isAttached:");
	            if (p6.a.getParent() == null) {
	                v0_0 = 0;
	            }
	            throw new IllegalArgumentException(v3_7.append(v0_0).toString());
	        }
	    }
	
	
	    public final void b()
	    {
	        java.util.ArrayList v0_2 = (this.c.size() - 1);
	        while (v0_2 >= null) {
	            this.b(v0_2);
	            v0_2--;
	        }
	        this.c.clear();
	        return;
	    }
	
	
	    public final void b(int p2)
	    {
	        this.c(((zr) this.c.get(p2)));
	        this.c.remove(p2);
	        return;
	    }
	
	
	    final void b(android.view.View p3)
	    {
	        zr v0 = android.support.v7.widget.RecyclerView.b(p3);
	        v0.j = 0;
	        v0.h();
	        this.a(v0);
	        return;
	    }
	
	
	    public final void b(zr p2)
	    {
	        if ((p2.l()) && ((android.support.v7.widget.RecyclerView.h(this.e)) && (this.b != null))) {
	            this.b.remove(p2);
	        } else {
	            this.a.remove(p2);
	        }
	        p2.j = 0;
	        p2.h();
	        return;
	    }
	
	
	    public final zk c()
	    {
	        if (this.g == null) {
	            this.g = new zk();
	        }
	        return this.g;
	    }
	
