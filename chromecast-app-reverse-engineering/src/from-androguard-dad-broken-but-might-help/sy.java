	public static final android.os.Parcelable$Creator CREATOR
	  c
	
	    static sy()
	    {
	        sy.CREATOR = new sz();
	        return;
	    }
	
	
	    sy(android.os.Parcel p2)
	    {
	        int v0_1;
	        this(p2);
	        if (p2.readByte() == 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        this.c = v0_1;
	        return;
	    }
	
	
	    sy(android.os.Parcelable p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        byte v0_1;
	        super.writeToParcel(p2, p3);
	        if (!this.c) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        p2.writeByte(((byte) v0_1));
	        return;
	    }
	
