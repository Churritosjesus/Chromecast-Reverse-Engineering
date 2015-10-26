	
	    public buz()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.cast.ApplicationMetadata p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.a(p5, 2, p4.b, 0);
	        a.a(p5, 3, p4.c, 0);
	        a.a(p5, 4, p4.d, 0);
	        int v1_4 = p4.e;
	        if (v1_4 != 0) {
	            android.net.Uri v2_5 = a.m(p5, 5);
	            p5.writeStringList(v1_4);
	            a.n(p5, v2_5);
	        }
	        a.a(p5, 6, p4.f, 0);
	        a.a(p5, 7, p4.g, p6, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p12)
	    {
	        int v9 = a.a(p12);
	        String v1_0 = 0;
	        android.net.Uri v7_0 = 0;
	        String v6 = 0;
	        java.util.ArrayList v5 = 0;
	        java.util.ArrayList v4_0 = 0;
	        String v3 = 0;
	        String v2_0 = 0;
	        while (p12.dataPosition() < v9) {
	            int v0_6 = p12.readInt();
	            switch ((65535 & v0_6)) {
	                case 1:
	                    v1_0 = a.d(p12, v0_6);
	                    break;
	                case 2:
	                    v2_0 = a.h(p12, v0_6);
	                    break;
	                case 3:
	                    v3 = a.h(p12, v0_6);
	                    break;
	                case 4:
	                    v4_0 = a.c(p12, v0_6, com.google.android.gms.common.images.WebImage.CREATOR);
	                    break;
	                case 5:
	                    int v0_9 = a.a(p12, v0_6);
	                    int v10_2 = p12.dataPosition();
	                    if (v0_9 != 0) {
	                        v5 = p12.createStringArrayList();
	                        p12.setDataPosition((v0_9 + v10_2));
	                    } else {
	                        v5 = 0;
	                    }
	                    break;
	                case 6:
	                    v6 = a.h(p12, v0_6);
	                    break;
	                case 7:
	                    v7_0 = ((android.net.Uri) a.a(p12, v0_6, android.net.Uri.CREATOR));
	                    break;
	                default:
	                    a.b(p12, v0_6);
	            }
	        }
	        if (p12.dataPosition() == v9) {
	            return new com.google.android.gms.cast.ApplicationMetadata(v1_0, v2_0, v3, v4_0, v5, v6, v7_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v9).toString(), p12);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.cast.ApplicationMetadata[] v0 = new com.google.android.gms.cast.ApplicationMetadata[p2];
	        return v0;
	    }
	
