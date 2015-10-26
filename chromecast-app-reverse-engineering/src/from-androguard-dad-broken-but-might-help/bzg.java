	
	    public static bzf a(android.os.IBinder p2)
	    {
	        bzf v0_3;
	        if (p2 != null) {
	            bzf v0_1 = p2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
	            if ((v0_1 == null) || (!(v0_1 instanceof bzf))) {
	                v0_3 = new bzh(p2);
	            } else {
	                v0_3 = ((bzf) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public android.os.IBinder asBinder()
	    {
	        return this;
	    }
	
	
	    public boolean onTransact(int p3, android.os.Parcel p4, android.os.Parcel p5, int p6)
	    {
	        boolean v0 = 1;
	        switch (p3) {
	            case 2:
	                p4.enforceInterface("com.google.android.gms.common.internal.IAccountAccessor");
	                int v1_2 = this.a();
	                p5.writeNoException();
	                if (v1_2 == 0) {
	                    p5.writeInt(0);
	                } else {
	                    p5.writeInt(1);
	                    v1_2.writeToParcel(p5, 1);
	                }
	                break;
	            case 1598968902:
	                p5.writeString("com.google.android.gms.common.internal.IAccountAccessor");
	                break;
	            default:
	                v0 = super.onTransact(p3, p4, p5, p6);
	        }
	        return v0;
	    }
	
