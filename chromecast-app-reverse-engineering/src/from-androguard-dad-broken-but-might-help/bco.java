	
	    bco()
	    {
	        return;
	    }
	
	
	    public final synthetic int compare(Object p3, Object p4)
	    {
	        if ((((bcd) p3).a != null) && (((bcd) p3).a.d != null)) {
	            if ((((bcd) p4).a != null) && (((bcd) p4).a.d != null)) {
	                int v0_9 = Integer.compare(((bcd) p4).a.d.intValue(), ((bcd) p3).a.d.intValue());
	            } else {
	                v0_9 = 1;
	            }
	        } else {
	            v0_9 = -1;
	        }
	        return v0_9;
	    }
	
