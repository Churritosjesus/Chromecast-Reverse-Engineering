	
	    public bjs()
	    {
	        return;
	    }
	
	
	    public static bjs a(int p3, int p4, boolean p5)
	    {
	        bjs v0_1 = new bjs();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putInt("headerText", p3);
	        v1_1.putInt("descriptionText", p4);
	        v1_1.putBoolean("showTroubleshoot", p5);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p5, android.view.ViewGroup p6, android.os.Bundle p7)
	    {
	        int v1_3;
	        android.view.View v2 = p5.inflate(a.gt, p6, 0);
	        int v1_1 = this.m;
	        ((android.widget.TextView) v2.findViewById(f.bo)).setText(v1_1.getInt("headerText"));
	        m v0_6 = ((android.widget.TextView) v2.findViewById(f.aq));
	        v0_6.setText(v1_1.getInt("descriptionText"));
	        v0_6.setMovementMethod(new android.text.method.ScrollingMovementMethod());
	        m v0_9 = ((android.widget.Button) v2.findViewById(f.aR));
	        v0_9.setOnClickListener(this);
	        if (!v1_1.getBoolean("showTroubleshoot")) {
	            v1_3 = b.cr;
	        } else {
	            v1_3 = b.cA;
	        }
	        v0_9.setText(v1_3);
	        blx.g(this.y);
	        return v2;
	    }
	
	
	    public final void onClick(android.view.View p3)
	    {
	        if (!this.m.getBoolean("showTroubleshoot")) {
	            ((bjt) this.y).l();
	        } else {
	            ((bjt) this.y).m();
	        }
	        return;
	    }
	
