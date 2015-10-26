	public static final cnq CREATOR
	public final  a
	public final  b
	public final java.lang.String c
	
	    static ClientIdentity()
	    {
	        com.google.android.gms.location.internal.ClientIdentity.CREATOR = new cnq();
	        return;
	    }
	
	
	    public ClientIdentity(int p1, int p2, String p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p4)
	    {
	        int v0 = 0;
	        if (((p4 instanceof com.google.android.gms.location.internal.ClientIdentity)) && ((((com.google.android.gms.location.internal.ClientIdentity) p4).b == this.b) && (a.e(((com.google.android.gms.location.internal.ClientIdentity) p4).c, this.c)))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public int hashCode()
	    {
	        return this.b;
	    }
	
	
	    public String toString()
	    {
	        Object[] v1_1 = new Object[2];
	        v1_1[0] = Integer.valueOf(this.b);
	        v1_1[1] = this.c;
	        return String.format("%d:%s", v1_1);
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cnq.a(this, p1);
	        return;
	    }
	
