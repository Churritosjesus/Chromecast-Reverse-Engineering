	public static final android.os.Parcelable$Creator CREATOR
	  a
	  b
	  c
	
	    static ya()
	    {
	        ya.CREATOR = new yb();
	        return;
	    }
	
	
	    public ya()
	    {
	        return;
	    }
	
	
	    ya(android.os.Parcel p3)
	    {
	        int v0 = 1;
	        this.a = p3.readInt();
	        this.b = p3.readInt();
	        if (p3.readInt() != 1) {
	            v0 = 0;
	        }
	        this.c = v0;
	        return;
	    }
	
	
	    public ya(ya p2)
	    {
	        this.a = p2.a;
	        this.b = p2.b;
	        this.c = p2.c;
	        return;
	    }
	
	
	    final boolean a()
	    {
	        int v0_1;
	        if (this.a < 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
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
	        if (!this.c) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        p2.writeInt(v0_3);
	        return;
	    }
	
