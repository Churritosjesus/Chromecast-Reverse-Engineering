	public static final css CREATOR
	public final  a
	public final  b
	public final java.lang.String c
	
	    static AvatarReference()
	    {
	        com.google.android.gms.people.model.AvatarReference.CREATOR = new css();
	        return;
	    }
	
	
	    public AvatarReference(int p2, int p3, String p4)
	    {
	        int v0;
	        if (p3 == 0) {
	            v0 = 0;
	        } else {
	            v0 = 1;
	        }
	        a.a(v0);
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final String toString()
	    {
	        return a.b(this).a("source", Integer.valueOf(this.b)).a("location", this.c).toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        css.a(this, p1);
	        return;
	    }
	
