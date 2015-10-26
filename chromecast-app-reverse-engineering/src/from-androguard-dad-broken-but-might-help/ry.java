	private android.os.Parcelable a
	private synthetic rx b
	
	    ry(rx p2)
	    {
	        this.b = p2;
	        this.a = 0;
	        return;
	    }
	
	
	    public final void onChanged()
	    {
	        this.b.m = 1;
	        this.b.s = this.b.r;
	        this.b.r = this.b.c().getCount();
	        if ((!this.b.c().hasStableIds()) || ((this.a == null) || ((this.b.s != 0) || (this.b.r <= 0)))) {
	            int v0_11 = this.b;
	            if (v0_11.getChildCount() > 0) {
	                v0_11.i = 1;
	                if (v0_11.p < 0) {
	                    android.os.Parcelable v1_7 = v0_11.getChildAt(0);
	                    int v2_0 = v0_11.c();
	                    if ((v0_11.f < 0) || (v0_11.f >= v2_0.getCount())) {
	                        v0_11.h = -1;
	                    } else {
	                        v0_11.h = v2_0.getItemId(v0_11.f);
	                    }
	                    v0_11.g = v0_11.f;
	                    if (v1_7 != null) {
	                        v1_7.getTop();
	                    }
	                    v0_11.j = 1;
	                } else {
	                    android.os.Parcelable v1_10 = v0_11.getChildAt((v0_11.p - v0_11.f));
	                    v0_11.h = v0_11.o;
	                    v0_11.g = v0_11.n;
	                    if (v1_10 != null) {
	                        v1_10.getTop();
	                    }
	                    v0_11.j = 0;
	                }
	            }
	        } else {
	            rx.a(this.b, this.a);
	            this.a = 0;
	        }
	        this.b.d();
	        this.b.requestLayout();
	        return;
	    }
	
	
	    public final void onInvalidated()
	    {
	        this.b.m = 1;
	        if (this.b.c().hasStableIds()) {
	            this.a = rx.a(this.b);
	        }
	        this.b.s = this.b.r;
	        this.b.r = 0;
	        this.b.p = -1;
	        this.b.q = -0.0;
	        this.b.n = -1;
	        this.b.o = -0.0;
	        this.b.i = 0;
	        this.b.d();
	        this.b.requestLayout();
	        return;
	    }
	
