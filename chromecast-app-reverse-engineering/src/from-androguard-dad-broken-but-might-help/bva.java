	
	    public bva()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.cast.CastDevice p4, android.os.Parcel p5)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.a(p5, 2, p4.b, 0);
	        a.a(p5, 3, p4.c, 0);
	        a.a(p5, 4, p4.e, 0);
	        a.a(p5, 5, p4.f, 0);
	        a.a(p5, 6, p4.g, 0);
	        a.c(p5, 7, p4.h);
	        a.a(p5, 8, java.util.Collections.unmodifiableList(p4.i), 0);
	        a.c(p5, 9, p4.j);
	        a.c(p5, 10, p4.k);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p14)
	    {
	        int v10 = 0;
	        java.util.ArrayList v8_0 = 0;
	        com.google.android.gms.cast.CastDevice v0_0 = a.a(p14);
	        int v9 = 0;
	        int v7 = 0;
	        String v6 = 0;
	        String v5 = 0;
	        String v4 = 0;
	        String v3_0 = 0;
	        StringBuilder v2_0 = 0;
	        l v1_0 = 0;
	        while (p14.dataPosition() < v0_0) {
	            int v11_2 = p14.readInt();
	            switch ((65535 & v11_2)) {
	                case 1:
	                    v1_0 = a.d(p14, v11_2);
	                    break;
	                case 2:
	                    v2_0 = a.h(p14, v11_2);
	                    break;
	                case 3:
	                    v3_0 = a.h(p14, v11_2);
	                    break;
	                case 4:
	                    v4 = a.h(p14, v11_2);
	                    break;
	                case 5:
	                    v5 = a.h(p14, v11_2);
	                    break;
	                case 6:
	                    v6 = a.h(p14, v11_2);
	                    break;
	                case 7:
	                    v7 = a.d(p14, v11_2);
	                    break;
	                case 8:
	                    v8_0 = a.c(p14, v11_2, com.google.android.gms.common.images.WebImage.CREATOR);
	                    break;
	                case 9:
	                    v9 = a.d(p14, v11_2);
	                    break;
	                case 10:
	                    v10 = a.d(p14, v11_2);
	                    break;
	                default:
	                    a.b(p14, v11_2);
	            }
	        }
	        if (p14.dataPosition() == v0_0) {
	            return new com.google.android.gms.cast.CastDevice(v1_0, v2_0, v3_0, v4, v5, v6, v7, v8_0, v9, v10);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v0_0).toString(), p14);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.cast.CastDevice[] v0 = new com.google.android.gms.cast.CastDevice[p2];
	        return v0;
	    }
	
