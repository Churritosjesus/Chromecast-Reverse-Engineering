	public static final bsl CREATOR
	public final  a
	public final java.util.List b
	
	    static AccountChangeEventsResponse()
	    {
	        com.google.android.gms.auth.AccountChangeEventsResponse.CREATOR = new bsl();
	        return;
	    }
	
	
	    public AccountChangeEventsResponse(int p2, java.util.List p3)
	    {
	        this.a = p2;
	        this.b = ((java.util.List) a.c(p3));
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bsl.a(this, p1);
	        return;
	    }
	
