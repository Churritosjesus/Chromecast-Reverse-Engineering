	
	    public byj()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.common.internal.AuthAccountRequest p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.a(p5, 2, p4.b, 0);
	        a.a(p5, 3, p4.c, p6, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p7)
	    {
	        l v0_0 = 0;
	        com.google.android.gms.common.internal.AuthAccountRequest v3_0 = a.a(p7);
	        String v2_0 = 0;
	        String v1_1 = 0;
	        while (p7.dataPosition() < v3_0) {
	            int v4_2 = p7.readInt();
	            switch ((65535 & v4_2)) {
	                case 1:
	                    v2_0 = a.d(p7, v4_2);
	                    break;
	                case 2:
	                    v1_1 = a.i(p7, v4_2);
	                    break;
	                case 3:
	                    v0_0 = ((com.google.android.gms.common.api.Scope[]) a.b(p7, v4_2, com.google.android.gms.common.api.Scope.CREATOR));
	                    break;
	                default:
	                    a.b(p7, v4_2);
	            }
	        }
	        if (p7.dataPosition() == v3_0) {
	            return new com.google.android.gms.common.internal.AuthAccountRequest(v2_0, v1_1, v0_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v3_0).toString(), p7);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.common.internal.AuthAccountRequest[] v0 = new com.google.android.gms.common.internal.AuthAccountRequest[p2];
	        return v0;
	    }
	
