	
	    public bju()
	    {
	        return;
	    }
	
	
	    public static bju a(boolean p3)
	    {
	        bju v0_1 = new bju();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putBoolean("tvError", p3);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p9, android.view.ViewGroup p10, android.os.Bundle p11)
	    {
	        android.view.View v5 = p9.inflate(a.gu, p10, 0);
	        int v0_3 = ((android.widget.TextView) v5.findViewById(f.aq));
	        v5.findViewById(f.O).setOnClickListener(this);
	        android.widget.ImageView v1_5 = ((android.widget.ImageView) v5.findViewById(f.bv));
	        android.widget.Button v2_2 = ((android.widget.Button) v5.findViewById(f.L));
	        v2_2.setOnClickListener(this);
	        android.widget.Button v3_2 = ((android.widget.Button) v5.findViewById(f.M));
	        v3_2.setOnClickListener(this);
	        android.widget.Button v4_2 = ((android.widget.Button) v5.findViewById(f.N));
	        v4_2.setOnClickListener(this);
	        if (!this.m.getBoolean("tvError")) {
	            v0_3.setText(b.cj);
	            v1_5.setImageResource(a.ey);
	            v2_2.setText(b.ck);
	            v3_2.setText(b.cl);
	            v4_2.setText(b.cm);
	        } else {
	            v0_3.setText(b.cB);
	            v1_5.setImageResource(a.ez);
	            v2_2.setText(b.cC);
	            v3_2.setText(b.cD);
	            v4_2.setVisibility(8);
	        }
	        return v5;
	    }
	
	
	    public final void onClick(android.view.View p3)
	    {
	        ((bjv) this.y).a(p3.getId());
	        return;
	    }
	
