	private synthetic kx a
	
	    ky(kx p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void run()
	    {
	        mf v3_0;
	        int v7 = 0;
	        int v6_0 = this.a;
	        android.view.View v2_0 = v6_0.b.k;
	        if (v6_0.a != 3) {
	            v3_0 = 0;
	        } else {
	            v3_0 = 1;
	        }
	        android.view.View v2_1;
	        int v1_2;
	        if (v3_0 == null) {
	            v2_1 = v6_0.c.b(5);
	            v1_2 = (v6_0.c.getWidth() - v2_0);
	        } else {
	            android.view.MotionEvent v0_7;
	            int v1_3 = v6_0.c.b(3);
	            if (v1_3 == 0) {
	                v0_7 = 0;
	            } else {
	                v0_7 = (- v1_3.getWidth());
	            }
	            v2_1 = v1_3;
	            v1_2 = (v0_7 + v2_0);
	        }
	        if (((v2_1 != null) && (((v3_0 != null) && (v2_1.getLeft() < v1_2)) || ((v3_0 == null) && (v2_1.getLeft() > v1_2)))) && (v6_0.c.a(v2_1) == 0)) {
	            android.view.MotionEvent v0_15 = ((ku) v2_1.getLayoutParams());
	            v6_0.b.a(v2_1, v1_2, v2_1.getTop());
	            v0_15.c = 1;
	            v6_0.c.invalidate();
	            v6_0.b();
	            android.support.v4.widget.DrawerLayout v9_1 = v6_0.c;
	            if (!v9_1.e) {
	                android.view.MotionEvent v0_18 = android.os.SystemClock.uptimeMillis();
	                android.view.MotionEvent v0_19 = android.view.MotionEvent.obtain(v0_18, v0_18, 3, 0, 0, 0);
	                int v1_4 = v9_1.getChildCount();
	                while (v7 < v1_4) {
	                    v9_1.getChildAt(v7).dispatchTouchEvent(v0_19);
	                    v7++;
	                }
	                v0_19.recycle();
	                v9_1.e = 1;
	            }
	        }
	        return;
	    }
	
