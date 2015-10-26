	
	    public byn()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.common.internal.GetServiceRequest p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.c(p5, 2, p4.b);
	        a.c(p5, 3, p4.c);
	        a.a(p5, 4, p4.d, 0);
	        a.a(p5, 5, p4.e, 0);
	        a.a(p5, 6, p4.f, p6, 0);
	        a.a(p5, 7, p4.g, 0);
	        a.a(p5, 8, p4.h, p6, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p12)
	    {
	        int v3 = 0;
	        android.accounts.Account v8_0 = 0;
	        int v9 = a.a(p12);
	        android.os.Bundle v7 = 0;
	        com.google.android.gms.common.api.Scope[] v6_0 = 0;
	        android.os.IBinder v5 = 0;
	        String v4 = 0;
	        String v2_0 = 0;
	        String v1_0 = 0;
	        while (p12.dataPosition() < v9) {
	            com.google.android.gms.common.internal.GetServiceRequest v0_6 = p12.readInt();
	            switch ((65535 & v0_6)) {
	                case 1:
	                    v1_0 = a.d(p12, v0_6);
	                    break;
	                case 2:
	                    v2_0 = a.d(p12, v0_6);
	                    break;
	                case 3:
	                    v3 = a.d(p12, v0_6);
	                    break;
	                case 4:
	                    v4 = a.h(p12, v0_6);
	                    break;
	                case 5:
	                    v5 = a.i(p12, v0_6);
	                    break;
	                case 6:
	                    v6_0 = ((com.google.android.gms.common.api.Scope[]) a.b(p12, v0_6, com.google.android.gms.common.api.Scope.CREATOR));
	                    break;
	                case 7:
	                    v7 = a.j(p12, v0_6);
	                    break;
	                case 8:
	                    v8_0 = ((android.accounts.Account) a.a(p12, v0_6, android.accounts.Account.CREATOR));
	                    break;
	                default:
	                    a.b(p12, v0_6);
	            }
	        }
	        if (p12.dataPosition() == v9) {
	            return new com.google.android.gms.common.internal.GetServiceRequest(v1_0, v2_0, v3, v4, v5, v6_0, v7, v8_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v9).toString(), p12);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.common.internal.GetServiceRequest[] v0 = new com.google.android.gms.common.internal.GetServiceRequest[p2];
	        return v0;
	    }
	
