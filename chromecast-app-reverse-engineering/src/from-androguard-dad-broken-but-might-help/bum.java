	
	    public bum()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.cast.internal.DeviceStatus p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.a(p5, 2, p4.b);
	        a.a(p5, 3, p4.c);
	        a.c(p5, 4, p4.d);
	        a.a(p5, 5, p4.e, p6, 0);
	        a.c(p5, 6, p4.f);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p11)
	    {
	        int v7 = 0;
	        int v8 = a.a(p11);
	        String v2_0 = 0;
	        com.google.android.gms.cast.ApplicationMetadata v6_0 = 0;
	        int v5 = 0;
	        boolean v4 = 0;
	        String v1_0 = 0;
	        while (p11.dataPosition() < v8) {
	            com.google.android.gms.cast.internal.DeviceStatus v0_6 = p11.readInt();
	            switch ((65535 & v0_6)) {
	                case 1:
	                    v1_0 = a.d(p11, v0_6);
	                    break;
	                case 2:
	                    v2_0 = a.g(p11, v0_6);
	                    break;
	                case 3:
	                    v4 = a.c(p11, v0_6);
	                    break;
	                case 4:
	                    v5 = a.d(p11, v0_6);
	                    break;
	                case 5:
	                    v6_0 = ((com.google.android.gms.cast.ApplicationMetadata) a.a(p11, v0_6, com.google.android.gms.cast.ApplicationMetadata.CREATOR));
	                    break;
	                case 6:
	                    v7 = a.d(p11, v0_6);
	                    break;
	                default:
	                    a.b(p11, v0_6);
	            }
	        }
	        if (p11.dataPosition() == v8) {
	            return new com.google.android.gms.cast.internal.DeviceStatus(v1_0, v2_0, v4, v5, v6_0, v7);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v8).toString(), p11);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.cast.internal.DeviceStatus[] v0 = new com.google.android.gms.cast.internal.DeviceStatus[p2];
	        return v0;
	    }
	
