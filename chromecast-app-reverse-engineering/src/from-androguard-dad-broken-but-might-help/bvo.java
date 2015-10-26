	
	    public bvo()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.common.ConnectionResult a(android.os.Parcel p6)
	    {
	        String v1_0 = 0;
	        com.google.android.gms.common.ConnectionResult v3_0 = a.a(p6);
	        l v0_0 = 0;
	        String v2_0 = 0;
	        while (p6.dataPosition() < v3_0) {
	            int v4_2 = p6.readInt();
	            switch ((65535 & v4_2)) {
	                case 1:
	                    v2_0 = a.d(p6, v4_2);
	                    break;
	                case 2:
	                    v1_0 = a.d(p6, v4_2);
	                    break;
	                case 3:
	                    v0_0 = ((android.app.PendingIntent) a.a(p6, v4_2, android.app.PendingIntent.CREATOR));
	                    break;
	                default:
	                    a.b(p6, v4_2);
	            }
	        }
	        if (p6.dataPosition() == v3_0) {
	            return new com.google.android.gms.common.ConnectionResult(v2_0, v1_0, v0_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v3_0).toString(), p6);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.common.ConnectionResult p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.b);
	        a.c(p5, 2, p4.c);
	        a.a(p5, 3, p4.d, p6, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return bvo.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.common.ConnectionResult[] v0 = new com.google.android.gms.common.ConnectionResult[p2];
	        return v0;
	    }
	
