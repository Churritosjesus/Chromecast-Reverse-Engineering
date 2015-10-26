	private synthetic bnu a
	
	    bnv(bnu p1, bmu p2)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p6)
	    {
	        android.widget.ListView v0_2;
	        int v1_0 = 0;
	        if (this.a.n) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        this.a.n = v0_2;
	        if (!this.a.n) {
	            v1_0 = 8;
	        }
	        this.a.m.setVisibility(v1_0);
	        this.a.l.startAnimation(new bnx(this.a.o, this.a.l, (this.a.o.h.getResources().getDimensionPixelSize(a.dC) * this.a.o.d.size()), this.a.n));
	        return;
	    }
	
