	private synthetic bos a
	
	    box(bos p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onItemSelected(android.widget.AdapterView p3, android.view.View p4, int p5, long p6)
	    {
	        bos.b(this.a);
	        if (p5 != bos.e(this.a)) {
	            bos.a(this.a, 0);
	        }
	        this.a.a(bos.f(this.a));
	        bos.a(this.a);
	        return;
	    }
	
	
	    public final void onNothingSelected(android.widget.AdapterView p2)
	    {
	        bos.b(this.a);
	        bos.a(this.a);
	        return;
	    }
	
