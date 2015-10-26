	 android.widget.TextView k
	 com.google.android.apps.chromecast.app.widget.ReusableImageView l
	 android.support.v7.widget.RecyclerView m
	 android.widget.Button n
	final xw o
	
	    public axy(android.view.View p4)
	    {
	        this(p4);
	        this.l = ((com.google.android.apps.chromecast.app.widget.ReusableImageView) p4.findViewById(f.dg));
	        this.k = ((android.widget.TextView) p4.findViewById(f.dh));
	        this.n = ((android.widget.Button) p4.findViewById(f.cy));
	        this.m = ((android.support.v7.widget.RecyclerView) p4.findViewById(f.am));
	        this.o = new xw(p4.getContext());
	        this.o.a(0);
	        this.m.a(this.o);
	        this.m.a(new axz(this, p4.getResources().getDimensionPixelSize(a.dH)));
	        this.m.a(new xe());
	        return;
	    }
	
