	final synthetic com.google.android.libraries.view.pagingindicator.PagingIndicator a
	private final  b
	
	    public dac(com.google.android.libraries.view.pagingindicator.PagingIndicator p3, int p4, dah p5)
	    {
	        this.a = p3;
	        this(p3, p5);
	        this.b = p4;
	        dae v0_1 = new float[2];
	        v0_1 = {925353388, 1065353216};
	        this.setFloatValues(v0_1);
	        this.setDuration(com.google.android.libraries.view.pagingindicator.PagingIndicator.d(p3));
	        this.setInterpolator(com.google.android.libraries.view.pagingindicator.PagingIndicator.e(p3));
	        this.addUpdateListener(new dad(this, p3));
	        this.addListener(new dae(this, p3));
	        return;
	    }
	
	
	    static synthetic int a(dac p1)
	    {
	        return p1.b;
	    }
	
