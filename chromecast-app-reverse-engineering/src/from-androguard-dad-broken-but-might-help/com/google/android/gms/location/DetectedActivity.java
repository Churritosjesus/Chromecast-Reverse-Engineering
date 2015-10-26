	public static final cnc CREATOR
	public final  a
	public  b
	public  c
	
	    static DetectedActivity()
	    {
	        new cnb();
	        com.google.android.gms.location.DetectedActivity.CREATOR = new cnc();
	        return;
	    }
	
	
	    public DetectedActivity(int p1, int p2, int p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v0 = this.b;
	        if (v0 > 14) {
	            v0 = 4;
	        }
	        return v0;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public String toString()
	    {
	        String v0_2;
	        String v1_1 = new StringBuilder("DetectedActivity [type=");
	        String v0_1 = this.a();
	        switch (v0_1) {
	            case 0:
	                v0_2 = "IN_VEHICLE";
	                break;
	            case 1:
	                v0_2 = "ON_BICYCLE";
	                break;
	            case 2:
	                v0_2 = "ON_FOOT";
	                break;
	            case 3:
	                v0_2 = "STILL";
	                break;
	            case 4:
	                v0_2 = "UNKNOWN";
	                break;
	            case 5:
	                v0_2 = "TILTING";
	                break;
	            case 6:
	            default:
	                v0_2 = Integer.toString(v0_1);
	                break;
	            case 7:
	                v0_2 = "WALKING";
	                break;
	            case 8:
	                v0_2 = "RUNNING";
	                break;
	        }
	        return v1_1.append(v0_2).append(", confidence=").append(this.c).append("]").toString();
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cnc.a(this, p1);
	        return;
	    }
	
