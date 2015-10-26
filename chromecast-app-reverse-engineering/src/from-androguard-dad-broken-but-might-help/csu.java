	
	    public csu()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.playlog.internal.PlayLoggerContext p4, android.os.Parcel p5)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.a(p5, 2, p4.b, 0);
	        a.c(p5, 3, p4.c);
	        a.c(p5, 4, p4.d);
	        a.a(p5, 5, p4.e, 0);
	        a.a(p5, 6, p4.f, 0);
	        a.a(p5, 7, p4.g);
	        a.a(p5, 8, p4.h, 0);
	        a.a(p5, 9, p4.i);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p13)
	    {
	        String v8 = 0;
	        boolean v9 = 0;
	        com.google.android.gms.playlog.internal.PlayLoggerContext v0_0 = a.a(p13);
	        boolean v7 = 1;
	        String v6 = 0;
	        String v5 = 0;
	        int v4 = 0;
	        String v3_0 = 0;
	        StringBuilder v2_0 = 0;
	        l v1_0 = 0;
	        while (p13.dataPosition() < v0_0) {
	            int v10_2 = p13.readInt();
	            switch ((65535 & v10_2)) {
	                case 1:
	                    v1_0 = a.d(p13, v10_2);
	                    break;
	                case 2:
	                    v2_0 = a.h(p13, v10_2);
	                    break;
	                case 3:
	                    v3_0 = a.d(p13, v10_2);
	                    break;
	                case 4:
	                    v4 = a.d(p13, v10_2);
	                    break;
	                case 5:
	                    v5 = a.h(p13, v10_2);
	                    break;
	                case 6:
	                    v6 = a.h(p13, v10_2);
	                    break;
	                case 7:
	                    v7 = a.c(p13, v10_2);
	                    break;
	                case 8:
	                    v8 = a.h(p13, v10_2);
	                    break;
	                case 9:
	                    v9 = a.c(p13, v10_2);
	                    break;
	                default:
	                    a.b(p13, v10_2);
	            }
	        }
	        if (p13.dataPosition() == v0_0) {
	            return new com.google.android.gms.playlog.internal.PlayLoggerContext(v1_0, v2_0, v3_0, v4, v5, v6, v7, v8, v9);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v0_0).toString(), p13);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.playlog.internal.PlayLoggerContext[] v0 = new com.google.android.gms.playlog.internal.PlayLoggerContext[p2];
	        return v0;
	    }
	
