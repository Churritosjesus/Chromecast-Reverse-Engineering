	
	    public static buo a(android.os.IBinder p2)
	    {
	        buo v0_3;
	        if (p2 != null) {
	            buo v0_1 = p2.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	            if ((v0_1 == null) || (!(v0_1 instanceof buo))) {
	                v0_3 = new buq(p2);
	            } else {
	                v0_3 = ((buo) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p9, android.os.Parcel p10, android.os.Parcel p11, int p12)
	    {
	        boolean v0_0 = 0;
	        boolean v7 = 1;
	        switch (p9) {
	            case 1:
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                this.a();
	                break;
	            case 2:
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                bup v1_11 = p10.readString();
	                if (p10.readInt() != 0) {
	                    v0_0 = 1;
	                }
	                this.a(v1_11, v0_0);
	                break;
	            case 3:
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                this.a(p10.readString(), p10.readString());
	                break;
	            case 4:
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                this.b();
	                break;
	            case 5:
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                this.a(p10.readString());
	                break;
	            case 6:
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                this.c();
	                break;
	            case 7:
	                boolean v6;
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                double v2_3 = p10.readDouble();
	                int v4_1 = p10.readDouble();
	                if (p10.readInt() == 0) {
	                    v6 = 0;
	                } else {
	                    v6 = 1;
	                }
	                this.a(v2_3, v4_1, v6);
	                break;
	            case 8:
	                bup v1_5;
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                if (p10.readInt() == 0) {
	                    v1_5 = 0;
	                } else {
	                    v1_5 = 1;
	                }
	                double v2_2 = p10.readDouble();
	                if (p10.readInt() != 0) {
	                    v0_0 = 1;
	                }
	                this.a(v1_5, v2_2, v0_0);
	                break;
	            case 9:
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                this.a(p10.readString(), p10.readString(), p10.readLong());
	                break;
	            case 10:
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                this.a(p10.readString(), p10.createByteArray(), p10.readLong());
	                break;
	            case 11:
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                this.b(p10.readString());
	                break;
	            case 12:
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                this.c(p10.readString());
	                break;
	            case 13:
	                boolean v0_4;
	                p10.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	                bup v1_0 = p10.readString();
	                if (p10.readInt() == 0) {
	                    v0_4 = 0;
	                } else {
	                    v0_4 = ((com.google.android.gms.cast.LaunchOptions) com.google.android.gms.cast.LaunchOptions.CREATOR.createFromParcel(p10));
	                }
	                this.a(v1_0, v0_4);
	                break;
	            case 1598968902:
	                p11.writeString("com.google.android.gms.cast.internal.ICastDeviceController");
	                break;
	            default:
	                v7 = super.onTransact(p9, p10, p11, p12);
	        }
	        return v7;
	    }
	
