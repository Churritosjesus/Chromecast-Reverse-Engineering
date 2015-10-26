	
	    public cnh()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.location.LocationResult a(android.os.Parcel p5)
	    {
	        com.google.android.gms.location.LocationResult v2_0 = a.a(p5);
	        String v1_0 = 0;
	        l v0_0 = com.google.android.gms.location.LocationResult.a;
	        while (p5.dataPosition() < v2_0) {
	            String v3_3 = p5.readInt();
	            switch ((65535 & v3_3)) {
	                case 1:
	                    v0_0 = a.c(p5, v3_3, android.location.Location.CREATOR);
	                    break;
	                case 1000:
	                    v1_0 = a.d(p5, v3_3);
	                    break;
	                default:
	                    a.b(p5, v3_3);
	            }
	        }
	        if (p5.dataPosition() == v2_0) {
	            return new com.google.android.gms.location.LocationResult(v1_0, v0_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v2_0).toString(), p5);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.location.LocationResult p4, android.os.Parcel p5)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.a(p5, 1, p4.c, 0);
	        a.c(p5, 1000, p4.b);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return cnh.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.LocationResult[] v0 = new com.google.android.gms.location.LocationResult[p2];
	        return v0;
	    }
	
