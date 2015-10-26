	public static final android.graphics.Rect a
	private static java.lang.Class b
	
	    static sf()
	    {
	        sf.a = new android.graphics.Rect();
	        if (android.os.Build$VERSION.SDK_INT >= 18) {
	            try {
	                sf.b = Class.forName("android.graphics.Insets");
	            } catch (ClassNotFoundException v0) {
	            }
	        }
	        return;
	    }
	
	
	    public static android.graphics.Rect a(android.graphics.drawable.Drawable p10)
	    {
	        android.graphics.Rect v0_3;
	        if (sf.b == null) {
	            v0_3 = sf.a;
	        } else {
	            try {
	                android.graphics.Rect v0_1 = bo.d(p10);
	                Object v4_1 = new Class[0];
	                int v3_2 = new Object[0];
	                Object v4_2 = v0_1.getClass().getMethod("getOpticalInsets", v4_1).invoke(v0_1, v3_2);
	            } catch (android.graphics.Rect v0) {
	                android.util.Log.e("DrawableUtils", "Couldn\'t obtain the optical insets. Ignoring.");
	            }
	            if (v4_2 == null) {
	            } else {
	                v0_3 = new android.graphics.Rect();
	                reflect.Field[] v5 = sf.b.getFields();
	                int v6 = v5.length;
	                int v3_3 = 0;
	                while (v3_3 < v6) {
	                    reflect.Field v7 = v5[v3_3];
	                    boolean v8_0 = v7.getName();
	                    int v1_3 = -1;
	                    switch (v8_0.hashCode()) {
	                        case -1383228885:
	                            if (!v8_0.equals("bottom")) {
	                            } else {
	                                v1_3 = 3;
	                            }
	                            break;
	                        case 115029:
	                            if (!v8_0.equals("top")) {
	                            } else {
	                                v1_3 = 1;
	                            }
	                            break;
	                        case 3317767:
	                            if (!v8_0.equals("left")) {
	                            } else {
	                                v1_3 = 0;
	                            }
	                            break;
	                        case 108511772:
	                            if (!v8_0.equals("right")) {
	                            } else {
	                                v1_3 = 2;
	                            }
	                            break;
	                    }
	                    switch (v1_3) {
	                        case 0:
	                            v0_3.left = v7.getInt(v4_2);
	                            break;
	                        case 1:
	                            v0_3.top = v7.getInt(v4_2);
	                            break;
	                        case 2:
	                            v0_3.right = v7.getInt(v4_2);
	                            break;
	                        case 3:
	                            v0_3.bottom = v7.getInt(v4_2);
	                            break;
	                    }
	                    v3_3++;
	                }
	            }
	        }
	        return v0_3;
	    }
	
