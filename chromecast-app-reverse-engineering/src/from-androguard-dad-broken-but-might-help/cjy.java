	private android.os.IBinder a
	
	    cjy(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	            this.a.transact(2, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void a(cjt p6)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	        } catch (android.os.IBinder v0_1) {
	            v1.recycle();
	            throw v0_1;
	        }
	        if (p6 != null) {
	            v0_0 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_0);
	        this.a.transact(5, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(cjt p6, cjz p7, String p8, android.app.PendingIntent p9)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	        } catch (android.os.IBinder v0_4) {
	            v2.recycle();
	            throw v0_4;
	        }
	        if (p6 == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = p6.asBinder();
	        }
	        v2.writeStrongBinder(v1_1);
	        if (p7 != null) {
	            v0_0 = p7.asBinder();
	        }
	        v2.writeStrongBinder(v0_0);
	        v2.writeString(p8);
	        if (p9 == null) {
	            v2.writeInt(0);
	        } else {
	            v2.writeInt(1);
	            p9.writeToParcel(v2, 0);
	        }
	        this.a.transact(4, v2, 0, 1);
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(cjt p6, boolean p7, String p8, android.view.Surface p9, int p10)
	    {
	        int v2_0 = 0;
	        android.os.IBinder v0_0 = 1;
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            v3.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	        } catch (android.os.IBinder v0_4) {
	            v3.recycle();
	            throw v0_4;
	        }
	        if (p6 != null) {
	            v2_0 = p6.asBinder();
	        }
	        v3.writeStrongBinder(v2_0);
	        if (!p7) {
	            v0_0 = 0;
	        }
	        v3.writeInt(v0_0);
	        v3.writeString(p8);
	        if (p9 == null) {
	            v3.writeInt(0);
	        } else {
	            v3.writeInt(1);
	            p9.writeToParcel(v3, 0);
	        }
	        v3.writeInt(p10);
	        this.a.transact(1, v3, 0, 1);
	        v3.recycle();
	        return;
	    }
	
	
	    public final void a(boolean p6, String p7)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	        } catch (int v0_1) {
	            v1.recycle();
	            throw v0_1;
	        }
	        if (!p6) {
	            v0_0 = 0;
	        }
	        v1.writeInt(v0_0);
	        v1.writeString(p7);
	        this.a.transact(7, v1, 0, 1);
	        v1.recycle();
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
	            v1.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	            this.a.transact(3, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void b(cjt p6)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	        } catch (android.os.IBinder v0_1) {
	            v1.recycle();
	            throw v0_1;
	        }
	        if (p6 != null) {
	            v0_0 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_0);
	        this.a.transact(6, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
