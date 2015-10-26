	
	    public bok()
	    {
	        return;
	    }
	
	
	    public static bok b(int p3)
	    {
	        bok v0_1 = new bok();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putInt("layoutResId", p3);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p3, android.view.ViewGroup p4, android.os.Bundle p5)
	    {
	        return p3.inflate(this.m.getInt("layoutResId"), p4, 0);
	    }
	
