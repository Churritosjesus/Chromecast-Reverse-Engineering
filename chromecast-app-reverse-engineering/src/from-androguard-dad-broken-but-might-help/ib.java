	
	    public ib()
	    {
	        return;
	    }
	
	
	    public final synthetic int compare(Object p5, Object p6)
	    {
	        int v0_3;
	        int v0_1 = ((hv) ((android.view.View) p5).getLayoutParams());
	        int v1_1 = ((hv) ((android.view.View) p6).getLayoutParams());
	        if (v0_1.a == v1_1.a) {
	            v0_3 = (v0_1.e - v1_1.e);
	        } else {
	            if (!v0_1.a) {
	                v0_3 = -1;
	            } else {
	                v0_3 = 1;
	            }
	        }
	        return v0_3;
	    }
	
