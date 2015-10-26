	final java.lang.ref.WeakReference a
	final bvz b
	final  c
	
	    public bwi(bws p2, bvz p3, int p4)
	    {
	        this.a = new ref.WeakReference(p2);
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public void a(com.google.android.gms.common.ConnectionResult p5)
	    {
	        boolean v1_0 = 0;
	        java.util.concurrent.locks.Lock v0_2 = ((bws) this.a.get());
	        if (v0_2 != null) {
	            if (android.os.Looper.myLooper() == v0_2.a.e) {
	                v1_0 = 1;
	            }
	            a.a(v1_0, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
	            v0_2.b.lock();
	            try {
	                if (v0_2.b(0)) {
	                    if (!p5.b()) {
	                        v0_2.b(p5, this.b, this.c);
	                    }
	                    if (v0_2.d()) {
	                        if (!v0_2.e) {
	                            v0_2.g();
	                        } else {
	                            v0_2.e();
	                        }
	                    }
	                    v0_2.b.unlock();
	                } else {
	                    v0_2.b.unlock();
	                }
	            } catch (boolean v1_8) {
	                v0_2.b.unlock();
	                throw v1_8;
	            }
	        }
	        return;
	    }
	
	
	    public void b(com.google.android.gms.common.ConnectionResult p5)
	    {
	        boolean v1_0 = 1;
	        java.util.concurrent.locks.Lock v0_2 = ((bws) this.a.get());
	        if (v0_2 != null) {
	            if (android.os.Looper.myLooper() != v0_2.a.e) {
	                v1_0 = 0;
	            }
	            a.a(v1_0, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
	            v0_2.b.lock();
	            try {
	                if (v0_2.b(1)) {
	                    if (!p5.b()) {
	                        v0_2.b(p5, this.b, this.c);
	                    }
	                    if (v0_2.d()) {
	                        v0_2.f();
	                    }
	                    v0_2.b.unlock();
	                } else {
	                    v0_2.b.unlock();
	                }
	            } catch (boolean v1_7) {
	                v0_2.b.unlock();
	                throw v1_7;
	            }
	        }
	        return;
	    }
	
