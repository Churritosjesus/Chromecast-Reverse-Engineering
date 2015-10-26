	public static final android.os.Parcelable$Creator CREATOR
	final akg a
	 java.util.Set b
	final ajy c
	public final java.lang.String d
	final java.lang.String e
	public  f
	
	    static akl()
	    {
	        akl.CREATOR = new akm();
	        return;
	    }
	
	
	    public akl(akg p2, java.util.Set p3, ajy p4, String p5, String p6)
	    {
	        this.f = 0;
	        this.a = p2;
	        if (p3 == null) {
	            p3 = new java.util.HashSet();
	        }
	        this.b = p3;
	        this.c = p4;
	        this.d = p5;
	        this.e = p6;
	        return;
	    }
	
	
	    akl(android.os.Parcel p5)
	    {
	        int v0_1;
	        ajy v1 = 0;
	        this.f = 0;
	        int v0_0 = p5.readString();
	        if (v0_0 == 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = akg.valueOf(v0_0);
	        }
	        this.a = v0_1;
	        int v0_3 = new java.util.ArrayList();
	        p5.readStringList(v0_3);
	        this.b = new java.util.HashSet(v0_3);
	        int v0_4 = p5.readString();
	        if (v0_4 != 0) {
	            v1 = ajy.valueOf(v0_4);
	        }
	        int v0_8;
	        this.c = v1;
	        this.d = p5.readString();
	        this.e = p5.readString();
	        if (p5.readByte() == 0) {
	            v0_8 = 0;
	        } else {
	            v0_8 = 1;
	        }
	        this.f = v0_8;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p4, int p5)
	    {
	        byte v0_1;
	        String v1 = 0;
	        if (this.a == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.a.name();
	        }
	        p4.writeString(v0_1);
	        p4.writeStringList(new java.util.ArrayList(this.b));
	        if (this.c != null) {
	            v1 = this.c.name();
	        }
	        byte v0_10;
	        p4.writeString(v1);
	        p4.writeString(this.d);
	        p4.writeString(this.e);
	        if (!this.f) {
	            v0_10 = 0;
	        } else {
	            v0_10 = 1;
	        }
	        p4.writeByte(((byte) v0_10));
	        return;
	    }
	
