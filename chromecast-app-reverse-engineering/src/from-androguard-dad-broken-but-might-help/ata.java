	
	    public ata()
	    {
	        return;
	    }
	
	
	    public static j a(String p3)
	    {
	        ata v0_1 = new ata();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("spinnerDescription", p3);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p4, android.view.ViewGroup p5, android.os.Bundle p6)
	    {
	        android.view.View v1_1 = p4.inflate(a.gK, 0);
	        ((android.widget.TextView) v1_1.findViewById(f.dd)).setText(this.m.getString("spinnerDescription"));
	        return v1_1;
	    }
	
