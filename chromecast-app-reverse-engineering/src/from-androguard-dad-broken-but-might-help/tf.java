	public static final  a
	private static final android.graphics.PorterDuff$Mode b
	private static final java.util.WeakHashMap c
	private static final tg d
	private static final I e
	private static final I f
	private static final I g
	private static final I h
	private static final I i
	private static final I j
	private final java.lang.ref.WeakReference k
	private android.util.SparseArray l
	private android.content.res.ColorStateList m
	
	    static tf()
	    {
	        int[] v0_1;
	        if (android.os.Build$VERSION.SDK_INT >= 21) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        tf.a = v0_1;
	        tf.b = android.graphics.PorterDuff$Mode.SRC_IN;
	        tf.c = new java.util.WeakHashMap();
	        tf.d = new tg(6);
	        int[] v0_7 = new int[3];
	        v0_7[0] = a.aN;
	        v0_7[1] = a.aL;
	        v0_7[2] = a.af;
	        tf.e = v0_7;
	        int[] v0_9 = new int[12];
	        v0_9[0] = a.ao;
	        v0_9[1] = a.ar;
	        v0_9[2] = a.ay;
	        v0_9[3] = a.aq;
	        v0_9[4] = a.ap;
	        v0_9[5] = a.ax;
	        v0_9[6] = a.as;
	        v0_9[7] = a.at;
	        v0_9[8] = a.aw;
	        v0_9[9] = a.av;
	        v0_9[10] = a.au;
	        v0_9[11] = a.az;
	        tf.f = v0_9;
	        int[] v0_10 = new int[4];
	        v0_10[0] = a.aK;
	        v0_10[1] = a.aM;
	        v0_10[2] = a.am;
	        v0_10[3] = a.aJ;
	        tf.g = v0_10;
	        int[] v0_11 = new int[3];
	        v0_11[0] = a.aC;
	        v0_11[1] = a.ak;
	        v0_11[2] = a.aB;
	        tf.h = v0_11;
	        int[] v0_13 = new int[10];
	        v0_13[0] = a.an;
	        v0_13[1] = a.aI;
	        v0_13[2] = a.aO;
	        v0_13[3] = a.aE;
	        v0_13[4] = a.aF;
	        v0_13[5] = a.aD;
	        v0_13[6] = a.aH;
	        v0_13[7] = a.aG;
	        v0_13[8] = a.ai;
	        v0_13[9] = a.ag;
	        tf.i = v0_13;
	        int[] v0_14 = new int[2];
	        v0_14[0] = a.ah;
	        v0_14[1] = a.aj;
	        tf.j = v0_14;
	        return;
	    }
	
	
	    private tf(android.content.Context p2)
	    {
	        this.k = new ref.WeakReference(p2);
	        return;
	    }
	
	
	    public static android.graphics.drawable.Drawable a(android.content.Context p2, int p3)
	    {
	        if ((!tf.a(tf.f, p3)) && ((!tf.a(tf.e, p3)) && ((!tf.a(tf.g, p3)) && ((!tf.a(tf.i, p3)) && ((!tf.a(tf.h, p3)) && ((!tf.a(tf.j, p3)) && (p3 != a.al))))))) {
	            int v0_13 = 0;
	        } else {
	            v0_13 = 1;
	        }
	        int v0_14;
	        if (v0_13 == 0) {
	            v0_14 = au.a(p2, p3);
	        } else {
	            v0_14 = tf.a(p2).a(p3, 0);
	        }
	        return v0_14;
	    }
	
	
	    public static tf a(android.content.Context p2)
	    {
	        tf v0_2 = ((tf) tf.c.get(p2));
	        if (v0_2 == null) {
	            v0_2 = new tf(p2);
	            tf.c.put(p2, v0_2);
	        }
	        return v0_2;
	    }
	
	
	    private static void a(android.graphics.drawable.Drawable p3, int p4, android.graphics.PorterDuff$Mode p5)
	    {
	        if (p5 == null) {
	            p5 = tf.b;
	        }
	        android.graphics.PorterDuffColorFilter v0_2 = ((android.graphics.PorterDuffColorFilter) tf.d.a(Integer.valueOf(tg.a(p4, p5))));
	        if (v0_2 == null) {
	            android.graphics.PorterDuffColorFilter v1_3 = new android.graphics.PorterDuffColorFilter(p4, p5);
	            tf.d.a(Integer.valueOf(tg.a(p4, p5)), v1_3);
	            v0_2 = v1_3;
	        }
	        p3.setColorFilter(v0_2);
	        return;
	    }
	
	
	    public static void a(android.view.View p4, te p5)
	    {
	        int v0_0 = p4.getBackground();
	        if (!p5.b) {
	            v0_0.clearColorFilter();
	        } else {
	            tf.a(v0_0, p5.a.getColorForState(p4.getDrawableState(), p5.a.getDefaultColor()), 0);
	        }
	        if (android.os.Build$VERSION.SDK_INT <= 10) {
	            p4.invalidate();
	        }
	        return;
	    }
	
	
	    private static boolean a(int[] p4, int p5)
	    {
	        int v0 = 0;
	        int v1 = 0;
	        while (v1 < p4.length) {
	            if (p4[v1] != p5) {
	                v1++;
	            } else {
	                v0 = 1;
	                break;
	            }
	        }
	        return v0;
	    }
	
	
	    public final android.content.res.ColorStateList a(int p12)
	    {
	        int[][] v0_3;
	        int[][] v0_2 = ((android.content.Context) this.k.get());
	        if (v0_2 != null) {
	            int[][] v1_1;
	            if (this.l == null) {
	                v1_1 = 0;
	            } else {
	                v1_1 = ((android.content.res.ColorStateList) this.l.get(p12));
	            }
	            if (v1_1 != null) {
	                v0_3 = v1_1;
	            } else {
	                if (p12 != a.an) {
	                    if (p12 != a.aH) {
	                        if (p12 != a.aG) {
	                            if ((p12 != a.ai) && (p12 != a.ag)) {
	                                if ((p12 != a.aE) && (p12 != a.aF)) {
	                                    if (!tf.a(tf.f, p12)) {
	                                        if (!tf.a(tf.i, p12)) {
	                                            if (!tf.a(tf.j, p12)) {
	                                                v0_3 = v1_1;
	                                            } else {
	                                                int[][] v1_4 = new int[][3];
	                                                int[] v2_13 = new int[3];
	                                                v1_4[0] = tb.a;
	                                                v2_13[0] = tb.c(v0_2, a.C);
	                                                v1_4[1] = tb.e;
	                                                v2_13[1] = tb.a(v0_2, a.A);
	                                                v1_4[2] = tb.h;
	                                                v2_13[2] = tb.a(v0_2, a.C);
	                                                v0_3 = new android.content.res.ColorStateList(v1_4, v2_13);
	                                            }
	                                        } else {
	                                            if (this.m == null) {
	                                                int[][] v1_7 = tb.a(v0_2, a.C);
	                                                int[] v2_15 = tb.a(v0_2, a.A);
	                                                int v3_9 = new int[][7];
	                                                int[] v4_1 = new int[7];
	                                                v3_9[0] = tb.a;
	                                                v4_1[0] = tb.c(v0_2, a.C);
	                                                v3_9[1] = tb.b;
	                                                v4_1[1] = v2_15;
	                                                v3_9[2] = tb.c;
	                                                v4_1[2] = v2_15;
	                                                v3_9[3] = tb.d;
	                                                v4_1[3] = v2_15;
	                                                v3_9[4] = tb.e;
	                                                v4_1[4] = v2_15;
	                                                v3_9[5] = tb.f;
	                                                v4_1[5] = v2_15;
	                                                v3_9[6] = tb.h;
	                                                v4_1[6] = v1_7;
	                                                this.m = new android.content.res.ColorStateList(v3_9, v4_1);
	                                            }
	                                            v0_3 = this.m;
	                                        }
	                                    } else {
	                                        v0_3 = tb.b(v0_2, a.C);
	                                    }
	                                } else {
	                                    int[][] v1_9 = new int[][3];
	                                    int[] v2_17 = new int[3];
	                                    v1_9[0] = tb.a;
	                                    v2_17[0] = tb.c(v0_2, a.C);
	                                    v1_9[1] = tb.g;
	                                    v2_17[1] = tb.a(v0_2, a.C);
	                                    v1_9[2] = tb.h;
	                                    v2_17[2] = tb.a(v0_2, a.A);
	                                    v0_3 = new android.content.res.ColorStateList(v1_9, v2_17);
	                                }
	                            } else {
	                                int[][] v1_10 = new int[][4];
	                                int[] v2_18 = new int[4];
	                                int v3_19 = tb.a(v0_2, a.z);
	                                int[] v4_3 = tb.a(v0_2, a.B);
	                                v1_10[0] = tb.a;
	                                v2_18[0] = tb.c(v0_2, a.z);
	                                v1_10[1] = tb.d;
	                                v2_18[1] = a.a(v4_3, v3_19);
	                                v1_10[2] = tb.b;
	                                v2_18[2] = a.a(v4_3, v3_19);
	                                v1_10[3] = tb.h;
	                                v2_18[3] = v3_19;
	                                v0_3 = new android.content.res.ColorStateList(v1_10, v2_18);
	                            }
	                        } else {
	                            int[][] v1_11 = new int[][3];
	                            int[] v2_19 = new int[3];
	                            int v3_21 = tb.b(v0_2, a.D);
	                            if ((v3_21 == 0) || (!v3_21.isStateful())) {
	                                v1_11[0] = tb.a;
	                                v2_19[0] = tb.c(v0_2, a.D);
	                                v1_11[1] = tb.e;
	                                v2_19[1] = tb.a(v0_2, a.A);
	                                v1_11[2] = tb.h;
	                                v2_19[2] = tb.a(v0_2, a.D);
	                            } else {
	                                v1_11[0] = tb.a;
	                                v2_19[0] = v3_21.getColorForState(v1_11[0], 0);
	                                v1_11[1] = tb.e;
	                                v2_19[1] = tb.a(v0_2, a.A);
	                                v1_11[2] = tb.h;
	                                v2_19[2] = v3_21.getDefaultColor();
	                            }
	                            v0_3 = new android.content.res.ColorStateList(v1_11, v2_19);
	                        }
	                    } else {
	                        int[][] v1_12 = new int[][3];
	                        int[] v2_20 = new int[3];
	                        v1_12[0] = tb.a;
	                        v2_20[0] = tb.a(v0_2, 16842800, 1036831949);
	                        v1_12[1] = tb.e;
	                        v2_20[1] = tb.a(v0_2, a.A, 1050253722);
	                        v1_12[2] = tb.h;
	                        v2_20[2] = tb.a(v0_2, 16842800, 1050253722);
	                        v0_3 = new android.content.res.ColorStateList(v1_12, v2_20);
	                    }
	                } else {
	                    int[][] v1_13 = new int[][3];
	                    int[] v2_21 = new int[3];
	                    v1_13[0] = tb.a;
	                    v2_21[0] = tb.c(v0_2, a.C);
	                    v1_13[1] = tb.g;
	                    v2_21[1] = tb.a(v0_2, a.C);
	                    v1_13[2] = tb.h;
	                    v2_21[2] = tb.a(v0_2, a.A);
	                    v0_3 = new android.content.res.ColorStateList(v1_13, v2_21);
	                }
	                if (v0_3 != null) {
	                    if (this.l == null) {
	                        this.l = new android.util.SparseArray();
	                    }
	                    this.l.append(p12, v0_3);
	                }
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public final android.graphics.drawable.Drawable a(int p6, boolean p7)
	    {
	        android.graphics.drawable.LayerDrawable v1_0 = 0;
	        android.graphics.drawable.LayerDrawable v0_2 = ((android.content.Context) this.k.get());
	        if (v0_2 != null) {
	            android.graphics.drawable.LayerDrawable v0_3 = au.a(v0_2, p6);
	            if (v0_3 != null) {
	                if (android.os.Build$VERSION.SDK_INT >= 8) {
	                    v0_3 = v0_3.mutate();
	                }
	                boolean v2_1 = this.a(p6);
	                if (!v2_1) {
	                    if (p6 != a.al) {
	                        if ((!this.a(p6, v0_3)) && (p7)) {
	                            v0_3 = 0;
	                        }
	                    } else {
	                        android.graphics.drawable.LayerDrawable v0_5 = new android.graphics.drawable.Drawable[2];
	                        v0_5[0] = this.a(a.ak, 0);
	                        v0_5[1] = this.a(a.am, 0);
	                        v1_0 = new android.graphics.drawable.LayerDrawable(v0_5);
	                        return v1_0;
	                    }
	                } else {
	                    v0_3 = bo.c(v0_3);
	                    bo.a(v0_3, v2_1);
	                    if (p6 == a.aG) {
	                        v1_0 = android.graphics.PorterDuff$Mode.MULTIPLY;
	                    }
	                    if (v1_0 != null) {
	                        bo.a(v0_3, v1_0);
	                    }
	                }
	            }
	            v1_0 = v0_3;
	        }
	        return v1_0;
	    }
	
	
	    public final boolean a(int p9, android.graphics.drawable.Drawable p10)
	    {
	        int v0_3;
	        int v0_2 = ((android.content.Context) this.k.get());
	        if (v0_2 != 0) {
	            int v5_0;
	            int v7;
	            int v3_7;
	            int v6_1;
	            if (!tf.a(tf.e, p9)) {
	                if (!tf.a(tf.g, p9)) {
	                    if (!tf.a(tf.h, p9)) {
	                        if (p9 != a.aA) {
	                            v3_7 = -1;
	                            v5_0 = 0;
	                            v7 = 0;
	                            v6_1 = 0;
	                        } else {
	                            v5_0 = 16842800;
	                            v3_7 = Math.round(1109603123);
	                            v7 = 0;
	                            v6_1 = 1;
	                        }
	                    } else {
	                        v6_1 = 1;
	                        v7 = android.graphics.PorterDuff$Mode.MULTIPLY;
	                        v5_0 = 16842801;
	                        v3_7 = -1;
	                    }
	                } else {
	                    v5_0 = a.A;
	                    v7 = 0;
	                    v6_1 = 1;
	                    v3_7 = -1;
	                }
	            } else {
	                v5_0 = a.C;
	                v7 = 0;
	                v6_1 = 1;
	                v3_7 = -1;
	            }
	            if (v6_1 == 0) {
	                v0_3 = 0;
	            } else {
	                tf.a(p10, tb.a(v0_2, v5_0), v7);
	                if (v3_7 != -1) {
	                    p10.setAlpha(v3_7);
	                }
	                v0_3 = 1;
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
