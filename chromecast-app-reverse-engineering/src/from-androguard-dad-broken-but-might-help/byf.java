	
	    public static bye a(android.os.IBinder p2)
	    {
	        bye v0_3;
	        if (p2 != null) {
	            bye v0_1 = p2.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
	            if ((v0_1 == null) || (!(v0_1 instanceof bye))) {
	                v0_3 = new byg(p2);
	            } else {
	                v0_3 = ((bye) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p3, android.os.Parcel p4, android.os.Parcel p5, int p6)
	    {
	        boolean v0 = 1;
	        switch (p3) {
	            case 2:
	                p4.enforceInterface("com.google.android.gms.common.internal.ICancelToken");
	                this.a();
	                p5.writeNoException();
	                break;
	            case 1598968902:
	                p5.writeString("com.google.android.gms.common.internal.ICancelToken");
	                break;
	            default:
	                v0 = super.onTransact(p3, p4, p5, p6);
	        }
	        return v0;
	    }
	
