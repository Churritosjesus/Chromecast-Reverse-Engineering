	
	    public cog()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.location.internal.ParcelableGeofence p5, android.os.Parcel p6)
	    {
	        int v0_1 = a.m(p6, 20293);
	        a.a(p6, 1, p5.b, 0);
	        a.c(p6, 1000, p5.a);
	        a.a(p6, 2, p5.c);
	        int v1_3 = p5.d;
	        a.b(p6, 3, 4);
	        p6.writeInt(v1_3);
	        a.a(p6, 4, p5.e);
	        a.a(p6, 5, p5.f);
	        a.a(p6, 6, p5.g);
	        a.c(p6, 7, p5.h);
	        a.c(p6, 8, p5.i);
	        a.c(p6, 9, p5.j);
	        a.n(p6, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p19)
	    {
	        String v2_0 = a.a(p19);
	        StringBuilder v4_0 = 0;
	        String v5_0 = 0;
	        int v6 = 0;
	        short v7_0 = 0;
	        double v8 = 0;
	        double v10 = 0;
	        float v12 = 0;
	        long v13 = 0;
	        int v15 = 0;
	        int v16 = -1;
	        while (p19.dataPosition() < v2_0) {
	            com.google.android.gms.location.internal.ParcelableGeofence v3_6 = p19.readInt();
	            switch ((65535 & v3_6)) {
	                case 1:
	                    v5_0 = a.h(p19, v3_6);
	                    break;
	                case 2:
	                    v13 = a.e(p19, v3_6);
	                    break;
	                case 3:
	                    a.a(p19, v3_6, 4);
	                    v7_0 = ((short) p19.readInt());
	                    break;
	                case 4:
	                    v8 = a.g(p19, v3_6);
	                    break;
	                case 5:
	                    v10 = a.g(p19, v3_6);
	                    break;
	                case 6:
	                    v12 = a.f(p19, v3_6);
	                    break;
	                case 7:
	                    v6 = a.d(p19, v3_6);
	                    break;
	                case 8:
	                    v15 = a.d(p19, v3_6);
	                    break;
	                case 9:
	                    v16 = a.d(p19, v3_6);
	                    break;
	                case 1000:
	                    v4_0 = a.d(p19, v3_6);
	                    break;
	                default:
	                    a.b(p19, v3_6);
	            }
	        }
	        if (p19.dataPosition() == v2_0) {
	            return new com.google.android.gms.location.internal.ParcelableGeofence(v4_0, v5_0, v6, v7_0, v8, v10, v12, v13, v15, v16);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v2_0).toString(), p19);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.internal.ParcelableGeofence[] v0 = new com.google.android.gms.location.internal.ParcelableGeofence[p2];
	        return v0;
	    }
	
