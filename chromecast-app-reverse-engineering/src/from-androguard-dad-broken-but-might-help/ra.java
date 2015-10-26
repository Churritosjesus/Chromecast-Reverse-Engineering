	public static final android.os.Parcelable$Creator CREATOR
	  a
	  b
	
	    static ra()
	    {
	        ra.CREATOR = new rb();
	        return;
	    }
	
	
	    ra(android.os.Parcel p3)
	    {
	        this(p3);
	        this.a = p3.readLong();
	        this.b = p3.readInt();
	        return;
	    }
	
	
	    ra(android.os.Parcelable p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public String toString()
	    {
	        return new StringBuilder("AbsSpinner.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(this.a).append(" position=").append(this.b).append("}").toString();
	    }
	
	
	    public void writeToParcel(android.os.Parcel p3, int p4)
	    {
	        super.writeToParcel(p3, p4);
	        p3.writeLong(this.a);
	        p3.writeInt(this.b);
	        return;
	    }
	
