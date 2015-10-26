	private android.os.IBinder a
	
	    cs(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p6, int p7, String p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            v1.writeInt(p6);
	            v1.writeInt(p7);
	            v1.writeString(p8);
	            this.a.transact(11, v1, v2, 0);
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
	
	
	    public final void a(long p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            v1.writeLong(p6);
	            this.a.transact(16, v1, v2, 0);
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
	
	
	    public final void a(cl p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
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
	        this.a.transact(24, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(cn p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	        } catch (android.os.IBinder v0_2) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_2;
	        }
	        if (p6 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_1);
	        this.a.transact(3, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(String p6, android.os.Bundle p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            v1.writeString(p6);
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
	        this.a.transact(14, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(String p6, android.os.Bundle p7, dk p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            v1.writeString(p6);
	        } catch (android.os.IBinder v0_7) {
	            v2.recycle();
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
	        this.a.transact(1, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        int v0_0 = 0;
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(5, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_1) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_1;
	        }
	        if (v2.readInt() != 0) {
	            v0_0 = 1;
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_0;
	    }
	
	
	    public final boolean a(android.view.KeyEvent p8)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            v2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	        } catch (int v0_1) {
	            v3.recycle();
	            v2.recycle();
	            throw v0_1;
	        }
	        if (p8 == null) {
	            v2.writeInt(0);
	        } else {
	            v2.writeInt(1);
	            p8.writeToParcel(v2, 0);
	        }
	        this.a.transact(2, v2, v3, 0);
	        v3.readException();
	        if (v3.readInt() == 0) {
	            v0_0 = 0;
	        }
	        v3.recycle();
	        v2.recycle();
	        return v0_0;
	    }
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
	
	    public final String b()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(6, v1, v2, 0);
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
	
	
	    public final void b(int p6, int p7, String p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            v1.writeInt(p6);
	            v1.writeInt(p7);
	            v1.writeString(p8);
	            this.a.transact(12, v1, v2, 0);
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
	
	
	    public final void b(long p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            v1.writeLong(p6);
	            this.a.transact(23, v1, v2, 0);
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
	
	
	    public final void b(cn p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	        } catch (android.os.IBinder v0_2) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_2;
	        }
	        if (p6 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_1);
	        this.a.transact(4, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void b(String p6, android.os.Bundle p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            v1.writeString(p6);
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
	        this.a.transact(15, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final String c()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(7, v1, v2, 0);
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
	
	
	    public final void c(String p6, android.os.Bundle p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            v1.writeString(p6);
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
	        this.a.transact(25, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final android.app.PendingIntent d()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(8, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_6) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_6;
	        }
	        if (v2.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_3;
	    }
	
	
	    public final long e()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(9, v1, v2, 0);
	            v2.readException();
	            long v4_1 = v2.readLong();
	            v2.recycle();
	            v1.recycle();
	            return v4_1;
	        } catch (Throwable v0_2) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_2;
	        }
	    }
	
	
	    public final do f()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(10, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_6) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_6;
	        }
	        if (v2.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((do) do.CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_3;
	    }
	
	
	    public final void g()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(13, v1, v2, 0);
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
	
	
	    public final void h()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(17, v1, v2, 0);
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
	
	
	    public final void i()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(18, v1, v2, 0);
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
	
	
	    public final void j()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(19, v1, v2, 0);
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
	
	
	    public final void k()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(20, v1, v2, 0);
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
	
	
	    public final void l()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(21, v1, v2, 0);
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
	
	
	    public final void m()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(22, v1, v2, 0);
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
	
	
	    public final ci n()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(26, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_6) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_6;
	        }
	        if (v2.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((ci) ci.CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_3;
	    }
	
	
	    public final dq o()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(27, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_6) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_6;
	        }
	        if (v2.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((dq) dq.CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_3;
	    }
	
	
	    public final java.util.List p()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(28, v1, v2, 0);
	            v2.readException();
	            Throwable v0_3 = v2.createTypedArrayList(di.CREATOR);
	            v2.recycle();
	            v1.recycle();
	            return v0_3;
	        } catch (Throwable v0_4) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_4;
	        }
	    }
	
	
	    public final CharSequence q()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(29, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_6) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_6;
	        }
	        if (v2.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_3;
	    }
	
	
	    public final android.os.Bundle r()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(30, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_6) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_6;
	        }
	        if (v2.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_3;
	    }
	
	
	    public final int s()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	            this.a.transact(31, v1, v2, 0);
	            v2.readException();
	            Throwable v0_2 = v2.readInt();
	            v2.recycle();
	            v1.recycle();
	            return v0_2;
	        } catch (Throwable v0_3) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_3;
	        }
	    }
	
