	private final tf a
	
	    public td(android.content.res.Resources p1, tf p2)
	    {
	        this(p1);
	        this.a = p2;
	        return;
	    }
	
	
	    public final android.graphics.drawable.Drawable getDrawable(int p3)
	    {
	        android.graphics.drawable.Drawable v0 = super.getDrawable(p3);
	        if (v0 != null) {
	            this.a.a(p3, v0);
	        }
	        return v0;
	    }
	
