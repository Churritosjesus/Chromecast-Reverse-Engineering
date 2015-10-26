	private android.os.IBinder a
	
	    bqi(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
	            this.a.transact(2, v1, v2, 0);
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
	
	
	    public final void a(java.util.Map p7, long p8, String p10, java.util.List p11)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
	            v1.writeMap(p7);
	            v1.writeLong(p8);
	            v1.writeString(p10);
	            v1.writeTypedList(p11);
	            this.a.transact(1, v1, v2, 0);
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
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
	
	    public final String b()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
	            this.a.transact(3, v1, v2, 0);
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
	
