	private android.os.IBinder a
	
	    bzk(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p6, android.os.Bundle p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
	            v1.writeInt(p6);
	        } catch (android.os.IBinder v0_4) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_4;
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        this.a.transact(2, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(int p6, android.os.IBinder p7, android.os.Bundle p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
	            v1.writeInt(p6);
	            v1.writeStrongBinder(p7);
	        } catch (android.os.IBinder v0_4) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_4;
	        }
	        if (p8 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p8.writeToParcel(v1, 0);
	        }
	        this.a.transact(1, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
