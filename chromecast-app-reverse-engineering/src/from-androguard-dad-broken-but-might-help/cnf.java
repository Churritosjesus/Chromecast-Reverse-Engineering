	
	    public cnf()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.location.LocationAvailability a(android.os.Parcel p9)
	    {
	        int v5 = 1;
	        String v0_0 = a.a(p9);
	        StringBuilder v2_0 = 0;
	        String v3_0 = 1000;
	        long v6 = 0;
	        int v4 = 1;
	        while (p9.dataPosition() < v0_0) {
	            com.google.android.gms.location.LocationAvailability v1_6 = p9.readInt();
	            switch ((65535 & v1_6)) {
	                case 1:
	                    v4 = a.d(p9, v1_6);
	                    break;
	                case 2:
	                    v5 = a.d(p9, v1_6);
	                    break;
	                case 3:
	                    v6 = a.e(p9, v1_6);
	                    break;
	                case 4:
	                    v3_0 = a.d(p9, v1_6);
	                    break;
	                case 1000:
	                    v2_0 = a.d(p9, v1_6);
	                    break;
	                default:
	                    a.b(p9, v1_6);
	            }
	        }
	        if (p9.dataPosition() == v0_0) {
	            return new com.google.android.gms.location.LocationAvailability(v2_0, v3_0, v4, v5, v6);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v0_0).toString(), p9);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.location.LocationAvailability p4, android.os.Parcel p5)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.b);
	        a.c(p5, 1000, p4.a);
	        a.c(p5, 2, p4.c);
	        a.a(p5, 3, p4.d);
	        a.c(p5, 4, p4.e);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return cnf.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.LocationAvailability[] v0 = new com.google.android.gms.location.LocationAvailability[p2];
	        return v0;
	    }
	
