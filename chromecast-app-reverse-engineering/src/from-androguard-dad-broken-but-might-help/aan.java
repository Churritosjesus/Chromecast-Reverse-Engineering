	private synthetic  a
	private synthetic  b
	private synthetic android.support.v7.widget.SwitchCompat c
	
	    public aan(android.support.v7.widget.SwitchCompat p1, float p2, float p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    protected final void applyTransformation(float p4, android.view.animation.Transformation p5)
	    {
	        android.support.v7.widget.SwitchCompat.a(this.c, (this.a + (this.b * p4)));
	        return;
	    }
	
