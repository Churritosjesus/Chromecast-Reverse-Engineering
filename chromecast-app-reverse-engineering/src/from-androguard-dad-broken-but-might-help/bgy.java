	private synthetic bgv a
	
	    bgy(bgv p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onItemSelected(android.widget.AdapterView p3, android.view.View p4, int p5, long p6)
	    {
	        bgv.a(this.a, ((blm) bgv.c(this.a).getSelectedItem()).a);
	        return;
	    }
	
	
	    public final void onNothingSelected(android.widget.AdapterView p3)
	    {
	        bgv.a(this.a, 0);
	        return;
	    }
	
