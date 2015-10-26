	public static final cnk CREATOR
	public final  a
	public final com.google.android.gms.common.api.Status b
	public final com.google.android.gms.location.LocationSettingsStates c
	
	    static LocationSettingsResult()
	    {
	        com.google.android.gms.location.LocationSettingsResult.CREATOR = new cnk();
	        return;
	    }
	
	
	    public LocationSettingsResult(int p1, com.google.android.gms.common.api.Status p2, com.google.android.gms.location.LocationSettingsStates p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final com.google.android.gms.common.api.Status b()
	    {
	        return this.b;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cnk.a(this, p1, p2);
	        return;
	    }
	
