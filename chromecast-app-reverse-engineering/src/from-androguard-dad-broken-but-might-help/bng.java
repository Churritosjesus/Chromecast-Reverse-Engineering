	private synthetic aow a
	private synthetic java.lang.String b
	private synthetic boc c
	private synthetic bmu d
	
	    bng(bmu p1, aow p2, String p3, boc p4)
	    {
	        this.d = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final void a(android.graphics.Bitmap p5)
	    {
	        com.google.android.apps.chromecast.app.widget.OverlaidImageView v0_1 = new Object[2];
	        v0_1[0] = this.a.g();
	        v0_1[1] = this.b;
	        if (p5 != null) {
	            com.google.android.apps.chromecast.app.widget.OverlaidImageView v0_3 = this.c.n;
	            android.animation.ValueAnimator v1_3 = this.b;
	            v0_3.k = 1;
	            if ((v0_3.f != null) && (v0_3.f.equals(v1_3))) {
	                if (!android.text.TextUtils.equals(v0_3.h, v1_3)) {
	                    v0_3.d = p5;
	                    if ((android.os.Build$VERSION.SDK_INT >= 11) && (!v0_3.a.isRunning())) {
	                        v0_3.a.start();
	                    } else {
	                        v0_3.b = p5;
	                    }
	                } else {
	                    v0_3.b = p5;
	                }
	                v0_3.invalidate();
	            }
	        } else {
	            com.google.android.apps.chromecast.app.widget.OverlaidImageView v0_4 = new Object[1];
	            v0_4[0] = this.a.g();
	        }
	        return;
	    }
	
