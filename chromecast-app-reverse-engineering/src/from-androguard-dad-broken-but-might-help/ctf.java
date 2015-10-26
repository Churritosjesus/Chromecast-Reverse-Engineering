	private android.os.IBinder a
	
	    ctf(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	            v1.writeInt(p6);
	            this.a.transact(7, v1, v2, 0);
	            v2.readException();
	            v2.recycle();
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void a(int p6, android.accounts.Account p7, cta p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	            v1.writeInt(p6);
	        } catch (android.os.IBinder v0_5) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_5;
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        android.os.IBinder v0_4;
	        if (p8 == null) {
	            v0_4 = 0;
	        } else {
	            v0_4 = p8.asBinder();
	        }
	        v1.writeStrongBinder(v0_4);
	        this.a.transact(8, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(bzf p6, int p7, boolean p8)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	        } catch (android.os.IBinder v0_1) {
	            v3.recycle();
	            v2.recycle();
	            throw v0_1;
	        }
	        if (p6 == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = p6.asBinder();
	        }
	        v2.writeStrongBinder(v1_1);
	        v2.writeInt(p7);
	        if (p8) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        this.a.transact(9, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.internal.AuthAccountRequest p6, cta p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	        } catch (android.os.IBinder v0_5) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_5;
	        }
	        if (p6 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p6.writeToParcel(v1, 0);
	        }
	        android.os.IBinder v0_4;
	        if (p7 == null) {
	            v0_4 = 0;
	        } else {
	            v0_4 = p7.asBinder();
	        }
	        v1.writeStrongBinder(v0_4);
	        this.a.transact(2, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.internal.ResolveAccountRequest p6, bzo p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	        } catch (android.os.IBinder v0_5) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_5;
	        }
	        if (p6 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p6.writeToParcel(v1, 0);
	        }
	        android.os.IBinder v0_4;
	        if (p7 == null) {
	            v0_4 = 0;
	        } else {
	            v0_4 = p7.asBinder();
	        }
	        v1.writeStrongBinder(v0_4);
	        this.a.transact(5, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.signin.internal.CheckServerAuthResult p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	        } catch (android.os.IBinder v0_4) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_4;
	        }
	        if (p6 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p6.writeToParcel(v1, 0);
	        }
	        this.a.transact(3, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(boolean p6)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	        } catch (android.os.IBinder v0_1) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_1;
	        }
	        if (p6) {
	            v0_0 = 1;
	        }
	        v1.writeInt(v0_0);
	        this.a.transact(4, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
