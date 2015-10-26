	
	    public bzt()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.common.internal.ResolveAccountResponse p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.a(p5, 2, p4.b, 0);
	        a.a(p5, 3, p4.c, p6, 0);
	        a.a(p5, 4, p4.d);
	        a.a(p5, 5, p4.e);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p9)
	    {
	        com.google.android.gms.common.ConnectionResult v3_0 = 0;
	        boolean v5 = 0;
	        int v6 = a.a(p9);
	        boolean v4 = 0;
	        String v2_0 = 0;
	        String v1_0 = 0;
	        while (p9.dataPosition() < v6) {
	            com.google.android.gms.common.internal.ResolveAccountResponse v0_6 = p9.readInt();
	            switch ((65535 & v0_6)) {
	                case 1:
	                    v1_0 = a.d(p9, v0_6);
	                    break;
	                case 2:
	                    v2_0 = a.i(p9, v0_6);
	                    break;
	                case 3:
	                    v3_0 = ((com.google.android.gms.common.ConnectionResult) a.a(p9, v0_6, com.google.android.gms.common.ConnectionResult.CREATOR));
	                    break;
	                case 4:
	                    v4 = a.c(p9, v0_6);
	                    break;
	                case 5:
	                    v5 = a.c(p9, v0_6);
	                    break;
	                default:
	                    a.b(p9, v0_6);
	            }
	        }
	        if (p9.dataPosition() == v6) {
	            return new com.google.android.gms.common.internal.ResolveAccountResponse(v1_0, v2_0, v3_0, v4, v5);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v6).toString(), p9);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.common.internal.ResolveAccountResponse[] v0 = new com.google.android.gms.common.internal.ResolveAccountResponse[p2];
	        return v0;
	    }
	
