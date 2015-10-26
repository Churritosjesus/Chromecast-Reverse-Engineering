	
	    public static ctd a(android.os.IBinder p2)
	    {
	        ctd v0_3;
	        if (p2 != null) {
	            ctd v0_1 = p2.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
	            if ((v0_1 == null) || (!(v0_1 instanceof ctd))) {
	                v0_3 = new ctf(p2);
	            } else {
	                v0_3 = ((ctd) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p6, android.os.Parcel p7, android.os.Parcel p8, int p9)
	    {
	        bzo v0_0 = 0;
	        bzo v1_0 = 0;
	        boolean v2 = 1;
	        switch (p6) {
	            case 2:
	                bzo v0_24;
	                p7.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
	                if (p7.readInt() == 0) {
	                    v0_24 = 0;
	                } else {
	                    v0_24 = ((com.google.android.gms.common.internal.AuthAccountRequest) com.google.android.gms.common.internal.AuthAccountRequest.CREATOR.createFromParcel(p7));
	                }
	                this.a(v0_24, ctb.a(p7.readStrongBinder()));
	                p8.writeNoException();
	                break;
	            case 3:
	                bzo v0_19;
	                p7.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
	                if (p7.readInt() == 0) {
	                    v0_19 = 0;
	                } else {
	                    v0_19 = ((com.google.android.gms.signin.internal.CheckServerAuthResult) com.google.android.gms.signin.internal.CheckServerAuthResult.CREATOR.createFromParcel(p7));
	                }
	                this.a(v0_19);
	                p8.writeNoException();
	                break;
	            case 4:
	                p7.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
	                if (p7.readInt() != 0) {
	                    v0_0 = 1;
	                }
	                this.a(v0_0);
	                p8.writeNoException();
	                break;
	            case 5:
	                bzf v3_2;
	                p7.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
	                if (p7.readInt() == 0) {
	                    v3_2 = 0;
	                } else {
	                    v3_2 = ((com.google.android.gms.common.internal.ResolveAccountRequest) com.google.android.gms.common.internal.ResolveAccountRequest.CREATOR.createFromParcel(p7));
	                }
	                android.os.IBinder v4_1 = p7.readStrongBinder();
	                if (v4_1 != null) {
	                    bzo v0_15 = v4_1.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
	                    if ((v0_15 == null) || (!(v0_15 instanceof bzo))) {
	                        v1_0 = new bzq(v4_1);
	                    } else {
	                        v1_0 = ((bzo) v0_15);
	                    }
	                }
	                this.a(v3_2, v1_0);
	                p8.writeNoException();
	                break;
	            case 7:
	                p7.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
	                this.a(p7.readInt());
	                p8.writeNoException();
	                break;
	            case 8:
	                bzo v0_4;
	                p7.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
	                bzf v3_1 = p7.readInt();
	                if (p7.readInt() == 0) {
	                    v0_4 = 0;
	                } else {
	                    v0_4 = ((android.accounts.Account) android.accounts.Account.CREATOR.createFromParcel(p7));
	                }
	                this.a(v3_1, v0_4, ctb.a(p7.readStrongBinder()));
	                p8.writeNoException();
	                break;
	            case 9:
	                p7.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
	                bzo v1_3 = bzg.a(p7.readStrongBinder());
	                bzf v3_0 = p7.readInt();
	                if (p7.readInt() != 0) {
	                    v0_0 = 1;
	                }
	                this.a(v1_3, v3_0, v0_0);
	                p8.writeNoException();
	                break;
	            case 1598968902:
	                p8.writeString("com.google.android.gms.signin.internal.ISignInService");
	                break;
	            default:
	                v2 = super.onTransact(p6, p7, p8, p9);
	        }
	        return v2;
	    }
	
