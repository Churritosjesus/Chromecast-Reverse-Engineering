	public static final android.os.Parcelable$Creator CREATOR
	public java.lang.String a
	public java.lang.String b
	public B c
	
	    static bcv()
	    {
	        bcv.CREATOR = new bcw();
	        return;
	    }
	
	
	    public bcv(android.os.Parcel p3)
	    {
	        this.a = ((String) p3.readValue(0));
	        this.b = ((String) p3.readValue(0));
	        byte[] v0_4 = p3.readInt();
	        if (v0_4 >= null) {
	            byte[] v0_5 = new byte[v0_4];
	            this.c = v0_5;
	            p3.readByteArray(this.c);
	        }
	        return;
	    }
	
	
	    public bcv(String p1, String p2, byte[] p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final String toString()
	    {
	        return this.a;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeValue(this.a);
	        p2.writeValue(this.b);
	        if (this.c == null) {
	            p2.writeInt(-1);
	        } else {
	            p2.writeInt(this.c.length);
	            p2.writeByteArray(this.c);
	        }
	        return;
	    }
	
