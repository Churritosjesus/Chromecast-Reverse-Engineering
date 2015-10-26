	
	    public crs()
	    {
	        this.attachInterface(this, "com.google.android.gms.people.internal.IPeopleCallbacks");
	        return;
	    }
	
	
	    public static crr a(android.os.IBinder p2)
	    {
	        crr v0_3;
	        if (p2 != null) {
	            crr v0_1 = p2.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
	            if ((v0_1 == null) || (!(v0_1 instanceof crr))) {
	                v0_3 = new crt(p2);
	            } else {
	                v0_3 = ((crr) v0_1);
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
	
	
	    public boolean onTransact(int p7, android.os.Parcel p8, android.os.Parcel p9, int p10)
	    {
	        int v0_1;
	        com.google.android.gms.common.data.DataHolder v2 = 0;
	        switch (p7) {
	            case 1:
	                android.os.Bundle v1_4;
	                p8.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
	                com.google.android.gms.common.data.DataHolder v3_3 = p8.readInt();
	                if (p8.readInt() == 0) {
	                    v1_4 = 0;
	                } else {
	                    v1_4 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p8));
	                }
	                int v0_43;
	                if (p8.readInt() == 0) {
	                    v0_43 = 0;
	                } else {
	                    v0_43 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p8));
	                }
	                this.a(v3_3, v1_4, v0_43);
	                v0_1 = 1;
	                break;
	            case 2:
	                int v0_34;
	                p8.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
	                android.os.Bundle v1_3 = p8.readInt();
	                if (p8.readInt() == 0) {
	                    v0_34 = 0;
	                } else {
	                    v0_34 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p8));
	                }
	                if (p8.readInt() != 0) {
	                    v2 = byb.a(p8);
	                }
	                this.a(v1_3, v0_34, v2);
	                v0_1 = 1;
	                break;
	            case 3:
	                android.os.Bundle v1_2;
	                p8.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
	                com.google.android.gms.common.data.DataHolder v3_1 = p8.readInt();
	                if (p8.readInt() == 0) {
	                    v1_2 = 0;
	                } else {
	                    v1_2 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p8));
	                }
	                int v0_29;
	                if (p8.readInt() == 0) {
	                    v0_29 = 0;
	                } else {
	                    v0_29 = ((android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(p8));
	                }
	                this.a(v3_1, v1_2, v0_29);
	                v0_1 = 1;
	                break;
	            case 4:
	                p8.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
	                android.os.Bundle v1_1 = p8.readInt();
	                if (p8.readInt() != 0) {
	                    v2 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p8));
	                }
	                this.a(v1_1, v2, ((com.google.android.gms.common.data.DataHolder[]) p8.createTypedArray(com.google.android.gms.common.data.DataHolder.CREATOR)));
	                v0_1 = 1;
	                break;
	            case 5:
	                android.os.Bundle v1_0;
	                p8.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
	                int v5 = p8.readInt();
	                if (p8.readInt() == 0) {
	                    v1_0 = 0;
	                } else {
	                    v1_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p8));
	                }
	                com.google.android.gms.common.data.DataHolder v3_0;
	                if (p8.readInt() == 0) {
	                    v3_0 = 0;
	                } else {
	                    v3_0 = ((android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(p8));
	                }
	                int v0_12;
	                if (p8.readInt() == 0) {
	                    v0_12 = 0;
	                } else {
	                    v0_12 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p8));
	                }
	                this.a(v5, v1_0, v3_0, v0_12);
	                v0_1 = 1;
	                break;
	            case 1598968902:
	                p9.writeString("com.google.android.gms.people.internal.IPeopleCallbacks");
	                v0_1 = 1;
	                break;
	            default:
	                v0_1 = super.onTransact(p7, p8, p9, p10);
	        }
	        return v0_1;
	    }
	
