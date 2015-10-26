	private android.os.IBinder a
	
	    buq(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            this.a.transact(1, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void a(double p6, double p8, boolean p10)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            v1.writeDouble(p6);
	            v1.writeDouble(p8);
	        } catch (int v0_1) {
	            v1.recycle();
	            throw v0_1;
	        }
	        if (!p10) {
	            v0_0 = 0;
	        }
	        v1.writeInt(v0_0);
	        this.a.transact(7, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(String p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            v1.writeString(p6);
	            this.a.transact(5, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void a(String p6, com.google.android.gms.cast.LaunchOptions p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            v1.writeString(p6);
	        } catch (android.os.IBinder v0_4) {
	            v1.recycle();
	            throw v0_4;
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        this.a.transact(13, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(String p6, String p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            v1.writeString(p6);
	            v1.writeString(p7);
	            this.a.transact(3, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void a(String p6, String p7, long p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            v1.writeString(p6);
	            v1.writeString(p7);
	            v1.writeLong(p8);
	            this.a.transact(9, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void a(String p6, boolean p7)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            v1.writeString(p6);
	        } catch (int v0_1) {
	            v1.recycle();
	            throw v0_1;
	        }
	        if (!p7) {
	            v0_0 = 0;
	        }
	        v1.writeInt(v0_0);
	        this.a.transact(2, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(String p6, byte[] p7, long p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            v1.writeString(p6);
	            v1.writeByteArray(p7);
	            v1.writeLong(p8);
	            this.a.transact(10, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void a(boolean p7, double p8, boolean p10)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v2_1;
	            v3.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	        } catch (int v0_1) {
	            v3.recycle();
	            throw v0_1;
	        }
	        if (!p7) {
	            v2_1 = 0;
	        } else {
	            v2_1 = 1;
	        }
	        v3.writeInt(v2_1);
	        v3.writeDouble(p8);
	        if (!p10) {
	            v0_0 = 0;
	        }
	        v3.writeInt(v0_0);
	        this.a.transact(8, v3, 0, 1);
	        v3.recycle();
	        return;
	    }
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
	
	    public final void b()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            this.a.transact(4, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void b(String p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            v1.writeString(p6);
	            this.a.transact(11, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void c()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            this.a.transact(6, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void c(String p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
	            v1.writeString(p6);
	            this.a.transact(12, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
