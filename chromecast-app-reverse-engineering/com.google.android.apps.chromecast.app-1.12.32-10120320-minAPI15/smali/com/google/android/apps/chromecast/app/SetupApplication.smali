.class public Lcom/google/android/apps/chromecast/app/SetupApplication;
.super Landroid/app/Application;
.source "PG"


# static fields
.field private static m:Lcom/google/android/apps/chromecast/app/SetupApplication;

.field private static n:I


# instance fields
.field public a:Landroid/content/SharedPreferences;

.field public b:Z

.field public c:Ljava/lang/String;

.field public d:Z

.field public e:Ljava/lang/String;

.field final f:Ljava/util/List;

.field public g:Lazg;

.field public h:Z

.field public i:Landroid/net/http/AndroidHttpClient;

.field public final j:Lass;

.field public k:J

.field public l:Ljava/lang/String;

.field private final o:Lblp;

.field private p:Lbkg;

.field private q:Z

.field private r:Lalm;

.field private s:Lbli;

.field private t:Ljava/lang/String;

.field private u:Lazv;

.field private v:Laor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 62
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 73
    const/4 v0, 0x0

    sput v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->n:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    .line 122
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->f:Ljava/util/List;

    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->h:Z

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->t:Ljava/lang/String;

    .line 111
    new-instance v0, Lass;

    invoke-direct {v0}, Lass;-><init>()V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->j:Lass;

    .line 123
    new-instance v0, Lblp;

    const-string v1, "SetupApplication"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->o:Lblp;

    .line 124
    return-void
.end method

