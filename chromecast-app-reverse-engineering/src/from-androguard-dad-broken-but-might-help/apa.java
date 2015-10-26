	private android.webkit.WebView a
	private android.view.View b
	private android.webkit.WebChromeClient$CustomViewCallback c
	
	    public apa()
	    {
	        return;
	    }
	
	
	    static synthetic android.view.View a(apa p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic android.view.View a(apa p0, android.view.View p1)
	    {
	        p0.b = p1;
	        return p1;
	    }
	
	
	    static synthetic android.webkit.WebChromeClient$CustomViewCallback a(apa p0, android.webkit.WebChromeClient$CustomViewCallback p1)
	    {
	        p0.c = p1;
	        return p1;
	    }
	
	
	    public static apa a(String p3)
	    {
	        apa v0_1 = new apa();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("url", p3);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic android.webkit.WebChromeClient$CustomViewCallback b(apa p1)
	    {
	        return p1.c;
	    }
	
	
	    static synthetic android.webkit.WebView c(apa p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic void d(apa p0)
	    {
	        p0.r();
	        return;
	    }
	
	
	    private void r()
	    {
	        ((android.view.ViewGroup) this.N).removeView(this.b);
	        this.b = 0;
	        this.c.onCustomViewHidden();
	        this.c = 0;
	        this.a.setVisibility(0);
	        ((apc) this.y).f();
	        return;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p6, android.view.ViewGroup p7, android.os.Bundle p8)
	    {
	        android.webkit.WebView v0_4;
	        this.a = new android.webkit.WebView(this.y);
	        this.a.setWebChromeClient(new apb(this));
	        if (p8 != null) {
	            v0_4 = p8.getString("url");
	        } else {
	            v0_4 = this.m.getString("url");
	        }
	        this.a.setWebViewClient(new android.webkit.WebViewClient());
	        java.util.HashMap v1_6 = new java.util.HashMap(1);
	        v1_6.put("Accept-language", blj.a());
	        this.a.getSettings().setJavaScriptEnabled(1);
	        this.a.loadUrl(v0_4, v1_6);
	        return this.a;
	    }
	
	
	    public final void a(android.os.Bundle p2)
	    {
	        super.a(p2);
	        this.d(1);
	        return;
	    }
	
	
	    public final boolean a(android.view.MenuItem p5)
	    {
	        boolean v0_1;
	        if (p5.getItemId() != f.bP) {
	            v0_1 = super.a(p5);
	        } else {
	            ((android.print.PrintManager) this.y.getSystemService("print")).print(this.a(b.M), this.a.createPrintDocumentAdapter(), 0);
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putString("url", this.a.getUrl());
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        if (android.os.Build$VERSION.SDK_INT >= 11) {
	            this.a.onResume();
	        }
	        return;
	    }
	
	
	    public final void k()
	    {
	        super.k();
	        if (android.os.Build$VERSION.SDK_INT >= 11) {
	            this.a.onPause();
	        }
	        return;
	    }
	
	
	    public final boolean p()
	    {
	        if ((this.b == null) && (!this.a.canGoBack())) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final void q()
	    {
	        if (this.b == null) {
	            this.a.goBack();
	        } else {
	            this.r();
	        }
	        return;
	    }
	
