	
	    public co()
	    {
	        this.attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
	        return;
	    }
	
	
	    public static cn a(android.os.IBinder p2)
	    {
	        cn v0_3;
	        if (p2 != null) {
	            cn v0_1 = p2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
	            if ((v0_1 == null) || (!(v0_1 instanceof cn))) {
	                v0_3 = new cp(p2);
	            } else {
	                v0_3 = ((cn) v0_1);
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
	        int v0_2;
	        int v0_0 = 0;
	        switch (p5) {
	            case 1:
	                p6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	                int v2_11 = p6.readString();
	                if (p6.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p6));
	                }
	                this.a(v2_11, v0_0);
	                v0_2 = 1;
	                break;
	            case 2:
	                p6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	                this.a();
	                v0_2 = 1;
	                break;
	            case 3:
	                p6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	                if (p6.readInt() != 0) {
	                    v0_0 = ((dq) dq.CREATOR.createFromParcel(p6));
	                }
	                this.a(v0_0);
	                v0_2 = 1;
	                break;
	            case 4:
	                p6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	                if (p6.readInt() != 0) {
	                    v0_0 = ((ci) ci.CREATOR.createFromParcel(p6));
	                }
	                this.a(v0_0);
	                v0_2 = 1;
	                break;
	            case 5:
	                p6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	                this.a(p6.createTypedArrayList(di.CREATOR));
	                v0_2 = 1;
	                break;
	            case 6:
	                p6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	                if (p6.readInt() != 0) {
	                    v0_0 = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p6));
	                }
	                this.a(v0_0);
	                v0_2 = 1;
	                break;
	            case 7:
	                p6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	                if (p6.readInt() != 0) {
	                    v0_0 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p6));
	                }
	                this.a(v0_0);
	                v0_2 = 1;
	                break;
	            case 8:
	                p6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	                if (p6.readInt() != 0) {
	                    v0_0 = ((do) do.CREATOR.createFromParcel(p6));
	                }
	                this.a(v0_0);
	                v0_2 = 1;
	                break;
	            case 1598968902:
	                p7.writeString("android.support.v4.media.session.IMediaControllerCallback");
	                v0_2 = 1;
	                break;
	            default:
	                v0_2 = super.onTransact(p5, p6, p7, p8);
	        }
	        return v0_2;
	    }
	
