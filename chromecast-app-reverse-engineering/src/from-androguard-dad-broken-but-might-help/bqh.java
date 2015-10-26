	
	    public static bqg a(android.os.IBinder p2)
	    {
	        bqg v0_3;
	        if (p2 != null) {
	            bqg v0_1 = p2.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
	            if ((v0_1 == null) || (!(v0_1 instanceof bqg))) {
	                v0_3 = new bqi(p2);
	            } else {
	                v0_3 = ((bqg) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p8, android.os.Parcel p9, android.os.Parcel p10, int p11)
	    {
	        int v0_1;
	        switch (p8) {
	            case 1:
	                p9.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
	                this.a(p9.readHashMap(this.getClass().getClassLoader()), p9.readLong(), p9.readString(), p9.createTypedArrayList(com.google.android.gms.analytics.internal.Command.CREATOR));
	                p10.writeNoException();
	                v0_1 = 1;
	                break;
	            case 2:
	                p9.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
	                this.a();
	                p10.writeNoException();
	                v0_1 = 1;
	                break;
	            case 3:
	                p9.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
	                int v0_3 = this.b();
	                p10.writeNoException();
	                p10.writeString(v0_3);
	                v0_1 = 1;
	                break;
	            case 1598968902:
	                p10.writeString("com.google.android.gms.analytics.internal.IAnalyticsService");
	                v0_1 = 1;
	                break;
	            default:
	                v0_1 = super.onTransact(p8, p9, p10, p11);
	        }
	        return v0_1;
	    }
	
