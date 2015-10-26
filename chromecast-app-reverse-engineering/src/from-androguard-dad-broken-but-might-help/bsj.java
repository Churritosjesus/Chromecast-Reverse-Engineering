	
	    public bsj()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.auth.AccountChangeEvent p5, android.os.Parcel p6)
	    {
	        int v0_1 = a.m(p6, 20293);
	        a.c(p6, 1, p5.a);
	        a.a(p6, 2, p5.b);
	        a.a(p6, 3, p5.c, 0);
	        a.c(p6, 4, p5.d);
	        a.c(p6, 5, p5.e);
	        a.a(p6, 6, p5.f, 0);
	        a.n(p6, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p11)
	    {
	        String v7 = 0;
	        int v6 = 0;
	        com.google.android.gms.auth.AccountChangeEvent v0_0 = a.a(p11);
	        StringBuilder v2_0 = 0;
	        int v5 = 0;
	        String v4 = 0;
	        l v1_0 = 0;
	        while (p11.dataPosition() < v0_0) {
	            int v8_2 = p11.readInt();
	            switch ((65535 & v8_2)) {
	                case 1:
	                    v1_0 = a.d(p11, v8_2);
	                    break;
	                case 2:
	                    v2_0 = a.e(p11, v8_2);
	                    break;
	                case 3:
	                    v4 = a.h(p11, v8_2);
	                    break;
	                case 4:
	                    v5 = a.d(p11, v8_2);
	                    break;
	                case 5:
	                    v6 = a.d(p11, v8_2);
	                    break;
	                case 6:
	                    v7 = a.h(p11, v8_2);
	                    break;
	                default:
	                    a.b(p11, v8_2);
	            }
	        }
	        if (p11.dataPosition() == v0_0) {
	            return new com.google.android.gms.auth.AccountChangeEvent(v1_0, v2_0, v4, v5, v6, v7);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v0_0).toString(), p11);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.auth.AccountChangeEvent[] v0 = new com.google.android.gms.auth.AccountChangeEvent[p2];
	        return v0;
	    }
	
