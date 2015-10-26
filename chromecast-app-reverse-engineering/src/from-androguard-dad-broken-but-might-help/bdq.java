	public final bdf a
	 java.lang.String b
	private final  j
	private final  k
	
	    public bdq(String p2, int p3, int p4)
	    {
	        this(p2);
	        this.j = p3;
	        this.k = p4;
	        this.a = new bdf();
	        return;
	    }
	
	
	    private void a(String p5, org.json.JSONObject p6)
	    {
	        int v0_0 = 0;
	        String v1 = 0;
	        if (p5 != null) {
	            bdf v2_0;
	            if (p6 == null) {
	                v2_0 = 0;
	            } else {
	                v2_0 = p6.optJSONObject("timezone");
	            }
	            if (v2_0 != null) {
	                v1 = v2_0.optString("display_string", 0);
	                v0_0 = v2_0.optInt("offset", 0);
	            }
	            this.a.I = new bdb(p5, v1, v0_0);
	        } else {
	            this.a.I = 0;
	        }
	        return;
	    }
	
	
	    private void a(org.json.JSONObject p9)
	    {
	        bdf v0_1 = p9.optJSONObject("multizone");
	        if (v0_1 != null) {
	            this.a.S = v0_1.optInt("audio_output_delay");
	            org.json.JSONArray v1_2 = v0_1.optJSONArray("groups");
	            if ((v1_2 != null) && (v1_2.length() > 0)) {
	                bcx[] v2_2 = new bcx[v1_2.length()];
	                bdf v0_4 = 0;
	                while (v0_4 < v1_2.length()) {
	                    String v3_1 = v1_2.optJSONObject(v0_4);
	                    v2_2[v0_4] = new bcx(v3_1.optString("uuid", 0), v3_1.optString("name", 0), v3_1.optString("leader", 0));
	                    v0_4++;
	                }
	                this.a.T = v2_2;
	            }
	        }
	        return;
	    }
	
	
	    private void b(String p4, org.json.JSONObject p5)
	    {
	        String v0 = 0;
	        if (p4 != null) {
	            if (p5 != null) {
	                bdf v1_1 = p5.optJSONObject("locale");
	                if (v1_1 != null) {
	                    v0 = v1_1.optString("display_string", 0);
	                }
	            }
	            this.a.K = new bcz(p4, v0);
	        } else {
	            this.a.K = 0;
	        }
	        return;
	    }
	
	
	    private void b(org.json.JSONObject p9)
	    {
	        bdf v0_0 = 0;
	        org.json.JSONArray v1_1 = p9.optJSONObject("sign");
	        if (v1_1 != null) {
	            String[] v2_1 = v1_1.optString("certificate", 0);
	            String v3_1 = v1_1.optString("nonce", 0);
	            byte[] v4_1 = v1_1.optString("signed_data", 0);
	            if ((v2_1 != null) && ((v3_1 != null) && (v4_1 != null))) {
	                org.json.JSONArray v1_2 = v1_1.optJSONArray("intermediate_certs");
	                this.a.U = new bcv(v2_1, v3_1, android.util.Base64.decode(v4_1.getBytes(), 0));
	                if ((v1_2 != null) && (v1_2.length() > 0)) {
	                    String[] v2_4 = new String[v1_2.length()];
	                    while (v0_0 < v1_2.length()) {
	                        v2_4[v0_0] = v1_2.optString(v0_0, 0);
	                        v0_0++;
	                    }
	                    this.a.V = v2_4;
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final int a()
	    {
	        String v5_1 = new java.util.ArrayList();
	        if ((this.k == 0) || (this.k >= 7)) {
	            v5_1.add("version");
	            if ((this.j & 2) != 0) {
	                v5_1.add("name");
	            }
	            if ((this.j & 4) != 0) {
	                v5_1.add("build_info");
	            }
	            if ((this.j & 8) != 0) {
	                v5_1.add("device_info");
	            }
	            if ((this.j & 16) != 0) {
	                v5_1.add("ota_status");
	            }
	            if ((this.j & 32) != 0) {
	                v5_1.add("net");
	            }
	            if ((this.j & 64) != 0) {
	                v5_1.add("wifi");
	            }
	            if ((this.j & 128) != 0) {
	                v5_1.add("setup");
	            }
	            if ((this.j & 256) != 0) {
	                v5_1.add("settings");
	            }
	            if ((this.j & 512) != 0) {
	                v5_1.add("opt_in");
	            }
	            if ((this.j & 1024) != 0) {
	                v5_1.add("opencast");
	            }
	            if ((this.j & 2048) != 0) {
	                v5_1.add("multizone");
	            }
	            if ((this.j & 4096) != 0) {
	                v5_1.add("sign");
	            }
	            if ((this.j & 8192) != 0) {
	                v5_1.add("detail");
	            }
	        }
	        int v6_1 = new java.util.ArrayList(2);
	        if ((this.k == 0) || (this.k < 7)) {
	            if (((this.j & 8) != 0) || (((this.j & 8192) != 0) || ((this.j & 256) != 0))) {
	                v6_1.add("detail");
	            }
	            if ((this.j & 4096) != 0) {
	                v6_1.add("sign");
	            }
	        }
	        int v7_1 = new StringBuilder();
	        if (!v5_1.isEmpty()) {
	            String v0_60;
	            String v0_58 = String.valueOf(android.text.TextUtils.join(",", v5_1));
	            if (v0_58.length() == 0) {
	                v0_60 = new String("params=");
	            } else {
	                v0_60 = "params=".concat(v0_58);
	            }
	            v7_1.append(v0_60);
	        }
	        if (!v6_1.isEmpty()) {
	            if (!v5_1.isEmpty()) {
	                v7_1.append("&");
	            }
	            String v0_68;
	            String v0_66 = String.valueOf(android.text.TextUtils.join(",", v6_1));
	            if (v0_66.length() == 0) {
	                v0_68 = new String("options=");
	            } else {
	                v0_68 = "options=".concat(v0_66);
	            }
	            v7_1.append(v0_68);
	        }
	        String v0_70;
	        String v5_3 = v7_1.toString();
	        if (this.b == null) {
	            v0_70 = 0;
	        } else {
	            v0_70 = new java.util.HashMap(1);
	            v0_70.put("Accept-Language", this.b);
	        }
	        try {
	            String v0_74;
	            String v0_72 = this.a("eureka_info", v5_3, v0_70, bdq.c);
	        } catch (String v0) {
	            v0_74 = -1;
	            return v0_74;
	        } catch (String v0) {
	            v0_74 = -2;
	            return v0_74;
	        }
	        if (v0_72.b() == 200) {
	            String v0_73 = v0_72.c();
	            if ((v0_73 != null) && ("application/json".equals(v0_73.b))) {
	                String v0_75 = v0_73.a();
	                if (v0_75 != null) {
	                    String v4_7 = new org.json.JSONObject(v0_75);
	                    String v0_77 = v4_7.optInt("version", 0);
	                    this.a.a = v0_77;
	                    this.a.b = v4_7.optString("name", 0);
	                    if (v0_77 >= 7) {
	                        String v0_79 = v4_7.optJSONObject("build_info");
	                        if (v0_79 != null) {
	                            this.a.c = v0_79.optString("cast_build_revision", 0);
	                            this.a.d = v0_79.optString("system_build_number", 0);
	                            this.a.e = v0_79.optString("release_track", 0);
	                        }
	                        String v0_82 = v4_7.optJSONObject("device_info");
	                        if (v0_82 != null) {
	                            this.a.f = v0_82.optString("manufacturer", 0);
	                            this.a.g = v0_82.optString("model_name", 0);
	                            bdf v3_7 = v0_82.optJSONObject("capabilities");
	                            if (v3_7 != null) {
	                                this.a.h = v3_7.optBoolean("display_supported", 1);
	                                this.a.i = v3_7.optBoolean("wifi_supported", 1);
	                                this.a.j = v3_7.optBoolean("hotspot_supported", 1);
	                                this.a.k = v3_7.optBoolean("ble_supported", 0);
	                                this.a.l = v3_7.optBoolean("multizone_supported", 0);
	                            }
	                            this.a.m = ((long) (v0_82.optDouble("uptime", 0) * 1000.0));
	                            this.a.n = v0_82.optString("ssdp_udn", 0);
	                            this.a.o = v0_82.optString("uma_client_id", 0);
	                            this.a.p = v0_82.getString("mac_address");
	                            this.a.a(v0_82.optString("hotspot_bssid"));
	                            this.a.r = v0_82.optString("public_key", 0);
	                        }
	                        String v0_85 = v4_7.optJSONObject("ota_status");
	                        if (v0_85 != null) {
	                            this.a.s = v0_85.optBoolean("ready_to_apply", 0);
	                            this.a.t = v0_85.optInt("download_progress", 0);
	                        }
	                        String v0_88 = v4_7.optJSONObject("net");
	                        if (v0_88 != null) {
	                            this.a.u = v0_88.optString("ip_address");
	                            this.a.v = v0_88.optBoolean("online", 0);
	                            this.a.w = v0_88.optBoolean("ethernet_connected", 0);
	                        }
	                        String v0_91 = v4_7.optJSONObject("wifi");
	                        if (v0_91 != null) {
	                            this.a.x = v0_91.optString("bssid");
	                            this.a.y = v0_91.optString("ssid");
	                            this.a.z = bdl.a(v0_91.optInt("wpa_state", bdl.a.b));
	                            this.a.A = v0_91.optBoolean("wpa_configured", 0);
	                            this.a.B = v0_91.optInt("wpa_id", 0);
	                            this.a.C = v0_91.optInt("signal_level", 0);
	                            this.a.D = v0_91.optInt("noise_level", 0);
	                        }
	                        String v0_94 = v4_7.optJSONObject("setup");
	                        if (v0_94 != null) {
	                            this.a.E = v0_94.optBoolean("tos_accepted", 0);
	                            this.a.F = v0_94.optString("ssid_suffix");
	                            this.a.G = bdj.a(v0_94.optInt("setup_state", bdj.a.r));
	                            if (v0_94.has("stats")) {
	                                this.a.H = v0_94.getJSONObject("stats").optInt("num_initial_eureka_info");
	                            }
	                        }
	                        String v0_98 = v4_7.optJSONObject("detail");
	                        bdf v3_35 = v4_7.optJSONObject("settings");
	                        if (v3_35 != null) {
	                            this.a(v3_35.optString("timezone", 0), v0_98);
	                            this.a.J = bdk.a(v3_35.optInt("time_format", bdk.a.c));
	                            this.b(v3_35.optString("locale", 0), v0_98);
	                            this.a.L = v3_35.optString("country_code", 0);
	                            this.a.M = v3_35.optBoolean("system_sound_effects", 0);
	                        }
	                        String v0_102 = v4_7.optJSONObject("opt_in");
	                        if (v0_102 != null) {
	                            this.a.N = v0_102.optBoolean("audio_hdr", 0);
	                            this.a.O = v0_102.optBoolean("stats", 0);
	                            if (!v0_102.has("opencast")) {
	                                this.a.P = 0;
	                            } else {
	                                this.a.P = Boolean.valueOf(v0_102.optBoolean("opencast", 0));
	                            }
	                        }
	                        String v0_107 = v4_7.optJSONObject("opencast");
	                        if (v0_107 != null) {
	                            this.a.R = v0_107.optString("pin_code", 0);
	                        }
	                        this.a(v4_7);
	                        this.b(v4_7);
	                    } else {
	                        this.a.n = v4_7.optString("ssdp_udn", 0);
	                        this.a.c = v4_7.optString("build_version", 0);
	                        this.a.d = v4_7.optString("build_version", 0);
	                        this.a.m = ((long) (v4_7.optDouble("uptime", 0) * 1000.0));
	                        this.a.s = v4_7.optBoolean("has_update", 0);
	                        this.a.u = v4_7.optString("ip_address");
	                        this.a.p = v4_7.getString("mac_address");
	                        this.a.v = v4_7.optBoolean("connected", 0);
	                        this.a.w = v4_7.optBoolean("ethernet_connected", 0);
	                        this.a.E = v4_7.optBoolean("tos_accepted", 0);
	                        this.a.x = v4_7.optString("bssid");
	                        this.a.y = v4_7.optString("ssid");
	                        this.a.a(v4_7.optString("hotspot_bssid"));
	                        this.a.z = bdl.a(v4_7.optInt("wpa_state", bdl.a.b));
	                        this.a.G = bdj.a(v4_7.optInt("setup_state", bdj.a.r));
	                        this.a.A = v4_7.optBoolean("wpa_configured", 0);
	                        this.a.B = v4_7.optInt("wpa_id", 0);
	                        this.a.C = v4_7.optInt("signal_level", 0);
	                        this.a.D = v4_7.optInt("noise_level", 0);
	                        this.a.r = v4_7.optString("public_key", 0);
	                        this.a.J = bdk.a(v4_7.optInt("time_format", bdk.a.c));
	                        this.a.R = v4_7.optString("opencast_pin_code", 0);
	                        String v0_132 = v4_7.optJSONObject("detail");
	                        String v5_124 = v4_7.optString("locale", 0);
	                        this.a(v4_7.optString("timezone", 0), v0_132);
	                        this.b(v5_124, v0_132);
	                        if ((v0_132 != null) && (v0_132.has("model_name"))) {
	                            this.a.g = v0_132.getString("model_name");
	                        }
	                        if (v4_7.has("location")) {
	                            this.a.L = v4_7.getJSONObject("location").optString("country_code");
	                        }
	                        this.b(v4_7);
	                        if (v4_7.has("opt_in")) {
	                            String v0_146;
	                            String v5_130 = v4_7.getJSONObject("opt_in");
	                            if ((!v5_130.optBoolean("stats", 0)) && (!v5_130.optBoolean("crash", 0))) {
	                                v0_146 = 0;
	                            } else {
	                                v0_146 = 1;
	                            }
	                            this.a.O = v0_146;
	                            this.a.Q = v5_130.optBoolean("device_id", 0);
	                            if (!v5_130.has("opencast")) {
	                                this.a.P = 0;
	                            } else {
	                                this.a.P = Boolean.valueOf(v5_130.optBoolean("opencast", 0));
	                            }
	                        }
	                        if (v4_7.has("setup_stats")) {
	                            this.a.H = v4_7.getJSONObject("setup_stats").optInt("num_initial_eureka_info");
	                        }
	                    }
	                    v0_74 = 0;
	                    return v0_74;
	                } else {
	                    v0_74 = -3;
	                    return v0_74;
	                }
	            } else {
	                v0_74 = -3;
	                return v0_74;
	            }
	        } else {
	            v0_74 = -1;
	            return v0_74;
	        }
	    }
	
