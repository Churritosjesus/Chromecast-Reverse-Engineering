	private android.os.IBinder a
	
	    crt(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p6, android.os.Bundle p7, android.os.Bundle p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
	            v1.writeInt(p6);
	        } catch (android.os.IBinder v0_7) {
	            v1.recycle();
	            throw v0_7;
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        if (p8 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p8.writeToParcel(v1, 0);
	        }
	        this.a.transact(1, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(int p6, android.os.Bundle p7, android.os.ParcelFileDescriptor p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
	            v1.writeInt(p6);
	        } catch (android.os.IBinder v0_7) {
	            v1.recycle();
	            throw v0_7;
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        if (p8 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p8.writeToParcel(v1, 0);
	        }
	        this.a.transact(3, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(int p6, android.os.Bundle p7, android.os.ParcelFileDescriptor p8, android.os.Bundle p9)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
	            v1.writeInt(p6);
	        } catch (android.os.IBinder v0_10) {
	            v1.recycle();
	            throw v0_10;
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        if (p8 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p8.writeToParcel(v1, 0);
	        }
	        if (p9 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p9.writeToParcel(v1, 0);
	        }
	        this.a.transact(5, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(int p6, android.os.Bundle p7, com.google.android.gms.common.data.DataHolder p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
	            v1.writeInt(p6);
	        } catch (android.os.IBinder v0_7) {
	            v1.recycle();
	            throw v0_7;
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        if (p8 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p8.writeToParcel(v1, 0);
	        }
	        this.a.transact(2, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(int p6, android.os.Bundle p7, com.google.android.gms.common.data.DataHolder[] p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
	            v1.writeInt(p6);
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
	        v1.writeTypedArray(p8, 0);
	        this.a.transact(4, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
