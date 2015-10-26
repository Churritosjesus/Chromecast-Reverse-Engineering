	private synthetic nm a
	
	    nn(nm p1, android.view.Window$Callback p2)
	    {
	        this.a = p1;
	        this(p1, p2);
	        return;
	    }
	
	
	    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode$Callback p12)
	    {
	        android.view.View v0_2;
	        if (!this.a.n) {
	            v0_2 = super.onWindowStartingActionMode(p12);
	        } else {
	            pl v4_1 = new pl(this.a.a, p12);
	            nm v5 = this.a;
	            if (v5.o != null) {
	                v5.o.c();
	            }
	            nu v6_1 = new nu(v5, v4_1);
	            android.view.View v0_7 = v5.a();
	            if (v0_7 != null) {
	                v5.o = v0_7.a(v6_1);
	            }
	            if (v5.o == null) {
	                if (v5.o != null) {
	                    v5.o.c();
	                }
	                nu v7_1 = new nu(v5, v6_1);
	                if (v5.p == null) {
	                    if (!v5.j) {
	                        android.view.View v0_16 = ((android.support.v7.internal.widget.ViewStubCompat) v5.s.findViewById(a.aV));
	                        if (v0_16 != null) {
	                            v0_16.a = android.view.LayoutInflater.from(v5.k());
	                            v5.p = ((android.support.v7.internal.widget.ActionBarContextView) v0_16.a());
	                        }
	                    } else {
	                        android.view.View v0_21;
	                        int v8_4 = new android.util.TypedValue();
	                        android.view.View v0_20 = v5.a.getTheme();
	                        v0_20.resolveAttribute(a.l, v8_4, 1);
	                        if (v8_4.resourceId == 0) {
	                            v0_21 = v5.a;
	                        } else {
	                            android.content.res.Resources$Theme v9_4 = v5.a.getResources().newTheme();
	                            v9_4.setTo(v0_20);
	                            v9_4.applyStyle(v8_4.resourceId, 1);
	                            v0_21 = new pi(v5.a, 0);
	                            v0_21.getTheme().setTo(v9_4);
	                        }
	                        v5.p = new android.support.v7.internal.widget.ActionBarContextView(v0_21);
	                        v5.q = new android.widget.PopupWindow(v0_21, 0, a.o);
	                        v5.q.setContentView(v5.p);
	                        v5.q.setWidth(-1);
	                        v0_21.getTheme().resolveAttribute(a.h, v8_4, 1);
	                        v5.p.e = android.util.TypedValue.complexToDimensionPixelSize(v8_4.data, v0_21.getResources().getDisplayMetrics());
	                        v5.q.setHeight(-2);
	                        v5.r = new ns(v5);
	                    }
	                }
	                if (v5.p != null) {
	                    android.view.View v0_34;
	                    v5.p.c();
	                    android.content.res.Resources$Theme v9_12 = v5.p.getContext();
	                    if (v5.q != null) {
	                        v0_34 = 0;
	                    } else {
	                        v0_34 = 1;
	                    }
	                    int v8_9 = new pj(v9_12, v5.p, v7_1, v0_34);
	                    if (!v6_1.a(v8_9, v8_9.b())) {
	                        v5.o = 0;
	                    } else {
	                        v8_9.d();
	                        v5.p.a(v8_9);
	                        v5.p.setVisibility(0);
	                        v5.o = v8_9;
	                        if (v5.q != null) {
	                            v5.b.getDecorView().post(v5.r);
	                        }
	                        v5.p.sendAccessibilityEvent(32);
	                        if (v5.p.getParent() != null) {
	                            gt.q(((android.view.View) v5.p.getParent()));
	                        }
	                    }
	                }
	                v5.o = v5.o;
	            }
	            android.view.View v0_49 = v5.o;
	            if (v0_49 == null) {
	                v0_2 = 0;
	            } else {
	                v0_2 = v4_1.b(v0_49);
	            }
	        }
	        return v0_2;
	    }
	
