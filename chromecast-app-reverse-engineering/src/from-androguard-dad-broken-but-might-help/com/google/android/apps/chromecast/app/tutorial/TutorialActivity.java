	public bkb e
	public android.support.v4.view.ViewPager f
	public android.widget.Button g
	public android.widget.Button h
	private final blp i
	private com.google.android.libraries.view.pagingindicator.PagingIndicator j
	private android.widget.ImageButton k
	private  l
	private android.animation.Animator m
	private  n
	private  o
	private aph p
	
	    public TutorialActivity()
	    {
	        this.i = new blp("TutorialActivity");
	        return;
	    }
	
	
	    public static synthetic android.animation.Animator a(com.google.android.apps.chromecast.app.tutorial.TutorialActivity p1)
	    {
	        return p1.m;
	    }
	
	
	    public static synthetic android.animation.Animator a(com.google.android.apps.chromecast.app.tutorial.TutorialActivity p1, android.animation.Animator p2)
	    {
	        p1.m = 0;
	        return 0;
	    }
	
	
	    public static android.content.Intent a(android.content.Context p3, dan p4)
	    {
	        android.content.Intent v0_1 = new android.content.Intent(p3, com.google.android.apps.chromecast.app.tutorial.TutorialActivity);
	        v0_1.putExtra("tutorials", dan.a(p4));
	        return v0_1;
	    }
	
	
	    private void a(android.view.View p5, boolean p6)
	    {
	        android.view.ViewPropertyAnimator v0_0 = 0;
	        if (p6) {
	            p5.setVisibility(0);
	            p5.setAlpha(0);
	        }
	        int v1_1 = p5.animate();
	        if (p6) {
	            v0_0 = 1065353216;
	        }
	        v1_1.alpha(v0_0).setDuration(((long) this.l));
	        return;
	    }
	
	
	    private void d(int p5)
	    {
	        ape v0 = ape.a();
	        apd v1_3 = new apd(p5).a(this.o).a(((long) this.f.b));
	        v1_3.h = this.p;
	        v0.a(v1_3);
	        return;
	    }
	
	
	    public void a(int p2)
	    {
	        if (p2 != (this.e.b.length - 1)) {
	            if ((this.g.getVisibility() == 0) && (p2 == (this.e.b.length - 2))) {
	                this.b(0);
	            }
	        } else {
	            this.b(1);
	        }
	        return;
	    }
	
	
	    public final void a(int p1, float p2, int p3)
	    {
	        return;
	    }
	
	
	    protected void b()
	    {
	        this.c(152);
	        this.finish();
	        return;
	    }
	
	
	    public final void b(int p1)
	    {
	        return;
	    }
	
	
	    protected final void b(boolean p8)
	    {
	        int v3 = 1;
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            android.widget.Button v0_2;
	            this.a(this.g, p8);
	            if (p8) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	            this.a(this.k, v0_2);
	        } else {
	            if (this.m != null) {
	                this.m.cancel();
	            }
	            android.widget.Button v0_12;
	            bjw v1_2;
	            int v4 = (this.g.getWidth() / 2);
	            int v5 = (this.g.getHeight() / 2);
	            if (!p8) {
	                v1_2 = this.g.getWidth();
	                v0_12 = (this.k.getWidth() / 2);
	                this.k.setVisibility(0);
	            } else {
	                v0_12 = this.g.getWidth();
	                this.g.setVisibility(0);
	                this.k.setVisibility(4);
	                v1_2 = 0;
	            }
	            android.widget.Button v0_15 = android.view.ViewAnimationUtils.createCircularReveal(this.g, v4, v5, ((float) v1_2), ((float) v0_12));
	            this.m = v0_15;
	            v0_15.addListener(new bjw(this, p8));
	            v0_15.start();
	        }
	        if (this.h != null) {
	            if (p8) {
	                v3 = 0;
	            }
	            this.a(this.h, v3);
	        }
	        return;
	    }
	
	
	    protected final void c(int p4)
	    {
	        ape v0 = ape.a();
	        apd v1_2 = new apd(p4).a(this.o);
	        v1_2.h = this.p;
	        v0.a(v1_2);
	        return;
	    }
	
	
	    public void onBackPressed()
	    {
	        if (this.f.b == 0) {
	            super.onBackPressed();
	        } else {
	            this.d(150);
	            this.f.a((this.f.b - 1), 1);
	        }
	        return;
	    }
	
	
	    public void onClick(android.view.View p5)
	    {
	        android.support.v4.view.ViewPager v0_0 = p5.getId();
	        if (v0_0 != f.cj) {
	            if (v0_0 != f.dQ) {
	                if (v0_0 == f.aR) {
	                    this.b();
	                }
	            } else {
	                this.d(151);
	                this.f.a((this.e.b.length - 1), 1);
	            }
	        } else {
	            this.d(149);
	            this.f.a(((this.f.b + 1) % this.e.b.length), 1);
	        }
	        return;
	    }
	
	
	    protected void onCreate(android.os.Bundle p8)
	    {
	        super.onCreate(p8);
	        this.p = ((aph) this.getIntent().getParcelableExtra("deviceSetupSession"));
	        try {
	            czt v3_1 = ((dan) dew.a(new dan(), this.getIntent().getByteArrayExtra("tutorials")));
	        } catch (android.view.Window v0_7) {
	            android.support.v4.view.ViewPager v4_3 = new Object[1];
	            v4_3[0] = v0_7;
	        }
	        if (v3_1 != null) {
	            android.view.Window v0_9;
	            if (v3_1.a == null) {
	                v0_9 = -1;
	            } else {
	                v0_9 = ((int) v3_1.a.longValue());
	            }
	            this.o = v0_9;
	            if (p8 == null) {
	                this.c(148);
	            }
	            blx.h(this);
	            this.setContentView(a.gS);
	            this.k = ((android.widget.ImageButton) this.findViewById(f.cj));
	            this.k.setOnClickListener(this);
	            this.h = ((android.widget.Button) this.findViewById(f.dQ));
	            this.h.setOnClickListener(this);
	            this.g = ((android.widget.Button) this.findViewById(f.aR));
	            this.g.setOnClickListener(this);
	            this.g.setText(v3_1.h);
	            this.l = this.getResources().getInteger(17694721);
	            this.e = new bkb(this.b, v3_1.g);
	            this.f = ((android.support.v4.view.ViewPager) this.findViewById(f.cM));
	            this.f.a(this.e);
	            android.support.v4.view.ViewPager v4_9 = this.f;
	            android.view.Window v0_36 = (v3_1.g.length / 2);
	            if (v0_36 <= null) {
	                android.util.Log.w("ViewPager", new StringBuilder("Requested offscreen page limit ").append(v0_36).append(" too small; defaulting to 1").toString());
	                v0_36 = 1;
	            }
	            if (v0_36 != v4_9.c) {
	                v4_9.c = v0_36;
	                v4_9.b();
	            }
	            this.j = ((com.google.android.libraries.view.pagingindicator.PagingIndicator) this.findViewById(f.cK));
	            android.view.Window v0_43 = this.j;
	            gn v2_2 = this.f;
	            v0_43.a = v2_2;
	            v2_2.d = v0_43;
	            v0_43.c(v2_2.a.a());
	            v2_2.a.a(new czt(v0_43));
	            v0_43.a();
	            this.j.b = this;
	            this.n = this.getRequestedOrientation();
	            android.view.Window v0_46 = blx.c(this);
	            if (v0_46 != -1) {
	                this.setRequestedOrientation(v0_46);
	            }
	            this.getWindow().addFlags(128);
	        } else {
	            this.setResult(-1);
	            this.finish();
	        }
	        return;
	    }
	
	
	    protected void onDestroy()
	    {
	        super.onDestroy();
	        this.setRequestedOrientation(this.n);
	        this.getWindow().clearFlags(128);
	        return;
	    }
	
