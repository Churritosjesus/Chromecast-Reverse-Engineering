	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final  b
	public final java.util.List c
	
	    static CheckServerAuthResult()
	    {
	        com.google.android.gms.signin.internal.CheckServerAuthResult.CREATOR = new csx();
	        return;
	    }
	
	
	    public CheckServerAuthResult(int p1, boolean p2, java.util.List p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public CheckServerAuthResult(boolean p3, java.util.Set p4)
	    {
	        java.util.List v0_2;
	        if (p4 != null) {
	            v0_2 = java.util.Collections.unmodifiableList(new java.util.ArrayList(p4));
	        } else {
	            v0_2 = java.util.Collections.emptyList();
	        }
	        this(1, p3, v0_2);
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        csx.a(this, p1);
	        return;
	    }
	
