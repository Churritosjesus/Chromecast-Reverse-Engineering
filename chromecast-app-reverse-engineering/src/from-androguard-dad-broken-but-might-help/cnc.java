	
	    public cnc()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.location.DetectedActivity p3, android.os.Parcel p4)
	    {
	        int v0_1 = a.m(p4, 20293);
	        a.c(p4, 1, p3.b);
	        a.c(p4, 1000, p3.a);
	        a.c(p4, 2, p3.c);
	        a.n(p4, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p7)
	    {
	        l v0_0 = 0;
	        com.google.android.gms.location.DetectedActivity v3_0 = a.a(p7);
	        String v1_0 = 0;
	        String v2_0 = 0;
	        while (p7.dataPosition() < v3_0) {
	            int v4_2 = p7.readInt();
	            switch ((65535 & v4_2)) {
	                case 1:
	                    v1_0 = a.d(p7, v4_2);
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
	            return new com.google.android.gms.location.DetectedActivity(v2_0, v1_0, v0_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v3_0).toString(), p7);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.DetectedActivity[] v0 = new com.google.android.gms.location.DetectedActivity[p2];
	        return v0;
	    }
	
