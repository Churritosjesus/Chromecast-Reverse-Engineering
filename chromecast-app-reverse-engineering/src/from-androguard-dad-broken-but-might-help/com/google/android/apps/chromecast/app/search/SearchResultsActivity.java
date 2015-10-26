	private final blp e
	private android.support.v7.widget.SearchView f
	private android.widget.ViewFlipper g
	private  h
	private  i
	private  j
	
	    public SearchResultsActivity()
	    {
	        this.e = new blp("SearchResultsActivity");
	        return;
	    }
	
	
	    private void a(int p2)
	    {
	        this.h = p2;
	        this.g.setDisplayedChild(p2);
	        return;
	    }
	
	
	    public static synthetic void a(com.google.android.apps.chromecast.app.search.SearchResultsActivity p0, int p1)
	    {
	        p0.a(p1);
	        return;
	    }
	
	
	    public static synthetic void a(com.google.android.apps.chromecast.app.search.SearchResultsActivity p4, dbp p5)
	    {
	        if (!p4.j) {
	            android.os.Handler v1_0 = p4.b;
	            af v0_3 = ((bgb) v1_0.a("searchResultsFragment"));
	            if (v0_3 != null) {
	                v1_0.a("searchResultsFragment", 1);
	                v0_3.m.putByteArray("searchResponse", dbp.a(p5));
	                new android.os.Handler().post(new bgd(v0_3, p5));
	            } else {
	                v1_0.a().b(f.bk, bgb.a(p5), "searchResultsFragment").a().c();
	            }
	        }
	        return;
	    }
	
	
	    public static synthetic int b(com.google.android.apps.chromecast.app.search.SearchResultsActivity p0, int p1)
	    {
	        p0.i = p1;
	        return p1;
	    }
	
	
	    private void e()
	    {
	        this.a(1);
	        String v0_2 = this.getIntent().getStringExtra("query");
	        atf v1_1 = atf.a(this);
	        bfy v2_1 = new bfy(this);
	        v1_1.a(new bga(this, v0_2, new bfz(this, v0_2), v2_1), v2_1);
	        return;
	    }
	
	
	    public final void a(dbf p4)
	    {
	        af v0_2 = apg.a(135).c(this.i);
	        v0_2.f = p4.b;
	        v0_2.b();
	        this.b.a().a(f.bk, bge.a(p4)).a(4097).a("searchResultsFragment").b();
	        return;
	    }
	
	
	    public final void a(String p5, String p6, dbb p7)
	    {
	        af v0_1 = apg.a(133);
	        v0_1.c = p5;
	        v0_1.b = p6;
	        v0_1.c(this.i).b();
	        this.b.a().a(f.bk, awr.a(p5, p7, 1), "detailsFragment").a(4097).a("searchResultsFragment").b();
	        return;
	    }
	
	
	    public final void i()
	    {
	        this.findViewById(f.eo).setVisibility(0);
	        return;
	    }
	
	
	    public final void j()
	    {
	        this.findViewById(f.eo).setVisibility(8);
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p4)
	    {
	        super.onCreate(p4);
	        this.j = 0;
	        if (com.google.android.apps.chromecast.app.SetupApplication.a().b) {
	            this.setContentView(a.gE);
	            this.g = ((android.widget.ViewFlipper) this.findViewById(f.dt));
	            blx.g(this);
	            int v0_9 = ((android.widget.ImageView) this.findViewById(f.aX));
	            v0_9.setImageResource(a.eC);
	            v0_9.setOnClickListener(new bfx(this));
	            this.f = ((android.support.v7.widget.SearchView) this.findViewById(f.f));
	            blx.a(this, this.f, this.findViewById(f.du), 0);
	            if (p4 != null) {
	                this.a(p4.getInt("viewFlipperIndex"));
	                if (p4.getInt("viewFlipperIndex") == 1) {
	                    this.e();
	                }
	            } else {
	                this.e();
	            }
	        } else {
	            int v0_19 = new android.content.Intent(this, com.google.android.apps.chromecast.app.DiscoveryActivity);
	            v0_19.addFlags(32768);
	            this.startActivity(v0_19);
	        }
	        return;
	    }
	
	
	    public void onDestroy()
	    {
	        super.onDestroy();
	        this.j = 1;
	        return;
	    }
	
	
	    public void onNewIntent(android.content.Intent p1)
	    {
	        super.onNewIntent(p1);
	        this.setIntent(p1);
	        this.e();
	        return;
	    }
	
	
	    public void onResume()
	    {
	        super.onResume();
	        if (!this.isFinishing()) {
	            this.f.a(this.getIntent().getStringExtra("query"), 0);
	            android.view.View v0_4 = this.findViewById(a.br);
	            if (v0_4 != null) {
	                v0_4.clearFocus();
	            }
	        }
	        return;
	    }
	
	
	    public void onSaveInstanceState(android.os.Bundle p3)
	    {
	        super.onSaveInstanceState(p3);
	        p3.putInt("viewFlipperIndex", this.h);
	        return;
	    }
	
