	final android.support.v7.widget.RecyclerView b
	final er c
	
	    public zs(android.support.v7.widget.RecyclerView p2)
	    {
	        this.c = new zt(this);
	        this.b = p2;
	        return;
	    }
	
	
	    public final void a(android.view.View p8, jd p9)
	    {
	        super.a(p8, p9);
	        p9.a(android.support.v7.widget.RecyclerView.getName());
	        if ((!this.a()) && (this.b.e != null)) {
	            Object v0_6 = this.b.e;
	            jh v1_1 = v0_6.e.a;
	            Object v2_1 = v0_6.e.n;
	            if ((gt.b(v0_6.e, -1)) || (gt.a(v0_6.e, -1))) {
	                p9.a(8192);
	                p9.c(1);
	            }
	            if ((gt.b(v0_6.e, 1)) || (gt.a(v0_6.e, 1))) {
	                p9.a(4096);
	                p9.c(1);
	            }
	            jd.a.a(p9.b, ((jl) new jl(jd.k().a(v0_6.a(v1_1, v2_1), v0_6.b(v1_1, v2_1), 0, 0))).a);
	        }
	        return;
	    }
	
	
	    boolean a()
	    {
	        int v0_3;
	        int v0_0 = this.b;
	        if ((v0_0.g) && ((!v0_0.h) && (!v0_0.b.d()))) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final boolean a(android.view.View p8, int p9, android.os.Bundle p10)
	    {
	        int v1_0 = 0;
	        if (!super.a(p8, p9, p10)) {
	            if ((!this.a()) && (this.b.e != null)) {
	                zh v4 = this.b.e;
	                if (v4.e != null) {
	                    int v0_14;
	                    int v0_10;
	                    int v3_8;
	                    switch (p9) {
	                        case 4096:
	                            if (!gt.b(v4.e, 1)) {
	                                v0_10 = 0;
	                            } else {
	                                v0_10 = ((v4.p() - v4.r()) - v4.t());
	                            }
	                            if (!gt.a(v4.e, 1)) {
	                                v3_8 = v0_10;
	                                v0_14 = 0;
	                            } else {
	                                v3_8 = v0_10;
	                                v0_14 = ((v4.o() - v4.q()) - v4.s());
	                            }
	                            break;
	                        case 8192:
	                            if (!gt.b(v4.e, -1)) {
	                                v0_10 = 0;
	                            } else {
	                                v0_10 = (- ((v4.p() - v4.r()) - v4.t()));
	                            }
	                            if (!gt.a(v4.e, -1)) {
	                            } else {
	                                v3_8 = v0_10;
	                                v0_14 = (- ((v4.o() - v4.q()) - v4.s()));
	                            }
	                            break;
	                        default:
	                            v0_14 = 0;
	                            v3_8 = 0;
	                    }
	                    if ((v3_8 != 0) || (v0_14 != 0)) {
	                        v4.e.scrollBy(v0_14, v3_8);
	                        v1_0 = 1;
	                    }
	                }
	            }
	        } else {
	            v1_0 = 1;
	        }
	        return v1_0;
	    }
	
	
	    public final void d(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
	    {
	        super.d(p2, p3);
	        p3.setClassName(android.support.v7.widget.RecyclerView.getName());
	        if (((p2 instanceof android.support.v7.widget.RecyclerView)) && ((!this.a()) && (((android.support.v7.widget.RecyclerView) p2).e != null))) {
	            ((android.support.v7.widget.RecyclerView) p2).e.a(p3);
	        }
	        return;
	    }
	
