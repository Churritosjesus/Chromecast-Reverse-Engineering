	public static final android.os.Parcelable$Creator CREATOR
	public java.lang.String a
	public java.lang.String b
	 java.lang.String c
	 java.lang.String d
	 android.net.Uri e
	 java.util.ArrayList f
	
	    static aym()
	    {
	        aym.CREATOR = new ayn();
	        return;
	    }
	
	
	    public aym(android.os.Parcel p3)
	    {
	        this.a = ((String) p3.readValue(0));
	        java.util.ArrayList v0_3 = ((String) p3.readValue(0));
	        if (v0_3 != null) {
	            this.b = v0_3;
	        }
	        this.c = ((String) p3.readValue(0));
	        this.d = ((String) p3.readValue(0));
	        this.e = ((android.net.Uri) android.net.Uri.CREATOR.createFromParcel(p3));
	        this.f = new java.util.ArrayList(1);
	        p3.readList(this.f, aym.getClassLoader());
	        return;
	    }
	
	
	    public aym(String p3)
	    {
	        this.b = p3;
	        this.f = new java.util.ArrayList(0);
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p4)
	    {
	        String v0_0 = 1;
	        if (p4 != this) {
	            if ((p4 instanceof aym)) {
	                if (this.a != null) {
	                    v0_0 = this.a.equals(((aym) p4).a);
	                } else {
	                    if (((aym) p4).a != null) {
	                        v0_0 = 0;
	                    }
	                }
	            } else {
	                v0_0 = 0;
	            }
	        }
	        return v0_0;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_2;
	        if (this.a != null) {
	            v0_2 = this.a.hashCode();
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public String toString()
	    {
	        String v0_0 = this.c;
	        String v1_0 = this.a;
	        return new StringBuilder(((String.valueOf(v0_0).length() + 3) + String.valueOf(v1_0).length())).append(v0_0).append(" (").append(v1_0).append(")").toString();
	    }
	
	
	    public void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeValue(this.a);
	        p2.writeValue(this.b);
	        p2.writeValue(this.c);
	        p2.writeValue(this.d);
	        android.net.Uri.writeToParcel(p2, this.e);
	        p2.writeList(this.f);
	        return;
	    }
	
