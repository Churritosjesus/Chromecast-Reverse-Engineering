	public static final cna CREATOR
	public final  a
	public java.util.List b
	public  c
	public  d
	public  e
	
	    static ActivityRecognitionResult()
	    {
	        com.google.android.gms.location.ActivityRecognitionResult.CREATOR = new cna();
	        return;
	    }
	
	
	    public ActivityRecognitionResult(int p2, java.util.List p3, long p4, long p6, int p8)
	    {
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.d = p6;
	        this.e = p8;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public String toString()
	    {
	        return new StringBuilder("ActivityRecognitionResult [probableActivities=").append(this.b).append(", timeMillis=").append(this.c).append(", elapsedRealtimeMillis=").append(this.d).append("]").toString();
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cna.a(this, p1);
	        return;
	    }
	
