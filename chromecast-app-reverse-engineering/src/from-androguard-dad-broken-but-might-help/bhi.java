	private synthetic java.util.List a
	private synthetic bhf b
	
	    bhi(bhf p1, java.util.List p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onItemSelected(android.widget.AdapterView p3, android.view.View p4, int p5, long p6)
	    {
	        bhf.a(this.b, ((bcz) this.a.get(p5)));
	        return;
	    }
	
	
	    public final void onNothingSelected(android.widget.AdapterView p1)
	    {
	        return;
	    }
	
