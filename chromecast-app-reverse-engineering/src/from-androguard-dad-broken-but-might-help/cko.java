	private android.os.IBinder a
	
	    cko(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.api.Status p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
	        } catch (android.os.IBinder v0_4) {
	            v1.recycle();
	            throw v0_4;
	        }
	        if (p6 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p6.writeToParcel(v1, 0);
	        }
	        this.a.transact(1, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
