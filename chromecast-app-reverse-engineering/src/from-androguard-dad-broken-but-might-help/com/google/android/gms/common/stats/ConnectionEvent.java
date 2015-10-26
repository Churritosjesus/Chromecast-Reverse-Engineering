	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final  b
	public java.lang.String c
	public final java.lang.String d
	public final java.lang.String e
	public final java.lang.String f
	public final java.lang.String g
	public final java.lang.String h
	public final  i
	public final  j
	public final  k
	
	    static ConnectionEvent()
	    {
	        com.google.android.gms.common.stats.ConnectionEvent.CREATOR = new bzv();
	        return;
	    }
	
	
	    public ConnectionEvent(int p1, long p2, String p4, String p5, String p6, String p7, String p8, String p9, long p10, long p12, long p14)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p4;
	        this.d = p5;
	        this.e = p6;
	        this.f = p7;
	        this.g = p8;
	        this.h = p9;
	        this.i = p10;
	        this.j = p12;
	        this.k = p14;
	        return;
	    }
	
	
	    public ConnectionEvent(long p18, String p20, String p21, String p22, String p23, String p24, String p25, long p26, long p28, long p30)
	    {
	        this(1, p18, p20, p21, p22, p23, p24, p25, p26, p28, p30);
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bzv.a(this, p1);
	        return;
	    }
	
