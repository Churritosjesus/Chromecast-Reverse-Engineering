	public static final android.os.Parcelable$Creator CREATOR
	private java.lang.String a
	private java.lang.String b
	private java.lang.String c
	
	    static bcx()
	    {
	        bcx.CREATOR = new bcy();
	        return;
	    }
	
	
	    public bcx(android.os.Parcel p3)
	    {
	        this.a = ((String) p3.readValue(0));
	        this.b = ((String) p3.readValue(0));
	        this.c = ((String) p3.readValue(0));
	        return;
	    }
	
	
	    public bcx(String p1, String p2, String p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final String toString()
	    {
	        return this.b;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeValue(this.a);
	        p2.writeValue(this.b);
	        p2.writeValue(this.c);
	        return;
	    }
	
