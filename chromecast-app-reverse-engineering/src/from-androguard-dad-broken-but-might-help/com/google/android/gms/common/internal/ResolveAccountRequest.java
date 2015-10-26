	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final android.accounts.Account b
	public final  c
	
	    static ResolveAccountRequest()
	    {
	        com.google.android.gms.common.internal.ResolveAccountRequest.CREATOR = new bzs();
	        return;
	    }
	
	
	    public ResolveAccountRequest(int p1, android.accounts.Account p2, int p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public ResolveAccountRequest(android.accounts.Account p2, int p3)
	    {
	        this(1, p2, p3);
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bzs.a(this, p1, p2);
	        return;
	    }
	
