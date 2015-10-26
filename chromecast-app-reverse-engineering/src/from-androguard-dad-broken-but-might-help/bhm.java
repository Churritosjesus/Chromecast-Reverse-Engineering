	private synthetic bhf a
	
	    bhm(bhf p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onItemSelected(android.widget.AdapterView p3, android.view.View p4, int p5, long p6)
	    {
	        if (bhf.f(this.a).getSelectedItemPosition() != 0) {
	            bhf.a(this.a, bdk.b);
	        } else {
	            bhf.a(this.a, bdk.a);
	        }
	        return;
	    }
	
	
	    public final void onNothingSelected(android.widget.AdapterView p1)
	    {
	        return;
	    }
	
