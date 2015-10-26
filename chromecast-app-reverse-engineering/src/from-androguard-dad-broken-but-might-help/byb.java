	
	    public byb()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.common.data.DataHolder a(android.os.Parcel p8)
	    {
	        int v4 = 0;
	        android.os.Bundle v5 = 0;
	        int v6 = a.a(p8);
	        android.database.CursorWindow[] v3_0 = 0;
	        String v2_0 = 0;
	        String v1_0 = 0;
	        while (p8.dataPosition() < v6) {
	            com.google.android.gms.common.data.DataHolder v0_6 = p8.readInt();
	            switch ((65535 & v0_6)) {
	                case 1:
	                    v2_0 = a.l(p8, v0_6);
	                    break;
	                case 2:
	                    v3_0 = ((android.database.CursorWindow[]) a.b(p8, v0_6, android.database.CursorWindow.CREATOR));
	                    break;
	                case 3:
	                    v4 = a.d(p8, v0_6);
	                    break;
	                case 4:
	                    v5 = a.j(p8, v0_6);
	                    break;
	                case 1000:
	                    v1_0 = a.d(p8, v0_6);
	                    break;
	                default:
	                    a.b(p8, v0_6);
	            }
	        }
	        if (p8.dataPosition() == v6) {
	            com.google.android.gms.common.data.DataHolder v0_3 = new com.google.android.gms.common.data.DataHolder(v1_0, v2_0, v3_0, v4, v5);
	            v0_3.a();
	            return v0_3;
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v6).toString(), p8);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.common.data.DataHolder p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.a(p5, 1, p4.b, 0);
	        a.c(p5, 1000, p4.a);
	        a.a(p5, 2, p4.d, p6, 0);
	        a.c(p5, 3, p4.e);
	        a.a(p5, 4, p4.f, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return byb.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.common.data.DataHolder[] v0 = new com.google.android.gms.common.data.DataHolder[p2];
	        return v0;
	    }
	
