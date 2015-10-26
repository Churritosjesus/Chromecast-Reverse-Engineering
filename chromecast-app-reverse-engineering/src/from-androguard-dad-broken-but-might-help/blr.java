	private static final blp a
	private static final java.util.ArrayList b
	
	    static blr()
	    {
	        blr.a = new blp("NetworkUtil");
	        java.util.List v1_2 = new Integer[15];
	        v1_2[0] = Integer.valueOf(0);
	        v1_2[1] = Integer.valueOf(2412);
	        v1_2[2] = Integer.valueOf(2417);
	        v1_2[3] = Integer.valueOf(2422);
	        v1_2[4] = Integer.valueOf(2427);
	        v1_2[5] = Integer.valueOf(2432);
	        v1_2[6] = Integer.valueOf(2437);
	        v1_2[7] = Integer.valueOf(2442);
	        v1_2[8] = Integer.valueOf(2447);
	        v1_2[9] = Integer.valueOf(2452);
	        v1_2[10] = Integer.valueOf(2457);
	        v1_2[11] = Integer.valueOf(2462);
	        v1_2[12] = Integer.valueOf(2467);
	        v1_2[13] = Integer.valueOf(2472);
	        v1_2[14] = Integer.valueOf(2484);
	        blr.b = new java.util.ArrayList(java.util.Arrays.asList(v1_2));
	        return;
	    }
	
	
	    private static String a(android.content.Context p2, int p3)
	    {
	        String v0_5;
	        if (!blr.a(p3)) {
	            if ((p3 < 4915) || (p3 > 5825)) {
	                String v0_3 = 0;
	            } else {
	                v0_3 = 1;
	            }
	            if (v0_3 == null) {
	                v0_5 = p2.getResources().getString(b.en);
	            } else {
	                v0_5 = p2.getResources().getString(b.ea);
	            }
	        } else {
	            v0_5 = p2.getResources().getString(b.dZ);
	        }
	        return v0_5;
	    }
	
	
	    public static String a(android.net.wifi.WifiInfo p1)
	    {
	        String v0_1;
	        if (p1 != null) {
	            v0_1 = blr.a(p1.getSSID());
	        } else {
	            v0_1 = "";
	        }
	        return v0_1;
	    }
	
	
	    private static String a(String p2)
	    {
	        if (p2 != null) {
	            if ((p2.startsWith("\"")) && (p2.endsWith("\""))) {
	                p2 = p2.substring(1, (p2.length() - 1));
	            }
	        } else {
	            p2 = "";
	        }
	        return p2;
	    }
	
	
	    public static java.util.Set a(android.content.Context p5, String[] p6)
	    {
	        java.util.HashSet v1_1 = new java.util.HashSet();
	        boolean v0_2 = ((android.net.wifi.WifiManager) p5.getSystemService("wifi"));
	        if (v0_2) {
	            boolean v0_3 = v0_2.getScanResults();
	            if (v0_3) {
	                java.util.Iterator v2_0 = v0_3.iterator();
	                while (v2_0.hasNext()) {
	                    boolean v0_8 = ((android.net.wifi.ScanResult) v2_0.next());
	                    String v3_3 = blr.a(v0_8.SSID);
	                    if ((!android.text.TextUtils.isEmpty(v3_3)) && (!blr.a(v0_8.BSSID, p6))) {
	                        v1_1.add(v3_3);
	                    }
	                }
	            }
	        }
	        boolean v0_6 = new Object[1];
	        v0_6[0] = Integer.valueOf(v1_1.size());
	        return v1_1;
	    }
	
	
	    private static boolean a(int p1)
	    {
	        if ((p1 < 2412) || (p1 > 2484)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public static boolean a(android.content.Context p2)
	    {
	        int v0_5;
	        int v0_3 = ((android.net.ConnectivityManager) p2.getSystemService("connectivity")).getNetworkInfo(1);
	        if ((v0_3 == 0) || (!v0_3.isConnected())) {
	            v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
	
	    public static boolean a(String p2, String p3)
	    {
	        if ((p2 != null) && (p3 != null)) {
	            boolean v0_1 = blr.a(p2).equals(blr.a(p3));
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    private static boolean a(String p5, String[] p6)
	    {
	        int v0 = 0;
	        if (p6 != null) {
	            int v1 = 0;
	            while (v1 < p6.length) {
	                if (!p5.toUpperCase().startsWith(p6[v1].toUpperCase())) {
	                    v1++;
	                } else {
	                    v0 = 1;
	                    break;
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public static bfs b(android.content.Context p6)
	    {
	        bfs v1_0 = 0;
	        if (blr.a(p6)) {
	            bfu v0_3 = ((android.net.wifi.WifiManager) p6.getSystemService("wifi"));
	            int v2_0 = v0_3.getConnectionInfo();
	            if (v2_0 != 0) {
	                bfu v0_6;
	                bfu v0_4 = v0_3.getConfiguredNetworks();
	                if (v0_4 == null) {
	                    v0_6 = 0;
	                } else {
	                    int v3_0 = v0_4.iterator();
	                    while (v3_0.hasNext()) {
	                        v0_6 = ((android.net.wifi.WifiConfiguration) v3_0.next());
	                        if (v0_6.networkId == v2_0.getNetworkId()) {
	                        }
	                    }
	                }
	                v1_0 = new bfs();
	                v1_0.a = blr.a(v2_0);
	                if (v0_6 != null) {
	                    v1_0.i = v0_6.BSSID;
	                }
	                bfu v0_8;
	                if (v0_6 == null) {
	                    v0_8 = bfu.a;
	                } else {
	                    if (!v0_6.allowedKeyManagement.get(1)) {
	                        if ((!v0_6.allowedKeyManagement.get(2)) && (!v0_6.allowedKeyManagement.get(3))) {
	                            if (v0_6.wepKeys[0] == null) {
	                                v0_8 = bfu.b;
	                            } else {
	                                v0_8 = bfu.c;
	                            }
	                        } else {
	                            v0_8 = bfu.i;
	                        }
	                    } else {
	                        v0_8 = bfu.h;
	                    }
	                }
	                v1_0.b = v0_8;
	            }
	        }
	        return v1_0;
	    }
	
	
	    public static String c(android.content.Context p1)
	    {
	        String v0_4;
	        String v0_3 = ((android.net.wifi.WifiManager) p1.getSystemService("wifi")).getConnectionInfo();
	        if (v0_3 != null) {
	            v0_4 = blr.a(v0_3);
	        } else {
	            v0_4 = "";
	        }
	        return v0_4;
	    }
	
	
	    public static int d(android.content.Context p10)
	    {
	        int v0_11;
	        if (blr.a(p10)) {
	            int v0_3 = ((android.net.wifi.WifiManager) p10.getSystemService("wifi"));
	            String v3_0 = v0_3.getConnectionInfo();
	            if (v3_0 != null) {
	                Integer v2_1;
	                Integer v2_0 = v3_0.getBSSID();
	                if (android.text.TextUtils.isEmpty(v2_0)) {
	                    v2_1 = 0;
	                } else {
	                    String v4_1 = v0_3.getScanResults().iterator();
	                    while (v4_1.hasNext()) {
	                        int v0_8 = ((android.net.wifi.ScanResult) v4_1.next());
	                        if ((v0_8 != 0) && (v2_0.equalsIgnoreCase(v0_8.BSSID))) {
	                            v2_1 = v0_8;
	                        }
	                    }
	                }
	                if (v2_1 != null) {
	                    int v0_9 = v2_1.frequency;
	                    if (blr.a(v0_9)) {
	                        v0_11 = blr.b.indexOf(Integer.valueOf(v0_9));
	                    } else {
	                        v0_11 = -1;
	                    }
	                    if (v0_11 != -1) {
	                        Object[] v1_2 = new Object[4];
	                        v1_2[0] = v3_0.getSSID();
	                        v1_2[1] = v3_0.getBSSID();
	                        v1_2[2] = blr.a(p10, v2_1.frequency);
	                        v1_2[3] = Integer.valueOf(v0_11);
	                    } else {
	                        Object[] v1_3 = new Object[3];
	                        v1_3[0] = v3_0.getSSID();
	                        v1_3[1] = v3_0.getBSSID();
	                        v1_3[2] = blr.a(p10, v2_1.frequency);
	                    }
	                } else {
	                    int v0_12 = new Object[2];
	                    v0_12[0] = v3_0.getSSID();
	                    v0_12[1] = v3_0.getBSSID();
	                    v0_11 = -1;
	                }
	            } else {
	                v0_11 = -1;
	            }
	        } else {
	            v0_11 = -1;
	        }
	        return v0_11;
	    }
	
	
	    public static boolean e(android.content.Context p7)
	    {
	        int v2_1;
	        boolean v0 = 0;
	        int v2_0 = p7.getContentResolver();
	        if (android.os.Build$VERSION.SDK_INT < 17) {
	            if (android.os.Build$VERSION.SDK_INT >= 15) {
	                v2_1 = android.provider.Settings$Secure.getInt(v2_0, "wifi_watchdog_poor_network_test_enabled", -1);
	                if (v2_1 == -1) {
	                    if (android.os.Build$VERSION.SDK_INT < 17) {
	                        v0 = 1;
	                    } else {
	                        try {
	                            IllegalArgumentException v1_3 = Class.forName("android.net.wifi.WifiWatchdogStateMachine").getField("DEFAULT_POOR_NETWORK_AVOIDANCE_ENABLED");
	                        } catch (IllegalArgumentException v1) {
	                        } catch (IllegalArgumentException v1) {
	                        } catch (IllegalArgumentException v1) {
	                        } catch (IllegalArgumentException v1) {
	                        }
	                        if (!v1_3.isAccessible()) {
	                            v1_3.setAccessible(1);
	                        }
	                        v0 = v1_3.getBoolean(0);
	                    }
	                } else {
	                    if (v2_1 == 1) {
	                        v0 = 1;
	                    }
	                }
	            }
	        } else {
	            v2_1 = android.provider.Settings$Global.getInt(v2_0, "wifi_watchdog_poor_network_test_enabled", -1);
	        }
	        return v0;
	    }
	
	
	    public static android.content.Intent f(android.content.Context p3)
	    {
	        int v1_3;
	        int v0_1 = new android.content.Intent("android.settings.WIFI_IP_SETTINGS");
	        if (p3.getPackageManager().resolveActivity(v0_1, 65536) == null) {
	            v1_3 = 0;
	        } else {
	            v1_3 = 1;
	        }
	        if (v1_3 == 0) {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
