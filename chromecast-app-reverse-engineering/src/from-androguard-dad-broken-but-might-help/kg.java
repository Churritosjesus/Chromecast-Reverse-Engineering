	private synthetic ke a
	
	    kg(ke p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void run()
	    {
	        if (ke.a(this.a)) {
	            if (ke.b(this.a)) {
	                ke.a(this.a, 0);
	                android.view.View v0_6 = ke.c(this.a);
	                v0_6.e = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
	                v0_6.i = -1;
	                v0_6.f = v0_6.e;
	                v0_6.j = 1056964608;
	                v0_6.g = 0;
	                v0_6.h = 0;
	            }
	            android.view.View v0_11;
	            kf v2_4 = ke.c(this.a);
	            if ((v2_4.i <= 0) || (android.view.animation.AnimationUtils.currentAnimationTimeMillis() <= (v2_4.i + ((long) v2_4.k)))) {
	                v0_11 = 0;
	            } else {
	                v0_11 = 1;
	            }
	            if ((v0_11 == null) && (ke.d(this.a))) {
	                if (ke.e(this.a)) {
	                    ke.c(this.a, 0);
	                    ke.f(this.a);
	                }
	                if (v2_4.f != 0) {
	                    android.view.View v0_20 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
	                    float v3_0 = v2_4.a(v0_20);
	                    float v3_2 = ((v3_0 * 1082130432) + ((-1065353216 * v3_0) * v3_0));
	                    long v4_6 = (v0_20 - v2_4.f);
	                    v2_4.f = v0_20;
	                    v2_4.g = ((int) ((((float) v4_6) * v3_2) * v2_4.c));
	                    v2_4.h = ((int) ((((float) v4_6) * v3_2) * v2_4.d));
	                    this.a.a(v2_4.h);
	                    gt.a(ke.g(this.a), this);
	                } else {
	                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
	                }
	            } else {
	                ke.b(this.a, 0);
	            }
	        }
	        return;
	    }
	
