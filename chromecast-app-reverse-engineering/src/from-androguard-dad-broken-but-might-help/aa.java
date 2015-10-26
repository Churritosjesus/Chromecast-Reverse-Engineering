	public static final android.os.Parcelable$Creator CREATOR
	 Lad a
	 I b
	 Lg c
	
	    static aa()
	    {
	        aa.CREATOR = new ab();
	        return;
	    }
	
	
	    public aa()
	    {
	        return;
	    }
	
	
	    public aa(android.os.Parcel p2)
	    {
	        this.a = ((ad[]) p2.createTypedArray(ad.CREATOR));
	        this.b = p2.createIntArray();
	        this.c = ((g[]) p2.createTypedArray(g.CREATOR));
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeTypedArray(this.a, p3);
	        p2.writeIntArray(this.b);
	        p2.writeTypedArray(this.c, p3);
	        return;
	    }
	
