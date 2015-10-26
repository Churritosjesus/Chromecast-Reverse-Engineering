	
	    public static cnr a(android.os.IBinder p2)
	    {
	        cnr v0_3;
	        if (p2 != null) {
	            cnr v0_1 = p2.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
	            if ((v0_1 == null) || (!(v0_1 instanceof cnr))) {
	                v0_3 = new cnt(p2);
	            } else {
	                v0_3 = ((cnr) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p4, android.os.Parcel p5, android.os.Parcel p6, int p7)
	    {
	        int v0_1;
	        switch (p4) {
	            case 1:
	                p5.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
	                this.a(p5.readInt(), p5.createStringArray());
	                p6.writeNoException();
	                v0_1 = 1;
	                break;
	            case 2:
	                p5.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
	                this.b(p5.readInt(), p5.createStringArray());
	                p6.writeNoException();
	                v0_1 = 1;
	                break;
	            case 3:
	                int v0_4;
	                p5.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
	                int v2_0 = p5.readInt();
	                if (p5.readInt() == 0) {
	                    v0_4 = 0;
	                } else {
	                    v0_4 = ((android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(p5));
	                }
	                this.a(v2_0, v0_4);
	                p6.writeNoException();
	                v0_1 = 1;
	                break;
	            case 1598968902:
	                p6.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
	                v0_1 = 1;
	                break;
	            default:
	                v0_1 = super.onTransact(p4, p5, p6, p7);
	        }
	        return v0_1;
	    }
	
