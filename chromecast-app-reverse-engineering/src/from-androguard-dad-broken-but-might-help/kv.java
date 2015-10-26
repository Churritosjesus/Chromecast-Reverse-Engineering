	public static final android.os.Parcelable$Creator CREATOR
	public  a
	public  b
	public  c
	
	    static kv()
	    {
	        kv.CREATOR = new kw();
	        return;
	    }
	
	
	    public kv(android.os.Parcel p2)
	    {
	        this(p2);
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.a = p2.readInt();
	        return;
	    }
	
	
	    public kv(android.os.Parcelable p2)
	    {
	        this(p2);
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        return;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        super.writeToParcel(p2, p3);
	        p2.writeInt(this.a);
	        return;
	    }
	
