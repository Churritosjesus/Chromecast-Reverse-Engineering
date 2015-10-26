	public qa a
	public  b
	public vu c
	 qq d
	 qb e
	 wg f
	private android.content.Context i
	private android.content.Context j
	private  k
	private  l
	private  m
	private  n
	private  o
	
	    public ActionMenuView(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public ActionMenuView(android.content.Context p4, android.util.AttributeSet p5)
	    {
	        this(p4, p5);
	        this.i = p4;
	        this.g = 0;
	        int v0_2 = p4.getResources().getDisplayMetrics().density;
	        this.n = ((int) (1113587712 * v0_2));
	        this.o = ((int) (v0_2 * 1082130432));
	        this.j = p4;
	        this.k = 0;
	        return;
	    }
	
	
	    public static int a(android.view.View p8, int p9, int p10, int p11, int p12)
	    {
	        boolean v1_3;
	        int v2_0 = 0;
	        int v0_1 = ((we) p8.getLayoutParams());
	        int v6 = android.view.View$MeasureSpec.makeMeasureSpec((android.view.View$MeasureSpec.getSize(p11) - p12), android.view.View$MeasureSpec.getMode(p11));
	        if (!(p8 instanceof android.support.v7.internal.view.menu.ActionMenuItemView)) {
	            v1_3 = 0;
	        } else {
	            v1_3 = ((android.support.v7.internal.view.menu.ActionMenuItemView) p8);
	        }
	        if ((!v1_3) || (!v1_3.c())) {
	            int v5_1 = 0;
	        } else {
	            v5_1 = 1;
	        }
	        if ((p10 <= 0) || ((v5_1 != 0) && (p10 < 2))) {
	            boolean v1_6 = 0;
	        } else {
	            p8.measure(android.view.View$MeasureSpec.makeMeasureSpec((p9 * p10), -2147483648), v6);
	            int v7_1 = p8.getMeasuredWidth();
	            v1_6 = (v7_1 / p9);
	            if ((v7_1 % p9) != 0) {
	                v1_6++;
	            }
	            if ((v5_1 != 0) && (v1_6 < 2)) {
	                v1_6 = 2;
	            }
	        }
	        if ((!v0_1.a) && (v5_1 != 0)) {
	            v2_0 = 1;
	        }
	        v0_1.d = v2_0;
	        v0_1.b = v1_6;
	        p8.measure(android.view.View$MeasureSpec.makeMeasureSpec((v1_6 * p9), 1073741824), v6);
	        return v1_6;
	    }
	
	
	    public static synthetic wg a(android.support.v7.widget.ActionMenuView p1)
	    {
	        return p1.f;
	    }
	
	
	    public static synthetic qb b(android.support.v7.widget.ActionMenuView p1)
	    {
	        return p1.e;
	    }
	
	
	    private we b(android.util.AttributeSet p3)
	    {
	        return new we(this.getContext(), p3);
	    }
	
	
	    private boolean c(int p5)
	    {
	        int v0_5;
	        int v2 = 0;
	        if (p5 != 0) {
	            int v0_1 = this.getChildAt((p5 - 1));
	            android.view.View v1 = this.getChildAt(p5);
	            if ((p5 < this.getChildCount()) && ((v0_1 instanceof wc))) {
	                v2 = (((wc) v0_1).e() | 0);
	            }
	            if ((p5 <= 0) || (!(v1 instanceof wc))) {
	                v0_5 = v2;
	            } else {
	                v0_5 = (((wc) v1).d() | v2);
	            }
	        } else {
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
	
	    private static we e()
	    {
	        we v0_1 = new we(-2, -2);
	        v0_1.h = 16;
	        return v0_1;
	    }
	
	
	    public final we a()
	    {
	        we v0 = android.support.v7.widget.ActionMenuView.e();
	        v0.a = 1;
	        return v0;
	    }
	
	
	    public final we a(android.view.ViewGroup$LayoutParams p3)
	    {
	        we v0_0;
	        if (p3 == null) {
	            v0_0 = android.support.v7.widget.ActionMenuView.e();
	        } else {
	            if (!(p3 instanceof we)) {
	                v0_0 = new we(p3);
	            } else {
	                v0_0 = new we(((we) p3));
	            }
	            if (v0_0.h <= 0) {
	                v0_0.h = 16;
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic xv a(android.util.AttributeSet p2)
	    {
	        return this.b(p2);
	    }
	
	
	    public final void a(int p3)
	    {
	        if (this.k != p3) {
	            this.k = p3;
	            if (p3 != 0) {
	                this.j = new android.view.ContextThemeWrapper(this.i, p3);
	            } else {
	                this.j = this.i;
	            }
	        }
	        return;
	    }
	
	
	    public final void a(qa p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(vu p2)
	    {
	        this.c = p2;
	        this.c.a(this);
	        return;
	    }
	
	
	    public final boolean a(qe p4)
	    {
	        return this.a.a(p4, 0, 0);
	    }
	
	
	    public final android.view.Menu b()
	    {
	        if (this.a == null) {
	            vu v0_5;
	            vu v0_1 = this.getContext();
	            this.a = new qa(v0_1);
	            this.a.a(new wf(this));
	            this.c = new vu(v0_1);
	            this.c.c(1);
	            vu v1_6 = this.c;
	            if (this.d == null) {
	                v0_5 = new wd(this);
	            } else {
	                v0_5 = this.d;
	            }
	            v1_6.d = v0_5;
	            this.a.a(this.c, this.j);
	            this.c.a(this);
	        }
	        return this.a;
	    }
	
	
	    protected final synthetic xv b(android.view.ViewGroup$LayoutParams p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public final void c()
	    {
	        if (this.c != null) {
	            this.c.d();
	        }
	        return;
	    }
	
	
	    public boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        if ((p2 == null) || (!(p2 instanceof we))) {
	            int v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    protected final synthetic xv d()
	    {
	        return android.support.v7.widget.ActionMenuView.e();
	    }
	
	
	    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p2)
	    {
	        return 0;
	    }
	
	
	    protected synthetic android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
	    {
	        return android.support.v7.widget.ActionMenuView.e();
	    }
	
	
	    public synthetic android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p2)
	    {
	        return this.b(p2);
	    }
	
	
	    protected synthetic android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public void onConfigurationChanged(android.content.res.Configuration p3)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 8) {
	            super.onConfigurationChanged(p3);
	        }
	        if (this.c != null) {
	            this.c.b(0);
	            if (this.c.f()) {
	                this.c.c();
	                this.c.b();
	            }
	        }
	        return;
	    }
	
	
	    public void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        this.c();
	        return;
	    }
	
	
	    protected void onLayout(boolean p15, int p16, int p17, int p18, int p19)
	    {
	        if (this.l) {
	            int v6 = this.getChildCount();
	            int v7 = ((p19 - p17) / 2);
	            int v8_0 = this.h;
	            android.view.View v4_0 = 0;
	            int v3_0 = (((p18 - p16) - this.getPaddingRight()) - this.getPaddingLeft());
	            int v1_2 = 0;
	            int v9_0 = tm.a(this);
	            int v5_0 = 0;
	            while (v5_0 < v6) {
	                int v2_5;
	                int v0_27;
	                int v1_13;
	                int v10_2 = this.getChildAt(v5_0);
	                if (v10_2.getVisibility() == 8) {
	                    v0_27 = v1_2;
	                    v2_5 = v4_0;
	                    v1_13 = v3_0;
	                } else {
	                    int v0_29 = ((we) v10_2.getLayoutParams());
	                    if (!v0_29.a) {
	                        int v0_32 = (v3_0 - (v0_29.rightMargin + (v10_2.getMeasuredWidth() + v0_29.leftMargin)));
	                        this.c(v5_0);
	                        v2_5 = (v4_0 + 1);
	                        v1_13 = v0_32;
	                        v0_27 = v1_2;
	                    } else {
	                        int v1_14 = v10_2.getMeasuredWidth();
	                        if (this.c(v5_0)) {
	                            v1_14 += v8_0;
	                        }
	                        int v2_12;
	                        int v0_34;
	                        int v11_0 = v10_2.getMeasuredHeight();
	                        if (v9_0 == 0) {
	                            v2_12 = ((this.getWidth() - this.getPaddingRight()) - v0_29.rightMargin);
	                            v0_34 = (v2_12 - v1_14);
	                        } else {
	                            v0_34 = (v0_29.leftMargin + this.getPaddingLeft());
	                            v2_12 = (v0_34 + v1_14);
	                        }
	                        int v12_2 = (v7 - (v11_0 / 2));
	                        v10_2.layout(v0_34, v12_2, v2_12, (v11_0 + v12_2));
	                        v1_13 = (v3_0 - v1_14);
	                        v0_27 = 1;
	                        v2_5 = v4_0;
	                    }
	                }
	                v5_0++;
	                v4_0 = v2_5;
	                v3_0 = v1_13;
	                v1_2 = v0_27;
	            }
	            if ((v6 != 1) || (v1_2 != 0)) {
	                int v0_6;
	                if (v1_2 == 0) {
	                    v0_6 = 1;
	                } else {
	                    v0_6 = 0;
	                }
	                int v0_8;
	                int v0_7 = (v4_0 - v0_6);
	                if (v0_7 <= 0) {
	                    v0_8 = 0;
	                } else {
	                    v0_8 = (v3_0 / v0_7);
	                }
	                int v3_1 = Math.max(0, v0_8);
	                if (v9_0 == 0) {
	                    int v1_4 = this.getPaddingLeft();
	                    int v2_0 = 0;
	                    while (v2_0 < v6) {
	                        int v0_12;
	                        android.view.View v4_1 = this.getChildAt(v2_0);
	                        int v0_11 = ((we) v4_1.getLayoutParams());
	                        if ((v4_1.getVisibility() == 8) || (v0_11.a)) {
	                            v0_12 = v1_4;
	                        } else {
	                            int v1_5 = (v1_4 + v0_11.leftMargin);
	                            int v5_4 = v4_1.getMeasuredWidth();
	                            int v8_2 = v4_1.getMeasuredHeight();
	                            int v9_2 = (v7 - (v8_2 / 2));
	                            v4_1.layout(v1_5, v9_2, (v1_5 + v5_4), (v8_2 + v9_2));
	                            v0_12 = (((v0_11.rightMargin + v5_4) + v3_1) + v1_5);
	                        }
	                        v2_0++;
	                        v1_4 = v0_12;
	                    }
	                } else {
	                    int v1_8 = (this.getWidth() - this.getPaddingRight());
	                    int v2_1 = 0;
	                    while (v2_1 < v6) {
	                        int v0_20;
	                        android.view.View v4_2 = this.getChildAt(v2_1);
	                        int v0_19 = ((we) v4_2.getLayoutParams());
	                        if ((v4_2.getVisibility() == 8) || (v0_19.a)) {
	                            v0_20 = v1_8;
	                        } else {
	                            int v1_9 = (v1_8 - v0_19.rightMargin);
	                            int v5_8 = v4_2.getMeasuredWidth();
	                            int v8_5 = v4_2.getMeasuredHeight();
	                            int v9_4 = (v7 - (v8_5 / 2));
	                            v4_2.layout((v1_9 - v5_8), v9_4, v1_9, (v8_5 + v9_4));
	                            v0_20 = (v1_9 - ((v0_19.leftMargin + v5_8) + v3_1));
	                        }
	                        v2_1++;
	                        v1_8 = v0_20;
	                    }
	                }
	            } else {
	                int v0_25 = this.getChildAt(0);
	                int v1_11 = v0_25.getMeasuredWidth();
	                int v2_2 = v0_25.getMeasuredHeight();
	                int v3_4 = (((p18 - p16) / 2) - (v1_11 / 2));
	                android.view.View v4_5 = (v7 - (v2_2 / 2));
	                v0_25.layout(v3_4, v4_5, (v1_11 + v3_4), (v2_2 + v4_5));
	            }
	        } else {
	            super.onLayout(p15, p16, p17, p18, p19);
	        }
	        return;
	    }
	
	
	    protected void onMeasure(int p35, int p36)
	    {
	        int v6_1;
	        int v7_0 = this.l;
	        if (android.view.View$MeasureSpec.getMode(p35) != 1073741824) {
	            v6_1 = 0;
	        } else {
	            v6_1 = 1;
	        }
	        this.l = v6_1;
	        if (v7_0 != this.l) {
	            this.m = 0;
	        }
	        int v6_4 = android.view.View$MeasureSpec.getSize(p35);
	        if ((this.l) && ((this.a != null) && (v6_4 != this.m))) {
	            this.m = v6_4;
	            this.a.b(1);
	        }
	        int v8_1 = this.getChildCount();
	        if ((!this.l) || (v8_1 <= 0)) {
	            int v7_5 = 0;
	            while (v7_5 < v8_1) {
	                int v6_10 = ((we) this.getChildAt(v7_5).getLayoutParams());
	                v6_10.rightMargin = 0;
	                v6_10.leftMargin = 0;
	                v7_5++;
	            }
	            super.onMeasure(p35, p36);
	        } else {
	            int v23 = android.view.View$MeasureSpec.getMode(p36);
	            int v6_12 = android.view.View$MeasureSpec.getSize(p35);
	            int v17 = android.view.View$MeasureSpec.getSize(p36);
	            int v7_7 = (this.getPaddingLeft() + this.getPaddingRight());
	            int v19_0 = (this.getPaddingTop() + this.getPaddingBottom());
	            int v24 = android.support.v7.widget.ActionMenuView.getChildMeasureSpec(p36, v19_0, -2);
	            int v25 = (v6_12 - v7_7);
	            int v9_2 = (v25 / this.n);
	            if (v9_2 != 0) {
	                int v26 = (this.n + ((v25 % this.n) / v9_2));
	                int v16 = 0;
	                int v15_0 = 0;
	                int v10_0 = 0;
	                int v7_9 = 0;
	                long v11_0 = 0;
	                int v12_0 = 0;
	                int v27 = this.getChildCount();
	                long v18_0 = 0;
	                while (v18_0 < v27) {
	                    int v13;
	                    int v6_77;
	                    int v12_3;
	                    int v8_24;
	                    int v9_12;
	                    int v8_23 = this.getChildAt(v18_0);
	                    if (v8_23.getVisibility() == 8) {
	                        v8_24 = v7_9;
	                        v6_77 = v12_0;
	                        v12_3 = v16;
	                        v13 = v9_2;
	                        v9_12 = v15_0;
	                    } else {
	                        int v20_6 = (v8_23 instanceof android.support.v7.internal.view.menu.ActionMenuItemView);
	                        long v14_5 = (v7_9 + 1);
	                        if (v20_6 != 0) {
	                            v8_23.setPadding(this.o, 0, this.o, 0);
	                        }
	                        int v7_30;
	                        int v6_80 = ((we) v8_23.getLayoutParams());
	                        v6_80.f = 0;
	                        v6_80.c = 0;
	                        v6_80.b = 0;
	                        v6_80.d = 0;
	                        v6_80.leftMargin = 0;
	                        v6_80.rightMargin = 0;
	                        if ((v20_6 == 0) || (!((android.support.v7.internal.view.menu.ActionMenuItemView) v8_23).c())) {
	                            v7_30 = 0;
	                        } else {
	                            v7_30 = 1;
	                        }
	                        int v7_32;
	                        v6_80.e = v7_30;
	                        if (!v6_80.a) {
	                            v7_32 = v9_2;
	                        } else {
	                            v7_32 = 1;
	                        }
	                        int v7_34;
	                        int v20_7 = android.support.v7.widget.ActionMenuView.a(v8_23, v26, v7_32, v24, v19_0);
	                        int v15_1 = Math.max(v15_0, v20_7);
	                        if (!v6_80.d) {
	                            v7_34 = v10_0;
	                        } else {
	                            v7_34 = (v10_0 + 1);
	                        }
	                        int v6_82;
	                        if (!v6_80.a) {
	                            v6_82 = v11_0;
	                        } else {
	                            v6_82 = 1;
	                        }
	                        long v11_1 = (v9_2 - v20_7);
	                        int v10_11 = Math.max(v16, v8_23.getMeasuredHeight());
	                        if (v20_7 != 1) {
	                            v8_24 = v14_5;
	                            v9_12 = v15_1;
	                            v12_3 = v10_11;
	                            v13 = v11_1;
	                            v11_0 = v6_82;
	                            v10_0 = v7_34;
	                            v6_77 = v12_0;
	                        } else {
	                            v12_3 = v10_11;
	                            v13 = v11_1;
	                            v10_0 = v7_34;
	                            v11_0 = v6_82;
	                            v6_77 = (((long) (1 << v18_0)) | v12_0);
	                            v9_12 = v15_1;
	                            v8_24 = v14_5;
	                        }
	                    }
	                    v18_0++;
	                    v15_0 = v9_12;
	                    v16 = v12_3;
	                    v9_2 = v13;
	                    v12_0 = v6_77;
	                    v7_9 = v8_24;
	                }
	                if ((v11_0 == 0) || (v7_9 != 2)) {
	                    int v8_5 = 0;
	                } else {
	                    v8_5 = 1;
	                }
	                long v18_1 = 0;
	                int v20_0 = v12_0;
	                int v19_1 = v9_2;
	                while ((v10_0 > 0) && (v19_1 > 0)) {
	                    long v14_0 = 2147483647;
	                    int v12_1 = 0;
	                    int v9_3 = 0;
	                    int v22_0 = 0;
	                    while (v22_0 < v27) {
	                        int v9_11;
	                        int v6_71;
	                        int v6_69 = ((we) this.getChildAt(v22_0).getLayoutParams());
	                        if (!v6_69.d) {
	                            v6_71 = v9_3;
	                            v9_11 = v14_0;
	                        } else {
	                            if (v6_69.b >= v14_0) {
	                                if (v6_69.b != v14_0) {
	                                } else {
	                                    v12_1 |= ((long) (1 << v22_0));
	                                    v6_71 = (v9_3 + 1);
	                                    v9_11 = v14_0;
	                                }
	                            } else {
	                                v9_11 = v6_69.b;
	                                v12_1 = ((long) (1 << v22_0));
	                                v6_71 = 1;
	                            }
	                        }
	                        v22_0++;
	                        v14_0 = v9_11;
	                        v9_3 = v6_71;
	                    }
	                    v20_0 |= v12_1;
	                    if (v9_3 > v19_1) {
	                        break;
	                    }
	                    int v22_1 = (v14_0 + 1);
	                    long v14_2 = 0;
	                    int v9_9 = v19_1;
	                    long v18_2 = v20_0;
	                    while (v14_2 < v27) {
	                        int v6_63;
	                        int v20_1 = this.getChildAt(v14_2);
	                        int v6_62 = ((we) v20_1.getLayoutParams());
	                        if ((((long) (1 << v14_2)) & v12_1) != 0) {
	                            if ((v8_5 != 0) && ((v6_62.e) && (v9_9 == 1))) {
	                                v20_1.setPadding((this.o + v26), 0, this.o, 0);
	                            }
	                            v6_62.b = (v6_62.b + 1);
	                            v6_62.f = 1;
	                            v6_63 = (v9_9 - 1);
	                        } else {
	                            if (v6_62.b != v22_1) {
	                                v6_63 = v9_9;
	                            } else {
	                                v18_2 |= ((long) (1 << v14_2));
	                                v6_63 = v9_9;
	                            }
	                        }
	                        v14_2++;
	                        v9_9 = v6_63;
	                    }
	                    v20_0 = v18_2;
	                    v18_1 = 1;
	                    v19_1 = v9_9;
	                }
	                int v6_23;
	                int v12_2 = v20_0;
	                if ((v11_0 != 0) || (v7_9 != 1)) {
	                    v6_23 = 0;
	                } else {
	                    v6_23 = 1;
	                }
	                if ((v19_1 <= 0) || ((v12_2 == 0) || ((v19_1 >= (v7_9 - 1)) && ((v6_23 == 0) && (v15_0 <= 1))))) {
	                    int v8_8 = v18_1;
	                } else {
	                    int v6_39;
	                    int v7_13 = ((float) Long.bitCount(v12_2));
	                    if (v6_23 != 0) {
	                        v6_39 = v7_13;
	                    } else {
	                        if (((1 & v12_2) != 0) && (!((we) this.getChildAt(0).getLayoutParams()).e)) {
	                            v7_13 -= 1056964608;
	                        }
	                        if (((((long) (1 << (v27 - 1))) & v12_2) == 0) || (((we) this.getChildAt((v27 - 1)).getLayoutParams()).e)) {
	                        } else {
	                            v6_39 = (v7_13 - 1056964608);
	                        }
	                    }
	                    int v7_16;
	                    if (v6_39 <= 0) {
	                        v7_16 = 0;
	                    } else {
	                        v7_16 = ((int) (((float) (v19_1 * v26)) / v6_39));
	                    }
	                    int v9_4 = 0;
	                    v8_8 = v18_1;
	                    while (v9_4 < v27) {
	                        int v6_58;
	                        if ((((long) (1 << v9_4)) & v12_2) == 0) {
	                            v6_58 = v8_8;
	                        } else {
	                            int v10_5 = this.getChildAt(v9_4);
	                            int v6_57 = ((we) v10_5.getLayoutParams());
	                            if (!(v10_5 instanceof android.support.v7.internal.view.menu.ActionMenuItemView)) {
	                                if (!v6_57.a) {
	                                    if (v9_4 != 0) {
	                                        v6_57.leftMargin = (v7_16 / 2);
	                                    }
	                                    if (v9_4 == (v27 - 1)) {
	                                    } else {
	                                        v6_57.rightMargin = (v7_16 / 2);
	                                    }
	                                } else {
	                                    v6_57.c = v7_16;
	                                    v6_57.f = 1;
	                                    v6_57.rightMargin = ((- v7_16) / 2);
	                                    v6_58 = 1;
	                                }
	                            } else {
	                                v6_57.c = v7_16;
	                                v6_57.f = 1;
	                                if ((v9_4 == 0) && (!v6_57.e)) {
	                                    v6_57.leftMargin = ((- v7_16) / 2);
	                                }
	                                v6_58 = 1;
	                            }
	                        }
	                        v9_4++;
	                        v8_8 = v6_58;
	                    }
	                }
	                if (v8_8 != 0) {
	                    int v7_19 = 0;
	                    while (v7_19 < v27) {
	                        int v8_14 = this.getChildAt(v7_19);
	                        int v6_48 = ((we) v8_14.getLayoutParams());
	                        if (v6_48.f) {
	                            v8_14.measure(android.view.View$MeasureSpec.makeMeasureSpec((v6_48.c + (v6_48.b * v26)), 1073741824), v24);
	                        }
	                        v7_19++;
	                    }
	                }
	                if (v23 == 1073741824) {
	                    v16 = v17;
	                }
	                this.setMeasuredDimension(v25, v16);
	            } else {
	                this.setMeasuredDimension(v25, 0);
	            }
	        }
	        return;
	    }
	
