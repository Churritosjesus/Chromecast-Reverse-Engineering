	private android.widget.ImageView a
	
	    public bkc()
	    {
	        return;
	    }
	
	
	    static synthetic android.widget.ImageView a(bkc p1)
	    {
	        return p1.a;
	    }
	
	
	    public static bkc a(String p2, String p3, String p4)
	    {
	        android.os.Bundle v0_1 = new android.os.Bundle();
	        v0_1.putString("tutorialTitle", p2);
	        v0_1.putString("tutorialDescription", p3);
	        v0_1.putString("tutorialImageUrl", p4);
	        bkc v1_4 = new bkc();
	        v1_4.f(v0_1);
	        return v1_4;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p5, android.view.ViewGroup p6, android.os.Bundle p7)
	    {
	        android.view.View v1_1 = p5.inflate(a.gR, p6, 0);
	        ((android.widget.TextView) v1_1.findViewById(f.em)).setText(this.m.getString("tutorialTitle"));
	        ((android.widget.TextView) v1_1.findViewById(f.aq)).setText(this.m.getString("tutorialDescription"));
	        this.a = ((android.widget.ImageView) v1_1.findViewById(f.bw));
	        if (this.a != null) {
	            this.a.getViewTreeObserver().addOnPreDrawListener(new bkd(this));
	        }
	        return v1_1;
	    }
	
	
	    public final void a(android.graphics.Bitmap p2)
	    {
	        this.a.setImageBitmap(p2);
	        return;
	    }
	
