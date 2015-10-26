	
	    public csz()
	    {
	        this.attachInterface(this, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
	        return;
	    }
	
	
	    public android.os.IBinder asBinder()
	    {
	        return this;
	    }
	
	
	    public boolean onTransact(int p5, android.os.Parcel p6, android.os.Parcel p7, int p8)
	    {
	        boolean v0 = 1;
	        switch (p5) {
	            case 2:
	                p6.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
	                this.a(p6.readString(), p6.createTypedArrayList(com.google.android.gms.common.api.Scope.CREATOR), cte.a(p6.readStrongBinder()));
	                p7.writeNoException();
	                break;
	            case 3:
	                p6.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
	                this.a(p6.readString(), p6.readString(), cte.a(p6.readStrongBinder()));
	                p7.writeNoException();
	                break;
	            case 1598968902:
	                p7.writeString("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
	                break;
	            default:
	                v0 = super.onTransact(p5, p6, p7, p8);
	        }
	        return v0;
	    }
	
