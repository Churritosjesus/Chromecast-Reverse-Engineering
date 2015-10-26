	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public java.lang.String b
	
	    static ApplicationStatus()
	    {
	        com.google.android.gms.cast.internal.ApplicationStatus.CREATOR = new btz();
	        return;
	    }
	
	
	    public ApplicationStatus()
	    {
	        this(1, 0);
	        return;
	    }
	
	
	    public ApplicationStatus(int p1, String p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p3)
	    {
	        boolean v0_2;
	        if (p3 != this) {
	            if ((p3 instanceof com.google.android.gms.cast.internal.ApplicationStatus)) {
	                v0_2 = a.d(this.b, ((com.google.android.gms.cast.internal.ApplicationStatus) p3).b);
	            } else {
	                v0_2 = 0;
	            }
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_1 = new Object[1];
	        v0_1[0] = this.b;
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        btz.a(this, p1);
	        return;
	    }
	
