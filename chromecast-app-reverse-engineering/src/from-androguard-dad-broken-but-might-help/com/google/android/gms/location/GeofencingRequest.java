	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final java.util.List b
	public final  c
	
	    static GeofencingRequest()
	    {
	        com.google.android.gms.location.GeofencingRequest.CREATOR = new coi();
	        return;
	    }
	
	
	    public GeofencingRequest(int p1, java.util.List p2, int p3)
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
	        coi.a(this, p1);
	        return;
	    }
	
