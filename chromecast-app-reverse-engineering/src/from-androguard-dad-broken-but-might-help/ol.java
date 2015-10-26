	private synthetic oi a
	
	    ol(oi p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p7)
	    {
	        Exception v0_0 = p7.getId();
	        if ((v0_0 != b.v) && (v0_0 != b.n)) {
	            if (v0_0 != b.s) {
	                if (v0_0 == b.u) {
	                    Exception v0_3 = oi.d(this.a).n;
	                    if (v0_3 != null) {
	                        try {
	                            v0_3.sendIntent(0, 0, 0, 0, 0);
	                            this.a.dismiss();
	                        } catch (Exception v0_5) {
	                            android.util.Log.e("MediaRouteControllerDialog", "Error opening route settings.", v0_5);
	                        }
	                    }
	                }
	            } else {
	                if ((oi.f(this.a) != null) && (oi.i(this.a) != null)) {
	                    if (oi.i(this.a).a != 3) {
	                        oi.f(this.a).a().a();
	                    } else {
	                        oi.f(this.a).a().b();
	                    }
	                }
	            }
	        } else {
	            if (oi.d(this.a).a()) {
	                Exception v0_19;
	                oi.h(this.a);
	                if (v0_0 != b.v) {
	                    v0_19 = 1;
	                } else {
	                    v0_19 = 2;
	                }
	                if ((v0_19 >= null) && (v0_19 <= 3)) {
	                    tz.f();
	                    tz.a.a(tz.c(), v0_19);
	                } else {
	                    throw new IllegalArgumentException("Unsupported reason to unselect route");
	                }
	            }
	            this.a.dismiss();
	        }
	        return;
	    }
	
