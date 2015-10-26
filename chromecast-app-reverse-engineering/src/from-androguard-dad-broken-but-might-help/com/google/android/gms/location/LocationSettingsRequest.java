	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final java.util.List b
	public final  c
	public final  d
	public final  e
	
	    static LocationSettingsRequest()
	    {
	        com.google.android.gms.location.LocationSettingsRequest.CREATOR = new coq();
	        return;
	    }
	
	
	    public LocationSettingsRequest(int p1, java.util.List p2, boolean p3, boolean p4, boolean p5)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        coq.a(this, p1);
	        return;
	    }
	