.method public static a(Landroid/content/Context;Lana;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 255
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 256
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 257
    const-string v1, "tabIndex"

    invoke-virtual {p1}, Lana;->ordinal()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 258
    return-object v0
.end method

.method public static a()Lcom/google/android/apps/chromecast/app/SetupApplication;
    .locals 1

    .prologue
    .line 119
    sget-object v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->m:Lcom/google/android/apps/chromecast/app/SetupApplication;

    return-object v0
.end method

.method public static a(I)Z
    .locals 1

    .prologue
    .line 242
    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 v0, -0x2

    if-eq p0, v0, :cond_0

    const/4 v0, -0x6

    if-eq p0, v0, :cond_0

    const/4 v0, -0x8

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 3119
    sget-object v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->m:Lcom/google/android/apps/chromecast/app/SetupApplication;

    .line 435
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lblf;->A(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static b(I)V
    .locals 1

    .prologue
    .line 325
    const/4 v0, 0x1

    sput v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->n:I

    .line 326
    return-void
.end method

.method public static f()Z
    .locals 1

    .prologue
    .line 311
    sget v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->n:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static g()Z
    .locals 1

    .prologue
    .line 1119
    sget-object v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->m:Lcom/google/android/apps/chromecast/app/SetupApplication;

    .line 1335
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->c:Ljava/lang/String;

    .line 349
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static h()Lana;
    .locals 3

    .prologue
    .line 2119
    sget-object v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->m:Lcom/google/android/apps/chromecast/app/SetupApplication;

    .line 426
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "content_default_getapps"

    const/4 v2, 0x0

    .line 427
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    sget-object v0, Lana;->c:Lana;

    .line 430
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lana;->a:Lana;

    goto :goto_0
.end method

.method public static i()Latf;
    .locals 1

    .prologue
    .line 4119
    sget-object v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->m:Lcom/google/android/apps/chromecast/app/SetupApplication;

    .line 4451
    invoke-static {v0}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v0

    .line 443
    return-object v0
.end method

.method private m()Ljava/lang/String;
    .locals 5

    .prologue
    .line 153
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 156
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 157
    if-nez v1, :cond_0

    .line 158
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid application context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 162
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    if-nez v0, :cond_1

    .line 167
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid application context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 164
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid application context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 170
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 173
    const-string v1, "http.agent"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 174
    if-nez v1, :cond_3

    .line 181
    :cond_2
    :goto_0
    return-object v0

    .line 177
    :cond_3
    const/16 v2, 0x28

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 178
    if-lez v2, :cond_2

    .line 179
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 405
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 406
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 407
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 408
    const/4 p1, 0x0

    .line 409
    const-string v1, "current_account_name"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 413
    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 415
    iput-object p1, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->e:Ljava/lang/String;

    .line 416
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laoq;

    .line 417
    invoke-interface {v0}, Laoq;->m()V

    goto :goto_1

    .line 411
    :cond_1
    const-string v1, "current_account_name"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 420
    :cond_2
    return-void
.end method

.method public final b()Lalm;
    .locals 3

    .prologue
    .line 208
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->r:Lalm;

    if-nez v0, :cond_0

    .line 209
    new-instance v0, Lalm;

    invoke-static {}, Lbkl;->a()Lbkl;

    move-result-object v1

    .line 210
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lalm;-><init>(Lbkl;Landroid/content/SharedPreferences;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->r:Lalm;

    .line 212
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->r:Lalm;

    return-object v0
.end method

.method public final c()Lbli;
    .locals 2

    .prologue
    .line 216
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->s:Lbli;

    if-nez v0, :cond_0

    .line 217
    new-instance v0, Lbli;

    .line 218
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lbli;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->s:Lbli;

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->s:Lbli;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 493
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->k:J

    .line 494
    iput-object p1, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->l:Ljava/lang/String;

    .line 495
    return-void
.end method

.method public final d()Lbkg;
    .locals 4

    .prologue
    .line 267
    monitor-enter p0

    .line 268
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 270
    :try_start_1
    new-instance v0, Lbkg;

    invoke-direct {v0, p0}, Lbkg;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->p:Lbkg;
    :try_end_1
    .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 276
    :goto_0
    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->q:Z

    .line 278
    :cond_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 279
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->p:Lbkg;

    return-object v0

    .line 271
    :catch_0
    move-exception v0

    .line 272
    :try_start_3
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->o:Lblp;

    const-string v2, "Failed to create certificate validator"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lblp;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 278
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 273
    :catch_1
    move-exception v0

    .line 274
    :try_start_4
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->o:Lblp;

    const-string v2, "Failed to create certificate validator"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lblp;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    .prologue
    .line 286
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->t:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 288
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 289
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->t:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 294
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->t:Ljava/lang/String;

    return-object v0

    .line 291
    :catch_0
    move-exception v0

    const-string v0, "??"

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->t:Ljava/lang/String;

    goto :goto_0
.end method

.method public final j()V
    .locals 3

    .prologue
    .line 455
    invoke-static {p0}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v0

    .line 5156
    iget-object v1, v0, Latf;->k:Ljava/util/ArrayList;

    monitor-enter v1

    .line 5157
    :try_start_0
    iget-object v2, v0, Latf;->k:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 5158
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5159
    iget-object v1, v0, Latf;->l:Ladv;

    new-instance v2, Latg;

    invoke-direct {v2, v0}, Latg;-><init>(Latf;)V

    invoke-virtual {v1, v2}, Ladv;->a(Ladx;)V

    .line 5166
    iget-object v1, v0, Latf;->d:Lblq;

    invoke-virtual {v1}, Lblq;->a()V

    .line 5167
    const/4 v1, 0x0

    iput-object v1, v0, Latf;->f:Ldax;

    .line 456
    return-void

    .line 5158
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final k()Z
    .locals 6

    .prologue
    .line 501
    iget-wide v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->k:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 502
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->k:J

    sub-long/2addr v0, v2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1e

    .line 503
    invoke-virtual {v2, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final l()Lazv;
    .locals 2

    .prologue
    .line 523
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->u:Lazv;

    if-nez v0, :cond_0

    .line 524
    new-instance v0, Lazv;

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lazv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->u:Lazv;

    .line 526
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->u:Lazv;

    return-object v0
.end method

.method public final onCreate()V
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    .line 128
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 129
    sput-object p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->m:Lcom/google/android/apps/chromecast/app/SetupApplication;

    .line 131
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lblf;->a(Landroid/content/Context;)I

    move-result v2

    sput v2, Lcom/google/android/apps/chromecast/app/SetupApplication;->n:I

    .line 132
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->m()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->i:Landroid/net/http/AndroidHttpClient;

    .line 134
    invoke-static {}, Lape;->a()Lape;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    .line 1047
    iput-object v3, v2, Lape;->b:Landroid/content/Context;

    .line 1048
    invoke-static {v3}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    iput-object v4, v2, Lape;->c:Landroid/content/SharedPreferences;

    .line 1049
    iget-object v4, v2, Lape;->c:Landroid/content/SharedPreferences;

    const-string v5, "ANALYTICS_ENABLED"

    invoke-interface {v4, v5, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1050
    invoke-static {v3}, Lblf;->L(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_1

    :goto_0
    iput-boolean v0, v2, Lape;->f:Z

    .line 1051
    new-instance v0, Lbwf;

    invoke-direct {v0, v3}, Lbwf;-><init>(Landroid/content/Context;)V

    sget-object v3, Lbvh;->b:Lbvz;

    invoke-virtual {v0, v3}, Lbwf;->a(Lbvz;)Lbwf;

    move-result-object v0

    .line 1052
    invoke-virtual {v0, v2}, Lbwf;->a(Lbwg;)Lbwf;

    move-result-object v0

    .line 1053
    invoke-virtual {v0}, Lbwf;->b()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, v2, Lape;->d:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 1054
    new-instance v0, Lbvh;

    iget-object v3, v2, Lape;->b:Landroid/content/Context;

    const-string v4, "CHROMECAST_APP_LOG"

    invoke-direct {v0, v3, v4, v6, v6}, Lbvh;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v2, Lape;->e:Lbvh;

    .line 1055
    iget-object v0, v2, Lape;->a:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    iput v0, v2, Lape;->g:I

    .line 136
    new-instance v0, Laor;

    invoke-direct {v0}, Laor;-><init>()V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->v:Laor;

    .line 137
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->v:Laor;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 139
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->a:Landroid/content/SharedPreferences;

    .line 140
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->a:Landroid/content/SharedPreferences;

    const-string v2, "CAST_SCREEN_LAUNCHED"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->d:Z

    .line 141
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->a:Landroid/content/SharedPreferences;

    const-string v2, "current_account_name"

    invoke-interface {v0, v2, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->e:Ljava/lang/String;

    .line 142
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 143
    invoke-static {p0}, Lbls;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a(Ljava/lang/String;)V

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->a:Landroid/content/SharedPreferences;

    const-string v2, "TERMS_ACCEPTED"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/SetupApplication;->b:Z

    .line 146
    return-void

    :cond_1
    move v0, v1

    .line 1050
    goto :goto_0
.end method

.method public onTrimMemory(I)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 532
    invoke-super {p0, p1}, Landroid/app/Application;->onTrimMemory(I)V

    .line 536
    return-void
.end method
