	final synthetic bny a
	final synthetic bmu b
	
	    bnb(bmu p1, android.content.Context p2, int p3, java.util.List p4, bny p5)
	    {
	        this.b = p1;
	        this.a = p5;
	        this(p2, p3, p4);
	        return;
	    }
	
	
	    public final android.view.View getView(int p5, android.view.View p6, android.view.ViewGroup p7)
	    {
	        aow v0_3 = ((aow) this.b.c.get(p5));
	        if (p6 == null) {
	            p6 = android.view.LayoutInflater.from(this.b.h).inflate(a.gc, 0);
	        }
	        ((android.widget.TextView) p6.findViewById(f.aE)).setText(v0_3.g());
	        p6.setOnClickListener(new bnc(this, v0_3));
	        return p6;
	    }
	
