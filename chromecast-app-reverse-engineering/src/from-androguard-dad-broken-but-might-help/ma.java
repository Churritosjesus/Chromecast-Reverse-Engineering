	private synthetic  a
	private synthetic  b
	private synthetic lw c
	
	    ma(lw p1, int p2, int p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void applyTransformation(float p5, android.view.animation.Transformation p6)
	    {
	        lw.b(this.c).setAlpha(((int) (((float) this.a) + (((float) (this.b - this.a)) * p5))));
	        return;
	    }
	
