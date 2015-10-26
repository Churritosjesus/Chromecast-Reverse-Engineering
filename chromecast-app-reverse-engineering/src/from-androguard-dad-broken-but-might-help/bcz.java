	public static final android.os.Parcelable$Creator CREATOR
	public java.lang.String a
	private java.lang.String b
	
	    static bcz()
	    {
	        bcz.CREATOR = new bda();
	        return;
	    }
	
	
	    public bcz(android.os.Parcel p3)
	    {
	        this.a = ((String) p3.readValue(0));
	        this.b = ((String) p3.readValue(0));
	        return;
	    }
	
	
	    public bcz(String p1, String p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p3)
	    {
	        boolean v0_2;
	        if ((p3 instanceof bcz)) {
	            v0_2 = this.a.equals(((bcz) p3).a);
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final int hashCode()
	    {
	        return this.a.hashCode();
	    }
	
	
	    public final String toString()
	    {
	        return blx.a(this.b);
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeValue(this.a);
	        p2.writeValue(this.b);
	        return;
	    }
	
