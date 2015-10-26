	
	    public ChromecastSwipeRefreshLayout(android.content.Context p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public ChromecastSwipeRefreshLayout(android.content.Context p1, android.util.AttributeSet p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        int v0_2;
	        int v0_1 = this.findViewById(16908298);
	        if (v0_1 != 0) {
	            if (android.os.Build$VERSION.SDK_INT >= 14) {
	                v0_2 = gt.b(v0_1, -1);
	            } else {
	                if (!(v0_1 instanceof android.widget.AbsListView)) {
	                    if (v0_1.getScrollY() <= 0) {
	                        v0_2 = 0;
	                    } else {
	                        v0_2 = 1;
	                    }
	                } else {
	                    int v0_4 = ((android.widget.AbsListView) v0_1);
	                    if ((v0_4.getChildCount() <= 0) || ((v0_4.getFirstVisiblePosition() <= 0) && (v0_4.getChildAt(0).getTop() >= v0_4.getPaddingTop()))) {
	                        v0_2 = 0;
	                    } else {
	                        v0_2 = 1;
	                    }
	                }
	            }
	        } else {
	            v0_2 = super.b();
	        }
	        return v0_2;
	    }
	
