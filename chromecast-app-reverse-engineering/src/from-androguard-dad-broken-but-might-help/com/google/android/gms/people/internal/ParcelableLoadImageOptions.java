	public static final cry CREATOR
	public final  a
	public final  b
	public final  c
	public final  d
	
	    static ParcelableLoadImageOptions()
	    {
	        com.google.android.gms.people.internal.ParcelableLoadImageOptions.CREATOR = new cry();
	        return;
	    }
	
	
	    public ParcelableLoadImageOptions(int p1, int p2, int p3, boolean p4)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public String toString()
	    {
	        return a.b(this).a("imageSize", Integer.valueOf(this.b)).a("avatarOptions", Integer.valueOf(this.c)).a("useLargePictureForCp2Images", Boolean.valueOf(this.d)).toString();
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cry.a(this, p1);
	        return;
	    }
	
