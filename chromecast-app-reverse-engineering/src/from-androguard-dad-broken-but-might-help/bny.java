	 android.widget.TextView k
	 android.widget.ListView l
	 android.view.View m
	public  n
	final synthetic bmu o
	
	    public bny(bmu p5)
	    {
	        this.o = p5;
	        this(android.view.LayoutInflater.from(p5.h).inflate(a.gd, 0, 0));
	        this.n = 0;
	        this.k = ((android.widget.TextView) this.a.findViewById(f.au));
	        this.m = this.a.findViewById(f.aQ);
	        this.l = ((android.widget.ListView) this.a.findViewById(f.bs));
	        this.l.setVisibility(0);
	        this.l.setLayoutParams(new android.widget.LinearLayout$LayoutParams(p5.j, 0));
	        this.k.setOnClickListener(new bnz(this, p5));
	        return;
	    }
	
