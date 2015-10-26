	private synthetic android.support.v7.widget.RecyclerView a
	
	    public yu(android.support.v7.widget.RecyclerView p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void run()
	    {
	        if (android.support.v7.widget.RecyclerView.a(this.a)) {
	            if (!android.support.v7.widget.RecyclerView.b(this.a)) {
	                if (this.a.b.d()) {
	                    a.a("RV PartialInvalidate");
	                    this.a.a();
	                    this.a.b.b();
	                    if (!android.support.v7.widget.RecyclerView.c(this.a)) {
	                        int v1_0 = this.a;
	                        int v2 = v1_0.c.a();
	                        int v0_14 = 0;
	                        while (v0_14 < v2) {
	                            zr v3_2 = android.support.v7.widget.RecyclerView.b(v1_0.c.b(v0_14));
	                            if ((v3_2 != null) && (!v3_2.b())) {
	                                if ((!v3_2.n()) && (!v3_2.j())) {
	                                    if (v3_2.k()) {
	                                        if (v3_2.e != v1_0.d.a(v3_2.b)) {
	                                            v1_0.requestLayout();
	                                            break;
	                                        } else {
	                                            if ((v3_2.l()) && (v1_0.g())) {
	                                                v1_0.requestLayout();
	                                            } else {
	                                                v1_0.d.b(v3_2, v3_2.b);
	                                            }
	                                        }
	                                    }
	                                } else {
	                                    v1_0.requestLayout();
	                                }
	                            }
	                            v0_14++;
	                        }
	                    }
	                    this.a.a(1);
	                    a.b();
	                }
	            } else {
	                a.a("RV FullInvalidate");
	                this.a.h();
	                a.b();
	            }
	        }
	        return;
	    }
	
