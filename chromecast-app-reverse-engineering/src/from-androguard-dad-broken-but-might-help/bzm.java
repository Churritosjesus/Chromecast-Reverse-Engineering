	
	    public static bzl a(android.os.IBinder p2)
	    {
	        bzl v0_3;
	        if (p2 != null) {
	            bzl v0_1 = p2.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	            if ((v0_1 == null) || (!(v0_1 instanceof bzl))) {
	                v0_3 = new bzn(p2);
	            } else {
	                v0_3 = ((bzl) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p12, android.os.Parcel p13, android.os.Parcel p14, int p15)
	    {
	        int v0_2;
	        int v0_0 = 0;
	        switch (p12) {
	            case 1:
	                android.os.Bundle v7_2;
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_97 = bzj.a(p13.readStrongBinder());
	                int v2_42 = p13.readInt();
	                String v3_27 = p13.readString();
	                int v4_26 = p13.readString();
	                android.os.Bundle v5_7 = p13.createStringArray();
	                android.os.Bundle v6_6 = p13.readString();
	                if (p13.readInt() == 0) {
	                    v7_2 = 0;
	                } else {
	                    v7_2 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.a(v1_97, v2_42, v3_27, v4_26, v5_7, v6_6, v7_2);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 2:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_94 = bzj.a(p13.readStrongBinder());
	                int v2_41 = p13.readInt();
	                String v3_26 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.a(v1_94, v2_41, v3_26, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 3:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.a(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 4:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.a(bzj.a(p13.readStrongBinder()), p13.readInt());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 5:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_89 = bzj.a(p13.readStrongBinder());
	                int v2_39 = p13.readInt();
	                String v3_25 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.b(v1_89, v2_39, v3_25, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 6:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_86 = bzj.a(p13.readStrongBinder());
	                int v2_38 = p13.readInt();
	                String v3_24 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.c(v1_86, v2_38, v3_24, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 7:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_83 = bzj.a(p13.readStrongBinder());
	                int v2_37 = p13.readInt();
	                String v3_23 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.d(v1_83, v2_37, v3_23, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 8:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_80 = bzj.a(p13.readStrongBinder());
	                int v2_36 = p13.readInt();
	                String v3_22 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.e(v1_80, v2_36, v3_22, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 9:
	                android.os.Bundle v9_1;
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_77 = bzj.a(p13.readStrongBinder());
	                int v2_35 = p13.readInt();
	                String v3_21 = p13.readString();
	                int v4_20 = p13.readString();
	                android.os.Bundle v5_6 = p13.createStringArray();
	                android.os.Bundle v6_5 = p13.readString();
	                android.os.Bundle v7_0 = p13.readStrongBinder();
	                String v8 = p13.readString();
	                if (p13.readInt() == 0) {
	                    v9_1 = 0;
	                } else {
	                    v9_1 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.a(v1_77, v2_35, v3_21, v4_20, v5_6, v6_5, v7_0, v8, v9_1);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 10:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.a(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString(), p13.readString(), p13.createStringArray());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 11:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_73 = bzj.a(p13.readStrongBinder());
	                int v2_33 = p13.readInt();
	                String v3_19 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.f(v1_73, v2_33, v3_19, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 12:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_70 = bzj.a(p13.readStrongBinder());
	                int v2_32 = p13.readInt();
	                String v3_18 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.g(v1_70, v2_32, v3_18, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 13:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_67 = bzj.a(p13.readStrongBinder());
	                int v2_31 = p13.readInt();
	                String v3_17 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.h(v1_67, v2_31, v3_17, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 14:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_64 = bzj.a(p13.readStrongBinder());
	                int v2_30 = p13.readInt();
	                String v3_16 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.i(v1_64, v2_30, v3_16, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 15:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_61 = bzj.a(p13.readStrongBinder());
	                int v2_29 = p13.readInt();
	                String v3_15 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.j(v1_61, v2_29, v3_15, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 16:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_58 = bzj.a(p13.readStrongBinder());
	                int v2_28 = p13.readInt();
	                String v3_14 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.k(v1_58, v2_28, v3_14, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 17:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_55 = bzj.a(p13.readStrongBinder());
	                int v2_27 = p13.readInt();
	                String v3_13 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.l(v1_55, v2_27, v3_13, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 18:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_52 = bzj.a(p13.readStrongBinder());
	                int v2_26 = p13.readInt();
	                String v3_12 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.m(v1_52, v2_26, v3_12, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 19:
	                android.os.Bundle v5_4;
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_49 = bzj.a(p13.readStrongBinder());
	                int v2_25 = p13.readInt();
	                String v3_11 = p13.readString();
	                int v4_10 = p13.readStrongBinder();
	                if (p13.readInt() == 0) {
	                    v5_4 = 0;
	                } else {
	                    v5_4 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.a(v1_49, v2_25, v3_11, v4_10, v5_4);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 20:
	                android.os.Bundle v6_4;
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_46 = bzj.a(p13.readStrongBinder());
	                int v2_24 = p13.readInt();
	                String v3_10 = p13.readString();
	                int v4_9 = p13.createStringArray();
	                android.os.Bundle v5_2 = p13.readString();
	                if (p13.readInt() == 0) {
	                    v6_4 = 0;
	                } else {
	                    v6_4 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.a(v1_46, v2_24, v3_10, v4_9, v5_2, v6_4);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 21:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.b(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 22:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.c(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 23:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_41 = bzj.a(p13.readStrongBinder());
	                int v2_21 = p13.readInt();
	                String v3_9 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.n(v1_41, v2_21, v3_9, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 24:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.d(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 25:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_37 = bzj.a(p13.readStrongBinder());
	                int v2_19 = p13.readInt();
	                String v3_8 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.o(v1_37, v2_19, v3_8, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 26:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.e(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 27:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_33 = bzj.a(p13.readStrongBinder());
	                int v2_17 = p13.readInt();
	                String v3_7 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.p(v1_33, v2_17, v3_7, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 28:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.a();
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 30:
	                android.os.Bundle v6_2;
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_30 = bzj.a(p13.readStrongBinder());
	                int v2_16 = p13.readInt();
	                String v3_6 = p13.readString();
	                int v4_5 = p13.readString();
	                android.os.Bundle v5_1 = p13.createStringArray();
	                if (p13.readInt() == 0) {
	                    v6_2 = 0;
	                } else {
	                    v6_2 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.a(v1_30, v2_16, v3_6, v4_5, v5_1, v6_2);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 31:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.f(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 32:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.g(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 33:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.a(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString(), p13.readString(), p13.readString(), p13.createStringArray());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 34:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.a(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 35:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.h(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 36:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.i(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 37:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_21 = bzj.a(p13.readStrongBinder());
	                int v2_9 = p13.readInt();
	                String v3_3 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.q(v1_21, v2_9, v3_3, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 38:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_18 = bzj.a(p13.readStrongBinder());
	                int v2_8 = p13.readInt();
	                String v3_2 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.r(v1_18, v2_8, v3_2, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 40:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.j(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 41:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_14 = bzj.a(p13.readStrongBinder());
	                int v2_6 = p13.readInt();
	                String v3_1 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.s(v1_14, v2_6, v3_1, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 42:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.k(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 43:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_10 = bzj.a(p13.readStrongBinder());
	                int v2_4 = p13.readInt();
	                String v3_0 = p13.readString();
	                if (p13.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p13));
	                }
	                this.t(v1_10, v2_4, v3_0, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 44:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.l(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 45:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                this.m(bzj.a(p13.readStrongBinder()), p13.readInt(), p13.readString());
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 46:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_5 = bzj.a(p13.readStrongBinder());
	                if (p13.readInt() != 0) {
	                    v0_0 = ((com.google.android.gms.common.internal.GetServiceRequest) com.google.android.gms.common.internal.GetServiceRequest.CREATOR.createFromParcel(p13));
	                }
	                this.a(v1_5, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 47:
	                p13.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	                bzi v1_2 = bzj.a(p13.readStrongBinder());
	                if (p13.readInt() != 0) {
	                    v0_0 = ((com.google.android.gms.common.internal.ValidateAccountRequest) com.google.android.gms.common.internal.ValidateAccountRequest.CREATOR.createFromParcel(p13));
	                }
	                this.a(v1_2, v0_0);
	                p14.writeNoException();
	                v0_2 = 1;
	                break;
	            case 1598968902:
	                p14.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
	                v0_2 = 1;
	                break;
	            default:
	                v0_2 = super.onTransact(p12, p13, p14, p15);
	        }
	        return v0_2;
	    }
	
