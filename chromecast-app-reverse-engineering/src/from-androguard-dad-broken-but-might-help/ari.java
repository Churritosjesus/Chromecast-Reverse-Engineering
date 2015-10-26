	 Ldce b
	  c
	private final android.content.Context d
	
	    public ari(android.content.Context p1)
	    {
	        this.d = p1;
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v0_2;
	        if (this.b != null) {
	            v0_2 = this.b.length;
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final synthetic zr a(android.view.ViewGroup p5, int p6)
	    {
	        return new arj(this, android.view.LayoutInflater.from(this.d).inflate(a.gA, p5, 0));
	    }
	
	
	    public final synthetic void a(zr p5, int p6)
	    {
	        com.google.android.apps.chromecast.app.SetupApplication.i().a(bks.a(0, this.c, this.b[p6].a), ((arj) p5).k, 1);
	        return;
	    }
	
