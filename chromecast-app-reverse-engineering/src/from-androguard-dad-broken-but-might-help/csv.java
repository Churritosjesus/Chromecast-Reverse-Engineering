	
	    public csv()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.signin.internal.AuthAccountResult p3, android.os.Parcel p4)
	    {
	        int v0_1 = a.m(p4, 20293);
	        a.c(p4, 1, p3.a);
	        a.n(p4, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p5)
	    {
	        com.google.android.gms.signin.internal.AuthAccountResult v1_0 = a.a(p5);
	        l v0_0 = 0;
	        while (p5.dataPosition() < v1_0) {
	            StringBuilder v2_4 = p5.readInt();
	            switch ((65535 & v2_4)) {
	                case 1:
	                    v0_0 = a.d(p5, v2_4);
	                    break;
	                default:
	                    a.b(p5, v2_4);
	            }
	        }
	        if (p5.dataPosition() == v1_0) {
	            return new com.google.android.gms.signin.internal.AuthAccountResult(v0_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v1_0).toString(), p5);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.signin.internal.AuthAccountResult[] v0 = new com.google.android.gms.signin.internal.AuthAccountResult[p2];
	        return v0;
	    }
	
