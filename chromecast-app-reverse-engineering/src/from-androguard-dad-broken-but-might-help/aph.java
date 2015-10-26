	public static final android.os.Parcelable$Creator CREATOR
	  a
	 java.lang.String b
	 java.lang.Integer c
	 java.lang.String d
	private final java.util.Random e
	private java.lang.String f
	
	    static aph()
	    {
	        aph.CREATOR = new api();
	        return;
	    }
	
	
	    public aph()
	    {
	        this.e = new java.util.Random();
	        this.a = this.e.nextInt();
	        return;
	    }
	
	
	    aph(android.os.Parcel p2)
	    {
	        this.e = new java.util.Random();
	        this.a = p2.readInt();
	        this.b = p2.readString();
	        this.c = ((Integer) p2.readValue(0));
	        this.d = p2.readString();
	        this.f = p2.readString();
	        return;
	    }
	
	
	    public final aph a(bdf p3, boolean p4)
	    {
	        String v0_0 = p3.c;
	        if ((v0_0 != null) && (!v0_0.isEmpty())) {
	            this.b = v0_0;
	        }
	        if (p4) {
	            this.c = Integer.valueOf(3);
	        } else {
	            if (!p3.w) {
	                this.c = Integer.valueOf(1);
	            } else {
	                this.c = Integer.valueOf(2);
	            }
	        }
	        this.d = p3.F;
	        String v0_9 = p3.o;
	        if ((v0_9 != null) && (!v0_9.isEmpty())) {
	            this.f = v0_9;
	        }
	        return this;
	    }
	
	
	    public final Long a()
	    {
	        Long v0 = 0;
	        if (this.f != null) {
	            try {
	                java.security.NoSuchAlgorithmException v1_2 = java.security.MessageDigest.getInstance("MD5");
	                v1_2.update(this.f.getBytes());
	                v0 = Long.valueOf(java.nio.ByteBuffer.wrap(v1_2.digest(), 0, 8).getLong());
	            } catch (java.security.NoSuchAlgorithmException v1) {
	            }
	        }
	        return v0;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeInt(this.a);
	        p2.writeString(this.b);
	        p2.writeValue(this.c);
	        p2.writeString(this.d);
	        p2.writeString(this.f);
	        return;
	    }
	
