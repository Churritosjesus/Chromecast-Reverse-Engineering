	
	    public bsl()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.auth.AccountChangeEventsResponse a(android.os.Parcel p5)
	    {
	        com.google.android.gms.auth.AccountChangeEventsResponse v2_0 = a.a(p5);
	        String v1_0 = 0;
	        l v0_0 = 0;
	        while (p5.dataPosition() < v2_0) {
	            String v3_3 = p5.readInt();
	            switch ((65535 & v3_3)) {
	                case 1:
	                    v1_0 = a.d(p5, v3_3);
	                    break;
	                case 2:
	                    v0_0 = a.c(p5, v3_3, com.google.android.gms.auth.AccountChangeEvent.CREATOR);
	                    break;
	                default:
	                    a.b(p5, v3_3);
	            }
	        }
	        if (p5.dataPosition() == v2_0) {
	            return new com.google.android.gms.auth.AccountChangeEventsResponse(v1_0, v0_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v2_0).toString(), p5);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.auth.AccountChangeEventsResponse p4, android.os.Parcel p5)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.a(p5, 2, p4.b, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return bsl.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.auth.AccountChangeEventsResponse[] v0 = new com.google.android.gms.auth.AccountChangeEventsResponse[p2];
	        return v0;
	    }
	
