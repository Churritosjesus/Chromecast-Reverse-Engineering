	
	    cg()
	    {
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p3)
	    {
	        cf v0_3;
	        if (android.os.Build$VERSION.SDK_INT >= 21) {
	            v0_3 = cf.a(android.media.MediaDescription.CREATOR.createFromParcel(p3));
	        } else {
	            v0_3 = new cf(p3);
	        }
	        return v0_3;
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        cf[] v0 = new cf[p2];
	        return v0;
	    }
	
