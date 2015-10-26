	
	    public static cq a(android.os.IBinder p2)
	    {
	        cq v0_3;
	        if (p2 != null) {
	            cq v0_1 = p2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
	            if ((v0_1 == null) || (!(v0_1 instanceof cq))) {
	                v0_3 = new cs(p2);
	            } else {
	                v0_3 = ((cq) v0_1);
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public boolean onTransact(int p6, android.os.Parcel p7, android.os.Parcel p8, int p9)
	    {
	        boolean v1_0 = 0;
	        boolean v3 = 1;
	        switch (p6) {
	            case 1:
	                boolean v1_6;
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                String v4 = p7.readString();
	                if (p7.readInt() == 0) {
	                    v1_6 = 0;
	                } else {
	                    v1_6 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p7));
	                }
	                boolean v0_79;
	                if (p7.readInt() == 0) {
	                    v0_79 = 0;
	                } else {
	                    v0_79 = ((dk) dk.CREATOR.createFromParcel(p7));
	                }
	                this.a(v4, v1_6, v0_79);
	                p8.writeNoException();
	                break;
	            case 2:
	                boolean v0_68;
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                if (p7.readInt() == 0) {
	                    v0_68 = 0;
	                } else {
	                    v0_68 = ((android.view.KeyEvent) android.view.KeyEvent.CREATOR.createFromParcel(p7));
	                }
	                boolean v0_72;
	                boolean v0_71 = this.a(v0_68);
	                p8.writeNoException();
	                if (!v0_71) {
	                    v0_72 = 0;
	                } else {
	                    v0_72 = 1;
	                }
	                p8.writeInt(v0_72);
	                break;
	            case 3:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.a(co.a(p7.readStrongBinder()));
	                p8.writeNoException();
	                break;
	            case 4:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.b(co.a(p7.readStrongBinder()));
	                p8.writeNoException();
	                break;
	            case 5:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_59 = this.a();
	                p8.writeNoException();
	                if (v0_59) {
	                    v1_0 = 1;
	                }
	                p8.writeInt(v1_0);
	                break;
	            case 6:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_57 = this.b();
	                p8.writeNoException();
	                p8.writeString(v0_57);
	                break;
	            case 7:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_55 = this.c();
	                p8.writeNoException();
	                p8.writeString(v0_55);
	                break;
	            case 8:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_53 = this.d();
	                p8.writeNoException();
	                if (!v0_53) {
	                    p8.writeInt(0);
	                } else {
	                    p8.writeInt(1);
	                    v0_53.writeToParcel(p8, 1);
	                }
	                break;
	            case 9:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_51 = this.e();
	                p8.writeNoException();
	                p8.writeLong(v0_51);
	                break;
	            case 10:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_49 = this.f();
	                p8.writeNoException();
	                if (!v0_49) {
	                    p8.writeInt(0);
	                } else {
	                    p8.writeInt(1);
	                    v0_49.writeToParcel(p8, 1);
	                }
	                break;
	            case 11:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.a(p7.readInt(), p7.readInt(), p7.readString());
	                p8.writeNoException();
	                break;
	            case 12:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.b(p7.readInt(), p7.readInt(), p7.readString());
	                p8.writeNoException();
	                break;
	            case 13:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.g();
	                p8.writeNoException();
	                break;
	            case 14:
	                boolean v0_40;
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v1_3 = p7.readString();
	                if (p7.readInt() == 0) {
	                    v0_40 = 0;
	                } else {
	                    v0_40 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p7));
	                }
	                this.a(v1_3, v0_40);
	                p8.writeNoException();
	                break;
	            case 15:
	                boolean v0_35;
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v1_2 = p7.readString();
	                if (p7.readInt() == 0) {
	                    v0_35 = 0;
	                } else {
	                    v0_35 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p7));
	                }
	                this.b(v1_2, v0_35);
	                p8.writeNoException();
	                break;
	            case 16:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.a(p7.readLong());
	                p8.writeNoException();
	                break;
	            case 17:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.h();
	                p8.writeNoException();
	                break;
	            case 18:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.i();
	                p8.writeNoException();
	                break;
	            case 19:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.j();
	                p8.writeNoException();
	                break;
	            case 20:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.k();
	                p8.writeNoException();
	                break;
	            case 21:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.l();
	                p8.writeNoException();
	                break;
	            case 22:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.m();
	                p8.writeNoException();
	                break;
	            case 23:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                this.b(p7.readLong());
	                p8.writeNoException();
	                break;
	            case 24:
	                boolean v0_20;
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                if (p7.readInt() == 0) {
	                    v0_20 = 0;
	                } else {
	                    v0_20 = ((cl) cl.CREATOR.createFromParcel(p7));
	                }
	                this.a(v0_20);
	                p8.writeNoException();
	                break;
	            case 25:
	                boolean v0_15;
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v1_1 = p7.readString();
	                if (p7.readInt() == 0) {
	                    v0_15 = 0;
	                } else {
	                    v0_15 = ((android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(p7));
	                }
	                this.c(v1_1, v0_15);
	                p8.writeNoException();
	                break;
	            case 26:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_12 = this.n();
	                p8.writeNoException();
	                if (!v0_12) {
	                    p8.writeInt(0);
	                } else {
	                    p8.writeInt(1);
	                    v0_12.writeToParcel(p8, 1);
	                }
	                break;
	            case 27:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_10 = this.o();
	                p8.writeNoException();
	                if (!v0_10) {
	                    p8.writeInt(0);
	                } else {
	                    p8.writeInt(1);
	                    v0_10.writeToParcel(p8, 1);
	                }
	                break;
	            case 28:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_8 = this.p();
	                p8.writeNoException();
	                p8.writeTypedList(v0_8);
	                break;
	            case 29:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_6 = this.q();
	                p8.writeNoException();
	                if (!v0_6) {
	                    p8.writeInt(0);
	                } else {
	                    p8.writeInt(1);
	                    android.text.TextUtils.writeToParcel(v0_6, p8, 1);
	                }
	                break;
	            case 30:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_4 = this.r();
	                p8.writeNoException();
	                if (!v0_4) {
	                    p8.writeInt(0);
	                } else {
	                    p8.writeInt(1);
	                    v0_4.writeToParcel(p8, 1);
	                }
	                break;
	            case 31:
	                p7.enforceInterface("android.support.v4.media.session.IMediaSession");
	                boolean v0_2 = this.s();
	                p8.writeNoException();
	                p8.writeInt(v0_2);
	                break;
	            case 1598968902:
	                p8.writeString("android.support.v4.media.session.IMediaSession");
	                break;
	            default:
	                v3 = super.onTransact(p6, p7, p8, p9);
	        }
	        return v3;
	    }
	
