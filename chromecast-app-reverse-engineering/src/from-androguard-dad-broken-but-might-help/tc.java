	private android.content.res.Resources a
	
	    private tc(android.content.Context p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public static android.content.Context a(android.content.Context p1)
	    {
	        if (!(p1 instanceof tc)) {
	            p1 = new tc(p1);
	        }
	        return p1;
	    }
	
	
	    public final android.content.res.Resources getResources()
	    {
	        if (this.a == null) {
	            this.a = new td(super.getResources(), tf.a(this));
	        }
	        return this.a;
	    }
	
