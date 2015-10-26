	private static final android.net.Uri a
	
	    static ble()
	    {
	        ble.a = android.net.Uri.parse("content://com.google.settings/partner");
	        return;
	    }
	
	
	    public static boolean a(android.content.Context p3)
	    {
	        int v0_2;
	        if (p3.getPackageManager().resolveActivity(new android.content.Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) == null) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public static int b(android.content.Context p9)
	    {
	        int v6 = 2;
	        String v7 = 0;
	        int v0_0 = p9.getContentResolver();
	        try {
	            String v2_1 = new String[1];
	            v2_1[0] = "value";
	            String[] v4_2 = new String[1];
	            v4_2[0] = "use_location_for_services";
	            int v1_1 = v0_0.query(ble.a, v2_1, "name=?", v4_2, 0);
	            try {
	                if ((v1_1 != 0) && (v1_1.moveToNext())) {
	                    v7 = v1_1.getString(0);
	                }
	            } catch (int v0_1) {
	                android.util.Log.w("GoogleLocationSettingHelper", "Failed to get \'Use My Location\' setting", v0_1);
	                if (v1_1 == 0) {
	                    if (v7 != null) {
	                        try {
	                            int v0_5 = Integer.parseInt(v7);
	                        } catch (int v0) {
	                            v0_5 = 2;
	                        }
	                        v6 = v0_5;
	                    }
	                    return v6;
	                } else {
	                    v1_1.close();
	                }
	            }
	            if (v1_1 == 0) {
	            } else {
	                v1_1.close();
	            }
	        } catch (int v0_1) {
	            v1_1 = 0;
	        } catch (int v0_2) {
	            if (v7 != null) {
	                v7.close();
	            }
	            throw v0_2;
	        } catch (int v0_2) {
	            v7 = v1_1;
	        }
	    }
	
