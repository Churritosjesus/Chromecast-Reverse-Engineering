	private final  i
	private final  j
	private final blp k
	private java.lang.String l
	private  m
	private  n
	private android.os.Handler o
	private  p
	private final java.lang.Runnable q
	private ayq r
	private final java.lang.Runnable s
	
	    public TutorialOtaActivity()
	    {
	        this.q = new bjx(this);
	        this.s = new bjy(this);
	        this.k = new blp("TutorialOtaActivity");
	        long v0_6 = com.google.android.apps.chromecast.app.SetupApplication.a();
	        this.i = blf.l(v0_6);
	        this.j = blf.m(v0_6);
	        return;
	    }
	
	
	    public static android.content.Intent a(android.content.Context p2, dan p3, bdf p4, boolean p5, aph p6)
	    {
	        android.content.Intent v0 = com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity.a(p2, p3);
	        v0.setClass(p2, com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity);
	        v0.putExtra("deviceConfig", p4);
	        v0.putExtra("scanForDevice", p5);
	        v0.putExtra("deviceSetupSession", p6);
	        return v0;
	    }
	
	
	    public static synthetic Runnable a(com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity p1)
	    {
	        return p1.q;
	    }
	
	
	    public static synthetic void a(com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity p4, boolean p5)
	    {
	        p4.b(1);
	        p4.m = 0;
	        if (p5) {
	            android.content.Intent v0_1 = new android.content.Intent();
	            v0_1.putExtra("hadError", 1);
	            p4.setResult(0, v0_1);
	            p4.finish();
	        } else {
	            ((android.widget.TextView) p4.findViewById(f.cH)).setText(b.az);
	            p4.findViewById(f.cI).setVisibility(8);
	            p4.findViewById(f.cG).setVisibility(0);
	        }
	        return;
	    }
	
	
	    public static synthetic long b(com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity p2)
	    {
	        return p2.i;
	    }
	
	
	    public static synthetic android.os.Handler c(com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity p1)
	    {
	        return p1.o;
	    }
	
	
	    private void c()
	    {
	        if (this.p) {
	            this.p = 0;
	            this.o.removeCallbacks(this.q);
	        }
	        return;
	    }
	
	
	    public static synthetic boolean d(com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity p1)
	    {
	        return p1.m;
	    }
	
	
	    public static synthetic ayq e(com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity p1)
	    {
	        return p1.r;
	    }
	
	
	    public static synthetic void f(com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity p0)
	    {
	        p0.c();
	        return;
	    }
	
	
	    public static synthetic String g(com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity p1)
	    {
	        return p1.l;
	    }
	
	
	    public static synthetic Runnable h(com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity p1)
	    {
	        return p1.s;
	    }
	
	
	    public final void a(int p2)
	    {
	        if (!this.n) {
	            super.a(p2);
	        }
	        return;
	    }
	
	
	    protected final void b()
	    {
	        this.c(152);
	        this.setResult(-1);
	        this.finish();
	        return;
	    }
	
	
	    public void onBackPressed()
	    {
	        if (this.m) {
	            super.onBackPressed();
	            this.c();
	        } else {
	            this.b();
	        }
	        return;
	    }
	
	
	    public void onClick(android.view.View p1)
	    {
	        this.c();
	        super.onClick(p1);
	        return;
	    }
	
	
	    protected void onCreate(android.os.Bundle p5)
	    {
	        super.onCreate(p5);
	        if (!this.isFinishing()) {
	            this.o = new android.os.Handler();
	            this.r = new ayq(this.getApplicationContext());
	            this.l = ((bdf) this.getIntent().getParcelableExtra("deviceConfig")).n;
	            this.n = this.getIntent().getBooleanExtra("scanForDevice", 1);
	            if (p5 == null) {
	                if (!this.n) {
	                    this.m = 0;
	                    this.p = 0;
	                } else {
	                    this.m = 1;
	                    this.p = 1;
	                }
	            } else {
	                this.m = p5.getBoolean("applyingUpdate");
	                this.p = p5.getBoolean("shouldAutoScroll");
	            }
	            this.h.setVisibility(8);
	            this.h = 0;
	            this.findViewById(f.cF).setVisibility(0);
	            if (this.p) {
	                this.f.setOnTouchListener(new bjz(this));
	            }
	        }
	        return;
	    }
	
	
	    protected void onPause()
	    {
	        super.onPause();
	        if (this.p) {
	            this.o.removeCallbacks(this.q);
	        }
	        return;
	    }
	
	
	    protected void onResume()
	    {
	        super.onResume();
	        if (this.p) {
	            this.o.postDelayed(this.q, this.i);
	        }
	        return;
	    }
	
	
	    protected void onSaveInstanceState(android.os.Bundle p3)
	    {
	        super.onSaveInstanceState(p3);
	        p3.putBoolean("applyingUpdate", this.m);
	        p3.putBoolean("shouldAutoScroll", this.p);
	        return;
	    }
	
	
	    protected void onStart()
	    {
	        super.onStart();
	        if (this.m) {
	            this.o.postDelayed(this.s, this.j);
	            this.r.a(new ayy(new bka(this)));
	            this.r.b();
	        }
	        return;
	    }
	
	
	    protected void onStop()
	    {
	        super.onStop();
	        this.r.c();
	        this.r.a();
	        this.o.removeCallbacks(this.s);
	        return;
	    }
	
