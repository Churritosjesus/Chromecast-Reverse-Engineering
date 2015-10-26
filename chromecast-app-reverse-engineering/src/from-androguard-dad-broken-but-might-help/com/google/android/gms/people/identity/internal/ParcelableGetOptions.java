	public static final crn CREATOR
	public final  a
	public final  b
	public final  c
	public final java.lang.String d
	public final  e
	public final android.os.Bundle f
	
	    static ParcelableGetOptions()
	    {
	        com.google.android.gms.people.identity.internal.ParcelableGetOptions.CREATOR = new crn();
	        return;
	    }
	
	
	    public ParcelableGetOptions(int p1, boolean p2, boolean p3, boolean p4, String p5, android.os.Bundle p6)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p5;
	        this.e = p4;
	        if (p6 == null) {
	            p6 = new android.os.Bundle();
	        }
	        this.f = p6;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final String toString()
	    {
	        return a.b(this).a("useOfflineDatabase", Boolean.valueOf(this.b)).a("useWebData", Boolean.valueOf(this.c)).a("endpoint", this.d).toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        crn.a(this, p1);
	        return;
	    }
	
