	
	    public bxy()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.common.data.BitmapTeleporter p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.a(p5, 2, p4.b, p6, 0);
	        a.c(p5, 3, p4.c);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p7)
	    {
	        int v4 = a.a(p7);
	        String v2_0 = 0;
	        int v3 = 0;
	        String v1_1 = 0;
	        while (p7.dataPosition() < v4) {
	            com.google.android.gms.common.data.BitmapTeleporter v0_7 = p7.readInt();
	            switch ((65535 & v0_7)) {
	                case 1:
	                    v3 = a.d(p7, v0_7);
	                    break;
	                case 2:
	                    v2_0 = ((android.os.ParcelFileDescriptor) a.a(p7, v0_7, android.os.ParcelFileDescriptor.CREATOR));
	                    break;
	                case 3:
	                    v1_1 = a.d(p7, v0_7);
	                    break;
	                default:
	                    a.b(p7, v0_7);
	            }
	        }
	        if (p7.dataPosition() == v4) {
	            return new com.google.android.gms.common.data.BitmapTeleporter(v3, v2_0, v1_1);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v4).toString(), p7);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.common.data.BitmapTeleporter[] v0 = new com.google.android.gms.common.data.BitmapTeleporter[p2];
	        return v0;
	    }
	
