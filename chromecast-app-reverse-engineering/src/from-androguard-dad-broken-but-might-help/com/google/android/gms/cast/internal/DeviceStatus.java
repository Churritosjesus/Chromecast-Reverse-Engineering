	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public  b
	public  c
	public  d
	public com.google.android.gms.cast.ApplicationMetadata e
	public  f
	
	    static DeviceStatus()
	    {
	        com.google.android.gms.cast.internal.DeviceStatus.CREATOR = new bum();
	        return;
	    }
	
	
	    public DeviceStatus()
	    {
	        this(3, nan, 0, -1, 0, -1);
	        return;
	    }
	
	
	    public DeviceStatus(int p1, double p2, boolean p4, int p5, com.google.android.gms.cast.ApplicationMetadata p6, int p7)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p4;
	        this.d = p5;
	        this.e = p6;
	        this.f = p7;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p7)
	    {
	        int v0 = 1;
	        if (p7 != this) {
	            if ((p7 instanceof com.google.android.gms.cast.internal.DeviceStatus)) {
	                if ((this.b != ((com.google.android.gms.cast.internal.DeviceStatus) p7).b) || ((this.c != ((com.google.android.gms.cast.internal.DeviceStatus) p7).c) || ((this.d != ((com.google.android.gms.cast.internal.DeviceStatus) p7).d) || ((!a.d(this.e, ((com.google.android.gms.cast.internal.DeviceStatus) p7).e)) || (this.f != ((com.google.android.gms.cast.internal.DeviceStatus) p7).f))))) {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_1 = new Object[5];
	        v0_1[0] = Double.valueOf(this.b);
	        v0_1[1] = Boolean.valueOf(this.c);
	        v0_1[2] = Integer.valueOf(this.d);
	        v0_1[3] = this.e;
	        v0_1[4] = Integer.valueOf(this.f);
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bum.a(this, p1, p2);
	        return;
	    }
	
