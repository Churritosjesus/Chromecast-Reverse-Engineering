	private final android.content.Context b
	private Ldbf c
	
	    public bgg(android.content.Context p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v0_2;
	        if (this.c != null) {
	            v0_2 = this.c.length;
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final synthetic zr a(android.view.ViewGroup p6, int p7)
	    {
	        return new bgh(((bgk) this.b), android.view.LayoutInflater.from(this.b).inflate(a.gG, p6, 0));
	    }
	
	
	    public final synthetic void a(zr p9, int p10)
	    {
	        dbf v6 = this.c[p10];
	        if (v6.a == null) {
	            ((bgh) p9).l.setVisibility(8);
	        } else {
	            ((bgh) p9).l.setVisibility(0);
	            ((bgh) p9).l.a(com.google.android.apps.chromecast.app.SetupApplication.i().m, v6.a.a, 1, 0, ((bgh) p9).l.getHeight());
	        }
	        ((bgh) p9).m.setText(v6.b);
	        if (v6.g.length >= 15) {
	            ((bgh) p9).o.setVisibility(0);
	            ((bgh) p9).o.setOnClickListener(new bgj(((bgh) p9), v6));
	        } else {
	            ((bgh) p9).o.setVisibility(8);
	        }
	        int v1_6;
	        axx v2_2 = ((bgh) p9).a.getContext().getResources();
	        if (v6.f != 1) {
	            v1_6 = v2_2.getDimensionPixelSize(a.dQ);
	        } else {
	            v1_6 = v2_2.getDimensionPixelSize(a.dG);
	        }
	        int v3_1 = (v1_6 + v2_2.getDimensionPixelSize(a.dI));
	        android.support.v7.widget.RecyclerView v0_24 = ((android.widget.RelativeLayout$LayoutParams) ((bgh) p9).n.getLayoutParams());
	        v0_24.height = (v3_1 + v2_2.getDimensionPixelSize(a.dH));
	        ((bgh) p9).n.setLayoutParams(v0_24);
	        ((bgh) p9).n.a(new axx(((bgh) p9).n.getContext(), v6, v1_6, v3_1));
	        return;
	    }
	
	
	    public final void a(dbf[] p2)
	    {
	        this.c = p2;
	        this.a.a();
	        return;
	    }
	
