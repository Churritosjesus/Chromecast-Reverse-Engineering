	
	    public static cnu a(android.os.IBinder p2)
	    {
	        cnu v0_3;
	        if (p2 != null) {
	            cnu v0_1 = p2.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	            if ((v0_1 == null) || (!(v0_1 instanceof cnu))) {
	                v0_3 = new cnw(p2);
	            } else {
	                v0_3 = ((cnu) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p7, android.os.Parcel p8, android.os.Parcel p9, int p10)
	    {
	        String v2_0 = 0;
	        cnx v1_0 = 0;
	        boolean v3 = 1;
	        switch (p7) {
	            case 1:
	                cnx v0_118;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                String v2_8 = p8.createTypedArrayList(com.google.android.gms.location.internal.ParcelableGeofence.CREATOR);
	                if (p8.readInt() == 0) {
	                    v0_118 = 0;
	                } else {
	                    v0_118 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p8));
	                }
	                this.a(v2_8, v0_118, cns.a(p8.readStrongBinder()), p8.readString());
	                p9.writeNoException();
	                break;
	            case 2:
	                cnx v0_112;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() == 0) {
	                    v0_112 = 0;
	                } else {
	                    v0_112 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p8));
	                }
	                this.a(v0_112, cns.a(p8.readStrongBinder()), p8.readString());
	                p9.writeNoException();
	                break;
	            case 3:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                this.a(p8.createStringArray(), cns.a(p8.readStrongBinder()), p8.readString());
	                p9.writeNoException();
	                break;
	            case 4:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                this.a(cns.a(p8.readStrongBinder()), p8.readString());
	                p9.writeNoException();
	                break;
	            case 5:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                android.os.IBinder v4_2 = p8.readLong();
	                if (p8.readInt() != 0) {
	                    v2_0 = 1;
	                }
	                cnx v0_102;
	                if (p8.readInt() == 0) {
	                    v0_102 = 0;
	                } else {
	                    v0_102 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p8));
	                }
	                this.a(v4_2, v2_0, v0_102);
	                p9.writeNoException();
	                break;
	            case 6:
	                cnx v0_96;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() == 0) {
	                    v0_96 = 0;
	                } else {
	                    v0_96 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p8));
	                }
	                this.a(v0_96);
	                p9.writeNoException();
	                break;
	            case 7:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                cnx v0_93 = this.a();
	                p9.writeNoException();
	                if (v0_93 == null) {
	                    p9.writeInt(0);
	                } else {
	                    p9.writeInt(1);
	                    v0_93.writeToParcel(p9, 1);
	                }
	                break;
	            case 8:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() != 0) {
	                    v1_0 = cng.a(p8);
	                }
	                this.a(v1_0, coo.a(p8.readStrongBinder()));
	                p9.writeNoException();
	                break;
	            case 9:
	                String v2_5;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() == 0) {
	                    v2_5 = 0;
	                } else {
	                    v2_5 = cng.a(p8);
	                }
	                cnx v0_85;
	                if (p8.readInt() == 0) {
	                    v0_85 = 0;
	                } else {
	                    v0_85 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p8));
	                }
	                this.a(v2_5, v0_85);
	                p9.writeNoException();
	                break;
	            case 10:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                this.a(coo.a(p8.readStrongBinder()));
	                p9.writeNoException();
	                break;
	            case 11:
	                cnx v0_75;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() == 0) {
	                    v0_75 = 0;
	                } else {
	                    v0_75 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p8));
	                }
	                this.c(v0_75);
	                p9.writeNoException();
	                break;
	            case 12:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() != 0) {
	                    v2_0 = 1;
	                }
	                this.a(v2_0);
	                p9.writeNoException();
	                break;
	            case 13:
	                cnx v0_68;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() == 0) {
	                    v0_68 = 0;
	                } else {
	                    v0_68 = ((android.location.Location) android.location.Location.CREATOR.createFromParcel(p8));
	                }
	                this.a(v0_68);
	                p9.writeNoException();
	                break;
	            case 20:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() != 0) {
	                    v1_0 = cng.a(p8);
	                }
	                this.a(v1_0, coo.a(p8.readStrongBinder()), p8.readString());
	                p9.writeNoException();
	                break;
	            case 21:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                cnx v0_61 = this.b(p8.readString());
	                p9.writeNoException();
	                if (v0_61 == null) {
	                    p9.writeInt(0);
	                } else {
	                    p9.writeInt(1);
	                    v0_61.writeToParcel(p9, 1);
	                }
	                break;
	            case 26:
	                cnx v0_56;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() == 0) {
	                    v0_56 = 0;
	                } else {
	                    v0_56 = ((android.location.Location) android.location.Location.CREATOR.createFromParcel(p8));
	                }
	                this.a(v0_56, p8.readInt());
	                p9.writeNoException();
	                break;
	            case 34:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                cnx v0_53 = this.c(p8.readString());
	                p9.writeNoException();
	                if (v0_53 == null) {
	                    p9.writeInt(0);
	                } else {
	                    p9.writeInt(1);
	                    v0_53.writeToParcel(p9, 1);
	                }
	                break;
	            case 51:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                cnx v0_50 = this.b();
	                p9.writeNoException();
	                p9.writeStrongBinder(v0_50);
	                break;
	            case 52:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() != 0) {
	                    v1_0 = coe.a(p8);
	                }
	                this.a(v1_0, coo.a(p8.readStrongBinder()));
	                p9.writeNoException();
	                break;
	            case 53:
	                String v2_3;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() == 0) {
	                    v2_3 = 0;
	                } else {
	                    v2_3 = coe.a(p8);
	                }
	                cnx v0_42;
	                if (p8.readInt() == 0) {
	                    v0_42 = 0;
	                } else {
	                    v0_42 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p8));
	                }
	                this.a(v2_3, v0_42);
	                p9.writeNoException();
	                break;
	            case 57:
	                String v2_2;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() == 0) {
	                    v2_2 = 0;
	                } else {
	                    v2_2 = ((com.google.android.gms.location.GeofencingRequest) com.google.android.gms.location.GeofencingRequest.CREATOR.createFromParcel(p8));
	                }
	                cnx v0_35;
	                if (p8.readInt() == 0) {
	                    v0_35 = 0;
	                } else {
	                    v0_35 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p8));
	                }
	                this.a(v2_2, v0_35, cns.a(p8.readStrongBinder()));
	                p9.writeNoException();
	                break;
	            case 59:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() != 0) {
	                    v1_0 = cof.a(p8);
	                }
	                this.a(v1_0);
	                p9.writeNoException();
	                break;
	            case 60:
	                android.os.IBinder v4_1;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() == 0) {
	                    v4_1 = 0;
	                } else {
	                    v4_1 = coj.a(p8);
	                }
	                cnx v0_23;
	                if (p8.readInt() == 0) {
	                    v0_23 = 0;
	                } else {
	                    v0_23 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p8));
	                }
	                cnx v0_26 = this.a(v4_1, v0_23);
	                p9.writeNoException();
	                if (v0_26 == null) {
	                    p9.writeInt(0);
	                } else {
	                    p9.writeInt(1);
	                    v0_26.writeToParcel(p9, 1);
	                }
	                break;
	            case 61:
	                cnx v0_15;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() == 0) {
	                    v0_15 = 0;
	                } else {
	                    v0_15 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p8));
	                }
	                cnx v0_18 = this.b(v0_15);
	                p9.writeNoException();
	                if (v0_18 == null) {
	                    p9.writeInt(0);
	                } else {
	                    p9.writeInt(1);
	                    v0_18.writeToParcel(p9, 1);
	                }
	                break;
	            case 63:
	                String v2_1;
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                if (p8.readInt() == 0) {
	                    v2_1 = 0;
	                } else {
	                    v2_1 = ((com.google.android.gms.location.LocationSettingsRequest) com.google.android.gms.location.LocationSettingsRequest.CREATOR.createFromParcel(p8));
	                }
	                android.os.IBinder v4_0 = p8.readStrongBinder();
	                if (v4_0 != null) {
	                    cnx v0_10 = v4_0.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
	                    if ((v0_10 == null) || (!(v0_10 instanceof cnx))) {
	                        v1_0 = new cnz(v4_0);
	                    } else {
	                        v1_0 = ((cnx) v0_10);
	                    }
	                }
	                this.a(v2_1, v1_0, p8.readString());
	                p9.writeNoException();
	                break;
	            case 64:
	                p8.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                cnx v0_3 = this.a(p8.readString());
	                p9.writeNoException();
	                if (v0_3 == null) {
	                    p9.writeInt(0);
	                } else {
	                    p9.writeInt(1);
	                    v0_3.writeToParcel(p9, 1);
	                }
	                break;
	            case 1598968902:
	                p9.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
	                break;
	            default:
	                v3 = super.onTransact(p7, p8, p9, p10);
	        }
	        return v3;
	    }
	
