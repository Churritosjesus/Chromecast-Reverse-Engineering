	
	    dhm()
	    {
	        return;
	    }
	
	
	    public final synthetic int compare(Object p2, Object p3)
	    {
	        int v0_1;
	        if (((String) p2) != ((String) p3)) {
	            if (((String) p2) != null) {
	                if (((String) p3) != null) {
	                    v0_1 = String.CASE_INSENSITIVE_ORDER.compare(((String) p2), ((String) p3));
	                } else {
	                    v0_1 = 1;
	                }
	            } else {
	                v0_1 = -1;
	            }
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
