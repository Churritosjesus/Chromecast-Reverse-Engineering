	public static final coe CREATOR
	public static final java.util.List a
	public final  b
	public com.google.android.gms.location.LocationRequest c
	public  d
	public  e
	public  f
	public java.util.List g
	public final java.lang.String h
	
	    static LocationRequestInternal()
	    {
	        com.google.android.gms.location.internal.LocationRequestInternal.a = java.util.Collections.emptyList();
	        com.google.android.gms.location.internal.LocationRequestInternal.CREATOR = new coe();
	        return;
	    }
	
	
	    public LocationRequestInternal(int p1, com.google.android.gms.location.LocationRequest p2, boolean p3, boolean p4, boolean p5, java.util.List p6, String p7)
	    {
	        this.b = p1;
	        this.c = p2;
	        this.d = p3;
	        this.e = p4;
	        this.f = p5;
	        this.g = p6;
	        this.h = p7;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p4)
	    {
	        int v0 = 0;
	        if (((p4 instanceof com.google.android.gms.location.internal.LocationRequestInternal)) && ((a.e(this.c, ((com.google.android.gms.location.internal.LocationRequestInternal) p4).c)) && ((this.d == ((com.google.android.gms.location.internal.LocationRequestInternal) p4).d) && ((this.e == ((com.google.android.gms.location.internal.LocationRequestInternal) p4).e) && ((this.f == ((com.google.android.gms.location.internal.LocationRequestInternal) p4).f) && (a.e(this.g, ((com.google.android.gms.location.internal.LocationRequestInternal) p4).g))))))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public int hashCode()
	    {
	        return this.c.hashCode();
	    }
	
	
	    public String toString()
	    {
	        String v0_1 = new StringBuilder();
	        v0_1.append(this.c.toString());
	        v0_1.append(" requestNlpDebugInfo=");
	        v0_1.append(this.d);
	        v0_1.append(" restorePendingIntentListeners=");
	        v0_1.append(this.e);
	        v0_1.append(" triggerUpdate=");
	        v0_1.append(this.f);
	        v0_1.append(" clients=");
	        v0_1.append(this.g);
	        if (this.h != null) {
	            v0_1.append(" tag=");
	            v0_1.append(this.h);
	        }
	        return v0_1.toString();
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        coe.a(this, p1, p2);
	        return;
	    }
	
