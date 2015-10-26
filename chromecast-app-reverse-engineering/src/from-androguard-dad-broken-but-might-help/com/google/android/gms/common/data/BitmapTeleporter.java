	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public android.os.ParcelFileDescriptor b
	public final  c
	public java.io.File d
	private android.graphics.Bitmap e
	
	    static BitmapTeleporter()
	    {
	        com.google.android.gms.common.data.BitmapTeleporter.CREATOR = new bxy();
	        return;
	    }
	
	
	    public BitmapTeleporter(int p2, android.os.ParcelFileDescriptor p3, int p4)
	    {
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.e = 0;
	        return;
	    }
	
	
	    public BitmapTeleporter(android.graphics.Bitmap p2)
	    {
	        this.a = 1;
	        this.b = 0;
	        this.c = 0;
	        this.e = p2;
	        return;
	    }
	
	
	    private java.io.FileOutputStream a()
	    {
	        if (this.d != null) {
	            try {
	                IllegalStateException v0_2 = java.io.File.createTempFile("teleporter", ".tmp", this.d);
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
	            android.util.Log.w("BitmapTeleporter", "Could not close stream", v0);
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
	            java.io.IOException v0_1 = this.e;
	            IllegalStateException v1_2 = java.nio.ByteBuffer.allocate((v0_1.getRowBytes() * v0_1.getHeight()));
	            v0_1.copyPixelsToBuffer(v1_2);
	            IllegalStateException v1_3 = v1_2.array();
	            java.io.DataOutputStream v3_1 = new java.io.DataOutputStream(this.a());
	            try {
	                v3_1.writeInt(v1_3.length);
	                v3_1.writeInt(v0_1.getWidth());
	                v3_1.writeInt(v0_1.getHeight());
	                v3_1.writeUTF(v0_1.getConfig().toString());
	                v3_1.write(v1_3);
	                com.google.android.gms.common.data.BitmapTeleporter.a(v3_1);
	            } catch (java.io.IOException v0_5) {
	                com.google.android.gms.common.data.BitmapTeleporter.a(v3_1);
	                throw v0_5;
	            } catch (java.io.IOException v0_4) {
	                throw new IllegalStateException("Could not write into unlinked file", v0_4);
	            }
	        }
	        bxy.a(this, p5, (p6 | 1));
	        this.b = 0;
	        return;
	    }
	
