	private synthetic dcw a
	private synthetic aow b
	private synthetic java.lang.String c
	private synthetic android.view.View d
	private synthetic bmu e
	
	    bnk(bmu p1, dcw p2, aow p3, String p4, android.view.View p5)
	    {
	        this.e = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.d = p5;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p8)
	    {
	        if (this.a.b() != dco.c) {
	            if (!android.text.TextUtils.isEmpty(this.c)) {
	                Integer v0_9;
	                this.d.getContext().startActivity(asr.a(this.c, this.d.getContext()));
	                Integer v0_8 = this.b.o().e;
	                ape v1_5 = ape.a();
	                if (v0_8 != null) {
	                    v0_9 = v0_8.b;
	                } else {
	                    v0_9 = 0;
	                }
	                v1_5.a(new apd(65, Integer.valueOf(v0_9)));
	            }
	        } else {
	            this.e.h.startActivity(com.google.android.apps.chromecast.app.DeviceSettingsActivity.a(this.e.h, this.b.f(), this.b.n(), this.b.c, this.e.e.a(this.b.j), this.b.j, this.b.k));
	        }
	        return;
	    }
	
