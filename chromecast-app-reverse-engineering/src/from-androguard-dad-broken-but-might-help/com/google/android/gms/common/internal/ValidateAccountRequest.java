	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final  b
	public final android.os.IBinder c
	public final Lcom.google.android.gms.common.api.Scope d
	public final android.os.Bundle e
	public final java.lang.String f
	
	    static ValidateAccountRequest()
	    {
	        com.google.android.gms.common.internal.ValidateAccountRequest.CREATOR = new byi();
	        return;
	    }
	
	
	    public ValidateAccountRequest(int p1, int p2, android.os.IBinder p3, com.google.android.gms.common.api.Scope[] p4, android.os.Bundle p5, String p6)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        this.f = p6;
	        return;
	    }
	
	
	    public ValidateAccountRequest(bzf p8, com.google.android.gms.common.api.Scope[] p9, String p10, android.os.Bundle p11)
	    {
	        android.os.IBinder v3;
	        if (p8 != null) {
	            v3 = p8.asBinder();
	        } else {
	            v3 = 0;
	        }
	        this(1, 7327000, v3, p9, p11, p10);
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        byi.a(this, p1, p2);
	        return;
	    }
	
