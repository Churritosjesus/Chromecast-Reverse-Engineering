	
	    public static ciq a(android.os.IBinder p2)
	    {
	        ciq v0_3;
	        if (p2 != null) {
	            ciq v0_1 = p2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	            if ((v0_1 == null) || (!(v0_1 instanceof ciq))) {
	                v0_3 = new cis(p2);
	            } else {
	                v0_3 = ((ciq) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p5, android.os.Parcel p6, android.os.Parcel p7, int p8)
	    {
	        boolean v2 = 0;
	        boolean v1 = 1;
	        switch (p5) {
	            case 1:
	                p6.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	                boolean v0_11 = this.a();
	                p7.writeNoException();
	                p7.writeString(v0_11);
	                break;
	            case 2:
	                boolean v0_8;
	                p6.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	                if (p6.readInt() == 0) {
	                    v0_8 = 0;
	                } else {
	                    v0_8 = 1;
	                }
	                boolean v0_9 = this.a(v0_8);
	                p7.writeNoException();
	                if (v0_9) {
	                    v2 = 1;
	                }
	                p7.writeInt(v2);
	                break;
	            case 3:
	                p6.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	                boolean v0_5 = this.a(p6.readString());
	                p7.writeNoException();
	                p7.writeString(v0_5);
	                break;
	            case 4:
	                p6.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	                boolean v0_2 = p6.readString();
	                if (p6.readInt() != 0) {
	                    v2 = 1;
	                }
	                this.a(v0_2, v2);
	                p7.writeNoException();
	                break;
	            case 1598968902:
	                p7.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	                break;
	            default:
	                v1 = super.onTransact(p5, p6, p7, p8);
	        }
	        return v1;
	    }
	
