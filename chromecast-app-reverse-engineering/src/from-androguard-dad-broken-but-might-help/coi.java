	
	    public coi()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.location.GeofencingRequest p4, android.os.Parcel p5)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.a(p5, 1, p4.b, 0);
	        a.c(p5, 1000, p4.a);
	        a.c(p5, 2, p4.c);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p7)
	    {
	        l v0_0 = 0;
	        com.google.android.gms.location.GeofencingRequest v3_0 = a.a(p7);
	        String v1_0 = 0;
	        String v2_0 = 0;
	        while (p7.dataPosition() < v3_0) {
	            int v4_2 = p7.readInt();
	            switch ((65535 & v4_2)) {
	                case 1:
	                    v1_0 = a.c(p7, v4_2, com.google.android.gms.location.internal.ParcelableGeofence.CREATOR);
	                    break;
	                case 2:
	                    v0_0 = a.d(p7, v4_2);
	                    break;
	                case 1000:
	                    v2_0 = a.d(p7, v4_2);
	                    break;
	                default:
	                    a.b(p7, v4_2);
	            }
	        }
	        if (p7.dataPosition() == v3_0) {
	            return new com.google.android.gms.location.GeofencingRequest(v2_0, v1_0, v0_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v3_0).toString(), p7);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.GeofencingRequest[] v0 = new com.google.android.gms.location.GeofencingRequest[p2];
	        return v0;
	    }
	
