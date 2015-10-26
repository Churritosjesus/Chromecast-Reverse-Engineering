	
	    public byi()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.common.internal.ValidateAccountRequest p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.c(p5, 2, p4.b);
	        a.a(p5, 3, p4.c, 0);
	        a.a(p5, 4, p4.d, p6, 0);
	        a.a(p5, 5, p4.e, 0);
	        a.a(p5, 6, p4.f, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p10)
	    {
	        String v2_0 = 0;
	        String v6 = 0;
	        int v7 = a.a(p10);
	        android.os.Bundle v5 = 0;
	        com.google.android.gms.common.api.Scope[] v4_0 = 0;
	        android.os.IBinder v3 = 0;
	        String v1_0 = 0;
	        while (p10.dataPosition() < v7) {
	            com.google.android.gms.common.internal.ValidateAccountRequest v0_6 = p10.readInt();
	            switch ((65535 & v0_6)) {
	                case 1:
	                    v1_0 = a.d(p10, v0_6);
	                    break;
	                case 2:
	                    v2_0 = a.d(p10, v0_6);
	                    break;
	                case 3:
	                    v3 = a.i(p10, v0_6);
	                    break;
	                case 4:
	                    v4_0 = ((com.google.android.gms.common.api.Scope[]) a.b(p10, v0_6, com.google.android.gms.common.api.Scope.CREATOR));
	                    break;
	                case 5:
	                    v5 = a.j(p10, v0_6);
	                    break;
	                case 6:
	                    v6 = a.h(p10, v0_6);
	                    break;
	                default:
	                    a.b(p10, v0_6);
	            }
	        }
	        if (p10.dataPosition() == v7) {
	            return new com.google.android.gms.common.internal.ValidateAccountRequest(v1_0, v2_0, v3, v4_0, v5, v6);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v7).toString(), p10);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.common.internal.ValidateAccountRequest[] v0 = new com.google.android.gms.common.internal.ValidateAccountRequest[p2];
	        return v0;
	    }
	
