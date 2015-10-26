	private android.os.IBinder a
	
	    cp(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	            this.a.transact(2, v1, 0, 1);
	            v1.recycle();
	            return;
	        } catch (Throwable v0_2) {
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final void a(android.os.Bundle p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
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
	        this.a.transact(7, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(ci p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
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
	        this.a.transact(4, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(do p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
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
	        this.a.transact(8, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(dq p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
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
	        this.a.transact(3, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(CharSequence p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	        } catch (android.os.IBinder v0_4) {
	            v1.recycle();
	            throw v0_4;
	        }
	        if (p6 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            android.text.TextUtils.writeToParcel(p6, v1, 0);
	        }
	        this.a.transact(6, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(String p6, android.os.Bundle p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
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
	        this.a.transact(1, v1, 0, 1);
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(java.util.List p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	            v1.writeTypedList(p6);
	            this.a.transact(5, v1, 0, 1);
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
	
