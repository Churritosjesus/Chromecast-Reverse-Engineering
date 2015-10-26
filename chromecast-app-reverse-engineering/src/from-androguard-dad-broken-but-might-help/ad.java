	public static final android.os.Parcelable$Creator CREATOR
	final java.lang.String a
	final  b
	final  c
	final  d
	final  e
	final java.lang.String f
	final  g
	final  h
	final android.os.Bundle i
	 android.os.Bundle j
	 j k
	
	    static ad()
	    {
	        ad.CREATOR = new ae();
	        return;
	    }
	
	
	    public ad(android.os.Parcel p4)
	    {
	        android.os.Bundle v0_3;
	        int v1 = 1;
	        this.a = p4.readString();
	        this.b = p4.readInt();
	        if (p4.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        android.os.Bundle v0_8;
	        this.c = v0_3;
	        this.d = p4.readInt();
	        this.e = p4.readInt();
	        this.f = p4.readString();
	        if (p4.readInt() == 0) {
	            v0_8 = 0;
	        } else {
	            v0_8 = 1;
	        }
	        this.g = v0_8;
	        if (p4.readInt() == 0) {
	            v1 = 0;
	        }
	        this.h = v1;
	        this.i = p4.readBundle();
	        this.j = p4.readBundle();
	        return;
	    }
	
	
	    public ad(j p2)
	    {
	        this.a = p2.getClass().getName();
	        this.b = p2.k;
	        this.c = p2.t;
	        this.d = p2.B;
	        this.e = p2.C;
	        this.f = p2.D;
	        this.g = p2.G;
	        this.h = p2.F;
	        this.i = p2.m;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p4, int p5)
	    {
	        android.os.Bundle v0_3;
	        int v1 = 1;
	        p4.writeString(this.a);
	        p4.writeInt(this.b);
	        if (!this.c) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        android.os.Bundle v0_8;
	        p4.writeInt(v0_3);
	        p4.writeInt(this.d);
	        p4.writeInt(this.e);
	        p4.writeString(this.f);
	        if (!this.g) {
	            v0_8 = 0;
	        } else {
	            v0_8 = 1;
	        }
	        p4.writeInt(v0_8);
	        if (!this.h) {
	            v1 = 0;
	        }
	        p4.writeInt(v1);
	        p4.writeBundle(this.i);
	        p4.writeBundle(this.j);
	        return;
	    }
	
