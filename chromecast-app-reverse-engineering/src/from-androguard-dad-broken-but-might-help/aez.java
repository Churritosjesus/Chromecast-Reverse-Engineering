	private static final java.lang.Object q
	private final aea l
	private final android.graphics.Bitmap$Config m
	private final  n
	private final  o
	private android.widget.ImageView$ScaleType p
	
	    static aez()
	    {
	        aez.q = new Object();
	        return;
	    }
	
	
	    public aez(String p5, aea p6, int p7, int p8, android.widget.ImageView$ScaleType p9, android.graphics.Bitmap$Config p10, adz p11)
	    {
	        this(0, p5, p11);
	        this.i = new aec(1000, 2, 1073741824);
	        this.l = p6;
	        this.m = p10;
	        this.n = p7;
	        this.o = p8;
	        this.p = p9;
	        return;
	    }
	
	
	    private static int a(int p7, int p8, int p9, int p10)
	    {
	        int v0_2 = 1065353216;
	        while (((double) (v0_2 * 1073741824)) <= Math.min((((double) p7) / ((double) p9)), (((double) p8) / ((double) p10)))) {
	            v0_2 *= 1073741824;
	        }
	        return ((int) v0_2);
	    }
	
	
	    private static int a(int p6, int p7, int p8, int p9, android.widget.ImageView$ScaleType p10)
	    {
	        if ((p6 != 0) || (p7 != 0)) {
	            if (p10 != android.widget.ImageView$ScaleType.FIT_XY) {
	                if (p6 != 0) {
	                    if (p7 != 0) {
	                        double v0_2 = (((double) p9) / ((double) p8));
	                        if (p10 != android.widget.ImageView$ScaleType.CENTER_CROP) {
	                            if ((((double) p6) * v0_2) > ((double) p7)) {
	                                p6 = ((int) (((double) p7) / v0_2));
	                            }
	                        } else {
	                            if ((((double) p6) * v0_2) < ((double) p7)) {
	                                p6 = ((int) (((double) p7) / v0_2));
	                            }
	                        }
	                    }
	                } else {
	                    p6 = ((int) ((((double) p7) / ((double) p9)) * ((double) p8)));
	                }
	            } else {
	                if (p6 == 0) {
	                    p6 = p8;
	                }
	            }
	        } else {
	            p6 = p8;
	        }
	        return p6;
	    }
	
	
	    protected final ady a(adp p10)
	    {
	        try {
	            android.graphics.Bitmap v0_3;
	            android.graphics.Bitmap v0_0 = p10.b;
	            adh v1_1 = new android.graphics.BitmapFactory$Options();
	        } catch (android.graphics.Bitmap v0_9) {
	            throw v0_9;
	        } catch (android.graphics.Bitmap v0_6) {
	            int v3_10 = new Object[2];
	            v3_10[0] = Integer.valueOf(p10.b.length);
	            v3_10[1] = this.b;
	            aeg.c("Caught OOM for %d byte image, url=%s", v3_10);
	            android.graphics.Bitmap v0_5 = ady.a(new adr(v0_6));
	            return v0_5;
	        }
	        if ((this.n != 0) || (this.o != 0)) {
	            v1_1.inJustDecodeBounds = 1;
	            android.graphics.BitmapFactory.decodeByteArray(v0_0, 0, v0_0.length, v1_1);
	            int v3_4 = v1_1.outWidth;
	            int v4_1 = v1_1.outHeight;
	            int v5_1 = aez.a(this.n, this.o, v3_4, v4_1, this.p);
	            int v6_2 = aez.a(this.o, this.n, v4_1, v3_4, this.p);
	            v1_1.inJustDecodeBounds = 0;
	            v1_1.inSampleSize = aez.a(v3_4, v4_1, v5_1, v6_2);
	            adh v1_2 = android.graphics.BitmapFactory.decodeByteArray(v0_0, 0, v0_0.length, v1_1);
	            if ((v1_2 == null) || ((v1_2.getWidth() <= v5_1) && (v1_2.getHeight() <= v6_2))) {
	                v0_3 = v1_2;
	            } else {
	                v0_3 = android.graphics.Bitmap.createScaledBitmap(v1_2, v5_1, v6_2, 1);
	                v1_2.recycle();
	            }
	        } else {
	            v1_1.inPreferredConfig = this.m;
	            v0_3 = android.graphics.BitmapFactory.decodeByteArray(v0_0, 0, v0_0.length, v1_1);
	        }
	        if (v0_3 != null) {
	            v0_5 = ady.a(v0_3, a.a(p10));
	        } else {
	            v0_5 = ady.a(new adr(p10));
	        }
	        return v0_5;
	    }
	
	
	    protected final synthetic void a(Object p2)
	    {
	        this.l.a(((android.graphics.Bitmap) p2));
	        return;
	    }
	
	
	    public final adu e()
	    {
	        return adu.a;
	    }
	
