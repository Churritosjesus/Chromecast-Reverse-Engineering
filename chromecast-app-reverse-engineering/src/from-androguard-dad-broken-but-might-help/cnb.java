	
	    public cnb()
	    {
	        return;
	    }
	
	
	    public final synthetic int compare(Object p3, Object p4)
	    {
	        int v0_2 = Integer.valueOf(((com.google.android.gms.location.DetectedActivity) p4).c).compareTo(Integer.valueOf(((com.google.android.gms.location.DetectedActivity) p3).c));
	        if (v0_2 == 0) {
	            v0_2 = Integer.valueOf(((com.google.android.gms.location.DetectedActivity) p3).a()).compareTo(Integer.valueOf(((com.google.android.gms.location.DetectedActivity) p4).a()));
	        }
	        return v0_2;
	    }
	
