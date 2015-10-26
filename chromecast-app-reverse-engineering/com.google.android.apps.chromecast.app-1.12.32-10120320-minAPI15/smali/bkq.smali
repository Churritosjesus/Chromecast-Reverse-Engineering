.class public final Lbkq;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final a:Lblp;

.field private static b:Lcom/google/android/gms/common/api/GoogleApiClient;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 37
    new-instance v0, Lblp;

    const-string v1, "FeedbackHelper"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lbkq;->a:Lblp;

    return-void
.end method

.method private static a(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 196
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 197
    if-eqz v1, :cond_0

    iget-object v0, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Landroid/app/Activity;Lbaq;)V
    .locals 3

    .prologue
    .line 279
    invoke-interface {p1}, Lbaq;->e()Landroid/content/Intent;

    move-result-object v0

    .line 280
    if-nez v0, :cond_0

    .line 281
    sget v0, Lb;->dG:I

    .line 282
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 281
    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 285
    :cond_0
    invoke-static {p0}, Lbkq;->a(Landroid/app/Activity;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 286
    invoke-static {p0}, Lbkq;->b(Landroid/app/Activity;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 287
    const-string v2, "screenShot"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 289
    :cond_1
    const-string v1, "feedbackSupported"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 290
    const-string v1, "feedbackDevices"

    .line 291
    invoke-interface {p1}, Lbaq;->b_()Ljava/util/ArrayList;

    move-result-object v2

    .line 290
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 292
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 293
    return-void
.end method

.method public static a(Landroid/app/Activity;Ljava/util/List;)V
    .locals 12

    .prologue
    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 72
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 78
    invoke-static {v1, p0}, Lblf;->a(Landroid/os/Bundle;Landroid/content/Context;)V

    .line 81
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->k()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 83
    const-string v2, "last-setup-failure"

    const-string v3, "%d seconds ago: %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 85
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    .line 1519
    iget-wide v8, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->k:J

    .line 85
    sub-long/2addr v6, v8

    .line 84
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v10

    .line 2510
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->l:Ljava/lang/String;

    .line 86
    aput-object v0, v4, v11

    .line 83
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 3177
    :cond_0
    const-string v0, "gms-core-version"

    const-string v2, "com.google.android.gms"

    .line 3178
    invoke-static {p0, v2}, Lbkq;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3177
    invoke-static {v1, v0, v2}, Lbkq;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 3180
    const-string v0, "app-version-youtube"

    const-string v2, "com.google.android.youtube"

    .line 3181
    invoke-static {p0, v2}, Lbkq;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3180
    invoke-static {v1, v0, v2}, Lbkq;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 3182
    const-string v0, "app-version-play-movies"

    const-string v2, "com.google.android.videos"

    .line 3183
    invoke-static {p0, v2}, Lbkq;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3182
    invoke-static {v1, v0, v2}, Lbkq;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 3184
    const-string v0, "app-version-play-music"

    const-string v2, "com.google.android.music"

    .line 3185
    invoke-static {p0, v2}, Lbkq;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3184
    invoke-static {v1, v0, v2}, Lbkq;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 3186
    const-string v0, "app-version-netflix"

    const-string v2, "com.netflix.mediaclient"

    .line 3187
    invoke-static {p0, v2}, Lbkq;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3186
    invoke-static {v1, v0, v2}, Lbkq;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 92
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    .line 94
    new-array v0, v11, [Ljava/lang/Object;

    aput-object v2, v0, v10

    .line 95
    const-string v0, "feedback-id"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 96
    invoke-static {p0}, Lblf;->J(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v11, [Ljava/lang/Object;

    aput-object v2, v5, v10

    .line 95
    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 99
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 100
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 101
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbko;

    .line 4045
    iget-object v8, v0, Lbko;->a:Ljava/lang/String;

    .line 102
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 5045
    iget-object v8, v0, Lbko;->a:Ljava/lang/String;

    .line 103
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    new-array v8, v11, [Ljava/lang/Object;

    .line 6045
    iget-object v9, v0, Lbko;->a:Ljava/lang/String;

    .line 104
    aput-object v9, v8, v10

    .line 6053
    :goto_1
    iget-object v8, v0, Lbko;->c:Ljava/lang/String;

    .line 108
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_3

    .line 7053
    iget-object v8, v0, Lbko;->c:Ljava/lang/String;

    .line 109
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8049
    :goto_2
    iget-object v8, v0, Lbko;->b:Ljava/lang/String;

    .line 114
    if-eqz v8, :cond_1

    .line 117
    new-instance v8, Lbfn;

    .line 9049
    iget-object v0, v0, Lbko;->b:Ljava/lang/String;

    .line 118
    invoke-direct {v8, v0, v2}, Lbfn;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    new-instance v0, Lbfe;

    new-array v9, v11, [Lbfd;

    aput-object v8, v9, v10

    invoke-direct {v0, v9}, Lbfe;-><init>([Lbfd;)V

    .line 120
    new-instance v9, Lbkr;

    invoke-direct {v9, v8, v4, v5}, Lbkr;-><init>(Lbfn;J)V

    .line 9064
    iput-object v9, v0, Lbfe;->a:Lbff;

    .line 139
    invoke-virtual {v0}, Lbfe;->a()V

    goto :goto_0

    .line 106
    :cond_2
    const-string v8, "???"

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 111
    :cond_3
    const-string v8, "?"

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 141
    :cond_4
    const-string v0, "build-Chromecast"

    const-string v2, ","

    invoke-static {v2, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-string v0, "type-Chromecast"

    const-string v2, ","

    invoke-static {v2, v6}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9152
    :cond_5
    sget-object v0, Lbkq;->b:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-nez v0, :cond_6

    .line 9153
    new-instance v0, Lbwf;

    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v2

    invoke-direct {v0, v2}, Lbwf;-><init>(Landroid/content/Context;)V

    sget-object v2, Lcib;->a:Lbvz;

    .line 9154
    invoke-virtual {v0, v2}, Lbwf;->a(Lbvz;)Lbwf;

    move-result-object v0

    invoke-virtual {v0}, Lbwf;->b()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    sput-object v0, Lbkq;->b:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 9156
    :cond_6
    sget-object v0, Lbkq;->b:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lbkq;->b:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->e()Z

    move-result v0

    if-nez v0, :cond_7

    .line 9157
    sget-object v0, Lbkq;->b:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b()V

    .line 9160
    :cond_7
    const/4 v0, 0x0

    .line 9161
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 9162
    if-eqz v2, :cond_8

    .line 9163
    const-string v0, "screenShot"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 9165
    :cond_8
    if-nez v0, :cond_9

    .line 9166
    invoke-static {p0}, Lbkq;->a(Landroid/app/Activity;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 9167
    invoke-static {p0}, Lbkq;->b(Landroid/app/Activity;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 9170
    :cond_9
    sget-object v2, Lbkq;->b:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-static {v2, v0, v1}, Lcib;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/graphics/Bitmap;Landroid/os/Bundle;)Lbwj;

    .line 146
    return-void
.end method

.method private static a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 207
    if-eqz p2, :cond_0

    .line 208
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    :cond_0
    return-void
.end method

.method public static a()Z
    .locals 1

    .prologue
    .line 53
    const/4 v0, 0x1

    return v0
.end method

.method private static a(Landroid/app/Activity;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 218
    instance-of v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    if-eqz v0, :cond_3

    .line 219
    check-cast p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    .line 10808
    iget-object v0, p0, Lm;->b:Lt;

    .line 9881
    sget v3, Lf;->ai:I

    invoke-virtual {v0, v3}, Lr;->a(I)Lj;

    move-result-object v0

    .line 9882
    instance-of v3, v0, Lbgr;

    if-eqz v3, :cond_0

    check-cast v0, Lbgr;

    .line 11152
    iget-object v0, v0, Lbgr;->a:Lbos;

    .line 11408
    iget-object v0, v0, Lbos;->c:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v2

    .line 9883
    :goto_0
    if-eqz v0, :cond_2

    :cond_0
    move v0, v2

    :goto_1
    return v0

    :cond_1
    move v0, v1

    .line 11408
    goto :goto_0

    :cond_2
    move v0, v1

    .line 219
    goto :goto_1

    :cond_3
    move v0, v2

    .line 221
    goto :goto_1
.end method

.method private static b(Landroid/app/Activity;)Landroid/graphics/Bitmap;
    .locals 10

    .prologue
    const/4 v1, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 231
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v4

    .line 232
    invoke-virtual {v4}, Landroid/view/View;->isDrawingCacheEnabled()Z

    move-result v5

    .line 233
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 234
    invoke-virtual {v4}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 235
    if-eqz v0, :cond_3

    .line 12257
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 12258
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 12259
    :goto_0
    mul-int v6, v3, v2

    const v7, 0x57e40

    if-le v6, v7, :cond_0

    .line 12260
    div-int/lit8 v3, v3, 0x2

    .line 12261
    div-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 12263
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    if-eq v3, v6, :cond_1

    .line 12264
    const/4 v6, 0x1

    invoke-static {v0, v3, v2, v6}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 237
    :cond_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 238
    if-nez v5, :cond_2

    .line 239
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 240
    invoke-virtual {v4}, Landroid/view/View;->destroyDrawingCache()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 249
    :cond_2
    :goto_1
    return-object v0

    :cond_3
    move-object v0, v1

    .line 245
    goto :goto_1

    .line 247
    :catch_0
    move-exception v0

    .line 248
    new-array v2, v9, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v8

    move-object v0, v1

    .line 249
    goto :goto_1
.end method

.method static synthetic b()Lblp;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lbkq;->a:Lblp;

    return-object v0
.end method
