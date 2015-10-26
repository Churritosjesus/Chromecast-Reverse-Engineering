	private  a
	private synthetic py b
	
	    public pz(py p2)
	    {
	        this.b = p2;
	        this.a = -1;
	        this.a();
	        return;
	    }
	
	
	    private void a()
	    {
	        qe v2 = this.b.b.i;
	        if (v2 == null) {
	            this.a = -1;
	        } else {
	            java.util.ArrayList v3 = this.b.b.j();
	            int v4 = v3.size();
	            int v1 = 0;
	            while (v1 < v4) {
	                if (((qe) v3.get(v1)) != v2) {
	                    v1++;
	                } else {
	                    this.a = v1;
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final qe a(int p4)
	    {
	        java.util.ArrayList v1 = this.b.b.j();
	        int v0_4 = (py.a(this.b) + p4);
	        if ((this.a >= 0) && (v0_4 >= this.a)) {
	            v0_4++;
	        }
	        return ((qe) v1.get(v0_4));
	    }
	
	
	    public final int getCount()
	    {
	        int v0_4 = (this.b.b.j().size() - py.a(this.b));
	        if (this.a >= 0) {
	            v0_4--;
	        }
	        return v0_4;
	    }
	
	
	    public final synthetic Object getItem(int p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public final long getItemId(int p3)
	    {
	        return ((long) p3);
	    }
	
	
	    public final android.view.View getView(int p5, android.view.View p6, android.view.ViewGroup p7)
	    {
	        android.view.View v1_0;
	        if (p6 != null) {
	            v1_0 = p6;
	        } else {
	            v1_0 = this.b.a.inflate(this.b.c, p7, 0);
	        }
	        ((qs) v1_0).a(this.a(p5), 0);
	        return v1_0;
	    }
	
	
	    public final void notifyDataSetChanged()
	    {
	        this.a();
	        super.notifyDataSetChanged();
	        return;
	    }
	
