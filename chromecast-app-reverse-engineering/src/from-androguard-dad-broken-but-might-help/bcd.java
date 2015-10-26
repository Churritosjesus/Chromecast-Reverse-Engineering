	public static final android.os.Parcelable$Creator CREATOR
	public final dbk a
	public final java.lang.String b
	public final  c
	private final java.lang.String d
	
	    static bcd()
	    {
	        bcd.CREATOR = new bce();
	        return;
	    }
	
	
	    public bcd(android.os.Parcel p6)
	    {
	        int v0_1 = new byte[p6.readInt()];
	        p6.readByteArray(v0_1);
	        try {
	            int v0_3 = ((dbk) dew.a(new dbk(), v0_1));
	        } catch (int v0_4) {
	            int v0_6 = String.valueOf(v0_4.toString());
	            if (v0_6.length() == 0) {
	                int v0_8 = new String("Failed to unparcel OfferData: ");
	            } else {
	                v0_8 = "Failed to unparcel OfferData: ".concat(v0_6);
	            }
	            android.util.Log.w("OfferData", v0_8);
	            v0_3 = 0;
	        }
	        this.a = v0_3;
	        this.d = p6.readString();
	        this.b = p6.readString();
	        this.c = p6.readInt();
	        return;
	    }
	
	
	    public bcd(dbk p2, aow p3)
	    {
	        int v0_0;
	        this.a = p2;
	        if (p3 != null) {
	            v0_0 = p3.a;
	        } else {
	            v0_0 = "";
	        }
	        int v0_1;
	        this.d = v0_0;
	        if (p3 != null) {
	            v0_1 = p3.g();
	        } else {
	            v0_1 = "";
	        }
	        int v0_2;
	        this.b = v0_1;
	        if (p3 != null) {
	            v0_2 = p3.h();
	        } else {
	            v0_2 = 0;
	        }
	        this.c = v0_2;
	        return;
	    }
	
	
	    public final String a()
	    {
	        String v0_2 = String.valueOf(this.a.a);
	        String v1 = this.d;
	        return new StringBuilder(((String.valueOf(v0_2).length() + 1) + String.valueOf(v1).length())).append(v0_2).append("-").append(v1).toString();
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p3)
	    {
	        boolean v0_2;
	        if (p3 != this) {
	            if ((p3 instanceof bcd)) {
	                v0_2 = ((bcd) p3).a().equals(this.a());
	            } else {
	                v0_2 = 0;
	            }
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final int hashCode()
	    {
	        return this.a().hashCode();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p3, int p4)
	    {
	        int v0_1 = dbk.a(this.a);
	        p3.writeInt(v0_1.length);
	        p3.writeByteArray(v0_1);
	        p3.writeString(this.d);
	        p3.writeString(this.b);
	        p3.writeInt(this.c);
	        return;
	    }
	
