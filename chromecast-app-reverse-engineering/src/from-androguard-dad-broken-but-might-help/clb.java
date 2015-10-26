	private android.os.IBinder a
	
	    clb(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p6, int p7)
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            v1.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
	            v1.writeInt(p6);
	            v1.writeInt(p7);
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
	
	
	    public final boolean a(com.google.android.gms.feedback.ErrorReport p8)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            v2.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
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
	        this.a.transact(1, v2, v3, 0);
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
	
	
	    public final boolean b(com.google.android.gms.feedback.ErrorReport p8)
	    {
	        int v0_0 = 1;
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        android.os.Parcel v3 = android.os.Parcel.obtain();
	        try {
	            v2.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
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
	        this.a.transact(3, v2, v3, 0);
	        v3.readException();
	        if (v3.readInt() == 0) {
	            v0_0 = 0;
	        }
	        v3.recycle();
	        v2.recycle();
	        return v0_0;
	    }
	
