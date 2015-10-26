	
	    public cnm()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.location.copresence.internal.CopresenceApiOptions p3, android.os.Parcel p4)
	    {
	        int v0_1 = a.m(p4, 20293);
	        a.c(p4, 1, p3.b);
	        a.a(p4, 2, p3.c);
	        a.n(p4, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p6)
	    {
	        l v0_0 = 0;
	        com.google.android.gms.location.copresence.internal.CopresenceApiOptions v2_0 = a.a(p6);
	        String v1_0 = 0;
	        while (p6.dataPosition() < v2_0) {
	            String v3_3 = p6.readInt();
	            switch ((65535 & v3_3)) {
	                case 1:
	                    v1_0 = a.d(p6, v3_3);
	                    break;
	                case 2:
	                    v0_0 = a.c(p6, v3_3);
	                    break;
	                default:
	                    a.b(p6, v3_3);
	            }
	        }
	        if (p6.dataPosition() == v2_0) {
	            return new com.google.android.gms.location.copresence.internal.CopresenceApiOptions(v1_0, v0_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v2_0).toString(), p6);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.copresence.internal.CopresenceApiOptions[] v0 = new com.google.android.gms.location.copresence.internal.CopresenceApiOptions[p2];
	        return v0;
	    }
	
