	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public java.lang.String b
	public java.lang.String c
	public java.net.Inet4Address d
	public java.lang.String e
	public java.lang.String f
	public java.lang.String g
	public  h
	public java.util.List i
	public  j
	public  k
	
	    static CastDevice()
	    {
	        com.google.android.gms.cast.CastDevice.CREATOR = new bva();
	        return;
	    }
	
	
	    private CastDevice()
	    {
	        this(3, 0, 0, 0, 0, 0, -1, new java.util.ArrayList(), 0, -1);
	        return;
	    }
	
	
	    public CastDevice(int p3, String p4, String p5, String p6, String p7, String p8, int p9, java.util.List p10, int p11, int p12)
	    {
	        this.a = p3;
	        this.b = p4;
	        this.c = p5;
	        if (this.c != null) {
	            try {
	                java.net.Inet4Address v0_2 = java.net.InetAddress.getByName(this.c);
	            } catch (java.net.Inet4Address v0) {
	                this.d = 0;
	            }
	            if ((v0_2 instanceof java.net.Inet4Address)) {
	                this.d = ((java.net.Inet4Address) v0_2);
	            }
	        }
	        this.e = p6;
	        this.f = p7;
	        this.g = p8;
	        this.h = p9;
	        this.i = p10;
	        this.j = p11;
	        this.k = p12;
	        return;
	    }
	
	
	    public static com.google.android.gms.cast.CastDevice a(android.os.Bundle p1)
	    {
	        com.google.android.gms.cast.CastDevice v0_4;
	        if (p1 != null) {
	            p1.setClassLoader(com.google.android.gms.cast.CastDevice.getClassLoader());
	            v0_4 = ((com.google.android.gms.cast.CastDevice) p1.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE"));
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public final boolean a(int p2)
	    {
	        int v0_2;
	        if ((this.j & p2) != p2) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (p5 != this) {
	            if ((p5 instanceof com.google.android.gms.cast.CastDevice)) {
	                if (this.b != null) {
	                    if ((!a.d(this.b, ((com.google.android.gms.cast.CastDevice) p5).b)) || ((!a.d(this.d, ((com.google.android.gms.cast.CastDevice) p5).d)) || ((!a.d(this.f, ((com.google.android.gms.cast.CastDevice) p5).f)) || ((!a.d(this.e, ((com.google.android.gms.cast.CastDevice) p5).e)) || ((!a.d(this.g, ((com.google.android.gms.cast.CastDevice) p5).g)) || ((this.h != ((com.google.android.gms.cast.CastDevice) p5).h) || ((!a.d(this.i, ((com.google.android.gms.cast.CastDevice) p5).i)) || ((this.j != ((com.google.android.gms.cast.CastDevice) p5).j) || (this.k != ((com.google.android.gms.cast.CastDevice) p5).k))))))))) {
	                        v0 = 0;
	                    }
	                } else {
	                    if (((com.google.android.gms.cast.CastDevice) p5).b != null) {
	                        v0 = 0;
	                    }
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_2;
	        if (this.b != null) {
	            v0_2 = this.b.hashCode();
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public String toString()
	    {
	        Object[] v1_1 = new Object[2];
	        v1_1[0] = this.e;
	        v1_1[1] = this.b;
	        return String.format("\"%s\" (%s)", v1_1);
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bva.a(this, p1);
	        return;
	    }
	
