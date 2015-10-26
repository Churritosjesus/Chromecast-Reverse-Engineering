.class public Lcom/google/android/apps/chromecast/app/DiscoveryActivity;
.super Lmm;
.source "PG"

# interfaces
.implements Lbkk;
.implements Lboo;


# instance fields
.field private final e:Lblp;

.field private f:I

.field private g:I

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 59
    invoke-direct {p0}, Lmm;-><init>()V

    .line 60
    new-instance v0, Lblp;

    const-string v1, "DiscoveryActivity"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->e:Lblp;

    .line 61
    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/DiscoveryActivity;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->g()V

    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/DiscoveryActivity;Z)Z
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->i:Z

    return v0
.end method

.method private g()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 170
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->k:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->i:Z

    if-nez v0, :cond_1

    .line 196
    :cond_0
    :goto_0
    return-void

    .line 175
    :cond_1
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v0

    .line 5071
    iget-object v0, v0, Lbkh;->h:Lblv;

    .line 176
    iget v1, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 6050
    invoke-virtual {v0, v1, v2, v2}, Lblv;->a(Ljava/lang/Integer;ZI)Ldan;

    move-result-object v0

    .line 177
    if-nez v0, :cond_2

    .line 179
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->h()V

    goto :goto_0

    .line 181
    :cond_2
    iget-object v1, v0, Ldan;->b:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    iput v1, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->g:I

    .line 182
    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->h:Z

    if-eqz v1, :cond_3

    .line 187
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 188
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "warmWelcomeVersion"

    iget v2, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->g:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 189
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->h()V

    goto :goto_0

    .line 192
    :cond_3
    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->a(Landroid/content/Context;Ldan;)Landroid/content/Intent;

    move-result-object v0

    .line 193
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method private h()V
    .locals 4

    .prologue
    .line 200
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    .line 201
    if-eqz v0, :cond_0

    const-string v1, "apps"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 202
    sget-object v0, Lana;->c:Lana;

    .line 211
    :goto_0
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v1

    .line 6207
    iget-object v1, v1, Lbkh;->i:Lctw;

    const-string v2, "appLaunch"

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lctw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 212
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 213
    const v2, 0x8000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 214
    const-string v2, "tabIndex"

    invoke-virtual {v0}, Lana;->ordinal()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 215
    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->startActivity(Landroid/content/Intent;)V

    .line 216
    sget v0, La;->de:I

    sget v1, La;->df:I

    invoke-virtual {p0, v0, v1}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->overridePendingTransition(II)V

    .line 217
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->finish()V

    .line 218
    return-void

    .line 203
    :cond_0
    if-eqz v0, :cond_1

    const-string v1, "backdrop"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->j:Z

    if-nez v0, :cond_2

    const-string v0, "android.intent.action.VIEW"

    .line 205
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 206
    :cond_2
    sget-object v0, Lana;->b:Lana;

    goto :goto_0

    .line 208
    :cond_3
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->h()Lana;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final e()V
    .locals 3

    .prologue
    .line 121
    .line 122
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "appVersion"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 2134
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "appVersion"

    iget v2, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->f:I

    .line 2135
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 2136
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2139
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v0

    .line 3079
    iput-object p0, v0, Lbkh;->e:Lbkk;

    .line 2140
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v0

    invoke-virtual {v0}, Lbkh;->b()V

    .line 2143
    invoke-static {p0}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v0

    new-instance v1, Lamj;

    invoke-direct {v1, p0}, Lamj;-><init>(Lcom/google/android/apps/chromecast/app/DiscoveryActivity;)V

    new-instance v2, Lamk;

    invoke-direct {v2, p0}, Lamk;-><init>(Lcom/google/android/apps/chromecast/app/DiscoveryActivity;)V

    invoke-virtual {v0, v1, v2}, Latf;->a(Latr;Ladz;)V

    .line 130
    return-void
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 164
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->k:Z

    .line 165
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v0

    const/4 v1, 0x0

    .line 4079
    iput-object v1, v0, Lbkh;->e:Lbkk;

    .line 166
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->g()V

    .line 167
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 222
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 224
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 227
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "warmWelcomeVersion"

    iget v2, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->g:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 228
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->h()V

    .line 232
    :goto_0
    return-void

    .line 230
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lmm;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 65
    invoke-super {p0, p1}, Lmm;->onCreate(Landroid/os/Bundle;)V

    .line 66
    sget v0, La;->fr:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->setContentView(I)V

    .line 68
    if-eqz p1, :cond_0

    .line 69
    const-string v0, "environmentLoaded"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->i:Z

    .line 70
    const-string v0, "containerLoaded"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->k:Z

    .line 71
    const-string v0, "lastTutorialVersion"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->g:I

    .line 72
    const-string v0, "skipTutorial"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->h:Z

    .line 73
    const-string v0, "openDevicesTab"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->j:Z

    .line 81
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 82
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->f:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    :goto_1
    return-void

    .line 76
    :cond_0
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 77
    const-string v1, "warmWelcomeVersion"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->g:I

    goto :goto_0

    .line 86
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 115
    invoke-super {p0}, Lmm;->onDestroy()V

    .line 116
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v0

    const/4 v1, 0x0

    .line 2079
    iput-object v1, v0, Lbkh;->e:Lbkk;

    .line 117
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 90
    invoke-super {p0}, Lmm;->onResume()V

    .line 91
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 1462
    iget-boolean v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->b:Z

    .line 91
    if-nez v0, :cond_0

    .line 92
    invoke-static {p0}, Lbol;->a(Lmm;)V

    .line 94
    iput-boolean v1, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->h:Z

    .line 97
    iput-boolean v1, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->j:Z

    .line 101
    :goto_0
    return-void

    .line 99
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->e()V

    goto :goto_0
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 105
    invoke-super {p0, p1}, Lmm;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 106
    const-string v0, "environmentLoaded"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->i:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 107
    const-string v0, "containerLoaded"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->k:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 108
    const-string v0, "lastTutorialVersion"

    iget v1, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->g:I

    int-to-long v2, v1

    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 109
    const-string v0, "skipTutorial"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->h:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 110
    const-string v0, "openDevicesTab"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/DiscoveryActivity;->j:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 111
    return-void
.end method
