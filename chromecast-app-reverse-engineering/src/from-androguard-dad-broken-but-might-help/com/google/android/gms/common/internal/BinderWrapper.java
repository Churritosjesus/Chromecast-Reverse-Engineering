	public static final android.os.Parcelable$Creator CREATOR
	private android.os.IBinder a
	
	    static BinderWrapper()
	    {
	        com.google.android.gms.common.internal.BinderWrapper.CREATOR = new byd();
	        return;
	    }
	
	
	    public BinderWrapper()
	    {
	        this.a = 0;
	        return;
	    }
	
	
	    public BinderWrapper(android.os.IBinder p2)
	    {
	        this.a = 0;
	        this.a = p2;
	        return;
	    }
	
	
	    public BinderWrapper(android.os.Parcel p2)
	    {
	        this.a = 0;
	        this.a = p2.readStrongBinder();
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeStrongBinder(this.a);
	        return;
	    }
	
