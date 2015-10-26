	public static final android.os.Parcelable$Creator CREATOR
	final java.lang.Object a
	
	    static dm()
	    {
	        dm.CREATOR = new dn();
	        return;
	    }
	
	
	    dm(Object p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p3, int p4)
	    {
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            p3.writeStrongBinder(((android.os.IBinder) this.a));
	        } else {
	            p3.writeParcelable(((android.os.Parcelable) this.a), p4);
	        }
	        return;
	    }
	
