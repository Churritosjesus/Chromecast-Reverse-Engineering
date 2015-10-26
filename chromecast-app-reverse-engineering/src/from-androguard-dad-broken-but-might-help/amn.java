	
	    public amn()
	    {
	        return;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p7, android.view.ViewGroup p8, android.os.Bundle p9)
	    {
	        android.view.View v2 = p7.inflate(a.gb, p8, 0);
	        String v3 = this.m.getString("stringTitle");
	        String v4 = this.m.getString("stringBody");
	        String[] v5 = this.m.getStringArray("urlPatternLink");
	        android.widget.TextView v1_6 = ((android.widget.TextView) v2.findViewById(f.ek));
	        ((android.widget.TextView) v2.findViewById(f.el)).setText(v3);
	        v1_6.setText(v4);
	        blx.a(v1_6, v5);
	        return v2;
	    }
	
