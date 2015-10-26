	private android.os.IBinder a
	
	    ckb(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
	            v1.writeInt(p6);
	            this.a.transact(1, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
