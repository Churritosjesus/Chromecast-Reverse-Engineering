	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final android.os.IBinder b
	public final Lcom.google.android.gms.common.api.Scope c
	
	    static AuthAccountRequest()
	    {
	        com.google.android.gms.common.internal.AuthAccountRequest.CREATOR = new byj();
	        return;
	    }
	
	
	    public AuthAccountRequest(int p1, android.os.IBinder p2, com.google.android.gms.common.api.Scope[] p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public AuthAccountRequest(bzf p4, java.util.Set p5)
	    {
	        com.google.android.gms.common.api.Scope[] v0_1 = new com.google.android.gms.common.api.Scope[p5.size()];
	        this(1, p4.asBinder(), ((com.google.android.gms.common.api.Scope[]) p5.toArray(v0_1)));
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        byj.a(this, p1, p2);
	        return;
	    }
	
