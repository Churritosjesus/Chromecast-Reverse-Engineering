.class final Lagx;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static volatile c:Lagx;


# instance fields
.field final a:Lagw;

.field b:Lagt;

.field private final d:Lbk;


# direct methods
.method private constructor <init>(Lbk;Lagw;)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const-string v0, "localBroadcastManager"

    invoke-static {p1, v0}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    const-string v0, "profileCache"

    invoke-static {p2, v0}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iput-object p1, p0, Lagx;->d:Lbk;

    .line 51
    iput-object p2, p0, Lagx;->a:Lagw;

    .line 52
    return-void
.end method

.method static a()Lagx;
    .locals 4

    .prologue
    .line 55
    sget-object v0, Lagx;->c:Lagx;

    if-nez v0, :cond_1

    .line 56
    const-class v1, Lagx;

    monitor-enter v1

    .line 57
    :try_start_0
    sget-object v0, Lagx;->c:Lagx;

    if-nez v0, :cond_0

    .line 58
    invoke-static {}, Lafv;->f()Landroid/content/Context;

    move-result-object v0

    .line 59
    invoke-static {v0}, Lbk;->a(Landroid/content/Context;)Lbk;

    move-result-object v0

    .line 62
    new-instance v2, Lagx;

    new-instance v3, Lagw;

    invoke-direct {v3}, Lagw;-><init>()V

    invoke-direct {v2, v0, v3}, Lagx;-><init>(Lbk;Lagw;)V

    sput-object v2, Lagx;->c:Lagx;

    .line 64
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    :cond_1
    sget-object v0, Lagx;->c:Lagx;

    return-object v0

    .line 64
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method a(Lagt;Z)V
    .locals 4

    .prologue
    .line 89
    iget-object v0, p0, Lagx;->b:Lagt;

    .line 90
    iput-object p1, p0, Lagx;->b:Lagt;

    .line 92
    if-eqz p2, :cond_0

    .line 93
    if-eqz p1, :cond_2

    .line 94
    iget-object v1, p0, Lagx;->a:Lagw;

    .line 1058
    const-string v2, "profile"

    invoke-static {p1, v2}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1059
    invoke-virtual {p1}, Lagt;->c()Lorg/json/JSONObject;

    move-result-object v2

    .line 1060
    if-eqz v2, :cond_0

    .line 1061
    iget-object v1, v1, Lagw;->a:Landroid/content/SharedPreferences;

    .line 1062
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "com.facebook.ProfileManager.CachedProfile"

    .line 1063
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1064
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 100
    :cond_0
    :goto_0
    invoke-static {v0, p1}, Laji;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1108
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1110
    const-string v2, "com.facebook.sdk.EXTRA_OLD_PROFILE"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1111
    const-string v0, "com.facebook.sdk.EXTRA_NEW_PROFILE"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1113
    iget-object v0, p0, Lagx;->d:Lbk;

    invoke-virtual {v0, v1}, Lbk;->a(Landroid/content/Intent;)Z

    .line 103
    :cond_1
    return-void

    .line 96
    :cond_2
    iget-object v1, p0, Lagx;->a:Lagw;

    .line 1069
    iget-object v1, v1, Lagw;->a:Landroid/content/SharedPreferences;

    .line 1070
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "com.facebook.ProfileManager.CachedProfile"

    .line 1071
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1072
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0
.end method
