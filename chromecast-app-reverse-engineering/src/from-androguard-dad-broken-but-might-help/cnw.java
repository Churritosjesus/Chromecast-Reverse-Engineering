	private android.os.IBinder a
	
	    cnw(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final android.location.Location a()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	            this.a.transact(7, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_6) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_6;
	        }
	        if (v2.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((android.location.Location) android.location.Location.CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_3;
	    }
	
	
	    public final com.google.android.gms.common.api.Status a(com.google.android.gms.location.GestureRequest p6, android.app.PendingIntent p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	        } catch (int v0_9) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_9;
	        }
	        if (p6 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p6.writeToParcel(v1, 0);
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        int v0_10;
	        this.a.transact(60, v1, v2, 0);
	        v2.readException();
	        if (v2.readInt() == 0) {
	            v0_10 = 0;
	        } else {
	            v0_10 = bwo.a(v2);
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_10;
	    }
	
	
	    public final com.google.android.gms.location.ActivityRecognitionResult a(String p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_4;
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	            v1.writeString(p6);
	            this.a.transact(64, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_3) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_3;
	        }
	        if (v2.readInt() == 0) {
	            v0_4 = 0;
	        } else {
	            v0_4 = cna.a(v2);
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_4;
	    }
	
	
	    public final void a(long p6, boolean p8, android.app.PendingIntent p9)
	    {
	        android.os.IBinder v0_0 = 1;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            v2.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	            v2.writeLong(p6);
	        } catch (android.os.IBinder v0_4) {
	            v3.recycle();
	            v2.recycle();
	            throw v0_4;
	        }
	        if (!p8) {
	            v0_0 = 0;
	        }
	        v2.writeInt(v0_0);
	        if (p9 == null) {
	            v2.writeInt(0);
	        } else {
	            v2.writeInt(1);
	            p9.writeToParcel(v2, 0);
	        }
	        this.a.transact(5, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(android.app.PendingIntent p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        this.a.transact(6, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(android.app.PendingIntent p6, cnr p7, String p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        v1.writeString(p8);
	        this.a.transact(2, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(android.location.Location p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        this.a.transact(13, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(android.location.Location p6, int p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        v1.writeInt(p7);
	        this.a.transact(26, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(cnr p6, String p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        v1.writeString(p7);
	        this.a.transact(4, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.location.GeofencingRequest p6, android.app.PendingIntent p7, cnr p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	        } catch (android.os.IBinder v0_8) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_8;
	        }
	        if (p6 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p6.writeToParcel(v1, 0);
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        android.os.IBinder v0_7;
	        if (p8 == null) {
	            v0_7 = 0;
	        } else {
	            v0_7 = p8.asBinder();
	        }
	        v1.writeStrongBinder(v0_7);
	        this.a.transact(57, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.location.LocationRequest p6, android.app.PendingIntent p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	        } catch (android.os.IBinder v0_7) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_7;
	        }
	        if (p6 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p6.writeToParcel(v1, 0);
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        this.a.transact(9, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.location.LocationRequest p6, con p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        this.a.transact(8, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.location.LocationRequest p6, con p7, String p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        v1.writeString(p8);
	        this.a.transact(20, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.location.LocationSettingsRequest p6, cnx p7, String p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        v1.writeString(p8);
	        this.a.transact(63, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.location.internal.LocationRequestInternal p6, android.app.PendingIntent p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	        } catch (android.os.IBinder v0_7) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_7;
	        }
	        if (p6 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p6.writeToParcel(v1, 0);
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        this.a.transact(53, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.location.internal.LocationRequestInternal p6, con p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        this.a.transact(52, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.location.internal.LocationRequestUpdateData p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        this.a.transact(59, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(con p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        this.a.transact(10, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(java.util.List p6, android.app.PendingIntent p7, cnr p8, String p9)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	            v1.writeTypedList(p6);
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
	        v1.writeString(p9);
	        this.a.transact(1, v1, v2, 0);
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
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	        } catch (android.os.IBinder v0_1) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_1;
	        }
	        if (p6) {
	            v0_0 = 1;
	        }
	        v1.writeInt(v0_0);
	        this.a.transact(12, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(String[] p6, cnr p7, String p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	            v1.writeStringArray(p6);
	        } catch (android.os.IBinder v0_2) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_2;
	        }
	        if (p7 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p7.asBinder();
	        }
	        v1.writeStrongBinder(v0_1);
	        v1.writeString(p8);
	        this.a.transact(3, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
	
	    public final android.location.Location b(String p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	            v1.writeString(p6);
	            this.a.transact(21, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_6) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_6;
	        }
	        if (v2.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((android.location.Location) android.location.Location.CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_3;
	    }
	
	
	    public final android.os.IBinder b()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	            this.a.transact(51, v1, v2, 0);
	            v2.readException();
	            Throwable v0_2 = v2.readStrongBinder();
	            v2.recycle();
	            v1.recycle();
	            return v0_2;
	        } catch (Throwable v0_3) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_3;
	        }
	    }
	
	
	    public final com.google.android.gms.common.api.Status b(android.app.PendingIntent p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	        } catch (int v0_6) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_6;
	        }
	        if (p6 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p6.writeToParcel(v1, 0);
	        }
	        int v0_7;
	        this.a.transact(61, v1, v2, 0);
	        v2.readException();
	        if (v2.readInt() == 0) {
	            v0_7 = 0;
	        } else {
	            v0_7 = bwo.a(v2);
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_7;
	    }
	
	
	    public final com.google.android.gms.location.LocationAvailability c(String p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_4;
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	            v1.writeString(p6);
	            this.a.transact(34, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_3) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_3;
	        }
	        if (v2.readInt() == 0) {
	            v0_4 = 0;
	        } else {
	            v0_4 = cnf.a(v2);
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_4;
	    }
	
	
	    public final void c(android.app.PendingIntent p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
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
	        this.a.transact(11, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
