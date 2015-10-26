	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final java.lang.String b
	
	    static Scope()
	    {
	        com.google.android.gms.common.api.Scope.CREATOR = new bxm();
	        return;
	    }
	
	
	    public Scope(int p2, String p3)
	    {
	        a.a(p3, "scopeUri must not be null or empty");
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p3)
	    {
	        boolean v0_2;
	        if (this != p3) {
	            if ((p3 instanceof com.google.android.gms.common.api.Scope)) {
	                v0_2 = this.b.equals(((com.google.android.gms.common.api.Scope) p3).b);
	            } else {
	                v0_2 = 0;
	            }
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final int hashCode()
	    {
	        return this.b.hashCode();
	    }
	
	
	    public final String toString()
	    {
	        return this.b;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bxm.a(this, p1);
	        return;
	    }
	
