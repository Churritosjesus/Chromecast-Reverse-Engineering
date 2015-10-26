	public static final cnh CREATOR
	public static final java.util.List a
	public final  b
	public final java.util.List c
	
	    static LocationResult()
	    {
	        com.google.android.gms.location.LocationResult.a = java.util.Collections.emptyList();
	        com.google.android.gms.location.LocationResult.CREATOR = new cnh();
	        return;
	    }
	
	
	    public LocationResult(int p1, java.util.List p2)
	    {
	        this.b = p1;
	        this.c = p2;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p9)
	    {
	        int v0_6;
	        if ((p9 instanceof com.google.android.gms.location.LocationResult)) {
	            if (((com.google.android.gms.location.LocationResult) p9).c.size() == this.c.size()) {
	                java.util.Iterator v3 = ((com.google.android.gms.location.LocationResult) p9).c.iterator();
	                java.util.Iterator v4 = this.c.iterator();
	                while (v3.hasNext()) {
	                    if (((android.location.Location) v4.next()).getTime() != ((android.location.Location) v3.next()).getTime()) {
	                        v0_6 = 0;
	                    }
	                }
	                v0_6 = 1;
	            } else {
	                v0_6 = 0;
	            }
	        } else {
	            v0_6 = 0;
	        }
	        return v0_6;
	    }
	
	
	    public final int hashCode()
	    {
	        java.util.Iterator v2 = this.c.iterator();
	        int v1_1 = 17;
	        while (v2.hasNext()) {
	            long v4_0 = ((android.location.Location) v2.next()).getTime();
	            v1_1 = (((int) (v4_0 ^ (v4_0 >> 32))) + (v1_1 * 31));
	        }
	        return v1_1;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("LocationResult[locations: ").append(this.c).append("]").toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cnh.a(this, p1);
	        return;
	    }
	
