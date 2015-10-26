	private synthetic yc a
	
	    yl(yc p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onScroll(android.widget.AbsListView p1, int p2, int p3, int p4)
	    {
	        return;
	    }
	
	
	    public final void onScrollStateChanged(android.widget.AbsListView p3, int p4)
	    {
	        if ((p4 == 1) && ((!this.a.e()) && (yc.b(this.a).getContentView() != null))) {
	            yc.d(this.a).removeCallbacks(yc.c(this.a));
	            yc.c(this.a).run();
	        }
	        return;
	    }
	
