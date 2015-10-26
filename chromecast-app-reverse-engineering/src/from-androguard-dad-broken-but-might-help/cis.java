	private android.os.IBinder a
	
	    cis(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final String a()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	            this.a.transact(1, v1, v2, 0);
	            v2.readException();
	            Throwable v0_2 = v2.readString();
	            v2.recycle();
	            v1.recycle();
	            return v0_2;
	        } catch (Throwable v0_3) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_3;
	        }
	    }
	
	
	    public final String a(String p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	            v1.writeString(p6);
	            this.a.transact(3, v1, v2, 0);
	            v2.readException();
	            Throwable v0_2 = v2.readString();
	            v2.recycle();
	            v1.recycle();
	            return v0_2;
	        } catch (Throwable v0_3) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_3;
	        }
	    }
	
	
	    public final void a(String p6, boolean p7)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	            v1.writeString(p6);
	        } catch (android.os.IBinder v0_1) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_1;
	        }
	        if (p7) {
	            v0_0 = 1;
	        }
	        v1.writeInt(v0_0);
	        this.a.transact(4, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final boolean a(boolean p8)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        android.os.Parcel v4 = android.os.Parcel.obtain();
	        try {
	            int v2_1;
	            v3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	        } catch (int v0_1) {
	            v4.recycle();
	            v3.recycle();
	            throw v0_1;
	        }
	        if (!p8) {
	            v2_1 = 0;
	        } else {
	            v2_1 = 1;
	        }
	        v3.writeInt(v2_1);
	        this.a.transact(2, v3, v4, 0);
	        v4.readException();
	        if (v4.readInt() == 0) {
	            v0_0 = 0;
	        }
	        v4.recycle();
	        v3.recycle();
	        return v0_0;
	    }
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
