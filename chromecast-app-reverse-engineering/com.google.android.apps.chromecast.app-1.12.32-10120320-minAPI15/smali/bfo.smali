.class public final Lbfo;
.super Lbfp;
.source "PG"


# instance fields
.field private final a:Lbdf;

.field private final b:Ljava/util/HashMap;

.field private final j:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbdf;Ljava/util/HashMap;I)V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 88
    iput-object p2, p0, Lbfo;->a:Lbdf;

    .line 89
    iput-object p3, p0, Lbfo;->b:Ljava/util/HashMap;

    .line 90
    iput p4, p0, Lbfo;->j:I

    .line 91
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 26

    .prologue
    .line 95
    new-instance v22, Lorg/json/JSONObject;

    invoke-direct/range {v22 .. v22}, Lorg/json/JSONObject;-><init>()V

    .line 96
    const/16 v19, 0x0

    .line 97
    const/16 v18, 0x0

    .line 98
    const/16 v17, 0x0

    .line 99
    const/16 v16, 0x0

    .line 100
    const/4 v15, 0x0

    .line 101
    const/4 v14, 0x0

    .line 102
    const/4 v13, 0x0

    .line 103
    const/4 v12, 0x0

    .line 104
    const/4 v11, 0x0

    .line 105
    const/16 v20, 0x0

    .line 106
    const/4 v9, 0x0

    .line 107
    const/4 v8, 0x0

    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v6, 0x0

    .line 110
    const/4 v10, 0x0

    .line 111
    move-object/from16 v0, p0

    iget v4, v0, Lbfo;->j:I

    const/4 v5, 0x7

    if-lt v4, v5, :cond_b

    const/4 v4, 0x1

    move v5, v4

    .line 115
    :goto_0
    :try_start_0
    move-object/from16 v0, p0

    iget-object v4, v0, Lbfo;->b:Ljava/util/HashMap;

    const-string v21, "friendly_name"

    move-object/from16 v0, v21

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 118
    if-eqz v5, :cond_c

    new-instance v21, Lorg/json/JSONObject;

    invoke-direct/range {v21 .. v21}, Lorg/json/JSONObject;-><init>()V

    .line 119
    :goto_1
    new-instance v23, Lorg/json/JSONObject;

    invoke-direct/range {v23 .. v23}, Lorg/json/JSONObject;-><init>()V

    .line 121
    if-eqz v4, :cond_0

    instance-of v0, v4, Ljava/lang/String;

    move/from16 v24, v0

    if-eqz v24, :cond_0

    .line 122
    check-cast v4, Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2

    .line 123
    :try_start_1
    const-string v19, "name"

    move-object/from16 v0, v22

    move-object/from16 v1, v19

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_3

    move-object/from16 v19, v4

    .line 125
    :cond_0
    :try_start_2
    move-object/from16 v0, p0

    iget-object v4, v0, Lbfo;->b:Ljava/util/HashMap;

    const-string v24, "timezone"

    move-object/from16 v0, v24

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 126
    if-eqz v4, :cond_1

    instance-of v0, v4, Lbdb;

    move/from16 v24, v0

    if-eqz v24, :cond_1

    .line 127
    check-cast v4, Lbdb;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_4

    .line 128
    :try_start_3
    const-string v18, "timezone"

    .line 1032
    iget-object v0, v4, Lbdb;->a:Ljava/lang/String;

    move-object/from16 v24, v0

    .line 128
    move-object/from16 v0, v21

    move-object/from16 v1, v18

    move-object/from16 v2, v24

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_5

    move-object/from16 v18, v4

    .line 130
    :cond_1
    :try_start_4
    move-object/from16 v0, p0

    iget-object v4, v0, Lbfo;->b:Ljava/util/HashMap;

    const-string v24, "time_format"

    move-object/from16 v0, v24

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 131
    if-eqz v4, :cond_2

    instance-of v0, v4, Lbdk;

    move/from16 v24, v0

    if-eqz v24, :cond_2

    .line 132
    check-cast v4, Lbdk;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_6

    .line 133
    :try_start_5
    const-string v17, "time_format"

    .line 1128
    iget v0, v4, Lbdk;->c:I

    move/from16 v24, v0

    .line 133
    move-object/from16 v0, v21

    move-object/from16 v1, v17

    move/from16 v2, v24

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_7

    move-object/from16 v17, v4

    .line 135
    :cond_2
    :try_start_6
    move-object/from16 v0, p0

    iget-object v4, v0, Lbfo;->b:Ljava/util/HashMap;

    const-string v24, "locale"

    move-object/from16 v0, v24

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 136
    if-eqz v4, :cond_3

    instance-of v0, v4, Lbcz;

    move/from16 v24, v0

    if-eqz v24, :cond_3

    .line 137
    check-cast v4, Lbcz;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_8

    .line 138
    :try_start_7
    const-string v16, "locale"

    .line 2028
    iget-object v0, v4, Lbcz;->a:Ljava/lang/String;

    move-object/from16 v24, v0

    .line 138
    move-object/from16 v0, v21

    move-object/from16 v1, v16

    move-object/from16 v2, v24

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_9

    move-object/from16 v16, v4

    .line 140
    :cond_3
    :try_start_8
    move-object/from16 v0, p0

    iget-object v4, v0, Lbfo;->b:Ljava/util/HashMap;

    const-string v24, "country_code"

    move-object/from16 v0, v24

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 141
    if-eqz v4, :cond_4

    instance-of v0, v4, Ljava/lang/String;

    move/from16 v24, v0

    if-eqz v24, :cond_4

    .line 142
    check-cast v4, Ljava/lang/String;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_a

    .line 143
    if-eqz v5, :cond_d

    .line 145
    :try_start_9
    const-string v15, "country_code"

    move-object/from16 v0, v21

    invoke-virtual {v0, v15, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_b

    move-object v15, v4

    .line 153
    :cond_4
    :goto_2
    :try_start_a
    move-object/from16 v0, p0

    iget-object v4, v0, Lbfo;->b:Ljava/util/HashMap;

    const-string v24, "system_sound_effects"

    move-object/from16 v0, v24

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 154
    if-eqz v4, :cond_5

    instance-of v0, v4, Ljava/lang/Boolean;

    move/from16 v24, v0

    if-eqz v24, :cond_5

    .line 155
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_c

    move-result v9

    .line 156
    const/4 v14, 0x1

    .line 157
    :try_start_b
    const-string v4, "system_sound_effects"

    move-object/from16 v0, v21

    invoke-virtual {v0, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_d

    .line 159
    :cond_5
    :try_start_c
    move-object/from16 v0, p0

    iget-object v4, v0, Lbfo;->b:Ljava/util/HashMap;

    const-string v24, "opt_in_audio_hdr"

    move-object/from16 v0, v24

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 160
    if-eqz v4, :cond_6

    instance-of v0, v4, Ljava/lang/Boolean;

    move/from16 v24, v0

    if-eqz v24, :cond_6

    .line 161
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_c

    move-result v8

    .line 162
    const/4 v13, 0x1

    .line 163
    :try_start_d
    const-string v4, "audio_hdr"

    move-object/from16 v0, v23

    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_e

    .line 165
    :cond_6
    :try_start_e
    move-object/from16 v0, p0

    iget-object v4, v0, Lbfo;->b:Ljava/util/HashMap;

    const-string v24, "opt_in_stats"

    move-object/from16 v0, v24

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 166
    if-eqz v4, :cond_7

    instance-of v0, v4, Ljava/lang/Boolean;

    move/from16 v24, v0

    if-eqz v24, :cond_7

    .line 167
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_e
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_c

    move-result v7

    .line 168
    const/4 v12, 0x1

    .line 169
    :try_start_f
    const-string v4, "stats"

    move-object/from16 v0, v23

    invoke-virtual {v0, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 171
    if-nez v5, :cond_7

    .line 172
    const-string v4, "crash"

    move-object/from16 v0, v23

    invoke-virtual {v0, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_f

    .line 176
    :cond_7
    :try_start_10
    move-object/from16 v0, p0

    iget-object v4, v0, Lbfo;->b:Ljava/util/HashMap;

    const-string v24, "opt_in_device_id"

    move-object/from16 v0, v24

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 177
    if-nez v5, :cond_8

    if-eqz v4, :cond_8

    instance-of v0, v4, Ljava/lang/Boolean;

    move/from16 v24, v0

    if-eqz v24, :cond_8

    .line 178
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_c

    move-result v6

    .line 179
    const/4 v11, 0x1

    .line 180
    :try_start_11
    const-string v4, "device_id"

    move-object/from16 v0, v23

    invoke-virtual {v0, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_11
    .catch Lorg/json/JSONException; {:try_start_11 .. :try_end_11} :catch_10

    .line 182
    :cond_8
    :try_start_12
    move-object/from16 v0, p0

    iget-object v4, v0, Lbfo;->b:Ljava/util/HashMap;

    const-string v24, "opt_in_opencast"

    move-object/from16 v0, v24

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 183
    if-eqz v4, :cond_1a

    instance-of v0, v4, Ljava/lang/Boolean;

    move/from16 v24, v0

    if-eqz v24, :cond_1a

    .line 184
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_12
    .catch Lorg/json/JSONException; {:try_start_12 .. :try_end_12} :catch_c

    move-result v4

    .line 185
    const/4 v10, 0x1

    .line 186
    :try_start_13
    const-string v20, "opencast"

    move-object/from16 v0, v23

    move-object/from16 v1, v20

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 189
    :goto_3
    if-eqz v5, :cond_9

    invoke-virtual/range {v21 .. v21}, Lorg/json/JSONObject;->length()I

    move-result v5

    if-lez v5, :cond_9

    .line 190
    const-string v5, "settings"

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 192
    :cond_9
    invoke-virtual/range {v23 .. v23}, Lorg/json/JSONObject;->length()I

    move-result v5

    if-lez v5, :cond_a

    .line 193
    const-string v5, "opt_in"

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_13
    .catch Lorg/json/JSONException; {:try_start_13 .. :try_end_13} :catch_11

    :cond_a
    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move v11, v12

    move v12, v13

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    .line 197
    :goto_4
    invoke-virtual/range {v22 .. v22}, Lorg/json/JSONObject;->length()I

    move-result v19

    if-nez v19, :cond_e

    .line 198
    const/4 v4, 0x0

    .line 251
    :goto_5
    return v4

    .line 111
    :cond_b
    const/4 v4, 0x0

    move v5, v4

    goto/16 :goto_0

    :cond_c
    move-object/from16 v21, v22

    .line 118
    goto/16 :goto_1

    .line 148
    :cond_d
    :try_start_14
    new-instance v15, Lorg/json/JSONObject;

    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    .line 149
    const-string v24, "country_code"

    move-object/from16 v0, v24

    invoke-virtual {v15, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 150
    const-string v24, "location"

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_14
    .catch Lorg/json/JSONException; {:try_start_14 .. :try_end_14} :catch_b

    move-object v15, v4

    goto/16 :goto_2

    .line 202
    :cond_e
    :try_start_15
    const-string v19, "set_eureka_info"

    .line 203
    invoke-static/range {v22 .. v22}, Lbfc;->a(Lorg/json/JSONObject;)Lbfc;

    move-result-object v20

    sget v21, Lbfo;->c:I

    .line 202
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    move/from16 v3, v21

    invoke-virtual {v0, v1, v2, v3}, Lbfo;->a(Ljava/lang/String;Lbfc;I)Lbfq;

    move-result-object v19

    .line 204
    invoke-interface/range {v19 .. v19}, Lbfq;->b()I
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_15 .. :try_end_15} :catch_1

    move-result v19

    const/16 v20, 0xc8

    move/from16 v0, v19

    move/from16 v1, v20

    if-eq v0, v1, :cond_f

    .line 205
    const/4 v4, -0x1

    goto :goto_5

    .line 208
    :catch_0
    move-exception v4

    const/4 v4, -0x1

    goto :goto_5

    .line 210
    :catch_1
    move-exception v4

    const/4 v4, -0x2

    goto :goto_5

    .line 214
    :cond_f
    move-object/from16 v0, p0

    iget-object v0, v0, Lbfo;->a:Lbdf;

    move-object/from16 v19, v0

    if-eqz v19, :cond_19

    .line 215
    if-eqz v18, :cond_10

    .line 216
    move-object/from16 v0, p0

    iget-object v0, v0, Lbfo;->a:Lbdf;

    move-object/from16 v19, v0

    .line 2247
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    iput-object v0, v1, Lbdf;->b:Ljava/lang/String;

    .line 218
    :cond_10
    if-eqz v17, :cond_11

    .line 219
    move-object/from16 v0, p0

    iget-object v0, v0, Lbfo;->a:Lbdf;

    move-object/from16 v18, v0

    .line 2640
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    iput-object v0, v1, Lbdf;->I:Lbdb;

    .line 221
    :cond_11
    if-eqz v16, :cond_12

    .line 222
    move-object/from16 v0, p0

    iget-object v0, v0, Lbfo;->a:Lbdf;

    move-object/from16 v17, v0

    .line 2648
    move-object/from16 v0, v16

    move-object/from16 v1, v17

    iput-object v0, v1, Lbdf;->J:Lbdk;

    .line 224
    :cond_12
    if-eqz v15, :cond_13

    .line 225
    move-object/from16 v0, p0

    iget-object v0, v0, Lbfo;->a:Lbdf;

    move-object/from16 v16, v0

    .line 2656
    move-object/from16 v0, v16

    iput-object v15, v0, Lbdf;->K:Lbcz;

    .line 227
    :cond_13
    if-eqz v14, :cond_14

    .line 228
    move-object/from16 v0, p0

    iget-object v15, v0, Lbfo;->a:Lbdf;

    .line 2664
    iput-object v14, v15, Lbdf;->L:Ljava/lang/String;

    .line 230
    :cond_14
    if-eqz v13, :cond_15

    .line 231
    move-object/from16 v0, p0

    iget-object v13, v0, Lbfo;->a:Lbdf;

    .line 2672
    iput-boolean v8, v13, Lbdf;->M:Z

    .line 234
    :cond_15
    if-eqz v12, :cond_16

    .line 235
    move-object/from16 v0, p0

    iget-object v8, v0, Lbfo;->a:Lbdf;

    .line 2680
    iput-boolean v7, v8, Lbdf;->N:Z

    .line 237
    :cond_16
    if-eqz v11, :cond_17

    .line 238
    move-object/from16 v0, p0

    iget-object v7, v0, Lbfo;->a:Lbdf;

    .line 2688
    iput-boolean v6, v7, Lbdf;->O:Z

    .line 240
    :cond_17
    if-eqz v10, :cond_18

    .line 241
    move-object/from16 v0, p0

    iget-object v6, v0, Lbfo;->a:Lbdf;

    .line 2704
    iput-boolean v5, v6, Lbdf;->Q:Z

    .line 243
    :cond_18
    if-eqz v9, :cond_19

    .line 244
    move-object/from16 v0, p0

    iget-object v5, v0, Lbfo;->a:Lbdf;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 3696
    iput-object v6, v5, Lbdf;->P:Ljava/lang/Boolean;

    .line 245
    if-nez v4, :cond_19

    .line 246
    move-object/from16 v0, p0

    iget-object v4, v0, Lbfo;->a:Lbdf;

    const/4 v5, 0x0

    .line 3712
    iput-object v5, v4, Lbdf;->R:Ljava/lang/String;

    .line 251
    :cond_19
    const/4 v4, 0x0

    goto/16 :goto_5

    :catch_2
    move-exception v4

    move v4, v10

    move v5, v6

    move v6, v7

    move v10, v11

    move v7, v8

    move v11, v12

    move v8, v9

    move v12, v13

    move/from16 v9, v20

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto/16 :goto_4

    :catch_3
    move-exception v5

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move/from16 v9, v20

    move/from16 v25, v10

    move v10, v11

    move v11, v12

    move v12, v13

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v4

    move/from16 v4, v25

    goto/16 :goto_4

    :catch_4
    move-exception v4

    move v4, v10

    move v5, v6

    move v6, v7

    move v10, v11

    move v7, v8

    move v11, v12

    move v8, v9

    move v12, v13

    move/from16 v9, v20

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto/16 :goto_4

    :catch_5
    move-exception v5

    move v5, v6

    move-object/from16 v18, v19

    move v6, v7

    move v7, v8

    move v8, v9

    move/from16 v9, v20

    move/from16 v25, v11

    move v11, v12

    move v12, v13

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v4

    move v4, v10

    move/from16 v10, v25

    goto/16 :goto_4

    :catch_6
    move-exception v4

    move v4, v10

    move v5, v6

    move v6, v7

    move v10, v11

    move v7, v8

    move v11, v12

    move v8, v9

    move v12, v13

    move/from16 v9, v20

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto/16 :goto_4

    :catch_7
    move-exception v5

    move v5, v6

    move-object/from16 v17, v18

    move v6, v7

    move-object/from16 v18, v19

    move v7, v8

    move v8, v9

    move/from16 v9, v20

    move/from16 v25, v12

    move v12, v13

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v4

    move v4, v10

    move v10, v11

    move/from16 v11, v25

    goto/16 :goto_4

    :catch_8
    move-exception v4

    move v4, v10

    move v5, v6

    move v6, v7

    move v10, v11

    move v7, v8

    move v11, v12

    move v8, v9

    move v12, v13

    move/from16 v9, v20

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto/16 :goto_4

    :catch_9
    move-exception v5

    move v5, v6

    move-object/from16 v16, v17

    move v6, v7

    move-object/from16 v17, v18

    move v7, v8

    move-object/from16 v18, v19

    move v8, v9

    move/from16 v9, v20

    move/from16 v25, v13

    move v13, v14

    move-object v14, v15

    move-object v15, v4

    move v4, v10

    move v10, v11

    move v11, v12

    move/from16 v12, v25

    goto/16 :goto_4

    :catch_a
    move-exception v4

    move v4, v10

    move v5, v6

    move v6, v7

    move v10, v11

    move v7, v8

    move v11, v12

    move v8, v9

    move v12, v13

    move/from16 v9, v20

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto/16 :goto_4

    :catch_b
    move-exception v5

    move v5, v6

    move-object/from16 v15, v16

    move v6, v7

    move-object/from16 v16, v17

    move v7, v8

    move-object/from16 v17, v18

    move v8, v9

    move-object/from16 v18, v19

    move/from16 v9, v20

    move/from16 v25, v14

    move-object v14, v4

    move v4, v10

    move v10, v11

    move v11, v12

    move v12, v13

    move/from16 v13, v25

    goto/16 :goto_4

    :catch_c
    move-exception v4

    move v4, v10

    move v5, v6

    move v6, v7

    move v10, v11

    move v7, v8

    move v11, v12

    move v8, v9

    move v12, v13

    move/from16 v9, v20

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto/16 :goto_4

    :catch_d
    move-exception v4

    move v4, v10

    move v5, v6

    move v6, v7

    move v10, v11

    move v7, v8

    move v11, v12

    move v8, v9

    move v12, v13

    move/from16 v9, v20

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto/16 :goto_4

    :catch_e
    move-exception v4

    move v4, v10

    move v5, v6

    move v6, v7

    move v10, v11

    move v7, v8

    move v11, v12

    move v8, v9

    move v12, v13

    move/from16 v9, v20

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto/16 :goto_4

    :catch_f
    move-exception v4

    move v4, v10

    move v5, v6

    move v6, v7

    move v10, v11

    move v7, v8

    move v11, v12

    move v8, v9

    move v12, v13

    move/from16 v9, v20

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto/16 :goto_4

    :catch_10
    move-exception v4

    move v4, v10

    move v5, v6

    move v6, v7

    move v10, v11

    move v7, v8

    move v11, v12

    move v8, v9

    move v12, v13

    move/from16 v9, v20

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto/16 :goto_4

    :catch_11
    move-exception v5

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move v11, v12

    move v12, v13

    move v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto/16 :goto_4

    :cond_1a
    move v4, v10

    move/from16 v10, v20

    goto/16 :goto_3
.end method
