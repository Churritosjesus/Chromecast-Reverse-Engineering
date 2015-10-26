	private synthetic android.text.Spannable a
	
	    acd(acb p1, android.text.Spannable p2)
	    {
	        this.a = p2;
	        return;
	    }
	
	
	    public final synthetic int compare(Object p3, Object p4)
	    {
	        int v0_2;
	        int v0_1 = this.a.getSpanStart(((ada) p3));
	        int v1_1 = this.a.getSpanStart(((ada) p4));
	        if (v0_1 >= v1_1) {
	            if (v0_1 <= v1_1) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	        } else {
	            v0_2 = -1;
	        }
	        return v0_2;
	    }
	
