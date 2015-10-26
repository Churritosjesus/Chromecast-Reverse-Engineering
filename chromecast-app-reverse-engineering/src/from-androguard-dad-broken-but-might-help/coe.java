	
	    public coe()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.location.internal.LocationRequestInternal a(android.os.Parcel p10)
	    {
	        String v7 = 0;
	        boolean v5 = 1;
	        boolean v3 = 0;
	        int v8 = a.a(p10);
	        java.util.ArrayList v6_0 = com.google.android.gms.location.internal.LocationRequestInternal.a;
	        boolean v4 = 1;
	        String v2_0 = 0;
	        String v1_0 = 0;
	        while (p10.dataPosition() < v8) {
	            com.google.android.gms.location.internal.LocationRequestInternal v0_6 = p10.readInt();
	            switch ((65535 & v0_6)) {
	                case 1:
	                    v2_0 = ((com.google.android.gms.location.LocationRequest) a.a(p10, v0_6, com.google.android.gms.location.LocationRequest.CREATOR));
	                    break;
	                case 2:
	                    v3 = a.c(p10, v0_6);
	                    break;
	                case 3:
	                    v4 = a.c(p10, v0_6);
	                    break;
	                case 4:
	                    v5 = a.c(p10, v0_6);
	                    break;
	                case 5:
	                    v6_0 = a.c(p10, v0_6, com.google.android.gms.location.internal.ClientIdentity.CREATOR);
	                    break;
	                case 6:
	                    v7 = a.h(p10, v0_6);
	                    break;
	                case 1000:
	                    v1_0 = a.d(p10, v0_6);
	                    break;
	                default:
	                    a.b(p10, v0_6);
	            }
	        }
	        if (p10.dataPosition() == v8) {
	            return new com.google.android.gms.location.internal.LocationRequestInternal(v1_0, v2_0, v3, v4, v5, v6_0, v7);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v8).toString(), p10);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.location.internal.LocationRequestInternal p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.a(p5, 1, p4.c, p6, 0);
	        a.c(p5, 1000, p4.b);
	        a.a(p5, 2, p4.d);
	        a.a(p5, 3, p4.e);
	        a.a(p5, 4, p4.f);
	        a.a(p5, 5, p4.g, 0);
	        a.a(p5, 6, p4.h, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return coe.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.internal.LocationRequestInternal[] v0 = new com.google.android.gms.location.internal.LocationRequestInternal[p2];
	        return v0;
	    }
	
