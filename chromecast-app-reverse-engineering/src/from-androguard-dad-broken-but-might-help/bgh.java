	final bgk k
	 com.google.android.apps.chromecast.app.widget.ReusableImageView l
	 android.widget.TextView m
	 android.support.v7.widget.RecyclerView n
	 android.widget.Button o
	
	    public bgh(bgk p4, android.view.View p5)
	    {
	        this(p5);
	        this.k = p4;
	        this.l = ((com.google.android.apps.chromecast.app.widget.ReusableImageView) p5.findViewById(f.dN));
	        this.m = ((android.widget.TextView) p5.findViewById(f.dO));
	        this.o = ((android.widget.Button) p5.findViewById(f.et));
	        this.n = ((android.support.v7.widget.RecyclerView) p5.findViewById(f.am));
	        android.support.v7.widget.RecyclerView v0_13 = new xw(p5.getContext());
	        v0_13.a(0);
	        this.n.a(v0_13);
	        this.n.a(new bgi(this, p5.getResources().getDimensionPixelSize(a.dH)));
	        this.n.a(new xe());
	        return;
	    }
	
