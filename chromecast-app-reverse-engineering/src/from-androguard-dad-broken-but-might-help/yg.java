	private final  a
	private final  b
	private final  c
	private final android.view.View d
	private java.lang.Runnable e
	private java.lang.Runnable f
	private  g
	private  h
	private  i
	private final I j
	
	    public yg(android.view.View p3)
	    {
	        int v0_1 = new int[2];
	        this.j = v0_1;
	        this.d = p3;
	        this.a = ((float) android.view.ViewConfiguration.get(p3.getContext()).getScaledTouchSlop());
	        this.b = android.view.ViewConfiguration.getTapTimeout();
	        this.c = ((this.b + android.view.ViewConfiguration.getLongPressTimeout()) / 2);
	        return;
	    }
	
	
	    static synthetic android.view.View a(yg p1)
	    {
	        return p1.d;
	    }
	
	
	    private boolean a(android.view.MotionEvent p7)
	    {
	        int v0 = 1;
	        int v2_0 = this.d;
	        boolean v3_0 = this.a();
	        if ((v3_0) && (v3_0.b.isShowing())) {
	            boolean v3_1 = yc.a(v3_0);
	            if ((v3_1) && (v3_1.isShown())) {
	                int v2_9;
	                int v4_3 = android.view.MotionEvent.obtainNoHistory(p7);
	                float v5_0 = this.j;
	                v2_0.getLocationOnScreen(v5_0);
	                v4_3.offsetLocation(((float) v5_0[0]), ((float) v5_0[1]));
	                int v2_3 = this.j;
	                v3_1.getLocationOnScreen(v2_3);
	                v4_3.offsetLocation(((float) (- v2_3[0])), ((float) (- v2_3[1])));
	                boolean v3_2 = v3_1.a(v4_3, this.i);
	                v4_3.recycle();
	                int v2_8 = gd.a(p7);
	                if ((v2_8 == 1) || (v2_8 == 3)) {
	                    v2_9 = 0;
	                } else {
	                    v2_9 = 1;
	                }
	                if ((!v3_2) || (v2_9 == 0)) {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        } else {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    static synthetic void b(yg p10)
	    {
	        void v10_1 = p10.d();
	        android.view.View v8 = v10_1.d;
	        if ((v8.isEnabled()) && ((!v8.isLongClickable()) && (v10_1.b()))) {
	            v8.getParent().requestDisallowInterceptTouchEvent(1);
	            android.view.MotionEvent v0_4 = android.os.SystemClock.uptimeMillis();
	            android.view.MotionEvent v0_5 = android.view.MotionEvent.obtain(v0_4, v0_4, 3, 0, 0, 0);
	            v8.onTouchEvent(v0_5);
	            v0_5.recycle();
	            v10_1.g = 1;
	            v10_1.h = 1;
	        }
	        return;
	    }
	
	
	    private void d()
	    {
	        if (this.f != null) {
	            this.d.removeCallbacks(this.f);
	        }
	        if (this.e != null) {
	            this.d.removeCallbacks(this.e);
	        }
	        return;
	    }
	
	
	    public boolean b()
	    {
	        int v0_0 = this.a();
	        if ((v0_0 != 0) && (!v0_0.b.isShowing())) {
	            v0_0.c();
	        }
	        return 1;
	    }
	
	
	    public boolean c()
	    {
	        int v0_0 = this.a();
	        if ((v0_0 != 0) && (v0_0.b.isShowing())) {
	            v0_0.a();
	        }
	        return 1;
	    }
	
	
	    public boolean onTouch(android.view.View p12, android.view.MotionEvent p13)
	    {
	        int v0_21;
	        int v7 = 0;
	        boolean v10 = this.g;
	        if (!v10) {
	            int v0_8;
	            android.view.View v1_0 = this.d;
	            if (!v1_0.isEnabled()) {
	                v0_8 = 0;
	            } else {
	                switch (gd.a(p13)) {
	                    case 0:
	                        this.i = p13.getPointerId(0);
	                        this.h = 0;
	                        if (this.e == null) {
	                            this.e = new yh(this);
	                        }
	                        v1_0.postDelayed(this.e, ((long) this.b));
	                        if (this.f == null) {
	                            this.f = new yi(this);
	                        }
	                        v1_0.postDelayed(this.f, ((long) this.c));
	                        break;
	                    case 1:
	                    case 3:
	                        this.d();
	                        break;
	                    case 2:
	                        int v0_3 = p13.findPointerIndex(this.i);
	                        if (v0_3 < 0) {
	                        } else {
	                            int v0_6;
	                            float v2_0 = p13.getX(v0_3);
	                            int v0_4 = p13.getY(v0_3);
	                            float v3 = this.a;
	                            if ((v2_0 < (- v3)) || ((v0_4 < (- v3)) || ((v2_0 >= (((float) (v1_0.getRight() - v1_0.getLeft())) + v3)) || (v0_4 >= (((float) (v1_0.getBottom() - v1_0.getTop())) + v3))))) {
	                                v0_6 = 0;
	                            } else {
	                                v0_6 = 1;
	                            }
	                            if (v0_6 != 0) {
	                            } else {
	                                this.d();
	                                v1_0.getParent().requestDisallowInterceptTouchEvent(1);
	                                v0_8 = 1;
	                            }
	                        }
	                        break;
	                    default:
	                }
	            }
	            if ((v0_8 == 0) || (!this.b())) {
	                int v9 = 0;
	            } else {
	                v9 = 1;
	            }
	            if (v9 != 0) {
	                int v0_19 = android.os.SystemClock.uptimeMillis();
	                int v0_20 = android.view.MotionEvent.obtain(v0_19, v0_19, 3, 0, 0, 0);
	                this.d.onTouchEvent(v0_20);
	                v0_20.recycle();
	            }
	            v0_21 = v9;
	        } else {
	            if (!this.h) {
	                if ((!this.a(p13)) && (this.c())) {
	                    v0_21 = 0;
	                } else {
	                    v0_21 = 1;
	                }
	            } else {
	                v0_21 = this.a(p13);
	            }
	        }
	        this.g = v0_21;
	        if ((v0_21 != 0) || (v10)) {
	            v7 = 1;
	        }
	        return v7;
	    }
	
