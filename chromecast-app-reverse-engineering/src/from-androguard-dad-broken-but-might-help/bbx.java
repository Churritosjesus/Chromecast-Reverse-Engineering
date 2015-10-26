	private java.lang.String Z
	private final blp a
	private java.lang.String aa
	private java.lang.String ab
	private android.webkit.WebView ac
	private bca ad
	private r b
	private java.lang.String c
	private java.lang.String d
	
	    public bbx()
	    {
	        this.a = new blp("OAuthFragment", 0);
	        return;
	    }
	
	
	    public static bbx a(String p3, String p4, String p5, String p6)
	    {
	        bbx v0_1 = new bbx();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("appDeviceId", p3);
	        v1_1.putString("oauthUrl", p4);
	        v1_1.putString("webviewInterceptKeyword", p6);
	        v1_1.putString("backdropDisplayId", p5);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic bca a(bbx p1)
	    {
	        return p1.ad;
	    }
	
	
	    static synthetic void a(bbx p8, String p9)
	    {
	        atf.a(p8.y).a(new bbw(p8.d, p8.c, p8.Z, p9, p8.ab, new bby(p8), new bbz(p8)));
	        return;
	    }
	
	
	    static synthetic r b(bbx p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic blp c(bbx p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic String d(bbx p1)
	    {
	        return p1.aa;
	    }
	
	
	    static synthetic android.webkit.WebView e(bbx p1)
	    {
	        return p1.ac;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p5, android.view.ViewGroup p6, android.os.Bundle p7)
	    {
	        android.view.View v1_1 = p5.inflate(a.go, 0, 0);
	        this.ac = ((android.webkit.WebView) v1_1.findViewById(f.cu));
	        this.ac.getSettings().setJavaScriptEnabled(1);
	        this.ac.setWebViewClient(new bcb(this));
	        if (p7 == null) {
	            this.ac.loadUrl(this.Z);
	        } else {
	            this.ac.restoreState(p7);
	        }
	        this.ac.setVisibility(0);
	        return v1_1;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.ad = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p4)
	    {
	        super.a(p4);
	        this.ad = ((bca) p4);
	        android.webkit.CookieManager v0 = android.webkit.CookieManager.getInstance();
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            v0.removeAllCookie();
	        } else {
	            v0.removeAllCookies(0);
	        }
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p3)
	    {
	        super.a(p3);
	        this.d = blf.z(this.y);
	        this.b = this.x;
	        this.Z = this.m.getString("oauthUrl");
	        this.aa = this.m.getString("webviewInterceptKeyword");
	        this.c = this.m.getString("appDeviceId");
	        this.ab = this.m.getString("backdropDisplayId");
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p2)
	    {
	        super.e(p2);
	        if (this.ac != null) {
	            this.ac.saveState(p2);
	        }
	        return;
	    }
	
