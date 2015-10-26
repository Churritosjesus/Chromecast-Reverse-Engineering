	
	    public cor()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.location.LocationSettingsStates p3, android.os.Parcel p4)
	    {
	        int v0_1 = a.m(p4, 20293);
	        a.a(p4, 1, p3.b);
	        a.c(p4, 1000, p3.a);
	        a.a(p4, 2, p3.c);
	        a.a(p4, 3, p3.d);
	        a.a(p4, 4, p3.e);
	        a.a(p4, 5, p3.f);
	        a.a(p4, 6, p3.g);
	        a.a(p4, 7, p3.h);
	        a.n(p4, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p12)
	    {
	        boolean v8 = 0;
	        com.google.android.gms.location.LocationSettingsStates v0_0 = a.a(p12);
	        boolean v7 = 0;
	        boolean v6 = 0;
	        boolean v5 = 0;
	        boolean v4 = 0;
	        String v3_0 = 0;
	        StringBuilder v2_0 = 0;
	        l v1_0 = 0;
	        while (p12.dataPosition() < v0_0) {
	            int v9_2 = p12.readInt();
	            switch ((65535 & v9_2)) {
	                case 1:
	                    v2_0 = a.c(p12, v9_2);
	                    break;
	                case 2:
	                    v3_0 = a.c(p12, v9_2);
	                    break;
	                case 3:
	                    v4 = a.c(p12, v9_2);
	                    break;
	                case 4:
	                    v5 = a.c(p12, v9_2);
	                    break;
	                case 5:
	                    v6 = a.c(p12, v9_2);
	                    break;
	                case 6:
	                    v7 = a.c(p12, v9_2);
	                    break;
	                case 7:
	                    v8 = a.c(p12, v9_2);
	                    break;
	                case 1000:
	                    v1_0 = a.d(p12, v9_2);
	                    break;
	                default:
	                    a.b(p12, v9_2);
	            }
	        }
	        if (p12.dataPosition() == v0_0) {
	            return new com.google.android.gms.location.LocationSettingsStates(v1_0, v2_0, v3_0, v4, v5, v6, v7, v8);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v0_0).toString(), p12);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.LocationSettingsStates[] v0 = new com.google.android.gms.location.LocationSettingsStates[p2];
	        return v0;
	    }
	
