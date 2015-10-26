	public final android.animation.ValueAnimator a
	public android.graphics.Bitmap b
	public android.graphics.Bitmap c
	public android.graphics.Bitmap d
	public android.graphics.Bitmap e
	public java.lang.String f
	public java.lang.String g
	public java.lang.String h
	public java.lang.String i
	public  j
	public  k
	private final android.graphics.Paint l
	private  m
	
	    public OverlaidImageView(android.content.Context p3)
	    {
	        this(p3, 0, 0);
	        return;
	    }
	
	
	    public OverlaidImageView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public OverlaidImageView(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6, p7);
	        this.l = new android.graphics.Paint();
	        this.m = 0;
	        this.j = 0;
	        this.k = 0;
	        this.setWillNotDraw(0);
	        if (android.os.Build$VERSION.SDK_INT >= 11) {
	            android.animation.ValueAnimator v0_4 = new int[2];
	            v0_4 = {0, 255};
	            this.a = android.animation.ValueAnimator.ofInt(v0_4);
	            this.a.addUpdateListener(new bml(this));
	            this.a.setDuration(600);
	            this.a.addListener(new bmm(this));
	        } else {
	            this.a = 0;
	        }
	        return;
	    }
	
	
	    public static synthetic int a(com.google.android.apps.chromecast.app.widget.OverlaidImageView p0, int p1)
	    {
	        p0.m = p1;
	        return p1;
	    }
	
	
	    public static synthetic android.graphics.Bitmap a(com.google.android.apps.chromecast.app.widget.OverlaidImageView p1)
	    {
	        return p1.d;
	    }
	
	
	    public static synthetic android.graphics.Bitmap a(com.google.android.apps.chromecast.app.widget.OverlaidImageView p0, android.graphics.Bitmap p1)
	    {
	        p0.b = p1;
	        return p1;
	    }
	
	
	    public static synthetic String a(com.google.android.apps.chromecast.app.widget.OverlaidImageView p0, String p1)
	    {
	        p0.h = p1;
	        return p1;
	    }
	
	
	    private void a(android.graphics.Canvas p7, android.graphics.Bitmap p8, int p9, boolean p10)
	    {
	        if (p8 != null) {
	            android.graphics.Rect v0_6;
	            this.l.setAlpha(p9);
	            android.graphics.Rect v0_1 = p8.getWidth();
	            android.graphics.Rect v1_0 = p8.getHeight();
	            android.graphics.Paint v2_0 = this.getWidth();
	            int v3_0 = this.getHeight();
	            android.graphics.Rect v0_3 = (((float) v0_1) / ((float) v1_0));
	            if (!p10) {
	                android.graphics.Rect v1_5 = ((int) (v0_3 * ((float) v3_0)));
	                v0_6 = new android.graphics.Rect(((v2_0 - v1_5) / 2), 0, ((v1_5 + v2_0) / 2), v3_0);
	            } else {
	                if (v0_3 <= (((float) v2_0) / ((float) v3_0))) {
	                    android.graphics.Rect v1_10 = ((int) (((float) v2_0) / v0_3));
	                    v0_6 = new android.graphics.Rect(0, ((v3_0 - v1_10) / 2), v2_0, ((v1_10 + v3_0) / 2));
	                } else {
	                    android.graphics.Rect v1_14 = ((int) (v0_3 * ((float) v3_0)));
	                    v0_6 = new android.graphics.Rect(((v2_0 - v1_14) / 2), 0, ((v1_14 + v2_0) / 2), v3_0);
	                }
	            }
	            p7.drawBitmap(p8, new android.graphics.Rect(0, 0, p8.getWidth(), p8.getHeight()), v0_6, this.l);
	        }
	        return;
	    }
	
	
	    public static synthetic android.graphics.Bitmap b(com.google.android.apps.chromecast.app.widget.OverlaidImageView p1)
	    {
	        return p1.e;
	    }
	
	
	    public static synthetic android.graphics.Bitmap b(com.google.android.apps.chromecast.app.widget.OverlaidImageView p0, android.graphics.Bitmap p1)
	    {
	        p0.c = p1;
	        return p1;
	    }
	
	
	    public static synthetic String b(com.google.android.apps.chromecast.app.widget.OverlaidImageView p0, String p1)
	    {
	        p0.i = p1;
	        return p1;
	    }
	
	
	    public static synthetic String c(com.google.android.apps.chromecast.app.widget.OverlaidImageView p1)
	    {
	        return p1.f;
	    }
	
	
	    public static synthetic String d(com.google.android.apps.chromecast.app.widget.OverlaidImageView p1)
	    {
	        return p1.g;
	    }
	
	
	    public final void a(bnw p5)
	    {
	        boolean v1_0 = this.getContext().getResources();
	        android.animation.ValueAnimator v0_2 = bmu.k.a(p5.name());
	        if (v0_2 == null) {
	            v0_2 = android.graphics.BitmapFactory.decodeResource(v1_0, p5.f);
	            bmu.k.a(p5.name(), v0_2);
	        }
	        boolean v1_2 = p5.name();
	        if (!android.text.TextUtils.equals(this.h, v1_2)) {
	            this.k = 0;
	            this.d = v0_2;
	            this.e = 0;
	            this.h = v1_2;
	            this.f = v1_2;
	            this.i = 0;
	            this.g = 0;
	            if ((android.os.Build$VERSION.SDK_INT >= 11) && (!this.a.isRunning())) {
	                this.a.start();
	            } else {
	                this.b = v0_2;
	                this.c = 0;
	            }
	        } else {
	            this.b = v0_2;
	            this.c = 0;
	        }
	        this.invalidate();
	        return;
	    }
	
	
	    public void onDraw(android.graphics.Canvas p6)
	    {
	        super.onDraw(p6);
	        this.l.setAlpha(255);
	        android.graphics.Bitmap v0_2 = (255 - this.m);
	        if ((this.c == null) && (this.e == null)) {
	            if (this.k) {
	                this.a(p6, this.b, ((int) (((float) v0_2) * 1050253722)), 1);
	                this.a(p6, this.d, ((int) (((float) this.m) * 1050253722)), 1);
	            }
	        } else {
	            this.a(p6, this.c, v0_2, 1);
	            this.a(p6, this.e, this.m, 1);
	        }
	        this.a(p6, this.b, v0_2, this.j);
	        this.a(p6, this.d, this.m, this.j);
	        return;
	    }
	
	
	    public void onRestoreInstanceState(android.os.Parcelable p2)
	    {
	        if ((p2 instanceof android.os.Bundle)) {
	            this.h = ((android.os.Bundle) p2).getString("fgImageUrl");
	            this.i = ((android.os.Bundle) p2).getString("bgImageUrl");
	            p2 = ((android.os.Bundle) p2).getParcelable("instanceState");
	        }
	        super.onRestoreInstanceState(p2);
	        return;
	    }
	
	
	    public android.os.Parcelable onSaveInstanceState()
	    {
	        android.os.Bundle v0_1 = new android.os.Bundle();
	        v0_1.putParcelable("instanceState", super.onSaveInstanceState());
	        v0_1.putString("fgImageUrl", this.h);
	        v0_1.putString("bgImageUrl", this.i);
	        return v0_1;
	    }
	
