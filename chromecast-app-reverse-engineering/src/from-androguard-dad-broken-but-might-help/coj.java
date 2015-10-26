	
	    public coj()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.location.GestureRequest a(android.os.Parcel p10)
	    {
	        int v5 = a.a(p10);
	        java.util.ArrayList v0_0 = 0;
	        String v2_0 = 0;
	        while (p10.dataPosition() < v5) {
	            int v4_1 = p10.readInt();
	            switch ((65535 & v4_1)) {
	                case 1:
	                    int v6_2 = a.a(p10, v4_1);
	                    int v7 = p10.dataPosition();
	                    if (v6_2 != 0) {
	                        v0_0 = new java.util.ArrayList();
	                        int v8 = p10.readInt();
	                        int v4_2 = 0;
	                        while (v4_2 < v8) {
	                            v0_0.add(Integer.valueOf(p10.readInt()));
	                            v4_2++;
	                        }
	                        p10.setDataPosition((v7 + v6_2));
	                    } else {
	                        v0_0 = 0;
	                    }
	                    break;
	                case 1000:
	                    v2_0 = a.d(p10, v4_1);
	                    break;
	                default:
	                    a.b(p10, v4_1);
	            }
	        }
	        if (p10.dataPosition() == v5) {
	            return new com.google.android.gms.location.GestureRequest(v2_0, v0_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v5).toString(), p10);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.location.GestureRequest p6, android.os.Parcel p7)
	    {
	        int v2 = a.m(p7, 20293);
	        java.util.List v3 = p6.b;
	        if (v3 != null) {
	            int v4 = a.m(p7, 1);
	            int v5 = v3.size();
	            p7.writeInt(v5);
	            int v1_0 = 0;
	            while (v1_0 < v5) {
	                p7.writeInt(((Integer) v3.get(v1_0)).intValue());
	                v1_0++;
	            }
	            a.n(p7, v4);
	        }
	        a.c(p7, 1000, p6.a);
	        a.n(p7, v2);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return coj.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.location.GestureRequest[] v0 = new com.google.android.gms.location.GestureRequest[p2];
	        return v0;
	    }
	
