	public static final cof CREATOR
	public final  a
	public  b
	public com.google.android.gms.location.internal.LocationRequestInternal c
	public con d
	public android.app.PendingIntent e
	public cok f
	
	    static LocationRequestUpdateData()
	    {
	        com.google.android.gms.location.internal.LocationRequestUpdateData.CREATOR = new cof();
	        return;
	    }
	
	
	    public LocationRequestUpdateData(int p3, int p4, com.google.android.gms.location.internal.LocationRequestInternal p5, android.os.IBinder p6, android.app.PendingIntent p7, android.os.IBinder p8)
	    {
	        con v0;
	        cok v1 = 0;
	        this.a = p3;
	        this.b = p4;
	        this.c = p5;
	        if (p6 != null) {
	            v0 = coo.a(p6);
	        } else {
	            v0 = 0;
	        }
	        this.d = v0;
	        this.e = p7;
	        if (p8 != null) {
	            v1 = col.a(p8);
	        }
	        this.f = v1;
	        return;
	    }
	
	
	    public static com.google.android.gms.location.internal.LocationRequestUpdateData a(cok p7)
	    {
	        return new com.google.android.gms.location.internal.LocationRequestUpdateData(1, 2, 0, 0, 0, p7.asBinder());
	    }
	
	
	    public static com.google.android.gms.location.internal.LocationRequestUpdateData a(con p7)
	    {
	        return new com.google.android.gms.location.internal.LocationRequestUpdateData(1, 2, 0, p7.asBinder(), 0, 0);
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cof.a(this, p1, p2);
	        return;
	    }
	
