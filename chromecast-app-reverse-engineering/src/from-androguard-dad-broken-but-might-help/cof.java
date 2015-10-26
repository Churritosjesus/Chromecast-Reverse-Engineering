	
	    public cof()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.location.internal.LocationRequestUpdateData a(android.os.Parcel p9)
	    {
	        android.os.IBinder v6 = 0;
	        int v7 = a.a(p9);
	        String v1_0 = 0;
	        String v2_0 = 1;
	        android.app.PendingIntent v5_0 = 0;
	        android.os.IBinder v4 = 0;
	        com.google.android.gms.location.internal.LocationRequestInternal v3_0 = 0;
	        while (p9.dataPosition() < v7) {
	            com.google.android.gms.location.internal.LocationRequestUpdateData v0_6 = p9.readInt();
	            switch ((65535 & v0_6)) {
	                case 1:
	                    v2_0 = a.d(p9, v0_6);
	                    break;
	                case 2:
	                    v3_0 = ((com.google.android.gms.location.internal.LocationRequestInternal) a.a(p9, v0_6, com.google.android.gms.location.internal.LocationRequestInternal.CREATOR));
	                    break;
	                case 3:
	                    v4 = a.i(p9, v0_6);
	                    break;
	                case 4:
	                    v5_0 = ((android.app.PendingIntent) a.a(p9, v0_6, android.app.PendingIntent.CREATOR));
	                    break;
	                case 5:
	                    v6 = a.i(p9, v0_6);
	                    break;
	                case 1000:
	                    v1_0 = a.d(p9, v0_6);
	                    break;
	                default:
	                    a.b(p9, v0_6);
	            }
	        }
	        if (p9.dataPosition() == v7) {
	            return new com.google.android.gms.location.internal.LocationRequestUpdateData(v1_0, v2_0, v3_0, v4, v5_0, v6);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v7).toString(), p9);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.location.internal.LocationRequestUpdateData p5, android.os.Parcel p6, int p7)
	    {
	        int v0_6;
	        android.os.IBinder v1_0 = 0;
	        int v2 = a.m(p6, 20293);
	        a.c(p6, 1, p5.b);
	        a.c(p6, 1000, p5.a);
	        a.a(p6, 2, p5.c, p7, 0);
	        if (p5.d != null) {
	            v0_6 = p5.d.asBinder();
	        } else {
	            v0_6 = 0;
	        }
	        a.a(p6, 3, v0_6, 0);
	        a.a(p6, 4, p5.e, p7, 0);
	        if (p5.f != null) {
	            v1_0 = p5.f.asBinder();
	        }
	        a.a(p6, 5, v1_0, 0);
	        a.n(p6, v2);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return cof.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.internal.LocationRequestUpdateData[] v0 = new com.google.android.gms.location.internal.LocationRequestUpdateData[p2];
	        return v0;
	    }
	
