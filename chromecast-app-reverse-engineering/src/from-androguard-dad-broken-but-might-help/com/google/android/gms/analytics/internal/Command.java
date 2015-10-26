	public static final android.os.Parcelable$Creator CREATOR
	public java.lang.String a
	public java.lang.String b
	private java.lang.String c
	
	    static Command()
	    {
	        com.google.android.gms.analytics.internal.Command.CREATOR = new bqc();
	        return;
	    }
	
	
	    public Command()
	    {
	        return;
	    }
	
	
	    public Command(android.os.Parcel p2)
	    {
	        this.a = p2.readString();
	        this.c = p2.readString();
	        this.b = p2.readString();
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeString(this.a);
	        p2.writeString(this.c);
	        p2.writeString(this.b);
	        return;
	    }
	
