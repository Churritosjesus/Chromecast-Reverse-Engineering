	
	    public bus()
	    {
	        this.attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	        return;
	    }
	
	
	    public android.os.IBinder asBinder()
	    {
	        return this;
	    }
	
	
	    public boolean onTransact(int p6, android.os.Parcel p7, android.os.Parcel p8, int p9)
	    {
	        com.google.android.gms.cast.internal.DeviceStatus v0_0 = 0;
	        boolean v2 = 1;
	        switch (p6) {
	            case 1:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                this.a(p7.readInt());
	                break;
	            case 2:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                if (p7.readInt() != 0) {
	                    v0_0 = ((com.google.android.gms.cast.ApplicationMetadata) com.google.android.gms.cast.ApplicationMetadata.CREATOR.createFromParcel(p7));
	                }
	                int v1_9;
	                String v3_1 = p7.readString();
	                String v4 = p7.readString();
	                if (p7.readInt() == 0) {
	                    v1_9 = 0;
	                } else {
	                    v1_9 = 1;
	                }
	                this.a(v0_0, v3_1, v4, v1_9);
	                break;
	            case 3:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                this.b(p7.readInt());
	                break;
	            case 4:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                p7.readString();
	                p7.readDouble();
	                p7.readInt();
	                this.b();
	                break;
	            case 5:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                this.a(p7.readString(), p7.readString());
	                break;
	            case 6:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                this.a(p7.readString(), p7.createByteArray());
	                break;
	            case 7:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                this.d(p7.readInt());
	                break;
	            case 8:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                this.c(p7.readInt());
	                break;
	            case 9:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                this.e(p7.readInt());
	                break;
	            case 10:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                p7.readString();
	                this.a(p7.readLong(), p7.readInt());
	                break;
	            case 11:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                p7.readString();
	                this.a(p7.readLong());
	                break;
	            case 12:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                if (p7.readInt() != 0) {
	                    v0_0 = ((com.google.android.gms.cast.internal.ApplicationStatus) com.google.android.gms.cast.internal.ApplicationStatus.CREATOR.createFromParcel(p7));
	                }
	                this.a(v0_0);
	                break;
	            case 13:
	                p7.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                if (p7.readInt() != 0) {
	                    v0_0 = ((com.google.android.gms.cast.internal.DeviceStatus) com.google.android.gms.cast.internal.DeviceStatus.CREATOR.createFromParcel(p7));
	                }
	                this.a(v0_0);
	                break;
	            case 1598968902:
	                p8.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	                break;
	            default:
	                v2 = super.onTransact(p6, p7, p8, p9);
	        }
	        return v2;
	    }
	
