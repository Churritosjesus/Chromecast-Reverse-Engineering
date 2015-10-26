	
	    public bop(android.content.Context p2, java.util.List p3)
	    {
	        this(p2, a.gP, p3);
	        return;
	    }
	
	
	    public final android.view.View getDropDownView(int p8, android.view.View p9, android.view.ViewGroup p10)
	    {
	        if (p9 == null) {
	            p9 = ((android.view.LayoutInflater) this.getContext().getSystemService("layout_inflater")).inflate(a.gP, 0);
	        }
	        String v0_4 = ((bdb) this.getItem(p8));
	        ((android.widget.TextView) p9.findViewById(f.ce)).setText(v0_4.b);
	        android.widget.TextView v1_7 = ((android.widget.TextView) p9.findViewById(f.cx));
	        String v0_5 = v0_4.c;
	        android.content.res.Resources v2_3 = this.getContext().getResources();
	        Object[] v4_1 = new Object[2];
	        v4_1[0] = Integer.valueOf((v0_5 / 60));
	        v4_1[1] = Integer.valueOf((Math.abs(v0_5) % 60));
	        v1_7.setText(v2_3.getString(b.bB, v4_1));
	        return p9;
	    }
	
	
	    public final android.view.View getView(int p4, android.view.View p5, android.view.ViewGroup p6)
	    {
	        android.view.View v2_0;
	        if (p5 != null) {
	            v2_0 = p5;
	        } else {
	            v2_0 = ((android.view.LayoutInflater) this.getContext().getSystemService("layout_inflater")).inflate(a.gJ, 0);
	        }
	        ((android.widget.TextView) v2_0).setText(((bdb) this.getItem(p4)).b);
	        return v2_0;
	    }
	
