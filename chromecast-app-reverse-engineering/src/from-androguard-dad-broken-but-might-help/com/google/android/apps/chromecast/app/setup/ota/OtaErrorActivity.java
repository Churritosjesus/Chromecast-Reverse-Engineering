	private blp e
	private  f
	private aph g
	
	    public OtaErrorActivity()
	    {
	        this.e = new blp("OtaErrorActivity");
	        return;
	    }
	
	
	    public static android.content.Intent a(android.content.Context p2, boolean p3, aph p4)
	    {
	        android.content.Intent v0_1 = new android.content.Intent(p2, com.google.android.apps.chromecast.app.setup.ota.OtaErrorActivity);
	        v0_1.putExtra("supportsDisplay", p3);
	        v0_1.putExtra("deviceSetupSession", p4);
	        return v0_1;
	    }
	
	
	    private void b(int p4)
	    {
	        ape v0 = ape.a();
	        apd v1_2 = new apd(153).a(p4);
	        v1_2.h = this.g;
	        v0.a(v1_2);
	        return;
	    }
	
	
	    public final void a(int p6)
	    {
	        int v1_3;
	        int v2_2;
	        int v0_0 = 0;
	        if (p6 != f.L) {
	            if (p6 != f.M) {
	                if (p6 != f.N) {
	                    if (p6 != f.O) {
	                        this.m();
	                    } else {
	                        this.b(5);
	                        this.m();
	                    }
	                } else {
	                    if (!this.f) {
	                        v2_2 = b.cx;
	                        v1_3 = b.cw;
	                        this.b(4);
	                        this.b.a().a(f.ai, bjs.a(v2_2, v1_3, v0_0)).a(0).b();
	                    } else {
	                        this.m();
	                    }
	                }
	            } else {
	                if (!this.f) {
	                    v2_2 = b.cq;
	                    this.b(3);
	                    v1_3 = b.cp;
	                    v0_0 = 1;
	                } else {
	                    this.b(1);
	                    v1_3 = b.cu;
	                    v2_2 = b.cv;
	                }
	            }
	        } else {
	            if (!this.f) {
	                v2_2 = b.co;
	                v1_3 = b.cn;
	                this.b(2);
	            } else {
	                v2_2 = b.cz;
	                v1_3 = b.cy;
	                this.b(0);
	            }
	        }
	        return;
	    }
	
	
	    public final void l()
	    {
	        this.b(7);
	        this.finish();
	        return;
	    }
	
	
	    public final void m()
	    {
	        android.content.Intent v0_2;
	        this.b(6);
	        if (!this.f) {
	            v0_2 = blf.q(this);
	        } else {
	            v0_2 = blf.p(this);
	        }
	        this.startActivity(com.google.android.apps.chromecast.app.HelpActivity.a(this, v0_2));
	        return;
	    }
	
	
	    protected void onCreate(android.os.Bundle p4)
	    {
	        super.onCreate(p4);
	        this.g = ((aph) this.getIntent().getParcelableExtra("deviceSetupSession"));
	        blx.g(this);
	        this.setContentView(a.gs);
	        this.f = this.getIntent().getBooleanExtra("supportsDisplay", 1);
	        if (this.b.a(f.ai) == null) {
	            this.b.a().a(f.ai, bju.a(this.f)).b();
	        }
	        return;
	    }
	
