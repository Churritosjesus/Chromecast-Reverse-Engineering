	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public android.os.IBinder b
	public com.google.android.gms.common.ConnectionResult c
	public  d
	public  e
	
	    static ResolveAccountResponse()
	    {
	        com.google.android.gms.common.internal.ResolveAccountResponse.CREATOR = new bzt();
	        return;
	    }
	
	
	    public ResolveAccountResponse(int p4)
	    {
	        this(new com.google.android.gms.common.ConnectionResult(8, 0));
	        return;
	    }
	
	
	    public ResolveAccountResponse(int p1, android.os.IBinder p2, com.google.android.gms.common.ConnectionResult p3, boolean p4, boolean p5)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        return;
	    }
	
	
	    private ResolveAccountResponse(com.google.android.gms.common.ConnectionResult p7)
	    {
	        this(1, 0, p7, 0, 0);
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (this != p5) {
	            if ((p5 instanceof com.google.android.gms.common.internal.ResolveAccountResponse)) {
	                if ((!this.c.equals(((com.google.android.gms.common.internal.ResolveAccountResponse) p5).c)) || (!bzg.a(this.b).equals(bzg.a(((com.google.android.gms.common.internal.ResolveAccountResponse) p5).b)))) {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bzt.a(this, p1, p2);
	        return;
	    }
	
