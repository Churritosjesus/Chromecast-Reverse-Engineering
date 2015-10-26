	public android.util.TypedValue a
	public android.util.TypedValue b
	public android.util.TypedValue c
	public android.util.TypedValue d
	public android.util.TypedValue e
	public android.util.TypedValue f
	public final android.graphics.Rect g
	
	    public ContentFrameLayout(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public ContentFrameLayout(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public ContentFrameLayout(android.content.Context p2, android.util.AttributeSet p3, int p4)
	    {
	        this(p2, p3, p4);
	        this.g = new android.graphics.Rect();
	        return;
	    }
	
	
	    public final void a(android.graphics.Rect p1)
	    {
	        this.fitSystemWindows(p1);
	        return;
	    }
	
	
	    protected void onMeasure(int p13, int p14)
	    {
	        int v0_3;
	        int v2 = 0;
	        int v5_0 = this.getContext().getResources().getDisplayMetrics();
	        if (v5_0.widthPixels >= v5_0.heightPixels) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        int v4_5;
	        int v6_0 = android.view.View$MeasureSpec.getMode(p13);
	        int v7_0 = android.view.View$MeasureSpec.getMode(p14);
	        if (v6_0 != -2147483648) {
	            v4_5 = 0;
	        } else {
	            int v3_1;
	            if (v0_3 == 0) {
	                v3_1 = this.c;
	            } else {
	                v3_1 = this.d;
	            }
	            if ((v3_1 == 0) || (v3_1.type == 0)) {
	            } else {
	                int v3_2;
	                if (v3_1.type != 5) {
	                    if (v3_1.type != 6) {
	                        v3_2 = 0;
	                    } else {
	                        v3_2 = ((int) v3_1.getFraction(((float) v5_0.widthPixels), ((float) v5_0.widthPixels)));
	                    }
	                } else {
	                    v3_2 = ((int) v3_1.getDimension(v5_0));
	                }
	                if (v3_2 <= 0) {
	                } else {
	                    p13 = android.view.View$MeasureSpec.makeMeasureSpec(Math.min((v3_2 - (this.g.left + this.g.right)), android.view.View$MeasureSpec.getSize(p13)), 1073741824);
	                    v4_5 = 1;
	                }
	            }
	        }
	        if (v7_0 == -2147483648) {
	            int v3_7;
	            if (v0_3 == 0) {
	                v3_7 = this.f;
	            } else {
	                v3_7 = this.e;
	            }
	            if ((v3_7 != 0) && (v3_7.type != 0)) {
	                int v3_8;
	                if (v3_7.type != 5) {
	                    if (v3_7.type != 6) {
	                        v3_8 = 0;
	                    } else {
	                        v3_8 = ((int) v3_7.getFraction(((float) v5_0.heightPixels), ((float) v5_0.heightPixels)));
	                    }
	                } else {
	                    v3_8 = ((int) v3_7.getDimension(v5_0));
	                }
	                if (v3_8 > 0) {
	                    p14 = android.view.View$MeasureSpec.makeMeasureSpec(Math.min((v3_8 - (this.g.top + this.g.bottom)), android.view.View$MeasureSpec.getSize(p14)), 1073741824);
	                }
	            }
	        }
	        int v0_8;
	        super.onMeasure(p13, p14);
	        int v7_10 = this.getMeasuredWidth();
	        int v3_13 = android.view.View$MeasureSpec.makeMeasureSpec(v7_10, 1073741824);
	        if ((v4_5 != 0) || (v6_0 != -2147483648)) {
	            v0_8 = v3_13;
	        } else {
	            int v0_4;
	            if (v0_3 == 0) {
	                v0_4 = this.a;
	            } else {
	                v0_4 = this.b;
	            }
	            if ((v0_4 == 0) || (v0_4.type == 0)) {
	            } else {
	                int v0_5;
	                if (v0_4.type != 5) {
	                    if (v0_4.type != 6) {
	                        v0_5 = 0;
	                    } else {
	                        v0_5 = ((int) v0_4.getFraction(((float) v5_0.widthPixels), ((float) v5_0.widthPixels)));
	                    }
	                } else {
	                    v0_5 = ((int) v0_4.getDimension(v5_0));
	                }
	                if (v0_5 > 0) {
	                    v0_5 -= (this.g.left + this.g.right);
	                }
	                if (v7_10 >= v0_5) {
	                } else {
	                    v0_8 = android.view.View$MeasureSpec.makeMeasureSpec(v0_5, 1073741824);
	                    v2 = 1;
	                }
	            }
	        }
	        if (v2 != 0) {
	            super.onMeasure(v0_8, p14);
	        }
	        return;
	    }
	
