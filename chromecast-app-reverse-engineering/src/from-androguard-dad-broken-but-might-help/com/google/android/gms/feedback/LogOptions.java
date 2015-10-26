	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public java.lang.String b
	public  c
	
	    static LogOptions()
	    {
	        com.google.android.gms.feedback.LogOptions.CREATOR = new cij();
	        return;
	    }
	
	
	    public LogOptions(int p1, String p2, boolean p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cij.a(this, p1);
	        return;
	    }
	
