	private static java.lang.reflect.Method a
	private static java.lang.reflect.Method b
	
	    static eb()
	    {
	        try {
	            reflect.Method v0_1 = Class.forName("libcore.icu.ICU");
	        } catch (reflect.Method v0_3) {
	            android.util.Log.w("ICUCompatIcs", v0_3);
	            return;
	        }
	        if (v0_1 == null) {
	            return;
	        } else {
	            Class[] v2_1 = new Class[1];
	            v2_1[0] = String;
	            eb.a = v0_1.getMethod("getScript", v2_1);
	            Class[] v2_3 = new Class[1];
	            v2_3[0] = String;
	            eb.b = v0_1.getMethod("addLikelySubtags", v2_3);
	            return;
	        }
	    }
	
	
	    public static String a(String p4)
	    {
	        try {
	            int v0_4;
	            if (eb.a == null) {
	                v0_4 = 0;
	            } else {
	                int v0_2 = new Object[1];
	                v0_2[0] = p4;
	                v0_4 = ((String) eb.a.invoke(0, v0_2));
	            }
	        } catch (int v0_6) {
	            android.util.Log.w("ICUCompatIcs", v0_6);
	        } catch (int v0_5) {
	            android.util.Log.w("ICUCompatIcs", v0_5);
	        }
	        return v0_4;
	    }
	
	
	    public static String b(String p3)
	    {
	        try {
	            String v0_4;
	            if (eb.b == null) {
	                v0_4 = p3;
	            } else {
	                String v0_2 = new Object[1];
	                v0_2[0] = p3;
	                v0_4 = ((String) eb.b.invoke(0, v0_2));
	            }
	        } catch (String v0_5) {
	            android.util.Log.w("ICUCompatIcs", v0_5);
	        } catch (String v0_6) {
	            android.util.Log.w("ICUCompatIcs", v0_6);
	        }
	        return v0_4;
	    }
	
