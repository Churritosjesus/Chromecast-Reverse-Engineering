	
	    public cju()
	    {
	        this.attachInterface(this, "com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
	        return;
	    }
	
	
	    public static cjt a(android.os.IBinder p2)
	    {
	        cjt v0_3;
	        if (p2 != null) {
	            cjt v0_1 = p2.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
	            if ((v0_1 == null) || (!(v0_1 instanceof cjt))) {
	                v0_3 = new cjv(p2);
	            } else {
	                v0_3 = ((cjt) v0_1);
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
	                p4.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
	                this.a();
	                p5.writeNoException();
	                v0_1 = 1;
	                break;
	            case 2:
	                p4.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
	                this.a(p4.readInt());
	                p5.writeNoException();
	                v0_1 = 1;
	                break;
	            case 3:
	                p4.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
	                this.b();
	                p5.writeNoException();
	                v0_1 = 1;
	                break;
	            case 4:
	                int v0_4;
	                p4.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
	                if (p4.readInt() == 0) {
	                    v0_4 = 0;
	                } else {
	                    v0_4 = ((com.google.android.gms.cast.CastDevice) com.google.android.gms.cast.CastDevice.CREATOR.createFromParcel(p4));
	                }
	                this.a(v0_4);
	                p5.writeNoException();
	                v0_1 = 1;
	                break;
	            case 1598968902:
	                p5.writeString("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
	                v0_1 = 1;
	                break;
	            default:
	                v0_1 = super.onTransact(p3, p4, p5, p6);
	        }
	        return v0_1;
	    }
	
