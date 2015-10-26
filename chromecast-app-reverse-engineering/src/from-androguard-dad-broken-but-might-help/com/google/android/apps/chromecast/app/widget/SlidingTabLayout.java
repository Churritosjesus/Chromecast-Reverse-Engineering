	public  a
	public  b
	public android.support.v4.view.ViewPager c
	public hx d
	public bog e
	public final boh f
	private  g
	
	    public SlidingTabLayout(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public SlidingTabLayout(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public SlidingTabLayout(android.content.Context p4, android.util.AttributeSet p5, int p6)
	    {
	        this(p4, p5, p6);
	        this.setHorizontalScrollBarEnabled(0);
	        this.setFillViewport(1);
	        this.g = ((int) (1103101952 * this.getResources().getDisplayMetrics().density));
	        this.f = new boh(p4);
	        this.addView(this.f, -1, -2);
	        return;
	    }
	
	
	    public static synthetic boh a(com.google.android.apps.chromecast.app.widget.SlidingTabLayout p1)
	    {
	        return p1.f;
	    }
	
	
	    private void a(int p4, int p5)
	    {
	        int v0_1 = this.f.getChildCount();
	        if ((v0_1 != 0) && ((p4 >= 0) && (p4 < v0_1))) {
	            int v0_3 = this.f.getChildAt(p4);
	            if (v0_3 != 0) {
	                v0_3.setSelected(1);
	                int v0_5 = (v0_3.getLeft() + p5);
	                if ((p4 > 0) || (p5 > 0)) {
	                    v0_5 -= this.g;
	                }
	                this.scrollTo(v0_5, 0);
	            }
	            int v0_6 = 0;
	            while (v0_6 < this.f.getChildCount()) {
	                if (v0_6 != p4) {
	                    android.view.View v2_5 = this.f.getChildAt(v0_6);
	                    if (v2_5 != null) {
	                        v2_5.setSelected(0);
	                    }
	                }
	                v0_6++;
	            }
	        }
	        return;
	    }
	
	
	    public static synthetic void a(com.google.android.apps.chromecast.app.widget.SlidingTabLayout p0, int p1, int p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    public static synthetic hx b(com.google.android.apps.chromecast.app.widget.SlidingTabLayout p1)
	    {
	        return p1.d;
	    }
	
	
	    public static synthetic android.support.v4.view.ViewPager c(com.google.android.apps.chromecast.app.widget.SlidingTabLayout p1)
	    {
	        return p1.c;
	    }
	
	
	    public static synthetic bog d(com.google.android.apps.chromecast.app.widget.SlidingTabLayout p1)
	    {
	        return p1.e;
	    }
	
	
	    public void a()
	    {
	        gn v5 = this.c.a;
	        boe v6_1 = new boe(this);
	        int v2 = 0;
	        while (v2 < v5.a()) {
	            int v0_3;
	            android.widget.TextView v1_0;
	            if (this.a == 0) {
	                v0_3 = 0;
	                v1_0 = 0;
	            } else {
	                v1_0 = android.view.LayoutInflater.from(this.getContext()).inflate(this.a, this.f, 0);
	                v0_3 = ((android.widget.TextView) v1_0.findViewById(this.b));
	            }
	            if (v1_0 == null) {
	                v1_0 = new android.widget.TextView(this.getContext());
	                v1_0.setGravity(17);
	                v1_0.setTextSize(2, 1094713344);
	                v1_0.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
	                if (android.os.Build$VERSION.SDK_INT >= 11) {
	                    CharSequence v7_7 = new android.util.TypedValue();
	                    this.getContext().getTheme().resolveAttribute(16843534, v7_7, 1);
	                    v1_0.setBackgroundResource(v7_7.resourceId);
	                }
	                if (android.os.Build$VERSION.SDK_INT >= 14) {
	                    v1_0.setAllCaps(1);
	                }
	                v1_0.setPadding(((int) (1098907648 * this.getResources().getDisplayMetrics().density)), ((int) (1098907648 * this.getResources().getDisplayMetrics().density)), ((int) (1098907648 * this.getResources().getDisplayMetrics().density)), ((int) (1098907648 * this.getResources().getDisplayMetrics().density)));
	            }
	            if ((v0_3 == 0) && (android.widget.TextView.isInstance(v1_0))) {
	                v0_3 = ((android.widget.TextView) v1_0);
	            }
	            if (v0_3 != 0) {
	                v0_3.setText(v5.b(v2));
	            }
	            v1_0.setOnClickListener(v6_1);
	            this.f.addView(v1_0);
	            v2++;
	        }
	        return;
	    }
	
	
	    protected void onAttachedToWindow()
	    {
	        super.onAttachedToWindow();
	        if (this.c != null) {
	            this.a(this.c.b, 0);
	        }
	        return;
	    }
	
