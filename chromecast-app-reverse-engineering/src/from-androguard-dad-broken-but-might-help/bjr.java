	
	    public bjr()
	    {
	        return;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p4, android.view.ViewGroup p5, android.os.Bundle p6)
	    {
	        android.view.View v1_1 = p4.inflate(a.gH, p5, 0);
	        v1_1.findViewById(f.dp).setOnClickListener(this);
	        ((android.widget.TextView) v1_1.findViewById(f.dI)).setText(b.ey);
	        ((android.widget.TextView) v1_1.findViewById(f.dJ)).setText(b.ez);
	        ((android.widget.TextView) v1_1.findViewById(f.dK)).setText(b.eA);
	        ((android.widget.TextView) v1_1.findViewById(f.ct)).setVisibility(8);
	        ((android.widget.Button) v1_1.findViewById(f.dp)).setText(b.dd);
	        return v1_1;
	    }
	
	
	    public final void onClick(android.view.View p2)
	    {
	        this.x.c();
	        return;
	    }
	
