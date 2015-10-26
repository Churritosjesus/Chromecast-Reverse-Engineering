	
	    public bzj()
	    {
	        this.attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
	        return;
	    }
	
	
	    public static bzi a(android.os.IBinder p2)
	    {
	        bzi v0_3;
	        if (p2 != null) {
	            bzi v0_1 = p2.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
	            if ((v0_1 == null) || (!(v0_1 instanceof bzi))) {
	                v0_3 = new bzk(p2);
	            } else {
	                v0_3 = ((bzi) v0_1);
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
	
	
	    public boolean onTransact(int p6, android.os.Parcel p7, android.os.Parcel p8, int p9)
	    {
	        int v0_2;
	        int v0_0 = 0;
	        switch (p6) {
	            case 1:
	                p7.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
	                int v2_3 = p7.readInt();
	                int v3_1 = p7.readStrongBinder();
	                if (p7.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p7));
	                }
	                this.a(v2_3, v3_1, v0_0);
	                p8.writeNoException();
	                v0_2 = 1;
	                break;
	            case 2:
	                p7.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
	                int v2_1 = p7.readInt();
	                if (p7.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p7));
	                }
	                this.a(v2_1, v0_0);
	                p8.writeNoException();
	                v0_2 = 1;
	                break;
	            case 1598968902:
	                p8.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
	                v0_2 = 1;
	                break;
	            default:
	                v0_2 = super.onTransact(p6, p7, p8, p9);
	        }
	        return v0_2;
	    }
	
