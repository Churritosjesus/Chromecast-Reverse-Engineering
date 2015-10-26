	public static final android.os.Parcelable$Creator CREATOR
	private android.os.ResultReceiver a
	
	    static dk()
	    {
	        dk.CREATOR = new dl();
	        return;
	    }
	
	
	    dk(android.os.Parcel p2)
	    {
	        this.a = ((android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(p2));
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        this.a.writeToParcel(p2, p3);
	        return;
	    }
	
