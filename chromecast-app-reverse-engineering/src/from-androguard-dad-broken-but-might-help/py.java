	 android.view.LayoutInflater a
	 qa b
	  c
	public qq d
	private android.content.Context e
	private android.support.v7.internal.view.menu.ExpandedMenuView f
	private  g
	private pz h
	
	    private py(int p2, int p3)
	    {
	        this.c = p2;
	        this.g = 0;
	        return;
	    }
	
	
	    public py(android.content.Context p2, int p3)
	    {
	        this(p3, 0);
	        this.e = p2;
	        this.a = android.view.LayoutInflater.from(this.e);
	        return;
	    }
	
	
	    static synthetic int a(py p1)
	    {
	        return 0;
	    }
	
	
	    public final qr a(android.view.ViewGroup p4)
	    {
	        if (this.f == null) {
	            this.f = ((android.support.v7.internal.view.menu.ExpandedMenuView) this.a.inflate(a.bI, p4, 0));
	            if (this.h == null) {
	                this.h = new pz(this);
	            }
	            this.f.setAdapter(this.h);
	            this.f.setOnItemClickListener(this);
	        }
	        return this.f;
	    }
	
	
	    public final void a(android.content.Context p3, qa p4)
	    {
	        if (this.g == 0) {
	            if (this.e != null) {
	                this.e = p3;
	                if (this.a == null) {
	                    this.a = android.view.LayoutInflater.from(this.e);
	                }
	            }
	        } else {
	            this.e = new android.view.ContextThemeWrapper(p3, this.g);
	            this.a = android.view.LayoutInflater.from(this.e);
	        }
	        this.b = p4;
	        if (this.h != null) {
	            this.h.notifyDataSetChanged();
	        }
	        return;
	    }
	
	
	    public final void a(qa p2, boolean p3)
	    {
	        if (this.d != null) {
	            this.d.a(p2, p3);
	        }
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        return 0;
	    }
	
	
	    public final boolean a(qu p13)
	    {
	        int v0_0 = 0;
	        if (p13.hasVisibleItems()) {
	            qd v3_1 = new qd(p13);
	            na v1_1 = v3_1.a;
	            int v4_1 = new ne(v1_1.a);
	            v3_1.c = new py(v4_1.a.a, a.bL);
	            v3_1.c.d = v3_1;
	            v3_1.a.a(v3_1.c);
	            v4_1.a.h = v3_1.c.b();
	            v4_1.a.i = v3_1;
	            nd v5_8 = v1_1.h;
	            if (v5_8 == null) {
	                v4_1.a.c = v1_1.g;
	                v4_1.a.d = v1_1.f;
	            } else {
	                v4_1.a.e = v5_8;
	            }
	            v4_1.a.g = v3_1;
	            nd v5_12 = new nd(v4_1.a.a, v4_1.b);
	            mz v6_6 = v4_1.a;
	            mx v7_1 = nd.a(v5_12);
	            if (v6_6.e == null) {
	                if (v6_6.d != null) {
	                    v7_1.a(v6_6.d);
	                }
	                if (v6_6.c != null) {
	                    na v1_11 = v6_6.c;
	                    v7_1.y = v1_11;
	                    v7_1.x = 0;
	                    if (v7_1.z != null) {
	                        if (v1_11 == null) {
	                            v7_1.z.setVisibility(8);
	                        } else {
	                            v7_1.z.setImageDrawable(v1_11);
	                        }
	                    }
	                }
	            } else {
	                v7_1.C = v6_6.e;
	            }
	            if (v6_6.h != null) {
	                na v1_16;
	                int v0_8 = ((android.widget.ListView) v6_6.b.inflate(v7_1.H, 0));
	                if (v6_6.h == null) {
	                    v1_16 = new nc(v6_6.a, v7_1.J, 16908308, 0);
	                } else {
	                    v1_16 = v6_6.h;
	                }
	                v7_1.D = v1_16;
	                v7_1.E = v6_6.j;
	                if (v6_6.i != null) {
	                    v0_8.setOnItemClickListener(new na(v6_6, v7_1));
	                }
	                v7_1.f = v0_8;
	            }
	            v5_12.setCancelable(v4_1.a.f);
	            if (v4_1.a.f) {
	                v5_12.setCanceledOnTouchOutside(1);
	            }
	            v5_12.setOnCancelListener(0);
	            v5_12.setOnDismissListener(0);
	            if (v4_1.a.g != null) {
	                v5_12.setOnKeyListener(v4_1.a.g);
	            }
	            v3_1.b = v5_12;
	            v3_1.b.setOnDismissListener(v3_1);
	            int v0_20 = v3_1.b.getWindow().getAttributes();
	            v0_20.type = 1003;
	            v0_20.flags = (v0_20.flags | 131072);
	            v3_1.b.show();
	            if (this.d != null) {
	                this.d.a_(p13);
	            }
	            v0_0 = 1;
	        }
	        return v0_0;
	    }
	
	
	    public final android.widget.ListAdapter b()
	    {
	        if (this.h == null) {
	            this.h = new pz(this);
	        }
	        return this.h;
	    }
	
	
	    public final void b(boolean p2)
	    {
	        if (this.h != null) {
	            this.h.notifyDataSetChanged();
	        }
	        return;
	    }
	
	
	    public final boolean b(qe p2)
	    {
	        return 0;
	    }
	
	
	    public final boolean c(qe p2)
	    {
	        return 0;
	    }
	
	
	    public final void onItemClick(android.widget.AdapterView p4, android.view.View p5, int p6, long p7)
	    {
	        this.b.a(this.h.a(p6), this, 0);
	        return;
	    }
	
