	
	    public cro()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.people.identity.internal.ParcelableListOptions a(android.os.Parcel p9)
	    {
	        android.os.Bundle v6 = 0;
	        boolean v4 = 0;
	        com.google.android.gms.people.identity.internal.ParcelableListOptions v0_0 = a.a(p9);
	        String v5 = 0;
	        String v3_0 = 0;
	        StringBuilder v2_0 = 0;
	        l v1_0 = 0;
	        while (p9.dataPosition() < v0_0) {
	            int v7_2 = p9.readInt();
	            switch ((65535 & v7_2)) {
	                case 1:
	                    v2_0 = a.c(p9, v7_2);
	                    break;
	                case 2:
	                    v3_0 = a.c(p9, v7_2);
	                    break;
	                case 3:
	                    v5 = a.h(p9, v7_2);
	                    break;
	                case 4:
	                    v4 = a.c(p9, v7_2);
	                    break;
	                case 5:
	                    v6 = a.j(p9, v7_2);
	                    break;
	                case 1000:
	                    v1_0 = a.d(p9, v7_2);
	                    break;
	                default:
	                    a.b(p9, v7_2);
	            }
	        }
	        if (p9.dataPosition() == v0_0) {
	            return new com.google.android.gms.people.identity.internal.ParcelableListOptions(v1_0, v2_0, v3_0, v4, v5, v6);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v0_0).toString(), p9);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.people.identity.internal.ParcelableListOptions p4, android.os.Parcel p5)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.a(p5, 1, p4.b);
	        a.c(p5, 1000, p4.a);
	        a.a(p5, 2, p4.c);
	        a.a(p5, 3, p4.d, 0);
	        a.a(p5, 4, p4.e);
	        a.a(p5, 5, p4.f, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return cro.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.people.identity.internal.ParcelableListOptions[] v0 = new com.google.android.gms.people.identity.internal.ParcelableListOptions[p2];
	        return v0;
	    }
	
