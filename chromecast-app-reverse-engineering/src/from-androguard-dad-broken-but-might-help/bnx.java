	private final  a
	private final android.view.View b
	private final  c
	private synthetic bmu d
	
	    public bnx(bmu p3, android.view.View p4, int p5, boolean p6)
	    {
	        this.d = p3;
	        this.b = p4;
	        this.a = p5;
	        this.c = p6;
	        if (android.os.Build$VERSION.SDK_INT >= 11) {
	            this.setInterpolator(p3.h, 17563650);
	        }
	        this.setDuration(200);
	        return;
	    }
	
	
	    protected final void applyTransformation(float p3, android.view.animation.Transformation p4)
	    {
	        bob v0_4;
	        if (!this.c) {
	            v0_4 = ((int) (((float) this.a) * (1065353216 - p3)));
	        } else {
	            v0_4 = ((int) (((float) this.a) * p3));
	        }
	        this.b.getLayoutParams().height = v0_4;
	        this.b.requestLayout();
	        this.d.g.a();
	        return;
	    }
	
	
	    public final void initialize(int p1, int p2, int p3, int p4)
	    {
	        super.initialize(p1, p2, p3, p4);
	        return;
	    }
	
	
	    public final boolean willChangeBounds()
	    {
	        return 1;
	    }
	
