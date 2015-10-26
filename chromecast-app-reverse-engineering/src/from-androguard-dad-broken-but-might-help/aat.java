	public static final android.os.Parcelable$Creator CREATOR
	public  a
	public  b
	
	    static aat()
	    {
	        aat.CREATOR = new aau();
	        return;
	    }
	
	
	    public aat(android.os.Parcel p2)
	    {
	        int v0_2;
	        this(p2);
	        this.a = p2.readInt();
	        if (p2.readInt() == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        this.b = v0_2;
	        return;
	    }
	
	
	    public aat(android.os.Parcelable p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        int v0_2;
	        super.writeToParcel(p2, p3);
	        p2.writeInt(this.a);
	        if (!this.b) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        p2.writeInt(v0_2);
	        return;
	    }
	
