	
	    public static clm a(android.os.IBinder p2)
	    {
	        clm v0_3;
	        if (p2 != null) {
	            clm v0_1 = p2.queryLocalInterface("com.google.android.auth.IAuthManagerService");
	            if ((v0_1 == null) || (!(v0_1 instanceof clm))) {
	                v0_3 = new clo(p2);
	            } else {
	                v0_3 = ((clm) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p7, android.os.Parcel p8, android.os.Parcel p9, int p10)
	    {
	        int v0_1;
	        com.google.android.gms.auth.AccountChangeEventsRequest v1 = 0;
	        switch (p7) {
	            case 1:
	                int v0_23;
	                p8.enforceInterface("com.google.android.auth.IAuthManagerService");
	                com.google.android.gms.auth.AccountChangeEventsRequest v2_2 = p8.readString();
	                String v4_1 = p8.readString();
	                if (p8.readInt() == 0) {
	                    v0_23 = 0;
	                } else {
	                    v0_23 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p8));
	                }
	                int v0_26 = this.a(v2_2, v4_1, v0_23);
	                p9.writeNoException();
	                if (v0_26 == 0) {
	                    p9.writeInt(0);
	                } else {
	                    p9.writeInt(1);
	                    v0_26.writeToParcel(p9, 1);
	                }
	                v0_1 = 1;
	                break;
	            case 2:
	                int v0_17;
	                p8.enforceInterface("com.google.android.auth.IAuthManagerService");
	                com.google.android.gms.auth.AccountChangeEventsRequest v2_1 = p8.readString();
	                if (p8.readInt() == 0) {
	                    v0_17 = 0;
	                } else {
	                    v0_17 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p8));
	                }
	                int v0_20 = this.a(v2_1, v0_17);
	                p9.writeNoException();
	                if (v0_20 == 0) {
	                    p9.writeInt(0);
	                } else {
	                    p9.writeInt(1);
	                    v0_20.writeToParcel(p9, 1);
	                }
	                v0_1 = 1;
	                break;
	            case 3:
	                p8.enforceInterface("com.google.android.auth.IAuthManagerService");
	                if (p8.readInt() != 0) {
	                    v1 = bsk.a(p8);
	                }
	                int v0_14 = this.a(v1);
	                p9.writeNoException();
	                if (v0_14 == 0) {
	                    p9.writeInt(0);
	                } else {
	                    p9.writeInt(1);
	                    v0_14.writeToParcel(p9, 1);
	                }
	                v0_1 = 1;
	                break;
	            case 5:
	                com.google.android.gms.auth.AccountChangeEventsRequest v2_0;
	                p8.enforceInterface("com.google.android.auth.IAuthManagerService");
	                if (p8.readInt() == 0) {
	                    v2_0 = 0;
	                } else {
	                    v2_0 = ((android.accounts.Account) android.accounts.Account.CREATOR.createFromParcel(p8));
	                }
	                int v0_8;
	                String v4_0 = p8.readString();
	                if (p8.readInt() == 0) {
	                    v0_8 = 0;
	                } else {
	                    v0_8 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p8));
	                }
	                int v0_11 = this.a(v2_0, v4_0, v0_8);
	                p9.writeNoException();
	                if (v0_11 == 0) {
	                    p9.writeInt(0);
	                } else {
	                    p9.writeInt(1);
	                    v0_11.writeToParcel(p9, 1);
	                }
	                v0_1 = 1;
	                break;
	            case 1598968902:
	                p9.writeString("com.google.android.auth.IAuthManagerService");
	                v0_1 = 1;
	                break;
	            default:
	                v0_1 = super.onTransact(p7, p8, p9, p10);
	        }
	        return v0_1;
	    }
	
