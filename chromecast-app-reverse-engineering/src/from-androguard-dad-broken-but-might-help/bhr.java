	private synthetic bhf a
	
	    bhr(bhf p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onCheckedChanged(android.widget.CompoundButton p2, boolean p3)
	    {
	        if (!bhf.a(this.a).isFinishing()) {
	            bhf.b(this.a, p3);
	        }
	        return;
	    }
	
