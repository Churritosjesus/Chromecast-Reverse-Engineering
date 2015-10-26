.class public final Lbds;
.super Lbfp;
.source "PG"


# instance fields
.field a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 23
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v0, -0x1

    const/4 v1, -0x3

    .line 30
    :try_start_0
    const-string v3, "supported_locales"

    sget v4, Lbds;->c:I

    invoke-virtual {p0, v3, v4}, Lbds;->a(Ljava/lang/String;I)Lbfq;

    move-result-object v3

    .line 31
    invoke-interface {v3}, Lbfq;->b()I

    move-result v4

    const/16 v5, 0xc8

    if-eq v4, v5, :cond_0

    .line 69
    :goto_0
    return v0

    .line 34
    :cond_0
    invoke-interface {v3}, Lbfq;->c()Lbfc;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 42
    if-eqz v0, :cond_1

    const-string v3, "application/json"

    .line 1092
    iget-object v4, v0, Lbfc;->b:Ljava/lang/String;

    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    move v0, v1

    .line 43
    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    const/4 v0, -0x2

    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {v0}, Lbfc;->a()Ljava/lang/String;

    move-result-object v0

    .line 46
    if-nez v0, :cond_3

    move v0, v1

    .line 47
    goto :goto_0

    .line 51
    :cond_3
    :try_start_1
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 53
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 54
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    move v0, v2

    .line 55
    :goto_1
    if-ge v0, v5, :cond_4

    .line 56
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 58
    new-instance v7, Lbcz;

    const-string v8, "locale"

    .line 59
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "display_string"

    .line 60
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v8, v6}, Lbcz;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 65
    :cond_4
    iput-object v4, p0, Lbds;->a:Ljava/util/ArrayList;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move v0, v2

    .line 67
    goto :goto_0

    .line 69
    :catch_1
    move-exception v0

    move v0, v1

    goto :goto_0

    .line 36
    :catch_2
    move-exception v1

    goto :goto_0
.end method
