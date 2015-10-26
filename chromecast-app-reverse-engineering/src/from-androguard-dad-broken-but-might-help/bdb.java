	public static final android.os.Parcelable$Creator CREATOR
	public java.lang.String a
	public java.lang.String b
	public  c
	private java.lang.String d
	
	    static bdb()
	    {
	        bdb.CREATOR = new bdc();
	        return;
	    }
	
	
	    public bdb(android.os.Parcel p3)
	    {
	        this.a = ((String) p3.readValue(0));
	        this.b = ((String) p3.readValue(0));
	        this.c = p3.readInt();
	        return;
	    }
	
	
	    public bdb(String p1, String p2, int p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final synthetic int compareTo(Object p3)
	    {
	        int v0_1 = (this.c - ((bdb) p3).c);
	        if (v0_1 == 0) {
	            v0_1 = this.b.compareTo(((bdb) p3).b);
	        }
	        return v0_1;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p3)
	    {
	        boolean v0_2;
	        if ((p3 instanceof bdb)) {
	            v0_2 = this.a.equals(((bdb) p3).a);
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final int hashCode()
	    {
	        return this.a.hashCode();
	    }
	
	
	    public final String toString()
	    {
	        if (this.d == null) {
	            Object[] v1_1 = new Object[3];
	            v1_1[0] = this.b;
	            v1_1[1] = Integer.valueOf((this.c / 60));
	            v1_1[2] = Integer.valueOf((Math.abs(this.c) % 60));
	            this.d = String.format("%s GMT%+d:%02d", v1_1);
	        }
	        return this.d;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeValue(this.a);
	        p2.writeValue(this.b);
	        p2.writeInt(this.c);
	        return;
	    }
	
