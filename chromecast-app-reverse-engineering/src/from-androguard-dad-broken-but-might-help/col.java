	
	    public static cok a(android.os.IBinder p2)
	    {
	        cok v0_3;
	        if (p2 != null) {
	            cok v0_1 = p2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
	            if ((v0_1 == null) || (!(v0_1 instanceof cok))) {
	                v0_3 = new com(p2);
	            } else {
	                v0_3 = ((cok) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public android.os.IBinder asBinder()
	    {
	        return this;
	    }
	
	
	    public boolean onTransact(int p4, android.os.Parcel p5, android.os.Parcel p6, int p7)
	    {
	        int v0_2;
	        int v0_0 = 0;
	        switch (p4) {
	            case 1:
	                p5.enforceInterface("com.google.android.gms.location.ILocationCallback");
	                if (p5.readInt() != 0) {
	                    v0_0 = cnh.a(p5);
	                }
	                this.a(v0_0);
	                v0_2 = 1;
	                break;
	            case 2:
	                p5.enforceInterface("com.google.android.gms.location.ILocationCallback");
	                if (p5.readInt() != 0) {
	                    v0_0 = cnf.a(p5);
	                }
	                this.a(v0_0);
	                v0_2 = 1;
	                break;
	            case 1598968902:
	                p6.writeString("com.google.android.gms.location.ILocationCallback");
	                v0_2 = 1;
	                break;
	            default:
	                v0_2 = super.onTransact(p4, p5, p6, p7);
	        }
	        return v0_2;
	    }
	
