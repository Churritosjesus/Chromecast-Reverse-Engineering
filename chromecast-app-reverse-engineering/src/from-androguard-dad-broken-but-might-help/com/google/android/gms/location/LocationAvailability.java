	public static final cnf CREATOR
	public final  a
	public  b
	public  c
	public  d
	public  e
	
	    static LocationAvailability()
	    {
	        com.google.android.gms.location.LocationAvailability.CREATOR = new cnf();
	        return;
	    }
	
	
	    public LocationAvailability(int p2, int p3, int p4, int p5, long p6)
	    {
	        this.a = p2;
	        this.e = p3;
	        this.b = p4;
	        this.c = p5;
	        this.d = p6;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p7)
	    {
	        int v0 = 0;
	        if (((p7 instanceof com.google.android.gms.location.LocationAvailability)) && ((this.e == ((com.google.android.gms.location.LocationAvailability) p7).e) && ((this.b == ((com.google.android.gms.location.LocationAvailability) p7).b) && ((this.c == ((com.google.android.gms.location.LocationAvailability) p7).c) && (this.d == ((com.google.android.gms.location.LocationAvailability) p7).d))))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_1 = new Object[4];
	        v0_1[0] = Integer.valueOf(this.e);
	        v0_1[1] = Integer.valueOf(this.b);
	        v0_1[2] = Integer.valueOf(this.c);
	        v0_1[3] = Long.valueOf(this.d);
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public final String toString()
	    {
	        String v0_2;
	        String v1_1 = new StringBuilder("LocationAvailability[isLocationAvailable: ");
	        if (this.e >= 1000) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v1_1.append(v0_2).append("]").toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cnf.a(this, p1);
	        return;
	    }
	
