	private java.lang.String a
	private final blp b
	
	    public ReusableImageView(android.content.Context p3)
	    {
	        this(p3, 0, 0);
	        return;
	    }
	
	
	    public ReusableImageView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public ReusableImageView(android.content.Context p3, android.util.AttributeSet p4, int p5)
	    {
	        this(p3, p4, p5);
	        this.b = new blp("ReusableImageView");
	        return;
	    }
	
	
	    public static synthetic String a(com.google.android.apps.chromecast.app.widget.ReusableImageView p1)
	    {
	        return p1.a;
	    }
	
	
	    public final void a(aer p4, String p5, boolean p6, int p7, int p8)
	    {
	        if (!android.text.TextUtils.isEmpty(p5)) {
	            String v0_1 = this.getLayoutParams();
	            if ((p8 != 0) && (p7 != 0)) {
	                v0_1.height = p8;
	                v0_1.width = p7;
	            }
	            this.setLayoutParams(v0_1);
	            this.a = bks.a((p7 / 2), (p8 / 2), p5);
	            this.setImageBitmap(0);
	            String v0_6 = new Object[1];
	            v0_6[0] = this.a;
	            if (p4 != null) {
	                p4.a(this.a, new bms(this, p6));
	            }
	        }
	        return;
	    }
	
