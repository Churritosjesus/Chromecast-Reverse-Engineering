	private synthetic android.support.v7.internal.widget.ActivityChooserView a
	
	    public rw(android.support.v7.internal.widget.ActivityChooserView p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p3)
	    {
	        if (p3 != android.support.v7.internal.widget.ActivityChooserView.e(this.a)) {
	            if (p3 != android.support.v7.internal.widget.ActivityChooserView.f(this.a)) {
	                throw new IllegalArgumentException();
	            } else {
	                android.support.v7.internal.widget.ActivityChooserView.a(this.a, 0);
	                android.support.v7.internal.widget.ActivityChooserView.a(this.a, android.support.v7.internal.widget.ActivityChooserView.g(this.a));
	            }
	        } else {
	            this.a.b();
	            IllegalArgumentException v0_14 = android.support.v7.internal.widget.ActivityChooserView.a(this.a).a.b(android.support.v7.internal.widget.ActivityChooserView.a(this.a).a.a(android.support.v7.internal.widget.ActivityChooserView.a(this.a).a.b()));
	            if (v0_14 != null) {
	                v0_14.addFlags(524288);
	                this.a.getContext().startActivity(v0_14);
	            }
	        }
	        return;
	    }
	
	
	    public final void onDismiss()
	    {
	        if (android.support.v7.internal.widget.ActivityChooserView.h(this.a) != null) {
	            android.support.v7.internal.widget.ActivityChooserView.h(this.a).onDismiss();
	        }
	        if (this.a.c != null) {
	            this.a.c.a(0);
	        }
	        return;
	    }
	
	
	    public final void onItemClick(android.widget.AdapterView p9, android.view.View p10, int p11, long p12)
	    {
	        switch (((rv) p9.getAdapter()).getItemViewType(p11)) {
	            case 0:
	                this.a.b();
	                if (!android.support.v7.internal.widget.ActivityChooserView.d(this.a)) {
	                    if (!android.support.v7.internal.widget.ActivityChooserView.a(this.a).b) {
	                        p11++;
	                    }
	                    rq v0_13 = android.support.v7.internal.widget.ActivityChooserView.a(this.a).a.b(p11);
	                    if (v0_13 == null) {
	                    } else {
	                        v0_13.addFlags(524288);
	                        this.a.getContext().startActivity(v0_13);
	                    }
	                } else {
	                    if (p11 <= 0) {
	                    } else {
	                        rl v2 = android.support.v7.internal.widget.ActivityChooserView.a(this.a).a;
	                        try {
	                            Object[] v1_7;
	                            v2.d();
	                            rq v0_18 = ((rm) v2.b.get(p11));
	                            Object[] v1_6 = ((rm) v2.b.get(0));
	                        } catch (rq v0_35) {
	                            throw v0_35;
	                        }
	                        if (v1_6 == null) {
	                            v1_7 = 1065353216;
	                        } else {
	                            v1_7 = ((v1_6.b - v0_18.b) + 1084227584);
	                        }
	                        if (v2.c.add(new rp(new android.content.ComponentName(v0_18.a.activityInfo.packageName, v0_18.a.activityInfo.name), System.currentTimeMillis(), v1_7))) {
	                            v2.f = 1;
	                            v2.e();
	                            if (v2.e) {
	                                if (v2.f) {
	                                    v2.f = 0;
	                                    if (!android.text.TextUtils.isEmpty(v2.d)) {
	                                        rq v0_32 = new rq(v2);
	                                        Object[] v1_12 = new Object[2];
	                                        v1_12[0] = v2.c;
	                                        v1_12[1] = v2.d;
	                                        if (android.os.Build$VERSION.SDK_INT < 11) {
	                                            v0_32.execute(v1_12);
	                                        } else {
	                                            v0_32.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, v1_12);
	                                        }
	                                    }
	                                }
	                                v2.notifyChanged();
	                            } else {
	                                throw new IllegalStateException("No preceding call to #readHistoricalData");
	                            }
	                        }
	                    }
	                }
	                break;
	            case 1:
	                android.support.v7.internal.widget.ActivityChooserView.a(this.a, 2147483647);
	                break;
	            default:
	                throw new IllegalArgumentException();
	        }
	        return;
	    }
	
	
	    public final boolean onLongClick(android.view.View p4)
	    {
	        if (p4 != android.support.v7.internal.widget.ActivityChooserView.e(this.a)) {
	            throw new IllegalArgumentException();
	        } else {
	            if (android.support.v7.internal.widget.ActivityChooserView.a(this.a).getCount() > 0) {
	                android.support.v7.internal.widget.ActivityChooserView.a(this.a, 1);
	                android.support.v7.internal.widget.ActivityChooserView.a(this.a, android.support.v7.internal.widget.ActivityChooserView.g(this.a));
	            }
	            return 1;
	        }
	    }
	
