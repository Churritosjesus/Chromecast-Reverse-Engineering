	
	    public bwo()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.common.api.Status a(android.os.Parcel p7)
	    {
	        l v0_0 = 0;
	        com.google.android.gms.common.api.Status v4_0 = a.a(p7);
	        String v2_0 = 0;
	        int v3 = 0;
	        String v1_1 = 0;
	        while (p7.dataPosition() < v4_0) {
	            int v5_2 = p7.readInt();
	            switch ((65535 & v5_2)) {
	                case 1:
	                    v2_0 = a.d(p7, v5_2);
	                    break;
	                case 2:
	                    v1_1 = a.h(p7, v5_2);
	                    break;
	                case 3:
	                    v0_0 = ((android.app.PendingIntent) a.a(p7, v5_2, android.app.PendingIntent.CREATOR));
	                    break;
	                case 1000:
	                    v3 = a.d(p7, v5_2);
	                    break;
	                default:
	                    a.b(p7, v5_2);
	            }
	        }
	        if (p7.dataPosition() == v4_0) {
	            return new com.google.android.gms.common.api.Status(v3, v2_0, v1_1, v0_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v4_0).toString(), p7);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.common.api.Status p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.f);
	        a.c(p5, 1000, p4.e);
	        a.a(p5, 2, p4.g, 0);
	        a.a(p5, 3, p4.h, p6, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return bwo.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.common.api.Status[] v0 = new com.google.android.gms.common.api.Status[p2];
	        return v0;
	    }
	
