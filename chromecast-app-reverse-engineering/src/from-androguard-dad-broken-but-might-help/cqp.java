	private static bridge java.util.concurrent.Executor c
	private static  k
	public final android.content.Context a
	public final com.google.android.gms.common.api.GoogleApiClient b
	private final java.util.concurrent.ConcurrentHashMap d
	private  e
	private cqq f
	private final java.util.LinkedList g
	private  h
	private  i
	private  j
	
	    static cqp()
	    {
	        cqp.c = 0;
	        if (android.os.Build$VERSION.SDK_INT >= 11) {
	            cqp.c = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
	        }
	        return;
	    }
	
	
	    public cqp(android.content.Context p3, com.google.android.gms.common.api.GoogleApiClient p4, boolean p5)
	    {
	        this.d = new java.util.concurrent.ConcurrentHashMap();
	        this.g = new java.util.LinkedList();
	        this.a = p3;
	        this.b = p4;
	        this.h = p5;
	        boolean v0_4 = p3.getResources();
	        this.j = ((float) v0_4.getInteger(a.io));
	        this.i = ((float) v0_4.getInteger(a.in));
	        cqp.k = a.a(((android.app.ActivityManager) p3.getSystemService("activity")));
	        return;
	    }
	
	
	    private static int a(int p4, int p5, int p6, int p7)
	    {
	        int v0_1;
	        if (!cqp.k) {
	            v0_1 = 1;
	            if ((p4 <= p7) && (p5 <= p6)) {
	                return v0_1;
	            }
	            while ((((p4 / 2) / v0_1) >= p7) && (((p5 / 2) / v0_1) >= p6)) {
	                v0_1 <<= 1;
	            }
	        } else {
	            v0_1 = 2;
	        }
	        return v0_1;
	    }
	
	
	    public static android.graphics.Bitmap a(android.graphics.Bitmap p9, int p10, float p11)
	    {
	        android.graphics.Bitmap v0_2 = ((int) (((float) p10) * p11));
	        int v1_0 = p9.getWidth();
	        int v2_0 = p9.getHeight();
	        if ((p10 != v1_0) || (v0_2 != v2_0)) {
	            android.graphics.Matrix v5_1 = new android.graphics.Matrix();
	            int v4_3 = Math.max((((float) p10) / ((float) v1_0)), (((float) v0_2) / ((float) v2_0)));
	            v5_1.setScale(v4_3, v4_3);
	            int v3_4 = Math.round((((float) p10) / v4_3));
	            int v4_4 = Math.round((((float) v0_2) / v4_3));
	            p9 = android.graphics.Bitmap.createBitmap(p9, Math.max(Math.min(((int) ((((float) v1_0) * 1056964608) - ((float) (v3_4 / 2)))), (v1_0 - v3_4)), 0), Math.max(Math.min(((int) ((((float) v2_0) * 1056964608) - ((float) (v4_4 / 2)))), (v2_0 - v4_4)), 0), v3_4, v4_4, v5_1, 1);
	        }
	        return p9;
	    }
	
	
	    public static android.graphics.Bitmap a(android.os.ParcelFileDescriptor p5, int p6, int p7, int p8, int p9)
	    {
	        Throwable v0_0 = 0;
	        if (p5 != null) {
	            android.graphics.BitmapFactory$Options v2_1 = new android.graphics.BitmapFactory$Options();
	            v2_1.inSampleSize = cqp.a(p6, p7, p8, p9);
	            v2_1.inJustDecodeBounds = 0;
	            v2_1.outWidth = p6;
	            v2_1.outHeight = p7;
	            if (cqp.k) {
	                v2_1.inPreferredConfig = android.graphics.Bitmap$Config.RGB_565;
	            }
	            try {
	                int v1_5 = new java.io.FileInputStream(p5.getFileDescriptor());
	                try {
	                    v0_0 = android.graphics.BitmapFactory.decodeStream(v1_5, 0, v2_1);
	                    cqp.a(v1_5);
	                } catch (Throwable v0_2) {
	                    if (v1_5 != 0) {
	                        cqp.a(v1_5);
	                    }
	                    throw v0_2;
	                }
	            } catch (int v1_6) {
	                v1_5 = 0;
	                v0_2 = v1_6;
	            }
	        }
	        return v0_0;
	    }
	
	
	    private void a()
	    {
	        if ((!this.g.isEmpty()) && (this.f == null)) {
	            this.f = ((cqq) this.g.remove());
	            this.f.a();
	        }
	        return;
	    }
	
	
	    private static void a(java.io.InputStream p1)
	    {
	        try {
	            p1.close();
	        } catch (java.io.IOException v0) {
	        }
	        return;
	    }
	
	
	    static synthetic boolean a(cqp p1)
	    {
	        return p1.h;
	    }
	
	
	    static synthetic float b(cqp p1)
	    {
	        return p1.i;
	    }
	
	
	    static synthetic float c(cqp p1)
	    {
	        return p1.j;
	    }
	
	
	    static synthetic java.util.concurrent.ConcurrentHashMap d(cqp p1)
	    {
	        return p1.d;
	    }
	
	
	    public final void a(android.widget.ImageView p3)
	    {
	        p3.setTag(0);
	        int v1_0 = 0;
	        while (v1_0 < this.g.size()) {
	            if (((cqq) this.g.get(v1_0)).e != p3) {
	                v1_0++;
	            } else {
	                this.g.remove(v1_0);
	            }
	        }
	        if ((this.f != null) && (this.f.e == p3)) {
	            this.f.d = 1;
	        }
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.api.Status p9, android.os.ParcelFileDescriptor p10, int p11, int p12, int p13, cqq p14)
	    {
	        try {
	            if (this.f == p14) {
	                this.f = 0;
	                if (!this.e) {
	                    if ((p14.e.getTag() == p14) && (!p14.d)) {
	                        if ((!p9.a()) || (p10 == 0)) {
	                            java.io.IOException v0_7 = String.valueOf(p9);
	                            int v1_0 = String.valueOf(p10);
	                            new StringBuilder(((String.valueOf(v0_7).length() + 28) + String.valueOf(v1_0).length())).append("Avatar loaded: status=").append(v0_7).append("  pfd=").append(v1_0);
	                        }
	                        if (p10 != 0) {
	                            java.io.IOException v0_11 = new cqr(this, p14, p10, p11, p12, p13);
	                            if (android.os.Build$VERSION.SDK_INT < 11) {
	                                v0_11.execute(0);
	                            } else {
	                                Void[] v2_7 = new Void[0];
	                                v0_11.executeOnExecutor(cqp.c, v2_7);
	                            }
	                            p10 = 0;
	                        }
	                        if (!this.e) {
	                            this.a();
	                        }
	                        if (p10 != 0) {
	                            try {
	                                p10.close();
	                            } catch (java.io.IOException v0) {
	                            }
	                        }
	                    } else {
	                        if (!this.e) {
	                            this.a();
	                        }
	                        if (p10 != 0) {
	                            try {
	                                p10.close();
	                            } catch (java.io.IOException v0) {
	                            }
	                        }
	                    }
	                } else {
	                    if (!this.e) {
	                        this.a();
	                    }
	                    if (p10 != 0) {
	                        try {
	                            p10.close();
	                        } catch (java.io.IOException v0) {
	                        }
	                    }
	                }
	            } else {
	                android.util.Log.w("AvatarManager", "Got a different request than we\'re waiting for!");
	                if (!this.e) {
	                    this.a();
	                }
	                if (p10 != 0) {
	                    try {
	                        p10.close();
	                    } catch (java.io.IOException v0) {
	                    }
	                }
	            }
	        } catch (java.io.IOException v0_12) {
	            if (!this.e) {
	                this.a();
	            }
	            if (p10 != 0) {
	                try {
	                    p10.close();
	                } catch (int v1) {
	                }
	            }
	            throw v0_12;
	        }
	        return;
	    }
	
	
	    public final void a(cqq p4)
	    {
	        if (!this.d.containsKey(p4.f)) {
	            java.util.LinkedList v0_2 = p4.e;
	            this.a(v0_2);
	            if (this.b.d()) {
	                v0_2.setTag(p4);
	                this.g.add(p4);
	                this.a();
	            }
	        } else {
	            p4.e.setImageBitmap(((android.graphics.Bitmap) this.d.get(p4.f)));
	            this.a(p4.e);
	        }
	        return;
	    }
	
	
	    protected void a(cqq p2, android.graphics.Bitmap p3)
	    {
	        if (p3 != null) {
	            p2.e.setImageBitmap(p3);
	        }
	        return;
	    }
	
