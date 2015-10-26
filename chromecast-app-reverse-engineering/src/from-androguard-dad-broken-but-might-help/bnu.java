	 android.widget.TextView k
	 android.widget.ListView l
	 android.view.View m
	  n
	final synthetic bmu o
	
	    public bnu(bmu p4, android.view.View p5)
	    {
	        this.o = p4;
	        this(p5);
	        this.n = 0;
	        this.k = ((android.widget.TextView) p5.findViewById(f.au));
	        this.l = ((android.widget.ListView) p5.findViewById(f.bs));
	        this.m = p5.findViewById(f.aQ);
	        this.l.setVisibility(0);
	        this.l.setLayoutParams(new android.widget.LinearLayout$LayoutParams(p4.j, 0));
	        this.k.setOnClickListener(new bnv(this, p4));
	        return;
	    }
	
