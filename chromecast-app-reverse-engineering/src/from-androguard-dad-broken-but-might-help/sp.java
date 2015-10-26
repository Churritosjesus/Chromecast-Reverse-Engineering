	private synthetic sm a
	
	    sp(sm p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p6)
	    {
	        int v3 = sm.a(this.a).getChildCount();
	        int v2 = 0;
	        while (v2 < v3) {
	            int v0_4;
	            android.view.View v4 = sm.a(this.a).getChildAt(v2);
	            if (v4 != p6) {
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	            v4.setSelected(v0_4);
	            v2++;
	        }
	        return;
	    }
	
