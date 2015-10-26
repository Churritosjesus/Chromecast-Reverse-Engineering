	
	    public static con a(android.os.IBinder p2)
	    {
	        con v0_3;
	        if (p2 != null) {
	            con v0_1 = p2.queryLocalInterface("com.google.android.gms.location.ILocationListener");
	            if ((v0_1 == null) || (!(v0_1 instanceof con))) {
	                v0_3 = new cop(p2);
	            } else {
	                v0_3 = ((con) v0_1);
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
	        int v0_1;
	        switch (p3) {
	            case 1:
	                int v0_4;
	                p4.enforceInterface("com.google.android.gms.location.ILocationListener");
	                if (p4.readInt() == 0) {
	                    v0_4 = 0;
	                } else {
	                    v0_4 = ((android.location.Location) android.location.Location.CREATOR.createFromParcel(p4));
	                }
	                this.a(v0_4);
	                v0_1 = 1;
	                break;
	            case 1598968902:
	                p5.writeString("com.google.android.gms.location.ILocationListener");
	                v0_1 = 1;
	                break;
	            default:
	                v0_1 = super.onTransact(p3, p4, p5, p6);
	        }
	        return v0_1;
	    }
	
