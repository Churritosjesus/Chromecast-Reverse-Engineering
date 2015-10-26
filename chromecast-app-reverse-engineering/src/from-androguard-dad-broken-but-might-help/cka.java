	
	    public cka()
	    {
	        this.attachInterface(this, "com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
	        return;
	    }
	
	
	    public android.os.IBinder asBinder()
	    {
	        return this;
	    }
	
	
	    public boolean onTransact(int p3, android.os.Parcel p4, android.os.Parcel p5, int p6)
	    {
	        boolean v0 = 1;
	        switch (p3) {
	            case 1:
	                p4.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
	                this.a(p4.readInt());
	                break;
	            case 1598968902:
	                p5.writeString("com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
	                break;
	            default:
	                v0 = super.onTransact(p3, p4, p5, p6);
	        }
	        return v0;
	    }
	
