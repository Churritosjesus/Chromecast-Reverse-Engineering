	private synthetic bhf a
	
	    bhg(bhf p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onCheckedChanged(android.widget.CompoundButton p2, boolean p3)
	    {
	        if (!bhf.a(this.a).isFinishing()) {
	            bhf.a(this.a, p3);
	        }
	        return;
	    }
	
