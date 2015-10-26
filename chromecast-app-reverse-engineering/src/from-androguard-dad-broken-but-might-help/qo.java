	private qa a
	private  b
	private synthetic qn c
	
	    public qo(qn p2, qa p3)
	    {
	        this.c = p2;
	        this.b = -1;
	        this.a = p3;
	        this.a();
	        return;
	    }
	
	
	    static synthetic qa a(qo p1)
	    {
	        return p1.a;
	    }
	
	
	    private void a()
	    {
	        qe v2 = qn.c(this.c).i;
	        if (v2 == null) {
	            this.b = -1;
	        } else {
	            java.util.ArrayList v3 = qn.c(this.c).j();
	            int v4 = v3.size();
	            int v1 = 0;
	            while (v1 < v4) {
	                if (((qe) v3.get(v1)) != v2) {
	                    v1++;
	                } else {
	                    this.b = v1;
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final qe a(int p3)
	    {
	        qe v0_3;
	        if (!qn.a(this.c)) {
	            v0_3 = this.a.h();
	        } else {
	            v0_3 = this.a.j();
	        }
	        if ((this.b >= 0) && (p3 >= this.b)) {
	            p3++;
	        }
	        return ((qe) v0_3.get(p3));
	    }
	
	
	    public final int getCount()
	    {
	        int v0_3;
	        if (!qn.a(this.c)) {
	            v0_3 = this.a.h();
	        } else {
	            v0_3 = this.a.j();
	        }
	        int v0_6;
	        if (this.b >= 0) {
	            v0_6 = (v0_3.size() - 1);
	        } else {
	            v0_6 = v0_3.size();
	        }
	        return v0_6;
	    }
	
	
	    public final synthetic Object getItem(int p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public final long getItemId(int p3)
	    {
	        return ((long) p3);
	    }
	
	
	    public final android.view.View getView(int p6, android.view.View p7, android.view.ViewGroup p8)
	    {
	        android.view.View v1_0;
	        if (p7 != null) {
	            v1_0 = p7;
	        } else {
	            v1_0 = qn.b(this.c).inflate(qn.a, p8, 0);
	        }
	        qs v0_3 = ((qs) v1_0);
	        if (this.c.e) {
	            qe v2_3 = ((android.support.v7.internal.view.menu.ListMenuItemView) v1_0);
	            v2_3.b = 1;
	            v2_3.a = 1;
	        }
	        v0_3.a(this.a(p6), 0);
	        return v1_0;
	    }
	
	
	    public final void notifyDataSetChanged()
	    {
	        this.a();
	        super.notifyDataSetChanged();
	        return;
	    }
	
