	public static final cri CREATOR
	public final  a
	public final java.lang.String b
	public final java.lang.String c
	
	    static AccountToken()
	    {
	        com.google.android.gms.people.identity.internal.AccountToken.CREATOR = new cri();
	        return;
	    }
	
	
	    public AccountToken(int p1, String p2, String p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cri.a(this, p1);
	        return;
	    }
	
