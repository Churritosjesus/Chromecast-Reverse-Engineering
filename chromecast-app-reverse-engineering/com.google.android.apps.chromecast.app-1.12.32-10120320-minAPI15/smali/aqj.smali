.class public final Laqj;
.super Lapk;
.source "PG"

# interfaces
.implements Lbtd;
.implements Lbwn;


# static fields
.field static c:Ljava/lang/String;

.field private static final d:Lblp;

.field private static h:Ljava/lang/String;


# instance fields
.field public final b:Laow;

.field private final e:Landroid/content/Context;

.field private final f:Latf;

.field private final g:Lbtl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 52
    new-instance v0, Lblp;

    const-string v1, "BackdropCastConnection"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    sput-object v0, Laqj;->d:Lblp;

    return-void
.end method

.method public constructor <init>(Laow;Landroid/content/Context;Latf;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 83
    .line 1469
    iget-object v0, p1, Laow;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 83
    invoke-direct {p0, v0, p2}, Lapk;-><init>(Lcom/google/android/gms/cast/CastDevice;Landroid/content/Context;)V

    .line 63
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "requestId"

    const-string v2, "0"

    .line 64
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "type"

    const-string v2, "GET_STATUS"

    .line 65
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Laqj;->h:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :goto_0
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "requestId"

    const-string v2, "0"

    .line 73
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "type"

    const-string v2, "SETTINGS_UPDATED"

    .line 74
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Laqj;->c:Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 84
    :goto_1
    iput-object p1, p0, Laqj;->b:Laow;

    .line 85
    iput-object p2, p0, Laqj;->e:Landroid/content/Context;

    .line 86
    iput-object p3, p0, Laqj;->f:Latf;

    .line 87
    invoke-static {}, Laqi;->a()Laqi;

    .line 89
    new-instance v0, Lbtl;

    invoke-direct {v0}, Lbtl;-><init>()V

    iput-object v0, p0, Laqj;->g:Lbtl;

    .line 90
    return-void

    .line 67
    :catch_0
    move-exception v0

    .line 68
    sget-object v1, Laqj;->d:Lblp;

    const-string v2, "Could not create JSON status request message: %s"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 76
    :catch_1
    move-exception v0

    .line 77
    sget-object v1, Laqj;->d:Lblp;

    const-string v2, "Could not create JSON refresh message: %s"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method static synthetic a(Laqj;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Laqj;->j()V

    return-void
.end method

.method static synthetic b(Laqj;)Laow;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Laqj;->b:Laow;

    return-object v0
.end method

.method static synthetic c(Laqj;)Lbtl;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Laqj;->g:Lbtl;

    return-object v0
.end method

.method static synthetic d(Laqj;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Laqj;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic h()Lblp;
    .locals 1

    .prologue
    .line 47
    sget-object v0, Laqj;->d:Lblp;

    return-object v0
.end method

.method private i()V
    .locals 5

    .prologue
    .line 185
    invoke-virtual {p0}, Laqj;->a()Lcom/google/android/gms/cast/ApplicationMetadata;

    move-result-object v2

    .line 186
    if-nez v2, :cond_1

    const-string v0, ""

    move-object v1, v0

    .line 187
    :goto_0
    if-nez v2, :cond_2

    const-string v0, ""

    .line 188
    :goto_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Laqj;->b:Laow;

    .line 7597
    iget-object v2, v2, Laow;->c:Lbdf;

    .line 8314
    iget-boolean v2, v2, Lbdf;->h:Z

    .line 188
    if-eqz v2, :cond_3

    .line 203
    :cond_0
    :goto_2
    return-void

    .line 6000
    :cond_1
    iget-object v0, v2, Lcom/google/android/gms/cast/ApplicationMetadata;->b:Ljava/lang/String;

    move-object v1, v0

    goto :goto_0

    .line 7000
    :cond_2
    iget-object v0, v2, Lcom/google/android/gms/cast/ApplicationMetadata;->c:Ljava/lang/String;

    goto :goto_1

    .line 194
    :cond_3
    iget-object v2, p0, Laqj;->b:Laow;

    .line 8398
    iget-object v2, v2, Laow;->o:Ljava/lang/String;

    .line 194
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 199
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v3, 0x2

    iget-object v4, p0, Laqj;->b:Laow;

    invoke-virtual {v4}, Laow;->g()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 200
    invoke-static {}, Laqi;->a()Laqi;

    .line 202
    iget-object v2, p0, Laqj;->b:Laow;

    invoke-virtual {v2, v1, v0}, Laow;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2
.end method

.method private j()V
    .locals 3

    .prologue
    .line 252
    const-string v0, "urn:x-cast:com.google.cast.sse"

    invoke-virtual {p0, v0, p0}, Laqj;->a(Ljava/lang/String;Lbtd;)Z

    .line 253
    sget-object v0, Laqj;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 254
    invoke-static {}, Laqi;->a()Laqi;

    .line 256
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Laqj;->b:Laow;

    invoke-virtual {v2}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 257
    const-string v0, "urn:x-cast:com.google.cast.sse"

    sget-object v1, Laqj;->h:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Laqj;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 259
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(D)V
    .locals 1

    .prologue
    .line 347
    new-instance v0, Laqr;

    invoke-direct {v0, p0, p1, p2}, Laqr;-><init>(Laqj;D)V

    invoke-virtual {p0, v0}, Laqj;->a(Ljava/lang/Runnable;)V

    .line 357
    return-void
.end method

.method public final synthetic a(Lbwm;)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 47
    check-cast p1, Lbst;

    .line 11113
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 11114
    invoke-interface {p1}, Lbst;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v0, v4

    iget-object v1, p0, Laqj;->b:Laow;

    invoke-virtual {v1}, Laow;->g()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    .line 11115
    invoke-interface {p1}, Lbst;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 11116
    sget-object v0, Laqj;->d:Lblp;

    const-string v1, "(6) Failed to connect to the backdrop app:  %s"

    new-array v2, v2, [Ljava/lang/Object;

    .line 11117
    invoke-interface {p1}, Lbst;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v3

    .line 12000
    iget-object v3, v3, Lcom/google/android/gms/common/api/Status;->g:Ljava/lang/String;

    .line 11117
    aput-object v3, v2, v4

    .line 11116
    invoke-virtual {v0, v1, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11118
    invoke-static {}, Laqi;->a()Laqi;

    .line 11120
    :goto_0
    return-void

    .line 11122
    :cond_0
    invoke-static {}, Laqi;->a()Laqi;

    .line 11126
    invoke-virtual {p0}, Laqj;->f()V

    goto :goto_0
.end method

.method public final a(Lcom/google/android/gms/cast/ApplicationMetadata;)V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 94
    if-nez p1, :cond_1

    const/4 v0, 0x0

    .line 95
    :goto_0
    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Laqj;->b:Laow;

    .line 96
    invoke-virtual {v2}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    iget-object v2, p0, Laqj;->b:Laow;

    .line 2398
    iget-object v2, v2, Laow;->o:Ljava/lang/String;

    .line 97
    aput-object v2, v1, v4

    aput-object v0, v1, v5

    .line 98
    iget-object v1, p0, Laqj;->b:Laow;

    .line 3398
    iget-object v1, v1, Laow;->o:Ljava/lang/String;

    .line 98
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 99
    if-eqz v0, :cond_2

    .line 100
    invoke-direct {p0}, Laqj;->i()V

    .line 4206
    new-array v1, v5, [Ljava/lang/Object;

    aput-object v0, v1, v3

    iget-object v2, p0, Laqj;->b:Laow;

    invoke-virtual {v2}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    .line 4207
    invoke-super {p0, v0, p0}, Lapk;->a(Ljava/lang/String;Lbwn;)V

    .line 109
    :cond_0
    :goto_1
    return-void

    .line 2000
    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/cast/ApplicationMetadata;->b:Ljava/lang/String;

    goto :goto_0

    .line 105
    :cond_2
    iget-object v0, p0, Laqj;->b:Laow;

    .line 4597
    iget-object v0, v0, Laow;->c:Lbdf;

    .line 5314
    iget-boolean v0, v0, Lbdf;->h:Z

    .line 105
    if-nez v0, :cond_0

    .line 106
    invoke-direct {p0}, Laqj;->i()V

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 131
    new-array v0, v6, [Ljava/lang/Object;

    iget-object v2, p0, Laqj;->b:Laow;

    invoke-virtual {v2}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 132
    iget-object v0, p0, Laqj;->f:Latf;

    if-nez v0, :cond_0

    .line 177
    :goto_0
    return-void

    .line 141
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONTokener;

    invoke-direct {v0, p2}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 142
    const-string v2, "backendData"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 152
    :try_start_1
    new-instance v3, Lorg/json/JSONArray;

    const-string v4, "topicHistory"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 153
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Laqj;->b:Laow;

    invoke-virtual {v5}, Laow;->g()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v4

    const/4 v4, 0x1

    aput-object v3, v0, v4

    .line 156
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 157
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    move v0, v1

    .line 158
    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v0, v5, :cond_1

    .line 159
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 158
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 145
    :catch_0
    move-exception v0

    sget-object v0, Laqj;->d:Lblp;

    const-string v2, "Could not parse the returned data from %s"

    new-array v3, v6, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-virtual {v0, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    invoke-static {}, Laqi;->a()Laqi;

    goto :goto_0

    .line 161
    :cond_1
    :try_start_2
    iget-object v0, p0, Laqj;->b:Laow;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Laow;->a(Ljava/util/List;)V

    .line 162
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Laqj;->b:Laow;

    invoke-virtual {v4}, Laow;->g()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 170
    :cond_2
    :goto_2
    invoke-static {}, Laqi;->a()Laqi;

    .line 172
    iget-object v0, p0, Laqj;->f:Latf;

    iget-object v3, p0, Laqj;->b:Laow;

    invoke-virtual {v0, v2, v3}, Latf;->a(Ljava/lang/String;Laow;)Laui;

    move-result-object v0

    .line 173
    invoke-static {}, Laqi;->a()Laqi;

    .line 175
    iget-object v2, p0, Laqj;->f:Latf;

    invoke-virtual {v2, v0}, Latf;->a(Lads;)V

    .line 176
    new-array v0, v6, [Ljava/lang/Object;

    iget-object v2, p0, Laqj;->b:Laow;

    invoke-virtual {v2}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    goto/16 :goto_0

    .line 165
    :catch_1
    move-exception v0

    sget-object v0, Laqj;->d:Lblp;

    const-string v3, "Could not parse the returned history data from %s for device: %s."

    new-array v4, v7, [Ljava/lang/Object;

    aput-object p1, v4, v1

    iget-object v5, p0, Laqj;->b:Laow;

    .line 166
    invoke-virtual {v5}, Laow;->g()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    .line 165
    invoke-virtual {v0, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 317
    new-instance v0, Laqp;

    invoke-direct {v0, p0, p1}, Laqp;-><init>(Laqj;Z)V

    invoke-virtual {p0, v0}, Laqj;->a(Ljava/lang/Runnable;)V

    .line 341
    return-void
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 361
    new-instance v0, Laqs;

    invoke-direct {v0, p0}, Laqs;-><init>(Laqj;)V

    invoke-virtual {p0, v0}, Laqj;->a(Ljava/lang/Runnable;)V

    .line 374
    return-void
.end method

.method public final f()V
    .locals 4

    .prologue
    .line 220
    invoke-virtual {p0}, Laqj;->a()Lcom/google/android/gms/cast/ApplicationMetadata;

    move-result-object v0

    .line 221
    iget-object v1, p0, Laqj;->b:Laow;

    .line 9398
    iget-object v1, v1, Laow;->o:Ljava/lang/String;

    .line 223
    const-string v2, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 226
    iget-object v0, p0, Laqj;->b:Laow;

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Laow;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Laqk;

    invoke-direct {v1, p0}, Laqk;-><init>(Laqj;)V

    sget-wide v2, Lasr;->a:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 249
    :cond_0
    :goto_0
    return-void

    .line 234
    :cond_1
    const-string v2, "E8C28D3C"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 235
    invoke-direct {p0}, Laqj;->j()V

    goto :goto_0

    .line 236
    :cond_2
    if-eqz v0, :cond_0

    .line 237
    iget-object v1, p0, Laqj;->g:Lbtl;

    invoke-virtual {v1}, Lbtl;->c()Ljava/lang/String;

    move-result-object v1

    .line 10000
    iget-object v2, v0, Lcom/google/android/gms/cast/ApplicationMetadata;->e:Ljava/util/List;

    if-eqz v2, :cond_4

    iget-object v0, v0, Lcom/google/android/gms/cast/ApplicationMetadata;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    .line 237
    :goto_1
    if-eqz v0, :cond_3

    .line 10262
    new-instance v0, Laqm;

    invoke-direct {v0, p0}, Laqm;-><init>(Laqj;)V

    invoke-virtual {p0, v0}, Laqj;->a(Ljava/lang/Runnable;)V

    .line 242
    :cond_3
    new-instance v0, Laql;

    invoke-direct {v0, p0}, Laql;-><init>(Laqj;)V

    invoke-virtual {p0, v0}, Laqj;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 10000
    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final g()V
    .locals 0

    .prologue
    .line 308
    invoke-virtual {p0}, Laqj;->b()V

    .line 309
    return-void
.end method
