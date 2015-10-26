	public static final android.os.Parcelable$Creator CREATOR
	public  a
	public  b
	public  c
	public  d
	public  e
	
	    static do()
	    {
	        do.CREATOR = new dp();
	        return;
	    }
	
	
	    public do(android.os.Parcel p2)
	    {
	        this.a = p2.readInt();
	        this.c = p2.readInt();
	        this.d = p2.readInt();
	        this.e = p2.readInt();
	        this.b = p2.readInt();
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeInt(this.a);
	        p2.writeInt(this.c);
	        p2.writeInt(this.d);
	        p2.writeInt(this.e);
	        p2.writeInt(this.b);
	        return;
	    }
	
