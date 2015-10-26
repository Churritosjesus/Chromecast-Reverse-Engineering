	private synthetic android.support.v7.widget.RecyclerView a
	
	    public yx(android.support.v7.widget.RecyclerView p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final int a()
	    {
	        return this.a.getChildCount();
	    }
	
	
	    public final int a(android.view.View p2)
	    {
	        return this.a.indexOfChild(p2);
	    }
	
	
	    public final void a(int p3)
	    {
	        android.support.v7.widget.RecyclerView v0_1 = this.a.getChildAt(p3);
	        if (v0_1 != null) {
	            android.support.v7.widget.RecyclerView.b(this.a, v0_1);
	        }
	        this.a.removeViewAt(p3);
	        return;
	    }
	
	
	    public final void a(android.view.View p2, int p3)
	    {
	        this.a.addView(p2, p3);
	        android.support.v7.widget.RecyclerView.a(this.a, p2);
	        return;
	    }
	
	
	    public final void a(android.view.View p5, int p6, android.view.ViewGroup$LayoutParams p7)
	    {
	        String v0_0 = android.support.v7.widget.RecyclerView.b(p5);
	        if (v0_0 != null) {
	            if ((v0_0.o()) || (v0_0.b())) {
	                v0_0.i();
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("Called attach on a child which is not detached: ").append(v0_0).toString());
	            }
	        }
	        android.support.v7.widget.RecyclerView.a(this.a, p5, p6, p7);
	        return;
	    }
	
	
	    public final android.view.View b(int p2)
	    {
	        return this.a.getChildAt(p2);
	    }
	
	
	    public final zr b(android.view.View p2)
	    {
	        return android.support.v7.widget.RecyclerView.b(p2);
	    }
	
	
	    public final void b()
	    {
	        int v1 = this.a.getChildCount();
	        android.support.v7.widget.RecyclerView v0_1 = 0;
	        while (v0_1 < v1) {
	            android.support.v7.widget.RecyclerView.b(this.a, this.b(v0_1));
	            v0_1++;
	        }
	        this.a.removeAllViews();
	        return;
	    }
	
	
	    public final void c(int p5)
	    {
	        String v0_0 = this.b(p5);
	        if (v0_0 != null) {
	            String v0_1 = android.support.v7.widget.RecyclerView.b(v0_0);
	            if (v0_1 != null) {
	                if ((!v0_1.o()) || (v0_1.b())) {
	                    v0_1.a(256);
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder("called detach on an already detached child ").append(v0_1).toString());
	                }
	            }
	        }
	        android.support.v7.widget.RecyclerView.a(this.a, p5);
	        return;
	    }
	
