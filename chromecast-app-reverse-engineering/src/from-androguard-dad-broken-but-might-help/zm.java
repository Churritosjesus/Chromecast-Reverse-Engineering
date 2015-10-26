	private synthetic android.support.v7.widget.RecyclerView a
	
	    public zm(android.support.v7.widget.RecyclerView p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    private void b()
	    {
	        if ((!android.support.v7.widget.RecyclerView.m(this.a)) || ((!android.support.v7.widget.RecyclerView.n(this.a)) || (!android.support.v7.widget.RecyclerView.o(this.a)))) {
	            android.support.v7.widget.RecyclerView.b(this.a, 1);
	            this.a.requestLayout();
	        } else {
	            gt.a(this.a, android.support.v7.widget.RecyclerView.p(this.a));
	        }
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.a.a(0);
	        android.support.v7.widget.RecyclerView.f(this.a);
	        this.a.n.i = 1;
	        android.support.v7.widget.RecyclerView.l(this.a);
	        if (!this.a.b.d()) {
	            this.a.requestLayout();
	        }
	        return;
	    }
	
	
	    public final void a(int p5, int p6)
	    {
	        int v0 = 1;
	        this.a.a(0);
	        int v1_2 = this.a.b;
	        v1_2.a.add(v1_2.a(2, p5, p6));
	        if (v1_2.a.size() != 1) {
	            v0 = 0;
	        }
	        if (v0 != 0) {
	            this.b();
	        }
	        return;
	    }
	
	
	    public final void a(int p5, int p6, int p7)
	    {
	        int v0 = 1;
	        this.a.a(0);
	        int v1_2 = this.a.b;
	        if (p5 == p6) {
	            v0 = 0;
	        } else {
	            v1_2.a.add(v1_2.a(3, p5, p6));
	            if (v1_2.a.size() != 1) {
	            }
	        }
	        if (v0 != 0) {
	            this.b();
	        }
	        return;
	    }
	
	
	    public final void b(int p6, int p7)
	    {
	        int v0 = 1;
	        this.a.a(0);
	        int v2_2 = this.a.b;
	        v2_2.a.add(v2_2.a(0, p6, p7));
	        if (v2_2.a.size() != 1) {
	            v0 = 0;
	        }
	        if (v0 != 0) {
	            this.b();
	        }
	        return;
	    }
	
	
	    public final void c(int p5, int p6)
	    {
	        int v0 = 1;
	        this.a.a(0);
	        int v1_2 = this.a.b;
	        v1_2.a.add(v1_2.a(1, p5, p6));
	        if (v1_2.a.size() != 1) {
	            v0 = 0;
	        }
	        if (v0 != 0) {
	            this.b();
	        }
	        return;
	    }
	
