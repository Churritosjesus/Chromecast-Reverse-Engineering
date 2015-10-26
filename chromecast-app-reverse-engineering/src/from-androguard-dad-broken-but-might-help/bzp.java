	
	    public bzp()
	    {
	        this.attachInterface(this, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
	        return;
	    }
	
	
	    public android.os.IBinder asBinder()
	    {
	        return this;
	    }
	
	
	    public boolean onTransact(int p3, android.os.Parcel p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1;
	        switch (p3) {
	            case 2:
	                int v0_4;
	                p4.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
	                if (p4.readInt() == 0) {
	                    v0_4 = 0;
	                } else {
	                    v0_4 = ((com.google.android.gms.common.internal.ResolveAccountResponse) com.google.android.gms.common.internal.ResolveAccountResponse.CREATOR.createFromParcel(p4));
	                }
	                this.a(v0_4);
	                p5.writeNoException();
	                v0_1 = 1;
	                break;
	            case 1598968902:
	                p5.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
	                v0_1 = 1;
	                break;
	            default:
	                v0_1 = super.onTransact(p3, p4, p5, p6);
	        }
	        return v0_1;
	    }
	
