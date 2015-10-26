	
	    public cng()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.location.LocationRequest a(android.os.Parcel p17)
	    {
	        com.google.android.gms.location.LocationRequest v1_0 = a.a(p17);
	        l v2_0 = 0;
	        StringBuilder v3_0 = 102;
	        String v4_0 = 3600000;
	        long v6 = 600000;
	        boolean v8 = 0;
	        long v9 = nan;
	        int v11 = 2147483647;
	        float v12 = 0;
	        long v13 = 0;
	        while (p17.dataPosition() < v1_0) {
	            int v15_2 = p17.readInt();
	            switch ((65535 & v15_2)) {
	                case 1:
	                    v3_0 = a.d(p17, v15_2);
	                    break;
	                case 2:
	                    v4_0 = a.e(p17, v15_2);
	                    break;
	                case 3:
	                    v6 = a.e(p17, v15_2);
	                    break;
	                case 4:
	                    v8 = a.c(p17, v15_2);
	                    break;
	                case 5:
	                    v9 = a.e(p17, v15_2);
	                    break;
	                case 6:
	                    v11 = a.d(p17, v15_2);
	                    break;
	                case 7:
	                    v12 = a.f(p17, v15_2);
	                    break;
	                case 8:
	                    v13 = a.e(p17, v15_2);
	                    break;
	                case 1000:
	                    v2_0 = a.d(p17, v15_2);
	                    break;
	                default:
	                    a.b(p17, v15_2);
	            }
	        }
	        if (p17.dataPosition() == v1_0) {
	            return new com.google.android.gms.location.LocationRequest(v2_0, v3_0, v4_0, v6, v8, v9, v11, v12, v13);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v1_0).toString(), p17);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.location.LocationRequest p4, android.os.Parcel p5)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.b);
	        a.c(p5, 1000, p4.a);
	        a.a(p5, 2, p4.c);
	        a.a(p5, 3, p4.d);
	        a.a(p5, 4, p4.e);
	        a.a(p5, 5, p4.f);
	        a.c(p5, 6, p4.g);
	        a.a(p5, 7, p4.h);
	        a.a(p5, 8, p4.i);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return cng.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.LocationRequest[] v0 = new com.google.android.gms.location.LocationRequest[p2];
	        return v0;
	    }
	
