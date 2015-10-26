	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public  b
	public  c
	
	    static ThemeSettings()
	    {
	        com.google.android.gms.feedback.ThemeSettings.CREATOR = new cik();
	        return;
	    }
	
	
	    public ThemeSettings()
	    {
	        this(1, 0, 0);
	        return;
	    }
	
	
	    public ThemeSettings(int p1, int p2, int p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cik.a(this, p1);
	        return;
	    }
	
