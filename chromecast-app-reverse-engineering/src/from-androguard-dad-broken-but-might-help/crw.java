	private android.os.IBinder a
	
	    crw(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final android.os.Bundle a(android.net.Uri p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        int v0_6;
	        this.a.transact(8, v1, v2, 0);
	        v2.readException();
	        if (v2.readInt() == 0) {
	            v0_6 = 0;
	        } else {
	            v0_6 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_6;
	    }
	
	
	    public final android.os.Bundle a(crr p7, boolean p8, String p9, String p10, int p11)
	    {
	        android.os.Bundle v0_0 = 0;
	        int v1_0 = 0;
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        android.os.Parcel v4 = android.os.Parcel.obtain();
	        try {
	            int v2_1;
	            v3.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.Bundle v0_3) {
	            v4.recycle();
	            v3.recycle();
	            throw v0_3;
	        }
	        if (p7 == null) {
	            v2_1 = 0;
	        } else {
	            v2_1 = p7.asBinder();
	        }
	        v3.writeStrongBinder(v2_1);
	        if (p8) {
	            v1_0 = 1;
	        }
	        v3.writeInt(v1_0);
	        v3.writeString(p9);
	        v3.writeString(p10);
	        v3.writeInt(p11);
	        this.a.transact(11, v3, v4, 0);
	        v4.readException();
	        if (v4.readInt() != 0) {
	            v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(v4));
	        }
	        v4.recycle();
	        v3.recycle();
	        return v0_0;
	    }
	
	
	    public final android.os.Bundle a(String p6, String p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	            v1.writeString(p6);
	            v1.writeString(p7);
	            this.a.transact(12, v1, v2, 0);
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
	
	
	    public final android.os.Bundle a(String p6, String p7, long p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	            v1.writeString(p6);
	            v1.writeString(p7);
	            v1.writeLong(p8);
	            this.a.transact(20, v1, v2, 0);
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
	
	
	    public final android.os.Bundle a(String p6, String p7, long p8, boolean p10)
	    {
	        int v0_0 = 0;
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	            v1.writeString(p6);
	            v1.writeString(p7);
	            v1.writeLong(p8);
	        } catch (int v0_6) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_6;
	        }
	        if (p10) {
	            v0_0 = 1;
	        }
	        int v0_3;
	        v1.writeInt(v0_0);
	        this.a.transact(26, v1, v2, 0);
	        v2.readException();
	        if (v2.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_3;
	    }
	
	
	    public final android.os.Bundle a(String p6, String p7, long p8, boolean p10, boolean p11)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        android.os.Parcel v4 = android.os.Parcel.obtain();
	        try {
	            int v2_1;
	            v3.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	            v3.writeString(p6);
	            v3.writeString(p7);
	            v3.writeLong(p8);
	        } catch (int v0_6) {
	            v4.recycle();
	            v3.recycle();
	            throw v0_6;
	        }
	        if (!p10) {
	            v2_1 = 0;
	        } else {
	            v2_1 = 1;
	        }
	        v3.writeInt(v2_1);
	        if (!p11) {
	            v0_0 = 0;
	        }
	        int v0_3;
	        v3.writeInt(v0_0);
	        this.a.transact(205, v3, v4, 0);
	        v4.readException();
	        if (v4.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(v4));
	        }
	        v4.recycle();
	        v3.recycle();
	        return v0_3;
	    }
	
	
	    public final bye a(crr p6, com.google.android.gms.common.data.DataHolder p7, int p8, int p9, long p10)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            bye v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (bye v0_5) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_5;
	        }
	        if (p6 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_1);
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        v1.writeInt(p8);
	        v1.writeInt(p9);
	        v1.writeLong(p10);
	        this.a.transact(602, v1, v2, 0);
	        v2.readException();
	        bye v0_8 = byf.a(v2.readStrongBinder());
	        v2.recycle();
	        v1.recycle();
	        return v0_8;
	    }
	
	
	    public final bye a(crr p6, com.google.android.gms.people.identity.internal.AccountToken p7, com.google.android.gms.people.identity.internal.ParcelableListOptions p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            bye v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (bye v0_8) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_8;
	        }
	        if (p6 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_1);
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
	        this.a.transact(601, v1, v2, 0);
	        v2.readException();
	        bye v0_11 = byf.a(v2.readStrongBinder());
	        v2.recycle();
	        v1.recycle();
	        return v0_11;
	    }
	
	
	    public final bye a(crr p6, com.google.android.gms.people.model.AvatarReference p7, com.google.android.gms.people.internal.ParcelableLoadImageOptions p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            bye v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (bye v0_8) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_8;
	        }
	        if (p6 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_1);
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
	        this.a.transact(508, v1, v2, 0);
	        v2.readException();
	        bye v0_11 = byf.a(v2.readStrongBinder());
	        v2.recycle();
	        v1.recycle();
	        return v0_11;
	    }
	
	
	    public final bye a(crr p6, String p7, int p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            bye v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (bye v0_2) {
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
	        v1.writeInt(p8);
	        this.a.transact(509, v1, v2, 0);
	        v2.readException();
	        bye v0_5 = byf.a(v2.readStrongBinder());
	        v2.recycle();
	        v1.recycle();
	        return v0_5;
	    }
	
	
	    public final bye a(crr p6, String p7, String p8, boolean p9, String p10, String p11, int p12, int p13, int p14, boolean p15)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        android.os.Parcel v4 = android.os.Parcel.obtain();
	        try {
	            int v2_1;
	            v3.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (int v0_1) {
	            v4.recycle();
	            v3.recycle();
	            throw v0_1;
	        }
	        if (p6 == null) {
	            v2_1 = 0;
	        } else {
	            v2_1 = p6.asBinder();
	        }
	        int v2_2;
	        v3.writeStrongBinder(v2_1);
	        v3.writeString(p7);
	        v3.writeString(p8);
	        if (!p9) {
	            v2_2 = 0;
	        } else {
	            v2_2 = 1;
	        }
	        v3.writeInt(v2_2);
	        v3.writeString(p10);
	        v3.writeString(p11);
	        v3.writeInt(p12);
	        v3.writeInt(p13);
	        v3.writeInt(p14);
	        if (!p15) {
	            v0_0 = 0;
	        }
	        v3.writeInt(v0_0);
	        this.a.transact(507, v3, v4, 0);
	        v4.readException();
	        int v0_4 = byf.a(v4.readStrongBinder());
	        v4.recycle();
	        v3.recycle();
	        return v0_4;
	    }
	
	
	    public final void a(crr p7, long p8, boolean p10)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v0_1) {
	            v3.recycle();
	            v2.recycle();
	            throw v0_1;
	        }
	        if (p7 == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = p7.asBinder();
	        }
	        v2.writeStrongBinder(v1_1);
	        v2.writeLong(p8);
	        if (p10) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        this.a.transact(6, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, android.os.Bundle p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v0_5) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_5;
	        }
	        if (p6 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_1);
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        this.a.transact(302, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, com.google.android.gms.people.identity.internal.AccountToken p7, java.util.List p8, com.google.android.gms.people.identity.internal.ParcelableGetOptions p9)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v0_8) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_8;
	        }
	        if (p6 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_1);
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        v1.writeStringList(p8);
	        if (p9 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p9.writeToParcel(v1, 0);
	        }
	        this.a.transact(501, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        this.a.transact(24, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, int p8, int p9)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeInt(p8);
	        v1.writeInt(p9);
	        this.a.transact(5, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        this.a.transact(25, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, int p9)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        v1.writeInt(p9);
	        this.a.transact(403, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, int p9, int p10)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        v1.writeInt(p9);
	        v1.writeInt(p10);
	        this.a.transact(29, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, android.net.Uri p9)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v0_5) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_5;
	        }
	        if (p6 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_1);
	        v1.writeString(p7);
	        v1.writeString(p8);
	        if (p9 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p9.writeToParcel(v1, 0);
	        }
	        this.a.transact(13, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, android.net.Uri p9, boolean p10)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        android.os.Parcel v4 = android.os.Parcel.obtain();
	        try {
	            int v2_1;
	            v3.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (int v0_1) {
	            v4.recycle();
	            v3.recycle();
	            throw v0_1;
	        }
	        if (p6 == null) {
	            v2_1 = 0;
	        } else {
	            v2_1 = p6.asBinder();
	        }
	        v3.writeStrongBinder(v2_1);
	        v3.writeString(p7);
	        v3.writeString(p8);
	        if (p9 == null) {
	            v3.writeInt(0);
	        } else {
	            v3.writeInt(1);
	            p9.writeToParcel(v3, 0);
	        }
	        if (!p10) {
	            v0_0 = 0;
	        }
	        v3.writeInt(v0_0);
	        this.a.transact(18, v3, v4, 0);
	        v4.readException();
	        v4.recycle();
	        v3.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        v1.writeString(p9);
	        this.a.transact(204, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, int p10, String p11)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        v1.writeString(p9);
	        v1.writeInt(p10);
	        v1.writeString(p11);
	        this.a.transact(3, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, int p10, String p11, boolean p12)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v2.writeString(p7);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        v2.writeInt(p10);
	        v2.writeString(p11);
	        if (p12) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        this.a.transact(19, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, int p10, boolean p11, int p12, int p13, String p14)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v2.writeString(p7);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        v2.writeInt(p10);
	        if (p11) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        v2.writeInt(p12);
	        v2.writeInt(p13);
	        v2.writeString(p14);
	        this.a.transact(202, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, int p10, boolean p11, int p12, int p13, String p14, boolean p15)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        android.os.Parcel v4 = android.os.Parcel.obtain();
	        try {
	            int v2_1;
	            v3.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (int v0_1) {
	            v4.recycle();
	            v3.recycle();
	            throw v0_1;
	        }
	        if (p6 == null) {
	            v2_1 = 0;
	        } else {
	            v2_1 = p6.asBinder();
	        }
	        int v2_2;
	        v3.writeStrongBinder(v2_1);
	        v3.writeString(p7);
	        v3.writeString(p8);
	        v3.writeString(p9);
	        v3.writeInt(p10);
	        if (!p11) {
	            v2_2 = 0;
	        } else {
	            v2_2 = 1;
	        }
	        v3.writeInt(v2_2);
	        v3.writeInt(p12);
	        v3.writeInt(p13);
	        v3.writeString(p14);
	        if (!p15) {
	            v0_0 = 0;
	        }
	        v3.writeInt(v0_0);
	        this.a.transact(203, v3, v4, 0);
	        v4.readException();
	        v4.recycle();
	        v3.recycle();
	        return;
	    }
	
	
	    public final void a(crr p7, String p8, String p9, String p10, int p11, boolean p12, int p13, int p14, String p15, boolean p16, int p17, int p18)
	    {
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v1_4) {
	            v3.recycle();
	            v2.recycle();
	            throw v1_4;
	        }
	        if (p7 == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = p7.asBinder();
	        }
	        android.os.IBinder v1_2;
	        v2.writeStrongBinder(v1_1);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        v2.writeString(p10);
	        v2.writeInt(p11);
	        if (!p12) {
	            v1_2 = 0;
	        } else {
	            v1_2 = 1;
	        }
	        android.os.IBinder v1_3;
	        v2.writeInt(v1_2);
	        v2.writeInt(p13);
	        v2.writeInt(p14);
	        v2.writeString(p15);
	        if (!p16) {
	            v1_3 = 0;
	        } else {
	            v1_3 = 1;
	        }
	        v2.writeInt(v1_3);
	        v2.writeInt(p17);
	        v2.writeInt(p18);
	        this.a.transact(402, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, String p10)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        v1.writeString(p9);
	        v1.writeString(p10);
	        this.a.transact(27, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, String p10, int p11, String p12)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        v1.writeString(p9);
	        v1.writeString(p10);
	        v1.writeInt(p11);
	        v1.writeString(p12);
	        this.a.transact(303, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, String p10, boolean p11)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v2.writeString(p7);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        v2.writeString(p10);
	        if (p11) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        this.a.transact(701, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, java.util.List p10)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        v1.writeString(p9);
	        v1.writeStringList(p10);
	        this.a.transact(28, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p7, String p8, String p9, String p10, java.util.List p11, int p12, boolean p13, long p14)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v0_1) {
	            v3.recycle();
	            v2.recycle();
	            throw v0_1;
	        }
	        if (p7 == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = p7.asBinder();
	        }
	        v2.writeStrongBinder(v1_1);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        v2.writeString(p10);
	        v2.writeStringList(p11);
	        v2.writeInt(p12);
	        if (p13) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        v2.writeLong(p14);
	        this.a.transact(4, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p7, String p8, String p9, String p10, java.util.List p11, int p12, boolean p13, long p14, String p16, int p17)
	    {
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v1_3) {
	            v3.recycle();
	            v2.recycle();
	            throw v1_3;
	        }
	        if (p7 == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = p7.asBinder();
	        }
	        android.os.IBinder v1_2;
	        v2.writeStrongBinder(v1_1);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        v2.writeString(p10);
	        v2.writeStringList(p11);
	        v2.writeInt(p12);
	        if (!p13) {
	            v1_2 = 0;
	        } else {
	            v1_2 = 1;
	        }
	        v2.writeInt(v1_2);
	        v2.writeLong(p14);
	        v2.writeString(p16);
	        v2.writeInt(p17);
	        this.a.transact(21, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p7, String p8, String p9, String p10, java.util.List p11, int p12, boolean p13, long p14, String p16, int p17, int p18)
	    {
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v1_3) {
	            v3.recycle();
	            v2.recycle();
	            throw v1_3;
	        }
	        if (p7 == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = p7.asBinder();
	        }
	        android.os.IBinder v1_2;
	        v2.writeStrongBinder(v1_1);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        v2.writeString(p10);
	        v2.writeStringList(p11);
	        v2.writeInt(p12);
	        if (!p13) {
	            v1_2 = 0;
	        } else {
	            v1_2 = 1;
	        }
	        v2.writeInt(v1_2);
	        v2.writeLong(p14);
	        v2.writeString(p16);
	        v2.writeInt(p17);
	        v2.writeInt(p18);
	        this.a.transact(401, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p7, String p8, String p9, String p10, java.util.List p11, int p12, boolean p13, long p14, String p16, int p17, int p18, int p19)
	    {
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v1_3) {
	            v3.recycle();
	            v2.recycle();
	            throw v1_3;
	        }
	        if (p7 == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = p7.asBinder();
	        }
	        android.os.IBinder v1_2;
	        v2.writeStrongBinder(v1_1);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        v2.writeString(p10);
	        v2.writeStringList(p11);
	        v2.writeInt(p12);
	        if (!p13) {
	            v1_2 = 0;
	        } else {
	            v1_2 = 1;
	        }
	        v2.writeInt(v1_2);
	        v2.writeLong(p14);
	        v2.writeString(p16);
	        v2.writeInt(p17);
	        v2.writeInt(p18);
	        v2.writeInt(p19);
	        this.a.transact(404, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, java.util.List p10, java.util.List p11)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        v1.writeString(p9);
	        v1.writeStringList(p10);
	        v1.writeStringList(p11);
	        this.a.transact(14, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, java.util.List p10, java.util.List p11, com.google.android.gms.common.server.FavaDiagnosticsEntity p12)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v0_5) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_5;
	        }
	        if (p6 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_1);
	        v1.writeString(p7);
	        v1.writeString(p8);
	        v1.writeString(p9);
	        v1.writeStringList(p10);
	        v1.writeStringList(p11);
	        if (p12 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p12.writeToParcel(v1, 0);
	        }
	        this.a.transact(23, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, boolean p10)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v2.writeString(p7);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        if (p10) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        this.a.transact(7, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, boolean p10, int p11)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v2.writeString(p7);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        if (p10) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        v2.writeInt(p11);
	        this.a.transact(9, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, String p8, String p9, boolean p10, int p11, int p12)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v2.writeString(p7);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        if (p10) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        v2.writeInt(p11);
	        v2.writeInt(p12);
	        this.a.transact(201, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, String p7, boolean p8, String[] p9)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v2.writeString(p7);
	        if (p8) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        v2.writeStringArray(p9);
	        this.a.transact(10, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, boolean p7, boolean p8, String p9, String p10)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        android.os.Parcel v4 = android.os.Parcel.obtain();
	        try {
	            int v2_1;
	            v3.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (int v0_1) {
	            v4.recycle();
	            v3.recycle();
	            throw v0_1;
	        }
	        if (p6 == null) {
	            v2_1 = 0;
	        } else {
	            v2_1 = p6.asBinder();
	        }
	        int v2_2;
	        v3.writeStrongBinder(v2_1);
	        if (!p7) {
	            v2_2 = 0;
	        } else {
	            v2_2 = 1;
	        }
	        v3.writeInt(v2_2);
	        if (!p8) {
	            v0_0 = 0;
	        }
	        v3.writeInt(v0_0);
	        v3.writeString(p9);
	        v3.writeString(p10);
	        this.a.transact(2, v3, v4, 0);
	        v4.readException();
	        v4.recycle();
	        v3.recycle();
	        return;
	    }
	
	
	    public final void a(crr p6, boolean p7, boolean p8, String p9, String p10, int p11)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        android.os.Parcel v4 = android.os.Parcel.obtain();
	        try {
	            int v2_1;
	            v3.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (int v0_1) {
	            v4.recycle();
	            v3.recycle();
	            throw v0_1;
	        }
	        if (p6 == null) {
	            v2_1 = 0;
	        } else {
	            v2_1 = p6.asBinder();
	        }
	        int v2_2;
	        v3.writeStrongBinder(v2_1);
	        if (!p7) {
	            v2_2 = 0;
	        } else {
	            v2_2 = 1;
	        }
	        v3.writeInt(v2_2);
	        if (!p8) {
	            v0_0 = 0;
	        }
	        v3.writeInt(v0_0);
	        v3.writeString(p9);
	        v3.writeString(p10);
	        v3.writeInt(p11);
	        this.a.transact(305, v3, v4, 0);
	        v4.readException();
	        v4.recycle();
	        v3.recycle();
	        return;
	    }
	
	
	    public final void a(boolean p6)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v0_1) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_1;
	        }
	        if (p6) {
	            v0_0 = 1;
	        }
	        v1.writeInt(v0_0);
	        this.a.transact(15, v1, v2, 0);
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
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	            this.a.transact(16, v1, v2, 0);
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
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
	
	    public final android.os.Bundle b(String p6, String p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	            v1.writeString(p6);
	            v1.writeString(p7);
	            this.a.transact(17, v1, v2, 0);
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
	
	
	    public final bye b(crr p7, long p8, boolean p10)
	    {
	        bye v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (bye v0_1) {
	            v3.recycle();
	            v2.recycle();
	            throw v0_1;
	        }
	        if (p7 == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = p7.asBinder();
	        }
	        v2.writeStrongBinder(v1_1);
	        v2.writeLong(p8);
	        if (p10) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        this.a.transact(503, v2, v3, 0);
	        v3.readException();
	        bye v0_4 = byf.a(v3.readStrongBinder());
	        v3.recycle();
	        v2.recycle();
	        return v0_4;
	    }
	
	
	    public final bye b(crr p6, String p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            bye v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (bye v0_2) {
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
	        this.a.transact(504, v1, v2, 0);
	        v2.readException();
	        bye v0_5 = byf.a(v2.readStrongBinder());
	        v2.recycle();
	        v1.recycle();
	        return v0_5;
	    }
	
	
	    public final bye b(crr p6, String p7, int p8, int p9)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            bye v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (bye v0_2) {
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
	        v1.writeInt(p8);
	        v1.writeInt(p9);
	        this.a.transact(502, v1, v2, 0);
	        v2.readException();
	        bye v0_5 = byf.a(v2.readStrongBinder());
	        v2.recycle();
	        v1.recycle();
	        return v0_5;
	    }
	
	
	    public final bye b(crr p6, String p7, String p8, int p9, int p10)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            bye v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (bye v0_2) {
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
	        v1.writeString(p8);
	        v1.writeInt(p9);
	        v1.writeInt(p10);
	        this.a.transact(505, v1, v2, 0);
	        v2.readException();
	        bye v0_5 = byf.a(v2.readStrongBinder());
	        v2.recycle();
	        v1.recycle();
	        return v0_5;
	    }
	
	
	    public final void b(crr p6, android.os.Bundle p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (android.os.IBinder v0_5) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_5;
	        }
	        if (p6 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p6.asBinder();
	        }
	        v1.writeStrongBinder(v0_1);
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        this.a.transact(304, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void b(crr p6, String p7, String p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        this.a.transact(101, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void b(crr p6, String p7, String p8, int p9)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        v1.writeInt(p9);
	        this.a.transact(301, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void b(crr p6, String p7, String p8, String p9, int p10, String p11)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        v1.writeString(p9);
	        v1.writeInt(p10);
	        v1.writeString(p11);
	        this.a.transact(22, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
	
	    public final void b(crr p6, String p7, String p8, String p9, boolean p10)
	    {
	        android.os.IBinder v0_0 = 0;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            int v1_1;
	            v2.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v2.writeString(p7);
	        v2.writeString(p8);
	        v2.writeString(p9);
	        if (p10) {
	            v0_0 = 1;
	        }
	        v2.writeInt(v0_0);
	        this.a.transact(603, v2, v3, 0);
	        v3.readException();
	        v3.recycle();
	        v2.recycle();
	        return;
	    }
	
	
	    public final bye c(crr p6, String p7, String p8, int p9)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            bye v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
	        } catch (bye v0_2) {
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
	        v1.writeString(p8);
	        v1.writeInt(p9);
	        this.a.transact(506, v1, v2, 0);
	        v2.readException();
	        bye v0_5 = byf.a(v2.readStrongBinder());
	        v2.recycle();
	        v1.recycle();
	        return v0_5;
	    }
	
	
	    public final void c(crr p6, String p7, String p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            android.os.IBinder v0_1;
	            v1.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
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
	        v1.writeString(p8);
	        this.a.transact(102, v1, v2, 0);
	        v2.readException();
	        v2.recycle();
	        v1.recycle();
	        return;
	    }
	
