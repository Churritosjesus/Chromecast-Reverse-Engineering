	
	    public ctb()
	    {
	        this.attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
	        return;
	    }
	
	
	    public static cta a(android.os.IBinder p2)
	    {
	        cta v0_3;
	        if (p2 != null) {
	            cta v0_1 = p2.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
	            if ((v0_1 == null) || (!(v0_1 instanceof cta))) {
	                v0_3 = new ctc(p2);
	            } else {
	                v0_3 = ((cta) v0_1);
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
	
	
	    public boolean onTransact(int p5, android.os.Parcel p6, android.os.Parcel p7, int p8)
	    {
	        int v0_1;
	        com.google.android.gms.common.api.Status v2 = 0;
	        switch (p5) {
	            case 3:
	                int v1;
	                p6.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
	                if (p6.readInt() == 0) {
	                    v1 = 0;
	                } else {
	                    v1 = bvo.a(p6);
	                }
	                int v0_8;
	                if (p6.readInt() == 0) {
	                    v0_8 = 0;
	                } else {
	                    v0_8 = ((com.google.android.gms.signin.internal.AuthAccountResult) com.google.android.gms.signin.internal.AuthAccountResult.CREATOR.createFromParcel(p6));
	                }
	                this.a(v1, v0_8);
	                p7.writeNoException();
	                v0_1 = 1;
	                break;
	            case 4:
	                p6.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
	                if (p6.readInt() != 0) {
	                    v2 = bwo.a(p6);
	                }
	                this.a(v2);
	                p7.writeNoException();
	                v0_1 = 1;
	                break;
	            case 1598968902:
	                p7.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
	                v0_1 = 1;
	                break;
	            default:
	                v0_1 = super.onTransact(p5, p6, p7, p8);
	        }
	        return v0_1;
	    }
	
