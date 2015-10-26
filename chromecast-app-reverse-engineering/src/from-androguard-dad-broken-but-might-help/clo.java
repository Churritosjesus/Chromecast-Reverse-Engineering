	private android.os.IBinder a
	
	    clo(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final android.os.Bundle a(android.accounts.Account p6, String p7, android.os.Bundle p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
	        } catch (int v0_12) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_12;
	        }
	        if (p6 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p6.writeToParcel(v1, 0);
	        }
	        v1.writeString(p7);
	        if (p8 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p8.writeToParcel(v1, 0);
	        }
	        int v0_9;
	        this.a.transact(5, v1, v2, 0);
	        v2.readException();
	        if (v2.readInt() == 0) {
	            v0_9 = 0;
	        } else {
	            v0_9 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_9;
	    }
	
	
	    public final android.os.Bundle a(String p6, android.os.Bundle p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
	            v1.writeString(p6);
	        } catch (int v0_9) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_9;
	        }
	        if (p7 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p7.writeToParcel(v1, 0);
	        }
	        int v0_6;
	        this.a.transact(2, v1, v2, 0);
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
	
	
	    public final android.os.Bundle a(String p6, String p7, android.os.Bundle p8)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
	            v1.writeString(p6);
	            v1.writeString(p7);
	        } catch (int v0_9) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_9;
	        }
	        if (p8 == null) {
	            v1.writeInt(0);
	        } else {
	            v1.writeInt(1);
	            p8.writeToParcel(v1, 0);
	        }
	        int v0_6;
	        this.a.transact(1, v1, v2, 0);
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
	
	
	    public final com.google.android.gms.auth.AccountChangeEventsResponse a(com.google.android.gms.auth.AccountChangeEventsRequest p6)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
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
	        this.a.transact(3, v1, v2, 0);
	        v2.readException();
	        if (v2.readInt() == 0) {
	            v0_7 = 0;
	        } else {
	            v0_7 = bsl.a(v2);
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_7;
	    }
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
