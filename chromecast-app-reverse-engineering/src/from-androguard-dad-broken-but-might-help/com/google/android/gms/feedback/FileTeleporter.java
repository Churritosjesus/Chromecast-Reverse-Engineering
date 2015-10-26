	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public android.os.ParcelFileDescriptor b
	public final java.lang.String c
	public final java.lang.String d
	public java.io.File e
	
	    static FileTeleporter()
	    {
	        com.google.android.gms.feedback.FileTeleporter.CREATOR = new cii();
	        return;
	    }
	
	
	    public FileTeleporter(int p1, android.os.ParcelFileDescriptor p2, String p3, String p4)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        return;
	    }
	
	
	    private java.io.FileOutputStream a()
	    {
	        if (this.e != null) {
	            try {
	                IllegalStateException v0_2 = java.io.File.createTempFile("teleporter", ".tmp", this.e);
	            } catch (IllegalStateException v0_3) {
	                throw new IllegalStateException("Could not create temporary file", v0_3);
	            }
	            try {
	                String v1_4 = new java.io.FileOutputStream(v0_2);
	                this.b = android.os.ParcelFileDescriptor.open(v0_2, 268435456);
	                v0_2.delete();
	                return v1_4;
	            } catch (IllegalStateException v0) {
	                throw new IllegalStateException("Temporary file is somehow already deleted");
	            }
	        } else {
	            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
	        }
	    }
	
	
	    private static void a(java.io.Closeable p3)
	    {
	        try {
	            p3.close();
	        } catch (java.io.IOException v0) {
	            android.util.Log.w("FileTeleporter", "Could not close stream", v0);
	        }
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p5, int p6)
	    {
	        if (this.b == null) {
	            java.io.DataOutputStream v1_1 = new java.io.DataOutputStream(this.a());
	            try {
	                v1_1.writeInt(0.length);
	                v1_1.writeUTF(this.c);
	                v1_1.writeUTF(this.d);
	                v1_1.write(0);
	                com.google.android.gms.feedback.FileTeleporter.a(v1_1);
	            } catch (java.io.IOException v0_7) {
	                throw new IllegalStateException("Could not write into unlinked file", v0_7);
	            } catch (java.io.IOException v0_8) {
	                com.google.android.gms.feedback.FileTeleporter.a(v1_1);
	                throw v0_8;
	            }
	        }
	        cii.a(this, p5, p6);
	        return;
	    }
	
