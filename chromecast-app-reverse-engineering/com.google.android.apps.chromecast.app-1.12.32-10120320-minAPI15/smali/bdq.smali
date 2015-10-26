.class public final Lbdq;
.super Lbfp;
.source "PG"


# instance fields
.field public final a:Lbdf;

.field b:Ljava/lang/String;

.field private final j:I

.field private final k:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 59
    iput p2, p0, Lbdq;->j:I

    .line 60
    iput p3, p0, Lbdq;->k:I

    .line 61
    new-instance v0, Lbdf;

    invoke-direct {v0}, Lbdf;-><init>()V

    iput-object v0, p0, Lbdq;->a:Lbdf;

    .line 62
    return-void
.end method

.method private a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 395
    if-nez p1, :cond_0

    .line 396
    iget-object v0, p0, Lbdq;->a:Lbdf;

    .line 16640
    iput-object v1, v0, Lbdf;->I:Lbdb;

    .line 407
    :goto_0
    return-void

    .line 401
    :cond_0
    if-eqz p2, :cond_2

    const-string v2, "timezone"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 402
    :goto_1
    if-eqz v2, :cond_1

    .line 403
    const-string v3, "display_string"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 404
    const-string v3, "offset"

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 406
    :cond_1
    iget-object v2, p0, Lbdq;->a:Lbdf;

    new-instance v3, Lbdb;

    invoke-direct {v3, p1, v1, v0}, Lbdb;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 17640
    iput-object v3, v2, Lbdf;->I:Lbdb;

    goto :goto_0

    :cond_2
    move-object v2, v1

    .line 401
    goto :goto_1
.end method

