	public static final android.os.Parcelable$Creator CREATOR
	public static final com.google.android.gms.location.copresence.internal.CopresenceApiOptions a
	public final  b
	public final  c
	
	    static CopresenceApiOptions()
	    {
	        com.google.android.gms.location.copresence.internal.CopresenceApiOptions.CREATOR = new cnm();
	        com.google.android.gms.location.copresence.internal.CopresenceApiOptions.a = new com.google.android.gms.location.copresence.internal.CopresenceApiOptions(1);
	        return;
	    }
	
	
	    public CopresenceApiOptions(int p1, boolean p2)
	    {
	        this.b = p1;
	        this.c = p2;
	        return;
	    }
	
	
	    private CopresenceApiOptions(boolean p2)
	    {
	        this(1, 1);
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cnm.a(this, p1);
	        return;
	    }
	
