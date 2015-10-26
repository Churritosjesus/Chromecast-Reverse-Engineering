	private final bdf a
	private final java.util.HashMap b
	private final  j
	
	    public bfo(String p1, bdf p2, java.util.HashMap p3, int p4)
	    {
	        this(p1);
	        this.a = p2;
	        this.b = p3;
	        this.j = p4;
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v5_1;
	        org.json.JSONObject v22_1 = new org.json.JSONObject();
	        bdf v19_0 = 0;
	        bdf v18_0 = 0;
	        bdf v17_0 = 0;
	        bdf v16_0 = 0;
	        bdf v15_0 = 0;
	        bdf v14_0 = 0;
	        bdf v13_0 = 0;
	        bdf v12_0 = 0;
	        bdf v11_0 = 0;
	        bdf v9_0 = 0;
	        String v8_0 = 0;
	        int v7_0 = 0;
	        int v6_0 = 0;
	        if (this.j < 7) {
	            v5_1 = 0;
	        } else {
	            v5_1 = 1;
	        }
	        try {
	            int v21_1;
	            bdf v4_4 = this.b.get("friendly_name");
	        } catch (bdf v4) {
	            bdf v4_6 = 0;
	            int v5_2 = 0;
	            int v6_1 = 0;
	            bdf v10_1 = 0;
	            int v7_1 = 0;
	            bdf v11_1 = 0;
	            String v8_1 = 0;
	            bdf v12_1 = 0;
	            bdf v9_1 = 0;
	            bdf v13_1 = 0;
	            bdf v14_1 = 0;
	            bdf v15_1 = 0;
	            bdf v16_1 = 0;
	            bdf v17_1 = 0;
	            bdf v18_1 = 0;
	            bdf v4_39;
	            if (v22_1.length() != 0) {
	                try {
	                    if (this.a("set_eureka_info", bfc.a(v22_1), bfo.c).b() == 200) {
	                        if (this.a != null) {
	                            if (v18_1 != null) {
	                                this.a.b = v18_1;
	                            }
	                            if (v17_1 != null) {
	                                this.a.I = v17_1;
	                            }
	                            if (v16_1 != null) {
	                                this.a.J = v16_1;
	                            }
	                            if (v15_1 != null) {
	                                this.a.K = v15_1;
	                            }
	                            if (v14_1 != null) {
	                                this.a.L = v14_1;
	                            }
	                            if (v13_1 != null) {
	                                this.a.M = v8_1;
	                            }
	                            if (v12_1 != null) {
	                                this.a.N = v7_1;
	                            }
	                            if (v11_1 != null) {
	                                this.a.O = v6_1;
	                            }
	                            if (v10_1 != null) {
	                                this.a.Q = v5_2;
	                            }
	                            if (v9_1 != null) {
	                                this.a.P = Boolean.valueOf(v4_6);
	                                if (v4_6 == null) {
	                                    this.a.R = 0;
	                                }
	                            }
	                        }
	                        v4_39 = 0;
	                    } else {
	                        v4_39 = -1;
	                    }
	                } catch (bdf v4) {
	                    v4_39 = -1;
	                } catch (bdf v4) {
	                    v4_39 = -2;
	                }
	            } else {
	                v4_39 = 0;
	            }
	            return v4_39;
	        }
	        if (v5_1 == 0) {
	            v21_1 = v22_1;
	        } else {
	            v21_1 = new org.json.JSONObject();
	        }
	        org.json.JSONObject v23_1 = new org.json.JSONObject();
	        if ((v4_4 != null) && ((v4_4 instanceof String))) {
	            bdf v4_5 = ((String) v4_4);
	            try {
	                v22_1.put("name", v4_5);
	                v19_0 = v4_5;
	            } catch (int v5) {
	                v5_2 = 0;
	                v6_1 = 0;
	                v7_1 = 0;
	                v8_1 = 0;
	                v9_1 = 0;
	                v10_1 = 0;
	                v11_1 = 0;
	                v12_1 = 0;
	                v13_1 = 0;
	                v14_1 = 0;
	                v15_1 = 0;
	                v16_1 = 0;
	                v17_1 = 0;
	                v18_1 = v4_5;
	                v4_6 = 0;
	            }
	        }
	        try {
	            bdf v4_8 = this.b.get("timezone");
	        } catch (bdf v4) {
	            v4_6 = 0;
	            v5_2 = 0;
	            v6_1 = 0;
	            v10_1 = 0;
	            v7_1 = 0;
	            v11_1 = 0;
	            v8_1 = 0;
	            v12_1 = 0;
	            v9_1 = 0;
	            v13_1 = 0;
	            v14_1 = 0;
	            v15_1 = 0;
	            v16_1 = 0;
	            v17_1 = 0;
	            v18_1 = v19_0;
	        }
	        if ((v4_8 != null) && ((v4_8 instanceof bdb))) {
	            bdf v4_9 = ((bdb) v4_8);
	            try {
	                v21_1.put("timezone", v4_9.a);
	                v18_0 = v4_9;
	            } catch (int v5) {
	                v5_2 = 0;
	                v18_1 = v19_0;
	                v6_1 = 0;
	                v7_1 = 0;
	                v8_1 = 0;
	                v9_1 = 0;
	                v11_1 = 0;
	                v12_1 = 0;
	                v13_1 = 0;
	                v14_1 = 0;
	                v15_1 = 0;
	                v16_1 = 0;
	                v17_1 = v4_9;
	                v4_6 = 0;
	                v10_1 = 0;
	            }
	        }
	        try {
	            bdf v4_11 = this.b.get("time_format");
	        } catch (bdf v4) {
	            v4_6 = 0;
	            v5_2 = 0;
	            v6_1 = 0;
	            v10_1 = 0;
	            v7_1 = 0;
	            v11_1 = 0;
	            v8_1 = 0;
	            v12_1 = 0;
	            v9_1 = 0;
	            v13_1 = 0;
	            v14_1 = 0;
	            v15_1 = 0;
	            v16_1 = 0;
	            v17_1 = v18_0;
	            v18_1 = v19_0;
	        }
	        if ((v4_11 != null) && ((v4_11 instanceof bdk))) {
	            bdf v4_12 = ((bdk) v4_11);
	            try {
	                v21_1.put("time_format", v4_12.c);
	                v17_0 = v4_12;
	            } catch (int v5) {
	                v5_2 = 0;
	                v17_1 = v18_0;
	                v6_1 = 0;
	                v18_1 = v19_0;
	                v7_1 = 0;
	                v8_1 = 0;
	                v9_1 = 0;
	                v12_1 = 0;
	                v13_1 = 0;
	                v14_1 = 0;
	                v15_1 = 0;
	                v16_1 = v4_12;
	                v4_6 = 0;
	                v10_1 = 0;
	                v11_1 = 0;
	            }
	        }
	        try {
	            bdf v4_14 = this.b.get("locale");
	        } catch (bdf v4) {
	            v4_6 = 0;
	            v5_2 = 0;
	            v6_1 = 0;
	            v10_1 = 0;
	            v7_1 = 0;
	            v11_1 = 0;
	            v8_1 = 0;
	            v12_1 = 0;
	            v9_1 = 0;
	            v13_1 = 0;
	            v14_1 = 0;
	            v15_1 = 0;
	            v16_1 = v17_0;
	            v17_1 = v18_0;
	            v18_1 = v19_0;
	        }
	        if ((v4_14 != null) && ((v4_14 instanceof bcz))) {
	            bdf v4_15 = ((bcz) v4_14);
	            try {
	                v21_1.put("locale", v4_15.a);
	                v16_0 = v4_15;
	            } catch (int v5) {
	                v5_2 = 0;
	                v16_1 = v17_0;
	                v6_1 = 0;
	                v17_1 = v18_0;
	                v7_1 = 0;
	                v18_1 = v19_0;
	                v8_1 = 0;
	                v9_1 = 0;
	                v13_1 = 0;
	                v14_1 = 0;
	                v15_1 = v4_15;
	                v4_6 = 0;
	                v10_1 = 0;
	                v11_1 = 0;
	                v12_1 = 0;
	            }
	        }
	        try {
	            bdf v4_17 = this.b.get("country_code");
	        } catch (bdf v4) {
	            v4_6 = 0;
	            v5_2 = 0;
	            v6_1 = 0;
	            v10_1 = 0;
	            v7_1 = 0;
	            v11_1 = 0;
	            v8_1 = 0;
	            v12_1 = 0;
	            v9_1 = 0;
	            v13_1 = 0;
	            v14_1 = 0;
	            v15_1 = v16_0;
	            v16_1 = v17_0;
	            v17_1 = v18_0;
	            v18_1 = v19_0;
	        }
	        if ((v4_17 != null) && ((v4_17 instanceof String))) {
	            bdf v4_18 = ((String) v4_17);
	            try {
	                if (v5_1 == 0) {
	                    bdf v15_3 = new org.json.JSONObject();
	                    v15_3.put("country_code", v4_18);
	                    v22_1.put("location", v15_3);
	                    v15_0 = v4_18;
	                } else {
	                    v21_1.put("country_code", v4_18);
	                    v15_0 = v4_18;
	                }
	            } catch (int v5) {
	                v5_2 = 0;
	                v15_1 = v16_0;
	                v6_1 = 0;
	                v16_1 = v17_0;
	                v7_1 = 0;
	                v17_1 = v18_0;
	                v8_1 = 0;
	                v18_1 = v19_0;
	                v9_1 = 0;
	                v14_1 = v4_18;
	                v4_6 = 0;
	                v10_1 = 0;
	                v11_1 = 0;
	                v12_1 = 0;
	                v13_1 = 0;
	            }
	            bdf v4_20 = this.b.get("system_sound_effects");
	            if ((v4_20 != null) && ((v4_20 instanceof Boolean))) {
	                v9_0 = ((Boolean) v4_20).booleanValue();
	                v14_0 = 1;
	                try {
	                    v21_1.put("system_sound_effects", v9_0);
	                } catch (bdf v4) {
	                    v4_6 = 0;
	                    v5_2 = 0;
	                    v6_1 = 0;
	                    v10_1 = 0;
	                    v7_1 = 0;
	                    v11_1 = 0;
	                    v8_1 = v9_0;
	                    v12_1 = 0;
	                    v9_1 = 0;
	                    v13_1 = 1;
	                    v14_1 = v15_0;
	                    v15_1 = v16_0;
	                    v16_1 = v17_0;
	                    v17_1 = v18_0;
	                    v18_1 = v19_0;
	                }
	            }
	            bdf v4_24 = this.b.get("opt_in_audio_hdr");
	            if ((v4_24 != null) && ((v4_24 instanceof Boolean))) {
	                v8_0 = ((Boolean) v4_24).booleanValue();
	                v13_0 = 1;
	                try {
	                    v23_1.put("audio_hdr", v8_0);
	                } catch (bdf v4) {
	                    v4_6 = 0;
	                    v5_2 = 0;
	                    v6_1 = 0;
	                    v10_1 = 0;
	                    v7_1 = v8_0;
	                    v11_1 = 0;
	                    v8_1 = v9_0;
	                    v12_1 = 1;
	                    v9_1 = 0;
	                    v13_1 = v14_0;
	                    v14_1 = v15_0;
	                    v15_1 = v16_0;
	                    v16_1 = v17_0;
	                    v17_1 = v18_0;
	                    v18_1 = v19_0;
	                }
	            }
	            bdf v4_28 = this.b.get("opt_in_stats");
	            if ((v4_28 != null) && ((v4_28 instanceof Boolean))) {
	                v7_0 = ((Boolean) v4_28).booleanValue();
	                v12_0 = 1;
	                try {
	                    v23_1.put("stats", v7_0);
	                } catch (bdf v4) {
	                    v4_6 = 0;
	                    v5_2 = 0;
	                    v6_1 = v7_0;
	                    v10_1 = 0;
	                    v7_1 = v8_0;
	                    v11_1 = 1;
	                    v8_1 = v9_0;
	                    v12_1 = v13_0;
	                    v9_1 = 0;
	                    v13_1 = v14_0;
	                    v14_1 = v15_0;
	                    v15_1 = v16_0;
	                    v16_1 = v17_0;
	                    v17_1 = v18_0;
	                    v18_1 = v19_0;
	                }
	                if (v5_1 == 0) {
	                    v23_1.put("crash", v7_0);
	                }
	            }
	            bdf v4_33 = this.b.get("opt_in_device_id");
	            if ((v5_1 == 0) && ((v4_33 != null) && ((v4_33 instanceof Boolean)))) {
	                v6_0 = ((Boolean) v4_33).booleanValue();
	                v11_0 = 1;
	                try {
	                    v23_1.put("device_id", v6_0);
	                } catch (bdf v4) {
	                    v4_6 = 0;
	                    v5_2 = v6_0;
	                    v6_1 = v7_0;
	                    v10_1 = 1;
	                    v7_1 = v8_0;
	                    v11_1 = v12_0;
	                    v8_1 = v9_0;
	                    v12_1 = v13_0;
	                    v9_1 = 0;
	                    v13_1 = v14_0;
	                    v14_1 = v15_0;
	                    v15_1 = v16_0;
	                    v16_1 = v17_0;
	                    v17_1 = v18_0;
	                    v18_1 = v19_0;
	                }
	            }
	            bdf v10_2;
	            bdf v4_37 = this.b.get("opt_in_opencast");
	            try {
	                if ((v4_37 == null) || (!(v4_37 instanceof Boolean))) {
	                    v4_6 = 0;
	                    v10_2 = 0;
	                } else {
	                    v4_6 = ((Boolean) v4_37).booleanValue();
	                    v10_2 = 1;
	                    v23_1.put("opencast", v4_6);
	                }
	            } catch (int v5) {
	                v5_2 = v6_0;
	                v6_1 = v7_0;
	                v7_1 = v8_0;
	                v8_1 = v9_0;
	                v9_1 = v10_2;
	                v10_1 = v11_0;
	                v11_1 = v12_0;
	                v12_1 = v13_0;
	                v13_1 = v14_0;
	                v14_1 = v15_0;
	                v15_1 = v16_0;
	                v16_1 = v17_0;
	                v17_1 = v18_0;
	                v18_1 = v19_0;
	            }
	            if ((v5_1 != 0) && (v21_1.length() > 0)) {
	                v22_1.put("settings", v21_1);
	            }
	            if (v23_1.length() > 0) {
	                v22_1.put("opt_in", v23_1);
	            }
	            v5_2 = v6_0;
	            v6_1 = v7_0;
	            v7_1 = v8_0;
	            v8_1 = v9_0;
	            v9_1 = v10_2;
	            v10_1 = v11_0;
	            v11_1 = v12_0;
	            v12_1 = v13_0;
	            v13_1 = v14_0;
	            v14_1 = v15_0;
	            v15_1 = v16_0;
	            v16_1 = v17_0;
	            v17_1 = v18_0;
	            v18_1 = v19_0;
	        }
	        try {
	        } catch (bdf v4) {
	            v4_6 = 0;
	            v5_2 = v6_0;
	            v6_1 = v7_0;
	            v10_1 = v11_0;
	            v7_1 = v8_0;
	            v11_1 = v12_0;
	            v8_1 = v9_0;
	            v12_1 = v13_0;
	            v9_1 = 0;
	            v13_1 = v14_0;
	            v14_1 = v15_0;
	            v15_1 = v16_0;
	            v16_1 = v17_0;
	            v17_1 = v18_0;
	            v18_1 = v19_0;
	        }
	    }
	
