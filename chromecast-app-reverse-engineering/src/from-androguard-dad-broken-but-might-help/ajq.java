	 java.lang.String a
	 ajx b
	 android.webkit.WebView c
	  d
	  e
	private java.lang.String f
	private android.app.ProgressDialog g
	private android.widget.ImageView h
	private android.widget.FrameLayout i
	private  j
	
	    public ajq(android.content.Context p2, String p3)
	    {
	        this(p2, p3, 16973840);
	        return;
	    }
	
	
	    private ajq(android.content.Context p3, String p4, int p5)
	    {
	        this(p3, 16973840);
	        this.a = "fbconnect://success";
	        this.d = 0;
	        this.j = 0;
	        this.e = 0;
	        this.f = p4;
	        return;
	    }
	
	
	    public ajq(android.content.Context p7, String p8, android.os.Bundle p9, int p10, ajx p11)
	    {
	        if (p10 == 0) {
	            p10 = 16973840;
	        }
	        this(p7, p10);
	        this.a = "fbconnect://success";
	        this.d = 0;
	        this.j = 0;
	        this.e = 0;
	        if (p9 == null) {
	            p9 = new android.os.Bundle();
	        }
	        p9.putString("redirect_uri", "fbconnect://success");
	        p9.putString("display", "touch");
	        String v0_3 = ajh.a();
	        String v1_3 = ajh.d();
	        String v2_1 = String.valueOf("dialog/");
	        this.f = aji.a(v0_3, new StringBuilder((((String.valueOf(v1_3).length() + 1) + String.valueOf(v2_1).length()) + String.valueOf(p8).length())).append(v1_3).append("/").append(v2_1).append(p8).toString(), p9).toString();
	        this.b = p11;
	        return;
	    }
	
	
	    private static int a(int p6, float p7, int p8, int p9)
	    {
	        double v0_0 = 0.5;
	        double v2_2 = ((int) (((float) p6) / p7));
	        if (v2_2 > p8) {
	            if (v2_2 < p9) {
	                v0_0 = (0.5 + ((((double) (p9 - v2_2)) / ((double) (p9 - p8))) * 0.5));
	            }
	        } else {
	            v0_0 = 1.0;
	        }
	        return ((int) (v0_0 * ((double) p6)));
	    }
	
	
	    static synthetic String a(ajq p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic boolean a(ajq p1, boolean p2)
	    {
	        p1.e = 1;
	        return 1;
	    }
	
	
	    static synthetic boolean b(ajq p1)
	    {
	        return p1.j;
	    }
	
	
	    static synthetic android.app.ProgressDialog c(ajq p1)
	    {
	        return p1.g;
	    }
	
	
	    static synthetic android.widget.FrameLayout d(ajq p1)
	    {
	        return p1.i;
	    }
	
	
	    static synthetic android.webkit.WebView e(ajq p1)
	    {
	        return p1.c;
	    }
	
	
	    static synthetic android.widget.ImageView f(ajq p1)
	    {
	        return p1.h;
	    }
	
	
	    protected android.os.Bundle a(String p3)
	    {
	        android.os.Bundle v0_0 = android.net.Uri.parse(p3);
	        android.os.Bundle v1_1 = aji.b(v0_0.getQuery());
	        v1_1.putAll(aji.b(v0_0.getFragment()));
	        return v1_1;
	    }
	
	
	    public final void a()
	    {
	        int v0_5;
	        int v0_3 = ((android.view.WindowManager) this.getContext().getSystemService("window")).getDefaultDisplay();
	        android.view.Window v2_1 = new android.util.DisplayMetrics();
	        v0_3.getMetrics(v2_1);
	        if (v2_1.widthPixels >= v2_1.heightPixels) {
	            v0_5 = v2_1.heightPixels;
	        } else {
	            v0_5 = v2_1.widthPixels;
	        }
	        int v1_3;
	        if (v2_1.widthPixels >= v2_1.heightPixels) {
	            v1_3 = v2_1.widthPixels;
	        } else {
	            v1_3 = v2_1.heightPixels;
	        }
	        this.getWindow().setLayout(Math.min(ajq.a(v0_5, v2_1.density, 480, 800), v2_1.widthPixels), Math.min(ajq.a(v1_3, v2_1.density, 800, 1280), v2_1.heightPixels));
	        return;
	    }
	
	
	    protected final void a(Throwable p3)
	    {
	        if ((this.b != null) && (!this.d)) {
	            this.d = 1;
	            this.b.a(0, ((afq) p3));
	            this.dismiss();
	        }
	        return;
	    }
	
	
	    public void cancel()
	    {
	        if ((this.b != null) && (!this.d)) {
	            this.a(new afr());
	        }
	        return;
	    }
	
	
	    public void dismiss()
	    {
	        if (this.c != null) {
	            this.c.stopLoading();
	        }
	        if ((!this.j) && ((this.g != null) && (this.g.isShowing()))) {
	            this.g.dismiss();
	        }
	        super.dismiss();
	        return;
	    }
	
	
	    public void onAttachedToWindow()
	    {
	        this.j = 0;
	        super.onAttachedToWindow();
	        return;
	    }
	
	
	    protected void onCreate(android.os.Bundle p10)
	    {
	        super.onCreate(p10);
	        this.g = new android.app.ProgressDialog(this.getContext());
	        this.g.requestWindowFeature(1);
	        this.g.setMessage(this.getContext().getString(a.dc));
	        this.g.setOnCancelListener(new ajr(this));
	        this.requestWindowFeature(1);
	        this.i = new android.widget.FrameLayout(this.getContext());
	        this.a();
	        this.getWindow().setGravity(17);
	        this.getWindow().setSoftInputMode(16);
	        this.h = new android.widget.ImageView(this.getContext());
	        this.h.setOnClickListener(new ajs(this));
	        this.h.setImageDrawable(this.getContext().getResources().getDrawable(a.cV));
	        this.h.setVisibility(4);
	        android.widget.FrameLayout v0_20 = ((this.h.getDrawable().getIntrinsicWidth() / 2) + 1);
	        android.widget.ImageView v1_14 = new android.widget.LinearLayout(this.getContext());
	        this.c = new ajt(this, this.getContext().getApplicationContext());
	        this.c.setVerticalScrollBarEnabled(0);
	        this.c.setHorizontalScrollBarEnabled(0);
	        this.c.setWebViewClient(new ajw(this));
	        this.c.getSettings().setJavaScriptEnabled(1);
	        this.c.loadUrl(this.f);
	        this.c.setLayoutParams(new android.widget.FrameLayout$LayoutParams(-1, -1));
	        this.c.setVisibility(4);
	        this.c.getSettings().setSavePassword(0);
	        this.c.getSettings().setSaveFormData(0);
	        this.c.setFocusable(1);
	        this.c.setFocusableInTouchMode(1);
	        this.c.setOnTouchListener(new aju(this));
	        v1_14.setPadding(v0_20, v0_20, v0_20, v0_20);
	        v1_14.addView(this.c);
	        v1_14.setBackgroundColor(-872415232);
	        this.i.addView(v1_14);
	        this.i.addView(this.h, new android.view.ViewGroup$LayoutParams(-2, -2));
	        this.setContentView(this.i);
	        return;
	    }
	
	
	    public void onDetachedFromWindow()
	    {
	        this.j = 1;
	        super.onDetachedFromWindow();
	        return;
	    }
	
	
	    public boolean onKeyDown(int p2, android.view.KeyEvent p3)
	    {
	        if (p2 == 4) {
	            this.cancel();
	        }
	        return super.onKeyDown(p2, p3);
	    }
	
	
	    protected void onStart()
	    {
	        super.onStart();
	        this.a();
	        return;
	    }
	
