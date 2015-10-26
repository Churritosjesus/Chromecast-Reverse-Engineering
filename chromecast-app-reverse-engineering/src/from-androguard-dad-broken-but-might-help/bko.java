	public static final android.os.Parcelable$Creator CREATOR
	final java.lang.String a
	 java.lang.String b
	 java.lang.String c
	private final java.lang.String d
	
	    static bko()
	    {
	        bko.CREATOR = new bkp();
	        return;
	    }
	
	
	    public bko(android.os.Parcel p3)
	    {
	        this.d = ((String) p3.readValue(0));
	        this.a = ((String) p3.readValue(0));
	        this.b = ((String) p3.readValue(0));
	        this.c = ((String) p3.readValue(0));
	        return;
	    }
	
	
	    public bko(aow p2)
	    {
	        this.d = p2.g();
	        this.a = p2.c.c;
	        this.b = p2.n();
	        this.c = p2.c.F;
	        return;
	    }
	
	
	    public bko(com.google.android.gms.cast.CastDevice p2)
	    {
	        this.d = p2.e;
	        this.a = p2.g;
	        this.b = p2.d.getHostAddress();
	        return;
	    }
	
	
	    public bko(String p1, String p2, String p3, String p4)
	    {
	        this.d = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeValue(this.d);
	        p2.writeValue(this.a);
	        p2.writeValue(this.b);
	        p2.writeValue(this.c);
	        return;
	    }
	
