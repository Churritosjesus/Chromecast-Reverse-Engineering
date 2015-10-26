	public static final android.os.Parcelable$Creator CREATOR
	final java.lang.String a
	final android.os.Parcelable b
	
	    static agi()
	    {
	        agi.CREATOR = new agj();
	        return;
	    }
	
	
	    agi(android.os.Parcel p2)
	    {
	        this.a = p2.readString();
	        this.b = p2.readParcelable(afv.f().getClassLoader());
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 1;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeString(this.a);
	        p2.writeParcelable(this.b, p3);
	        return;
	    }
	
