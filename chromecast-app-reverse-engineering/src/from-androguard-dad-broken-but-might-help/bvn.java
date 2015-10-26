	
	    public bvn()
	    {
	        return;
	    }
	
	
	    public static com.google.android.gms.clearcut.LogEventParcelable a(android.os.Parcel p6)
	    {
	        int v4 = a.a(p6);
	        String v2_0 = 0;
	        int v3 = 0;
	        String v1_1 = 0;
	        while (p6.dataPosition() < v4) {
	            com.google.android.gms.clearcut.LogEventParcelable v0_7 = p6.readInt();
	            switch ((65535 & v0_7)) {
	                case 1:
	                    v3 = a.d(p6, v0_7);
	                    break;
	                case 2:
	                    v2_0 = ((com.google.android.gms.playlog.internal.PlayLoggerContext) a.a(p6, v0_7, com.google.android.gms.playlog.internal.PlayLoggerContext.CREATOR));
	                    break;
	                case 3:
	                    v1_1 = a.k(p6, v0_7);
	                    break;
	                default:
	                    a.b(p6, v0_7);
	            }
	        }
	        if (p6.dataPosition() == v4) {
	            return new com.google.android.gms.clearcut.LogEventParcelable(v3, v2_0, v1_1);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v4).toString(), p6);
	        }
	    }
	
	
	    public static void a(com.google.android.gms.clearcut.LogEventParcelable p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.a(p5, 2, p4.b, p6, 0);
	        a.a(p5, 3, p4.c, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p2)
	    {
	        return bvn.a(p2);
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.clearcut.LogEventParcelable[] v0 = new com.google.android.gms.clearcut.LogEventParcelable[p2];
	        return v0;
	    }
	
