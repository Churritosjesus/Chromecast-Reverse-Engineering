	
	    public static ckp a(android.os.IBinder p2)
	    {
	        ckp v0_3;
	        if (p2 != null) {
	            ckp v0_1 = p2.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
	            if ((v0_1 == null) || (!(v0_1 instanceof ckp))) {
	                v0_3 = new ckr(p2);
	            } else {
	                v0_3 = ((ckp) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p6, android.os.Parcel p7, android.os.Parcel p8, int p9)
	    {
	        ckm v0_1;
	        com.google.android.gms.clearcut.LogEventParcelable v1 = 0;
	        switch (p6) {
	            case 1:
	                ckm v0_6;
	                p7.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
	                int v3_0 = p7.readStrongBinder();
	                if (v3_0 != 0) {
	                    ckm v0_4 = v3_0.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
	                    if ((v0_4 == null) || (!(v0_4 instanceof ckm))) {
	                        v0_6 = new cko(v3_0);
	                    } else {
	                        v0_6 = ((ckm) v0_4);
	                    }
	                } else {
	                    v0_6 = 0;
	                }
	                if (p7.readInt() != 0) {
	                    v1 = bvn.a(p7);
	                }
	                this.a(v0_6, v1);
	                v0_1 = 1;
	                break;
	            case 1598968902:
	                p8.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
	                v0_1 = 1;
	                break;
	            default:
	                v0_1 = super.onTransact(p6, p7, p8, p9);
	        }
	        return v0_1;
	    }
	
