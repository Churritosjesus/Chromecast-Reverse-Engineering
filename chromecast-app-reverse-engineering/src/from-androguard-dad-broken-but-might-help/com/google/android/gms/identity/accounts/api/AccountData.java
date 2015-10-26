	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final java.lang.String b
	public final java.lang.String c
	
	    static AccountData()
	    {
	        com.google.android.gms.identity.accounts.api.AccountData.CREATOR = new cim();
	        return;
	    }
	
	
	    public AccountData(int p2, String p3, String p4)
	    {
	        a.a(p3, "Account name must not be empty.");
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    private AccountData(String p3, String p4)
	    {
	        this(1, p3, 0);
	        return;
	    }
	
	
	    public static com.google.android.gms.identity.accounts.api.AccountData a(String p2)
	    {
	        a.a(p2, "Account name must not be empty.");
	        return new com.google.android.gms.identity.accounts.api.AccountData(p2, 0);
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cim.a(this, p1);
	        return;
	    }
	
