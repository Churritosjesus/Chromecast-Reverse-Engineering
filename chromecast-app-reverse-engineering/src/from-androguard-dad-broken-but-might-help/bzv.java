	
	    public bzv()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.common.stats.ConnectionEvent p5, android.os.Parcel p6)
	    {
	        int v0_1 = a.m(p6, 20293);
	        a.c(p6, 1, p5.a);
	        a.a(p6, 2, p5.b);
	        a.a(p6, 3, p5.c, 0);
	        a.a(p6, 4, p5.d, 0);
	        a.a(p6, 5, p5.e, 0);
	        a.a(p6, 6, p5.f, 0);
	        a.a(p6, 7, p5.g, 0);
	        a.a(p6, 8, p5.h, 0);
	        a.a(p6, 9, p5.i);
	        a.a(p6, 10, p5.j);
	        a.a(p6, 11, p5.k);
	        a.n(p6, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p21)
	    {
	        com.google.android.gms.common.stats.ConnectionEvent v2_0 = a.a(p21);
	        l v3_0 = 0;
	        StringBuilder v4_0 = 0;
	        String v6 = 0;
	        String v7 = 0;
	        String v8 = 0;
	        String v9 = 0;
	        String v10 = 0;
	        String v11 = 0;
	        long v12 = 0;
	        long v14 = 0;
	        long v16 = 0;
	        while (p21.dataPosition() < v2_0) {
	            int v18_2 = p21.readInt();
	            switch ((65535 & v18_2)) {
	                case 1:
	                    v3_0 = a.d(p21, v18_2);
	                    break;
	                case 2:
	                    v4_0 = a.e(p21, v18_2);
	                    break;
	                case 3:
	                    v6 = a.h(p21, v18_2);
	                    break;
	                case 4:
	                    v7 = a.h(p21, v18_2);
	                    break;
	                case 5:
	                    v8 = a.h(p21, v18_2);
	                    break;
	                case 6:
	                    v9 = a.h(p21, v18_2);
	                    break;
	                case 7:
	                    v10 = a.h(p21, v18_2);
	                    break;
	                case 8:
	                    v11 = a.h(p21, v18_2);
	                    break;
	                case 9:
	                    v12 = a.e(p21, v18_2);
	                    break;
	                case 10:
	                    v14 = a.e(p21, v18_2);
	                    break;
	                case 11:
	                    v16 = a.e(p21, v18_2);
	                    break;
	                default:
	                    a.b(p21, v18_2);
	            }
	        }
	        if (p21.dataPosition() == v2_0) {
	            return new com.google.android.gms.common.stats.ConnectionEvent(v3_0, v4_0, v6, v7, v8, v9, v10, v11, v12, v14, v16);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v2_0).toString(), p21);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.common.stats.ConnectionEvent[] v0 = new com.google.android.gms.common.stats.ConnectionEvent[p2];
	        return v0;
	    }
	
