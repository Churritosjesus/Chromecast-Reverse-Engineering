	private android.os.IBinder a
	
	    ahy(android.os.IBinder p1)
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
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
	
	    public final boolean b()
	    {
	        int v0_0 = 1;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            v2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	            v2.writeInt(1);
	            this.a.transact(2, v2, v3, 0);
	            v3.readException();
	        } catch (int v0_1) {
	            v3.recycle();
	            v2.recycle();
	            throw v0_1;
	        }
	        if (v3.readInt() == 0) {
	            v0_0 = 0;
	        }
	        v3.recycle();
	        v2.recycle();
	        return v0_0;
	    }
	
