	public static final bsk CREATOR
	public final  a
	public  b
	public java.lang.String c
	public android.accounts.Account d
	
	    static AccountChangeEventsRequest()
	    {
	        com.google.android.gms.auth.AccountChangeEventsRequest.CREATOR = new bsk();
	        return;
	    }
	
	
	    public AccountChangeEventsRequest()
	    {
	        this.a = 1;
	        return;
	    }
	
	
	    public AccountChangeEventsRequest(int p3, int p4, String p5, android.accounts.Account p6)
	    {
	        this.a = p3;
	        this.b = p4;
	        this.c = p5;
	        if ((p6 != null) || (android.text.TextUtils.isEmpty(p5))) {
	            this.d = p6;
	        } else {
	            this.d = new android.accounts.Account(p5, "com.google");
	        }
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bsk.a(this, p1, p2);
	        return;
	    }
	
