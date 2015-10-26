	private bgg a
	private android.support.v7.widget.RecyclerView b
	
	    public bgb()
	    {
	        return;
	    }
	
	
	    public static bgb a(dbp p3)
	    {
	        android.os.Bundle v0_1 = new android.os.Bundle();
	        v0_1.putByteArray("searchResponse", dbf.a(p3));
	        bgb v1_2 = new bgb();
	        v1_2.f(v0_1);
	        return v1_2;
	    }
	
	
	    static synthetic bgg a(bgb p1)
	    {
	        return p1.a;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p6, android.view.ViewGroup p7, android.os.Bundle p8)
	    {
	        this.a = new bgg(this.y);
	        android.view.View v1_2 = p6.inflate(a.fF, p7, 0);
	        v1_2.findViewById(f.dX).setVisibility(8);
	        this.b = ((android.support.v7.widget.RecyclerView) v1_2.findViewById(f.ak));
	        this.b.a(this.a);
	        dev v0_10 = new xw(this.y);
	        v0_10.a(1);
	        this.b.a(v0_10);
	        this.b.setLayoutAnimation(new android.view.animation.LayoutAnimationController(android.view.animation.AnimationUtils.loadAnimation(this.y, a.dg)));
	        this.b.a(new bgc(this, this.e().getDimensionPixelSize(a.ee)));
	        try {
	            this.a.a(dbp.a(this.m.getByteArray("searchResponse")).a);
	        } catch (dev v0_18) {
	            android.util.Log.w("Error parsing search response proto", v0_18);
	        }
	        return v1_2;
	    }
	
