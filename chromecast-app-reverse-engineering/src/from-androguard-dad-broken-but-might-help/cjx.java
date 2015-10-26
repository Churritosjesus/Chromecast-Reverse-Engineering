	
	    public static cjw a(android.os.IBinder p2)
	    {
	        cjw v0_3;
	        if (p2 != null) {
	            cjw v0_1 = p2.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	            if ((v0_1 == null) || (!(v0_1 instanceof cjw))) {
	                v0_3 = new cjy(p2);
	            } else {
	                v0_3 = ((cjw) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p8, android.os.Parcel p9, android.os.Parcel p10, int p11)
	    {
	        boolean v2_0 = 0;
	        android.view.Surface v4 = 0;
	        boolean v6 = 1;
	        switch (p8) {
	            case 1:
	                p9.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	                cjz v1_2 = cju.a(p9.readStrongBinder());
	                if (p9.readInt() != 0) {
	                    v2_0 = 1;
	                }
	                boolean v3_2 = p9.readString();
	                if (p9.readInt() != 0) {
	                    v4 = ((android.view.Surface) android.view.Surface.CREATOR.createFromParcel(p9));
	                }
	                this.a(v1_2, v2_0, v3_2, v4, p9.readInt());
	                break;
	            case 2:
	                p9.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	                this.a();
	                break;
	            case 3:
	                p9.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	                this.b();
	                break;
	            case 4:
	                cjz v1_1;
	                p9.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	                boolean v2_1 = cju.a(p9.readStrongBinder());
	                cjz v1_0 = p9.readStrongBinder();
	                if (v1_0 != null) {
	                    cjz v0_13 = v1_0.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
	                    if ((v0_13 == null) || (!(v0_13 instanceof cjz))) {
	                        v1_1 = new ckb(v1_0);
	                    } else {
	                        v1_1 = ((cjz) v0_13);
	                    }
	                } else {
	                    v1_1 = 0;
	                }
	                cjz v0_18;
	                boolean v3_1 = p9.readString();
	                if (p9.readInt() == 0) {
	                    v0_18 = 0;
	                } else {
	                    v0_18 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p9));
	                }
	                this.a(v2_1, v1_1, v3_1, v0_18);
	                break;
	            case 5:
	                p9.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	                this.a(cju.a(p9.readStrongBinder()));
	                break;
	            case 6:
	                p9.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	                this.b(cju.a(p9.readStrongBinder()));
	                break;
	            case 7:
	                p9.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	                if (p9.readInt() != 0) {
	                    v2_0 = 1;
	                }
	                this.a(v2_0, p9.readString());
	                break;
	            case 1598968902:
	                p10.writeString("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
	                break;
	            default:
	                v6 = super.onTransact(p8, p9, p10, p11);
	        }
	        return v6;
	    }
	
