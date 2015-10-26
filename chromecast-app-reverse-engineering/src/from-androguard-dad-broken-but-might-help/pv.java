	public android.content.Context a
	public android.content.Context b
	public qa c
	public qq d
	public qr e
	private android.view.LayoutInflater f
	private  g
	private  h
	
	    public pv(android.content.Context p2, int p3, int p4)
	    {
	        this.a = p2;
	        this.f = android.view.LayoutInflater.from(p2);
	        this.g = p3;
	        this.h = p4;
	        return;
	    }
	
	
	    public android.view.View a(qe p4, android.view.View p5, android.view.ViewGroup p6)
	    {
	        android.view.View v0_3;
	        if (!(p5 instanceof qs)) {
	            v0_3 = ((qs) this.f.inflate(this.h, p6, 0));
	        } else {
	            v0_3 = ((qs) p5);
	        }
	        this.a(p4, v0_3);
	        return ((android.view.View) v0_3);
	    }
	
	
	    public qr a(android.view.ViewGroup p4)
	    {
	        if (this.e == null) {
	            this.e = ((qr) this.f.inflate(this.g, p4, 0));
	            this.e.a(this.c);
	            this.b(1);
	        }
	        return this.e;
	    }
	
	
	    public void a(android.content.Context p2, qa p3)
	    {
	        this.b = p2;
	        android.view.LayoutInflater.from(this.b);
	        this.c = p3;
	        return;
	    }
	
	
	    public void a(qa p2, boolean p3)
	    {
	        if (this.d != null) {
	            this.d.a(p2, p3);
	        }
	        return;
	    }
	
	
	    public boolean a()
	    {
	        return 0;
	    }
	
	
	    public boolean a(android.view.ViewGroup p2, int p3)
	    {
	        p2.removeViewAt(p3);
	        return 1;
	    }
	
	
	    public boolean a(qe p2)
	    {
	        return 1;
	    }
	
	
	    public boolean a(qu p2)
	    {
	        int v0_1;
	        if (this.d == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.d.a_(p2);
	        }
	        return v0_1;
	    }
	
	
	    public void b(boolean p11)
	    {
	        android.view.ViewGroup v0_1 = ((android.view.ViewGroup) this.e);
	        if (v0_1 != null) {
	            int v4;
	            if (this.c == null) {
	                v4 = 0;
	            } else {
	                this.c.i();
	                java.util.ArrayList v7 = this.c.h();
	                int v8 = v7.size();
	                int v6 = 0;
	                v4 = 0;
	                while (v6 < v8) {
	                    android.view.ViewGroup v1_7;
	                    android.view.ViewGroup v1_6 = ((qe) v7.get(v6));
	                    if (!this.a(v1_6)) {
	                        v1_7 = v4;
	                    } else {
	                        int v2_2;
	                        android.view.View v3 = v0_1.getChildAt(v4);
	                        if (!(v3 instanceof qs)) {
	                            v2_2 = 0;
	                        } else {
	                            v2_2 = ((qs) v3).a();
	                        }
	                        android.view.View v9 = this.a(v1_6, v3, v0_1);
	                        if (v1_6 != v2_2) {
	                            v9.setPressed(0);
	                            gt.s(v9);
	                        }
	                        if (v9 != v3) {
	                            android.view.ViewGroup v1_9 = ((android.view.ViewGroup) v9.getParent());
	                            if (v1_9 != null) {
	                                v1_9.removeView(v9);
	                            }
	                            ((android.view.ViewGroup) this.e).addView(v9, v4);
	                        }
	                        v1_7 = (v4 + 1);
	                    }
	                    v6++;
	                    v4 = v1_7;
	                }
	            }
	            while (v4 < v0_1.getChildCount()) {
	                if (!this.a(v0_1, v4)) {
	                    v4++;
	                }
	            }
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
	
