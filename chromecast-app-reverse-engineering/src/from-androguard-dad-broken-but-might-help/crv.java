	
	    public static cru a(android.os.IBinder p2)
	    {
	        cru v0_3;
	        if (p2 != null) {
	            cru v0_1 = p2.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
	            if ((v0_1 == null) || (!(v0_1 instanceof cru))) {
	                v0_3 = new crw(p2);
	            } else {
	                v0_3 = ((cru) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p17, android.os.Parcel p18, android.os.Parcel p19, int p20)
	    {
	        int v2_1;
	        switch (p17) {
	            case 2:
	                int v4_47;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_70 = crs.a(p18.readStrongBinder());
	                if (p18.readInt() == 0) {
	                    v4_47 = 0;
	                } else {
	                    v4_47 = 1;
	                }
	                int v5_38;
	                if (p18.readInt() == 0) {
	                    v5_38 = 0;
	                } else {
	                    v5_38 = 1;
	                }
	                this.a(v3_70, v4_47, v5_38, p18.readString(), p18.readString());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 3:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.a(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readString(), p18.readInt(), p18.readString());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 4:
	                int v9_12;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_68 = crs.a(p18.readStrongBinder());
	                int v4_45 = p18.readString();
	                int v5_36 = p18.readString();
	                String v6_27 = p18.readString();
	                String v7_25 = p18.createStringArrayList();
	                int v8_19 = p18.readInt();
	                if (p18.readInt() == 0) {
	                    v9_12 = 0;
	                } else {
	                    v9_12 = 1;
	                }
	                this.a(v3_68, v4_45, v5_36, v6_27, v7_25, v8_19, v9_12, p18.readLong());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 5:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.a(crs.a(p18.readStrongBinder()), p18.readString(), p18.readInt(), p18.readInt());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 6:
	                int v2_232;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_66 = crs.a(p18.readStrongBinder());
	                int v4_43 = p18.readLong();
	                if (p18.readInt() == 0) {
	                    v2_232 = 0;
	                } else {
	                    v2_232 = 1;
	                }
	                this.a(v3_66, v4_43, v2_232);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 7:
	                String v7_24;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_65 = crs.a(p18.readStrongBinder());
	                int v4_42 = p18.readString();
	                int v5_34 = p18.readString();
	                String v6_26 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v7_24 = 0;
	                } else {
	                    v7_24 = 1;
	                }
	                this.a(v3_65, v4_42, v5_34, v6_26, v7_24);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 8:
	                int v2_220;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                if (p18.readInt() == 0) {
	                    v2_220 = 0;
	                } else {
	                    v2_220 = ((android.net.Uri) android.net.Uri.CREATOR.createFromParcel(p18));
	                }
	                int v2_223 = this.a(v2_220);
	                p19.writeNoException();
	                if (v2_223 == 0) {
	                    p19.writeInt(0);
	                } else {
	                    p19.writeInt(1);
	                    v2_223.writeToParcel(p19, 1);
	                }
	                v2_1 = 1;
	                break;
	            case 9:
	                String v7_23;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_62 = crs.a(p18.readStrongBinder());
	                int v4_41 = p18.readString();
	                int v5_33 = p18.readString();
	                String v6_25 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v7_23 = 0;
	                } else {
	                    v7_23 = 1;
	                }
	                this.a(v3_62, v4_41, v5_33, v6_25, v7_23, p18.readInt());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 10:
	                int v2_213;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_61 = crs.a(p18.readStrongBinder());
	                int v4_40 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v2_213 = 0;
	                } else {
	                    v2_213 = 1;
	                }
	                this.a(v3_61, v4_40, v2_213, p18.createStringArray());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 11:
	                int v4_39;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_58 = crs.a(p18.readStrongBinder());
	                if (p18.readInt() == 0) {
	                    v4_39 = 0;
	                } else {
	                    v4_39 = 1;
	                }
	                int v2_208 = this.a(v3_58, v4_39, p18.readString(), p18.readString(), p18.readInt());
	                p19.writeNoException();
	                if (v2_208 == 0) {
	                    p19.writeInt(0);
	                } else {
	                    p19.writeInt(1);
	                    v2_208.writeToParcel(p19, 1);
	                }
	                v2_1 = 1;
	                break;
	            case 12:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v2_202 = this.a(p18.readString(), p18.readString());
	                p19.writeNoException();
	                if (v2_202 == 0) {
	                    p19.writeInt(0);
	                } else {
	                    p19.writeInt(1);
	                    v2_202.writeToParcel(p19, 1);
	                }
	                v2_1 = 1;
	                break;
	            case 13:
	                int v2_197;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_54 = crs.a(p18.readStrongBinder());
	                int v4_38 = p18.readString();
	                int v5_30 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v2_197 = 0;
	                } else {
	                    v2_197 = ((android.net.Uri) android.net.Uri.CREATOR.createFromParcel(p18));
	                }
	                this.a(v3_54, v4_38, v5_30, v2_197);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 14:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.a(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readString(), p18.createStringArrayList(), p18.createStringArrayList());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 15:
	                int v2_190;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                if (p18.readInt() == 0) {
	                    v2_190 = 0;
	                } else {
	                    v2_190 = 1;
	                }
	                this.a(v2_190);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 16:
	                int v2_187;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v2_186 = this.a();
	                p19.writeNoException();
	                if (v2_186 == 0) {
	                    v2_187 = 0;
	                } else {
	                    v2_187 = 1;
	                }
	                p19.writeInt(v2_187);
	                v2_1 = 1;
	                break;
	            case 17:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v2_183 = this.b(p18.readString(), p18.readString());
	                p19.writeNoException();
	                if (v2_183 == 0) {
	                    p19.writeInt(0);
	                } else {
	                    p19.writeInt(1);
	                    v2_183.writeToParcel(p19, 1);
	                }
	                v2_1 = 1;
	                break;
	            case 18:
	                String v6_22;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_49 = crs.a(p18.readStrongBinder());
	                int v4_36 = p18.readString();
	                int v5_28 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v6_22 = 0;
	                } else {
	                    v6_22 = ((android.net.Uri) android.net.Uri.CREATOR.createFromParcel(p18));
	                }
	                String v7_20;
	                if (p18.readInt() == 0) {
	                    v7_20 = 0;
	                } else {
	                    v7_20 = 1;
	                }
	                this.a(v3_49, v4_36, v5_28, v6_22, v7_20);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 19:
	                int v9_11;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_48 = crs.a(p18.readStrongBinder());
	                int v4_35 = p18.readString();
	                int v5_27 = p18.readString();
	                String v6_21 = p18.readString();
	                String v7_19 = p18.readInt();
	                int v8_16 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v9_11 = 0;
	                } else {
	                    v9_11 = 1;
	                }
	                this.a(v3_48, v4_35, v5_27, v6_21, v7_19, v8_16, v9_11);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 20:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v2_167 = this.a(p18.readString(), p18.readString(), p18.readLong());
	                p19.writeNoException();
	                if (v2_167 == 0) {
	                    p19.writeInt(0);
	                } else {
	                    p19.writeInt(1);
	                    v2_167.writeToParcel(p19, 1);
	                }
	                v2_1 = 1;
	                break;
	            case 21:
	                int v9_10;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_44 = crs.a(p18.readStrongBinder());
	                int v4_33 = p18.readString();
	                int v5_26 = p18.readString();
	                String v6_20 = p18.readString();
	                String v7_18 = p18.createStringArrayList();
	                int v8_15 = p18.readInt();
	                if (p18.readInt() == 0) {
	                    v9_10 = 0;
	                } else {
	                    v9_10 = 1;
	                }
	                this.a(v3_44, v4_33, v5_26, v6_20, v7_18, v8_15, v9_10, p18.readLong(), p18.readString(), p18.readInt());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 22:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.b(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readString(), p18.readInt(), p18.readString());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 23:
	                int v9_9;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_42 = crs.a(p18.readStrongBinder());
	                int v4_31 = p18.readString();
	                int v5_24 = p18.readString();
	                String v6_18 = p18.readString();
	                String v7_16 = p18.createStringArrayList();
	                int v8_13 = p18.createStringArrayList();
	                if (p18.readInt() == 0) {
	                    v9_9 = 0;
	                } else {
	                    v9_9 = bzu.a(p18);
	                }
	                this.a(v3_42, v4_31, v5_24, v6_18, v7_16, v8_13, v9_9);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 24:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.a(crs.a(p18.readStrongBinder()), p18.readString());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 25:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.a(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 26:
	                int v8_12;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v4_29 = p18.readString();
	                int v5_23 = p18.readString();
	                String v6_17 = p18.readLong();
	                if (p18.readInt() == 0) {
	                    v8_12 = 0;
	                } else {
	                    v8_12 = 1;
	                }
	                int v2_146 = this.a(v4_29, v5_23, v6_17, v8_12);
	                p19.writeNoException();
	                if (v2_146 == 0) {
	                    p19.writeInt(0);
	                } else {
	                    p19.writeInt(1);
	                    v2_146.writeToParcel(p19, 1);
	                }
	                v2_1 = 1;
	                break;
	            case 27:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.a(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readString(), p18.readString());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 28:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.a(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readString(), p18.createStringArrayList());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 29:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.a(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readInt(), p18.readInt());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 101:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.b(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 102:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.c(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 201:
	                String v7_12;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_31 = crs.a(p18.readStrongBinder());
	                int v4_23 = p18.readString();
	                int v5_19 = p18.readString();
	                String v6_13 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v7_12 = 0;
	                } else {
	                    v7_12 = 1;
	                }
	                this.a(v3_31, v4_23, v5_19, v6_13, v7_12, p18.readInt(), p18.readInt());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 202:
	                int v8_10;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_30 = crs.a(p18.readStrongBinder());
	                int v4_22 = p18.readString();
	                int v5_18 = p18.readString();
	                String v6_12 = p18.readString();
	                String v7_11 = p18.readInt();
	                if (p18.readInt() == 0) {
	                    v8_10 = 0;
	                } else {
	                    v8_10 = 1;
	                }
	                this.a(v3_30, v4_22, v5_18, v6_12, v7_11, v8_10, p18.readInt(), p18.readInt(), p18.readString());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 203:
	                int v8_9;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_29 = crs.a(p18.readStrongBinder());
	                int v4_21 = p18.readString();
	                int v5_17 = p18.readString();
	                String v6_11 = p18.readString();
	                String v7_10 = p18.readInt();
	                if (p18.readInt() == 0) {
	                    v8_9 = 0;
	                } else {
	                    v8_9 = 1;
	                }
	                int v12_4;
	                int v9_6 = p18.readInt();
	                int v10_4 = p18.readInt();
	                int v11_2 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v12_4 = 0;
	                } else {
	                    v12_4 = 1;
	                }
	                this.a(v3_29, v4_21, v5_17, v6_11, v7_10, v8_9, v9_6, v10_4, v11_2, v12_4);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 204:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.a(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readString());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 205:
	                int v8_8;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v4_19 = p18.readString();
	                int v5_15 = p18.readString();
	                String v6_10 = p18.readLong();
	                if (p18.readInt() == 0) {
	                    v8_8 = 0;
	                } else {
	                    v8_8 = 1;
	                }
	                int v9_5;
	                if (p18.readInt() == 0) {
	                    v9_5 = 0;
	                } else {
	                    v9_5 = 1;
	                }
	                int v2_111 = this.a(v4_19, v5_15, v6_10, v8_8, v9_5);
	                p19.writeNoException();
	                if (v2_111 == 0) {
	                    p19.writeInt(0);
	                } else {
	                    p19.writeInt(1);
	                    v2_111.writeToParcel(p19, 1);
	                }
	                v2_1 = 1;
	                break;
	            case 301:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.b(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readInt());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 302:
	                int v2_102;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_23 = crs.a(p18.readStrongBinder());
	                if (p18.readInt() == 0) {
	                    v2_102 = 0;
	                } else {
	                    v2_102 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p18));
	                }
	                this.a(v3_23, v2_102);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 303:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.a(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readString(), p18.readString(), p18.readInt(), p18.readString());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 304:
	                int v2_93;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_21 = crs.a(p18.readStrongBinder());
	                if (p18.readInt() == 0) {
	                    v2_93 = 0;
	                } else {
	                    v2_93 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p18));
	                }
	                this.b(v3_21, v2_93);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 305:
	                int v4_16;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_20 = crs.a(p18.readStrongBinder());
	                if (p18.readInt() == 0) {
	                    v4_16 = 0;
	                } else {
	                    v4_16 = 1;
	                }
	                int v5_12;
	                if (p18.readInt() == 0) {
	                    v5_12 = 0;
	                } else {
	                    v5_12 = 1;
	                }
	                this.a(v3_20, v4_16, v5_12, p18.readString(), p18.readString(), p18.readInt());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 401:
	                int v9_3;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_19 = crs.a(p18.readStrongBinder());
	                int v4_15 = p18.readString();
	                int v5_11 = p18.readString();
	                String v6_7 = p18.readString();
	                String v7_7 = p18.createStringArrayList();
	                int v8_5 = p18.readInt();
	                if (p18.readInt() == 0) {
	                    v9_3 = 0;
	                } else {
	                    v9_3 = 1;
	                }
	                this.a(v3_19, v4_15, v5_11, v6_7, v7_7, v8_5, v9_3, p18.readLong(), p18.readString(), p18.readInt(), p18.readInt());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 402:
	                int v8_4;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_18 = crs.a(p18.readStrongBinder());
	                int v4_14 = p18.readString();
	                int v5_10 = p18.readString();
	                String v6_6 = p18.readString();
	                String v7_6 = p18.readInt();
	                if (p18.readInt() == 0) {
	                    v8_4 = 0;
	                } else {
	                    v8_4 = 1;
	                }
	                int v12_2;
	                int v9_2 = p18.readInt();
	                int v10_2 = p18.readInt();
	                int v11_1 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v12_2 = 0;
	                } else {
	                    v12_2 = 1;
	                }
	                this.a(v3_18, v4_14, v5_10, v6_6, v7_6, v8_4, v9_2, v10_2, v11_1, v12_2, p18.readInt(), p18.readInt());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 403:
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                this.a(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readInt());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 404:
	                int v9_1;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_16 = crs.a(p18.readStrongBinder());
	                int v4_12 = p18.readString();
	                int v5_8 = p18.readString();
	                String v6_5 = p18.readString();
	                String v7_5 = p18.createStringArrayList();
	                int v8_3 = p18.readInt();
	                if (p18.readInt() == 0) {
	                    v9_1 = 0;
	                } else {
	                    v9_1 = 1;
	                }
	                this.a(v3_16, v4_12, v5_8, v6_5, v7_5, v8_3, v9_1, p18.readLong(), p18.readString(), p18.readInt(), p18.readInt(), p18.readInt());
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 501:
	                int v2_68;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v4_11 = crs.a(p18.readStrongBinder());
	                if (p18.readInt() == 0) {
	                    v2_68 = 0;
	                } else {
	                    v2_68 = cri.a(p18);
	                }
	                int v3_15;
	                int v5_7 = p18.createStringArrayList();
	                if (p18.readInt() == 0) {
	                    v3_15 = 0;
	                } else {
	                    v3_15 = crn.a(p18);
	                }
	                this.a(v4_11, v2_68, v5_7, v3_15);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 502:
	                int v2_64;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v2_63 = this.b(crs.a(p18.readStrongBinder()), p18.readString(), p18.readInt(), p18.readInt());
	                p19.writeNoException();
	                if (v2_63 == 0) {
	                    v2_64 = 0;
	                } else {
	                    v2_64 = v2_63.asBinder();
	                }
	                p19.writeStrongBinder(v2_64);
	                v2_1 = 1;
	                break;
	            case 503:
	                int v2_57;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_12 = crs.a(p18.readStrongBinder());
	                int v4_9 = p18.readLong();
	                if (p18.readInt() == 0) {
	                    v2_57 = 0;
	                } else {
	                    v2_57 = 1;
	                }
	                int v2_59;
	                int v2_58 = this.b(v3_12, v4_9, v2_57);
	                p19.writeNoException();
	                if (v2_58 == 0) {
	                    v2_59 = 0;
	                } else {
	                    v2_59 = v2_58.asBinder();
	                }
	                p19.writeStrongBinder(v2_59);
	                v2_1 = 1;
	                break;
	            case 504:
	                int v2_53;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v2_52 = this.b(crs.a(p18.readStrongBinder()), p18.readString());
	                p19.writeNoException();
	                if (v2_52 == 0) {
	                    v2_53 = 0;
	                } else {
	                    v2_53 = v2_52.asBinder();
	                }
	                p19.writeStrongBinder(v2_53);
	                v2_1 = 1;
	                break;
	            case 505:
	                int v2_48;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v2_47 = this.b(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readInt(), p18.readInt());
	                p19.writeNoException();
	                if (v2_47 == 0) {
	                    v2_48 = 0;
	                } else {
	                    v2_48 = v2_47.asBinder();
	                }
	                p19.writeStrongBinder(v2_48);
	                v2_1 = 1;
	                break;
	            case 506:
	                int v2_43;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v2_42 = this.c(crs.a(p18.readStrongBinder()), p18.readString(), p18.readString(), p18.readInt());
	                p19.writeNoException();
	                if (v2_42 == 0) {
	                    v2_43 = 0;
	                } else {
	                    v2_43 = v2_42.asBinder();
	                }
	                p19.writeStrongBinder(v2_43);
	                v2_1 = 1;
	                break;
	            case 507:
	                String v6_3;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_8 = crs.a(p18.readStrongBinder());
	                int v4_6 = p18.readString();
	                int v5_3 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v6_3 = 0;
	                } else {
	                    v6_3 = 1;
	                }
	                int v12_0;
	                String v7_3 = p18.readString();
	                int v8_2 = p18.readString();
	                int v9_0 = p18.readInt();
	                int v10_0 = p18.readInt();
	                int v11_0 = p18.readInt();
	                if (p18.readInt() == 0) {
	                    v12_0 = 0;
	                } else {
	                    v12_0 = 1;
	                }
	                int v2_38;
	                int v2_37 = this.a(v3_8, v4_6, v5_3, v6_3, v7_3, v8_2, v9_0, v10_0, v11_0, v12_0);
	                p19.writeNoException();
	                if (v2_37 == 0) {
	                    v2_38 = 0;
	                } else {
	                    v2_38 = v2_37.asBinder();
	                }
	                p19.writeStrongBinder(v2_38);
	                v2_1 = 1;
	                break;
	            case 508:
	                int v2_29;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v4_5 = crs.a(p18.readStrongBinder());
	                if (p18.readInt() == 0) {
	                    v2_29 = 0;
	                } else {
	                    v2_29 = css.a(p18);
	                }
	                int v3_7;
	                if (p18.readInt() == 0) {
	                    v3_7 = 0;
	                } else {
	                    v3_7 = cry.a(p18);
	                }
	                int v2_31;
	                int v2_30 = this.a(v4_5, v2_29, v3_7);
	                p19.writeNoException();
	                if (v2_30 == 0) {
	                    v2_31 = 0;
	                } else {
	                    v2_31 = v2_30.asBinder();
	                }
	                p19.writeStrongBinder(v2_31);
	                v2_1 = 1;
	                break;
	            case 509:
	                int v2_25;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v2_24 = this.a(crs.a(p18.readStrongBinder()), p18.readString(), p18.readInt());
	                p19.writeNoException();
	                if (v2_24 == 0) {
	                    v2_25 = 0;
	                } else {
	                    v2_25 = v2_24.asBinder();
	                }
	                p19.writeStrongBinder(v2_25);
	                v2_1 = 1;
	                break;
	            case 601:
	                int v2_18;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v4_3 = crs.a(p18.readStrongBinder());
	                if (p18.readInt() == 0) {
	                    v2_18 = 0;
	                } else {
	                    v2_18 = cri.a(p18);
	                }
	                int v3_4;
	                if (p18.readInt() == 0) {
	                    v3_4 = 0;
	                } else {
	                    v3_4 = cro.a(p18);
	                }
	                int v2_20;
	                int v2_19 = this.a(v4_3, v2_18, v3_4);
	                p19.writeNoException();
	                if (v2_19 == 0) {
	                    v2_20 = 0;
	                } else {
	                    v2_20 = v2_19.asBinder();
	                }
	                p19.writeStrongBinder(v2_20);
	                v2_1 = 1;
	                break;
	            case 602:
	                int v5_2;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v4_2 = crs.a(p18.readStrongBinder());
	                if (p18.readInt() == 0) {
	                    v5_2 = 0;
	                } else {
	                    v5_2 = byb.a(p18);
	                }
	                int v2_14;
	                int v2_13 = this.a(v4_2, v5_2, p18.readInt(), p18.readInt(), p18.readLong());
	                p19.writeNoException();
	                if (v2_13 == 0) {
	                    v2_14 = 0;
	                } else {
	                    v2_14 = v2_13.asBinder();
	                }
	                p19.writeStrongBinder(v2_14);
	                v2_1 = 1;
	                break;
	            case 603:
	                String v7_1;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_1 = crs.a(p18.readStrongBinder());
	                int v4_1 = p18.readString();
	                int v5_1 = p18.readString();
	                String v6_1 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v7_1 = 0;
	                } else {
	                    v7_1 = 1;
	                }
	                this.b(v3_1, v4_1, v5_1, v6_1, v7_1);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 701:
	                int v8_0;
	                p18.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
	                int v3_0 = crs.a(p18.readStrongBinder());
	                int v4_0 = p18.readString();
	                int v5_0 = p18.readString();
	                String v6_0 = p18.readString();
	                String v7_0 = p18.readString();
	                if (p18.readInt() == 0) {
	                    v8_0 = 0;
	                } else {
	                    v8_0 = 1;
	                }
	                this.a(v3_0, v4_0, v5_0, v6_0, v7_0, v8_0);
	                p19.writeNoException();
	                v2_1 = 1;
	                break;
	            case 1598968902:
	                p19.writeString("com.google.android.gms.people.internal.IPeopleService");
	                v2_1 = 1;
	                break;
	            default:
	                v2_1 = super.onTransact(p17, p18, p19, p20);
	        }
	        return v2_1;
	    }
	
