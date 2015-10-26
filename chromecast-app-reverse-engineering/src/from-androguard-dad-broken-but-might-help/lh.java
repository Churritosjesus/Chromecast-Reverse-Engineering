	private final android.widget.ListView a
	
	    public lh(android.widget.ListView p1)
	    {
	        this(p1);
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p4)
	    {
	        android.widget.ListView v0 = this.a;
	        int v1 = v0.getFirstVisiblePosition();
	        if (v1 != -1) {
	            int v2_2 = v0.getChildAt(0);
	            if (v2_2 != 0) {
	                v0.setSelectionFromTop(v1, (v2_2.getTop() - p4));
	            }
	        }
	        return;
	    }
	
	
	    public final boolean b(int p7)
	    {
	        int v0 = 0;
	        int v1_0 = this.a;
	        int v2_0 = v1_0.getCount();
	        if (v2_0 != 0) {
	            int v3 = v1_0.getChildCount();
	            int v4 = v1_0.getFirstVisiblePosition();
	            if (p7 <= 0) {
	                if ((p7 >= 0) || ((v4 <= 0) && (v1_0.getChildAt(0).getTop() >= 0))) {
	                    return v0;
	                }
	            } else {
	                if (((v4 + v3) >= v2_0) && (v1_0.getChildAt((v3 - 1)).getBottom() <= v1_0.getHeight())) {
	                    return v0;
	                }
	            }
	            v0 = 1;
	        }
	        return v0;
	    }
	
