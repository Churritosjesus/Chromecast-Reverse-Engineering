	private android.os.IBinder a
	
	    bzh(android.os.IBinder p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final android.accounts.Account a()
	    {
	        android.os.Parcel v1 = android.os.Parcel.obtain();
	        android.os.Parcel v2 = android.os.Parcel.obtain();
	        try {
	            int v0_3;
	            v1.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
	            this.a.transact(2, v1, v2, 0);
	            v2.readException();
	        } catch (int v0_6) {
	            v2.recycle();
	            v1.recycle();
	            throw v0_6;
	        }
	        if (v2.readInt() == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((android.accounts.Account) android.accounts.Account.CREATOR.createFromParcel(v2));
	        }
	        v2.recycle();
	        v1.recycle();
	        return v0_3;
	    }
	
	
	    public final android.os.IBinder asBinder()
	    {
	        return this.a;
	    }
	