.method private a(Lorg/json/JSONObject;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 425
    const-string v0, "multizone"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 426
    if-nez v0, :cond_1

    .line 444
    :cond_0
    :goto_0
    return-void

    .line 429
    :cond_1
    iget-object v1, p0, Lbdq;->a:Lbdf;

    const-string v2, "audio_output_delay"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    .line 18720
    iput v2, v1, Lbdf;->S:I

    .line 431
    const-string v1, "groups"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 433
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 434
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    new-array v2, v0, [Lbcx;

    .line 435
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 436
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 437
    const-string v4, "uuid"

    invoke-virtual {v3, v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 438
    const-string v5, "name"

    invoke-virtual {v3, v5, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 439
    const-string v6, "leader"

    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 440
    new-instance v6, Lbcx;

    invoke-direct {v6, v4, v5, v3}, Lbcx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v6, v2, v0

    .line 435
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 442
    :cond_2
    iget-object v0, p0, Lbdq;->a:Lbdf;

    .line 18728
    iput-object v2, v0, Lbdf;->T:[Lbcx;

    goto :goto_0
.end method

.method private b(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 410
    if-nez p1, :cond_0

    .line 411
    iget-object v1, p0, Lbdq;->a:Lbdf;

    .line 17656
    iput-object v0, v1, Lbdf;->K:Lbcz;

    .line 422
    :goto_0
    return-void

    .line 415
    :cond_0
    if-eqz p2, :cond_1

    .line 416
    const-string v1, "locale"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 417
    if-eqz v1, :cond_1

    .line 418
    const-string v2, "display_string"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 421
    :cond_1
    iget-object v1, p0, Lbdq;->a:Lbdf;

    new-instance v2, Lbcz;

    invoke-direct {v2, p1, v0}, Lbcz;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18656
    iput-object v2, v1, Lbdf;->K:Lbcz;

    goto :goto_0
.end method

.method private b(Lorg/json/JSONObject;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v7, 0x0

    .line 447
    const-string v1, "sign"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 448
    if-nez v1, :cond_1

    .line 469
    :cond_0
    :goto_0
    return-void

    .line 451
    :cond_1
    const-string v2, "certificate"

    invoke-virtual {v1, v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 452
    const-string v3, "nonce"

    invoke-virtual {v1, v3, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 453
    const-string v4, "signed_data"

    invoke-virtual {v1, v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 454
    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    .line 457
    const-string v5, "intermediate_certs"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 459
    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-static {v4, v0}, Landroid/util/Base64;->decode([BI)[B

    move-result-object v4

    .line 460
    iget-object v5, p0, Lbdq;->a:Lbdf;

    new-instance v6, Lbcv;

    invoke-direct {v6, v2, v3, v4}, Lbcv;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    .line 18736
    iput-object v6, v5, Lbdf;->U:Lbcv;

    .line 462
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 463
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    .line 464
    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 465
    invoke-virtual {v1, v0, v7}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 464
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 467
    :cond_2
    iget-object v0, p0, Lbdq;->a:Lbdf;

    .line 18747
    iput-object v2, v0, Lbdf;->V:[Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 11

    .prologue
    const/4 v10, 0x7

    const/4 v1, -0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v2, 0x0

    .line 82
    .line 1153
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1155
    iget v0, p0, Lbdq;->k:I

    if-eqz v0, :cond_0

    iget v0, p0, Lbdq;->k:I

    if-lt v0, v10, :cond_d

    .line 1158
    :cond_0
    const-string v0, "version"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1159
    iget v0, p0, Lbdq;->j:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 1160
    const-string v0, "name"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1162
    :cond_1
    iget v0, p0, Lbdq;->j:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    .line 1163
    const-string v0, "build_info"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1165
    :cond_2
    iget v0, p0, Lbdq;->j:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    .line 1166
    const-string v0, "device_info"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1168
    :cond_3
    iget v0, p0, Lbdq;->j:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_4

    .line 1169
    const-string v0, "ota_status"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1171
    :cond_4
    iget v0, p0, Lbdq;->j:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_5

    .line 1172
    const-string v0, "net"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1174
    :cond_5
    iget v0, p0, Lbdq;->j:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_6

    .line 1175
    const-string v0, "wifi"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1177
    :cond_6
    iget v0, p0, Lbdq;->j:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    .line 1178
    const-string v0, "setup"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1180
    :cond_7
    iget v0, p0, Lbdq;->j:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    .line 1181
    const-string v0, "settings"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1183
    :cond_8
    iget v0, p0, Lbdq;->j:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    .line 1184
    const-string v0, "opt_in"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1186
    :cond_9
    iget v0, p0, Lbdq;->j:I

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    .line 1187
    const-string v0, "opencast"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1189
    :cond_a
    iget v0, p0, Lbdq;->j:I

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    .line 1190
    const-string v0, "multizone"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1192
    :cond_b
    iget v0, p0, Lbdq;->j:I

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    .line 1193
    const-string v0, "sign"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1195
    :cond_c
    iget v0, p0, Lbdq;->j:I

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    .line 1196
    const-string v0, "detail"

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1206
    :cond_d
    new-instance v6, Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1209
    iget v0, p0, Lbdq;->k:I

    if-eqz v0, :cond_e

    iget v0, p0, Lbdq;->k:I

    if-ge v0, v10, :cond_11

    .line 1211
    :cond_e
    iget v0, p0, Lbdq;->j:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_f

    iget v0, p0, Lbdq;->j:I

    and-int/lit16 v0, v0, 0x2000

    if-nez v0, :cond_f

    iget v0, p0, Lbdq;->j:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_10

    .line 1213
    :cond_f
    const-string v0, "detail"

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1215
    :cond_10
    iget v0, p0, Lbdq;->j:I

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_11

    .line 1216
    const-string v0, "sign"

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1133
    :cond_11
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1134
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    .line 1135
    const-string v8, "params="

    const-string v0, ","

    invoke-static {v0, v5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    if-eqz v9, :cond_15

    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1137
    :cond_12
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_14

    .line 1138
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    .line 1139
    const-string v0, "&"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1141
    :cond_13
    const-string v5, "options="

    const-string v0, ","

    invoke-static {v0, v6}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1146
    :cond_14
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 84
    iget-object v0, p0, Lbdq;->b:Ljava/lang/String;

    if-eqz v0, :cond_2e

    .line 85
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 86
    const-string v4, "Accept-Language"

    iget-object v6, p0, Lbdq;->b:Ljava/lang/String;

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    :goto_2
    :try_start_0
    const-string v4, "eureka_info"

    sget v6, Lbdq;->c:I

    .line 92
    invoke-virtual {p0, v4, v5, v0, v6}, Lbdq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)Lbfq;

    move-result-object v0

    .line 93
    invoke-interface {v0}, Lbfq;->b()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v4

    const/16 v5, 0xc8

    if-eq v4, v5, :cond_17

    .line 94
    const/4 v0, -0x1

    .line 125
    :goto_3
    return v0

    .line 1135
    :cond_15
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v8}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 1141
    :cond_16
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 96
    :cond_17
    :try_start_1
    invoke-interface {v0}, Lbfq;->c()Lbfc;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 104
    if-eqz v0, :cond_18

    const-string v4, "application/json"

    .line 2092
    iget-object v5, v0, Lbfc;->b:Ljava/lang/String;

    .line 104
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    :cond_18
    move v0, v1

    .line 105
    goto :goto_3

    .line 98
    :catch_0
    move-exception v0

    const/4 v0, -0x1

    goto :goto_3

    .line 100
    :catch_1
    move-exception v0

    const/4 v0, -0x2

    goto :goto_3

    .line 107
    :cond_19
    invoke-virtual {v0}, Lbfc;->a()Ljava/lang/String;

    move-result-object v0

    .line 108
    if-nez v0, :cond_1a

    move v0, v1

    .line 109
    goto :goto_3

    .line 113
    :cond_1a
    :try_start_2
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 115
    const-string v0, "version"

    const/4 v5, 0x0

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 116
    iget-object v5, p0, Lbdq;->a:Lbdf;

    .line 2235
    iput v0, v5, Lbdf;->a:I

    .line 117
    iget-object v5, p0, Lbdq;->a:Lbdf;

    const-string v6, "name"

    const/4 v7, 0x0

    invoke-virtual {v4, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 2247
    iput-object v6, v5, Lbdf;->b:Ljava/lang/String;

    .line 118
    if-ge v0, v10, :cond_22

    .line 3223
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "ssdp_udn"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 3366
    iput-object v5, v0, Lbdf;->n:Ljava/lang/String;

    .line 3225
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "build_version"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 4262
    iput-object v5, v0, Lbdf;->c:Ljava/lang/String;

    .line 3226
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "build_version"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 4270
    iput-object v5, v0, Lbdf;->d:Ljava/lang/String;

    .line 3227
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "uptime"

    const-wide/16 v6, 0x0

    invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v6

    const-wide v8, 0x408f400000000000L    # 1000.0

    mul-double/2addr v6, v8

    double-to-long v6, v6

    .line 4358
    iput-wide v6, v0, Lbdf;->m:J

    .line 3228
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "has_update"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 4411
    iput-boolean v5, v0, Lbdf;->s:Z

    .line 3229
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "ip_address"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 4423
    iput-object v5, v0, Lbdf;->u:Ljava/lang/String;

    .line 3230
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "mac_address"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 5378
    iput-object v5, v0, Lbdf;->p:Ljava/lang/String;

    .line 3231
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "connected"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 5431
    iput-boolean v5, v0, Lbdf;->v:Z

    .line 3232
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "ethernet_connected"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 5439
    iput-boolean v5, v0, Lbdf;->w:Z

    .line 3233
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "tos_accepted"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 5503
    iput-boolean v5, v0, Lbdf;->E:Z

    .line 3234
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "bssid"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 6447
    iput-object v5, v0, Lbdf;->x:Ljava/lang/String;

    .line 3235
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "ssid"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 6455
    iput-object v5, v0, Lbdf;->y:Ljava/lang/String;

    .line 3236
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "hotspot_bssid"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lbdf;->a(Ljava/lang/String;)V

    .line 3237
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "wpa_state"

    sget-object v6, Lbdl;->a:Lbdl;

    iget v6, v6, Lbdl;->b:I

    .line 3238
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v5}, Lbdl;->a(I)Lbdl;

    move-result-object v5

    .line 6463
    iput-object v5, v0, Lbdf;->z:Lbdl;

    .line 3239
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "setup_state"

    sget-object v6, Lbdj;->a:Lbdj;

    iget v6, v6, Lbdj;->r:I

    .line 3240
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v5}, Lbdj;->a(I)Lbdj;

    move-result-object v5

    .line 6623
    iput-object v5, v0, Lbdf;->G:Lbdj;

    .line 3241
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "wpa_configured"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 7471
    iput-boolean v5, v0, Lbdf;->A:Z

    .line 3242
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "wpa_id"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 7479
    iput v5, v0, Lbdf;->B:I

    .line 3243
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "signal_level"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 7487
    iput v5, v0, Lbdf;->C:I

    .line 3244
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "noise_level"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 7495
    iput v5, v0, Lbdf;->D:I

    .line 3245
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "public_key"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 8399
    iput-object v5, v0, Lbdf;->r:Ljava/lang/String;

    .line 3246
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "time_format"

    sget-object v6, Lbdk;->a:Lbdk;

    iget v6, v6, Lbdk;->c:I

    .line 3247
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v5}, Lbdk;->a(I)Lbdk;

    move-result-object v5

    .line 8648
    iput-object v5, v0, Lbdf;->J:Lbdk;

    .line 3248
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "opencast_pin_code"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 8712
    iput-object v5, v0, Lbdf;->R:Ljava/lang/String;

    .line 3250
    const-string v0, "detail"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 3251
    const-string v5, "locale"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 3252
    const-string v6, "timezone"

    const/4 v7, 0x0

    invoke-virtual {v4, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 3253
    invoke-direct {p0, v6, v0}, Lbdq;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 3254
    invoke-direct {p0, v5, v0}, Lbdq;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 3256
    if-eqz v0, :cond_1b

    .line 3257
    const-string v5, "model_name"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1b

    .line 3258
    iget-object v5, p0, Lbdq;->a:Lbdf;

    const-string v6, "model_name"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9310
    iput-object v0, v5, Lbdf;->g:Ljava/lang/String;

    .line 3262
    :cond_1b
    const-string v0, "location"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 3263
    const-string v0, "location"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 3264
    const-string v5, "country_code"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3265
    iget-object v5, p0, Lbdq;->a:Lbdf;

    .line 9664
    iput-object v0, v5, Lbdf;->L:Ljava/lang/String;

    .line 3268
    :cond_1c
    invoke-direct {p0, v4}, Lbdq;->b(Lorg/json/JSONObject;)V

    .line 3270
    const-string v0, "opt_in"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 3271
    const-string v0, "opt_in"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 3272
    iget-object v6, p0, Lbdq;->a:Lbdf;

    const-string v0, "stats"

    const/4 v7, 0x0

    invoke-virtual {v5, v0, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1d

    const-string v0, "crash"

    const/4 v7, 0x0

    .line 3273
    invoke-virtual {v5, v0, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_20

    :cond_1d
    move v0, v3

    .line 9688
    :goto_4
    iput-boolean v0, v6, Lbdf;->O:Z

    .line 3274
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v3, "device_id"

    const/4 v6, 0x0

    invoke-virtual {v5, v3, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 9704
    iput-boolean v3, v0, Lbdf;->Q:Z

    .line 3275
    const-string v0, "opencast"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 3276
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v3, "opencast"

    const/4 v6, 0x0

    invoke-virtual {v5, v3, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 10696
    iput-object v3, v0, Lbdf;->P:Ljava/lang/Boolean;

    .line 3282
    :cond_1e
    :goto_5
    const-string v0, "setup_stats"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 3283
    const-string v0, "setup_stats"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 3284
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v4, "num_initial_eureka_info"

    .line 3285
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    .line 12632
    iput v0, v3, Lbdf;->H:I

    :cond_1f
    :goto_6
    move v0, v2

    .line 123
    goto/16 :goto_3

    :cond_20
    move v0, v2

    .line 3273
    goto :goto_4

    .line 3278
    :cond_21
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const/4 v3, 0x0

    .line 11696
    iput-object v3, v0, Lbdf;->P:Ljava/lang/Boolean;

    goto :goto_5

    .line 125
    :catch_2
    move-exception v0

    move v0, v1

    goto/16 :goto_3

    .line 13290
    :cond_22
    const-string v0, "build_info"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 13291
    if-eqz v0, :cond_23

    .line 13292
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "cast_build_revision"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14262
    iput-object v5, v3, Lbdf;->c:Ljava/lang/String;

    .line 13293
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "system_build_number"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14270
    iput-object v5, v3, Lbdf;->d:Ljava/lang/String;

    .line 13294
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "release_track"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 14294
    iput-object v0, v3, Lbdf;->e:Ljava/lang/String;

    .line 13297
    :cond_23
    const-string v0, "device_info"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 13298
    if-eqz v0, :cond_25

    .line 13299
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "manufacturer"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14302
    iput-object v5, v3, Lbdf;->f:Ljava/lang/String;

    .line 13300
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "model_name"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14310
    iput-object v5, v3, Lbdf;->g:Ljava/lang/String;

    .line 13301
    const-string v3, "capabilities"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 13302
    if-eqz v3, :cond_24

    .line 13303
    iget-object v5, p0, Lbdq;->a:Lbdf;

    const-string v6, "display_supported"

    const/4 v7, 0x1

    .line 13304
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 14318
    iput-boolean v6, v5, Lbdf;->h:Z

    .line 13305
    iget-object v5, p0, Lbdq;->a:Lbdf;

    const-string v6, "wifi_supported"

    const/4 v7, 0x1

    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 14326
    iput-boolean v6, v5, Lbdf;->i:Z

    .line 13306
    iget-object v5, p0, Lbdq;->a:Lbdf;

    const-string v6, "hotspot_supported"

    const/4 v7, 0x1

    .line 13307
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 14334
    iput-boolean v6, v5, Lbdf;->j:Z

    .line 13308
    iget-object v5, p0, Lbdq;->a:Lbdf;

    const-string v6, "ble_supported"

    const/4 v7, 0x0

    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 14342
    iput-boolean v6, v5, Lbdf;->k:Z

    .line 13309
    iget-object v5, p0, Lbdq;->a:Lbdf;

    const-string v6, "multizone_supported"

    const/4 v7, 0x0

    .line 13310
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 14350
    iput-boolean v3, v5, Lbdf;->l:Z

    .line 13312
    :cond_24
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "uptime"

    const-wide/16 v6, 0x0

    invoke-virtual {v0, v5, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v6

    const-wide v8, 0x408f400000000000L    # 1000.0

    mul-double/2addr v6, v8

    double-to-long v6, v6

    .line 14358
    iput-wide v6, v3, Lbdf;->m:J

    .line 13313
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "ssdp_udn"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14366
    iput-object v5, v3, Lbdf;->n:Ljava/lang/String;

    .line 13314
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "uma_client_id"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14374
    iput-object v5, v3, Lbdf;->o:Ljava/lang/String;

    .line 13315
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "mac_address"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14378
    iput-object v5, v3, Lbdf;->p:Ljava/lang/String;

    .line 13316
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "hotspot_bssid"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lbdf;->a(Ljava/lang/String;)V

    .line 13317
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "public_key"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 14399
    iput-object v0, v3, Lbdf;->r:Ljava/lang/String;

    .line 13320
    :cond_25
    const-string v0, "ota_status"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 13321
    if-eqz v0, :cond_26

    .line 13322
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "ready_to_apply"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 14411
    iput-boolean v5, v3, Lbdf;->s:Z

    .line 13323
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "download_progress"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 14419
    iput v0, v3, Lbdf;->t:I

    .line 13326
    :cond_26
    const-string v0, "net"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 13327
    if-eqz v0, :cond_27

    .line 13328
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "ip_address"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14423
    iput-object v5, v3, Lbdf;->u:Ljava/lang/String;

    .line 13329
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "online"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 14431
    iput-boolean v5, v3, Lbdf;->v:Z

    .line 13330
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "ethernet_connected"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 14439
    iput-boolean v0, v3, Lbdf;->w:Z

    .line 13333
    :cond_27
    const-string v0, "wifi"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 13334
    if-eqz v0, :cond_28

    .line 13335
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "bssid"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14447
    iput-object v5, v3, Lbdf;->x:Ljava/lang/String;

    .line 13336
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "ssid"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14455
    iput-object v5, v3, Lbdf;->y:Ljava/lang/String;

    .line 13337
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "wpa_state"

    sget-object v6, Lbdl;->a:Lbdl;

    iget v6, v6, Lbdl;->b:I

    .line 13338
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v5}, Lbdl;->a(I)Lbdl;

    move-result-object v5

    .line 14463
    iput-object v5, v3, Lbdf;->z:Lbdl;

    .line 13339
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "wpa_configured"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 14471
    iput-boolean v5, v3, Lbdf;->A:Z

    .line 13340
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "wpa_id"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 14479
    iput v5, v3, Lbdf;->B:I

    .line 13341
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "signal_level"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 14487
    iput v5, v3, Lbdf;->C:I

    .line 13342
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "noise_level"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 14495
    iput v0, v3, Lbdf;->D:I

    .line 13345
    :cond_28
    const-string v0, "setup"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 13346
    if-eqz v0, :cond_29

    .line 13347
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "tos_accepted"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 14503
    iput-boolean v5, v3, Lbdf;->E:Z

    .line 13348
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "ssid_suffix"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14514
    iput-object v5, v3, Lbdf;->F:Ljava/lang/String;

    .line 13349
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "setup_state"

    sget-object v6, Lbdj;->a:Lbdj;

    iget v6, v6, Lbdj;->r:I

    .line 13350
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 13349
    invoke-static {v5}, Lbdj;->a(I)Lbdj;

    move-result-object v5

    .line 14623
    iput-object v5, v3, Lbdf;->G:Lbdj;

    .line 13351
    const-string v3, "stats"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_29

    .line 13352
    const-string v3, "stats"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 13353
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "num_initial_eureka_info"

    .line 13354
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    .line 14632
    iput v0, v3, Lbdf;->H:I

    .line 13358
    :cond_29
    const-string v0, "detail"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 13360
    const-string v3, "settings"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 13361
    if-eqz v3, :cond_2a

    .line 13362
    const-string v5, "timezone"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 13363
    invoke-direct {p0, v5, v0}, Lbdq;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 13364
    iget-object v5, p0, Lbdq;->a:Lbdf;

    const-string v6, "time_format"

    sget-object v7, Lbdk;->a:Lbdk;

    iget v7, v7, Lbdk;->c:I

    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-static {v6}, Lbdk;->a(I)Lbdk;

    move-result-object v6

    .line 14648
    iput-object v6, v5, Lbdf;->J:Lbdk;

    .line 13366
    const-string v5, "locale"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 13367
    invoke-direct {p0, v5, v0}, Lbdq;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 13368
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "country_code"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14664
    iput-object v5, v0, Lbdf;->L:Ljava/lang/String;

    .line 13369
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const-string v5, "system_sound_effects"

    const/4 v6, 0x0

    .line 13370
    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 14672
    iput-boolean v3, v0, Lbdf;->M:Z

    .line 13373
    :cond_2a
    const-string v0, "opt_in"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 13374
    if-eqz v0, :cond_2b

    .line 13375
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "audio_hdr"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 14680
    iput-boolean v5, v3, Lbdf;->N:Z

    .line 13376
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "stats"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 14688
    iput-boolean v5, v3, Lbdf;->O:Z

    .line 13377
    const-string v3, "opencast"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2d

    .line 13378
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "opencast"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 14696
    iput-object v0, v3, Lbdf;->P:Ljava/lang/Boolean;

    .line 13384
    :cond_2b
    :goto_7
    const-string v0, "opencast"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 13385
    if-eqz v0, :cond_2c

    .line 13386
    iget-object v3, p0, Lbdq;->a:Lbdf;

    const-string v5, "pin_code"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 15712
    iput-object v0, v3, Lbdf;->R:Ljava/lang/String;

    .line 13389
    :cond_2c
    invoke-direct {p0, v4}, Lbdq;->a(Lorg/json/JSONObject;)V

    .line 13391
    invoke-direct {p0, v4}, Lbdq;->b(Lorg/json/JSONObject;)V

    goto/16 :goto_6

    .line 13380
    :cond_2d
    iget-object v0, p0, Lbdq;->a:Lbdf;

    const/4 v3, 0x0

    .line 15696
    iput-object v3, v0, Lbdf;->P:Ljava/lang/Boolean;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_7

    :cond_2e
    move-object v0, v4

    goto/16 :goto_2
.end method
