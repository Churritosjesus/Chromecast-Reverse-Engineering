	public static final android.os.Parcelable$Creator CREATOR
	public  a
	public android.os.Parcelable b
	public java.lang.ClassLoader c
	
	    static hz()
	    {
	        du v0_2;
	        ia v1_1 = new ia();
	        if (android.os.Build$VERSION.SDK_INT < 13) {
	            v0_2 = new du(v1_1);
	        } else {
	            v0_2 = new dw(v1_1);
	        }
	        hz.CREATOR = v0_2;
	        return;
	    }
	
	
	    hz(android.os.Parcel p2, ClassLoader p3)
	    {
	        this(p2);
	        if (p3 == null) {
	            p3 = this.getClass().getClassLoader();
	        }
	        this.a = p2.readInt();
	        this.b = p2.readParcelable(p3);
	        this.c = p3;
	        return;
	    }
	
	
	    public hz(android.os.Parcelable p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("FragmentPager.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(this.a).append("}").toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        super.writeToParcel(p2, p3);
	        p2.writeInt(this.a);
	        p2.writeParcelable(this.b, p3);
	        return;
	    }
	
