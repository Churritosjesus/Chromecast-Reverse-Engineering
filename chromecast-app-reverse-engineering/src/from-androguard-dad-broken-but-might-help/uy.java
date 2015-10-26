	final java.lang.ref.WeakReference a
	
	    public uy(ut p2)
	    {
	        this.a = new ref.WeakReference(p2);
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p9)
	    {
	        int v0_2 = ((ut) this.a.get());
	        if (v0_2 != 0) {
	            int v0_3;
	            String v4_0 = p9.what;
	            int v5 = p9.arg1;
	            int v6 = p9.arg2;
	            us v1_0 = p9.obj;
	            android.os.Bundle v7 = p9.peekData();
	            switch (v4_0) {
	                case 0:
	                    if (v5 == v0_2.f) {
	                        v0_2.f = 0;
	                        us.a(v0_2.h, v0_2, "Registation failed");
	                    }
	                    if (((a) v0_2.g.get(v5)) != null) {
	                        v0_2.g.remove(v5);
	                    }
	                    v0_3 = 1;
	                    break;
	                case 1:
	                    v0_3 = 1;
	                    break;
	                case 2:
	                    if ((v1_0 != null) && (!(v1_0 instanceof android.os.Bundle))) {
	                        v0_3 = 0;
	                    } else {
	                        us v1_9 = ((android.os.Bundle) v1_0);
	                        if ((v0_2.e != 0) || ((v5 != v0_2.f) || (v6 <= 0))) {
	                            v0_3 = 0;
	                        } else {
	                            v0_2.f = 0;
	                            v0_2.e = v6;
	                            us.a(v0_2.h, v0_2, tv.a(v1_9));
	                            us.a(v0_2.h, v0_2);
	                            v0_3 = 1;
	                        }
	                    }
	                    break;
	                case 3:
	                    if ((v1_0 != null) && (!(v1_0 instanceof android.os.Bundle))) {
	                    } else {
	                        if (((a) v0_2.g.get(v5)) == null) {
	                            v0_3 = 0;
	                        } else {
	                            v0_2.g.remove(v5);
	                            v0_3 = 1;
	                        }
	                    }
	                    break;
	                case 4:
	                    if ((v1_0 != null) && (!(v1_0 instanceof android.os.Bundle))) {
	                    } else {
	                        if (v7 != null) {
	                            v7.getString("error");
	                        }
	                        if (((a) v0_2.g.get(v5)) == null) {
	                            v0_3 = 0;
	                        } else {
	                            v0_2.g.remove(v5);
	                            v0_3 = 1;
	                        }
	                    }
	                    break;
	                case 5:
	                    if ((v1_0 != null) && (!(v1_0 instanceof android.os.Bundle))) {
	                    } else {
	                        if (v0_2.e == 0) {
	                            v0_3 = 0;
	                        } else {
	                            us.a(v0_2.h, v0_2, tv.a(((android.os.Bundle) v1_0)));
	                            v0_3 = 1;
	                        }
	                    }
	                    break;
	                default:
	            }
	            if ((v0_3 == 0) && (us.f())) {
	                new StringBuilder("Unhandled message from server: ").append(p9);
	            }
	        }
	        return;
	    }
	
