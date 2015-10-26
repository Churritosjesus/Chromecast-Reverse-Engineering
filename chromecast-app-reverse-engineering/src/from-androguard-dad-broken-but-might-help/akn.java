	public static final android.os.Parcelable$Creator CREATOR
	final akp a
	final afb b
	final java.lang.String c
	final java.lang.String d
	public java.util.Map e
	private akl f
	
	    static akn()
	    {
	        akn.CREATOR = new ako();
	        return;
	    }
	
	
	    private akn(akl p2, akp p3, afb p4, String p5, String p6)
	    {
	        ajp.a(p3, "code");
	        this.f = p2;
	        this.b = p4;
	        this.c = p5;
	        this.a = p3;
	        this.d = p6;
	        return;
	    }
	
	
	    akn(android.os.Parcel p2)
	    {
	        this.a = akp.valueOf(p2.readString());
	        this.b = ((afb) p2.readParcelable(afb.getClassLoader()));
	        this.c = p2.readString();
	        this.d = p2.readString();
	        this.f = ((akl) p2.readParcelable(akl.getClassLoader()));
	        this.e = aji.a(p2);
	        return;
	    }
	
	
	    static akn a(akl p6, afb p7)
	    {
	        return new akn(p6, akp.a, p7, 0, 0);
	    }
	
	
	    static akn a(akl p6, String p7)
	    {
	        return new akn(p6, akp.b, 0, p7, 0);
	    }
	
	
	    static akn a(akl p1, String p2, String p3)
	    {
	        return akn.a(p1, p2, p3, 0);
	    }
	
	
	    static akn a(akl p6, String p7, String p8, String p9)
	    {
	        akl v1_1 = new String[2];
	        v1_1[0] = p7;
	        v1_1[1] = p8;
	        return new akn(p6, akp.c, 0, android.text.TextUtils.join(": ", aji.b(v1_1)), p9);
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeString(this.a.name());
	        p2.writeParcelable(this.b, p3);
	        p2.writeString(this.c);
	        p2.writeString(this.d);
	        p2.writeParcelable(this.f, p3);
	        aji.a(p2, this.e);
	        return;
	    }
	
