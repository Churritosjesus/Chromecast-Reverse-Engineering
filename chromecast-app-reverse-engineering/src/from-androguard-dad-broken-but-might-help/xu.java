	private  a
	private  b
	private  c
	private  d
	private  e
	private  f
	public  g
	public  h
	private  i
	private I j
	private I k
	private android.graphics.drawable.Drawable l
	private  m
	private  n
	private  o
	
	    public xu(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public xu(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public xu(android.content.Context p8, android.util.AttributeSet p9, int p10)
	    {
	        int v0_0 = 1;
	        this(p8, p9, p10);
	        this.g = 1;
	        this.a = -1;
	        this.b = 0;
	        this.d = 8388659;
	        th v2_2 = th.a(p8, p9, oq.aa, p10, 0);
	        android.graphics.drawable.Drawable v3_1 = v2_2.a(oq.ae, -1);
	        if ((v3_1 >= null) && (this.c != v3_1)) {
	            this.c = v3_1;
	            this.requestLayout();
	        }
	        android.graphics.drawable.Drawable v3_3 = v2_2.a(oq.ad, -1);
	        if (v3_3 >= null) {
	            this.b(v3_3);
	        }
	        android.graphics.drawable.Drawable v3_5 = v2_2.a(oq.ab, 1);
	        if (v3_5 == null) {
	            this.g = v3_5;
	        }
	        this.f = v2_2.a.getFloat(oq.af, -1082130432);
	        this.a = v2_2.a(oq.ac, -1);
	        this.i = v2_2.a(oq.ai, 0);
	        android.graphics.drawable.Drawable v3_13 = v2_2.a(oq.ag);
	        if (v3_13 != this.l) {
	            this.l = v3_13;
	            if (v3_13 == null) {
	                this.h = 0;
	                this.m = 0;
	            } else {
	                this.h = v3_13.getIntrinsicWidth();
	                this.m = v3_13.getIntrinsicHeight();
	            }
	            if (v3_13 != null) {
	                v0_0 = 0;
	            }
	            this.setWillNotDraw(v0_0);
	            this.requestLayout();
	        }
	        this.n = v2_2.a(oq.aj, 0);
	        this.o = v2_2.c(oq.ah, 0);
	        v2_2.a.recycle();
	        return;
	    }
	
	
	    private void a(int p10, int p11)
	    {
	        int v2 = android.view.View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
	        int v7 = 0;
	        while (v7 < p10) {
	            android.view.View v1_1 = this.getChildAt(v7);
	            if (v1_1.getVisibility() != 8) {
	                xv v6_1 = ((xv) v1_1.getLayoutParams());
	                if (v6_1.width == -1) {
	                    int v8 = v6_1.height;
	                    v6_1.height = v1_1.getMeasuredHeight();
	                    this.measureChildWithMargins(v1_1, v2, 0, p11, 0);
	                    v6_1.height = v8;
	                }
	            }
	            v7++;
	        }
	        return;
	    }
	
	
	    private void a(android.graphics.Canvas p5, int p6)
	    {
	        this.l.setBounds((this.getPaddingLeft() + this.o), p6, ((this.getWidth() - this.getPaddingRight()) - this.o), (this.m + p6));
	        this.l.draw(p5);
	        return;
	    }
	
	
	    private void a(android.view.View p1, int p2, int p3, int p4, int p5)
	    {
	        this.measureChildWithMargins(p1, p2, p3, p4, p5);
	        return;
	    }
	
	
	    private boolean a(int p6)
	    {
	        int v0 = 1;
	        if (p6 != 0) {
	            if (p6 != this.getChildCount()) {
	                if ((this.n & 2) == 0) {
	                    v0 = 0;
	                } else {
	                    int v2_3 = (p6 - 1);
	                    while (v2_3 >= 0) {
	                        if (this.getChildAt(v2_3).getVisibility() == 8) {
	                            v2_3--;
	                        }
	                    }
	                    v0 = 0;
	                }
	            } else {
	                if ((this.n & 4) == 0) {
	                    v0 = 0;
	                }
	            }
	        } else {
	            if ((this.n & 1) == 0) {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    private void b(int p30, int p31)
	    {
	        this.e = 0;
	        int v18_0 = 0;
	        int v17_0 = 0;
	        int v16_0 = 0;
	        int v15_0 = 0;
	        int v14_0 = 1;
	        int v4_0 = 0;
	        int v21 = this.getChildCount();
	        int v22 = android.view.View$MeasureSpec.getMode(p30);
	        int v23 = android.view.View$MeasureSpec.getMode(p31);
	        int v10_0 = 0;
	        int v12_0 = 0;
	        if ((this.j == null) || (this.k == null)) {
	            int v2_4 = new int[4];
	            this.j = v2_4;
	            int v2_6 = new int[4];
	            this.k = v2_6;
	        }
	        int v9_0;
	        int[] v24 = this.j;
	        int[] v25 = this.k;
	        v24[3] = -1;
	        v24[2] = -1;
	        v24[1] = -1;
	        v24[0] = -1;
	        v25[3] = -1;
	        v25[2] = -1;
	        v25[1] = -1;
	        v25[0] = -1;
	        boolean v26 = this.g;
	        boolean v27 = this.i;
	        if (v22 != 1073741824) {
	            v9_0 = 0;
	        } else {
	            v9_0 = 1;
	        }
	        int v11_0 = -2147483648;
	        int v19 = 0;
	        while (v19 < v21) {
	            int v2_127;
	            int v3_65 = this.getChildAt(v19);
	            if (v3_65 != 0) {
	                int v10_2;
	                int v6_28;
	                int v2_101;
	                int v3_66;
	                int v8_9;
	                int v7_17;
	                int v4_36;
	                int v11_8;
	                int v5_23;
	                if (v3_65.getVisibility() == 8) {
	                    v2_101 = v11_0;
	                    v3_66 = v12_0;
	                    v5_23 = v4_0;
	                    v6_28 = v14_0;
	                    v7_17 = v15_0;
	                    v8_9 = v16_0;
	                    v4_36 = v10_0;
	                    v11_8 = v18_0;
	                    v10_2 = v17_0;
	                } else {
	                    if (this.a(v19)) {
	                        this.e = (this.e + this.h);
	                    }
	                    int v11_9;
	                    int v7_19;
	                    int v8_11 = ((xv) v3_65.getLayoutParams());
	                    int v13_6 = (v4_0 + v8_11.g);
	                    if ((v22 != 1073741824) || ((v8_11.width != 0) || (v8_11.g <= 0))) {
	                        int v2_111 = -2147483648;
	                        if ((v8_11.width == 0) && (v8_11.g > 0)) {
	                            v2_111 = 0;
	                            v8_11.width = -2;
	                        }
	                        int v5_26;
	                        float v20 = v2_111;
	                        if (v13_6 != 0) {
	                            v5_26 = 0;
	                        } else {
	                            v5_26 = this.e;
	                        }
	                        this.a(v3_65, p30, v5_26, p31, 0);
	                        if (v20 != -2147483648) {
	                            v8_11.width = v20;
	                        }
	                        int v2_116 = v3_65.getMeasuredWidth();
	                        if (v9_0 == 0) {
	                            int v4_43 = this.e;
	                            this.e = Math.max(v4_43, (((v4_43 + v2_116) + v8_11.leftMargin) + v8_11.rightMargin));
	                        } else {
	                            this.e = (this.e + ((v8_11.leftMargin + v2_116) + v8_11.rightMargin));
	                        }
	                        if (!v27) {
	                            v7_19 = v11_0;
	                            v11_9 = v12_0;
	                        } else {
	                            v7_19 = Math.max(v2_116, v11_0);
	                            v11_9 = v12_0;
	                        }
	                    } else {
	                        if (v9_0 == 0) {
	                            int v2_117 = this.e;
	                            this.e = Math.max(v2_117, ((v8_11.leftMargin + v2_117) + v8_11.rightMargin));
	                        } else {
	                            this.e = (this.e + (v8_11.leftMargin + v8_11.rightMargin));
	                        }
	                        if (!v26) {
	                            v7_19 = v11_0;
	                            v11_9 = 1;
	                        } else {
	                            v3_65.measure(android.view.View$MeasureSpec.makeMeasureSpec(0, 0), android.view.View$MeasureSpec.makeMeasureSpec(0, 0));
	                            v7_19 = v11_0;
	                            v11_9 = v12_0;
	                        }
	                    }
	                    int v2_123 = 0;
	                    if ((v23 == 1073741824) || (v8_11.height != -1)) {
	                        v4_36 = v10_0;
	                    } else {
	                        v4_36 = 1;
	                        v2_123 = 1;
	                    }
	                    int v5_37 = (v8_11.topMargin + v8_11.bottomMargin);
	                    int v6_35 = (v3_65.getMeasuredHeight() + v5_37);
	                    v10_2 = tm.a(v17_0, gt.j(v3_65));
	                    if (v26) {
	                        int v12_4 = v3_65.getBaseline();
	                        if (v12_4 != -1) {
	                            int v3_69;
	                            if (v8_11.h >= 0) {
	                                v3_69 = v8_11.h;
	                            } else {
	                                v3_69 = this.d;
	                            }
	                            int v3_73 = ((((v3_69 & 112) >> 4) & -2) >> 1);
	                            v24[v3_73] = Math.max(v24[v3_73], v12_4);
	                            v25[v3_73] = Math.max(v25[v3_73], (v6_35 - v12_4));
	                        }
	                    }
	                    int v3_75;
	                    int v12_7 = Math.max(v18_0, v6_35);
	                    if ((v14_0 == 0) || (v8_11.height != -1)) {
	                        v3_75 = 0;
	                    } else {
	                        v3_75 = 1;
	                    }
	                    if (v8_11.g <= 0) {
	                        if (v2_123 == 0) {
	                            v5_37 = v6_35;
	                        }
	                        v5_23 = v13_6;
	                        v6_28 = v3_75;
	                        v8_9 = Math.max(v16_0, v5_37);
	                        v3_66 = v11_9;
	                        v2_101 = v7_19;
	                        v7_17 = v15_0;
	                        v11_8 = v12_7;
	                    } else {
	                        int v2_125;
	                        if (v2_123 == 0) {
	                            v2_125 = v6_35;
	                        } else {
	                            v2_125 = v5_37;
	                        }
	                        v5_23 = v13_6;
	                        v6_28 = v3_75;
	                        v8_9 = v16_0;
	                        v3_66 = v11_9;
	                        v11_8 = v12_7;
	                        v7_17 = Math.max(v15_0, v2_125);
	                        v2_101 = v7_19;
	                    }
	                }
	                v12_0 = v3_66;
	                v14_0 = v6_28;
	                v15_0 = v7_17;
	                v16_0 = v8_9;
	                v17_0 = v10_2;
	                v18_0 = v11_8;
	                v10_0 = v4_36;
	                v11_0 = v2_101;
	                v4_0 = v5_23;
	                v2_127 = v19;
	            } else {
	                this.e = this.e;
	                v2_127 = v19;
	            }
	            v19 = (v2_127 + 1);
	        }
	        if ((this.e > 0) && (this.a(v21))) {
	            this.e = (this.e + this.h);
	        }
	        if ((v24[1] == -1) && ((v24[0] == -1) && ((v24[2] == -1) && (v24[3] == -1)))) {
	            int v5_2 = v18_0;
	        } else {
	            v5_2 = Math.max(v18_0, (Math.max(v24[3], Math.max(v24[0], Math.max(v24[1], v24[2]))) + Math.max(v25[3], Math.max(v25[0], Math.max(v25[1], v25[2])))));
	        }
	        if ((v27) && ((v22 == -2147483648) || (v22 == 0))) {
	            this.e = 0;
	            int v3_13 = 0;
	            while (v3_13 < v21) {
	                int v2_95;
	                int v2_89 = this.getChildAt(v3_13);
	                if (v2_89 != 0) {
	                    if (v2_89.getVisibility() != 8) {
	                        int v2_91 = ((xv) v2_89.getLayoutParams());
	                        if (v9_0 == 0) {
	                            int v6_26 = this.e;
	                            this.e = Math.max(v6_26, (v2_91.rightMargin + ((v6_26 + v11_0) + v2_91.leftMargin)));
	                            v2_95 = v3_13;
	                        } else {
	                            this.e = ((v2_91.rightMargin + (v2_91.leftMargin + v11_0)) + this.e);
	                            v2_95 = v3_13;
	                        }
	                    } else {
	                        v2_95 = v3_13;
	                    }
	                } else {
	                    this.e = this.e;
	                    v2_95 = v3_13;
	                }
	                v3_13 = (v2_95 + 1);
	            }
	        }
	        int v2_40;
	        int v3_20;
	        this.e = (this.e + (this.getPaddingLeft() + this.getPaddingRight()));
	        int v18_1 = gt.a(Math.max(this.e, this.getSuggestedMinimumWidth()), p30, 0);
	        int v6_8 = ((16777215 & v18_1) - this.e);
	        if ((v12_0 == 0) && ((v6_8 == 0) || (v4_0 <= 0))) {
	            int v12_1 = Math.max(v16_0, v15_0);
	            if ((v27) && (v22 != 1073741824)) {
	                int v3_19 = 0;
	                while (v3_19 < v21) {
	                    int v4_1 = this.getChildAt(v3_19);
	                    if ((v4_1 != 0) && ((v4_1.getVisibility() != 8) && (((xv) v4_1.getLayoutParams()).g > 0))) {
	                        v4_1.measure(android.view.View$MeasureSpec.makeMeasureSpec(v11_0, 1073741824), android.view.View$MeasureSpec.makeMeasureSpec(v4_1.getMeasuredHeight(), 1073741824));
	                    }
	                    v3_19++;
	                }
	            }
	            v2_40 = v12_1;
	            v3_20 = v5_2;
	        } else {
	            if (this.f > 0) {
	                v4_0 = this.f;
	            }
	            v24[3] = -1;
	            v24[2] = -1;
	            v24[1] = -1;
	            v24[0] = -1;
	            v25[3] = -1;
	            v25[2] = -1;
	            v25[1] = -1;
	            v25[0] = -1;
	            this.e = 0;
	            int v15_1 = 0;
	            int v11_1 = v14_0;
	            int v12_2 = v16_0;
	            int v14_1 = -1;
	            int v7_8 = v17_0;
	            while (v15_1 < v21) {
	                int v4_15;
	                int v7_10;
	                int v6_16;
	                int v5_18;
	                int v2_81;
	                int v3_45;
	                int v5_17 = this.getChildAt(v15_1);
	                if ((v5_17 == 0) || (v5_17.getVisibility() == 8)) {
	                    v2_81 = v4_0;
	                    v3_45 = v6_8;
	                    v5_18 = v12_2;
	                    v4_15 = v11_1;
	                    v6_16 = v7_8;
	                    v7_10 = v14_1;
	                } else {
	                    int v7_11;
	                    int v8_5;
	                    int v13_0;
	                    int v2_83 = ((xv) v5_17.getLayoutParams());
	                    int v8_4 = v2_83.g;
	                    if (v8_4 <= 0) {
	                        v8_5 = v6_8;
	                        v13_0 = v7_8;
	                        v7_11 = v4_0;
	                    } else {
	                        int v4_22;
	                        int v3_51 = ((int) ((((float) v6_8) * v8_4) / v4_0));
	                        int v8_6 = (v4_0 - v8_4);
	                        int v6_17 = (v6_8 - v3_51);
	                        int v13_5 = xu.getChildMeasureSpec(p31, (((this.getPaddingTop() + this.getPaddingBottom()) + v2_83.topMargin) + v2_83.bottomMargin), v2_83.height);
	                        if ((v2_83.width == 0) && (v22 == 1073741824)) {
	                            if (v3_51 <= 0) {
	                                v3_51 = 0;
	                                v4_22 = v5_17;
	                            } else {
	                                v4_22 = v5_17;
	                            }
	                        } else {
	                            v3_51 += v5_17.getMeasuredWidth();
	                            if (v3_51 < 0) {
	                                v3_51 = 0;
	                            }
	                            v4_22 = v5_17;
	                        }
	                        v4_22.measure(android.view.View$MeasureSpec.makeMeasureSpec(v3_51, 1073741824), v13_5);
	                        v13_0 = tm.a(v7_8, (gt.j(v5_17) & -16777216));
	                        v7_11 = v8_6;
	                        v8_5 = v6_17;
	                    }
	                    if (v9_0 == 0) {
	                        int v3_55 = this.e;
	                        this.e = Math.max(v3_55, (((v5_17.getMeasuredWidth() + v3_55) + v2_83.leftMargin) + v2_83.rightMargin));
	                    } else {
	                        this.e = (this.e + ((v5_17.getMeasuredWidth() + v2_83.leftMargin) + v2_83.rightMargin));
	                    }
	                    if ((v23 == 1073741824) || (v2_83.height != -1)) {
	                        int v3_61 = 0;
	                    } else {
	                        v3_61 = 1;
	                    }
	                    int v3_62;
	                    int v4_34 = (v2_83.topMargin + v2_83.bottomMargin);
	                    int v6_24 = (v5_17.getMeasuredHeight() + v4_34);
	                    int v14_2 = Math.max(v14_1, v6_24);
	                    if (v3_61 == 0) {
	                        v3_62 = v6_24;
	                    } else {
	                        v3_62 = v4_34;
	                    }
	                    int v3_64;
	                    int v4_35 = Math.max(v12_2, v3_62);
	                    if ((v11_1 == 0) || (v2_83.height != -1)) {
	                        v3_64 = 0;
	                    } else {
	                        v3_64 = 1;
	                    }
	                    if (v26) {
	                        int v5_19 = v5_17.getBaseline();
	                        if (v5_19 != -1) {
	                            int v2_84;
	                            if (v2_83.h >= 0) {
	                                v2_84 = v2_83.h;
	                            } else {
	                                v2_84 = this.d;
	                            }
	                            int v2_88 = ((((v2_84 & 112) >> 4) & -2) >> 1);
	                            v24[v2_88] = Math.max(v24[v2_88], v5_19);
	                            v25[v2_88] = Math.max(v25[v2_88], (v6_24 - v5_19));
	                        }
	                    }
	                    v2_81 = v7_11;
	                    v5_18 = v4_35;
	                    v6_16 = v13_0;
	                    v4_15 = v3_64;
	                    v7_10 = v14_2;
	                    v3_45 = v8_5;
	                }
	                v15_1++;
	                v11_1 = v4_15;
	                v12_2 = v5_18;
	                v14_1 = v7_10;
	                v7_8 = v6_16;
	                v4_0 = v2_81;
	                v6_8 = v3_45;
	            }
	            this.e = (this.e + (this.getPaddingLeft() + this.getPaddingRight()));
	            if ((v24[1] != -1) || ((v24[0] != -1) || ((v24[2] != -1) || (v24[3] != -1)))) {
	                v14_1 = Math.max(v14_1, (Math.max(v24[3], Math.max(v24[0], Math.max(v24[1], v24[2]))) + Math.max(v25[3], Math.max(v25[0], Math.max(v25[1], v25[2])))));
	            }
	            v2_40 = v12_2;
	            v17_0 = v7_8;
	            v3_20 = v14_1;
	            v14_0 = v11_1;
	        }
	        if ((v14_0 != 0) || (v23 == 1073741824)) {
	            v2_40 = v3_20;
	        }
	        this.setMeasuredDimension(((-16777216 & v17_0) | v18_1), gt.a(Math.max((v2_40 + (this.getPaddingTop() + this.getPaddingBottom())), this.getSuggestedMinimumHeight()), p31, (v17_0 << 16)));
	        if (v10_0 != 0) {
	            int v6_15 = android.view.View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824);
	            int v9_1 = 0;
	            while (v9_1 < v21) {
	                int v3_43 = this.getChildAt(v9_1);
	                if (v3_43.getVisibility() != 8) {
	                    int v8_3 = ((xv) v3_43.getLayoutParams());
	                    if (v8_3.height == -1) {
	                        int v10_1 = v8_3.width;
	                        v8_3.width = v3_43.getMeasuredWidth();
	                        this.measureChildWithMargins(v3_43, p30, 0, v6_15, 0);
	                        v8_3.width = v10_1;
	                    }
	                }
	                v9_1++;
	            }
	        }
	        return;
	    }
	
	
	    private void b(android.graphics.Canvas p6, int p7)
	    {
	        this.l.setBounds(p7, (this.getPaddingTop() + this.o), (this.h + p7), ((this.getHeight() - this.getPaddingBottom()) - this.o));
	        this.l.draw(p6);
	        return;
	    }
	
	
	    private static void b(android.view.View p2, int p3, int p4, int p5, int p6)
	    {
	        p2.layout(p3, p4, (p3 + p5), (p4 + p6));
	        return;
	    }
	
	
	    public xv a(android.util.AttributeSet p3)
	    {
	        return new xv(this.getContext(), p3);
	    }
	
	
	    public xv b(android.view.ViewGroup$LayoutParams p2)
	    {
	        return new xv(p2);
	    }
	
	
	    public final void b(int p3)
	    {
	        if (this.d != p3) {
	            int v0_3;
	            if ((8388615 & p3) != 0) {
	                v0_3 = p3;
	            } else {
	                v0_3 = (8388611 | p3);
	            }
	            if ((v0_3 & 112) == 0) {
	                v0_3 |= 48;
	            }
	            this.d = v0_3;
	            this.requestLayout();
	        }
	        return;
	    }
	
	
	    public boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        return (p2 instanceof xv);
	    }
	
	
	    public xv d()
	    {
	        int v0_2;
	        if (this.c != 0) {
	            if (this.c != 1) {
	                v0_2 = 0;
	            } else {
	                v0_2 = new xv(-1, -2);
	            }
	        } else {
	            v0_2 = new xv(-2, -2);
	        }
	        return v0_2;
	    }
	
	
	    public synthetic android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
	    {
	        return this.d();
	    }
	
	
	    public synthetic android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public synthetic android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        return this.b(p2);
	    }
	
	
	    public int getBaseline()
	    {
	        int v0_0 = -1;
	        if (this.a >= 0) {
	            if (this.getChildCount() > this.a) {
	                android.view.View v2_1 = this.getChildAt(this.a);
	                int v3 = v2_1.getBaseline();
	                if (v3 != -1) {
	                    int v1_9;
	                    int v0_1 = this.b;
	                    if (this.c != 1) {
	                        v1_9 = v0_1;
	                    } else {
	                        int v1_5 = (this.d & 112);
	                        if (v1_5 == 48) {
	                        } else {
	                            switch (v1_5) {
	                                case 16:
	                                    v1_9 = (v0_1 + (((((this.getBottom() - this.getTop()) - this.getPaddingTop()) - this.getPaddingBottom()) - this.e) / 2));
	                                    break;
	                                case 80:
	                                    v1_9 = (((this.getBottom() - this.getTop()) - this.getPaddingBottom()) - this.e);
	                                    break;
	                                default:
	                            }
	                        }
	                    }
	                    v0_0 = ((((xv) v2_1.getLayoutParams()).topMargin + v1_9) + v3);
	                } else {
	                    if (this.a != 0) {
	                        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline.");
	                    }
	                }
	            } else {
	                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
	            }
	        } else {
	            v0_0 = super.getBaseline();
	        }
	        return v0_0;
	    }
	
	
	    protected void onDraw(android.graphics.Canvas p7)
	    {
	        if (this.l != null) {
	            if (this.c != 1) {
	                int v2_1 = this.getChildCount();
	                int v3_0 = tm.a(this);
	                int v1_2 = 0;
	                while (v1_2 < v2_1) {
	                    int v4_0 = this.getChildAt(v1_2);
	                    if ((v4_0 != 0) && ((v4_0.getVisibility() != 8) && (this.a(v1_2)))) {
	                        int v0_17;
	                        int v0_14 = ((xv) v4_0.getLayoutParams());
	                        if (v3_0 == 0) {
	                            v0_17 = ((v4_0.getLeft() - v0_14.leftMargin) - this.h);
	                        } else {
	                            v0_17 = (v0_14.rightMargin + v4_0.getRight());
	                        }
	                        this.b(p7, v0_17);
	                    }
	                    v1_2++;
	                }
	                if (this.a(v2_1)) {
	                    int v0_6;
	                    int v1_3 = this.getChildAt((v2_1 - 1));
	                    if (v1_3 != 0) {
	                        int v0_4 = ((xv) v1_3.getLayoutParams());
	                        if (v3_0 == 0) {
	                            v0_6 = (v0_4.rightMargin + v1_3.getRight());
	                        } else {
	                            v0_6 = ((v1_3.getLeft() - v0_4.leftMargin) - this.h);
	                        }
	                    } else {
	                        if (v3_0 == 0) {
	                            v0_6 = ((this.getWidth() - this.getPaddingRight()) - this.h);
	                        } else {
	                            v0_6 = this.getPaddingLeft();
	                        }
	                    }
	                    this.b(p7, v0_6);
	                }
	            } else {
	                int v2_2 = this.getChildCount();
	                int v1_9 = 0;
	                while (v1_9 < v2_2) {
	                    int v3_1 = this.getChildAt(v1_9);
	                    if ((v3_1 != 0) && ((v3_1.getVisibility() != 8) && (this.a(v1_9)))) {
	                        this.a(p7, ((v3_1.getTop() - ((xv) v3_1.getLayoutParams()).topMargin) - this.m));
	                    }
	                    v1_9++;
	                }
	                if (this.a(v2_2)) {
	                    int v0_25;
	                    int v1_10 = this.getChildAt((v2_2 - 1));
	                    if (v1_10 != 0) {
	                        v0_25 = (((xv) v1_10.getLayoutParams()).bottomMargin + v1_10.getBottom());
	                    } else {
	                        v0_25 = ((this.getHeight() - this.getPaddingBottom()) - this.m);
	                    }
	                    this.a(p7, v0_25);
	                }
	            }
	        }
	        return;
	    }
	
	
	    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p3)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 14) {
	            super.onInitializeAccessibilityEvent(p3);
	            p3.setClassName(xu.getName());
	        }
	        return;
	    }
	
	
	    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p3)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 14) {
	            super.onInitializeAccessibilityNodeInfo(p3);
	            p3.setClassName(xu.getName());
	        }
	        return;
	    }
	
	
	    public void onLayout(boolean p24, int p25, int p26, int p27, int p28)
	    {
	        if (this.c != 1) {
	            int v9_0;
	            int v5_0 = tm.a(this);
	            int v8_0 = this.getPaddingTop();
	            int v3_1 = (p28 - p26);
	            android.view.View v12_0 = (v3_1 - this.getPaddingBottom());
	            int v13_0 = ((v3_1 - v8_0) - this.getPaddingBottom());
	            int v14_0 = this.getChildCount();
	            int v11_0 = (this.d & 112);
	            int v15_0 = this.g;
	            int[] v16 = this.j;
	            int[] v17 = this.k;
	            switch (fe.a((this.d & 8388615), gt.g(this))) {
	                case 1:
	                    v9_0 = (this.getPaddingLeft() + (((p27 - p25) - this.e) / 2));
	                    break;
	                case 5:
	                    v9_0 = (((this.getPaddingLeft() + p27) - p25) - this.e);
	                    break;
	                default:
	                    v9_0 = this.getPaddingLeft();
	            }
	            int v4_11;
	            int v5_1;
	            if (v5_0 == 0) {
	                v5_1 = 0;
	                v4_11 = 1;
	            } else {
	                v5_1 = (v14_0 - 1);
	                v4_11 = -1;
	            }
	            int v10_0 = 0;
	            while (v10_0 < v14_0) {
	                int v3_14;
	                int v18 = (v5_1 + (v4_11 * v10_0));
	                android.view.View v19 = this.getChildAt(v18);
	                if (v19 != null) {
	                    if (v19.getVisibility() == 8) {
	                        v3_14 = v10_0;
	                    } else {
	                        int v20 = v19.getMeasuredWidth();
	                        int v21 = v19.getMeasuredHeight();
	                        int v6_2 = -1;
	                        int v3_16 = ((xv) v19.getLayoutParams());
	                        if ((v15_0 != 0) && (v3_16.height != -1)) {
	                            v6_2 = v19.getBaseline();
	                        }
	                        int v7_1 = v3_16.h;
	                        if (v7_1 < 0) {
	                            v7_1 = v11_0;
	                        }
	                        int v6_5;
	                        int v7_4;
	                        switch ((v7_1 & 112)) {
	                            case 16:
	                                v6_5 = (((((v13_0 - v21) / 2) + v8_0) + v3_16.topMargin) - v3_16.bottomMargin);
	                                break;
	                            case 48:
	                                v7_4 = (v3_16.topMargin + v8_0);
	                                if (v6_2 == -1) {
	                                    v6_5 = v7_4;
	                                } else {
	                                    v6_5 = ((v16[1] - v6_2) + v7_4);
	                                }
	                                break;
	                            case 80:
	                                v7_4 = ((v12_0 - v21) - v3_16.bottomMargin);
	                                if (v6_2 == -1) {
	                                } else {
	                                    v6_5 = (v7_4 - (v17[2] - (v19.getMeasuredHeight() - v6_2)));
	                                }
	                                break;
	                            default:
	                                v6_5 = v8_0;
	                        }
	                        int v7_9;
	                        if (!this.a(v18)) {
	                            v7_9 = v9_0;
	                        } else {
	                            v7_9 = (this.h + v9_0);
	                        }
	                        int v7_11 = (v7_9 + v3_16.leftMargin);
	                        xu.b(v19, v7_11, v6_5, v20, v21);
	                        v9_0 = (v7_11 + (v3_16.rightMargin + v20));
	                        v3_14 = v10_0;
	                    }
	                } else {
	                    v3_14 = v10_0;
	                }
	                v10_0 = (v3_14 + 1);
	            }
	        } else {
	            int v3_26;
	            int v8_1 = this.getPaddingLeft();
	            int v3_19 = (p27 - p25);
	            int v9_2 = (v3_19 - this.getPaddingRight());
	            int v10_1 = ((v3_19 - v8_1) - this.getPaddingRight());
	            int v11_1 = this.getChildCount();
	            int v5_3 = (8388615 & this.d);
	            switch ((this.d & 112)) {
	                case 16:
	                    v3_26 = (this.getPaddingTop() + (((p28 - p26) - this.e) / 2));
	                    break;
	                case 80:
	                    v3_26 = (((this.getPaddingTop() + p28) - p26) - this.e);
	                    break;
	                default:
	                    v3_26 = this.getPaddingTop();
	            }
	            int v7_12 = 0;
	            int v6_12 = v3_26;
	            while (v7_12 < v11_1) {
	                int v3_29;
	                android.view.View v12_1 = this.getChildAt(v7_12);
	                if (v12_1 != null) {
	                    if (v12_1.getVisibility() == 8) {
	                        v3_29 = v7_12;
	                    } else {
	                        int v13_1 = v12_1.getMeasuredWidth();
	                        int v14_1 = v12_1.getMeasuredHeight();
	                        int v3_31 = ((xv) v12_1.getLayoutParams());
	                        int v4_21 = v3_31.h;
	                        if (v4_21 < 0) {
	                            v4_21 = v5_3;
	                        }
	                        int v4_25;
	                        switch ((fe.a(v4_21, gt.g(this)) & 7)) {
	                            case 1:
	                                v4_25 = (((((v10_1 - v13_1) / 2) + v8_1) + v3_31.leftMargin) - v3_31.rightMargin);
	                                break;
	                            case 5:
	                                v4_25 = ((v9_2 - v13_1) - v3_31.rightMargin);
	                                break;
	                            default:
	                                v4_25 = (v3_31.leftMargin + v8_1);
	                        }
	                        if (this.a(v7_12)) {
	                            v6_12 += this.m;
	                        }
	                        int v6_13 = (v6_12 + v3_31.topMargin);
	                        xu.b(v12_1, v4_25, v6_13, v13_1, v14_1);
	                        v6_12 = (v6_13 + (v3_31.bottomMargin + v14_1));
	                        v3_29 = v7_12;
	                    }
	                } else {
	                    v3_29 = v7_12;
	                }
	                v7_12 = (v3_29 + 1);
	            }
	        }
	        return;
	    }
	
	
	    public void onMeasure(int p28, int p29)
	    {
	        if (this.c != 1) {
	            this.b(p28, p29);
	        } else {
	            this.e = 0;
	            int v18 = 0;
	            int v17 = 0;
	            int v16_0 = 0;
	            int v15_0 = 0;
	            int v14_0 = 1;
	            int v5_0 = 0;
	            int v21 = this.getChildCount();
	            int v22 = android.view.View$MeasureSpec.getMode(p28);
	            int v23 = android.view.View$MeasureSpec.getMode(p29);
	            int v10_0 = 0;
	            int v12_0 = 0;
	            int v24 = this.a;
	            boolean v25 = this.i;
	            int v11_0 = -2147483648;
	            int v19_0 = 0;
	            while (v19_0 < v21) {
	                int v3_78;
	                int v4_28 = this.getChildAt(v19_0);
	                if (v4_28 != 0) {
	                    int v8_7;
	                    int v10_1;
	                    int v5_11;
	                    int v9_6;
	                    int v11_3;
	                    int v3_52;
	                    int v7_8;
	                    int v4_29;
	                    int v6_19;
	                    if (v4_28.getVisibility() == 8) {
	                        v3_52 = v11_0;
	                        v4_29 = v12_0;
	                        v6_19 = v5_0;
	                        v7_8 = v14_0;
	                        v8_7 = v15_0;
	                        v9_6 = v16_0;
	                        v5_11 = v10_0;
	                        v11_3 = v18;
	                        v10_1 = v17;
	                    } else {
	                        if (this.a(v19_0)) {
	                            this.e = (this.e + this.m);
	                        }
	                        int v11_4;
	                        int v8_9;
	                        int v9_8 = ((xv) v4_28.getLayoutParams());
	                        int v13_3 = (v5_0 + v9_8.g);
	                        if ((v23 != 1073741824) || ((v9_8.height != 0) || (v9_8.g <= 0))) {
	                            int v3_62 = -2147483648;
	                            if ((v9_8.height == 0) && (v9_8.g > 0)) {
	                                v3_62 = 0;
	                                v9_8.height = -2;
	                            }
	                            int v8_8;
	                            float v20 = v3_62;
	                            if (v13_3 != 0) {
	                                v8_8 = 0;
	                            } else {
	                                v8_8 = this.e;
	                            }
	                            this.a(v4_28, p28, 0, p29, v8_8);
	                            if (v20 != -2147483648) {
	                                v9_8.height = v20;
	                            }
	                            int v3_67 = v4_28.getMeasuredHeight();
	                            int v5_18 = this.e;
	                            this.e = Math.max(v5_18, (((v5_18 + v3_67) + v9_8.topMargin) + v9_8.bottomMargin));
	                            if (!v25) {
	                                v8_9 = v11_0;
	                                v11_4 = v12_0;
	                            } else {
	                                v8_9 = Math.max(v3_67, v11_0);
	                                v11_4 = v12_0;
	                            }
	                        } else {
	                            int v3_68 = this.e;
	                            this.e = Math.max(v3_68, ((v9_8.topMargin + v3_68) + v9_8.bottomMargin));
	                            v8_9 = v11_0;
	                            v11_4 = 1;
	                        }
	                        if ((v24 >= 0) && (v24 == (v19_0 + 1))) {
	                            this.b = this.e;
	                        }
	                        if ((v19_0 >= v24) || (v9_8.g <= 0)) {
	                            int v3_74 = 0;
	                            if ((v22 == 1073741824) || (v9_8.width != -1)) {
	                                v5_11 = v10_0;
	                            } else {
	                                v5_11 = 1;
	                                v3_74 = 1;
	                            }
	                            int v4_32;
	                            int v6_29 = (v9_8.leftMargin + v9_8.rightMargin);
	                            int v7_14 = (v4_28.getMeasuredWidth() + v6_29);
	                            int v12_5 = Math.max(v18, v7_14);
	                            v10_1 = tm.a(v17, gt.j(v4_28));
	                            if ((v14_0 == 0) || (v9_8.width != -1)) {
	                                v4_32 = 0;
	                            } else {
	                                v4_32 = 1;
	                            }
	                            if (v9_8.g <= 0) {
	                                if (v3_74 == 0) {
	                                    v6_29 = v7_14;
	                                }
	                                v6_19 = v13_3;
	                                v7_8 = v4_32;
	                                v9_6 = Math.max(v16_0, v6_29);
	                                v4_29 = v11_4;
	                                v3_52 = v8_9;
	                                v8_7 = v15_0;
	                                v11_3 = v12_5;
	                            } else {
	                                int v3_76;
	                                if (v3_74 == 0) {
	                                    v3_76 = v7_14;
	                                } else {
	                                    v3_76 = v6_29;
	                                }
	                                v6_19 = v13_3;
	                                v7_8 = v4_32;
	                                v9_6 = v16_0;
	                                v4_29 = v11_4;
	                                v11_3 = v12_5;
	                                v8_7 = Math.max(v15_0, v3_76);
	                                v3_52 = v8_9;
	                            }
	                        } else {
	                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex.");
	                        }
	                    }
	                    v12_0 = v4_29;
	                    v14_0 = v7_8;
	                    v15_0 = v8_7;
	                    v16_0 = v9_6;
	                    v17 = v10_1;
	                    v18 = v11_3;
	                    v10_0 = v5_11;
	                    v11_0 = v3_52;
	                    v5_0 = v6_19;
	                    v3_78 = v19_0;
	                } else {
	                    this.e = this.e;
	                    v3_78 = v19_0;
	                }
	                v19_0 = (v3_78 + 1);
	            }
	            if ((this.e > 0) && (this.a(v21))) {
	                this.e = (this.e + this.m);
	            }
	            if ((v25) && ((v23 == -2147483648) || (v23 == 0))) {
	                this.e = 0;
	                int v4_2 = 0;
	                while (v4_2 < v21) {
	                    int v3_49;
	                    int v3_43 = this.getChildAt(v4_2);
	                    if (v3_43 != 0) {
	                        if (v3_43.getVisibility() != 8) {
	                            int v3_45 = ((xv) v3_43.getLayoutParams());
	                            int v6_17 = this.e;
	                            this.e = Math.max(v6_17, (v3_45.bottomMargin + ((v6_17 + v11_0) + v3_45.topMargin)));
	                            v3_49 = v4_2;
	                        } else {
	                            v3_49 = v4_2;
	                        }
	                    } else {
	                        this.e = this.e;
	                        v3_49 = v4_2;
	                    }
	                    v4_2 = (v3_49 + 1);
	                }
	            }
	            int v3_18;
	            int v4_9;
	            this.e = (this.e + (this.getPaddingTop() + this.getPaddingBottom()));
	            int v19_1 = gt.a(Math.max(this.e, this.getSuggestedMinimumHeight()), p29, 0);
	            int v6_1 = ((16777215 & v19_1) - this.e);
	            if ((v12_0 == 0) && ((v6_1 == 0) || (v5_0 <= 0))) {
	                int v13_0 = Math.max(v16_0, v15_0);
	                if ((v25) && (v23 != 1073741824)) {
	                    int v4_8 = 0;
	                    while (v4_8 < v21) {
	                        int v5_1 = this.getChildAt(v4_8);
	                        if ((v5_1 != 0) && ((v5_1.getVisibility() != 8) && (((xv) v5_1.getLayoutParams()).g > 0))) {
	                            v5_1.measure(android.view.View$MeasureSpec.makeMeasureSpec(v5_1.getMeasuredWidth(), 1073741824), android.view.View$MeasureSpec.makeMeasureSpec(v11_0, 1073741824));
	                        }
	                        v4_8++;
	                    }
	                }
	                v3_18 = v13_0;
	                v4_9 = v18;
	            } else {
	                if (this.f > 0) {
	                    v5_0 = this.f;
	                }
	                this.e = 0;
	                int v15_1 = 0;
	                int v12_1 = v14_0;
	                int v13_1 = v16_0;
	                int v11_1 = v17;
	                int v14_1 = v18;
	                while (v15_1 < v21) {
	                    int v3_37;
	                    int v4_17;
	                    int v7_1;
	                    int v8_0;
	                    int v6_7;
	                    int v5_5;
	                    int v7_0 = this.getChildAt(v15_1);
	                    if (v7_0.getVisibility() == 8) {
	                        v4_17 = v5_0;
	                        v8_0 = v12_1;
	                        v3_37 = v13_1;
	                        v7_1 = v14_1;
	                        v5_5 = v6_1;
	                        v6_7 = v11_1;
	                    } else {
	                        int v3_39 = ((xv) v7_0.getLayoutParams());
	                        int v8_1 = v3_39.g;
	                        if (v8_1 <= 0) {
	                            v4_17 = v5_0;
	                            v5_5 = v6_1;
	                            v6_7 = v11_1;
	                        } else {
	                            int v6_14;
	                            int v4_23 = ((int) ((((float) v6_1) * v8_1) / v5_0));
	                            int v8_2 = (v5_0 - v8_1);
	                            int v9_0 = (v6_1 - v4_23);
	                            int v5_10 = xu.getChildMeasureSpec(p28, (((this.getPaddingLeft() + this.getPaddingRight()) + v3_39.leftMargin) + v3_39.rightMargin), v3_39.width);
	                            if ((v3_39.height == 0) && (v23 == 1073741824)) {
	                                if (v4_23 <= 0) {
	                                    v4_23 = 0;
	                                    v6_14 = v7_0;
	                                } else {
	                                    v6_14 = v7_0;
	                                }
	                            } else {
	                                v4_23 += v7_0.getMeasuredHeight();
	                                if (v4_23 < 0) {
	                                    v4_23 = 0;
	                                }
	                                v6_14 = v7_0;
	                            }
	                            v6_14.measure(v5_10, android.view.View$MeasureSpec.makeMeasureSpec(v4_23, 1073741824));
	                            v5_5 = v9_0;
	                            v6_7 = tm.a(v11_1, (gt.j(v7_0) & -256));
	                            v4_17 = v8_2;
	                        }
	                        int v14_4;
	                        int v8_4 = (v3_39.leftMargin + v3_39.rightMargin);
	                        int v9_3 = (v7_0.getMeasuredWidth() + v8_4);
	                        int v11_2 = Math.max(v14_1, v9_3);
	                        if ((v22 == 1073741824) || (v3_39.width != -1)) {
	                            v14_4 = 0;
	                        } else {
	                            v14_4 = 1;
	                        }
	                        if (v14_4 == 0) {
	                            v8_4 = v9_3;
	                        }
	                        int v9_4 = Math.max(v13_1, v8_4);
	                        if ((v12_1 == 0) || (v3_39.width != -1)) {
	                            v8_0 = 0;
	                        } else {
	                            v8_0 = 1;
	                        }
	                        int v12_3 = this.e;
	                        this.e = Math.max(v12_3, (v3_39.bottomMargin + ((v7_0.getMeasuredHeight() + v12_3) + v3_39.topMargin)));
	                        v3_37 = v9_4;
	                        v7_1 = v11_2;
	                    }
	                    v15_1++;
	                    v12_1 = v8_0;
	                    v13_1 = v3_37;
	                    v11_1 = v6_7;
	                    v14_1 = v7_1;
	                    v6_1 = v5_5;
	                    v5_0 = v4_17;
	                }
	                this.e = (this.e + (this.getPaddingTop() + this.getPaddingBottom()));
	                v3_18 = v13_1;
	                v17 = v11_1;
	                v4_9 = v14_1;
	                v14_0 = v12_1;
	            }
	            if ((v14_0 != 0) || (v22 == 1073741824)) {
	                v3_18 = v4_9;
	            }
	            this.setMeasuredDimension(gt.a(Math.max((v3_18 + (this.getPaddingLeft() + this.getPaddingRight())), this.getSuggestedMinimumWidth()), p28, v17), v19_1);
	            if (v10_0 != 0) {
	                this.a(v21, p29);
	            }
	        }
	        return;
	    }
	
	
	    public boolean shouldDelayChildPressedState()
	    {
	        return 0;
	    }
	
