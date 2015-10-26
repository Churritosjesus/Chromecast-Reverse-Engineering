	public static final android.os.Parcelable$Creator CREATOR
	private  a
	private  b
	private android.net.Uri c
	
	    static ayo()
	    {
	        ayo.CREATOR = new ayp();
	        return;
	    }
	
	
	    public ayo(int p1, int p2, android.net.Uri p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public ayo(android.os.Parcel p2)
	    {
	        this.a = p2.readInt();
	        this.b = p2.readInt();
	        android.net.Uri v0_4 = ((String) p2.readValue(0));
	        if (v0_4 != null) {
	            this.c = android.net.Uri.parse(v0_4);
	        }
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        int v0_3;
	        p2.writeInt(this.a);
	        p2.writeInt(this.b);
	        if (this.c == null) {
	            v0_3 = 0;
	        } else {
	            v0_3 = this.c.toString();
	        }
	        p2.writeValue(v0_3);
	        return;
	    }
	
