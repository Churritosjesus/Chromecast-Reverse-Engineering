	private synthetic aow a
	private synthetic java.lang.String b
	private synthetic boc c
	private synthetic bmu d
	
	    bnh(bmu p1, aow p2, String p3, boc p4)
	    {
	        this.d = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final void a(android.graphics.Bitmap p5)
	    {
	        android.animation.ValueAnimator v0_1 = new Object[2];
	        v0_1[0] = this.a.g();
	        v0_1[1] = this.b;
	        if (p5 != null) {
	            android.animation.ValueAnimator v0_3 = this.c.n;
	            boolean v1_3 = this.b;
	            if ((v0_3.g != null) && (v0_3.g.equals(v1_3))) {
	                if (!android.text.TextUtils.equals(v0_3.i, v1_3)) {
	                    v0_3.e = p5;
	                    if ((android.os.Build$VERSION.SDK_INT >= 11) && (!v0_3.a.isRunning())) {
	                        v0_3.a.start();
	                    } else {
	                        v0_3.c = p5;
	                    }
	                } else {
	                    v0_3.c = p5;
	                    v0_3.invalidate();
	                }
	            }
	        } else {
	            android.animation.ValueAnimator v0_5 = new Object[1];
	            v0_5[0] = this.a.g();
	        }
	        return;
	    }
	
