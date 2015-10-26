	private  a
	private  b
	private  c
	private lh d
	
	    public yf(android.content.Context p3, boolean p4)
	    {
	        this(p3, 0, a.G);
	        this.b = p4;
	        this.setCacheColorHint(0);
	        return;
	    }
	
	
	    static synthetic boolean a(yf p0, boolean p1)
	    {
	        p0.a = p1;
	        return p1;
	    }
	
	
	    protected final boolean a()
	    {
	        if ((!this.c) && (!super.a())) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean a(android.view.MotionEvent p9, int p10)
	    {
	        int v3_1;
	        lh v0_1;
	        lh v0_0;
	        int v3_0 = gd.a(p9);
	        switch (v3_0) {
	            case 1:
	                v0_1 = 0;
	                long v4_0 = p9.findPointerIndex(p10);
	                if (v4_0 >= 0) {
	                    float v5_1 = ((int) p9.getX(v4_0));
	                    long v4_2 = ((int) p9.getY(v4_0));
	                    int v6 = this.pointToPosition(v5_1, v4_2);
	                    if (v6 != -1) {
	                        lh v0_4 = this.getChildAt((v6 - this.getFirstVisiblePosition()));
	                        float v5_2 = ((float) v5_1);
	                        long v4_3 = ((float) v4_2);
	                        this.c = 1;
	                        this.setPressed(1);
	                        this.layoutChildren();
	                        this.setSelection(v6);
	                        this.a(v6, v0_4, v5_2, v4_3);
	                        this.a(0);
	                        this.refreshDrawableState();
	                        if (v3_0 != 1) {
	                            v0_0 = 0;
	                            v3_1 = 1;
	                        } else {
	                            this.performItemClick(v0_4, v6, this.getItemIdAtPosition(v6));
	                        }
	                    } else {
	                        v3_1 = v0_1;
	                        v0_0 = 1;
	                    }
	                } else {
	                    v0_0 = 0;
	                    v3_1 = 0;
	                }
	                break;
	            case 2:
	                v0_1 = 1;
	                break;
	            case 3:
	                v0_0 = 0;
	                v3_1 = 0;
	                break;
	            default:
	        }
	        if ((v3_1 == 0) || (v0_0 != null)) {
	            this.c = 0;
	            this.setPressed(0);
	            this.drawableStateChanged();
	        }
	        if (v3_1 == 0) {
	            if (this.d != null) {
	                this.d.a(0);
	            }
	        } else {
	            if (this.d == null) {
	                this.d = new lh(this);
	            }
	            this.d.a(1);
	            this.d.onTouch(this, p9);
	        }
	        return v3_1;
	    }
	
	
	    public final boolean hasFocus()
	    {
	        if ((!this.b) && (!super.hasFocus())) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean hasWindowFocus()
	    {
	        if ((!this.b) && (!super.hasWindowFocus())) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean isFocused()
	    {
	        if ((!this.b) && (!super.isFocused())) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean isInTouchMode()
	    {
	        if (((!this.b) || (!this.a)) && (!super.isInTouchMode())) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
