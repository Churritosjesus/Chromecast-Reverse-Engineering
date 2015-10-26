.class final Lafd;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/content/SharedPreferences;

.field private final b:Lafe;

.field private c:Lagr;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 47
    .line 48
    invoke-static {}, Lafv;->f()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.facebook.AccessTokenManager.SharedPreferences"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    new-instance v1, Lafe;

    invoke-direct {v1}, Lafe;-><init>()V

    .line 47
    invoke-direct {p0, v0, v1}, Lafd;-><init>(Landroid/content/SharedPreferences;Lafe;)V

    .line 53
    return-void
.end method

.method private constructor <init>(Landroid/content/SharedPreferences;Lafe;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lafd;->a:Landroid/content/SharedPreferences;

    .line 43
    iput-object p2, p0, Lafd;->b:Lafe;

    .line 44
    return-void
.end method

.method private c()Lafb;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 98
    iget-object v1, p0, Lafd;->a:Landroid/content/SharedPreferences;

    const-string v2, "com.facebook.AccessTokenManager.CachedAccessToken"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 99
    if-eqz v1, :cond_0

    .line 101
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 102
    invoke-static {v2}, Lafb;->a(Lorg/json/JSONObject;)Lafb;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 107
    :cond_0
    :goto_0
    return-object v0

    .line 104
    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public final a()Lafb;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 56
    .line 1094
    iget-object v1, p0, Lafd;->a:Landroid/content/SharedPreferences;

    const-string v2, "com.facebook.AccessTokenManager.CachedAccessToken"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 60
    invoke-direct {p0}, Lafd;->c()Lafb;

    move-result-object v0

    .line 70
    :cond_0
    :goto_0
    return-object v0

    .line 1111
    :cond_1
    invoke-static {}, Lafv;->c()Z

    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 1116
    invoke-virtual {p0}, Lafd;->b()Lagr;

    move-result-object v1

    invoke-virtual {v1}, Lagr;->a()Landroid/os/Bundle;

    move-result-object v1

    .line 1118
    if-eqz v1, :cond_2

    invoke-static {v1}, Lagr;->a(Landroid/os/Bundle;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1119
    invoke-static {v1}, Lafb;->a(Landroid/os/Bundle;)Lafb;

    move-result-object v0

    .line 64
    :cond_2
    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {p0, v0}, Lafd;->a(Lafb;)V

    .line 66
    invoke-virtual {p0}, Lafd;->b()Lagr;

    move-result-object v1

    invoke-virtual {v1}, Lagr;->b()V

    goto :goto_0
.end method

.method public final a(Lafb;)V
    .locals 4

    .prologue
    .line 74
    const-string v0, "accessToken"

    invoke-static {p1, v0}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1468
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1470
    const-string v1, "version"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1471
    const-string v1, "token"

    iget-object v2, p1, Lafb;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1472
    const-string v1, "expires_at"

    iget-object v2, p1, Lafb;->a:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1473
    new-instance v1, Lorg/json/JSONArray;

    iget-object v2, p1, Lafb;->b:Ljava/util/Set;

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 1474
    const-string v2, "permissions"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1475
    new-instance v1, Lorg/json/JSONArray;

    iget-object v2, p1, Lafb;->c:Ljava/util/Set;

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 1476
    const-string v2, "declined_permissions"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1477
    const-string v1, "last_refresh"

    iget-object v2, p1, Lafb;->f:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1478
    const-string v1, "source"

    iget-object v2, p1, Lafb;->e:Lafl;

    invoke-virtual {v2}, Lafl;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1479
    const-string v1, "application_id"

    iget-object v2, p1, Lafb;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1480
    const-string v1, "user_id"

    iget-object v2, p1, Lafb;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    iget-object v1, p0, Lafd;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "com.facebook.AccessTokenManager.CachedAccessToken"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 80
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method b()Lagr;
    .locals 2

    .prologue
    .line 125
    iget-object v0, p0, Lafd;->c:Lagr;

    if-nez v0, :cond_1

    .line 126
    monitor-enter p0

    .line 127
    :try_start_0
    iget-object v0, p0, Lafd;->c:Lagr;

    if-nez v0, :cond_0

    .line 2137
    new-instance v0, Lagr;

    invoke-static {}, Lafv;->f()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lagr;-><init>(Landroid/content/Context;)V

    .line 128
    iput-object v0, p0, Lafd;->c:Lagr;

    .line 130
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    :cond_1
    iget-object v0, p0, Lafd;->c:Lagr;

    return-object v0

    .line 130
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
