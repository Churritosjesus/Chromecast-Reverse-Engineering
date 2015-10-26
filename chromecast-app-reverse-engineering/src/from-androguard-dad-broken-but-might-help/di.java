	public static final android.os.Parcelable$Creator CREATOR
	private final cf a
	private final  b
	
	    static di()
	    {
	        di.CREATOR = new dj();
	        return;
	    }
	
	
	    di(android.os.Parcel p3)
	    {
	        this.a = ((cf) cf.CREATOR.createFromParcel(p3));
	        this.b = p3.readLong();
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("MediaSession.QueueItem {Description=").append(this.a).append(", Id=").append(this.b).append(" }").toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p3, int p4)
	    {
	        this.a.writeToParcel(p3, p4);
	        p3.writeLong(this.b);
	        return;
	    }
	
