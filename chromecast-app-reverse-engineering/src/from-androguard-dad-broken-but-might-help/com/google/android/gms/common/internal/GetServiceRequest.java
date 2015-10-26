	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final  b
	public  c
	public java.lang.String d
	public android.os.IBinder e
	public Lcom.google.android.gms.common.api.Scope f
	public android.os.Bundle g
	public android.accounts.Account h
	
	    static GetServiceRequest()
	    {
	        com.google.android.gms.common.internal.GetServiceRequest.CREATOR = new byn();
	        return;
	    }
	
	
	    public GetServiceRequest(int p2)
	    {
	        this.a = 2;
	        this.c = 7327000;
	        this.b = p2;
	        return;
	    }
	
	
	    public GetServiceRequest(int p2, int p3, int p4, String p5, android.os.IBinder p6, com.google.android.gms.common.api.Scope[] p7, android.os.Bundle p8, android.accounts.Account p9)
	    {
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.d = p5;
	        if (p2 >= 2) {
	            this.e = p6;
	            this.h = p9;
	        } else {
	            android.accounts.Account v0_1 = 0;
	            if (p6 != null) {
	                v0_1 = byh.a(bzg.a(p6));
	            }
	            this.h = v0_1;
	        }
	        this.f = p7;
	        this.g = p8;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        byn.a(this, p1, p2);
	        return;
	    }
	
