.class public final Lalh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lall;


# instance fields
.field private a:Lbli;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/DebugActivity;)V
    .locals 1

    .prologue
    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->c()Lbli;

    move-result-object v0

    iput-object v0, p0, Lalh;->a:Lbli;

    .line 116
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x0

    invoke-static {v0}, Lbli;->a(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 131
    iget-object v0, p0, Lalh;->a:Lbli;

    .line 1145
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    .line 1146
    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 1147
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1149
    invoke-static {}, Lbli;->a()I

    move-result v2

    invoke-static {p1, v2}, Lbli;->a(Ljava/lang/String;I)I

    move-result v2

    .line 1150
    sget-object v3, Lbli;->d:[Ljava/lang/String;

    aget-object v3, v3, v4

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1151
    const-string v3, "ACM_LEVEL"

    invoke-interface {v1, v3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1156
    :goto_0
    :try_start_0
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lbli;->a(Landroid/content/Context;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1159
    :goto_1
    return-void

    .line 1153
    :cond_0
    const-string v3, "ACM_LEVEL"

    invoke-interface {v1, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 1158
    :catch_0
    move-exception v1

    iget-object v0, v0, Lbli;->c:Lblp;

    const-string v1, "Failed to switch container maps"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 126
    const/4 v0, 0x1

    invoke-static {v0}, Lbli;->a(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 136
    invoke-static {}, Lbli;->c()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 141
    invoke-static {}, Lbli;->d()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
