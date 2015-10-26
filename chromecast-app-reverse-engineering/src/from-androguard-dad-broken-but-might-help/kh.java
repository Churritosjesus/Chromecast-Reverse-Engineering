	 android.view.animation.Animation$AnimationListener a
	private  b
	
	    public kh(android.content.Context p7, int p8, float p9)
	    {
	        android.graphics.drawable.ShapeDrawable v0_8;
	        this(p7);
	        android.graphics.Paint v1_0 = this.getContext().getResources().getDisplayMetrics().density;
	        android.graphics.drawable.ShapeDrawable v0_6 = ((int) ((1101004800 * v1_0) * 1073741824));
	        int v2_3 = ((int) (1071644672 * v1_0));
	        float v3_2 = ((int) (0 * v1_0));
	        this.b = ((int) (1080033280 * v1_0));
	        if (!kh.a()) {
	            v0_8 = new android.graphics.drawable.ShapeDrawable(new ki(this, this.b, v0_6));
	            gt.a(this, 1, v0_8.getPaint());
	            v0_8.getPaint().setShadowLayer(((float) this.b), ((float) v3_2), ((float) v2_3), 503316480);
	            this.setPadding(this.b, this.b, this.b, this.b);
	        } else {
	            v0_8 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
	            gt.f(this, (v1_0 * 1082130432));
	        }
	        v0_8.getPaint().setColor(-328966);
	        this.setBackgroundDrawable(v0_8);
	        return;
	    }
	
	
	    static synthetic int a(kh p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic int a(kh p0, int p1)
	    {
	        p0.b = p1;
	        return p1;
	    }
	
	
	    private static boolean a()
	    {
	        int v0_1;
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final void onAnimationEnd()
	    {
	        super.onAnimationEnd();
	        if (this.a != null) {
	            this.a.onAnimationEnd(this.getAnimation());
	        }
	        return;
	    }
	
	
	    public final void onAnimationStart()
	    {
	        super.onAnimationStart();
	        if (this.a != null) {
	            this.a.onAnimationStart(this.getAnimation());
	        }
	        return;
	    }
	
	
	    protected final void onMeasure(int p4, int p5)
	    {
	        super.onMeasure(p4, p5);
	        if (!kh.a()) {
	            this.setMeasuredDimension((this.getMeasuredWidth() + (this.b << 1)), (this.getMeasuredHeight() + (this.b << 1)));
	        }
	        return;
	    }
	
	
	    public final void setBackgroundColor(int p2)
	    {
	        if ((this.getBackground() instanceof android.graphics.drawable.ShapeDrawable)) {
	            ((android.graphics.drawable.ShapeDrawable) this.getBackground()).getPaint().setColor(p2);
	        }
	        return;
	    }
	
