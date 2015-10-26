	public static final cng CREATOR
	public final  a
	public  b
	public  c
	public  d
	public  e
	public  f
	public  g
	public  h
	public  i
	
	    static LocationRequest()
	    {
	        com.google.android.gms.location.LocationRequest.CREATOR = new cng();
	        return;
	    }
	
	
	    public LocationRequest()
	    {
	        this.a = 1;
	        this.b = 102;
	        this.c = 3600000;
	        this.d = 600000;
	        this.e = 0;
	        this.f = nan;
	        this.g = 2147483647;
	        this.h = 0;
	        this.i = 0;
	        return;
	    }
	
	
	    public LocationRequest(int p1, int p2, long p3, long p5, boolean p7, long p8, int p10, float p11, long p12)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p5;
	        this.e = p7;
	        this.f = p8;
	        this.g = p10;
	        this.h = p11;
	        this.i = p12;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p7)
	    {
	        int v0 = 1;
	        if (this != p7) {
	            if ((p7 instanceof com.google.android.gms.location.LocationRequest)) {
	                if ((this.b != ((com.google.android.gms.location.LocationRequest) p7).b) || ((this.c != ((com.google.android.gms.location.LocationRequest) p7).c) || ((this.d != ((com.google.android.gms.location.LocationRequest) p7).d) || ((this.e != ((com.google.android.gms.location.LocationRequest) p7).e) || ((this.f != ((com.google.android.gms.location.LocationRequest) p7).f) || ((this.g != ((com.google.android.gms.location.LocationRequest) p7).g) || (this.h != ((com.google.android.gms.location.LocationRequest) p7).h))))))) {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_1 = new Object[7];
	        v0_1[0] = Integer.valueOf(this.b);
	        v0_1[1] = Long.valueOf(this.c);
	        v0_1[2] = Long.valueOf(this.d);
	        v0_1[3] = Boolean.valueOf(this.e);
	        v0_1[4] = Long.valueOf(this.f);
	        v0_1[5] = Integer.valueOf(this.g);
	        v0_1[6] = Float.valueOf(this.h);
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public final String toString()
	    {
	        String v0_2;
	        StringBuilder v1_1 = new StringBuilder();
	        int v2_0 = v1_1.append("Request[");
	        switch (this.b) {
	            case 100:
	                v0_2 = "PRIORITY_HIGH_ACCURACY";
	                break;
	            case 101:
	            case 103:
	            default:
	                v0_2 = "???";
	                break;
	            case 102:
	                v0_2 = "PRIORITY_BALANCED_POWER_ACCURACY";
	                break;
	            case 104:
	                v0_2 = "PRIORITY_LOW_POWER";
	                break;
	            case 105:
	                v0_2 = "PRIORITY_NO_POWER";
	                break;
	        }
	        v2_0.append(v0_2);
	        if (this.b != 105) {
	            v1_1.append(" requested=");
	            v1_1.append(new StringBuilder().append(this.c).append("ms").toString());
	        }
	        v1_1.append(" fastest=");
	        v1_1.append(new StringBuilder().append(this.d).append("ms").toString());
	        if (this.i > this.c) {
	            v1_1.append(" maxWait=");
	            v1_1.append(new StringBuilder().append(this.i).append("ms").toString());
	        }
	        if (this.f != nan) {
	            int v2_11 = (this.f - android.os.SystemClock.elapsedRealtime());
	            v1_1.append(" expireIn=");
	            v1_1.append(new StringBuilder().append(v2_11).append("ms").toString());
	        }
	        if (this.g != 2147483647) {
	            v1_1.append(" num=").append(this.g);
	        }
	        v1_1.append(93);
	        return v1_1.toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cng.a(this, p1);
	        return;
	    }
	
