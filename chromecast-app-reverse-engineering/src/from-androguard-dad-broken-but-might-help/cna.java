	
	    public cna()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.location.ActivityRecognitionResult a(android.os.Parcel p10)
	    {
	        long v6 = 0;
	        int v8 = 0;
	        String v0_0 = a.a(p10);
	        String v3_0 = 0;
	        long v4 = 0;
	        StringBuilder v2_0 = 0;
	        while (p10.dataPosition() < v0_0) {
	            com.google.android.gms.location.ActivityRecognitionResult v1_6 = p10.readInt();
	            switch ((65535 & v1_6)) {
	                case 1:
	                    v3_0 = a.c(p10, v1_6, com.google.android.gms.location.DetectedActivity.CREATOR);
	                    break;
	                case 2:
	                    v4 = a.e(p10, v1_6);
	                    break;
	                case 3:
	                    v6 = a.e(p10, v1_6);
	                    break;
	                case 4:
	                    v8 = a.d(p10, v1_6);
	                    break;
	                case 1000:
	                    v2_0 = a.d(p10, v1_6);
	                    break;
	                default:
	                    a.b(p10, v1_6);
	            }
	        }
	        if (p10.dataPosition() == v0_0) {
	            return new com.google.android.gms.location.ActivityRecognitionResult(v2_0, v3_0, v4, v6, v8);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v0_0).toString(), p10);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.location.ActivityRecognitionResult p4, android.os.Parcel p5)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.a(p5, 1, p4.b, 0);
	        a.c(p5, 1000, p4.a);
	        a.a(p5, 2, p4.c);
	        a.a(p5, 3, p4.d);
	        a.c(p5, 4, p4.e);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return cna.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.ActivityRecognitionResult[] v0 = new com.google.android.gms.location.ActivityRecognitionResult[p2];
	        return v0;
	    }
	
