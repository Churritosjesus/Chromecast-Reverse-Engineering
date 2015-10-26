.class final Laff;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static volatile d:Laff;


# instance fields
.field final a:Lafd;

.field b:Lafb;

.field c:Ljava/util/Date;

.field private final e:Lbk;

.field private f:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method private constructor <init>(Lbk;Lafd;)V
    .locals 4

    .prologue
    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Laff;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 68
    new-instance v0, Ljava/util/Date;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Laff;->c:Ljava/util/Date;

    .line 73
    const-string v0, "localBroadcastManager"

    invoke-static {p1, v0}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    const-string v0, "accessTokenCache"

    invoke-static {p2, v0}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    iput-object p1, p0, Laff;->e:Lbk;

    .line 77
    iput-object p2, p0, Laff;->a:Lafd;

    .line 78
    return-void
.end method

.method static a()Laff;
    .locals 4

    .prologue
    .line 81
    sget-object v0, Laff;->d:Laff;

    if-nez v0, :cond_1

    .line 82
    const-class v1, Laff;

    monitor-enter v1

    .line 83
    :try_start_0
    sget-object v0, Laff;->d:Laff;

    if-nez v0, :cond_0

    .line 84
    invoke-static {}, Lafv;->f()Landroid/content/Context;

    move-result-object v0

    .line 85
    invoke-static {v0}, Lbk;->a(Landroid/content/Context;)Lbk;

    move-result-object v0

    .line 87
    new-instance v2, Lafd;

    invoke-direct {v2}, Lafd;-><init>()V

    .line 89
    new-instance v3, Laff;

    invoke-direct {v3, v0, v2}, Laff;-><init>(Lbk;Lafd;)V

    sput-object v3, Laff;->d:Laff;

    .line 91
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    :cond_1
    sget-object v0, Laff;->d:Laff;

    return-object v0

    .line 91
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Laff;)V
    .locals 0

    .prologue
    .line 43
    invoke-virtual {p0}, Laff;->b()V

    return-void
.end method

.method static synthetic b(Laff;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Laff;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method


# virtual methods
.method a(Lafb;Z)V
    .locals 4

    .prologue
    .line 117
    iget-object v0, p0, Laff;->b:Lafb;

    .line 118
    iput-object p1, p0, Laff;->b:Lafb;

    .line 119
    iget-object v1, p0, Laff;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 120
    new-instance v1, Ljava/util/Date;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    iput-object v1, p0, Laff;->c:Ljava/util/Date;

    .line 122
    if-eqz p2, :cond_0

    .line 123
    if-eqz p1, :cond_2

    .line 124
    iget-object v1, p0, Laff;->a:Lafd;

    invoke-virtual {v1, p1}, Lafd;->a(Lafb;)V

    .line 131
    :cond_0
    :goto_0
    invoke-static {v0, p1}, Laji;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1138
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1140
    const-string v2, "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1141
    const-string v0, "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1143
    iget-object v0, p0, Laff;->e:Lbk;

    invoke-virtual {v0, v1}, Lbk;->a(Landroid/content/Intent;)Z

    .line 134
    :cond_1
    return-void

    .line 126
    :cond_2
    iget-object v1, p0, Laff;->a:Lafd;

    .line 1087
    iget-object v2, v1, Lafd;->a:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "com.facebook.AccessTokenManager.CachedAccessToken"

    invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1111
    invoke-static {}, Lafv;->c()Z

    move-result v2

    .line 1088
    if-eqz v2, :cond_3

    .line 1089
    invoke-virtual {v1}, Lafd;->b()Lagr;

    move-result-object v1

    invoke-virtual {v1}, Lagr;->b()V

    .line 127
    :cond_3
    invoke-static {}, Lafv;->f()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Laji;->b(Landroid/content/Context;)V

    goto :goto_0
.end method

.method b()V
    .locals 14

    .prologue
    const/4 v13, 0x1

    const/4 v12, 0x0

    .line 212
    iget-object v1, p0, Laff;->b:Lafb;

    .line 213
    if-nez v1, :cond_1

    .line 312
    :cond_0
    :goto_0
    return-void

    .line 216
    :cond_1
    iget-object v0, p0, Laff;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v12, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    invoke-static {}, Lajp;->a()V

    .line 222
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Laff;->c:Ljava/util/Date;

    .line 224
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 225
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 226
    new-instance v9, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v9, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 227
    new-instance v6, Lafk;

    .line 1192
    invoke-direct {v6}, Lafk;-><init>()V

    .line 229
    new-instance v10, Lagm;

    const/4 v0, 0x2

    new-array v11, v0, [Laga;

    new-instance v5, Lafh;

    invoke-direct {v5, p0, v9, v7, v8}, Lafh;-><init>(Laff;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/Set;Ljava/util/Set;)V

    .line 2169
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 2170
    new-instance v0, Laga;

    const-string v2, "me/permissions"

    sget-object v4, Lagq;->a:Lagq;

    invoke-direct/range {v0 .. v5}, Laga;-><init>(Lafb;Ljava/lang/String;Landroid/os/Bundle;Lagq;Lagf;)V

    .line 230
    aput-object v0, v11, v12

    new-instance v5, Lafi;

    invoke-direct {v5, p0, v6}, Lafi;-><init>(Laff;Lafk;)V

    .line 2182
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 2183
    const-string v0, "grant_type"

    const-string v2, "fb_extend_sso_token"

    invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 2184
    new-instance v0, Laga;

    const-string v2, "oauth/access_token"

    sget-object v4, Lagq;->a:Lagq;

    invoke-direct/range {v0 .. v5}, Laga;-><init>(Lafb;Ljava/lang/String;Landroid/os/Bundle;Lagq;Lagf;)V

    .line 263
    aput-object v0, v11, v13

    invoke-direct {v10, v11}, Lagm;-><init>([Laga;)V

    .line 276
    new-instance v2, Lafj;

    move-object v3, p0

    move-object v4, v1

    move-object v5, v9

    invoke-direct/range {v2 .. v8}, Lafj;-><init>(Laff;Lafb;Ljava/util/concurrent/atomic/AtomicBoolean;Lafk;Ljava/util/Set;Ljava/util/Set;)V

    .line 3102
    iget-object v0, v10, Lagm;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3103
    iget-object v0, v10, Lagm;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3256
    :cond_2
    invoke-static {v10}, Laga;->b(Lagm;)Lagl;

    goto :goto_0
.end method
