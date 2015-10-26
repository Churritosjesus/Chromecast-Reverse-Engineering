	
	    public cii()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.feedback.FileTeleporter p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.a(p5, 2, p4.b, p6, 0);
	        a.a(p5, 3, p4.c, 0);
	        a.a(p5, 4, p4.d, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p8)
	    {
	        int v5 = a.a(p8);
	        String v2_0 = 0;
	        android.os.ParcelFileDescriptor v3_0 = 0;
	        int v4 = 0;
	        String v1_1 = 0;
	        while (p8.dataPosition() < v5) {
	            com.google.android.gms.feedback.FileTeleporter v0_7 = p8.readInt();
	            switch ((65535 & v0_7)) {
	                case 1:
	                    v4 = a.d(p8, v0_7);
	                    break;
	                case 2:
	                    v3_0 = ((android.os.ParcelFileDescriptor) a.a(p8, v0_7, android.os.ParcelFileDescriptor.CREATOR));
	                    break;
	                case 3:
	                    v2_0 = a.h(p8, v0_7);
	                    break;
	                case 4:
	                    v1_1 = a.h(p8, v0_7);
	                    break;
	                default:
	                    a.b(p8, v0_7);
	            }
	        }
	        if (p8.dataPosition() == v5) {
	            return new com.google.android.gms.feedback.FileTeleporter(v4, v3_0, v2_0, v1_1);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v5).toString(), p8);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.feedback.FileTeleporter[] v0 = new com.google.android.gms.feedback.FileTeleporter[p2];
	        return v0;
	    }
	
