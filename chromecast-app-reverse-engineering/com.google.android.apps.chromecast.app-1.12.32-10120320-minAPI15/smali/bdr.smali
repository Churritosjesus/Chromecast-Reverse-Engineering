.class public final Lbdr;
.super Lbfp;
.source "PG"


# instance fields
.field a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 28
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 70
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 72
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 73
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v4

    move v0, v1

    .line 74
    :goto_0
    if-ge v0, v4, :cond_0

    .line 75
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 77
    new-instance v6, Lbfs;

    invoke-direct {v6}, Lbfs;-><init>()V

    .line 79
    const-string v7, "ssid"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1126
    iput-object v7, v6, Lbfs;->a:Ljava/lang/String;

    .line 80
    const-string v7, "wpa_auth"

    sget-object v8, Lbfu;->a:Lbfu;

    iget v8, v8, Lbfu;->j:I

    .line 81
    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    .line 80
    invoke-static {v7}, Lbfu;->a(I)Lbfu;

    move-result-object v7

    .line 1134
    iput-object v7, v6, Lbfs;->b:Lbfu;

    .line 82
    const-string v7, "wpa_cipher"

    sget-object v8, Lbfv;->a:Lbfv;

    iget v8, v8, Lbfv;->b:I

    .line 83
    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    .line 82
    invoke-static {v7}, Lbfv;->a(I)Lbfv;

    move-result-object v7

    .line 1142
    iput-object v7, v6, Lbfs;->c:Lbfv;

    .line 84
    const-string v7, "wpa_id"

    invoke-virtual {v5, v7, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    .line 1150
    iput v7, v6, Lbfs;->d:I

    .line 85
    const-string v7, "bssid"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1191
    iput-object v7, v6, Lbfs;->i:Ljava/lang/String;

    .line 86
    const-string v7, "signal_level"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 2183
    iput v5, v6, Lbfs;->h:I

    .line 88
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 90
    :cond_0
    return-object v3
.end method


# virtual methods
.method public final a()I
    .locals 5

    .prologue
    const/4 v0, -0x1

    const/4 v1, -0x3

    .line 35
    :try_start_0
    const-string v2, "scan_results"

    sget v3, Lbdr;->c:I

    invoke-virtual {p0, v2, v3}, Lbdr;->a(Ljava/lang/String;I)Lbfq;

    move-result-object v2

    .line 36
    invoke-interface {v2}, Lbfq;->b()I

    move-result v3

    const/16 v4, 0xc8

    if-eq v3, v4, :cond_0

    .line 60
    :goto_0
    return v0

    .line 39
    :cond_0
    invoke-interface {v2}, Lbfq;->c()Lbfc;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 47
    if-eqz v0, :cond_1

    const-string v2, "application/json"

    .line 1092
    iget-object v3, v0, Lbfc;->b:Ljava/lang/String;

    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    move v0, v1

    .line 48
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    const/4 v0, -0x2

    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v0}, Lbfc;->a()Ljava/lang/String;

    move-result-object v0

    .line 51
    if-nez v0, :cond_3

    move v0, v1

    .line 52
    goto :goto_0

    .line 56
    :cond_3
    :try_start_1
    invoke-static {v0}, Lbdr;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 57
    iput-object v0, p0, Lbdr;->a:Ljava/util/ArrayList;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 58
    const/4 v0, 0x0

    goto :goto_0

    .line 60
    :catch_1
    move-exception v0

    move v0, v1

    goto :goto_0

    .line 41
    :catch_2
    move-exception v1

    goto :goto_0
.end method
