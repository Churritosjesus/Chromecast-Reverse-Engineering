	private synthetic bkh a
	
	    bki(bkh p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final synthetic void a(bwm p9)
	    {
	        this.a.a = 0;
	        if (((ctn) p9).b().a()) {
	            this.a.c = ((ctn) p9);
	            this.a.d = this.a.c.c();
	            try {
	                blp v1_9 = this.a.g;
	                v1_9.e = ((dam) dew.a(new dam(), android.util.Base64.decode(this.a.d.a("announcements").getBytes(), 0))).a;
	                v1_9.a();
	            } catch (bkk v0_13) {
	                blp v1_11 = this.a.f;
	                Object[] v3_0 = new Object[2];
	                v3_0[0] = com.google.android.apps.chromecast.app.SetupApplication.a().c().b();
	                v3_0[1] = v0_13.getMessage();
	                v1_11.a("Failed to properly load announcements from container: %s: %s", v3_0);
	            }
	            try {
	                this.a.h.a = ((dao) dew.a(new dao(), android.util.Base64.decode(this.a.d.a("tutorials").getBytes(), 0))).a;
	            } catch (bkk v0_23) {
	                blp v1_19 = this.a.f;
	                Object[] v3_1 = new Object[2];
	                v3_1[0] = com.google.android.apps.chromecast.app.SetupApplication.a().c().b();
	                v3_1[1] = v0_23.getMessage();
	                v1_19.a("Failed to properly load tutorials from container: %s: %s", v3_1);
	            }
	            if ((this.a.b == null) && (this.a.e != null)) {
	                this.a.e.f();
	            }
	        } else {
	            if ((this.a.b == null) && (this.a.e != null)) {
	                this.a.e.f();
	            }
	        }
	        return;
	    }
	
