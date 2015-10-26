	
	    public cry()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.people.internal.ParcelableLoadImageOptions a(android.os.Parcel p7)
	    {
	        l v0_0 = 0;
	        com.google.android.gms.people.internal.ParcelableLoadImageOptions v4_0 = a.a(p7);
	        String v1_0 = 0;
	        String v2_0 = 0;
	        int v3 = 0;
	        while (p7.dataPosition() < v4_0) {
	            int v5_2 = p7.readInt();
	            switch ((65535 & v5_2)) {
	                case 1:
	                    v2_0 = a.d(p7, v5_2);
	                    break;
	                case 2:
	                    v1_0 = a.d(p7, v5_2);
	                    break;
	                case 3:
	                    v0_0 = a.c(p7, v5_2);
	                    break;
	                case 1000:
	                    v3 = a.d(p7, v5_2);
	                    break;
	                default:
	                    a.b(p7, v5_2);
	            }
	        }
	        if (p7.dataPosition() == v4_0) {
	            return new com.google.android.gms.people.internal.ParcelableLoadImageOptions(v3, v2_0, v1_0, v0_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v4_0).toString(), p7);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.people.internal.ParcelableLoadImageOptions p3, android.os.Parcel p4)
	    {
	        int v0_1 = a.m(p4, 20293);
	        a.c(p4, 1, p3.b);
	        a.c(p4, 1000, p3.a);
	        a.c(p4, 2, p3.c);
	        a.a(p4, 3, p3.d);
	        a.n(p4, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return cry.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.people.internal.ParcelableLoadImageOptions[] v0 = new com.google.android.gms.people.internal.ParcelableLoadImageOptions[p2];
	        return v0;
	    }
	
