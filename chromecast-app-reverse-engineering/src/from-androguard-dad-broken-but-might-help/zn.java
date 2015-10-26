	public static final android.os.Parcelable$Creator CREATOR
	public android.os.Parcelable a
	
	    static zn()
	    {
	        zn.CREATOR = new zo();
	        return;
	    }
	
	
	    zn(android.os.Parcel p2)
	    {
	        this(p2);
	        this.a = p2.readParcelable(zh.getClassLoader());
	        return;
	    }
	
	
	    public zn(android.os.Parcelable p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public static synthetic void a(zn p1, zn p2)
	    {
	        p1.a = p2.a;
	        return;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p3, int p4)
	    {
	        super.writeToParcel(p3, p4);
	        p3.writeParcelable(this.a, 0);
	        return;
	    }
	
