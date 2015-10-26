	private java.util.Locale a
	
	    public pg(android.content.Context p2)
	    {
	        this.a = p2.getResources().getConfiguration().locale;
	        return;
	    }
	
	
	    public final CharSequence getTransformation(CharSequence p3, android.view.View p4)
	    {
	        int v0_0;
	        if (p3 == null) {
	            v0_0 = 0;
	        } else {
	            v0_0 = p3.toString().toUpperCase(this.a);
	        }
	        return v0_0;
	    }
	
	
	    public final void onFocusChanged(android.view.View p1, CharSequence p2, boolean p3, int p4, android.graphics.Rect p5)
	    {
	        return;
	    }
	
